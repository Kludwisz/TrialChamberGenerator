package kludwisz.generator;

import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mcseed.rand.JRand;
import kludwisz.structure.jigsaws.JigsawBlock;
import kludwisz.structure.jigsaws.JointType;
import kludwisz.structure.jigsaws.TrialChambersJigsawBlocks;
import kludwisz.structure.jigsaws.TrialChambersPools;
import kludwisz.structure.pieces.TrialChambersPieceNames;
import kludwisz.generator.util.MutableBlockPos;
import kludwisz.generator.util.RotationUtil;
import kludwisz.generator.util.ShuffleUtils;
import kludwisz.util.VoxelShape;


public class TrialChambersPieces {
    public static final int EMPTY_PIECE_ID = 191;
    public static final int EMPTY_POOL_ID = 47;
    public static final int[] START_TEMPLATES = {76, 77}; /* chamber/end id = 7 */
    public static final int SHUFFLED_FALLBACK_ID = 23;

    // -------------------------------------------------------------------------
    // Jigsaws & templates
    // -------------------------------------------------------------------------

    private static final int[] indexArray = new int[50];
    private static final int[] sortingCurrentIDs = new int[3];
    public static int getShuffledJigsawBlocks(JRand rand, BlockJigsawInfo[] arr, int id, BlockRotation rotation, MutableBlockPos offset) {//taking 20% need to opti
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

            BlockJigsawInfo blockJigsawInfo = arr[currentID];
            blockJigsawInfo.nbt = jigsawBlock;
            blockJigsawInfo.pos.setRotateOffset(jigsawBlock.relativePos, rotation, offset);
            blockJigsawInfo.front = RotationUtil.rotate(rotation, jigsawBlock.direction1);
            blockJigsawInfo.top = RotationUtil.rotate(rotation, jigsawBlock.direction2);
        }

        return len;
    }

    public static int getShuffledTemplatesFromPool(JRand rand, int poolId, int[] arr) {
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

    public static boolean isInsideFreeSpace(VoxelShape freeSpace, BlockBox box) {
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

    // -------------------------------------------------------------------------

    public static class Piece {
        public int id;
        public MutableBlockPos pos;
        public BlockBox box;
        public BlockRotation rotation;
        public VoxelShape freeSpace;
        public int depth;
        public int index;

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

        public BlockJigsawInfo() {}

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

        public boolean canAttach(BlockJigsawInfo blockJigsawInfo2, BlockDirection direction) {
            return (direction.ordinal() ^ 1) == blockJigsawInfo2.front.ordinal()
                    && (this.nbt.jointType.equals(JointType.ROLLABLE) || this.top.equals(blockJigsawInfo2.top))
                    && this.nbt.targetName.equals(blockJigsawInfo2.nbt.name);
        }
    }
}
