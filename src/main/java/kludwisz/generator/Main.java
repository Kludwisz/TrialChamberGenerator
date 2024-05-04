package kludwisz.generator;

import com.seedfinding.mccore.rand.ChunkRand;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		// PanoramaCracker.test();
		// PanoramaCracker.fullTest();
		TrialChambersGenerator tcg = new TrialChambersGenerator();
		tcg.generate(123L, 14, 11, new ChunkRand());
		tcg.printPieces();
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
}
