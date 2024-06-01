package kludwisz.generator;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcmath.util.Mth;
import com.seedfinding.mcseed.lcg.LCG;

import java.util.List;

public class Panorama {
    public static void crack(long rangeStart, long rangeEnd, TrialChambersCracker.Requirements reqs) {
        final TrialChambers TC = new TrialChambers(MCVersion.v1_20);
        final ChunkRand rand = new ChunkRand();
        final TrialChambersCracker cracker = new TrialChambersCracker(reqs);

        for (long n = rangeStart; n <= rangeEnd; n++) {
            long upper31 = (n * 22L + reqs.chunkX) << 17;

            //iterate over lower 17 bits
            for (int lower17 = 0; lower17 < (1<<17); lower17++) {
                long internalSeed = upper31 | lower17;

                // nextInt(22)
                internalSeed = (internalSeed * LCG.JAVA.multiplier + LCG.JAVA.addend) & Mth.MASK_48;
                int value = (int)(internalSeed >>> 17) % 22;

                if (value != reqs.chunkZ)
                    continue;

                // reverse region seed into structure seed
                internalSeed = (internalSeed * 254681119335897L + 120305458776662L) & Mth.MASK_48; // advance(-2)
                long structureSeed = (internalSeed ^ LCG.JAVA.multiplier) - TC.getSalt();

//                rand.setSeed(internalSeed, false);
//                if (rand.nextInt(22) != reqs.chunkZ)
//                    continue;
//
//                // reverse region seed into structure seed
//                rand.advance(-2);
//                long structureSeed = (rand.getSeed() ^ LCG.JAVA.multiplier) - TC.getSalt();

                // bruteforce structure seed - generate trial chambers
                if (cracker.generate(structureSeed, reqs.chunkX, reqs.chunkZ, rand)) {
                    System.out.println(structureSeed);
                }
            }
        }
    }

    public static void mainTask(long rangeStart, long rangeEnd) {
        TrialChambersCracker.Requirements reqs = new TrialChambersCracker.Requirements(1, 2, -23, BlockRotation.NONE.ordinal());

        // banned pieces
        reqs.addBannedPiece("corridor/atrium/grand_staircase_1");
        reqs.addBannedPiece("corridor/atrium/grand_staircase_2");
        reqs.addBannedPiece("intersection/intersection_2");
        reqs.addBannedPiece("intersection/intersection_3");

        // unique pieces
        reqs.addUniquePiece("corridor/first_plate", new BPos(-7, -23, 8));                  // OK!
        reqs.addUniquePiece("corridor/second_plate", new BPos(16, -23, 12));                // OK!
        reqs.addUniquePiece("intersection/intersection_1", new BPos(34, -23, -10));         // OK!
        reqs.addUniquePiece("corridor/atrium/grand_staircase_3", new BPos(-19, -21, -7));   // OK!

        // certain pieces
        reqs.addCertainPiece("corridor/atrium/breeze_relief", new BPos(-23, -21, -9));      // OK!
        reqs.addCertainPiece("corridor/atrium/bogged_relief", new BPos(-12, -21, 7));       // OK!
        reqs.addCertainPiece("decor/candle_3", new BPos(-5, -19, 6));                       // OK!

        reqs.addCertainPiece("corridor/straight_3", new BPos(-7, -22, 8));                  // OK!
        reqs.addCertainPiece("corridor/straight_4", new BPos(-2, -22, 8));                  // OK!
        reqs.addCertainPiece("decor/dead_bush_pot", new BPos(-6, -19, 6));                  // OK!
        reqs.addCertainPiece("decor/barrel", new BPos(-1, -19, 6));                         // OK!
        reqs.addCertainPiece("decor/undecorated_pot", new BPos(-6, -21, -3));               // OK!
        reqs.addCertainPiece("_pot", new BPos(-4, -19, 6));                                 // OK!
        reqs.addCertainPiece("_pot", new BPos(-5, -21, 1));                                 // OK!

        reqs.addUncertainPiece("decor/barrel", new BPos(-1, -21, 1)); // certain, but not found
        reqs.addUncertainPiece("decor/undecorated_pot", new BPos(-4, -19, -8)); // certain, but not found
        reqs.addUncertainPiece("_pot", new BPos(5, -21, 1)); // far
        reqs.addUncertainPiece("_pot", new BPos(11, -21, 1)); // far

        crack(rangeStart, rangeEnd, reqs);
    }

    @SuppressWarnings("unused")
    public static void runAutomatedTests(int scale) {
        TrialChambers TC = new TrialChambers(MCVersion.v1_20);
        ChunkRand rand = new ChunkRand();

        for (int i = 0; i < scale; i++) {
            // create the basic test data
            rand.setSeed(i, false);
            long worldseed = rand.nextLong();
            long structseed = worldseed & Mth.MASK_48;

            rand.setRegionSeed(structseed, 0, 0, TC.getSalt(), MCVersion.v1_20);

            long seed0 = rand.getSeed();

            int chunkXTest = rand.nextInt(22);
            long randUp31 = rand.getSeed() >> 17;
            long randLow17 = rand.getSeed() & Mth.getMask(17);
            int chunkZTest = rand.nextInt(22);

            int advanceCount = 0;
            while (rand.getSeed() != seed0) {
                rand.advance(-1);
                advanceCount++;
            }

            if (advanceCount != 2) // 2 in 97 000 000 chance
                continue;

            rand.setCarverSeed(structseed, chunkXTest, chunkZTest, MCVersion.v1_20);
            int startPieceYTest = rand.nextInt(21) - 41;
            int rotTest = rand.nextInt(4);

            TrialChambersCracker.Requirements pieces = new TrialChambersCracker.Requirements(chunkXTest, chunkZTest, startPieceYTest, rotTest);
            createStructureData(structseed, chunkXTest, chunkZTest, pieces, rand);

            for (long n = 0; n <= (long)Math.ceil((1L<<31) / 22.0); n++) {
                long upper31 = (n * 22L + chunkXTest) << 17;
                if ((upper31>>17) != randUp31)
                    continue;

                //iterate over lower 17 bits
                for (int lower17 = 0; lower17 < (1<<17); lower17++) {
                    if (lower17 != (int)randLow17)
                        continue;
                    long internalSeed = upper31 | lower17;

//                    rand.setSeed(internalSeed, false);
//                    if (rand.nextInt(22) != chunkZTest)
//                        continue;
//
//                    // reverse region seed into structure seed
//                    rand.advance(-2);
//                    long structureSeed = (rand.getSeed() ^ LCG.JAVA.multiplier) - TC.getSalt();

                    // nextInt(22)
                    internalSeed = (internalSeed * LCG.JAVA.multiplier + LCG.JAVA.addend) & Mth.MASK_48;
                    int value = (int)(internalSeed >>> 17) % 22;

                    if (value != chunkZTest)
                        continue;

                    // reverse region seed into structure seed
                    internalSeed = (internalSeed * 254681119335897L + 120305458776662L) & Mth.MASK_48; // advance(-2)
                    long structureSeed = (internalSeed ^ LCG.JAVA.multiplier) - TC.getSalt();

                    if (structureSeed != structseed) {
                        System.out.println("Failed test case: " + structureSeed);
                        return;
                    }
                    System.out.println("(" + i + ")  Good structure seed: " + structureSeed);

                    // check basic carver seed conditions
                    rand.setCarverSeed(structureSeed, chunkXTest, chunkZTest, MCVersion.v1_20);
                    int y = rand.nextInt(21) - 41;
                    if (y != startPieceYTest) {
                        System.out.println("Failed test case: " + structureSeed + " bad y: " + y + " " + startPieceYTest);
                        return;
                    }
                    if (rand.nextInt(4) != rotTest) {
                        System.out.println("Failed test case: " + structureSeed + " bad rot: " + rotTest);
                        return;
                    }
                    System.out.println("(" + i + ")  Good y and rotation: " + structureSeed);

                    // bruteforce structure seed - generate trial chambers
                    TrialChambersCracker trialChambersGenerator = new TrialChambersCracker(pieces);
                    boolean result = trialChambersGenerator.generate(structureSeed, chunkXTest, chunkZTest, rand);
                    if (!result) {
                        System.out.println("Failed test case: " + structureSeed + " bad generation");
                        return;
                    }
                    System.out.println("(" + i + ")  Good generation: " + structureSeed);
                }
            }
        }
    }

    @SuppressWarnings("unused")
    private static void createStructureData(long structseed, int cx, int cz, TrialChambersCracker.Requirements dataSet, ChunkRand rand) {
        TrialChambersGenerator tcg = new TrialChambersGenerator();
        tcg.generate(structseed, cx, cz, rand);

        // create unique piece data
        for (TrialChambersGenerator.Piece piece : tcg.getPieces()) {
            if (piece.getName().contains("corridor/atrium/grand_staircase_")) {
                dataSet.addUniquePiece(piece.getName(), piece.pos.toImmutable());

                if (!piece.getName().contains("1"))
                    dataSet.addBannedPiece("corridor/atrium/grand_staircase_1");
                if (!piece.getName().contains("2"))
                    dataSet.addBannedPiece("corridor/atrium/grand_staircase_2");
                if (!piece.getName().contains("3"))
                    dataSet.addBannedPiece("corridor/atrium/grand_staircase_3");
            }
            else if (piece.getName().contains("intersection/intersection_")) {
                dataSet.addUniquePiece(piece.getName(), piece.pos.toImmutable());

                if (!piece.getName().contains("1"))
                    dataSet.addBannedPiece("intersection/intersection_1");
                if (!piece.getName().contains("2"))
                    dataSet.addBannedPiece("intersection/intersection_2");
                if (!piece.getName().contains("3"))
                    dataSet.addBannedPiece("intersection/intersection_3");
            }
            else if (piece.getName().equals("corridor/atrium_1")) {
                dataSet.addUniquePiece(piece.getName(), piece.pos.toImmutable());
            }
            else if (piece.getName().equals("corridor/first_plate")) {
                dataSet.addUniquePiece(piece.getName(), piece.pos.toImmutable());
            }
        }

        // select other, random pieces from the generator and add them to the list
        List<TrialChambersGenerator.Piece> shuffledPieces = tcg.getPieces();
        rand.shuffle(shuffledPieces);
        int threshold = rand.nextInt(6) + 10;

        for (TrialChambersGenerator.Piece piece : shuffledPieces) {
            if (    piece.getName().contains("corridor/atrium/grand_staircase_")
                    || piece.getName().contains("intersection/intersection_")
                    || piece.getName().equals("corridor/atrium_1")
                    || piece.getName().equals("corridor/first_plate")
                    || piece.getName().contains("corridor/end_")
            )
                continue;

            dataSet.addUncertainPiece(piece.getName(), piece.pos.toImmutable());
            threshold--;
            if (threshold <= 0)
                break;
        }
    }
}
