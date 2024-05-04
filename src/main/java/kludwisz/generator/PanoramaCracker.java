package kludwisz.generator;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcmath.util.Mth;
import com.seedfinding.mcseed.lcg.LCG;

import java.util.HashMap;

public class PanoramaCracker {
    private static class PieceData {
        public String piecename;
        public BPos pos;

        public PieceData(String piecename, BPos pos) {
            this.piecename = piecename;
            this.pos = pos;
        }
    }

    private static HashMap<BPos, String> createPieceMap(PieceData[] data) {
        HashMap<BPos, String> map = new HashMap<>();
        for (PieceData d : data) {
            map.put(d.pos, d.piecename);
        }
        return map;
    }

    private static HashMap<String, BPos> createUniquePieceMap(PieceData[] data) {
        HashMap<String, BPos> map = new HashMap<>();
        for (PieceData d : data) {
            map.put(d.piecename, d.pos);
        }
        return map;
    }

    /*
    /place template minecraft:trial_chambers/corridor/atrium_1 -8 -23 -15 clockwise_90 (1 of 1 possible)
    /place template minecraft:trial_chambers/corridor/atrium/bogged_relief -12 -21 7 clockwise_90 (1 of 4 possible)
    /place template minecraft:trial_chambers/corridor/atrium/breeze_relief -23 -21 -9 counterclockwise_90  (1 of 4 possible)
    /place template minecraft:trial_chambers/corridor/atrium/grand_staircase_3 -19 -21 -7 clockwise_90 (1 of 3 possible)
    /place template minecraft:trial_chambers/reward/ominous_vault -26 -9 -2 clockwise_90 (1 of 1 possible)
    /place template minecraft:trial_chambers/corridor/entrance_1 -47 -16 8 counterclockwise_90 (1 of 1 possible)
    /place template minecraft:trial_chambers/corridor/first_plate -7 -23 8 counterclockwise_90 (1 of 1 possible i think)
    /place template minecraft:trial_chambers/corridor/straight_3 -7 -22 8 counterclockwise_90 (1 of 8 possible)
    /place template minecraft:trial_chambers/corridor/straight_4 -2 -22 8 counterclockwise_90 (1 of 8 possible)
    /place template minecraft:trial_chambers/decor/dead_bush_pot -6 -19 6 (1 of 11 possible + empty) unknown rotation
    /place template minecraft:trial_chambers/decor/candle_3 -5 -19 6 counterclockwise_90 (1 of 11 possible + empty)
    /place template minecraft:trial_chambers/decor/empty_pot -4 -19 6 (1 of 11 possible + empty) unknown rotation
    /place template minecraft:trial_chambers/decor/barrel -1 -19 6 (1 of 11 possible + empty) unknown rotation
    /place template minecraft:trial_chambers/decor/flow_pot -5 -21 1 clockwise_90 (1 of 11 possible + empty) might be one of the other 2 pot designs

    /place template minecraft:trial_chambers/intersection/intersection_1 34 -23 -10 clockwise_90
    /place template minecraft:trial_chambers/corridor/second_plate 16 -23 12 none
    /place template minecraft:trial_chambers/corridor/[end_1|end_2] 16 -23 32 none
     */

    private static final PieceData[] pieceData = new PieceData[] {
            new PieceData("corridor/atrium/bogged_relief", new BPos(-12, -21, 7)),
            new PieceData("corridor/atrium/breeze_relief", new BPos(-23, -21, -9)),
            new PieceData("corridor/first_plate", new BPos(-7, -23, 8)),
            new PieceData("corridor/straight_3", new BPos(-7, -22, 8)),
            new PieceData("corridor/straight_4", new BPos(-2, -22, 8)),
            new PieceData("decor/dead_bush_pot", new BPos(-6, -19, 6)),
            new PieceData("decor/candle_3", new BPos(-5, -19, 6)),
            new PieceData("decor/empty_pot", new BPos(-4, -19, 6)),
            new PieceData("decor/barrel", new BPos(-1, -19, 6)),
            new PieceData("decor/flow_pot", new BPos(-5, -21, 1)),
    };

    private static final BPos BAD_PIECE_MARKER = new BPos(256, 256, 256);
    private static final PieceData[] uniquePieceData = new PieceData[] {
            new PieceData("corridor/atrium_1", new BPos(-8, -23, -15)),
            new PieceData("corridor/atrium/grand_staircase_3", new BPos(-19, -21, -7)),
            new PieceData("intersection/intersection_1", new BPos(34, -23, -10)),

            new PieceData("corridor/atrium/grand_staircase_1", BAD_PIECE_MARKER),
            new PieceData("corridor/atrium/grand_staircase_2", BAD_PIECE_MARKER),
            new PieceData("intersection/intersection_2", BAD_PIECE_MARKER),
            new PieceData("intersection/intersection_3", BAD_PIECE_MARKER),
    };

    // -------------------------------------------------------

    private static final int chunkX = 1;
    private static final int chunkZ = 2;
    private static final int startPieceY = -23;
    private static final int startPieceRotation = BlockRotation.NONE.ordinal();
    private static final int targetMatches = 13;
    private static final HashMap<BPos, String> pieceMap = createPieceMap(pieceData);
    private static final HashMap<String, BPos> uniquePieceMap = createUniquePieceMap(uniquePieceData);

    public static void crack(long rangeStart, long rangeEnd) {
        final TrialChambers TC = new TrialChambers(MCVersion.v1_20);
        final ChunkRand rand = new ChunkRand();

        for (long n = rangeStart; n <= rangeEnd; n++) {
            long upper31 = (n * 22 + chunkX) << 17;

            //iterate over lower 17 bits
            for (long lower17 = 0; lower17 < (1L<<17); lower17++) {
                long internalSeed = upper31 | lower17;
                rand.setSeed(internalSeed, false);
                if (rand.nextInt(22) != chunkZ)
                    continue;

                // reverse region seed into structure seed
                rand.advance(-2);
                long structureSeed = (rand.getSeed() ^ LCG.JAVA.multiplier) - TC.getSalt();

                // check basic carver seed conditions
                rand.setCarverSeed(structureSeed, chunkX, chunkZ, MCVersion.v1_20);
                int y = rand.nextInt(21) - 41;
                if (y != startPieceY)
                    continue;
                int rot = rand.nextInt(4);
                if (rot != startPieceRotation)
                    continue;

                // bruteforce structure seed - generate trial chambers
                ModifiedTrialChambersGenerator trialChambersGenerator = new ModifiedTrialChambersGenerator(targetMatches);
                trialChambersGenerator.generate(structureSeed, chunkX, chunkZ, rand, pieceMap, uniquePieceMap);
            }
        }
    }

    // -------------------------------------------------------
    // cracker testing
    // -------------------------------------------------------

    @SuppressWarnings("unused")
    public static void test() {
        PieceData[] testData = new PieceData[] {
                new PieceData("decor/undecorated_pot", new BPos(148, -35, 312)),
                new PieceData("decor/undecorated_pot", new BPos(148, -35, 310)),
                new PieceData("decor/candle_4", new BPos(153, -33, 311)),
                new PieceData("decor/barrel", new BPos(153, -33, 306)),
                new PieceData("decor/flow_pot", new BPos(139, -28, 302)),
                new PieceData("decor/empty_pot", new BPos(144, -35, 311)),
                new PieceData("decor/undecorated_pot", new BPos(144, -35, 310)),
        };
        PieceData[] testUniqueData = new PieceData[] {
                new PieceData("corridor/atrium/grand_staircase_1", new BPos(140, -35, 325)),
                new PieceData("intersection/intersection_2", new BPos(133, -37, 272)),
        };

        HashMap<BPos, String> testDataMap = createPieceMap(testData);
        HashMap<String, BPos> testUniquePieceMap = createUniquePieceMap(testUniqueData);
        int targetMatchesTest = 9;

        ChunkRand rand = new ChunkRand();
        new TrialChambers(MCVersion.v1_20).getInRegion(10000L, 0, 0, rand);
        System.out.println(rand.getSeed());
        rand.advance(-2);
        long struct = (rand.getSeed() ^ LCG.JAVA.multiplier) - new TrialChambers(MCVersion.v1_20).getSalt();
        System.out.println(struct);

        ModifiedTrialChambersGenerator gen1 = new ModifiedTrialChambersGenerator(targetMatchesTest);
        gen1.generate(10000L, 7, 17, new ChunkRand(), testDataMap, testUniquePieceMap);
    }

    @SuppressWarnings("unused")
    public static void fullTest() {
        final long targetWorldseed = 1928990802296633470L;
        final long targetStructureSeed = targetWorldseed & Mth.MASK_48;

        final TrialChambers TC = new TrialChambers(MCVersion.v1_20);
        final ChunkRand rand = new ChunkRand();

        final int chunkXTest = 9;
        final int chunkZTest = 9;
        final int startPieceYTest = -29;
        final int startPieceRotationTest = BlockRotation.NONE.ordinal();
        final int targetMatchesTest = 12;

        // -------------------------------------------------------

        final PieceData[] testPieces = new PieceData[] {
                new PieceData("decor/flow_pot", new BPos(160, -25, 141)),
                new PieceData("decor/undecorated_pot", new BPos(151, -27, 142)),
                new PieceData("decor/empty_pot", new BPos(157, -25, 133)),
                new PieceData("decor/candle_4", new BPos(167, -20, 112)),
                new PieceData("decor/barrel", new BPos(173, -27, 108)),
                new PieceData("corridor/straight_8", new BPos(170, -28, 101)),
                new PieceData("corridor/straight_4", new BPos(185, -28, 101))
        };

        final PieceData[] testUniquePieces = new PieceData[] {
                new PieceData("intersection/intersection_2", new BPos(144, -29, 123)),
                new PieceData("corridor/atrium/grand_staircase_2", new BPos(197, -27, 116)),
                new PieceData("corridor/atrium_1", new BPos(186, -29, 124)),
                new PieceData("corridor/first_plate", new BPos(185, -29, 101)),
                new PieceData("corridor/second_plate", new BPos(144, -29, 124)),

                new PieceData("corridor/atrium/grand_staircase_1", BAD_PIECE_MARKER),
                new PieceData("corridor/atrium/grand_staircase_3", BAD_PIECE_MARKER),
                new PieceData("intersection/intersection_1", BAD_PIECE_MARKER),
                new PieceData("intersection/intersection_3", BAD_PIECE_MARKER),
        };

        final HashMap<BPos, String> pieceMapTest = createPieceMap(testPieces);
        final HashMap<String, BPos> uniquePieceMapTest = createUniquePieceMap(testUniquePieces);

        // -------------------------------------------------------
        rand.setRegionSeed(targetWorldseed, 0, 0, TC.getSalt(), MCVersion.v1_20);
        int cx = rand.nextInt(22);
        System.out.println("chunk x = " + cx + " with iseed " + rand.getSeed());
        long iseed = rand.getSeed();
        long randUp31 = rand.getSeed() >> 17;
        long randLow17 = rand.getSeed() & Mth.getMask(17);
        System.out.println("upper 31 = " + randUp31 + "  mod 22 = " + (randUp31 % 22));
        System.out.println("upper 17 = " + randLow17);
        long targetN = (randUp31 - cx) / 22;

        for (long n = targetN-100; n <= targetN+100; n++) {
            long upper31 = (n * 22L + chunkXTest) << 17;
            if (upper31 == randUp31) {
                System.out.println("good upper 31: " + upper31);
            }

            //iterate over lower 17 bits
            for (long lower17 = 0; lower17 < (1L<<17); lower17++) {
                if (upper31 == randUp31 && lower17 == randLow17) {
                    System.out.println("good lower 17: " + lower17);
                }
                long internalSeed = upper31 | lower17;
                if (iseed == internalSeed) {
                    System.out.println("good internal seed: " + internalSeed);
                }
                rand.setSeed(internalSeed, false);
                if (rand.nextInt(22) != chunkZTest)
                    continue;

                // reverse region seed into structure seed
                rand.advance(-2);
                long structureSeed = (rand.getSeed() ^ LCG.JAVA.multiplier) - TC.getSalt();
                if (structureSeed == targetStructureSeed) {
                    System.out.println("Passed first phase: " + structureSeed);
                }

                // check basic carver seed conditions
                rand.setCarverSeed(structureSeed, chunkXTest, chunkZTest, MCVersion.v1_20);
                int y = rand.nextInt(21) - 41;
                if (y != startPieceYTest)
                    continue;
                if (rand.nextInt(4) != 0)
                    continue;

                if (structureSeed == targetStructureSeed) {
                    System.out.println("Passed second phase: " + structureSeed);
                }

                // bruteforce structure seed - generate trial chambers
                ModifiedTrialChambersGenerator trialChambersGenerator = new ModifiedTrialChambersGenerator(targetMatchesTest);
                trialChambersGenerator.generate(structureSeed, chunkXTest, chunkZTest, rand, pieceMapTest, uniquePieceMapTest);
            }
        }
    }
}
