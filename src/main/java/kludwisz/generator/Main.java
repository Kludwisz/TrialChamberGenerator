package kludwisz.generator;

import com.seedfinding.mccore.version.MCVersion;

import java.io.File;
import java.util.Scanner;

public class Main {
	private static final TrialChambers CHAMBERS = new TrialChambers(MCVersion.v1_20);
	
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("--input")) {
				String filepath = args[i + 1];
				Scanner reader = new Scanner(new File(filepath));
				long rangeStart = reader.nextLong();
				long rangeEnd = reader.nextLong();
				reader.close();

				PanoramaCracker.crack(rangeStart, rangeEnd);
			}
		}
	}

//	private static void test() {
//		TrialChambersGenerator gen = new TrialChambersGenerator();
//		genForRegion(gen, 2, 1);
//	}

//	private static void genForRegion(TrialChambersGenerator gen, int rx, int rz) {
//		final long worldseed = 123L;
//
//		ChunkRand rand = new ChunkRand();
//		CPos tc = CHAMBERS.getInRegion(worldseed, rx, rz, rand);
//		gen.generate(worldseed, tc.getX(), tc.getZ(), rand);
//		gen.printPieces();
//	}

//
//	// 30004 : index = 4, step = 3
//	// DONE
//	private static void findDecorationSalt() {
//		final long goodLootSeed = -6363922035146148698L;
//		final int cx = -181;
//		final int cz = 48;
//		DecoratorRand rand = new DecoratorRand();
//
//		for (int index = 0; index<20; index++) for (int step = 0; step<20; step++) {
//			int salt = 10000 * step + index;
//			long popseed = rand.getPopulationSeed(12345L, cx<<4, cz<<4);
//			rand.setDecoratorSeed(popseed, index, step);
//			if (rand.nextLong() == goodLootSeed) {
//				System.out.println(salt + " : index = " + index + ", step = " + step);
//			}
//		}
//	}
}
