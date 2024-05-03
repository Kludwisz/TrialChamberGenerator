package kludwisz.generator;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;

import java.util.HashMap;

public class PanoramaCracker {
    private static class DecorationData {
        public String piecename;
        public BPos pos;

        public DecorationData(String piecename, BPos pos) {
            this.piecename = piecename;
            this.pos = pos;
        }
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

    private static final DecorationData[] data = new DecorationData[] {
            new DecorationData("corridor/atrium/bogged_relief", new BPos(-12, -21, 7)),
            new DecorationData("corridor/atrium/breeze_relief", new BPos(-23, -21, -9)),
            new DecorationData("corridor/first_plate", new BPos(-7, -23, 8)),
            new DecorationData("corridor/straight_3", new BPos(-7, -22, 8)),
            new DecorationData("corridor/straight_4", new BPos(-2, -22, 8)),
            new DecorationData("decor/dead_bush_pot", new BPos(-6, -19, 6)),
            new DecorationData("decor/candle_3", new BPos(-5, -19, 6)),
            new DecorationData("decor/empty_pot", new BPos(-4, -19, 6)),
            new DecorationData("decor/barrel", new BPos(-1, -19, 6)),
            new DecorationData("decor/flow_pot", new BPos(-5, -21, 1)),
    };

    private static BPos BAD_PIECE_MARKER = new BPos(256, 256, 256);
    private static final DecorationData[] uniquePieceData = new DecorationData[] {
            new DecorationData("corridor/atrium_1", new BPos(-8, -23, -15)),
            new DecorationData("corridor/atrium/grand_staircase_3", new BPos(-19, -21, -7)),
            new DecorationData("intersection/intersection_1", new BPos(34, -23, -10)),

            new DecorationData("corridor/atrium/grand_staircase_1", BAD_PIECE_MARKER),
            new DecorationData("corridor/atrium/grand_staircase_2", BAD_PIECE_MARKER),
            new DecorationData("intersection/intersection_2", BAD_PIECE_MARKER),
            new DecorationData("intersection/intersection_3", BAD_PIECE_MARKER),
    };

    private static final HashMap<BPos, String> dataMap = new HashMap<>();
    private static final HashMap<String, BPos> uniquePieceMap = new HashMap<>();
    static {
        for (DecorationData d : data) {
            dataMap.put(d.pos, d.piecename);
        }
        for (DecorationData d : uniquePieceData) {
            uniquePieceMap.put(d.piecename, d.pos);
        }
    }

    // -------------------------------------------------------
    private static final int chunkX = 1;
    private static final int chunkZ = 2;
    private static final int startPieceY = -23;

    public static void crack(long rangeStart, long rangeEnd) {
        TrialChambers TC = new TrialChambers(MCVersion.v1_20);
        final ChunkRand rand = new ChunkRand();

        // region seed does 2 nextInt(22) calls
        // reverse the first one
        final long maxUpperBound = (long) Math.ceil((1L<<31) / 22.0);

        // measure time between each progress update
        // long startTime = System.currentTimeMillis();
        // final long updateProgressAfter = maxUpperBound / 100000;

        for (long n = rangeStart; n <= rangeEnd; n++) {
            long upper31 = (n * 22 + chunkX) << 31;
//            if (n % updateProgressAfter == 0) {
//                System.out.println("Progress: " + (n / updateProgressAfter) + " * 10ppm");
//                long endTime = System.currentTimeMillis();
//                System.out.println("Time elapsed: " + ((endTime - startTime) / 1000) + "s");
//            }

            //iterate over lower 17 bits
            for (long lower17 = 0; lower17 < (1L<<17); lower17++) {
                long internalSeed = upper31 | lower17;
                rand.setSeed(internalSeed, false);
                if (rand.nextInt(22) != chunkZ)
                    continue;

                // reverse region seed into structure seed
                rand.advance(-2);
                long structureSeed = rand.getSeed() - TC.getSalt();
                bruteForceStructureSeed(structureSeed, rand);
            }
        }
    }

    private static void bruteForceStructureSeed(long structureSeed, ChunkRand rand) {
        rand.setCarverSeed(structureSeed, chunkX, chunkZ, MCVersion.v1_20);
        int y = rand.nextInt(21) - 41;
        if (y != startPieceY)
            return;
        if (rand.nextInt(4) != 0) // rotation == NONE
            return;

        ModifiedTrialChambersGenerator trialChambersGenerator = new ModifiedTrialChambersGenerator();
        trialChambersGenerator.generate(structureSeed, chunkX, chunkZ, rand, dataMap, uniquePieceMap);
    }
}
