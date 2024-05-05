package kludwisz.generator;

import com.seedfinding.mccore.rand.ChunkRand;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		// PanoramaCracker.runAutomatedTests(1000); // no errors w/ strict matching
		// PanoramaCracker.runAutomatedTests(3000); // no errors w/ non-strict matching
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

				PanoramaCracker.crack(rangeStart, rangeEnd);
			}
		}
	}
}
