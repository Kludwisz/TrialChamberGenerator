package kludwisz.chambers.jigsaws;

import java.util.HashMap;
import java.util.List;

import com.seedfinding.mccore.util.data.Pair;

public class TrialChambersPools {
	
	public static List<Pair<Integer, Integer>> get(int poolID) {
		return CHAMBER_POOLS.get(poolID);
	}
	
	public static int getFallbackID(int poolID) {
		return FALLBACK_POOLS.get(poolID);
	}
	
	public static int getFromAlias(String alias) {
		return ALIAS_TO_ID.getOrDefault(alias, -1);
	}
	
	private static final List<Integer> FALLBACK_POOLS = List.of(
			43,  /*corridor*/
			43,  /*decor*/
			43,  /*decor_chamber*/
			20,  /*hallway*/
			43,  /*chamber/addon*/
			43,  /*chamber/end*/
			6,   /*chamber/entrance_cap*/
			43,  /*chamber/pedestal*/
			43,  /*chamber/slanted*/
			43,  /*chamber/addon/c6*/
			20,  /*chambers/end*/
			43,  /*chests/supply*/
			43,  /*chests/contents/supply*/
			43,  /*corridor/first*/
			43,  /*corridor/second*/
			43,  /*corridor/first/straight*/
			43,  /*corridors/addon/lower*/
			43,  /*corridors/addon/middle*/
			43,  /*corridors/addon/middle_upper*/
			43,  /*dispensers/chamber*/
			43,  /*hallway/fallback*/
			43,  /*reward/all*/
			43,  /*reward/contents/default*/
			43,  /*spawner/all*/
			43,  /*spawner/breeze*/
			43,  /*spawner/melee*/
			43,  /*spawner/ranged*/
			43,  /*spawner/slow_ranged*/
			43,  /*spawner/small_melee*/
			43,  /*spawner/contents/breeze*/
			43,  /*spawner/melee/husk*/
			43,  /*spawner/melee/slime*/
			43,  /*spawner/melee/zombie*/
			43,  /*spawner/ranged/poison_skeleton*/
			43,  /*spawner/ranged/skeleton*/
			43,  /*spawner/ranged/stray*/
			43,  /*spawner/slow_ranged/poison_skeleton*/
			43,  /*spawner/slow_ranged/skeleton*/
			43,  /*spawner/slow_ranged/stray*/
			43,  /*spawner/small_melee/baby_zombie*/
			43,  /*spawner/small_melee/cave_spider*/
			43,  /*spawner/small_melee/silverfish*/
			43,  /*spawner/small_melee/spider*/
			43   /* empty */
	);
	
    private static final List< List<Pair<Integer, Integer>> > CHAMBER_POOLS = List.of(
    		/* corridor */ List.of(
    				new Pair<>(81, 1),
    				new Pair<>(82, 2),
    				new Pair<>(83, 2),
    				new Pair<>(84, 2),
    				new Pair<>(85, 2),
    				new Pair<>(86, 2),
    				new Pair<>(87, 2),
    				new Pair<>(88, 2)
    		),

    		/* decor */ List.of(
    				new Pair<>(153, 22),  // empty pool element
    				new Pair<>(107, 2),
    				new Pair<>(106, 2),
    				new Pair<>(111, 10),
    				new Pair<>(108, 1),
    				new Pair<>(109, 1),
    				new Pair<>(110, 1),
    				new Pair<>(102, 1),
    				new Pair<>(103, 1),
    				new Pair<>(104, 1),
    				new Pair<>(105, 1),
    				new Pair<>(101, 2)
    		),

    		/* decor_chamber */ List.of(
    				new Pair<>(153, 4),  // empty pool element
    				new Pair<>(111, 1)
    		),

    		/* hallway */ List.of(
    				new Pair<>(116, 1),
    				new Pair<>(129, 1),
    				new Pair<>(120, 1),
    				new Pair<>(122, 1),
    				new Pair<>(0, 150),
    				new Pair<>(1, 150),
    				new Pair<>(2, 150),
    				new Pair<>(3, 150),
    				new Pair<>(4, 150),
    				new Pair<>(5, 150),
    				new Pair<>(8, 150),
    				new Pair<>(7, 150),
    				new Pair<>(123, 10),
    				new Pair<>(124, 1),
    				new Pair<>(113, 1),
    				new Pair<>(117, 1),
    				new Pair<>(121, 1),
    				new Pair<>(114, 1),
    				new Pair<>(115, 1),
    				new Pair<>(118, 1),
    				new Pair<>(119, 1),
    				new Pair<>(126, 1),
    				new Pair<>(127, 1),
    				new Pair<>(128, 1)
    		),

    		/* chamber/addon */ List.of(
    				new Pair<>(35, 1),
    				new Pair<>(36, 1),
    				new Pair<>(34, 1),
    				new Pair<>(33, 1),
    				new Pair<>(41, 1),
    				new Pair<>(37, 1),
    				new Pair<>(38, 1),
    				new Pair<>(44, 1),
    				new Pair<>(45, 1),
    				new Pair<>(39, 1),
    				new Pair<>(40, 1),
    				new Pair<>(49, 1),
    				new Pair<>(46, 1),
    				new Pair<>(31, 1),
    				new Pair<>(42, 1),
    				new Pair<>(10, 1),
    				new Pair<>(11, 1),
    				new Pair<>(9, 1),
    				new Pair<>(43, 1),
    				new Pair<>(47, 1),
    				new Pair<>(48, 1),
    				new Pair<>(13, 1),
    				new Pair<>(14, 1),
    				new Pair<>(50, 1),
    				new Pair<>(32, 1),
    				new Pair<>(30, 1),
    				new Pair<>(12, 1)
    		),

    		/* chamber/end */ List.of(
    				new Pair<>(76, 1),
    				new Pair<>(77, 1)
    		),

    		/* chamber/entrance_cap */ List.of(
    				new Pair<>(6, 1)
    		),

    		/* chamber/pedestal */ List.of(
    				new Pair<>(51, 1),
    				new Pair<>(55, 1),
    				new Pair<>(56, 3),
    				new Pair<>(57, 3),
    				new Pair<>(58, 3),
    				new Pair<>(59, 3),
    				new Pair<>(52, 1),
    				new Pair<>(53, 1),
    				new Pair<>(54, 1),
    				new Pair<>(66, 1),
    				new Pair<>(67, 1),
    				new Pair<>(68, 1),
    				new Pair<>(69, 1)
    		),

    		/* chamber/slanted */ List.of(
    				new Pair<>(60, 1),
    				new Pair<>(61, 1),
    				new Pair<>(62, 1),
    				new Pair<>(63, 1),
    				new Pair<>(64, 1),
    				new Pair<>(65, 1),
    				new Pair<>(66, 1),
    				new Pair<>(67, 1),
    				new Pair<>(68, 1),
    				new Pair<>(69, 1),
    				new Pair<>(70, 1),
    				new Pair<>(71, 1),
    				new Pair<>(72, 1),
    				new Pair<>(73, 1)
    		),

    		/* chamber/addon/c6 */ List.of(
    				new Pair<>(153, 3),  // empty pool element
    				new Pair<>(23, 2),
    				new Pair<>(24, 2),
    				new Pair<>(25, 2),
    				new Pair<>(16, 1),
    				new Pair<>(17, 1),
    				new Pair<>(18, 1),
    				new Pair<>(27, 1),
    				new Pair<>(28, 1),
    				new Pair<>(15, 1),
    				new Pair<>(26, 1),
    				new Pair<>(19, 1),
    				new Pair<>(20, 1),
    				new Pair<>(21, 1),
    				new Pair<>(22, 1),
    				new Pair<>(29, 1)
    		),

    		/* chambers/end */ List.of(
    				new Pair<>(0, 1),
    				new Pair<>(3, 1),
    				new Pair<>(4, 1),
    				new Pair<>(8, 1)
    		),

    		/* chests/supply */ List.of(
    				new Pair<>(75, 1)
    		),

    		/* chests/contents/supply */ List.of(
    				new Pair<>(74, 1)
    		),

    		/* corridor/first */ List.of(
    				new Pair<>(79, 1),
    				new Pair<>(78, 2)
    		),

    		/* corridor/second */ List.of(
    				new Pair<>(80, 1),
    				new Pair<>(130, 1),
    				new Pair<>(131, 1)
    		),

    		/* corridor/first/straight */ List.of(
    				new Pair<>(79, 1)
    		),

    		/* corridors/addon/lower */ List.of(
    				new Pair<>(153, 8),  // empty pool element
    				new Pair<>(98, 1),
    				new Pair<>(99, 1),
    				new Pair<>(94, 1),
    				new Pair<>(89, 1),
    				new Pair<>(90, 2)
    		),

    		/* corridors/addon/middle */ List.of(
    				new Pair<>(153, 8),  // empty pool element
    				new Pair<>(95, 2),
    				new Pair<>(100, 1)
    		),

    		/* corridors/addon/middle_upper */ List.of(
    				new Pair<>(153, 6),  // empty pool element
    				new Pair<>(96, 2),
    				new Pair<>(91, 1),
    				new Pair<>(92, 1),
    				new Pair<>(93, 1),
    				new Pair<>(97, 1)
    		),

    		/* dispensers/chamber */ List.of(
    				new Pair<>(153, 1),  // empty pool element
    				new Pair<>(112, 1)
    		),

    		/* hallway/fallback */ List.of(
    				new Pair<>(122, 1),
    				new Pair<>(123, 1),
    				new Pair<>(125, 1),
    				new Pair<>(124, 1)
    		),

    		/* reward/all */ List.of(
    				new Pair<>(133, 1)
    		),

    		/* reward/contents/default */ List.of(
    				new Pair<>(132, 1)
    		),

    		/* spawner/all */ List.of(
    				new Pair<>(137, 1),
    				new Pair<>(136, 1),
    				new Pair<>(139, 1)
    		),

    		/* spawner/breeze */ List.of(
    				new Pair<>(135, 1)
    		),

    		/* spawner/melee */ List.of(
    				new Pair<>(136, 1)
    		),

    		/* spawner/ranged */ List.of(
    				new Pair<>(137, 1)
    		),

    		/* spawner/slow_ranged */ List.of(
    				new Pair<>(138, 1)
    		),

    		/* spawner/small_melee */ List.of(
    				new Pair<>(139, 1)
    		),

    		/* spawner/contents/breeze */ List.of(
    				new Pair<>(134, 1)
    		),

    		/* spawner/melee/husk */ List.of(
    				new Pair<>(140, 1)
    		),

    		/* spawner/melee/slime */ List.of(
    				new Pair<>(141, 1)
    		),

    		/* spawner/melee/zombie */ List.of(
    				new Pair<>(142, 1)
    		),

    		/* spawner/ranged/poison_skeleton */ List.of(
    				new Pair<>(143, 1)
    		),

    		/* spawner/ranged/skeleton */ List.of(
    				new Pair<>(144, 1)
    		),

    		/* spawner/ranged/stray */ List.of(
    				new Pair<>(145, 1)
    		),

    		/* spawner/slow_ranged/poison_skeleton */ List.of(
    				new Pair<>(146, 1)
    		),

    		/* spawner/slow_ranged/skeleton */ List.of(
    				new Pair<>(147, 1)
    		),

    		/* spawner/slow_ranged/stray */ List.of(
    				new Pair<>(148, 1)
    		),

    		/* spawner/small_melee/baby_zombie */ List.of(
    				new Pair<>(149, 1)
    		),

    		/* spawner/small_melee/cave_spider */ List.of(
    				new Pair<>(150, 1)
    		),

    		/* spawner/small_melee/silverfish */ List.of(
    				new Pair<>(151, 1)
    		),

    		/* spawner/small_melee/spider */ List.of(
    				new Pair<>(152, 1)
    		),
    		
    		/* empty */ List.of(
    				new Pair<>(127, 0)
    		)
    );

    private static final HashMap<String, Integer> ALIAS_TO_ID = new HashMap<>() {{
    	put("spawner/contents/melee0", 30); // zombie
    	put("spawner/contents/melee1", 28); // husk
    	put("spawner/contents/melee2", 29); // slime
    	
    	put("spawner/contents/ranged0", 32); // skeleton
    	put("spawner/contents/ranged1", 33); // stray
    	put("spawner/contents/ranged2", 31); // bogged
    	
    	put("spawner/contents/slow_ranged0", 35); // skeleton
    	put("spawner/contents/slow_ranged1", 36); // stray
    	put("spawner/contents/slow_ranged2", 34); // bogged
    	
    	put("spawner/contents/small_melee0", 40); // spider
    	put("spawner/contents/small_melee1", 38); // cave spider
    	put("spawner/contents/small_melee2", 39); // silverfish
    	put("spawner/contents/small_melee3", 37); // baby zombie
    }};
}
