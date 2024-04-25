package kludwisz.generator;

import java.util.List;

import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Triplet;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.LootTable;

import kludwisz.util.DecoratorRand;

public class Main {
	private static final TrialChambers CHAMBERS = new TrialChambers(MCVersion.v1_19_2);
	
	public static void main(String[] args) {
		test();
	}
	
	private static void test() {
		// test the generator
		TrialChambersGenerator gen = new TrialChambersGenerator();
		genForRegion(gen, -6, 3);
		List<Triplet<BPos, LootTable, Long>> chests = gen.getChestsWithLootSeeds();
		
		for (Triplet<BPos, LootTable, Long> chest : chests) {
			System.out.printf("/tp %d %d %d   %d\n", 
					chest.getFirst().getX(), chest.getFirst().getY(), chest.getFirst().getZ(), 
					chest.getThird());
		}
	}
	
	
	private static void genForRegion(TrialChambersGenerator gen, int rx, int rz) {
		final long worldseed = 12345L;
		
		ChunkRand rand = new ChunkRand();
		CPos tc = CHAMBERS.getInRegion(worldseed, rx, rz, rand);
		//System.out.println(tc);
				
		gen.generate(worldseed, tc.getX(), tc.getZ(), rand);
				
		int c=0;
		for (TrialChambersGenerator.Piece p : gen.getPieces()) {
					
			System.out.print(p.getName() + "      /tp " + p.box.minX + " " + p.box.minY + " " + p.box.minZ);
			System.out.println("      /tp " + p.box.maxX + " " + p.box.maxY + " " + p.box.maxZ);
			//if (c > 10)
			//	break;
			//c++;
		}
	}

	
	// 30004 : index = 4, step = 3
	private static void findDecorationSalt() {
		final long goodLootSeed = -6363922035146148698L;
		final int cx = -181;
		final int cz = 48;
		DecoratorRand rand = new DecoratorRand();
		
		for (int index = 0; index<20; index++) for (int step = 0; step<20; step++) {
			int salt = 10000 * step + index;
			long popseed = rand.getPopulationSeed(12345L, cx<<4, cz<<4);
			rand.setDecoratorSeed(popseed, index, step);
			if (rand.nextLong() == goodLootSeed) {
				System.out.println(salt + " : index = " + index + ", step = " + step);
			}
		}
	}
}
