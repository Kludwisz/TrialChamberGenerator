package kludwisz.generator;

import com.seedfinding.mccore.rand.ChunkRand;
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
    /place template minecraft:trial_chambers/corridor/atrium_1 30 -29 -27 clockwise_90 (1 of 1 possible)
/place template minecraft:trial_chambers/corridor/atrium/bogged_relief 26 -27 -5 clockwise_90 (1 of 4 possible)
/place template minecraft:trial_chambers/corridor/atrium/breeze_relief 15 -27 -21 counterclockwise_90  (1 of 4 possible)
/place template minecraft:trial_chambers/corridor/atrium/grand_staircase_3 19 -27 -19 clockwise_90 (1 of 3 possible)
/place template minecraft:trial_chambers/reward/ominous_vault 12 -15 -14 clockwise_90 (1 of 1 possible)
/place template minecraft:trial_chambers/corridor/entrance_1 -9 -22 -4 counterclockwise_90 (1 of 1 possible)
/place template minecraft:trial_chambers/corridor/first_plate 31 -29 -4 counterclockwise_90 (1 of 1 possible i think)
/place template minecraft:trial_chambers/corridor/straight_3 31 -28 -4 counterclockwise_90 (1 of 8 possible)
/place template minecraft:trial_chambers/corridor/straight_4 36 -28 -4 counterclockwise_90 (1 of 8 possible)
/place template minecraft:trial_chambers/decor/dead_bush_pot 32 -25 -6 (1 of 11 possible + empty) unknown rotation
/place template minecraft:trial_chambers/decor/candle_3 33 -25 -6 counterclockwise_90 (1 of 11 possible + empty)
/place template minecraft:trial_chambers/decor/empty_pot 34 -25 -6 (1 of 11 possible + empty) unknown rotation
/place template minecraft:trial_chambers/decor/barrel 37 -25 -6 (1 of 11 possible + empty) unknown rotation
/place template minecraft:trial_chambers/decor/flow_pot 33 -27 -11 clockwise_90 (1 of 11 possible + empty) might be one of the other 2 pot designs
     */

    private static final BPos OFFSET = new BPos(-38, 6, 12);

    private static final DecorationData[] data = new DecorationData[] {
//            new DecorationData("corridor/atrium_1", new BPos(30, -29, -27).add(OFFSET)),      // unique
            new DecorationData("corridor/atrium/bogged_relief", new BPos(26, -27, -5).add(OFFSET)),
            new DecorationData("corridor/atrium/breeze_relief", new BPos(15, -27, -21).add(OFFSET)),
//            new DecorationData("corridor/atrium/grand_staircase_3", new BPos(19, -27, -19).add(OFFSET)),  // unique
//            new DecorationData("reward/ominous_vault", new BPos(12, -15, -14).add(OFFSET)),   // guaranteed
//            new DecorationData("corridor/entrance_1", new BPos(-9, -22, -4).add(OFFSET)),     // guaranteed
            new DecorationData("corridor/first_plate", new BPos(31, -29, -4).add(OFFSET)),
            new DecorationData("corridor/straight_3", new BPos(31, -28, -4).add(OFFSET)),
            new DecorationData("corridor/straight_4", new BPos(36, -28, -4).add(OFFSET)),
            new DecorationData("decor/dead_bush_pot", new BPos(32, -25, -6).add(OFFSET)),
            new DecorationData("decor/candle_3", new BPos(33, -25, -6).add(OFFSET)),
            new DecorationData("decor/empty_pot", new BPos(34, -25, -6).add(OFFSET)),
            new DecorationData("decor/barrel", new BPos(37, -25, -6).add(OFFSET)),
            new DecorationData("decor/flow_pot", new BPos(33, -27, -11).add(OFFSET)),
            new DecorationData("decor/undecorated_pot", new BPos(32, -27, -15).add(OFFSET)),
            new DecorationData("decor/undecorated_pot", new BPos(34, -25, -20).add(OFFSET)),
            new DecorationData("decor/barrel", new BPos(37, -27, -11).add(OFFSET))
    };

    private static final DecorationData[] uniquePieces = new DecorationData[] {
            new DecorationData("corridor/atrium_1", new BPos(30, -29, -27).add(OFFSET)),
            new DecorationData("corridor/first_plate", new BPos(31, -29, -4).add(OFFSET)),
            new DecorationData("corridor/atrium/grand_staircase_3", new BPos(19, -27, -19).add(OFFSET))
    };

    private static final HashMap<BPos, String> dataMap = new HashMap<>();
    private static final HashMap<String, BPos> uniqueMap = new HashMap<>();
    static {
        for (DecorationData d : data) {
            dataMap.put(d.pos, d.piecename);
        }
        for (DecorationData d : uniquePieces) {
            uniqueMap.put(d.piecename, d.pos);
        }
    }

    private static final int chunkX = 1;
    private static final int chunkZ = 2;
    private static final int startPieceY = -23;
    public static void crack() {
        TrialChambers TC = new TrialChambers(MCVersion.v1_20);
        final ChunkRand rand = new ChunkRand();

        // region seed does 2 nextInt(22) calls
        // reverse the first one
        final long maxUpperBound = (long) Math.ceil((1L<<31) / 22.0);
        final long updateProgressAfter = maxUpperBound / 100000;

        // measure time between each progress update
        long startTime = System.currentTimeMillis();

        for (long n = 0; n <= maxUpperBound; n++) {
            long upper31 = (n * 22 + chunkX) << 31;
            if (n % updateProgressAfter == 0) {
                System.out.println("Progress: " + (n / updateProgressAfter) + " * 10ppm");
                long endTime = System.currentTimeMillis();
                System.out.println("Time elapsed: " + ((endTime - startTime) / 1000) + "s");
            }

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
        trialChambersGenerator.generate(structureSeed, chunkX, chunkZ, rand, dataMap, uniqueMap);
    }
}
