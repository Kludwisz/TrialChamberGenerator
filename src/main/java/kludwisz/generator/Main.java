package kludwisz.generator;

import com.seedfinding.mccore.version.MCVersion;

import java.io.File;
import java.util.Scanner;

public class Main {
	private static final TrialChambers CHAMBERS = new TrialChambers(MCVersion.v1_20);
	
	public static void main(String[] args) throws Exception {
		//PanoramaCracker.test();
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