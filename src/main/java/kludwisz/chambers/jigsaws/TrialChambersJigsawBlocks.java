package kludwisz.chambers.jigsaws;

import java.util.List;

import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;

public class TrialChambersJigsawBlocks {
	public static List<JigsawBlock> get(int pieceID) {
		return JIGSAW_BLOCKS.get(pieceID);
	}
	
    private static final List<List<JigsawBlock>> JIGSAW_BLOCKS = List.<List<JigsawBlock>>of(
			// chamber/assembly id = 0
			List.of(
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(29,3,12), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(33,3,14), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(14,5,4), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(14,5,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(14,5,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(14,5,24), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(19,5,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(19,5,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(19,5,24), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(24,5,4), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(24,5,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(24,5,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(24,5,24), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,8,1), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,8,1), 0, 0),
					new JigsawBlock(25, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(23,8,14), 1, 1),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(28,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(30,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,23), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,10,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(4,10,9), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(4,10,19), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,10,14), 1, 1),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:right_staircase", BlockDirection.NORTH, BlockDirection.UP, new BPos(29,13,12), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:left_staircase", BlockDirection.SOUTH, BlockDirection.UP, new BPos(29,13,16), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(33,13,14), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.NORTH, BlockDirection.UP, new BPos(19,14,4), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(14,17,4), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(14,17,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(14,17,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(14,17,24), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(19,17,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(19,17,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(19,17,24), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(24,17,4), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(24,17,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(24,17,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(24,17,24), 0, 0)
			),
// chamber/chamber_1 id = 1
			List.of( // FIXME unresolved aliases, investigate
					new JigsawBlock(/* USES ALIAS chamber/addon/c6 */ -1, JointType.ROLLABLE, "minecraft:empty", "minecraft:c6_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,7), 0, 0),
					new JigsawBlock(/* USES ALIAS chamber/addon/c6 */ -1, JointType.ROLLABLE, "minecraft:empty", "minecraft:c6_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(14,0,21), 0, 0),
					new JigsawBlock(5, JointType.ALIGNED, "minecraft:empty", "minecraft:c1_breeze", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,1,12), 2, 2),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,23), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,14), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:middle_start", BlockDirection.WEST, BlockDirection.UP, new BPos(22,8,14), 1, 1),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(23,8,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,13,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,10), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.EAST, BlockDirection.UP, new BPos(1,13,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,13,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,13,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,28), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,13,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,13,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,13,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,13,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,23), 0, 0)
			),
// chamber/chamber_2 id = 2
			List.of(
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,15), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,3,1), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.EAST, BlockDirection.UP, new BPos(6,3,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,3,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,3,16), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,18), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:empty", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(21,4,24), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(9,8,14), 1, 1),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:middle_start", BlockDirection.WEST, BlockDirection.UP, new BPos(22,8,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(23,8,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,13,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,10), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.EAST, BlockDirection.UP, new BPos(1,13,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,13,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(7,13,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,12), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,16), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,28), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(11,13,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,13,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,13,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,13,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,13,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,23), 0, 0)
			),
// chamber/chamber_4 id = 3
			List.of(
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,14), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(4,3,4), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,8,0), 0, 0),
					new JigsawBlock(29, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,8,14), 1, 1),
					new JigsawBlock(29, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(19,8,9), 1, 1),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(19,8,19), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,9,3), 0, 0)
			),
// chamber/chamber_8 id = 4
			List.of(
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,10), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,3,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,3,9), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,3,12), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,12), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,3,9), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,3,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,8,1), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,8,4), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,8,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,13,12), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,10), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,13,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,13,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,18,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,18,1), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,18,4), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,18,4), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,18,1), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,18,4), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,18,3), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.WEST, BlockDirection.UP, new BPos(3,19,9), 0, 0)
			),
// chamber/entrance_cap id = 5
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:entrance_cap", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0)
			),
// chamber/eruption id = 6
			List.of(
					new JigsawBlock(9, JointType.ALIGNED, "minecraft:empty", "minecraft:center", BlockDirection.UP, BlockDirection.NORTH, new BPos(12,0,12), 0, 1),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,3,0), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,3,28), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,14), 0, 0)
			),
// chamber/pedestal id = 7
			List.of(
					new JigsawBlock(10, JointType.ALIGNED, "minecraft:empty", "minecraft:center", BlockDirection.UP, BlockDirection.NORTH, new BPos(16,0,15), 2, 2),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,15), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,30), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(28,3,1), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:empty", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(29,3,4), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(30,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,23), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,28), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(33,3,19), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,15), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,30), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,8,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,8,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,8,32), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(19,8,0), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,8,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,8,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(28,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(30,8,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,23), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,28), 0, 0)
			),
// chamber/slanted id = 8
			List.of(
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:center", BlockDirection.UP, BlockDirection.EAST, new BPos(14,0,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,3,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,3,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,3,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,3,23), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(28,3,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,8,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,8,0), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,23), 0, 0)
			),
// chamber/addon/10x15_pathway_3 id = 9
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:entrance_5x15", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/addon/10x15_rise id = 10
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:entrance_5x15", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/addon/10x15_stacked_pathway id = 11
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:entrance_5x15", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/addon/c1_breeze id = 12
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:c1_breeze", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,1,4), 0, 0),
					new JigsawBlock(25, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,6,2), 1, 1),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(0,11,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,11,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,11,4), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(4,11,2), 0, 0)
			),
// chamber/addon/c3_side_walkway_1 id = 13
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:c3_side_walkway", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,0), 0, 0)
			),
// chamber/addon/c3_side_walkway_2 id = 14
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:c3_side_walkway", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,0), 0, 0)
			),
// chamber/addon/closed_side_walkway id = 15
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:full_room_side_platform", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,18), 0, 0)
			),
// chamber/addon/corner_room_1 id = 16
			List.of(
					new JigsawBlock(29, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,3), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:c3_corner_room", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,6,2), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(8,7,3), 0, 0)
			),
// chamber/addon/full_column_ranged_spawner id = 17
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:three_column_start", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 1, 1),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,4,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(1,4,4), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(3,4,0), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(4,4,3), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,7,2), 1, 1),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(0,12,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,12,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,12,4), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,2), 0, 0)
			),
// chamber/addon/full_corner_column id = 18
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:", BlockDirection.WEST, BlockDirection.UP, new BPos(0,12,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,12,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,2), 0, 0)
			),
// chamber/addon/full_stacked_walkway id = 19
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:middle_start", "minecraft:", BlockDirection.EAST, BlockDirection.UP, new BPos(4,7,3), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,12,13), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,3), 0, 0)
			),
// chamber/addon/full_stacked_walkway_2 id = 20
			List.of(
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1,4,2), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1,4,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:middle_start", "minecraft:", BlockDirection.EAST, BlockDirection.UP, new BPos(4,7,3), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,12,8), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,12,13), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,3), 0, 0)
			),
// chamber/addon/grate_bridge id = 21
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,6,0), 0, 0)
			),
// chamber/addon/hanging_platform id = 22
			List.of(
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,2), 0, 0)
			),
// chamber/addon/lower_staircase_down id = 23
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_addon_extension", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0,2,2), 0, 0)
			),
// chamber/addon/lower_walkway_platform id = 24
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_start", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:lower_walkable_extension", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,4), 0, 0)
			),
// chamber/addon/middle_column_ranged_spawner id = 25
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:two_column_start", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 1, 1),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,4), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,4,2), 1, 1)
			),
// chamber/addon/middle_walkway id = 26
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_two_high", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,17), 0, 0)
			),
// chamber/addon/platform_with_space id = 27
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:platform_with_space", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,6,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,7,7), 0, 0)
			),
// chamber/addon/short_grate_platform id = 28
			List.of(
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,4), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,2), 0, 0)
			),
// chamber/addon/short_platform id = 29
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,2), 0, 0)
			),
// chamber/addon/side_walkway id = 30
			List.of(
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:empty", "minecraft:dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,4,17), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:full_room_side_platform", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,18), 0, 0)
			),
// chamber/addon/stairs_with_space id = 31
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:platform_with_space", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,6,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,7,7), 0, 0)
			),
// chamber/addon/stairs_with_space_2 id = 32
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:platform_with_space", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,6,0), 0, 0)
			),
// chamber/addon/walkway_extension id = 33
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_walkable_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,2,0), 0, 0)
			),
// chamber/addon/walkway_with_bridge_1 id = 34
			List.of(

			),
// chamber/assembly/cover_1 id = 35
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0)
			),
// chamber/assembly/cover_2 id = 36
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:floor_dispenser", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(3,4,2), 0, 0)
			),
// chamber/assembly/cover_3 id = 37
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0)
			),
// chamber/assembly/cover_4 id = 38
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0)
			),
// chamber/assembly/cover_5 id = 39
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:floor_dispenser", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,4,2), 0, 0)
			),
// chamber/assembly/cover_6 id = 40
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "minecraft:floor_dispenser", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,4,2), 0, 0)
			),
// chamber/assembly/full_column id = 41
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1,0,1), 0, 0)
			),
// chamber/assembly/hanging_1 id = 42
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_addon", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,3,1), 0, 0)
			),
// chamber/assembly/hanging_2 id = 43
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_addon", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,5,2), 0, 0)
			),
// chamber/assembly/hanging_3 id = 44
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_addon", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,4,2), 0, 0)
			),
// chamber/assembly/hanging_4 id = 45
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_addon", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,4,2), 0, 0)
			),
// chamber/assembly/left_staircase_1 id = 46
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:right_staircase", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,10), 0, 0)
			),
// chamber/assembly/left_staircase_2 id = 47
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:right_staircase", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,10), 0, 0)
			),
// chamber/assembly/left_staircase_3 id = 48
			List.of(
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,8), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:right_staircase", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,10), 0, 0)
			),
// chamber/assembly/platform_1 id = 49
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:c6_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 0, 0)
			),
// chamber/assembly/right_staircase_1 id = 50
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:left_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/assembly/right_staircase_2 id = 51
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:left_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/assembly/right_staircase_3 id = 52
			List.of(
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,2), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:left_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/assembly/spawner_1 id = 53
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0)
			),
// chamber/assembly/spawner_trap_1 id = 54
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,4,2), 1, 1)
			),
// chamber/eruption/breeze_slice_1 id = 55
			List.of(
					new JigsawBlock(25, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,4,8), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:breeze_slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,8,7), 0, 0)
			),
// chamber/eruption/center_1 id = 56
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:center", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(3,1,2), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,2), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,5,4), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:breeze_slice", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,2), 0, 0)
			),
// chamber/eruption/quadrant_1 id = 57
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0)
			),
// chamber/eruption/quadrant_2 id = 58
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,7,2), 0, 0)
			),
// chamber/eruption/quadrant_3 id = 59
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,9,2), 0, 0)
			),
// chamber/eruption/quadrant_4 id = 60
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(8,7,8), 0, 0)
			),
// chamber/eruption/quadrant_5 id = 61
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(8,7,8), 0, 0)
			),
// chamber/eruption/slice_1 id = 62
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,5), 0, 0)
			),
// chamber/eruption/slice_2 id = 63
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0)
			),
// chamber/eruption/slice_3 id = 64
			List.of(
					new JigsawBlock(26, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,4), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0)
			),
// chamber/pedestal/center_1 id = 65
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:center", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(4,0,3), 2, 2),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,9), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_slice", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,9), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,7), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,9,6), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(6,9,3), 1, 1),
					new JigsawBlock(25, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,9,6), 1, 1)
			),
// chamber/pedestal/ominous_slice_1 id = 66
			List.of(
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:ominous_slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,7), 0, 0)
			),
// chamber/pedestal/quadrant_1 id = 67
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 0)
			),
// chamber/pedestal/quadrant_2 id = 68
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0)
			),
// chamber/pedestal/quadrant_3 id = 69
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0)
			),
// chamber/pedestal/slice_1 id = 70
			List.of(
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,8), 0, 0)
			),
// chamber/pedestal/slice_2 id = 71
			List.of(
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,7), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/pedestal/slice_3 id = 72
			List.of(
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,7), 0, 0)
			),
// chamber/pedestal/slice_4 id = 73
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(3,2,7), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/pedestal/slice_5 id = 74
			List.of(
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,7), 0, 0)
			),
// chamber/slanted/center id = 75
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:center", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_arm", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_arm", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_arm", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,4), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_arm", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_arm", BlockDirection.WEST, BlockDirection.UP, new BPos(0,7,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_arm", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0),
					new JigsawBlock(25, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,2), 1, 1),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_upper_arm", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,4), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_arm", BlockDirection.EAST, BlockDirection.UP, new BPos(4,7,2), 0, 0)
			),
// chamber/slanted/hallway_1 id = 76
			List.of(
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/slanted/hallway_2 id = 77
			List.of(
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,7), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/slanted/hallway_3 id = 78
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/slanted/hallway_4 id = 79
			List.of(
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0)
			),
// chamber/slanted/hallway_5 id = 80
			List.of(
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0)
			),
// chamber/slanted/ominous_upper_arm_1 id = 81
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:ominous_upper_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,3), 0, 0)
			),
// chamber/slanted/quadrant_1 id = 82
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,9), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,7), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,1), 0, 0),
					new JigsawBlock(26, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,7,2), 1, 1)
			),
// chamber/slanted/quadrant_2 id = 83
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,6), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,9,1), 0, 0)
			),
// chamber/slanted/quadrant_3 id = 84
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,6), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,9), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,2), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,7,1), 0, 0)
			),
// chamber/slanted/quadrant_4 id = 85
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,9), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,2), 0, 0)
			),
// chamber/slanted/ramp_1 id = 86
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(26, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,4,7), 1, 1)
			),
// chamber/slanted/ramp_2 id = 87
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(26, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,4,7), 1, 1)
			),
// chamber/slanted/ramp_3 id = 88
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,4,7), 1, 1)
			),
// chamber/slanted/ramp_4 id = 89
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0)
			),
// chests/supply id = 90
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:chest", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// chests/connectors/supply id = 91
			List.of(
					new JigsawBlock(14, JointType.ALIGNED, "minecraft:empty", "minecraft:chest", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:chest_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// corridor/atrium_1 id = 92
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:atrium", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0), 1, 1),
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:slice", "minecraft:plate", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(14,1,2), 0, 0),
					new JigsawBlock(0, JointType.ROLLABLE, "minecraft:empty", "minecraft:relief", BlockDirection.WEST, BlockDirection.UP, new BPos(7,3,13), 0, 0),
					new JigsawBlock(0, JointType.ROLLABLE, "minecraft:empty", "minecraft:relief", BlockDirection.EAST, BlockDirection.UP, new BPos(21,3,6), 0, 0),
					new JigsawBlock(0, JointType.ROLLABLE, "minecraft:empty", "minecraft:grand_staircase", BlockDirection.SOUTH, BlockDirection.UP, new BPos(8,4,10), 0, 0),
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:entrance", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,11,20), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,15,17), 0, 0)
			),
// corridor/end_1 id = 93
			List.of(
					new JigsawBlock(1, JointType.ROLLABLE, "mineacraft:empty", "minecraft:second_corridor", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 0, 0),
					new JigsawBlock(12, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,9,18), 0, 2),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,14,9), 0, 0)
			),
// corridor/end_2 id = 94
			List.of(
					new JigsawBlock(1, JointType.ROLLABLE, "mineacraft:empty", "minecraft:second_corridor", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,2,14), 0, 0),
					new JigsawBlock(12, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,9,18), 0, 2)
			),
// corridor/entrance_1 id = 95
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:entrance", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,4,18), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,14,14), 0, 0)
			),
// corridor/first_plate id = 96
			List.of(
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:atrium", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 1, 1),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,7), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,12), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,17), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:first_corridor", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,0,19), 1, 1)
			),
// corridor/second_plate id = 97
			List.of(
					new JigsawBlock(1, JointType.ROLLABLE, "minecarft:empty", "minecraft:intersection", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 1, 1),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,7), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,12), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,17), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:second_corridor", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,0,19), 1, 1)
			),
// corridor/straight_1 id = 98
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.EAST, new BPos(7,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(13,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_2 id = 99
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(13,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_corridor_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,2), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:addon_connector", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_3 id = 100
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.EAST, new BPos(7,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:addon_connector", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,10,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_4 id = 101
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.EAST, new BPos(7,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(13,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:addon_connector", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_corridor_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,15,2), 0, 0)
			),
// corridor/straight_5 id = 102
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.EAST, new BPos(7,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(13,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_corridor_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(18,5,2), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:addon_connector", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_6 id = 103
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,3,2), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:addon_connector", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,3), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(18,10,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_7 id = 104
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.EAST, new BPos(7,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:addon_connector", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,10,2), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_corridor_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(18,15,2), 0, 0)
			),
// corridor/straight_8 id = 105
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:addon_connector", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(11,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(12,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(9,10,2), 0, 0)
			),
// corridor/addon/arrow_dispenser id = 106
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(6,0,1), 0, 0)
			),
// corridor/addon/bridge_lower id = 107
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(6,0,1), 0, 0)
			),
// corridor/addon/chandelier_upper id = 108
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:addon_upper", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0)
			),
// corridor/addon/decoration_upper id = 109
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:addon_upper", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0)
			),
// corridor/addon/head_upper id = 110
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:addon_upper", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0)
			),
// corridor/addon/ladder_to_middle id = 111
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0), 0, 0)
			),
// corridor/addon/open_walkway id = 112
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,2,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,4,1), 0, 0)
			),
// corridor/addon/open_walkway_upper id = 113
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:addon_upper", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,2,1), 0, 0)
			),
// corridor/addon/reward_upper id = 114
			List.of(
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,2,1), 0, 0)
			),
// corridor/addon/staircase id = 115
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0), 0, 0)
			),
// corridor/addon/wall id = 116
			List.of(

			),
// corridor/addon/walled_walkway id = 117
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,2,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,4,1), 0, 0)
			),
// corridor/atrium/bogged_relief id = 118
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:relief", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,2), 0, 0)
			),
// corridor/atrium/breeze_relief id = 119
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:relief", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,2), 0, 0)
			),
// corridor/atrium/grand_staircase_1 id = 120
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:grand_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,2,0), 0, 0)
			),
// corridor/atrium/grand_staircase_2 id = 121
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:grand_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,2,0), 0, 0)
			),
// corridor/atrium/grand_staircase_3 id = 122
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:grand_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,2,0), 0, 0)
			),
// corridor/atrium/spider_relief id = 123
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:relief", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,2), 0, 0)
			),
// corridor/atrium/spiral_relief id = 124
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:relief", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,2), 0, 0)
			),
// decor/barrel id = 125
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/candle_1 id = 126
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/candle_2 id = 127
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/candle_3 id = 128
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/candle_4 id = 129
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/dead_bush_pot id = 130
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:waxed_oxidized_cut_copper", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/empty_pot id = 131
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:waxed_oxidized_cut_copper", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/flow_pot id = 132
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/guster_pot id = 133
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/scrape_pot id = 134
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/undecorated_pot id = 135
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// dispensers/chamber id = 136
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:dispenser", "minecraft:empty", BlockDirection.UP, BlockDirection.WEST, new BPos(1,0,0), 0, 0)
			),
// dispensers/floor_dispenser id = 137
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:floor_dispenser", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0,1,0), 0, 0)
			),
// dispensers/wall_dispenser id = 138
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:copper_dispenser", "minecraft:empty", BlockDirection.UP, BlockDirection.WEST, new BPos(0,0,0), 0, 0)
			),
// hallway/cache_1 id = 139
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,14), 0, 0),
					new JigsawBlock(13, JointType.ALIGNED, "minecraft:empty", "minecraft:chest_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(5,3,7), 0, 0)
			),
// hallway/corner_staircase id = 140
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,2), 0, 0)
			),
// hallway/corner_staircase_down id = 141
			List.of(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,2), 0, 0)
			),
// hallway/corridor_connector_1 id = 142
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,2), 0, 0)
			),
// hallway/left_corner id = 143
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,2), 0, 0)
			),
// hallway/long_straight_staircase id = 144
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,11,9), 0, 0)
			),
// hallway/long_straight_staircase_down id = 145
			List.of(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,11,9), 0, 0)
			),
// hallway/lower_hallway_connector id = 146
			List.of(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(10,3,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:lower_corridor_connector", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,13,2), 0, 0)
			),
// hallway/right_corner id = 147
			List.of(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/rubble id = 148
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/rubble_chamber id = 149
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:chamber", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/rubble_chamber_thin id = 150
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:chamber", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/rubble_thin id = 151
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/straight id = 152
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,4), 0, 0)
			),
// hallway/straight_staircase id = 153
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,6,4), 0, 0)
			),
// hallway/straight_staircase_down id = 154
			List.of(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,6,4), 0, 0)
			),
// hallway/upper_hallway_connector id = 155
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:upper_corridor_connector", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,3,2), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(10,10,2), 0, 0)
			),
// intersection/intersection_1 id = 156
			List.of(
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:first_corridor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,0,21), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:intersection", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(21,0,9), 1, 1),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,4,14), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,16,9), 0, 0)
			),
// intersection/intersection_2 id = 157
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:intersection", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,9), 1, 1),
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:first_corridor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,0,21), 1, 1),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(22,4,4), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.EAST, BlockDirection.UP, new BPos(19,9,4), 0, 0)
			),
// intersection/intersection_3 id = 158
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:intersection", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,10), 1, 1),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(11,4,21), 0, 0),
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:first_corridor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(11,17,21), 1, 1)
			),
// reward/ominous_vault id = 159
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:ominous_vault", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,1,0), 0, 0)
			),
// reward/vault id = 160
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:reward_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,2,0), 0, 0)
			),
// spawner/breeze/breeze id = 161
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/connectors/breeze id = 162
			List.of(
					new JigsawBlock(30, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:spawner_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/connectors/melee id = 163
			List.of(
					new JigsawBlock(/* USES ALIAS spawner/contents/melee */ 31, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:spawner_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/connectors/ranged id = 164
			List.of(
					new JigsawBlock(/* USES ALIAS spawner/contents/ranged */ 34, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:spawner_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/connectors/slow_ranged id = 165
			List.of(
					new JigsawBlock(/* USES ALIAS spawner/contents/slow_ranged */ 37, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:spawner_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/connectors/small_melee id = 166
			List.of(
					new JigsawBlock(/* USES ALIAS spawner/contents/small_melee */ 40, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "minecraft:spawner_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/melee/husk id = 167
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/melee/slime id = 168
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/melee/zombie id = 169
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/ranged/poison_skeleton id = 170
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/ranged/skeleton id = 171
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/ranged/stray id = 172
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/slow_ranged/poison_skeleton id = 173
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/slow_ranged/skeleton id = 174
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/slow_ranged/stray id = 175
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/small_melee/baby_zombie id = 176
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/small_melee/cave_spider id = 177
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/small_melee/silverfish id = 178
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/small_melee/spider id = 179
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
			// empty
    		List.of()
    );
}
