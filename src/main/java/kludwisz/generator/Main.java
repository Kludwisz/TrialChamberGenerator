package kludwisz.generator;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcseed.lcg.LCG;
import kludwisz.chambers.jigsaws.TrialChambersJigsawBlocks;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		// PanoramaCracker.runAutomatedTests(1000); // no errors w/ strict matching
		// PanoramaCracker.runAutomatedTests(3000); // no errors w/ non-strict matching
		// testGenerator(123L, 0, 3); // 7 / 7 perfectly matched trial chambers in-game, 24w18a
		// runMicroboincApp(args);
		// testGenerator(123L, 0, 0);
		testSpeed();
	}

	public static void testGenerator(long seed, int rx, int rz) {
		TrialChambersGenerator gen = new TrialChambersGenerator();
		CPos pos = new TrialChambers(MCVersion.v1_20).getInRegion(seed, rx, rz, new ChunkRand());
		gen.generate(seed, pos.getX(), pos.getZ(), new ChunkRand());
		gen.printPieces();
	}

	public static void testSpeed() {
		long start = System.currentTimeMillis();

		for (long seed = 1L; seed <= 10000L; seed++) {
			TrialChambersGenerator gen = new TrialChambersGenerator();
			CPos pos = new TrialChambers(MCVersion.v1_20).getInRegion(seed, 0, 0, new ChunkRand());
			gen.generate(seed, pos.getX(), pos.getZ(), new ChunkRand());
		}

		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start) + "ms");
	}
}
