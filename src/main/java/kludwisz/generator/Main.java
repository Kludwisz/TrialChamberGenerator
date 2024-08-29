package kludwisz.generator;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.structure.DesertPyramid;
import com.seedfinding.mcseed.lcg.LCG;
import kludwisz.generator.seedcracking.Panorama;
import kludwisz.generator.seedcracking.Requirements;
import kludwisz.generator.seedcracking.TrialChambersCracker;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		// processResults();
		// testGenerator(15732852718635233L, 0, 0); // 7 / 7 perfectly matched trial chambers in-game, 24w18a
		// testGenerator(262871859801710L, 0, 0);
		// testSpeed();
		// Panorama.mainTask(0, 1000);
		// Panorama.runAutomatedTests(100); // cleared

		// carver for 1.20.6 AOK
		// Panorama.runAutomatedCarverTests(1000);
		// Panorama.genManualCarverTestData(10);

		// carver for 24w18a AOK
		// Panorama.runAutomatedCarverTests(1000);
		// Panorama.genManualCarverTestData(10);

		// CURRENT VERSION: 24w18a
		runMicroboincApp(args);
	}

	public static void runMicroboincApp(String[] args) throws Exception {
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("--input")) {
				String filepath = args[i + 1];
				Scanner reader = new Scanner(new File(filepath));
				long rangeStart = reader.nextLong();
				long rangeEnd = reader.nextLong();
				reader.close();

				Panorama.carverBruteforce(rangeStart, rangeEnd);
			}
		}
	}

	public static void testGenerator(long seed, int rx, int rz) {
		TrialChambersGenerator gen = new TrialChambersGenerator();
		CPos pos = new TrialChambers(MCVersion.v1_20).getInRegion(seed, rx, rz, new ChunkRand());
		gen.generate(seed, pos.getX(), pos.getZ(), new ChunkRand());
		gen.printPieces();
	}

	public static void testSpeed() {
		long start = System.currentTimeMillis();
		ChunkRand rand = new ChunkRand();
		long dist = 0;
		long maxDist = 0, minDist = Long.MAX_VALUE;

		for (long seed = 1L; seed <= 10000L; seed++) {
			TrialChambersGenerator gen = new TrialChambersGenerator();
			CPos pos = new TrialChambers(MCVersion.v1_20).getInRegion(seed, 0, 0, new ChunkRand());
			rand.setCarverSeed(seed, pos.getX(), pos.getZ(), MCVersion.v1_20);
			long seed0 = rand.getSeed();
			gen.generate(seed, pos.getX(), pos.getZ(), rand);
			long seed1 = rand.getSeed();
			dist += LCG.JAVA.distance(seed0, seed1);
			maxDist = Math.max(maxDist, LCG.JAVA.distance(seed0, seed1));
			minDist = Math.min(minDist, LCG.JAVA.distance(seed0, seed1));
		}

		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start) + "ms");
		System.out.println("Min rand calls: " + minDist);
		System.out.println("Max rand calls: " + maxDist);
		System.out.println("Average rand calls: " + (dist/10000));
	}

	public static void processResults() {
		String filepath = "C:\\Users\\kludw\\source\\seedfinding\\pano121res.txt";
		Requirements reqs = Panorama.getPanoRequirements();

		ArrayList<Pair<Long, Double>> results = new ArrayList<>();

		try {
			Scanner fin = new Scanner(new File(filepath));

			while (fin.hasNextLong()) {
				long seed = fin.nextLong();
				TrialChambersCracker qualityTester = new TrialChambersCracker(reqs);
				qualityTester.generate(seed, reqs.chunkX, reqs.chunkZ, new ChunkRand());
				results.add(new Pair<>(seed, qualityTester.quality));
			}
			fin.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		// sort by quality (descending)
		results.sort((a, b) -> Double.compare(b.getSecond(), a.getSecond()));

		// print the sorted results and their qualities to a file
		try {
			String outpath = "C:\\Users\\kludw\\source\\seedfinding\\pano121res_sorted.txt";
			FileWriter fout = new FileWriter(outpath);
			for (Pair<Long, Double> result : results) {
				int roundedQuality = (int)Math.round(result.getSecond());
				fout.write(roundedQuality + ":   " + result.getFirst() + "\n");
			}
			fout.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
