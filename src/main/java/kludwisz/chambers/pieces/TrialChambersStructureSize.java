package kludwisz.chambers.pieces;

import com.seedfinding.mccore.util.pos.BPos;

import java.util.Arrays;
import java.util.List;

public class TrialChambersStructureSize {
	public static BPos get(int pieceID) {
		return STRUCTURE_SIZE.get(pieceID);
	}

	// snapshot
//    private static final List<BPos> STRUCTURE_SIZE = Arrays.asList(
//			new BPos(34,19,29),      /* 0 chamber/assembly */
//			new BPos(24,19,29),      /* 1 chamber/chamber_1 */
//			new BPos(24,19,29),      /* 2 chamber/chamber_2 */
//			new BPos(24,14,24),      /* 3 chamber/chamber_4 */
//			new BPos(19,24,14),      /* 4 chamber/chamber_8 */
//			new BPos(5,5,1),         /* 5 chamber/entrance_cap */
//			new BPos(29,14,29),      /* 6 chamber/eruption */
//			new BPos(34,14,34),      /* 7 chamber/pedestal */
//			new BPos(29,14,29),      /* 8 chamber/slanted */
//			new BPos(5,16,5),        /* 9 chamber/addon/c1_breeze */
//			new BPos(5,17,15),       /* 10 chamber/addon/full_corner_column */
//			new BPos(5,17,16),       /* 11 chamber/addon/full_stacked_walkway */
//			new BPos(5,17,16),       /* 12 chamber/addon/full_stacked_walkway_2 */
//			new BPos(5,11,10),       /* 13 chamber/addon/grate_bridge */
//			new BPos(5,8,5),         /* 14 chamber/addon/hanging_platform */
//			new BPos(1,6,5),         /* 15 chamber/addon/lower_staircase_down */
//			new BPos(5,6,5),         /* 16 chamber/addon/short_grate_platform */
//			new BPos(5,4,5),         /* 17 chamber/addon/short_platform */
//			new BPos(11,12,15),      /* 18 chamber/addon/walkway_with_bridge_1 */
//			new BPos(5,7,5),         /* 19 chamber/assembly/cover_1 */
//			new BPos(5,7,5),         /* 20 chamber/assembly/cover_2 */
//			new BPos(5,7,5),         /* 21 chamber/assembly/cover_3 */
//			new BPos(5,7,5),         /* 22 chamber/assembly/cover_4 */
//			new BPos(5,7,5),         /* 23 chamber/assembly/cover_5 */
//			new BPos(5,7,5),         /* 24 chamber/assembly/cover_6 */
//			new BPos(5,4,5),         /* 25 chamber/assembly/cover_7 */
//			new BPos(3,12,3),        /* 26 chamber/assembly/full_column */
//			new BPos(5,5,3),         /* 27 chamber/assembly/hanging_1 */
//			new BPos(5,7,5),         /* 28 chamber/assembly/hanging_2 */
//			new BPos(3,6,3),         /* 29 chamber/assembly/hanging_3 */
//			new BPos(3,6,5),         /* 30 chamber/assembly/hanging_4 */
//			new BPos(3,2,3),         /* 31 chamber/assembly/hanging_5 */
//			new BPos(6,12,11),       /* 32 chamber/assembly/left_staircase_1 */
//			new BPos(6,12,11),       /* 33 chamber/assembly/left_staircase_2 */
//			new BPos(6,12,11),       /* 34 chamber/assembly/left_staircase_3 */
//			new BPos(5,2,5),         /* 35 chamber/assembly/platform_1 */
//			new BPos(6,12,11),       /* 36 chamber/assembly/right_staircase_1 */
//			new BPos(6,12,11),       /* 37 chamber/assembly/right_staircase_2 */
//			new BPos(6,12,11),       /* 38 chamber/assembly/right_staircase_3 */
//			new BPos(5,7,5),         /* 39 chamber/assembly/spawner_1 */
//			new BPos(5,12,11),       /* 40 chamber/eruption/breeze_slice_1 */
//			new BPos(5,12,5),        /* 41 chamber/eruption/center_1 */
//			new BPos(11,12,11),      /* 42 chamber/eruption/quadrant_1 */
//			new BPos(11,12,11),      /* 43 chamber/eruption/quadrant_2 */
//			new BPos(11,12,11),      /* 44 chamber/eruption/quadrant_3 */
//			new BPos(11,12,11),      /* 45 chamber/eruption/quadrant_4 */
//			new BPos(11,12,11),      /* 46 chamber/eruption/quadrant_5 */
//			new BPos(5,12,11),       /* 47 chamber/eruption/slice_1 */
//			new BPos(5,12,11),       /* 48 chamber/eruption/slice_2 */
//			new BPos(5,12,11),       /* 49 chamber/eruption/slice_3 */
//			new BPos(10,12,10),      /* 50 chamber/pedestal/center_1 */
//			new BPos(5,12,11),       /* 51 chamber/pedestal/ominous_slice_1 */
//			new BPos(11,12,11),      /* 52 chamber/pedestal/quadrant_1 */
//			new BPos(11,12,11),      /* 53 chamber/pedestal/quadrant_2 */
//			new BPos(11,12,11),      /* 54 chamber/pedestal/quadrant_3 */
//			new BPos(5,12,11),       /* 55 chamber/pedestal/slice_1 */
//			new BPos(5,12,11),       /* 56 chamber/pedestal/slice_2 */
//			new BPos(5,12,11),       /* 57 chamber/pedestal/slice_3 */
//			new BPos(5,12,11),       /* 58 chamber/pedestal/slice_4 */
//			new BPos(5,12,11),       /* 59 chamber/pedestal/slice_5 */
//			new BPos(5,12,5),        /* 60 chamber/slanted/center */
//			new BPos(5,5,10),        /* 61 chamber/slanted/hallway_1 */
//			new BPos(5,5,10),        /* 62 chamber/slanted/hallway_2 */
//			new BPos(5,5,10),        /* 63 chamber/slanted/hallway_3 */
//			new BPos(5,5,10),        /* 64 chamber/slanted/hallway_4 */
//			new BPos(5,5,10),        /* 65 chamber/slanted/hallway_5 */
//			new BPos(5,7,10),        /* 66 chamber/slanted/ominous_upper_arm_1 */
//			new BPos(10,12,10),      /* 67 chamber/slanted/quadrant_1 */
//			new BPos(10,12,10),      /* 68 chamber/slanted/quadrant_2 */
//			new BPos(10,12,10),      /* 69 chamber/slanted/quadrant_3 */
//			new BPos(10,12,10),      /* 70 chamber/slanted/quadrant_4 */
//			new BPos(5,7,10),        /* 71 chamber/slanted/ramp_1 */
//			new BPos(5,7,10),        /* 72 chamber/slanted/ramp_2 */
//			new BPos(5,7,10),        /* 73 chamber/slanted/ramp_3 */
//			new BPos(5,7,10),        /* 74 chamber/slanted/ramp_4 */
//			new BPos(3,2,3),         /* 75 chests/supply */
//			new BPos(3,1,3),         /* 76 chests/connectors/supply */
//			new BPos(29,20,21),      /* 77 corridor/atrium_1 */
//			new BPos(19,20,19),      /* 78 corridor/end_1 */
//			new BPos(19,20,19),      /* 79 corridor/end_2 */
//			new BPos(19,20,19),      /* 80 corridor/entrance_1 */
//			new BPos(19,20,19),      /* 81 corridor/entrance_2 */
//			new BPos(19,22,19),      /* 82 corridor/entrance_3 */
//			new BPos(19,1,20),       /* 83 corridor/first_plate */
//			new BPos(19,1,20),       /* 84 corridor/second_plate */
//			new BPos(19,19,5),       /* 85 corridor/straight_1 */
//			new BPos(19,19,5),       /* 86 corridor/straight_2 */
//			new BPos(19,19,5),       /* 87 corridor/straight_3 */
//			new BPos(19,19,5),       /* 88 corridor/straight_4 */
//			new BPos(19,19,5),       /* 89 corridor/straight_5 */
//			new BPos(19,19,5),       /* 90 corridor/straight_6 */
//			new BPos(19,19,5),       /* 91 corridor/straight_7 */
//			new BPos(19,19,5),       /* 92 corridor/straight_8 */
//			new BPos(9,2,5),         /* 93 corridor/addon/arrow_dispenser */
//			new BPos(9,2,5),         /* 94 corridor/addon/bridge_lower */
//			new BPos(5,4,3),         /* 95 corridor/addon/chandelier_upper */
//			new BPos(5,4,3),         /* 96 corridor/addon/decoration_upper */
//			new BPos(5,6,5),         /* 97 corridor/addon/display_1 */
//			new BPos(6,8,6),         /* 98 corridor/addon/display_2 */
//			new BPos(6,4,6),         /* 99 corridor/addon/display_3 */
//			new BPos(5,4,3),         /* 100 corridor/addon/head_upper */
//			new BPos(3,8,3),         /* 101 corridor/addon/ladder_to_middle */
//			new BPos(5,10,5),        /* 102 corridor/addon/open_walkway */
//			new BPos(5,4,3),         /* 103 corridor/addon/open_walkway_upper */
//			new BPos(5,4,3),         /* 104 corridor/addon/reward_upper */
//			new BPos(2,2,3),         /* 105 corridor/addon/staircase */
//			new BPos(9,6,5),         /* 106 corridor/addon/wall */
//			new BPos(5,10,5),        /* 107 corridor/addon/walled_walkway */
//			new BPos(7,11,12),       /* 108 corridor/atrium/bogged_relief */
//			new BPos(7,11,12),       /* 109 corridor/atrium/breeze_relief */
//			new BPos(13,8,8),        /* 110 corridor/atrium/grand_staircase_1 */
//			new BPos(13,8,8),        /* 111 corridor/atrium/grand_staircase_2 */
//			new BPos(13,8,8),        /* 112 corridor/atrium/grand_staircase_3 */
//			new BPos(7,14,12),       /* 113 corridor/atrium/spider_relief */
//			new BPos(7,12,12),       /* 114 corridor/atrium/spiral_relief */
//			new BPos(1,2,1),         /* 115 decor/barrel */
//			new BPos(1,2,1),         /* 116 decor/candle_1 */
//			new BPos(1,2,1),         /* 117 decor/candle_2 */
//			new BPos(1,2,1),         /* 118 decor/candle_3 */
//			new BPos(1,2,1),         /* 119 decor/candle_4 */
//			new BPos(1,2,1),         /* 120 decor/dead_bush_pot */
//			new BPos(1,2,1),         /* 121 decor/empty_pot */
//			new BPos(1,2,1),         /* 122 decor/flow_pot */
//			new BPos(1,2,1),         /* 123 decor/guster_pot */
//			new BPos(1,2,1),         /* 124 decor/scrape_pot */
//			new BPos(1,2,1),         /* 125 decor/undecorated_pot */
//			new BPos(2,1,3),         /* 126 dispensers/chamber */
//			new BPos(2,2,1),         /* 127 dispensers/floor_dispenser */
//			new BPos(2,2,3),         /* 128 dispensers/wall_dispenser */
//			new BPos(8,7,15),        /* 129 hallway/cache_1 */
//			new BPos(5,12,5),        /* 130 hallway/corner_staircase */
//			new BPos(5,12,5),        /* 131 hallway/corner_staircase_down */
//			new BPos(5,7,3),         /* 132 hallway/corridor_connector_1 */
//			new BPos(5,7,5),         /* 133 hallway/left_corner */
//			new BPos(5,14,10),       /* 134 hallway/long_straight_staircase */
//			new BPos(5,14,10),       /* 135 hallway/long_straight_staircase_down */
//			new BPos(11,17,5),       /* 136 hallway/lower_hallway_connector */
//			new BPos(5,7,5),         /* 137 hallway/right_corner */
//			new BPos(5,7,4),         /* 138 hallway/rubble */
//			new BPos(5,7,4),         /* 139 hallway/rubble_chamber */
//			new BPos(5,7,1),         /* 140 hallway/rubble_chamber_thin */
//			new BPos(5,7,1),         /* 141 hallway/rubble_thin */
//			new BPos(5,7,5),         /* 142 hallway/straight */
//			new BPos(5,9,5),         /* 143 hallway/straight_staircase */
//			new BPos(5,9,5),         /* 144 hallway/straight_staircase_down */
//			new BPos(11,14,5),       /* 145 hallway/upper_hallway_connector */
//			new BPos(22,20,22),      /* 146 intersection/intersection_1 */
//			new BPos(23,20,22),      /* 147 intersection/intersection_2 */
//			new BPos(21,37,22),      /* 148 intersection/intersection_3 */
//			new BPos(3,4,3),         /* 149 reward/ominous_vault */
//			new BPos(3,3,2),         /* 150 reward/vault */
//			new BPos(3,2,3),         /* 151 spawner/breeze/breeze */
//			new BPos(3,1,3),         /* 152 spawner/connectors/breeze */
//			new BPos(3,1,3),         /* 153 spawner/connectors/melee */
//			new BPos(3,1,3),         /* 154 spawner/connectors/ranged */
//			new BPos(3,1,3),         /* 155 spawner/connectors/slow_ranged */
//			new BPos(3,1,3),         /* 156 spawner/connectors/small_melee */
//			new BPos(3,2,3),         /* 157 spawner/melee/husk */
//			new BPos(3,2,3),         /* 158 spawner/melee/spider */
//			new BPos(3,2,3),         /* 159 spawner/melee/zombie */
//			new BPos(3,2,3),         /* 160 spawner/ranged/poison_skeleton */
//			new BPos(3,2,3),         /* 161 spawner/ranged/skeleton */
//			new BPos(3,2,3),         /* 162 spawner/ranged/stray */
//			new BPos(3,2,3),         /* 163 spawner/slow_ranged/poison_skeleton */
//			new BPos(3,2,3),         /* 164 spawner/slow_ranged/skeleton */
//			new BPos(3,2,3),         /* 165 spawner/slow_ranged/stray */
//			new BPos(3,2,3),         /* 166 spawner/small_melee/baby_zombie */
//			new BPos(3,2,3),         /* 167 spawner/small_melee/cave_spider */
//			new BPos(3,2,3),         /* 168 spawner/small_melee/silverfish */
//			new BPos(3,2,3),         /* 169 spawner/small_melee/slime */
//    		new BPos(-1,-1,-1)		 /* 170 empty */
//    );

	// 1.20.6
	private static final List<BPos> STRUCTURE_SIZE = Arrays.asList(
			new BPos(34,19,29),      /* 0 chamber/assembly.nbt */
			new BPos(24,19,29),      /* 1 chamber/chamber_1.nbt */
			new BPos(24,19,29),      /* 2 chamber/chamber_2.nbt */
			new BPos(24,14,24),      /* 3 chamber/chamber_4.nbt */
			new BPos(19,24,14),      /* 4 chamber/chamber_8.nbt */
			new BPos(5,5,1),         /* 5 chamber/entrance_cap.nbt */
			new BPos(29,14,29),      /* 6 chamber/eruption.nbt */
			new BPos(34,14,34),      /* 7 chamber/pedestal.nbt */
			new BPos(29,14,29),      /* 8 chamber/slanted.nbt */
			new BPos(5,12,15),       /* 9 chamber/addon/10x15_pathway_3.nbt */
			new BPos(5,12,15),       /* 10 chamber/addon/10x15_rise.nbt */
			new BPos(5,12,15),       /* 11 chamber/addon/10x15_stacked_pathway.nbt */
			new BPos(5,16,5),        /* 12 chamber/addon/c1_breeze.nbt */
			new BPos(11,12,15),      /* 13 chamber/addon/c3_side_walkway_1.nbt */
			new BPos(11,12,15),      /* 14 chamber/addon/c3_side_walkway_2.nbt */
			new BPos(6,12,32),       /* 15 chamber/addon/closed_side_walkway.nbt */
			new BPos(11,12,11),      /* 16 chamber/addon/corner_room_1.nbt */
			new BPos(5,17,5),        /* 17 chamber/addon/full_column_ranged_spawner.nbt */
			new BPos(5,17,15),       /* 18 chamber/addon/full_corner_column.nbt */
			new BPos(5,17,16),       /* 19 chamber/addon/full_stacked_walkway.nbt */
			new BPos(5,17,16),       /* 20 chamber/addon/full_stacked_walkway_2.nbt */
			new BPos(5,11,10),       /* 21 chamber/addon/grate_bridge.nbt */
			new BPos(5,7,5),         /* 22 chamber/addon/hanging_platform.nbt */
			new BPos(1,6,5),         /* 23 chamber/addon/lower_staircase_down.nbt */
			new BPos(11,6,5),        /* 24 chamber/addon/lower_walkway_platform.nbt */
			new BPos(5,5,5),         /* 25 chamber/addon/middle_column_ranged_spawner.nbt */
			new BPos(5,12,30),       /* 26 chamber/addon/middle_walkway.nbt */
			new BPos(10,12,10),      /* 27 chamber/addon/platform_with_space.nbt */
			new BPos(5,6,5),         /* 28 chamber/addon/short_grate_platform.nbt */
			new BPos(5,4,5),         /* 29 chamber/addon/short_platform.nbt */
			new BPos(6,12,32),       /* 30 chamber/addon/side_walkway.nbt */
			new BPos(10,12,10),      /* 31 chamber/addon/stairs_with_space.nbt */
			new BPos(10,12,10),      /* 32 chamber/addon/stairs_with_space_2.nbt */
			new BPos(7,6,6),         /* 33 chamber/addon/walkway_extension.nbt */
			new BPos(11,12,15),      /* 34 chamber/addon/walkway_with_bridge_1.nbt */
			new BPos(5,7,5),         /* 35 chamber/assembly/cover_1.nbt */
			new BPos(5,7,5),         /* 36 chamber/assembly/cover_2.nbt */
			new BPos(5,7,5),         /* 37 chamber/assembly/cover_3.nbt */
			new BPos(5,7,5),         /* 38 chamber/assembly/cover_4.nbt */
			new BPos(5,7,5),         /* 39 chamber/assembly/cover_5.nbt */
			new BPos(5,7,5),         /* 40 chamber/assembly/cover_6.nbt */
			new BPos(3,12,3),        /* 41 chamber/assembly/full_column.nbt */
			new BPos(5,5,3),         /* 42 chamber/assembly/hanging_1.nbt */
			new BPos(5,7,5),         /* 43 chamber/assembly/hanging_2.nbt */
			new BPos(3,6,3),         /* 44 chamber/assembly/hanging_3.nbt */
			new BPos(3,6,5),         /* 45 chamber/assembly/hanging_4.nbt */
			new BPos(6,12,11),       /* 46 chamber/assembly/left_staircase_1.nbt */
			new BPos(6,12,11),       /* 47 chamber/assembly/left_staircase_2.nbt */
			new BPos(6,12,11),       /* 48 chamber/assembly/left_staircase_3.nbt */
			new BPos(5,2,5),         /* 49 chamber/assembly/platform_1.nbt */
			new BPos(6,12,11),       /* 50 chamber/assembly/right_staircase_1.nbt */
			new BPos(6,12,11),       /* 51 chamber/assembly/right_staircase_2.nbt */
			new BPos(6,12,11),       /* 52 chamber/assembly/right_staircase_3.nbt */
			new BPos(5,7,5),         /* 53 chamber/assembly/spawner_1.nbt */
			new BPos(5,12,5),        /* 54 chamber/assembly/spawner_trap_1.nbt */
			new BPos(5,12,11),       /* 55 chamber/eruption/breeze_slice_1.nbt */
			new BPos(5,12,5),        /* 56 chamber/eruption/center_1.nbt */
			new BPos(11,12,11),      /* 57 chamber/eruption/quadrant_1.nbt */
			new BPos(11,12,11),      /* 58 chamber/eruption/quadrant_2.nbt */
			new BPos(11,12,11),      /* 59 chamber/eruption/quadrant_3.nbt */
			new BPos(11,12,11),      /* 60 chamber/eruption/quadrant_4.nbt */
			new BPos(11,12,11),      /* 61 chamber/eruption/quadrant_5.nbt */
			new BPos(5,12,11),       /* 62 chamber/eruption/slice_1.nbt */
			new BPos(5,12,11),       /* 63 chamber/eruption/slice_2.nbt */
			new BPos(5,12,11),       /* 64 chamber/eruption/slice_3.nbt */
			new BPos(10,12,10),      /* 65 chamber/pedestal/center_1.nbt */
			new BPos(5,12,11),       /* 66 chamber/pedestal/ominous_slice_1.nbt */
			new BPos(11,12,11),      /* 67 chamber/pedestal/quadrant_1.nbt */
			new BPos(11,12,11),      /* 68 chamber/pedestal/quadrant_2.nbt */
			new BPos(11,12,11),      /* 69 chamber/pedestal/quadrant_3.nbt */
			new BPos(5,12,11),       /* 70 chamber/pedestal/slice_1.nbt */
			new BPos(5,12,11),       /* 71 chamber/pedestal/slice_2.nbt */
			new BPos(5,12,11),       /* 72 chamber/pedestal/slice_3.nbt */
			new BPos(5,12,11),       /* 73 chamber/pedestal/slice_4.nbt */
			new BPos(5,12,11),       /* 74 chamber/pedestal/slice_5.nbt */
			new BPos(5,12,5),        /* 75 chamber/slanted/center.nbt */
			new BPos(5,5,10),        /* 76 chamber/slanted/hallway_1.nbt */
			new BPos(5,5,10),        /* 77 chamber/slanted/hallway_2.nbt */
			new BPos(5,5,10),        /* 78 chamber/slanted/hallway_3.nbt */
			new BPos(5,5,10),        /* 79 chamber/slanted/hallway_4.nbt */
			new BPos(5,5,10),        /* 80 chamber/slanted/hallway_5.nbt */
			new BPos(5,7,10),        /* 81 chamber/slanted/ominous_upper_arm_1.nbt */
			new BPos(10,12,10),      /* 82 chamber/slanted/quadrant_1.nbt */
			new BPos(10,12,10),      /* 83 chamber/slanted/quadrant_2.nbt */
			new BPos(10,12,10),      /* 84 chamber/slanted/quadrant_3.nbt */
			new BPos(10,12,10),      /* 85 chamber/slanted/quadrant_4.nbt */
			new BPos(5,7,10),        /* 86 chamber/slanted/ramp_1.nbt */
			new BPos(5,7,10),        /* 87 chamber/slanted/ramp_2.nbt */
			new BPos(5,7,10),        /* 88 chamber/slanted/ramp_3.nbt */
			new BPos(5,7,10),        /* 89 chamber/slanted/ramp_4.nbt */
			new BPos(3,2,3),         /* 90 chests/supply.nbt */
			new BPos(3,1,3),         /* 91 chests/connectors/supply.nbt */
			new BPos(29,20,21),      /* 92 corridor/atrium_1.nbt */
			new BPos(19,20,19),      /* 93 corridor/end_1.nbt */
			new BPos(19,20,19),      /* 94 corridor/end_2.nbt */
			new BPos(19,20,19),      /* 95 corridor/entrance_1.nbt */
			new BPos(19,1,20),       /* 96 corridor/first_plate.nbt */
			new BPos(19,1,20),       /* 97 corridor/second_plate.nbt */
			new BPos(19,19,5),       /* 98 corridor/straight_1.nbt */
			new BPos(19,19,5),       /* 99 corridor/straight_2.nbt */
			new BPos(19,19,5),       /* 100 corridor/straight_3.nbt */
			new BPos(19,19,5),       /* 101 corridor/straight_4.nbt */
			new BPos(19,19,5),       /* 102 corridor/straight_5.nbt */
			new BPos(19,19,5),       /* 103 corridor/straight_6.nbt */
			new BPos(19,19,5),       /* 104 corridor/straight_7.nbt */
			new BPos(19,19,5),       /* 105 corridor/straight_8.nbt */
			new BPos(9,2,5),         /* 106 corridor/addon/arrow_dispenser.nbt */
			new BPos(9,2,5),         /* 107 corridor/addon/bridge_lower.nbt */
			new BPos(5,4,3),         /* 108 corridor/addon/chandelier_upper.nbt */
			new BPos(5,4,3),         /* 109 corridor/addon/decoration_upper.nbt */
			new BPos(5,4,3),         /* 110 corridor/addon/head_upper.nbt */
			new BPos(3,8,3),         /* 111 corridor/addon/ladder_to_middle.nbt */
			new BPos(5,10,5),        /* 112 corridor/addon/open_walkway.nbt */
			new BPos(5,4,3),         /* 113 corridor/addon/open_walkway_upper.nbt */
			new BPos(5,4,3),         /* 114 corridor/addon/reward_upper.nbt */
			new BPos(2,2,3),         /* 115 corridor/addon/staircase.nbt */
			new BPos(9,6,5),         /* 116 corridor/addon/wall.nbt */
			new BPos(5,10,5),        /* 117 corridor/addon/walled_walkway.nbt */
			new BPos(7,11,12),       /* 118 corridor/atrium/bogged_relief.nbt */
			new BPos(7,11,12),       /* 119 corridor/atrium/breeze_relief.nbt */
			new BPos(13,8,8),        /* 120 corridor/atrium/grand_staircase_1.nbt */
			new BPos(13,8,8),        /* 121 corridor/atrium/grand_staircase_2.nbt */
			new BPos(13,8,8),        /* 122 corridor/atrium/grand_staircase_3.nbt */
			new BPos(7,14,12),       /* 123 corridor/atrium/spider_relief.nbt */
			new BPos(7,12,12),       /* 124 corridor/atrium/spiral_relief.nbt */
			new BPos(1,2,1),         /* 125 decor/barrel.nbt */
			new BPos(1,2,1),         /* 126 decor/candle_1.nbt */
			new BPos(1,2,1),         /* 127 decor/candle_2.nbt */
			new BPos(1,2,1),         /* 128 decor/candle_3.nbt */
			new BPos(1,2,1),         /* 129 decor/candle_4.nbt */
			new BPos(1,2,1),         /* 130 decor/dead_bush_pot.nbt */
			new BPos(1,2,1),         /* 131 decor/empty_pot.nbt */
			new BPos(1,2,1),         /* 132 decor/flow_pot.nbt */
			new BPos(1,2,1),         /* 133 decor/guster_pot.nbt */
			new BPos(1,2,1),         /* 134 decor/scrape_pot.nbt */
			new BPos(1,2,1),         /* 135 decor/undecorated_pot.nbt */
			new BPos(2,1,3),         /* 136 dispensers/chamber.nbt */
			new BPos(2,2,1),         /* 137 dispensers/floor_dispenser.nbt */
			new BPos(2,2,3),         /* 138 dispensers/wall_dispenser.nbt */
			new BPos(8,7,15),        /* 139 hallway/cache_1.nbt */
			new BPos(5,12,5),        /* 140 hallway/corner_staircase.nbt */
			new BPos(5,12,5),        /* 141 hallway/corner_staircase_down.nbt */
			new BPos(5,7,3),         /* 142 hallway/corridor_connector_1.nbt */
			new BPos(5,7,5),         /* 143 hallway/left_corner.nbt */
			new BPos(5,14,10),       /* 144 hallway/long_straight_staircase.nbt */
			new BPos(5,14,10),       /* 145 hallway/long_straight_staircase_down.nbt */
			new BPos(11,17,5),       /* 146 hallway/lower_hallway_connector.nbt */
			new BPos(5,7,5),         /* 147 hallway/right_corner.nbt */
			new BPos(5,7,4),         /* 148 hallway/rubble.nbt */
			new BPos(5,7,4),         /* 149 hallway/rubble_chamber.nbt */
			new BPos(5,7,1),         /* 150 hallway/rubble_chamber_thin.nbt */
			new BPos(5,7,1),         /* 151 hallway/rubble_thin.nbt */
			new BPos(5,7,5),         /* 152 hallway/straight.nbt */
			new BPos(5,9,5),         /* 153 hallway/straight_staircase.nbt */
			new BPos(5,9,5),         /* 154 hallway/straight_staircase_down.nbt */
			new BPos(11,14,5),       /* 155 hallway/upper_hallway_connector.nbt */
			new BPos(22,20,22),      /* 156 intersection/intersection_1.nbt */
			new BPos(23,20,22),      /* 157 intersection/intersection_2.nbt */
			new BPos(21,37,22),      /* 158 intersection/intersection_3.nbt */
			new BPos(3,4,3),         /* 159 reward/ominous_vault.nbt */
			new BPos(3,3,2),         /* 160 reward/vault.nbt */
			new BPos(3,2,3),         /* 161 spawner/breeze/breeze.nbt */
			new BPos(3,1,3),         /* 162 spawner/connectors/breeze.nbt */
			new BPos(3,1,3),         /* 163 spawner/connectors/melee.nbt */
			new BPos(3,1,3),         /* 164 spawner/connectors/ranged.nbt */
			new BPos(3,1,3),         /* 165 spawner/connectors/slow_ranged.nbt */
			new BPos(3,1,3),         /* 166 spawner/connectors/small_melee.nbt */
			new BPos(3,2,3),         /* 167 spawner/melee/husk.nbt */
			new BPos(3,2,3),         /* 168 spawner/melee/slime.nbt */
			new BPos(3,2,3),         /* 169 spawner/melee/zombie.nbt */
			new BPos(3,2,3),         /* 170 spawner/ranged/poison_skeleton.nbt */
			new BPos(3,2,3),         /* 171 spawner/ranged/skeleton.nbt */
			new BPos(3,2,3),         /* 172 spawner/ranged/stray.nbt */
			new BPos(3,2,3),         /* 173 spawner/slow_ranged/poison_skeleton.nbt */
			new BPos(3,2,3),         /* 174 spawner/slow_ranged/skeleton.nbt */
			new BPos(3,2,3),         /* 175 spawner/slow_ranged/stray.nbt */
			new BPos(3,2,3),         /* 176 spawner/small_melee/baby_zombie.nbt */
			new BPos(3,2,3),         /* 177 spawner/small_melee/cave_spider.nbt */
			new BPos(3,2,3),         /* 178 spawner/small_melee/silverfish.nbt */
			new BPos(3,2,3),         /* 179 spawner/small_melee/spider.nbt */
			new BPos(-1,-1,-1)		 /* 180 empty */
	);
}

