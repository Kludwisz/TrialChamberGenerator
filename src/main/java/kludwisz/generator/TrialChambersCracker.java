package kludwisz.generator;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.math.DistanceMetric;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class TrialChambersCracker {
    // snapshot
//    public static final int EMPTY_PIECE_ID = 170;
//    public static final int EMPTY_POOL_ID = 45;
//    private static final int[] START_TEMPLATES = {78, 79}; /* chamber/end id = 7 */
//    private static final int SHUFFLED_FALLBACK_ID = 21;

    // 1.20.6
    public static final int EMPTY_PIECE_ID = 180;
    public static final int EMPTY_POOL_ID = 44;
    private static final int[] START_TEMPLATES = {93, 94}; /* chamber/end id = 7 */
    private static final int SHUFFLED_FALLBACK_ID = 20;

    private static final int MAX_DIST = 116; // max distance from start piece
    private static final int MAX_DEPTH = 20; // defined as "size" in the client jar
    public static final BlockRotation[] BLOCK_ROTATIONS = BlockRotation.values();

    public final TrialChambersCracker.Piece[] pieces = new TrialChambersCracker.Piece[512];
    public final VoxelShape[] voxelShapes = new VoxelShape[512];
    public int piecesLen;
    public final SequencedPriorityIterator<TrialChambersCracker.Piece> placing = new SequencedPriorityIterator<>();

    private final BlockBox rootBox = BlockBox.empty();
    private final TrialChambersCracker.BlockJigsawInfo[] parentJigsawsArr = new TrialChambersCracker.BlockJigsawInfo[50];
    private final TrialChambersCracker.BlockJigsawInfo[] childPieceJigsawBlocksArr = new TrialChambersCracker.BlockJigsawInfo[50];
    private final int[] childTemplatesArr = new int[1229]; // don't even ask...
    private final BlockRotation[] childRotationsArr = new BlockRotation[4];
    private final MutableBlockPos childJigsawPos = new MutableBlockPos();
    private final BlockBox childPieceMinBox = BlockBox.empty();

    private final Requirements requirements;
    private int missedPieces;
    private int matchedPieces;
    private boolean halted;
    private boolean success;

    public TrialChambersCracker(Requirements requirements) {
        this.requirements = requirements;

        for (int i = 0; i < this.pieces.length; i++) {
            this.pieces[i] = new TrialChambersCracker.Piece(i);
        }
        for (int i = 0; i < this.voxelShapes.length; i++) {
            this.voxelShapes[i] = new VoxelShape();
        }
        for (int i = 0; i < this.parentJigsawsArr.length; i++) {
            this.parentJigsawsArr[i] = new TrialChambersCracker.BlockJigsawInfo();
        }
        for (int i = 0; i < this.childPieceJigsawBlocksArr.length; i++) {
            this.childPieceJigsawBlocksArr[i] = new TrialChambersCracker.BlockJigsawInfo();
        }
    }

    public boolean generate(long worldseed, int chunkX, int chunkZ, ChunkRand rand) {
        this.piecesLen = 0;
        this.placing.clear();
        this.halted = false;
        this.success = false;
        this.matchedPieces = 0;
        this.missedPieces = 0;

        // choose random y position and rotation
        rand.setCarverSeed(worldseed, chunkX, chunkZ, MCVersion.v1_20);
        int pickedY = rand.nextInt(21) - 41;
        if (pickedY != this.requirements.startPieceY)
            return false;
        BlockRotation startPieceRotation = rand.getRandom(BLOCK_ROTATIONS);
        if (startPieceRotation.ordinal() != this.requirements.startPieceRotationOrdinal)
            return false;

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
            if (this.halted)
                break;

            Piece nextPiece = this.placing.next();
            if (nextPiece == null)
                break; // end of input
            this.tryPlacing(nextPiece, rand);
        }

        return this.success;
    }

    public void tryPlacing(TrialChambersCracker.Piece parentPiece, ChunkRand rand) {
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

        TrialChambersCracker.BlockJigsawInfo[] parentJigsaws = this.parentJigsawsArr;
        int parentJigsawsLen = getShuffledJigsawBlocks(rand, parentJigsaws, parentPieceId, parentPiece.rotation, parentPiecePos);

        nextParentJigsaw:
        for (int parentJigsawIndex = 0; parentJigsawIndex < parentJigsawsLen; parentJigsawIndex++) {
            //System.out.println("RAND: inside shuffled jigsaws: " + rand.getSeed());
            TrialChambersCracker.BlockJigsawInfo parentJigsaw = parentJigsaws[parentJigsawIndex];

            TrialChambersCracker.Piece childPiece = this.pieces[this.piecesLen];
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

                    TrialChambersCracker.BlockJigsawInfo[] arr2 = this.childPieceJigsawBlocksArr;
                    int len2 = getShuffledJigsawBlocks(rand, arr2, childPieceId, childPieceRotation, MutableBlockPos.ORIGIN);
                    for (int ji2 = 0; ji2 < len2; ji2++) {
                        TrialChambersCracker.BlockJigsawInfo childJigsaw = arr2[ji2];

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

                        Requirements.TestResult result = this.requirements.test(TrialChambersPieceNames.get(childPieceId), childPiecePos.toImmutable());
                        switch (result) {
                            case GOOD_CERTAIN_PIECE:
                            case GOOD_UNCERTAIN_PIECE:
                                this.matchedPieces++;
                                if (this.requirements.isEnoughMatches(this.matchedPieces)) {
                                    this.success = true;
                                    this.halted = true;
                                    return;
                                }
                                break;
                            case BAD_CERTAIN_PIECE:
                                this.halted = true;
                                break;
                            case BAD_UNCERTAIN_PIECE:
                                if (this.requirements.tooManyMisses(++this.missedPieces)) {
                                    this.halted = true;
                                    return;
                                }
                                break;
                        }

                        this.piecesLen += 1;
                        freeSpace.cutout.add(childPieceBox);

                        int childPieceDepth = parentPieceDepth + 1;
                        childPiece.id = childPieceId;
                        childPiece.rotation = childPieceRotation;
                        childPiece.depth = childPieceDepth;
                        childPiece.freeSpace = freeSpace;

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
    public static int getShuffledJigsawBlocks(JRand rand, TrialChambersCracker.BlockJigsawInfo[] arr, int id, BlockRotation rotation, MutableBlockPos offset) {//taking 20% need to opti
        JigsawBlock[] blocks = TrialChambersJigsawBlocks.JIGSAW_BLOCKS[id];
        int len = blocks.length;
        for (int i = 0; i < len; i++)
            indexArray[i] = i;
        System.arraycopy(TrialChambersJigsawBlocks.PIECE_JIGSAW_SORT_OFFSETS[id], 0, sortingCurrentIDs, 0, 3);

        ShuffleUtils.shuffle(rand, indexArray, len);

        // place the jigsaws directly at the target positions, no sorting needed
        for (int i = 0; i < len; i++) {
            JigsawBlock jigsawBlock = blocks[indexArray[i]];
            int selectionPrio = jigsawBlock.selectionPriority;
            int currentID = sortingCurrentIDs[selectionPrio]++;

            TrialChambersCracker.BlockJigsawInfo blockJigsawInfo = arr[currentID];
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

        if (TrialChambersPools.getFallbackID(poolId) != SHUFFLED_FALLBACK_ID) return len + fallbackLen;

        // the extra shuffling only occurs when pool SHUFFLED_FALLBACK_ID is the fallback pool
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

        public boolean canAttach(TrialChambersCracker.BlockJigsawInfo blockJigsawInfo2, BlockDirection direction) {
            return (direction.ordinal() ^ 1) == blockJigsawInfo2.front.ordinal()
                    && (this.nbt.jointType.equals(JointType.ROLLABLE) || this.top.equals(blockJigsawInfo2.top))
                    && this.nbt.targetName.equals(blockJigsawInfo2.nbt.name);
        }
    }

    public static class Requirements {
        public static final int MAX_UNIQUE_OFFSET_TOLERANCE = 4;
        public static final int MAX_UNCERTAIN_TOLERANCE = 2;

        private final HashSet<String> bannedPieces = new HashSet<>();
        private final HashMap<String, BPos> uniquePieces = new HashMap<>();
        private final HashMap<BPos, String> certainPieces = new HashMap<>();
        private final HashMap<BPos, String> uncertainPieces = new HashMap<>();

        public final int chunkX;
        public final int chunkZ;
        public final int startPieceY;
        public final int startPieceRotationOrdinal;
        public int targetMatches;
        public Requirements(int chunkX, int chunkZ, int startPieceY, int startPieceRotationOrdinal) {
            this.chunkX = chunkX;
            this.chunkZ = chunkZ;
            this.startPieceY = startPieceY;
            this.startPieceRotationOrdinal = startPieceRotationOrdinal;
        }

        // --------------------------------------------------------------

        public void addBannedPiece(String piece) {
            bannedPieces.add(piece);
        }

        public void addUniquePiece(String piece, BPos pos) {
            uniquePieces.put(piece, pos);
            targetMatches++;
        }

        public void addCertainPiece(String piece, BPos pos) {
            certainPieces.put(pos, piece);
            targetMatches++;
        }

        public void addUncertainPiece(String piece, BPos pos) {
            uncertainPieces.put(pos, piece);
            targetMatches++;
        }

        public boolean isEnoughMatches(int matchedPieces) {
            return matchedPieces >= targetMatches - MAX_UNCERTAIN_TOLERANCE;
        }

        public boolean tooManyMisses(int missedPieces) {
            return missedPieces > MAX_UNCERTAIN_TOLERANCE;
        }

        // --------------------------------------------------------------

        public final TestResult test(String piecename, BPos pos) {
            if (bannedPieces.contains(piecename))
                return TestResult.BAD_CERTAIN_PIECE;

            if (uniquePieces.containsKey(piecename)) {
                BPos uniquePos = uniquePieces.get(piecename);
                if (pos.distanceTo(uniquePos, DistanceMetric.CHEBYSHEV) <= MAX_UNIQUE_OFFSET_TOLERANCE)
                    return TestResult.GOOD_CERTAIN_PIECE;
                return TestResult.BAD_CERTAIN_PIECE;
            }

            if (certainPieces.containsKey(pos)) {
                if (certainPieces.get(pos).contains(piecename))
                    return TestResult.GOOD_CERTAIN_PIECE;
                return TestResult.BAD_CERTAIN_PIECE;
            }

            if (uncertainPieces.containsKey(pos)) {
                String uncertainPiece = uncertainPieces.get(pos);
                if (piecename.contains(uncertainPiece))
                    return TestResult.GOOD_UNCERTAIN_PIECE;
                return TestResult.BAD_UNCERTAIN_PIECE;
            }

            return TestResult.NEUTRAL;
        }

        public enum TestResult {
            GOOD_CERTAIN_PIECE,
            GOOD_UNCERTAIN_PIECE,
            BAD_CERTAIN_PIECE,
            BAD_UNCERTAIN_PIECE,
            NEUTRAL
        }
    }
}