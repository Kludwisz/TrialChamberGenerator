package kludwisz.util;

import com.seedfinding.mcmath.util.Mth;
import com.seedfinding.mcseed.lcg.LCG;

public class SplitLCGTest {
	public static void run() {
		long seed = 1578124521111223221L & Mth.MASK_48;
		
		long top31 = seed >> 17;
		long bottom17 = seed & Mth.getMask(17);
		
		
		for (int i=0; i<123; i++) {
			// normal lcg advancement here
			seed = LCG.JAVA.nextSeed(seed);
			
			// split lcg advancement
			top31 = (top31 * LCG.JAVA.multiplier) & Mth.getMask(31);
			bottom17 = LCG.JAVA.nextSeed(bottom17);
		}
		
		seed &= Mth.MASK_48;
		long seedSplit = ((top31<<17) + bottom17) & Mth.MASK_48; // note the "+" instead of "|"
		
		System.out.println(seed + "  " + seedSplit);
	}
}
