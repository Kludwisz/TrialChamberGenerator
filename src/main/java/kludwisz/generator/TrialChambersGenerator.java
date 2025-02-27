package kludwisz.generator;

import java.util.*;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;

import kludwisz.structure.jigsaws.TrialChambersJigsawBlocks;
import kludwisz.structure.pieces.TrialChambersPieceSize;
import kludwisz.generator.util.BlockBoxUtil;
import kludwisz.generator.util.MutableBlockPos;
import kludwisz.generator.util.ShuffleUtils;
import kludwisz.util.SequencedPriorityIterator;
import kludwisz.util.VoxelShape;


public class TrialChambersGenerator {
    private static final int MAX_DIST = 116; // max distance from start piece
    private static final int MAX_DEPTH = 20; // defined as "size" in the client jar
    public static final BlockRotation[] BLOCK_ROTATIONS = BlockRotation.values();

    public final TrialChambersPieces.Piece[] pieces = new TrialChambersPieces.Piece[512];
    public final VoxelShape[] voxelShapes = new VoxelShape[512];
    public int piecesLen;
    public final SequencedPriorityIterator<TrialChambersPieces.Piece> placing = new SequencedPriorityIterator<>();

    private final BlockBox rootBox = BlockBox.empty();
    private final TrialChambersPieces.BlockJigsawInfo[] parentJigsawsArr = new TrialChambersPieces.BlockJigsawInfo[50];
    private final TrialChambersPieces.BlockJigsawInfo[] childPieceJigsawBlocksArr = new TrialChambersPieces.BlockJigsawInfo[50];
    private final int[] childTemplatesArr = new int[1235]; // don't even ask...
    private final BlockRotation[] childRotationsArr = new BlockRotation[4];
    private final MutableBlockPos childJigsawPos = new MutableBlockPos();
    private final BlockBox childPieceMinBox = BlockBox.empty();

    public TrialChambersGenerator() {
        for (int i = 0; i < this.pieces.length; i++) {
            this.pieces[i] = new TrialChambersPieces.Piece(i);
        }
        for (int i = 0; i < this.voxelShapes.length; i++) {
            this.voxelShapes[i] = new VoxelShape();
        }
        for (int i = 0; i < this.parentJigsawsArr.length; i++) {
            this.parentJigsawsArr[i] = new TrialChambersPieces.BlockJigsawInfo();
        }
        for (int i = 0; i < this.childPieceJigsawBlocksArr.length; i++) {
            this.childPieceJigsawBlocksArr[i] = new TrialChambersPieces.BlockJigsawInfo();
        }
    }

    public void generate(long worldseed, int chunkX, int chunkZ, ChunkRand rand) {
        this.piecesLen = 0;

        // choose random y position and rotation
        rand.setCarverSeed(worldseed, chunkX, chunkZ, MCVersion.v1_20);
        int pickedY = rand.nextInt(21) - 41;
        BlockRotation startPieceRotation = rand.getRandom(BLOCK_ROTATIONS);

        // choose random starting template
        int startPieceId = TrialChambersPieces.START_TEMPLATES[rand.nextInt(TrialChambersPieces.START_TEMPLATES.length)];
        BPos startPieceSize = TrialChambersPieceSize.get(startPieceId);

        // set starting position
        TrialChambersPieces.Piece startPiece = this.pieces[this.piecesLen];
        MutableBlockPos startPiecePos = startPiece.pos;
        startPiecePos.set(chunkX << 4, pickedY, chunkZ << 4);

        BlockBox startPieceBox = startPiece.box;
        BlockBoxUtil.setSizeRotatePos(startPieceBox, startPieceSize, startPieceRotation, startPiecePos);
        int centerX = (startPieceBox.minX + startPieceBox.maxX) / 2;
        int centerZ = (startPieceBox.minZ + startPieceBox.maxZ) / 2;
        int centerY = startPieceBox.minY + 1;
        int y = startPiecePos.y + 1;

        // create the first piece
        startPiece.id = startPieceId;
        BlockBoxUtil.set(startPiece.box, startPieceBox);
        startPiece.rotation = startPieceRotation;
        startPiece.depth = 0;

        // create structure max bounding box
        this.piecesLen++;
        VoxelShape rootFreeSpace = this.voxelShapes[255].init(BlockBoxUtil.set(this.rootBox, centerX - MAX_DIST, y - MAX_DIST, centerZ - MAX_DIST, centerX + MAX_DIST, y + MAX_DIST, centerZ + MAX_DIST));
        rootFreeSpace.cutout.add(startPieceBox);
        startPiece.freeSpace = rootFreeSpace;

        // place pieces
        this.tryPlacing(startPiece, rand);
        while (this.placing.hasNext()) {
            TrialChambersPieces.Piece nextPiece = this.placing.next();
            if (nextPiece == null)
                break; // end of input
            this.tryPlacing(nextPiece, rand);
        }
    }

    public void tryPlacing(TrialChambersPieces.Piece parentPiece, ChunkRand rand) {
        //System.out.println("Parent piece: " + parentPiece.getName() + " rotation " + parentPiece.rotation.name() + "  RAND: " + rand.getSeed());
        int parentPieceId = parentPiece.id;
        int parentPieceDepth = parentPiece.depth;
        MutableBlockPos parentPiecePos = parentPiece.pos;
        VoxelShape parentPieceInnerFreeSpace = null;
        BlockBox parentPieceBox = parentPiece.box;

        if (parentPieceDepth == MAX_DEPTH) {
            ShuffleUtils.skipShuffle(rand, TrialChambersJigsawBlocks.get(parentPieceId).size());
            return;
        }

        TrialChambersPieces.BlockJigsawInfo[] parentJigsaws = this.parentJigsawsArr;
        int parentJigsawsLen = TrialChambersPieces.getShuffledJigsawBlocks(rand, parentJigsaws, parentPieceId, parentPiece.rotation, parentPiecePos);

        nextParentJigsaw:
        for (int parentJigsawIndex = 0; parentJigsawIndex < parentJigsawsLen; parentJigsawIndex++) {
            //System.out.println("RAND: inside shuffled jigsaws: " + rand.getSeed());
            TrialChambersPieces.BlockJigsawInfo parentJigsaw = parentJigsaws[parentJigsawIndex];

            TrialChambersPieces.Piece childPiece = this.pieces[this.piecesLen];
            MutableBlockPos childPiecePos = childPiece.pos;
            BlockBox childPieceBox = childPiece.box;

            BlockDirection parentJigsawFront = parentJigsaw.front;
            MutableBlockPos parentJigsawPos = parentJigsaw.pos;
            this.childJigsawPos.set(
                    parentJigsawPos.x + parentJigsawFront.getVector().getX(),
                    parentJigsawPos.y + parentJigsawFront.getVector().getY(),
                    parentJigsawPos.z + parentJigsawFront.getVector().getZ()
            );

            VoxelShape freeSpace;

            if (BlockBoxUtil.contains(parentPieceBox, this.childJigsawPos)) {
                if (parentPieceInnerFreeSpace == null) {
                    parentPieceInnerFreeSpace = this.voxelShapes[parentPiece.index].init(parentPieceBox);
                }
                freeSpace = parentPieceInnerFreeSpace;
            } else {
                freeSpace = parentPiece.freeSpace;
            }

            boolean skip = false;
            BlockBox childPieceMinBox = TrialChambersJigsawBlocks.PIECE_TARGET_MIN_BOXES[parentPieceId].get(parentJigsaw.nbt.targetName);
            if (childPieceMinBox != null) {
                BlockBoxUtil.setRotateMove(this.childPieceMinBox, childPieceMinBox, parentPiece.rotation, childJigsawPos);
                if (!TrialChambersPieces.isInsideFreeSpace(freeSpace, this.childPieceMinBox)) {
                    skip = true;
                }
            }

            int parentJigsawPlacementPriority = parentJigsaw.nbt.placementPriority;
            int[] childTemplates = this.childTemplatesArr;

            // getShuffledTemplatesFromPool 36%
            int childTemplatesLen = TrialChambersPieces.getShuffledTemplatesFromPool(rand, parentJigsaw.nbt.poolType, childTemplates);

            for (int childTemplateIndex = 0; childTemplateIndex < childTemplatesLen; childTemplateIndex++) {
                int childPieceId = childTemplates[childTemplateIndex];
                if (childPieceId == TrialChambersPieces.EMPTY_PIECE_ID) // empty piece
                    break;

                Set<BlockDirection> directions = TrialChambersJigsawBlocks.PIECE_CONNECTION_DIRECTIONS[childPieceId].get(parentJigsaw.nbt.targetName);
                if (directions == null || skip) {
                    ShuffleUtils.skipRotationShuffle(rand);
                    for (int i = 0; i < 4; i++) {
                        ShuffleUtils.skipShuffle(rand, TrialChambersJigsawBlocks.get(childPieceId).size());
                    }
                    continue;
                }

                BlockRotation[] childRotations = this.childRotationsArr;
                //System.out.println("RAND: before shuffled rotations: " + rand.getSeed());
                TrialChambersPieces.getShuffledBlockRotations(rand, childRotations);
                for (BlockRotation childPieceRotation : childRotations) {
                    BlockRotation childRotationInverse;
                    switch (childPieceRotation.ordinal()) {
                        case /*CLOCKWISE_90*/1:
                            childRotationInverse = BlockRotation.COUNTERCLOCKWISE_90;
                            break;
                        case /*COUNTERCLOCKWISE_90*/3:
                            childRotationInverse = BlockRotation.CLOCKWISE_90;
                            break;
                        default:
                            childRotationInverse = childPieceRotation;
                            break;
                    }
                    if (!directions.contains(childRotationInverse.rotate(parentJigsawFront))) {
                        ShuffleUtils.skipShuffle(rand, TrialChambersJigsawBlocks.get(childPieceId).size());
                        continue;
                    }

                    BPos childPieceSize = TrialChambersPieceSize.get(childPieceId);

                    TrialChambersPieces.BlockJigsawInfo[] arr2 = this.childPieceJigsawBlocksArr;
                    int len2 = TrialChambersPieces.getShuffledJigsawBlocks(rand, arr2, childPieceId, childPieceRotation, MutableBlockPos.ORIGIN);
                    for (int ji2 = 0; ji2 < len2; ji2++) {
                        TrialChambersPieces.BlockJigsawInfo childJigsaw = arr2[ji2];

                        if (!parentJigsaw.canAttach(childJigsaw, parentJigsawFront)) continue;

                        MutableBlockPos childJigsawOffset = childJigsaw.pos;
                        childPiecePos.set(
                                this.childJigsawPos.x - childJigsawOffset.x,
                                this.childJigsawPos.y - childJigsawOffset.y,
                                this.childJigsawPos.z - childJigsawOffset.z
                        );

                        if (childPieceSize.getX() < 1 || childPieceSize.getY() < 1 || childPieceSize.getZ() < 1) {
                            BlockBoxUtil.set(childPieceBox, childPiecePos);
                        } else {
                            BlockBoxUtil.setSizeRotatePos(childPieceBox, childPieceSize, childPieceRotation, childPiecePos);
                        }

                        if (!TrialChambersPieces.isInsideFreeSpace(freeSpace, childPieceBox)) continue;

                        freeSpace.cutout.add(childPieceBox);

                        int childPieceDepth = parentPieceDepth + 1;
                        childPiece.id = childPieceId;
                        childPiece.rotation = childPieceRotation;
                        childPiece.depth = childPieceDepth;
                        childPiece.freeSpace = freeSpace;

                        this.piecesLen += 1;

                        if (childPieceDepth <= MAX_DEPTH) {
                            // System.out.println("child piece: " + childPiece.getName() + "  /tp " + childPiece.pos.x + " " + childPiece.pos.y + " " + childPiece.pos.z);
                            this.placing.add(childPiece, parentJigsawPlacementPriority);
                        }

                        continue nextParentJigsaw;
                    }
                }
            }
        }
    }

    public List<TrialChambersPieces.Piece> getPieces() {
        return Arrays.asList(this.pieces).subList(0, this.piecesLen);
    }

    // -------------------------------------------------------------------------

    public void printPieces() {
        for (int i = 0; i < this.piecesLen; i++) {
            TrialChambersPieces.Piece piece = this.pieces[i];
            System.out.println("Piece " + i + ": " + piece.getName() + "  /tp " + piece.pos.x + " " + piece.pos.y + " " + piece.pos.z + " rotation " + piece.rotation.name() + " and depth " + piece.depth);
        }
    }

    public static int getDecorationSalt() {
        return 30004;
    }
}
