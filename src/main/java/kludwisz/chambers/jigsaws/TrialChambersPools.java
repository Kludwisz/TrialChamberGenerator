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
			45,  /* atrium id = 0 */
			45,  /* corridor id = 1 */
			45,  /* decor id = 2 */
			45,  /* entrance id = 3 */
			21,  /* hallway id = 4 */
			45,  /* chamber/addon id = 5 */
			45,  /* chamber/assembly id = 6 */
			45,  /* chamber/end id = 7 */
			8,  /* chamber/entrance_cap id = 8 */
			45,  /* chamber/eruption id = 9 */
			45,  /* chamber/pedestal id = 10 */
			45,  /* chamber/slanted id = 11 */
			21,  /* chambers/end id = 12 */
			45,  /* chests/supply id = 13 */
			45,  /* chests/contents/supply id = 14 */
			45,  /* corridor/slices id = 15 */
			45,  /* corridors/addon/lower id = 16 */
			45,  /* corridors/addon/middle id = 17 */
			45,  /* corridors/addon/middle_upper id = 18 */
			45,  /* decor/chamber id = 19 */
			45,  /* dispensers/chamber id = 20 */
			45,  /* hallway/fallback id = 21 */
			45,  /* reward/all id = 22 */
			45,  /* reward/ominous_vault id = 23 */
			45,  /* reward/contents/default id = 24 */
			45,  /* spawner/all id = 25 */
			45,  /* spawner/breeze id = 26 */
			45,  /* spawner/melee id = 27 */
			45,  /* spawner/ranged id = 28 */
			45,  /* spawner/slow_ranged id = 29 */
			45,  /* spawner/small_melee id = 30 */
			45,  /* spawner/contents/breeze id = 31 */
			45,  /* spawner/melee/husk id = 32 */
			45,  /* spawner/melee/spider id = 33 */
			45,  /* spawner/melee/zombie id = 34 */
			45,  /* spawner/ranged/poison_skeleton id = 35 */
			45,  /* spawner/ranged/skeleton id = 36 */
			45,  /* spawner/ranged/stray id = 37 */
			45,  /* spawner/slow_ranged/poison_skeleton id = 38 */
			45,  /* spawner/slow_ranged/skeleton id = 39 */
			45,  /* spawner/slow_ranged/stray id = 40 */
			45,  /* spawner/small_melee/baby_zombie id = 41 */
			45,  /* spawner/small_melee/cave_spider id = 42 */
			45,  /* spawner/small_melee/silverfish id = 43 */
			45,  /* spawner/small_melee/slime id = 44 */
			45   /* empty id = 45 */
	);
	
    private static final List< List<Pair<Integer, Integer>> > CHAMBER_POOLS = Arrays.asList(
			/* atrium id = 0 */Arrays.asList(
					new Pair<>(108, 1),
					new Pair<>(109, 1),
					new Pair<>(114, 1),
					new Pair<>(113, 1),
					new Pair<>(110, 1),
					new Pair<>(111, 1),
					new Pair<>(112, 1)
			),

			/* corridor id = 1 */Arrays.asList(
					new Pair<>(84, 1),
					new Pair<>(146, 1),
					new Pair<>(147, 1),
					new Pair<>(148, 1),
					new Pair<>(83, 1),
					new Pair<>(77, 1),
					new Pair<>(80, 1),
					new Pair<>(81, 1),
					new Pair<>(82, 1)
			),

			/* decor id = 2 */Arrays.asList(
					new Pair<>(170, 22),  // empty pool element
					new Pair<>(121, 2),
					new Pair<>(120, 2),
					new Pair<>(125, 10),
					new Pair<>(122, 1),
					new Pair<>(123, 1),
					new Pair<>(124, 1),
					new Pair<>(116, 1),
					new Pair<>(117, 1),
					new Pair<>(118, 1),
					new Pair<>(119, 1),
					new Pair<>(115, 2)
			),

			/* entrance id = 3 */Arrays.asList(
					new Pair<>(97, 1),
					new Pair<>(98, 1),
					new Pair<>(99, 1)
			),

			/* hallway id = 4 */Arrays.asList(
					new Pair<>(132, 1),
					new Pair<>(145, 1),
					new Pair<>(136, 1),
					new Pair<>(138, 1),
					new Pair<>(1, 150),
					new Pair<>(2, 150),
					new Pair<>(3, 150),
					new Pair<>(4, 150),
					new Pair<>(0, 150),
					new Pair<>(6, 150),
					new Pair<>(8, 150),
					new Pair<>(7, 150),
					new Pair<>(139, 10),
					new Pair<>(140, 1),
					new Pair<>(129, 1),
					new Pair<>(133, 1),
					new Pair<>(137, 1),
					new Pair<>(130, 1),
					new Pair<>(131, 1),
					new Pair<>(134, 1),
					new Pair<>(135, 1),
					new Pair<>(142, 1),
					new Pair<>(143, 1),
					new Pair<>(144, 1)
			),

			/* chamber/addon id = 5 */Arrays.asList(
					new Pair<>(11, 1),
					new Pair<>(12, 1),
					new Pair<>(10, 1),
					new Pair<>(13, 1),
					new Pair<>(14, 1),
					new Pair<>(16, 1),
					new Pair<>(17, 1),
					new Pair<>(15, 1),
					new Pair<>(18, 1),
					new Pair<>(9, 1)
			),

			/* chamber/assembly id = 6 */Arrays.asList(
					new Pair<>(26, 2),
					new Pair<>(19, 2),
					new Pair<>(20, 2),
					new Pair<>(21, 2),
					new Pair<>(22, 2),
					new Pair<>(23, 2),
					new Pair<>(24, 2),
					new Pair<>(25, 5),
					new Pair<>(35, 2),
					new Pair<>(39, 1),
					new Pair<>(27, 2),
					new Pair<>(28, 1),
					new Pair<>(29, 2),
					new Pair<>(30, 2),
					new Pair<>(31, 4),
					new Pair<>(32, 1),
					new Pair<>(33, 1),
					new Pair<>(34, 1),
					new Pair<>(36, 1),
					new Pair<>(37, 1),
					new Pair<>(38, 1)
			),

			/* chamber/end id = 7 */Arrays.asList(
					new Pair<>(78, 1),
					new Pair<>(79, 1)
			),

			/* chamber/entrance_cap id = 8 */Collections.singletonList(
					new Pair<>(5, 1)
			),

			/* chamber/eruption id = 9 */Arrays.asList(
					new Pair<>(41, 1),
					new Pair<>(40, 1),
					new Pair<>(47, 1),
					new Pair<>(48, 1),
					new Pair<>(49, 1),
					new Pair<>(42, 1),
					new Pair<>(43, 1),
					new Pair<>(44, 1),
					new Pair<>(45, 1),
					new Pair<>(46, 1)
			),

			/* chamber/pedestal id = 10 */Arrays.asList(
					new Pair<>(50, 1),
					new Pair<>(55, 1),
					new Pair<>(56, 3),
					new Pair<>(57, 3),
					new Pair<>(58, 3),
					new Pair<>(59, 3),
					new Pair<>(51, 1),
					new Pair<>(52, 1),
					new Pair<>(53, 1),
					new Pair<>(54, 1),
					new Pair<>(67, 1),
					new Pair<>(68, 1),
					new Pair<>(69, 1),
					new Pair<>(70, 1)
			),

			/* chamber/slanted id = 11 */Arrays.asList(
					new Pair<>(60, 1),
					new Pair<>(61, 1),
					new Pair<>(62, 1),
					new Pair<>(63, 1),
					new Pair<>(64, 1),
					new Pair<>(65, 1),
					new Pair<>(67, 1),
					new Pair<>(68, 1),
					new Pair<>(69, 1),
					new Pair<>(70, 1),
					new Pair<>(71, 1),
					new Pair<>(72, 1),
					new Pair<>(73, 1),
					new Pair<>(74, 1),
					new Pair<>(66, 1)
			),

			/* chambers/end id = 12 */Arrays.asList(
					new Pair<>(1, 1),
					new Pair<>(0, 1),
					new Pair<>(6, 1),
					new Pair<>(8, 1)
			),

			/* chests/supply id = 13 */Collections.singletonList(
					new Pair<>(76, 1)
			),

			/* chests/contents/supply id = 14 */Collections.singletonList(
					new Pair<>(75, 1)
			),

			/* corridor/slices id = 15 */Arrays.asList(
					new Pair<>(85, 1),
					new Pair<>(86, 2),
					new Pair<>(87, 2),
					new Pair<>(88, 2),
					new Pair<>(89, 2),
					new Pair<>(90, 2),
					new Pair<>(91, 1),
					new Pair<>(92, 2)
			),

			/* corridors/addon/lower id = 16 */Arrays.asList(
					new Pair<>(170, 8),  // empty pool element
					new Pair<>(105, 1),
					new Pair<>(106, 1),
					new Pair<>(101, 1),
					new Pair<>(93, 1),
					new Pair<>(94, 2)
			),

			/* corridors/addon/middle id = 17 */Arrays.asList(
					new Pair<>(170, 8),  // empty pool element
					new Pair<>(102, 2),
					new Pair<>(107, 1)
			),

			/* corridors/addon/middle_upper id = 18 */Arrays.asList(
					new Pair<>(170, 6),  // empty pool element
					new Pair<>(103, 2),
					new Pair<>(95, 1),
					new Pair<>(96, 1),
					new Pair<>(100, 1),
					new Pair<>(104, 1)
			),

			/* decor/chamber id = 19 */Arrays.asList(
					new Pair<>(170, 4),  // empty pool element
					new Pair<>(125, 1)
			),

			/* dispensers/chamber id = 20 */Arrays.asList(
					new Pair<>(170, 1),  // empty pool element
					new Pair<>(126, 1),
					new Pair<>(128, 1),
					new Pair<>(127, 1)
			),

			/* hallway/fallback id = 21 */Arrays.asList(
					new Pair<>(138, 1),
					new Pair<>(139, 1),
					new Pair<>(141, 1),
					new Pair<>(140, 1)
			),

			/* reward/all id = 22 */Collections.singletonList(
					new Pair<>(150, 1)
			),

			/* reward/ominous_vault id = 23 */Collections.singletonList(
					new Pair<>(149, 1)
			),

			/* reward/contents/default id = 24 */Collections.singletonList(
					new Pair<>(150, 1)
			),

			/* spawner/all id = 25 */Arrays.asList(
					new Pair<>(154, 1),
					new Pair<>(153, 1),
					new Pair<>(156, 1)
			),

			/* spawner/breeze id = 26 */Collections.singletonList(
					new Pair<>(152, 1)
			),

			/* spawner/melee id = 27 */Collections.singletonList(
					new Pair<>(153, 1)
			),

			/* spawner/ranged id = 28 */Collections.singletonList(
					new Pair<>(154, 1)
			),

			/* spawner/slow_ranged id = 29 */Collections.singletonList(
					new Pair<>(155, 1)
			),

			/* spawner/small_melee id = 30 */Collections.singletonList(
					new Pair<>(156, 1)
			),

			/* spawner/contents/breeze id = 31 */Collections.singletonList(
					new Pair<>(151, 1)
			),

			/* spawner/melee/husk id = 32 */Collections.singletonList(
					new Pair<>(157, 1)
			),

			/* spawner/melee/spider id = 33 */Collections.singletonList(
					new Pair<>(158, 1)
			),

			/* spawner/melee/zombie id = 34 */Collections.singletonList(
					new Pair<>(159, 1)
			),

			/* spawner/ranged/poison_skeleton id = 35 */Collections.singletonList(
					new Pair<>(160, 1)
			),

			/* spawner/ranged/skeleton id = 36 */Collections.singletonList(
					new Pair<>(161, 1)
			),

			/* spawner/ranged/stray id = 37 */Collections.singletonList(
					new Pair<>(162, 1)
			),

			/* spawner/slow_ranged/poison_skeleton id = 38 */Collections.singletonList(
					new Pair<>(163, 1)
			),

			/* spawner/slow_ranged/skeleton id = 39 */Collections.singletonList(
					new Pair<>(164, 1)
			),

			/* spawner/slow_ranged/stray id = 40 */Collections.singletonList(
					new Pair<>(165, 1)
			),

			/* spawner/small_melee/baby_zombie id = 41 */Collections.singletonList(
					new Pair<>(166, 1)
			),

			/* spawner/small_melee/cave_spider id = 42 */Collections.singletonList(
					new Pair<>(167, 1)
			),

			/* spawner/small_melee/silverfish id = 43 */Collections.singletonList(
					new Pair<>(168, 1)
			),

			/* spawner/small_melee/slime id = 44 */Collections.singletonList(
					new Pair<>(169, 1)
			),

    		/* empty id = 45 */ Collections.singletonList(
    				new Pair<>(170, 0)
    		)
    );
}
