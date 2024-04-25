package kludwisz.chambers.loot;

import java.util.function.Supplier;

import com.seedfinding.mcfeature.loot.LootPool;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.entry.ItemEntry;
import com.seedfinding.mcfeature.loot.function.ApplyDamageFunction;
import com.seedfinding.mcfeature.loot.function.SetCountFunction;
import com.seedfinding.mcfeature.loot.roll.ConstantRoll;
import com.seedfinding.mcfeature.loot.roll.UniformRoll;

@SuppressWarnings("unused")
public class TrialChambersLootTables {

	public static final Supplier<LootTable> UNIMPLEMENTED = LootTable::new;
	
	// TODO
	public static final Supplier<LootTable> VAULT = () -> new LootTable(
			new LootPool(new ConstantRoll(0))
	);

	// TODO
	public static final Supplier<LootTable> OMINOUS_VAULT = () -> new LootTable(
			new LootPool(new ConstantRoll(0))
	);
	
	// TODO
	public static final Supplier<LootTable> DECORATED_POT = () -> new LootTable(
			new LootPool(new ConstantRoll(0))
	);
	
	// TODO
	public static final Supplier<LootTable> INTERSECTION_BARREL = () -> new LootTable(
			new LootPool(new ConstantRoll(0))
	);
	
	
	public static final Supplier<LootTable> ENTRANCE_CHEST = () -> new LootTable(
			new LootPool(new UniformRoll(2.0F, 3.0F),
				new ItemEntry(Items.ARROW, 10).apply(version -> SetCountFunction.uniform(5.0F, 10.0F)),
				new ItemEntry(Items.HONEYCOMB, 10).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
				new ItemEntry(Items.WOODEN_AXE, 10),
				new ItemEntry(Items.STICK, 5).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
				new ItemEntry(Items.TRIAL_KEY, 1)
			)
	);
	
	public static final Supplier<LootTable> CORRIDOR_BARREL = () -> new LootTable(
			new LootPool(new UniformRoll(1.0F, 3.0F),
				new ItemEntry(Items.TUFF, 3).apply(version -> SetCountFunction.uniform(8.0F, 20.0F)),
				new ItemEntry(Items.SCAFFOLDING, 2).apply(version -> SetCountFunction.uniform(2.0F, 10.0F)),
				new ItemEntry(Items.BAMBOO_PLANKS, 2).apply(version -> SetCountFunction.uniform(3.0F, 6.0F)),
				new ItemEntry(Items.TORCH, 2).apply(version -> SetCountFunction.uniform(3.0F, 6.0F)),
				new ItemEntry(Items.BAMBOO_HANGING_SIGN, 2).apply(version -> SetCountFunction.uniform(1.0F, 4.0F)),
				new ItemEntry(Items.ENDER_PEARL, 2).apply(version -> SetCountFunction.uniform(1.0F, 2.0F)),
				new ItemEntry(Items.STONE_AXE, 2).apply(version -> new ApplyDamageFunction()),
				new ItemEntry(Items.STONE_PICKAXE, 2).apply(version -> new ApplyDamageFunction()),
				new ItemEntry(Items.HONEYCOMB, 1).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
				new ItemEntry(Items.IRON_AXE, 1).apply(version -> new ApplyDamageFunction())
			)
	);
	
	public static final Supplier<LootTable> INTERSECTION_CHEST = () -> new LootTable(
			new LootPool(new UniformRoll(1.0F, 3.0F),
				new ItemEntry(Items.AMETHYST_SHARD, 20).apply(version -> SetCountFunction.uniform(8.0F, 20.0F)),
				new ItemEntry(Items.CAKE, 20).apply(version -> SetCountFunction.uniform(1.0F, 4.0F), version -> SetCountFunction.constant(1)),
				new ItemEntry(Items.IRON_BLOCK, 20).apply(version -> SetCountFunction.uniform(1.0F, 2.0F)),
				new ItemEntry(Items.DIAMOND, 10).apply(version -> SetCountFunction.uniform(1.0F, 2.0F)),
				new ItemEntry(Items.EMERALD_BLOCK, 5).apply(version -> SetCountFunction.uniform(1.0F, 3.0F)),
				new ItemEntry(Items.DIAMOND_AXE, 5).apply(version -> new ApplyDamageFunction()),
				new ItemEntry(Items.DIAMOND_PICKAXE, 5).apply(version -> new ApplyDamageFunction()),
				new ItemEntry(Items.DIAMOND_BLOCK, 1)
			)
	);

	public static final Supplier<LootTable> SUPPLY_CHEST = () -> new LootTable(
			new LootPool(new UniformRoll(3.0F, 5.0F),
				new ItemEntry(Items.ARROW, 2).apply(version -> SetCountFunction.uniform(4.0F, 14.0F)),
				new ItemEntry(Items.GLOW_BERRIES, 2).apply(version -> SetCountFunction.uniform(2.0F, 10.0F)),
				new ItemEntry(Items.BAKED_POTATO, 2).apply(version -> SetCountFunction.uniform(2.0F, 4.0F)),
				new ItemEntry(Items.STONE_PICKAXE, 1).apply(version -> new ApplyDamageFunction()),
				new ItemEntry(Items.TUFF, 1).apply(version -> SetCountFunction.uniform(5.0F, 10.0F)),
				new ItemEntry(Items.ARROW_OF_POISON, 1).apply(version -> SetCountFunction.uniform(4.0F, 8.0F)),
				new ItemEntry(Items.ARROW_OF_SLOWNESS, 1).apply(version -> SetCountFunction.uniform(4.0F, 8.0F)),
				new ItemEntry(Items.ACACIA_PLANKS, 1).apply(version -> SetCountFunction.uniform(3.0F, 6.0F)),
				new ItemEntry(Items.TORCH, 1).apply(version -> SetCountFunction.uniform(3.0F, 6.0F)),
				new ItemEntry(Items.BONE_MEAL, 1).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
				new ItemEntry(Items.MOSS_BLOCK, 1).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
				new ItemEntry(Items.REGENERATION_POTION, 1), //.apply(version -> SetCountFunction.constant(2)),
				new ItemEntry(Items.STRENGTH_POTION, 1),     //.apply(version -> SetCountFunction.constant(2)),
				new ItemEntry(Items.MILK_BUCKET, 1)
			)
	);
}
