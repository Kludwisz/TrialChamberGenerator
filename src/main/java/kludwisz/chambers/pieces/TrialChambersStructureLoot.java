package kludwisz.chambers.pieces;

import java.util.List;

import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mcfeature.loot.LootTable;

import kludwisz.chambers.loot.TrialChambersLootTables;

public class TrialChambersStructureLoot {
	public static List<Pair<BPos,LootTable>> get(int pieceID) {
		return STRUCTURE_LOOT.get(pieceID);
	}
	
	private static final List< List<Pair<BPos,LootTable>> > STRUCTURE_LOOT = List.of(
			List.of(),
			List.of(
				new Pair<>( new BPos(22,4,24), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/chamber/chamber_2.nbt
			),
			List.of(),
			List.of(
				new Pair<>( new BPos(14,7,14), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/chamber/chamber_5.nbt
			),
			List.of(
				new Pair<>( new BPos(29,10,19), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/chamber/chamber_6.nbt
			),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(
				new Pair<>( new BPos(1,1,1), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:chest in piece trial_chambers_jigsaws/chests/supply.nbt
			),
			List.of(),
			List.of(),
			List.of(
				new Pair<>( new BPos(9,3,7), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:chest in piece trial_chambers_jigsaws/corridor/end_2.nbt
			),
			List.of(
				new Pair<>( new BPos(6,3,7), TrialChambersLootTables.UNIMPLEMENTED.get()),  // minecraft:chest in piece trial_chambers_jigsaws/corridor/entrance_1.nbt
				new Pair<>( new BPos(4,9,14), TrialChambersLootTables.UNIMPLEMENTED.get()),  // minecraft:chest in piece trial_chambers_jigsaws/corridor/entrance_1.nbt
				new Pair<>( new BPos(9,9,14), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:chest in piece trial_chambers_jigsaws/corridor/entrance_1.nbt
			),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(
				new Pair<>( new BPos(1,0,2), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/corridor/addon/arrow_dispenser.nbt
			),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(
				new Pair<>( new BPos(0,1,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:barrel in piece trial_chambers_jigsaws/decor/barrel.nbt
			),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(
				new Pair<>( new BPos(0,1,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:decorated_pot in piece trial_chambers_jigsaws/decor/flow_pot.nbt
			),
			List.of(
				new Pair<>( new BPos(0,1,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:decorated_pot in piece trial_chambers_jigsaws/decor/guster_pot.nbt
			),
			List.of(
				new Pair<>( new BPos(0,1,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:decorated_pot in piece trial_chambers_jigsaws/decor/scrape_pot.nbt
			),
			List.of(
				new Pair<>( new BPos(0,1,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:decorated_pot in piece trial_chambers_jigsaws/decor/undecorated_pot.nbt
			),
			List.of(
				new Pair<>( new BPos(1,0,1), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:dispenser in piece trial_chambers_jigsaws/dispensers/chamber.nbt
			),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(
				new Pair<>( new BPos(2,2,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:chest in piece trial_chambers_jigsaws/hallway/rubble.nbt
			),
			List.of(
				new Pair<>( new BPos(2,2,0), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:chest in piece trial_chambers_jigsaws/hallway/rubble_chamber.nbt
			),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(
				new Pair<>( new BPos(13,8,3), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:barrel in piece trial_chambers_jigsaws/intersection/intersection_1.nbt
			),
			List.of(
				new Pair<>( new BPos(9,3,15), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:barrel in piece trial_chambers_jigsaws/intersection/intersection_2.nbt
			),
			List.of(
				new Pair<>( new BPos(1,1,1), TrialChambersLootTables.UNIMPLEMENTED.get())  // minecraft:vault in piece trial_chambers_jigsaws/reward/default.nbt
			),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of(),
			List.of()  // empty
	);
}
