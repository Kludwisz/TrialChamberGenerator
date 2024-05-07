package kludwisz.generator;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		// PanoramaCracker.runAutomatedTests(1000); // no errors w/ strict matching
		// PanoramaCracker.runAutomatedTests(3000); // no errors w/ non-strict matching
		testGenerator(123L, 0, 0); // 7 / 7 perfectly matched trial chambers in-game, 24w18a
		// runMicroboincApp(args);
	}

	public static void runMicroboincApp(String[] args) throws Exception {
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

	public static void testGenerator(long seed, int rx, int rz) {
		TrialChambersGenerator gen = new TrialChambersGenerator();
		CPos pos = new TrialChambers(MCVersion.v1_20).getInRegion(seed, rx, rz, new ChunkRand());
		gen.generate(seed, pos.getX(), pos.getZ(), new ChunkRand());
		gen.printPieces();
	}
}
