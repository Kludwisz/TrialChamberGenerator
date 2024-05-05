package kludwisz.generator;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		// PanoramaCracker.test();
		// PanoramaCracker.fullTest();
		// runMicroboincApp(args);
		// PanoramaCracker.runAutomatedTests(1000);
	}

	public static void runMicroboincApp(String[] args) throws Exception {
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("--input")) {
				String filepath = args[i + 1];
				Scanner reader = new Scanner(new File(filepath));
				long rangeStart = reader.nextLong();
				long rangeEnd = reader.nextLong();
				reader.close();

				PanoramaCracker.runMainTask(rangeStart, rangeEnd);
			}
		}
	}
}
