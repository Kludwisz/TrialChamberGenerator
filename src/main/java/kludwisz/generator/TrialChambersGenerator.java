package kludwisz.generator;

import java.util.*;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcseed.rand.JRand;

import kludwisz.chambers.jigsaws.JigsawBlock;
import kludwisz.chambers.jigsaws.JointType;
import kludwisz.chambers.jigsaws.TrialChambersJigsawBlocks;
import kludwisz.chambers.jigsaws.TrialChambersPools;
import kludwisz.chambers.pieces.TrialChambersPieceNames;
import kludwisz.chambers.pieces.TrialChambersStructureSize;
import kludwisz.generator.util.BlockBoxUtil;
import kludwisz.generator.util.MutableBlockPos;
import kludwisz.generator.util.RotationUtil;
import kludwisz.generator.util.ShuffleUtils;
import kludwisz.util.SequencedPriorityIterator;
import kludwisz.util.VoxelShape;


public class TrialChambersGenerator {
    public static final int EMPTY_PIECE_ID = 170;
    public static final int EMPTY_POOL_ID = 45;

    private static final int MAX_DIST = 116; // max distance from start piece
    private static final int MAX_DEPTH = 20; // defined as "size" in the client jar
    private static final int[] START_TEMPLATES = {78, 79}; /* chamber/end id = 7 */
    public static final BlockRotation[] BLOCK_ROTATIONS = BlockRotation.values();

    // storing a reference to the jigsaw blocks array to avoid using reflection
    private static JigsawBlock[][] JIGSAW_BLOCKS = TrialChambersJigsawBlocks.JIGSAW_BLOCKS;

    public final TrialChambersGenerator.Piece[] pieces = new TrialChambersGenerator.Piece[512];
    public final VoxelShape[] voxelShapes = new VoxelShape[512];
    public int piecesLen;
    public final SequencedPriorityIterator<TrialChambersGenerator.Piece> placing = new SequencedPriorityIterator<>();

    private final BlockBox rootBox = BlockBox.empty();
    private final TrialChambersGenerator.BlockJigsawInfo[] parentJigsawsArr = new TrialChambersGenerator.BlockJigsawInfo[50];
    private final TrialChambersGenerator.BlockJigsawInfo[] childPieceJigsawBlocksArr = new TrialChambersGenerator.BlockJigsawInfo[50];
    private final int[] childTemplatesArr = new int[1229]; // don't even ask...
    private final BlockRotation[] childRotationsArr = new BlockRotation[4];
    private final MutableBlockPos childJigsawPos = new MutableBlockPos();
    private final BlockBox childPieceMinBox = BlockBox.empty();

    public TrialChambersGenerator() {
        for (int i = 0; i < this.pieces.length; i++) {
            this.pieces[i] = new TrialChambersGenerator.Piece(i);
        }
        for (int i = 0; i < this.voxelShapes.length; i++) {
            this.voxelShapes[i] = new VoxelShape();
        }
        for (int i = 0; i < this.parentJigsawsArr.length; i++) {
            this.parentJigsawsArr[i] = new TrialChambersGenerator.BlockJigsawInfo();
        }
        for (int i = 0; i < this.childPieceJigsawBlocksArr.length; i++) {
            this.childPieceJigsawBlocksArr[i] = new TrialChambersGenerator.BlockJigsawInfo();
        }
    }

    public boolean generate(long worldseed, int chunkX, int chunkZ, ChunkRand rand) {
        this.piecesLen = 0;

        // choose random y position and rotation
        rand.setCarverSeed(worldseed, chunkX, chunkZ, MCVersion.v1_20);
        int pickedY = rand.nextInt(21) - 41;
        BlockRotation startPieceRotation = rand.getRandom(BLOCK_ROTATIONS);

        // choose random starting template
        int startPieceId = START_TEMPLATES[rand.nextInt(START_TEMPLATES.length)];
        BPos startPieceSize = TrialChambersStructureSize.get(startPieceId);

        // set starting position
        Piece startPiece = this.pieces[this.piecesLen];
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
            Piece nextPiece = this.placing.next();
            if (nextPiece == null)
                break; // end of input
            this.tryPlacing(nextPiece, rand);
        }

        return true;
    }

    public void tryPlacing(TrialChambersGenerator.Piece parentPiece, ChunkRand rand) {
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

        TrialChambersGenerator.BlockJigsawInfo[] parentJigsaws = this.parentJigsawsArr;
        int parentJigsawsLen = getShuffledJigsawBlocks(rand, parentJigsaws, parentPieceId, parentPiece.rotation, parentPiecePos);

        nextParentJigsaw:
        for (int parentJigsawIndex = 0; parentJigsawIndex < parentJigsawsLen; parentJigsawIndex++) {
            //System.out.println("RAND: inside shuffled jigsaws: " + rand.getSeed());
            TrialChambersGenerator.BlockJigsawInfo parentJigsaw = parentJigsaws[parentJigsawIndex];

            TrialChambersGenerator.Piece childPiece = this.pieces[this.piecesLen];
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
                if (!isInsideFreeSpace(freeSpace, this.childPieceMinBox)) {
                    skip = true;
                }
            }

            int parentJigsawPlacementPriority = parentJigsaw.nbt.placementPriority;
            int[] childTemplates = this.childTemplatesArr;

            // getShuffledTemplatesFromPool 36%
            int childTemplatesLen = getShuffledTemplatesFromPool(rand, parentJigsaw.nbt.poolType, childTemplates);

            for (int childTemplateIndex = 0; childTemplateIndex < childTemplatesLen; childTemplateIndex++) {
                int childPieceId = childTemplates[childTemplateIndex];
                if (childPieceId == EMPTY_PIECE_ID) // empty piece
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
                getShuffledBlockRotations(rand, childRotations);
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

                    BPos childPieceSize = TrialChambersStructureSize.get(childPieceId);

                    TrialChambersGenerator.BlockJigsawInfo[] arr2 = this.childPieceJigsawBlocksArr;
                    int len2 = getShuffledJigsawBlocks(rand, arr2, childPieceId, childPieceRotation, MutableBlockPos.ORIGIN);
                    for (int ji2 = 0; ji2 < len2; ji2++) {
                        TrialChambersGenerator.BlockJigsawInfo childJigsaw = arr2[ji2];

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

                        if (!isInsideFreeSpace(freeSpace, childPieceBox)) continue;

                        freeSpace.cutout.add(childPieceBox);

                        int childPieceDepth = parentPieceDepth + 1;
                        childPiece.id = childPieceId;
                        childPiece.rotation = childPieceRotation;
                        childPiece.depth = childPieceDepth;
                        childPiece.freeSpace = freeSpace;

                        this.piecesLen += 1;

                        if (childPieceDepth <= MAX_DEPTH) {
                            this.placing.add(childPiece, parentJigsawPlacementPriority);
                        }

                        continue nextParentJigsaw;
                    }
                }
            }
        }
    }

    private boolean isInsideFreeSpace(VoxelShape freeSpace, BlockBox box) {
        if (box.minX < freeSpace.outer.minX || box.minY < freeSpace.outer.minY || box.minZ < freeSpace.outer.minZ || box.maxX > freeSpace.outer.maxX || box.maxY > freeSpace.outer.maxY || box.maxZ > freeSpace.outer.maxZ) {
            return false;
        }

        for (BlockBox cutoutBox : freeSpace.cutout) {
            if (intersects(box, cutoutBox)) {
                return false;
            }
        }
        return true;
    }

    public static boolean intersects(BlockBox box1, BlockBox box) {
        return box1.maxX >= box.minX && box1.minX <= box.maxX && box1.maxZ >= box.minZ && box1.minZ <= box.maxZ && box1.maxY >= box.minY && box1.minY <= box.maxY;
    }

    // Jigsaws & templates

    private static final int[] indexArray = new int[50];
    private static final int[] sortingCurrentIDs = new int[3];
    public static int getShuffledJigsawBlocks(JRand rand, TrialChambersGenerator.BlockJigsawInfo[] arr, int id, BlockRotation rotation, MutableBlockPos offset) {//taking 20% need to opti
        JigsawBlock[] blocks = JIGSAW_BLOCKS[id];
        int len = blocks.length;
        for (int i = 0; i < len; i++)
            indexArray[i] = i;

        ShuffleUtils.shuffle(rand, indexArray, len);

        // place the jigsaws directly at the target positions, no sorting needed
        for (int i = 0; i < len; i++) {
            JigsawBlock jigsawBlock = blocks[indexArray[i]];
            int selectionPrio = jigsawBlock.selectionPriority;
            int currentID = sortingCurrentIDs[selectionPrio]++;

            TrialChambersGenerator.BlockJigsawInfo blockJigsawInfo = arr[currentID];
            blockJigsawInfo.nbt = jigsawBlock;
            blockJigsawInfo.pos.setRotateOffset(jigsawBlock.relativePos, rotation, offset);
            blockJigsawInfo.front = RotationUtil.rotate(rotation, jigsawBlock.direction1);
            blockJigsawInfo.top = RotationUtil.rotate(rotation, jigsawBlock.direction2);
        }

        return len;
    }

    private static int getShuffledTemplatesFromPool(JRand rand, int poolId, int[] arr) {
        int[] pool = TrialChambersPools.CHAMBER_POOLS[poolId];
        int len = pool.length;
        System.arraycopy(pool, 0, arr, 0, len);
        ShuffleUtils.shuffle(rand, arr, len);

        // add the fallback templates (if there are any)
        if (TrialChambersPools.getFallbackID(poolId) == EMPTY_POOL_ID) return len;

        int[] fallbackPool = TrialChambersPools.CHAMBER_POOLS[TrialChambersPools.getFallbackID(poolId)];
        int fallbackLen = fallbackPool.length;
        System.arraycopy(fallbackPool, 0, arr, len, fallbackLen);

        if (TrialChambersPools.getFallbackID(poolId) != 21) return len + fallbackLen;

        // the extra shuffling only occurs when pool 21 is the fallback pool
        ShuffleUtils.shuffleFallbackPool21(rand, arr, len);
        return len + fallbackLen;
    }

    public static void getShuffledBlockRotations(JRand rand, BlockRotation[] arr) {
        arr[0] = BlockRotation.NONE;
        arr[1] = BlockRotation.CLOCKWISE_90;
        arr[2] = BlockRotation.CLOCKWISE_180;
        arr[3] = BlockRotation.COUNTERCLOCKWISE_90;
        ShuffleUtils.shuffleRotations(rand, arr);
    }

    // -------------------------------------------------------------------------

    public static class Piece {
        public int id;
        public MutableBlockPos pos;
        public BlockBox box;
        public BlockRotation rotation;
        public VoxelShape freeSpace;
        public int depth;
        int index;

        public String getName() {
            return TrialChambersPieceNames.get(this.id);
        }

        public Piece(int index) {
            this.pos = new MutableBlockPos();
            this.box = new BlockBox(0, 0, 0, 0, 0, 0);
            this.index = index;
        }

        public void move(int x, int y, int z) {
            this.pos.offset(x, y, z);
            this.box.move(x, y, z);
        }
    }

    public static class BlockJigsawInfo {
        public JigsawBlock nbt;
        public MutableBlockPos pos = new MutableBlockPos();
        //        public BPos pos;
        public BlockDirection front;
        public BlockDirection top;

        public BlockJigsawInfo() {

        }

        public static BlockDirection getOpposite(BlockDirection b) {
            switch (b) {
                case NORTH:
                    return BlockDirection.SOUTH;
                case SOUTH:
                    return BlockDirection.NORTH;
                case WEST:
                    return BlockDirection.EAST;
                case EAST:
                    return BlockDirection.WEST;
                case DOWN:
                    return BlockDirection.UP;
                case UP:
                    return BlockDirection.DOWN;
                default:
                    throw new IllegalStateException("Unable to get facing of ");
            }
        }

        public boolean canAttach(TrialChambersGenerator.BlockJigsawInfo blockJigsawInfo2, BlockDirection direction) {
            return (direction.ordinal() ^ 1) == blockJigsawInfo2.front.ordinal()
                    && (this.nbt.jointType.equals(JointType.ROLLABLE) || this.top.equals(blockJigsawInfo2.top))
                    && this.nbt.targetName.equals(blockJigsawInfo2.nbt.name);
        }
    }

    // -------------------------------------------------------------------------

    public void printPieces() {
        for (int i = 0; i < this.piecesLen; i++) {
            Piece piece = this.pieces[i];
            System.out.println("Piece " + i + ": " + piece.getName() + "  /tp " + piece.pos.x + " " + piece.pos.y + " " + piece.pos.z + " rotation " + piece.rotation.name() + " and depth " + piece.depth);
        }
    }
}