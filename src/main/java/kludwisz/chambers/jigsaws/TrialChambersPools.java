package kludwisz.chambers.jigsaws;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.seedfinding.mccore.util.data.Pair;

public class TrialChambersPools {
	
	public static List<Pair<Integer, Integer>> get(int poolID) {
		if (poolID < 0 || poolID > CHAMBER_POOLS.size())
			return null;
		return CHAMBER_POOLS.get(poolID);
	}
	
	public static int getFallbackID(int poolID) {
		return FALLBACK_POOLS.get(poolID);
	}
	
	private static final List<Integer> FALLBACK_POOLS = Arrays.asList(
			44,  /*atrium*/
			44,  /*corridor*/
			44,  /*decor*/
			44,  /*decor_chamber*/
			20,  /*hallway*/
			44,  /*chamber/addon*/
			44,  /*chamber/assembly*/
			44,  /*chamber/end*/
			8,  /*chamber/entrance_cap*/
			44,  /*chamber/eruption*/
			44,  /*chamber/pedestal*/
			44,  /*chamber/slanted*/
			20,  /*chambers/end*/
			44,  /*chests/supply*/
			44,  /*chests/contents/supply*/
			44,  /*corridor/slices*/
			44,  /*corridors/addon/lower*/
			44,  /*corridors/addon/middle*/
			44,  /*corridors/addon/middle_upper*/
			44,  /*dispensers/chamber*/
			44,  /*hallway/fallback*/
			44,  /*reward/all*/
			44,  /*reward/ominous_vault*/
			44,  /*reward/contents/default*/
			44,  /*spawner/all*/
			44,  /*spawner/breeze*/
			44,  /*spawner/melee*/
			44,  /*spawner/ranged*/
			44,  /*spawner/slow_ranged*/
			44,  /*spawner/small_melee*/
			44,  /*spawner/contents/breeze*/
			44,  /*spawner/melee/husk*/
			44,  /*spawner/melee/slime*/
			44,  /*spawner/melee/zombie*/
			44,  /*spawner/ranged/poison_skeleton*/
			44,  /*spawner/ranged/skeleton*/
			44,  /*spawner/ranged/stray*/
			44,  /*spawner/slow_ranged/poison_skeleton*/
			44,  /*spawner/slow_ranged/skeleton*/
			44,  /*spawner/slow_ranged/stray*/
			44,  /*spawner/small_melee/baby_zombie*/
			44,  /*spawner/small_melee/cave_spider*/
			44,  /*spawner/small_melee/silverfish*/
			44,  /*spawner/small_melee/spider*/
			44   /* empty */
	);
	
    private static final List< List<Pair<Integer, Integer>> > CHAMBER_POOLS = Arrays.asList(
			/* atrium id = 0 */ Arrays.asList(
					new Pair<>(118, 1),
					new Pair<>(119, 1),
					new Pair<>(124, 1),
					new Pair<>(123, 1),
					new Pair<>(120, 1),
					new Pair<>(121, 1),
					new Pair<>(122, 1)
			),

			/* corridor id = 1 */ Arrays.asList(
					new Pair<>(97, 1),
					new Pair<>(156, 1),
					new Pair<>(157, 1),
					new Pair<>(158, 1),
					new Pair<>(96, 1),
					new Pair<>(92, 1),
					new Pair<>(95, 1)
			),

			/* decor id = 2 */ Arrays.asList(
					new Pair<>(180, 22),  // empty pool element
					new Pair<>(131, 2),
					new Pair<>(130, 2),
					new Pair<>(135, 10),
					new Pair<>(132, 1),
					new Pair<>(133, 1),
					new Pair<>(134, 1),
					new Pair<>(126, 1),
					new Pair<>(127, 1),
					new Pair<>(128, 1),
					new Pair<>(129, 1),
					new Pair<>(125, 2)
			),

			/* decor_chamber id = 3 */ Arrays.asList(
					new Pair<>(180, 4),  // empty pool element
					new Pair<>(135, 1)
			),

			/* hallway id = 4 */ Arrays.asList(
					new Pair<>(142, 1),
					new Pair<>(155, 1),
					new Pair<>(146, 1),
					new Pair<>(148, 1),
					new Pair<>(1, 150),
					new Pair<>(2, 150),
					new Pair<>(3, 150),
					new Pair<>(4, 150),
					new Pair<>(0, 150),
					new Pair<>(6, 150),
					new Pair<>(8, 150),
					new Pair<>(7, 150),
					new Pair<>(149, 10),
					new Pair<>(150, 1),
					new Pair<>(139, 1),
					new Pair<>(143, 1),
					new Pair<>(147, 1),
					new Pair<>(140, 1),
					new Pair<>(141, 1),
					new Pair<>(144, 1),
					new Pair<>(145, 1),
					new Pair<>(152, 1),
					new Pair<>(153, 1),
					new Pair<>(154, 1)
			),

			/* chamber/addon id = 5 */ Arrays.asList(
					new Pair<>(19, 1),
					new Pair<>(20, 1),
					new Pair<>(18, 1),
					new Pair<>(17, 1),
					new Pair<>(25, 1),
					new Pair<>(21, 1),
					new Pair<>(22, 1),
					new Pair<>(28, 1),
					new Pair<>(29, 1),
					new Pair<>(23, 1),
					new Pair<>(24, 1),
					new Pair<>(33, 1),
					new Pair<>(30, 1),
					new Pair<>(15, 1),
					new Pair<>(26, 1),
					new Pair<>(10, 1),
					new Pair<>(11, 1),
					new Pair<>(9, 1),
					new Pair<>(27, 1),
					new Pair<>(31, 1),
					new Pair<>(32, 1),
					new Pair<>(13, 1),
					new Pair<>(14, 1),
					new Pair<>(34, 1),
					new Pair<>(16, 1),
					new Pair<>(12, 1)
			),

			/* chamber/assembly id = 6 */ Arrays.asList(
					new Pair<>(41, 2),
					new Pair<>(35, 2),
					new Pair<>(36, 2),
					new Pair<>(37, 2),
					new Pair<>(38, 2),
					new Pair<>(39, 2),
					new Pair<>(40, 2),
					new Pair<>(49, 2),
					new Pair<>(53, 1),
					new Pair<>(54, 1),
					new Pair<>(42, 2),
					new Pair<>(43, 1),
					new Pair<>(44, 2),
					new Pair<>(45, 2),
					new Pair<>(46, 1),
					new Pair<>(47, 1),
					new Pair<>(48, 1),
					new Pair<>(50, 1),
					new Pair<>(51, 1),
					new Pair<>(52, 1)
			),

			/* chamber/end id = 7 */ Arrays.asList(
					new Pair<>(93, 1),
					new Pair<>(94, 1)
			),

			/* chamber/entrance_cap id = 8 */ Collections.singletonList(
                    new Pair<>(5, 1)
            ),

			/* chamber/eruption id = 9 */ Arrays.asList(
					new Pair<>(56, 1),
					new Pair<>(55, 1),
					new Pair<>(62, 1),
					new Pair<>(63, 1),
					new Pair<>(64, 1),
					new Pair<>(57, 1),
					new Pair<>(58, 1),
					new Pair<>(59, 1),
					new Pair<>(60, 1),
					new Pair<>(61, 1)
			),

			/* chamber/pedestal id = 10 */ Arrays.asList(
					new Pair<>(65, 1),
					new Pair<>(70, 1),
					new Pair<>(71, 3),
					new Pair<>(72, 3),
					new Pair<>(73, 3),
					new Pair<>(74, 3),
					new Pair<>(66, 1),
					new Pair<>(67, 1),
					new Pair<>(68, 1),
					new Pair<>(69, 1),
					new Pair<>(82, 1),
					new Pair<>(83, 1),
					new Pair<>(84, 1),
					new Pair<>(85, 1)
			),

			/* chamber/slanted id = 11 */ Arrays.asList(
					new Pair<>(75, 1),
					new Pair<>(76, 1),
					new Pair<>(77, 1),
					new Pair<>(78, 1),
					new Pair<>(79, 1),
					new Pair<>(80, 1),
					new Pair<>(82, 1),
					new Pair<>(83, 1),
					new Pair<>(84, 1),
					new Pair<>(85, 1),
					new Pair<>(86, 1),
					new Pair<>(87, 1),
					new Pair<>(88, 1),
					new Pair<>(89, 1),
					new Pair<>(81, 1)
			),

			/* chambers/end id = 12 */ Arrays.asList(
					new Pair<>(1, 1),
					new Pair<>(0, 1),
					new Pair<>(6, 1),
					new Pair<>(8, 1)
			),

			/* chests/supply id = 13 */ Collections.singletonList(
					new Pair<>(91, 1)
			),

			/* chests/contents/supply id = 14 */ Collections.singletonList(
					new Pair<>(90, 1)
			),

			/* corridor/slices id = 15 */ Arrays.asList(
					new Pair<>(98, 1),
					new Pair<>(99, 2),
					new Pair<>(100, 2),
					new Pair<>(101, 2),
					new Pair<>(102, 2),
					new Pair<>(103, 2),
					new Pair<>(104, 1),
					new Pair<>(105, 2)
			),

			/* corridors/addon/lower id = 16 */ Arrays.asList(
					new Pair<>(180, 8),  // empty pool element
					new Pair<>(115, 1),
					new Pair<>(116, 1),
					new Pair<>(111, 1),
					new Pair<>(106, 1),
					new Pair<>(107, 2)
			),

			/* corridors/addon/middle id = 17 */ Arrays.asList(
					new Pair<>(180, 8),  // empty pool element
					new Pair<>(112, 2),
					new Pair<>(117, 1)
			),

			/* corridors/addon/middle_upper id = 18 */ Arrays.asList(
					new Pair<>(180, 6),  // empty pool element
					new Pair<>(113, 2),
					new Pair<>(108, 1),
					new Pair<>(109, 1),
					new Pair<>(110, 1),
					new Pair<>(114, 1)
			),

			/* dispensers/chamber id = 19 */ Arrays.asList(
					new Pair<>(180, 1),  // empty pool element
					new Pair<>(136, 1),
					new Pair<>(138, 1),
					new Pair<>(137, 1)
			),

			/* hallway/fallback id = 20 */ Arrays.asList(
					new Pair<>(148, 1),
					new Pair<>(149, 1),
					new Pair<>(151, 1),
					new Pair<>(150, 1)
			),

			/* reward/all id = 21 */ Collections.singletonList(
					new Pair<>(160, 1)
			),

			/* reward/ominous_vault id = 22 */ Collections.singletonList(
					new Pair<>(159, 1)
			),

			/* reward/contents/default id = 23 */ Collections.singletonList(
					new Pair<>(160, 1)
			),

			/* spawner/all id = 24 */ Arrays.asList(
					new Pair<>(164, 1),
					new Pair<>(163, 1),
					new Pair<>(166, 1)
			),

			/* spawner/breeze id = 25 */ Collections.singletonList(
					new Pair<>(162, 1)
			),

			/* spawner/melee id = 26 */ Collections.singletonList(
					new Pair<>(163, 1)
			),

			/* spawner/ranged id = 27 */ Collections.singletonList(
					new Pair<>(164, 1)
			),

			/* spawner/slow_ranged id = 28 */ Collections.singletonList(
					new Pair<>(165, 1)
			),

			/* spawner/small_melee id = 29 */ Collections.singletonList(
					new Pair<>(166, 1)
			),

			/* spawner/contents/breeze id = 30 */ Collections.singletonList(
					new Pair<>(161, 1)
			),

			/* spawner/melee/husk id = 31 */ Collections.singletonList(
					new Pair<>(167, 1)
			),

			/* spawner/melee/slime id = 32 */ Collections.singletonList(
					new Pair<>(168, 1)
			),

			/* spawner/melee/zombie id = 33 */ Collections.singletonList(
					new Pair<>(169, 1)
			),

			/* spawner/ranged/poison_skeleton id = 34 */ Collections.singletonList(
					new Pair<>(170, 1)
			),

			/* spawner/ranged/skeleton id = 35 */ Collections.singletonList(
					new Pair<>(171, 1)
			),

			/* spawner/ranged/stray id = 36 */ Collections.singletonList(
					new Pair<>(172, 1)
			),

			/* spawner/slow_ranged/poison_skeleton id = 37 */ Collections.singletonList(
					new Pair<>(173, 1)
			),

			/* spawner/slow_ranged/skeleton id = 38 */ Collections.singletonList(
					new Pair<>(174, 1)
			),

			/* spawner/slow_ranged/stray id = 39 */ Collections.singletonList(
					new Pair<>(175, 1)
			),

			/* spawner/small_melee/baby_zombie id = 40 */ Collections.singletonList(
					new Pair<>(176, 1)
			),

			/* spawner/small_melee/cave_spider id = 41 */ Collections.singletonList(
					new Pair<>(177, 1)
			),

			/* spawner/small_melee/silverfish id = 42 */ Collections.singletonList(
					new Pair<>(178, 1)
			),

			/* spawner/small_melee/spider id = 43 */ Collections.singletonList(
					new Pair<>(179, 1)
			),
    		
    		/* empty */ Collections.singletonList(
    				new Pair<>(180, 0)
    		)
    );
}
