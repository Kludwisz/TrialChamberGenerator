package kludwisz.generator;

import java.util.*;

import acgen.src.main.java.kludwisz.ancientcity.AncientCityGenerator;
import acgen.src.main.java.kludwisz.ancientcity.Main;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.block.BlockMirror;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Triplet;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcseed.rand.JRand;

import kludwisz.chambers.jigsaws.JigsawBlock;
import kludwisz.chambers.jigsaws.TrialChambersJigsawBlocks;
import kludwisz.chambers.jigsaws.TrialChambersPools;
import kludwisz.chambers.pieces.TrialChambersPieceNames;
import kludwisz.chambers.pieces.TrialChambersStructureLoot;
import kludwisz.chambers.pieces.TrialChambersStructureSize;
import kludwisz.generator.util.BlockBoxUtil;
import kludwisz.generator.util.MutableBlockPos;
import kludwisz.util.DecoratorRand;
import kludwisz.util.SequencedPriorityIterator;
import kludwisz.util.VoxelShape;


public class TrialChambersGenerator {
    private static final int MAX_DIST = 116; // max distance from start piece
    private static final int MAX_DEPTH = 20; // defined as "size" in the client jar
    private static final int EMPTY_PIECE_ID = 170;
    private static final int[] START_TEMPLATES = { 78, 79 }; /* chamber/end id = 7 */
    public static final BlockRotation[] BLOCK_ROTATIONS = BlockRotation.values();

    public final TrialChambersGenerator.Piece[] pieces = new TrialChambersGenerator.Piece[256];
    public final VoxelShape[] voxelShapes = new VoxelShape[256];
    public int piecesLen;
    public final SequencedPriorityIterator<TrialChambersGenerator.Piece> placing = new SequencedPriorityIterator<>();

    private final BlockBox rootBox = BlockBox.empty();
    private final TrialChambersGenerator.BlockJigsawInfo[] parentJigsawsArr = new TrialChambersGenerator.BlockJigsawInfo[5];
    private final TrialChambersGenerator.BlockJigsawInfo[] childPieceJigsawBlocksArr = new TrialChambersGenerator.BlockJigsawInfo[5];
    private final int[] childTemplatesArr = new int[46];
    private final BlockRotation[] childRotationsArr = new BlockRotation[4];
    private final MutableBlockPos childJigsawPos = new MutableBlockPos();
    private final BlockBox childPieceMinBox = BlockBox.empty();

    public TrialChambersGenerator() {
        for (int i = 0; i < this.pieces.length; i++) {
            this.pieces[i] = new TrialChambersGenerator.Piece(i);
        }for (int i = 0; i < this.voxelShapes.length; i++) {
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
        BlockRotation startPieceRotation = BlockRotation.getRandom(rand);

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
        // this.placing.clear(); TODO why was this here
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

    public void tryPlacing(AncientCityGenerator.Piece parentPiece, ChunkRand rand) {
        int parentPieceId = parentPiece.id;
        int parentPieceDepth = parentPiece.depth;
        MutableBlockPos parentPiecePos = parentPiece.pos;
        VoxelShape parentPieceInnerFreeSpace = null;
        BlockBox parentPieceBox = parentPiece.box;

        if (parentPieceDepth == MAX_DEPTH) {
            acgen.src.main.java.kludwisz.ancientcity.Main.skipShuffle(rand, TrialChambersJigsawBlocks.get(parentPieceId).size());
            return;
        }

        TrialChambersGenerator.BlockJigsawInfo[] parentJigsaws = this.parentJigsawsArr;
        int parentJigsawsLen = getShuffledJigsawBlocks(rand, parentJigsaws, parentPieceId, parentPiece.rotation, parentPiecePos);
        nextParentJigsaw:
        for (int parentJigsawIndex = 0; parentJigsawIndex < parentJigsawsLen; parentJigsawIndex++) {
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
            BlockBox childPieceMinBox = AncientCityJigsawBlocks.PIECE_TARGET_MIN_BOXES[parentPieceId].get(parentJigsaw.nbt.targetName);
            if (childPieceMinBox != null) {
                BlockBoxUtil.setRotateMove(this.childPieceMinBox, childPieceMinBox, parentPiece.rotation, childJigsawPos);
                if (!isInsideFreeSpace(freeSpace, this.childPieceMinBox)) {
                    skip = true;
                }
            }

            int[] childTemplates = this.childTemplatesArr;
            int childTemplatesLen = getShuffledTemplatesFromPool(rand, parentJigsaw.nbt.poolType, childTemplates);
            for (int childTemplateIndex = 0; childTemplateIndex < childTemplatesLen; childTemplateIndex++) {
                int childPieceId = childTemplates[childTemplateIndex];
                if (childPieceId == 60) // empty piece
                    break;

                Set<BlockDirection> directions = AncientCityJigsawBlocks.PIECE_CONNECTION_DIRECTIONS[childPieceId].get(parentJigsaw.nbt.targetName);
                if (directions == null || skip) {
                    acgen.src.main.java.kludwisz.ancientcity.Main.skipShuffle(rand, 4);
                    for (int i = 0; i < 4; i++) {
                        acgen.src.main.java.kludwisz.ancientcity.Main.skipShuffle(rand, AncientCityJigsawBlocks.JIGSAW_BLOCKS_V2.get(childPieceId).size());
                    }
                    continue;
                }

                BlockRotation[] childRotations = this.childRotationsArr;
                getShuffledBlockRotations(rand, childRotations);
                for (BlockRotation childPieceRotation : childRotations) {

                    BlockRotation childRotationInverse = switch (childPieceRotation) {
                        case CLOCKWISE_90 -> BlockRotation.COUNTERCLOCKWISE_90;
                        case COUNTERCLOCKWISE_90 -> BlockRotation.CLOCKWISE_90;
                        default -> childPieceRotation;
                    };
                    if (!directions.contains(childRotationInverse.rotate(parentJigsawFront))) {
                        acgen.src.main.java.kludwisz.ancientcity.Main.skipShuffle(rand, AncientCityJigsawBlocks.JIGSAW_BLOCKS_V2.get(childPieceId).size());
                        continue;
                    }

                    BPos childPieceSize = AncientCityStructureSize.STRUCTURE_SIZE_V2.get(childPieceId);

                    AncientCityGenerator.BlockJigsawInfo[] arr2 = this.childPieceJigsawBlocksArr;
                    int len2 = getShuffledJigsawBlocks(rand, arr2, childPieceId, childPieceRotation, MutableBlockPos.ORIGIN);
                    for (int ji2 = 0; ji2 < len2; ji2++) {
                        AncientCityGenerator.BlockJigsawInfo childJigsaw = arr2[ji2];
                        acgen.src.main.java.kludwisz.ancientcity.Main.A += 1;

                        if (!parentJigsaw.canAttach(childJigsaw, parentJigsawFront)) continue;

                        acgen.src.main.java.kludwisz.ancientcity.Main.B += 1;

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

                        Main.C += 1;

                        freeSpace.cutout.add(childPieceBox);

                        int childPieceDepth = parentPieceDepth + 1;
                        childPiece.id = childPieceId;
                        childPiece.rotation = childPieceRotation;
                        childPiece.depth = childPieceDepth;
                        childPiece.freeSpace = freeSpace;

                        this.piecesLen += 1;

                        if (childPieceDepth <= MAX_DEPTH){
                            this.placing.addLast(childPiece);
                        }

                        continue nextParentJigsaw;
                    }
                }
            }
        }
    }

    public void printPieces() {
        for (Piece p : this.pieces) {
            System.out.print(p.getName() + "  /tp  " + p.box.minX + " " + p.box.minY + " " + p.box.minZ);
            System.out.println("  /tp  " + p.box.maxX + " " + p.box.maxY + " " + p.box.maxZ);
        }
    }

    static public class Piece2 {
        int id;
        public BPos pos;
        BlockBox box;
        public BlockRotation rotation;
        private VoxelShape voxelShape;
        int depth;

        public String getName(){
            return TrialChambersPieceNames.get(this.id);
        }

        Piece2(int id, BPos pos, BlockBox box, BlockRotation rotation, int depth) {
            this.id = id;
            this.pos = pos;
            this.box = box;
            this.rotation = rotation;
            this.voxelShape = new VoxelShape(box);
            this.depth = depth;
        }

        public void move(int x, int y, int z) {
            box.move(x, y, z);
            pos = pos.add(x, y, z);
        }

        public List<BlockJigsawInfo> getShuffledJigsawBlocks(BPos offset, JRand rand) {//taking 20% need to opti
            List<JigsawBlock> blocks = TrialChambersJigsawBlocks.get(this.id);
            //if (blocks.isEmpty())
            //	return List.of();

            List<BlockJigsawInfo> list = new ArrayList<>(blocks.size());

            for (JigsawBlock b : blocks) {
                BlockJigsawInfo blockJigsawInfo = new BlockJigsawInfo(b, rotation.rotate(b.relativePos, new BPos(0,0,0)).add(offset), rotation );
                list.add(blockJigsawInfo);
            }
            rand.shuffle(list);

            // new feature, introduced in 23w43a
            // TODO check if this is correct
            list.sort(
                    Comparator.comparingInt(
                            (var0x) -> {
                                return -var0x.nbt.getSelectionPriority(); // FIXME HACK
                            }
                    )
            );

            return list;
        }

        public void setVoxelShape(VoxelShape mutableobject1) {
            this.voxelShape = mutableobject1;
        }

        public VoxelShape getVoxelShape() {
            return this.voxelShape;
        }
    }

    static public class Piece {
        public int id;
        public MutableBlockPos pos;
        public BlockBox box;
        public BlockRotation rotation;
        public VoxelShape freeSpace;
        public int depth;
        int index;

        public String getName(){
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
        public BlockJigsawInfo() {

        }

        public static BlockDirection getOpposite(BlockDirection b){
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
                    throw new IllegalStateException("Unable to get facing of " );
            }
        }

        public boolean canAttach(AncientCityGenerator.BlockJigsawInfo blockJigsawInfo2, BlockDirection direction) {
            return (direction.ordinal() ^ 1) == blockJigsawInfo2.front.ordinal() && this.nbt.targetName.equals(blockJigsawInfo2.nbt.name);
        }
    }

    public static class BlockJigsawInfo2 {
        JigsawBlock nbt;
        BPos pos;
        BlockRotation rotation;
        public BlockJigsawInfo2(JigsawBlock nbt, BPos pos, BlockRotation rotation) {
            this.nbt = nbt;
            this.pos = pos;
            this.rotation = rotation;
        }

        public BlockDirection getFront() {
            return rotation.rotate(this.nbt.direction1);
        }

        public BlockDirection getTop() {
            return rotation.rotate(this.nbt.direction2);
        }

        public BlockDirection getOpposite(BlockDirection b){
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
                    throw new IllegalStateException("Unable to get facing of " );
            }
        }

        public boolean canAttach(BlockJigsawInfo blockJigsawInfo2, BlockDirection direction) {
            return direction == this.getOpposite(blockJigsawInfo2.getFront())
                    && this.nbt.targetName.equals(blockJigsawInfo2.nbt.name)
                    && (this.nbt.jointType.isRollable() || this.getTop().equals(blockJigsawInfo2.getTop()));
        }

        public int getPoolType() {
            //if (this.nbt.poolAlias == null)
                return this.nbt.poolType;
            //return TrialChambersPools.getFromAlias(this.nbt.poolAlias + "0");
        }
    }

    public static class Assembler {
        int maxDepth;
        List<Piece> pieces;

        // please excuse the mojang garbage
        // TODO FIXME find out if it's possible to get rid of this crap
        private final SequencedPriorityIterator<Piece> placing = new SequencedPriorityIterator<>();

        Assembler(int maxDepth, List<Piece> pieces, int heightY) {
            this.maxDepth = maxDepth;
            this.pieces = pieces;
        }

        public void tryPlacing(Piece piece, ChunkRand rand) {
            int depth = piece.depth;
            BPos pos = piece.pos;
            VoxelShape mutableobject = new VoxelShape();
            BlockBox box = piece.box;
            int minY = box.minY;

            // System.out.println("Shuffle for piece " + piece.getName());
            label139:
            for (BlockJigsawInfo blockJigsawInfo : piece.getShuffledJigsawBlocks(pos, rand)) {
                BlockDirection blockDirection = blockJigsawInfo.getFront();
                BPos blockPos = blockJigsawInfo.pos;
                BPos relativeBlockPos = new BPos(blockPos.getX() + blockDirection.getVector().getX(),
                        blockPos.getY() + blockDirection.getVector().getY(),
                        blockPos.getZ() + blockDirection.getVector().getZ());
                int y = blockPos.getY() - minY;

                List<Pair<Integer, Integer>> pool = TrialChambersPools.get(blockJigsawInfo.getPoolType());

                if (pool != null && pool.size() != 0) {
                    int fallbackPoolID = TrialChambersPools.getFallbackID(blockJigsawInfo.getPoolType());
                    List<Pair<Integer, Integer>> fallbackPool = TrialChambersPools.get(fallbackPoolID);

                    if (fallbackPool != null && fallbackPool.size() != 0) {

                        // JigSawPool jigSawPool1 = new JigSawPool(pool.getSecond());
                        // JigSawPool jigSawPool2 = new JigSawPool(fallbackPool.getSecond());
                        boolean isInside = box.contains(relativeBlockPos);
                        VoxelShape mutableobject1;
                        if (isInside) {
                            mutableobject1 = mutableobject;
                            if (mutableobject.isNull()) {
                                mutableobject.setValue(box,true);

                            }
                        } else {
                            mutableobject1 = piece.getVoxelShape();
                        }


                        // create a list of shuffled templates
                        ArrayList<Integer> list = new ArrayList<>();

                        if (depth != this.maxDepth) {
                            list = getShuffledTemplatesFromPool(pool, rand);
                            //if(list.size() != 0) {
                            //    rand.shuffle(list);
                            //}
                        }
                        list.addAll(getShuffledTemplatesFromPool(fallbackPool, rand));

                        // ArrayList<Integer> listtmp = getShuffledTemplatesFromPool(fallbackPool, rand);
                        // if(listtmp.size() != 0) {
                        //    rand.shuffle(listtmp);
                        // }
                        // list.addAll(listtmp);

                        // aka var30 in the code
                        int placementPriority = blockJigsawInfo.nbt.getPlacementPriority();

                        for (int jigsawpiece1 : list) {
                            if (jigsawpiece1 == EMPTY_PIECE_ID){
                                break;
                            }

                            List<BlockRotation> shuffledRotations = BlockRotation.getShuffled(rand);
                            for (BlockRotation rotation1 : shuffledRotations ) {

                                BPos size1 = TrialChambersStructureSize.get(jigsawpiece1);
                                BlockBox box1 = size1==null ? new BlockBox(0,0,0,0,0,0) : BlockBox.getBoundingBox(BPos.ORIGIN, rotation1, BPos.ORIGIN, BlockMirror.NONE, size1);
                                Piece piece1 = new Piece(jigsawpiece1, BPos.ORIGIN, box1, rotation1, 0);
                                List<BlockJigsawInfo> list1;

                                list1 = piece1.getShuffledJigsawBlocks(BPos.ORIGIN, rand);

                                // TC doesnt use expansion hack
                                // int var37 = 0;

                                BlockDirection direction = blockJigsawInfo.getFront();

                                // Loop to see if we can attach
                                for (BlockJigsawInfo blockJigsawInfo2 : list1) {
                                    if (blockJigsawInfo.canAttach(blockJigsawInfo2,direction)) {
                                        //System.out.println("can attach");

                                        BPos blockPos3 = blockJigsawInfo2.pos;
                                        BPos blockPos4 = new BPos(relativeBlockPos.getX() - blockPos3.getX(),
                                                relativeBlockPos.getY() - blockPos3.getY(), relativeBlockPos.getZ() - blockPos3.getZ());

                                        //System.out.println(blockJigsawInfo.pos + " -> " + blockPos4);
                                        BlockBox box2;
                                        if(size1 == null){
                                            box2 = new BlockBox(blockPos4.getX(),blockPos4.getY(),blockPos4.getZ(),blockPos4.getX(),
                                                    blockPos4.getY(),blockPos4.getZ());
                                        }
                                        else {
                                            box2 = BlockBox.getBoundingBox(blockPos4, rotation1, BPos.ORIGIN, BlockMirror.NONE, size1);
                                        }
                                        int j1 = box2.minY;
                                        int k1 = blockPos3.getY();
                                        int l1 = y - k1 + blockJigsawInfo.getFront().getVector().getY();

                                        int i2 = minY + l1;

                                        int j2 = i2 - j1;
                                        BlockBox box3 = new BlockBox(box2.minX,box2.minY,box2.minZ,box2.maxX,box2.maxY,box2.maxZ);
                                        box3.move(0, j2, 0);
                                        BPos blockpos5 = blockPos4.add(0, j2, 0);

                                        if (isNotEmpty(mutableobject1,box3)) {
                                            mutableobject1.fullBoxes.add(new BlockBox(box3.minX,box3.minY,box3.minZ,
                                                    box3.maxX+1,box3.maxY+1,box3.maxZ+1));

                                            Piece piece2 = new Piece(jigsawpiece1,blockpos5,box3,rotation1,depth+1);
                                            this.pieces.add(piece2);

                                            if(depth+1<= this.maxDepth){
                                                piece2.setVoxelShape(mutableobject1);
                                                this.placing.add(piece2, placementPriority);
                                                // this.placing.add(var56, var30 aka placementPriority);
                                                // final SequencedPriorityIterator<JigsawPlacement.PieceState> placing = new SequencedPriorityIterator();

                                                //System.out.println("placed piece: " + piece2.getName());
                                                //System.out.println("this.placing.hasNext(): " + this.placing.hasNext());
                                            }
                                            continue label139;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        private boolean isNotEmpty(VoxelShape voxelShape, BlockBox box1) {
            if(box1.minX<voxelShape.getX().get(0) || box1.minY<voxelShape.getY().get(0) || box1.minZ<voxelShape.getZ().get(0)
                    || box1.maxX>=voxelShape.getLastX() || box1.maxY>=voxelShape.getLastY() || box1.maxZ>=voxelShape.getLastZ())
                return false;

            for (BlockBox fullBox: voxelShape.fullBoxes){
                if(intersects2(box1,fullBox)){
                    return false;
                }
            }
            return true;
        }

        public boolean intersects2(BlockBox box1, BlockBox box) {
            return box1.maxX >= box.minX && box1.minX < box.maxX && box1.maxZ >= box.minZ && box1.minZ < box.maxZ && box1.maxY >= box.minY && box1.minY < box.maxY;
        }
    }

    private static ArrayList<Integer> getShuffledTemplatesFromPool(List<Pair<Integer, Integer>> pool, JRand rand) {
        ArrayList<Integer> result = getTemplatesFromPool(pool);
        rand.shuffle(result);
        return result;
    }

    private static ArrayList<Integer> getTemplatesFromPool(List<Pair<Integer, Integer>> pool) {
        ArrayList<Integer> result = new ArrayList<>();

        for(Pair<Integer, Integer> template : pool) {
            for(int i = 0; i < template.getSecond(); i++) {
                result.add(template.getFirst());
            }
        }

        return result;
    }


    // -------------------------
    // SEEDFINDING UTILS
    // TODO
    // -------------------------

    public static int getDecorationSalt() {
        return 30004;
    }


    public List<BPos> getChestPositions() {
        ArrayList<BPos> result = new ArrayList<>();

        for (Piece p : this.pieces) {
            List<Pair<BPos, LootTable>> chests = TrialChambersStructureLoot.get(p.id);
            if (chests==null || chests.size() == 0)
                continue;

            for (Pair<BPos, LootTable> chest : chests) {
                BPos rotatedOffset = chest.getFirst().transform(BlockMirror.NONE, p.rotation, BPos.ORIGIN);
                BPos realChestPos = p.pos.add(rotatedOffset);
                result.add(realChestPos);
            }
        }
        return result;
    }


    public List<Pair<BPos, LootTable>> getChests() {
        ArrayList<Pair<BPos, LootTable>> result = new ArrayList<>();

        for (Piece p : this.pieces) {
            List<Pair<BPos, LootTable>> chests = TrialChambersStructureLoot.get(p.id);
            if (chests==null || chests.size() == 0)
                continue;

            for (Pair<BPos, LootTable> chest : chests) {
                BPos rotatedOffset = chest.getFirst().transform(BlockMirror.NONE, p.rotation, BPos.ORIGIN).add(new BPos(0,-1,0));
                BPos realChestPos = p.pos.add(rotatedOffset);
                result.add(new Pair<>(realChestPos, chest.getSecond()));
            }
        }

        return result;
    }

    public List<Triplet<BPos, LootTable, Long>> getChestsWithLootSeeds() {
        ArrayList<Triplet<BPos, LootTable, Long>> result = new ArrayList<>();
        HashMap<CPos, DecoratorRand> chunkRandoms = new HashMap<>();

        for (Piece p : this.pieces) {

            List<Pair<BPos, LootTable>> chests = TrialChambersStructureLoot.get(p.id);
            if (chests==null || chests.size() == 0)
                continue;

            for (Pair<BPos, LootTable> chest : chests) {
                BPos rotatedOffset = chest.getFirst().transform(BlockMirror.NONE, p.rotation, BPos.ORIGIN).add(new BPos(0,-1,0));
                BPos realChestPos = p.pos.add(rotatedOffset);
                CPos chestChunkPos = realChestPos.toChunkPos();

                if (!chunkRandoms.containsKey(chestChunkPos)) {
                    DecoratorRand rand = new DecoratorRand();
                    long popseed = rand.getPopulationSeed(this.worldseed, chestChunkPos.getX()<<4, chestChunkPos.getZ()<<4);
                    rand.setDecoratorSeed(popseed, getDecorationSalt());
                    chunkRandoms.put(chestChunkPos, rand);
                }

                long lootseed = chunkRandoms.get(chestChunkPos).nextLong();
                result.add(new Triplet<>(realChestPos, chest.getSecond(), lootseed));
            }
        }

        return result;
    }
}