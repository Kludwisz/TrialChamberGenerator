package kludwisz.chambers.pieces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mcfeature.loot.LootTable;

import kludwisz.chambers.loot.TrialChambersLootTables;

public class TrialChambersStructureLoot {
	public static List<Pair<BPos,LootTable>> get(int pieceID) {
		return STRUCTURE_LOOT.get(pieceID);
	}
	
	private static final List< List<Pair<BPos,LootTable>> > STRUCTURE_LOOT = Arrays.<List<Pair<BPos, LootTable>>>asList(
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.singletonList(
					new Pair<>( new BPos(22,4,24), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/chamber/chamber_2.nbt
			),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.singletonList(
					new Pair<>( new BPos(2,6,2), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/chamber/eruption/center_1.nbt
			),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.singletonList(
					new Pair<>( new BPos(1,1,1), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:chest in piece trial_chambers_jigsaws/chests/supply.nbt
			),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.singletonList(
					new Pair<>( new BPos(9,3,6), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:chest in piece trial_chambers_jigsaws/corridor/end_2.nbt
			),
			Arrays.asList(
					new Pair<>( new BPos(6,3,7), TrialChambersLootTables.UNIMPLEMENTED.get()),  // minecraft:chest in piece trial_chambers_jigsaws/corridor/entrance_1.nbt
					new Pair<>( new BPos(4,9,14), TrialChambersLootTables.UNIMPLEMENTED.get()),  // minecraft:chest in piece trial_chambers_jigsaws/corridor/entrance_1.nbt
					new Pair<>( new BPos(9,9,14), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:chest in piece trial_chambers_jigsaws/corridor/entrance_1.nbt
			),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.singletonList(
					new Pair<>( new BPos(1,0,2), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/corridor/addon/arrow_dispenser.nbt
			),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.singletonList(
					new Pair<>( new BPos(0,1,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:barrel in piece trial_chambers_jigsaws/decor/barrel.nbt
			),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.singletonList(
					new Pair<>( new BPos(0,1,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:decorated_pot in piece trial_chambers_jigsaws/decor/flow_pot.nbt
			),
			Collections.singletonList(
					new Pair<>( new BPos(0,1,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:decorated_pot in piece trial_chambers_jigsaws/decor/guster_pot.nbt
			),
			Collections.singletonList(
					new Pair<>( new BPos(0,1,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:decorated_pot in piece trial_chambers_jigsaws/decor/scrape_pot.nbt
			),
			Collections.singletonList(
					new Pair<>( new BPos(0,1,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:decorated_pot in piece trial_chambers_jigsaws/decor/undecorated_pot.nbt
			),
			Collections.singletonList(
					new Pair<>( new BPos(1,0,1), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/dispensers/chamber.nbt
			),
			Collections.singletonList(
					new Pair<>( new BPos(1,0,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/dispensers/floor_dispenser.nbt
			),
			Collections.singletonList(
					new Pair<>( new BPos(0,0,1), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/dispensers/wall_dispenser.nbt
			),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.singletonList(
					new Pair<>( new BPos(2,2,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:chest in piece trial_chambers_jigsaws/hallway/rubble.nbt
			),
			Collections.singletonList(
					new Pair<>( new BPos(2,2,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:chest in piece trial_chambers_jigsaws/hallway/rubble_chamber.nbt
			),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Arrays.asList(
					new Pair<>( new BPos(5,8,13), TrialChambersLootTables.UNIMPLEMENTED.get()),  // minecraft:decorated_pot in piece trial_chambers_jigsaws/intersection/intersection_2.nbt
					new Pair<>( new BPos(13,8,3), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:barrel in piece trial_chambers_jigsaws/intersection/intersection_2.nbt
			),
			Collections.singletonList(
					new Pair<>( new BPos(13,15,10), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:barrel in piece trial_chambers_jigsaws/intersection/intersection_3.nbt
			),
			Collections.singletonList(
					new Pair<>( new BPos(1,1,1), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:vault in piece trial_chambers_jigsaws/reward/ominous_vault.nbt
			),
			Collections.singletonList(
					new Pair<>( new BPos(1,2,1), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:vault in piece trial_chambers_jigsaws/reward/vault.nbt
			),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList(),
			Collections.emptyList()  // empty
	);
}
