package kludwisz.structure.jigsaws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.seedfinding.mccore.util.data.Pair;

public class TrialChambersPools {
	
	public static List<Pair<Integer, Integer>> get(int poolID) {
		if (poolID < 0 || poolID > CHAMBER_POOLS_V2.size())
			return null;
		return CHAMBER_POOLS_V2.get(poolID);
	}
	
	public static int getFallbackID(int poolID) {
		return FALLBACK_POOLS[poolID];
	}

	private static final int[] FALLBACK_POOLS = new int[]{
			47,  /* atrium id = 0 */
			47,  /* corridor id = 1 */
			47,  /* decor id = 2 */
			47,  /* entrance id = 3 */
			23,  /* hallway id = 4 */
			47,  /* chamber/addon id = 5 */
			47,  /* chamber/assembly id = 6 */
			47,  /* chamber/end id = 7 */
			47,  /* chamber/entrance_cap id = 8 */
			47,  /* chamber/eruption id = 9 */
			47,  /* chamber/pedestal id = 10 */
			47,  /* chamber/slanted id = 11 */
			23,  /* chambers/end id = 12 */
			47,  /* chests/supply id = 13 */
			47,  /* chests/contents/supply id = 14 */
			47,  /* corridor/slices id = 15 */
			47,  /* corridors/addon/lower id = 16 */
			47,  /* corridors/addon/middle id = 17 */
			47,  /* corridors/addon/middle_upper id = 18 */
			47,  /* decor/bed id = 19 */
			47,  /* decor/chamber id = 20 */
			47,  /* decor/disposal id = 21 */
			47,  /* dispensers/chamber id = 22 */
			47,  /* hallway/fallback id = 23 */
			47,  /* reward/all id = 24 */
			47,  /* reward/ominous_vault id = 25 */
			47,  /* reward/contents/default id = 26 */
			47,  /* spawner/all id = 27 */
			47,  /* spawner/breeze id = 28 */
			47,  /* spawner/melee id = 29 */
			47,  /* spawner/ranged id = 30 */
			47,  /* spawner/slow_ranged id = 31 */
			47,  /* spawner/small_melee id = 32 */
			47,  /* spawner/contents/breeze id = 33 */
			47,  /* spawner/melee/husk id = 34 */
			47,  /* spawner/melee/spider id = 35 */
			47,  /* spawner/melee/zombie id = 36 */
			47,  /* spawner/ranged/poison_skeleton id = 37 */
			47,  /* spawner/ranged/skeleton id = 38 */
			47,  /* spawner/ranged/stray id = 39 */
			47,  /* spawner/slow_ranged/poison_skeleton id = 40 */
			47,  /* spawner/slow_ranged/skeleton id = 41 */
			47,  /* spawner/slow_ranged/stray id = 42 */
			47,  /* spawner/small_melee/baby_zombie id = 43 */
			47,  /* spawner/small_melee/cave_spider id = 44 */
			47,  /* spawner/small_melee/silverfish id = 45 */
			47,  /* spawner/small_melee/slime id = 46 */
			47   /* empty id = 47 */
	};


	private static final List< List<Pair<Integer, Integer>> > CHAMBER_POOLS_V2 = Arrays.asList(
			/* atrium id = 0 */ Arrays.asList(
					new Pair<>(106, 1),
					new Pair<>(107, 1),
					new Pair<>(112, 1),
					new Pair<>(111, 1),
					new Pair<>(108, 1),
					new Pair<>(109, 1),
					new Pair<>(110, 1)
			),

			/* corridor id = 1 */ Arrays.asList(
					new Pair<>(82, 1),
					new Pair<>(167, 1),
					new Pair<>(168, 1),
					new Pair<>(169, 1),
					new Pair<>(81, 1),
					new Pair<>(75, 1),
					new Pair<>(78, 1),
					new Pair<>(79, 1),
					new Pair<>(80, 1)
			),

			/* decor id = 2 */ Arrays.asList(
					new Pair<>(191, 22),  // empty pool element
					new Pair<>(124, 2),
					new Pair<>(122, 2),
					new Pair<>(138, 10),
					new Pair<>(125, 1),
					new Pair<>(128, 1),
					new Pair<>(137, 1),
					new Pair<>(117, 1),
					new Pair<>(118, 1),
					new Pair<>(119, 1),
					new Pair<>(120, 1),
					new Pair<>(113, 2)
			),

			/* entrance id = 3 */ Arrays.asList(
					new Pair<>(95, 1),
					new Pair<>(96, 1),
					new Pair<>(97, 1)
			),

			/* hallway id = 4 */ Arrays.asList(
					new Pair<>(147, 1),
					new Pair<>(166, 1),
					new Pair<>(156, 1),
					new Pair<>(158, 1),
					new Pair<>(1, 150),
					new Pair<>(2, 150),
					new Pair<>(3, 150),
					new Pair<>(4, 150),
					new Pair<>(0, 150),
					new Pair<>(6, 150),
					new Pair<>(8, 150),
					new Pair<>(7, 150),
					new Pair<>(159, 10),
					new Pair<>(160, 1),
					new Pair<>(144, 1),
					new Pair<>(153, 1),
					new Pair<>(157, 1),
					new Pair<>(145, 1),
					new Pair<>(146, 1),
					new Pair<>(154, 1),
					new Pair<>(155, 1),
					new Pair<>(162, 1),
					new Pair<>(163, 1),
					new Pair<>(164, 1),
					new Pair<>(165, 1),
					new Pair<>(148, 1),
					new Pair<>(149, 1),
					new Pair<>(150, 1),
					new Pair<>(151, 1),
					new Pair<>(152, 1)
			),

			/* chamber/addon id = 5 */ Arrays.asList(
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

			/* chamber/assembly id = 6 */ Arrays.asList(
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

			/* chamber/end id = 7 */ Arrays.asList(
					new Pair<>(76, 1),
					new Pair<>(77, 1)
			),

			/* chamber/entrance_cap id = 8 */ Collections.singletonList(
                    new Pair<>(5, 1)
            ),

			/* chamber/eruption id = 9 */ Arrays.asList(
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

			/* chamber/pedestal id = 10 */ Arrays.asList(
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
					new Pair<>(65, 1),
					new Pair<>(66, 1),
					new Pair<>(67, 1),
					new Pair<>(68, 1)
			),

			/* chamber/slanted id = 11 */ Arrays.asList(
					new Pair<>(60, 1),
					new Pair<>(61, 1),
					new Pair<>(62, 1),
					new Pair<>(63, 1),
					new Pair<>(65, 1),
					new Pair<>(66, 1),
					new Pair<>(67, 1),
					new Pair<>(68, 1),
					new Pair<>(69, 1),
					new Pair<>(70, 1),
					new Pair<>(71, 1),
					new Pair<>(72, 1),
					new Pair<>(64, 1)
			),

			/* chambers/end id = 12 */ Arrays.asList(
					new Pair<>(1, 1),
					new Pair<>(0, 1),
					new Pair<>(6, 1),
					new Pair<>(8, 1)
			),

			/* chests/supply id = 13 */ Collections.singletonList(
                    new Pair<>(74, 1)
            ),

			/* chests/contents/supply id = 14 */ Collections.singletonList(
                    new Pair<>(73, 1)
            ),

			/* corridor/slices id = 15 */ Arrays.asList(
					new Pair<>(83, 1),
					new Pair<>(84, 2),
					new Pair<>(85, 2),
					new Pair<>(86, 2),
					new Pair<>(87, 2),
					new Pair<>(88, 2),
					new Pair<>(89, 1),
					new Pair<>(90, 2)
			),

			/* corridors/addon/lower id = 16 */ Arrays.asList(
					new Pair<>(191, 8),  // empty pool element
					new Pair<>(103, 1),
					new Pair<>(104, 1),
					new Pair<>(99, 1),
					new Pair<>(91, 1),
					new Pair<>(92, 2)
			),

			/* corridors/addon/middle id = 17 */ Arrays.asList(
					new Pair<>(191, 8),  // empty pool element
					new Pair<>(100, 2),
					new Pair<>(105, 1)
			),

			/* corridors/addon/middle_upper id = 18 */ Arrays.asList(
					new Pair<>(191, 6),  // empty pool element
					new Pair<>(101, 2),
					new Pair<>(93, 1),
					new Pair<>(94, 1),
					new Pair<>(98, 1),
					new Pair<>(102, 1)
			),

			/* decor/bed id = 19 */ Arrays.asList(
					new Pair<>(139, 3),
					new Pair<>(130, 3),
					new Pair<>(126, 3),
					new Pair<>(114, 3),
					new Pair<>(116, 3),
					new Pair<>(136, 3),
					new Pair<>(133, 3),
					new Pair<>(140, 3),
					new Pair<>(131, 3),
					new Pair<>(127, 3),
					new Pair<>(121, 3),
					new Pair<>(129, 3),
					new Pair<>(115, 3),
					new Pair<>(135, 3),
					new Pair<>(132, 3),
					new Pair<>(134, 1)
			),

			/* decor/chamber id = 20 */ Arrays.asList(
					new Pair<>(191, 4),  // empty pool element
					new Pair<>(138, 1)
			),

			/* decor/disposal id = 21 */ Collections.singletonList(
                    new Pair<>(123, 1)
            ),

			/* dispensers/chamber id = 22 */ Arrays.asList(
					new Pair<>(191, 1),  // empty pool element
					new Pair<>(141, 1),
					new Pair<>(143, 1),
					new Pair<>(142, 1)
			),

			/* hallway/fallback id = 23 */ Arrays.asList(
					new Pair<>(158, 1),
					new Pair<>(159, 1),
					new Pair<>(161, 1),
					new Pair<>(160, 1)
			),

			/* reward/all id = 24 */ Collections.singletonList(
                    new Pair<>(171, 1)
            ),

			/* reward/ominous_vault id = 25 */ Collections.singletonList(
                    new Pair<>(170, 1)
            ),

			/* reward/contents/default id = 26 */ Collections.singletonList(
                    new Pair<>(171, 1)
            ),

			/* spawner/all id = 27 */ Arrays.asList(
					new Pair<>(175, 1),
					new Pair<>(174, 1),
					new Pair<>(177, 1)
			),

			/* spawner/breeze id = 28 */ Collections.singletonList(
                    new Pair<>(173, 1)
            ),

			/* spawner/melee id = 29 */ Collections.singletonList(
                    new Pair<>(174, 1)
            ),

			/* spawner/ranged id = 30 */ Collections.singletonList(
                    new Pair<>(175, 1)
            ),

			/* spawner/slow_ranged id = 31 */ Collections.singletonList(
                    new Pair<>(176, 1)
            ),

			/* spawner/small_melee id = 32 */ Collections.singletonList(
                    new Pair<>(177, 1)
            ),

			/* spawner/contents/breeze id = 33 */ Collections.singletonList(
                    new Pair<>(172, 1)
            ),

			/* spawner/melee/husk id = 34 */ Collections.singletonList(
                    new Pair<>(178, 1)
            ),

			/* spawner/melee/spider id = 35 */ Collections.singletonList(
                    new Pair<>(179, 1)
            ),

			/* spawner/melee/zombie id = 36 */ Collections.singletonList(
                    new Pair<>(180, 1)
            ),

			/* spawner/ranged/poison_skeleton id = 37 */ Collections.singletonList(
                    new Pair<>(181, 1)
            ),

			/* spawner/ranged/skeleton id = 38 */ Collections.singletonList(
                    new Pair<>(182, 1)
            ),

			/* spawner/ranged/stray id = 39 */ Collections.singletonList(
                    new Pair<>(183, 1)
            ),

			/* spawner/slow_ranged/poison_skeleton id = 40 */ Collections.singletonList(
                    new Pair<>(184, 1)
            ),

			/* spawner/slow_ranged/skeleton id = 41 */ Collections.singletonList(
                    new Pair<>(185, 1)
            ),

			/* spawner/slow_ranged/stray id = 42 */ Collections.singletonList(
                    new Pair<>(186, 1)
            ),

			/* spawner/small_melee/baby_zombie id = 43 */ Collections.singletonList(
                    new Pair<>(187, 1)
            ),

			/* spawner/small_melee/cave_spider id = 44 */ Collections.singletonList(
                    new Pair<>(188, 1)
            ),

			/* spawner/small_melee/silverfish id = 45 */ Collections.singletonList(
                    new Pair<>(189, 1)
            ),

			/* spawner/small_melee/slime id = 46 */ Collections.singletonList(
                    new Pair<>(190, 1)
            ),

			/* empty id = 47 */ Collections.singletonList(
                    new Pair<>(191, 0) // empty pool element
            )
	);

	public static int[][] CHAMBER_POOLS;
	static {
		CHAMBER_POOLS = new int[CHAMBER_POOLS_V2.size()][];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < CHAMBER_POOLS_V2.size(); i++) {
			List<Pair<Integer, Integer>> pool = CHAMBER_POOLS_V2.get(i);
			for (Pair<Integer, Integer> entry : pool) {
				for (int k = 0; k < entry.getSecond(); k++) {
					list.add(entry.getFirst());
				}
			}
			CHAMBER_POOLS[i] = list.stream().mapToInt(e -> e).toArray();
			list.clear();
		}
	}
}
