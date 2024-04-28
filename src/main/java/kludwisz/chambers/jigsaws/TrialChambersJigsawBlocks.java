package kludwisz.chambers.jigsaws;

import java.util.List;

import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;

public class TrialChambersJigsawBlocks {
	public static List<JigsawBlock> get(int pieceID) {
		return JIGSAW_BLOCKS.get(pieceID);
	}
	
    private static final List<List<JigsawBlock>> JIGSAW_BLOCKS = List.<List<JigsawBlock>>of(
			// chamber/assembly
			List.of(
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(29,3,12), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(33,3,14), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(14,5,4), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(14,5,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(14,5,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(14,5,24), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(19,5,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(19,5,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(19,5,24), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(24,5,4), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(24,5,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(24,5,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "lower_addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(24,5,24), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,8,1), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,8,1), 0, 0),
					new JigsawBlock(25, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(23,8,14), 1, 1),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(28,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(30,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,23), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,10,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(4,10,9), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(4,10,19), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,10,14), 1, 1),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "right_staircase", BlockDirection.NORTH, BlockDirection.UP, new BPos(29,13,12), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "left_staircase", BlockDirection.SOUTH, BlockDirection.UP, new BPos(29,13,16), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(33,13,14), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.NORTH, BlockDirection.UP, new BPos(19,14,4), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(14,17,4), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(14,17,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(14,17,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(14,17,24), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(19,17,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(19,17,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(19,17,24), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(24,17,4), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(24,17,9), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(24,17,19), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "empty", "upper_addon", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(24,17,24), 0, 0)
			),
// chamber/chamber_1
			List.of( // TODO FIXME do these aliases even fucking exist???
					new JigsawBlock(/* USES ALIAS?? */ -1, JointType.ROLLABLE, "empty","chamber/addon/c6", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,7), 0, 0),
					new JigsawBlock(/* USES ALIAS?? */ -1, JointType.ROLLABLE, "empty","chamber/addon/c6", BlockDirection.UP, BlockDirection.NORTH, new BPos(14,0,21), 0, 0),
					new JigsawBlock(5, JointType.ALIGNED, "empty", "c1_breeze", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,1,12), 2, 2),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,23), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,14), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "middle_start", BlockDirection.WEST, BlockDirection.UP, new BPos(22,8,14), 1, 1),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(23,8,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,13,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,10), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_start", BlockDirection.EAST, BlockDirection.UP, new BPos(1,13,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,13,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,13,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_start", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_start", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,28), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,13,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,13,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,13,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,13,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,23), 0, 0)
			),
// chamber/chamber_2
			List.of(
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,15), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,3,1), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.EAST, BlockDirection.UP, new BPos(6,3,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,3,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "lower_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,3,16), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,3,18), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "empty", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(21,4,24), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(9,8,14), 1, 1),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "middle_start", BlockDirection.WEST, BlockDirection.UP, new BPos(22,8,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(23,8,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,13,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,10), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_start", BlockDirection.EAST, BlockDirection.UP, new BPos(1,13,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,13,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(7,13,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_start", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,12), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,16), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_start", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,28), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(11,13,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,13,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,13,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,13,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,13,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,23), 0, 0)
			),
// chamber/chamber_4
			List.of(
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,14), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(4,3,4), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,8,0), 0, 0),
					new JigsawBlock(29, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,8,14), 1, 1),
					new JigsawBlock(29, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(19,8,9), 1, 1),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(19,8,19), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,9,3), 0, 0)
			),
// chamber/chamber_8
			List.of(
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,10), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,3,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,3,9), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,3,12), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,12), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,3,9), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,3,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,8,1), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,8,4), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,8,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,13,12), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,10), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,13,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,13,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,18,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,18,1), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,18,4), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,18,4), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,18,1), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,18,4), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,18,3), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.WEST, BlockDirection.UP, new BPos(3,19,9), 0, 0)
			),
// chamber/entrance_cap
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "entrance_cap", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0)
			),
// chamber/eruption
			List.of(
					new JigsawBlock(9, JointType.ALIGNED, "empty", "center", BlockDirection.UP, BlockDirection.NORTH, new BPos(12,0,12), 0, 1),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,3,0), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,3,28), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,14), 0, 0)
			),
// chamber/pedestal
			List.of(
					new JigsawBlock(10, JointType.ALIGNED, "empty", "center", BlockDirection.UP, BlockDirection.NORTH, new BPos(16,0,15), 2, 2),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,15), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,30), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(28,3,1), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "empty", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(29,3,4), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(30,3,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,23), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,28), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(33,3,19), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,15), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,30), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,8,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,8,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,8,32), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(19,8,0), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,8,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,8,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(28,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(30,8,32), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,23), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,28), 0, 0)
			),
// chamber/slanted
			List.of(
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "center", BlockDirection.UP, BlockDirection.EAST, new BPos(14,0,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,3,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,3,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,3,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,3,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,3,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,3,23), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(28,3,14), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,5), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,10), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,20), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,25), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,8,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "in_connector", "entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,8,0), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,8,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,8,27), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,3), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,8), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,13), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,18), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,23), 0, 0)
			),
// chamber/addon/10x15_pathway_3
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "entrance_5x15", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/addon/10x15_rise
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "entrance_5x15", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/addon/10x15_stacked_pathway
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "entrance_5x15", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/addon/c1_breeze
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "c1_breeze", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "lower_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,1,4), 0, 0),
					new JigsawBlock(25, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,6,2), 1, 1),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(0,11,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,11,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,11,4), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(4,11,2), 0, 0)
			),
// chamber/addon/c3_side_walkway_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "c3_side_walkway", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,0), 0, 0)
			),
// chamber/addon/c3_side_walkway_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "c3_side_walkway", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,0), 0, 0)
			),
// chamber/addon/closed_side_walkway
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "full_room_side_platform", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,18), 0, 0)
			),
// chamber/addon/corner_room_1
			List.of(
					new JigsawBlock(29, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,3), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "c3_corner_room", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,6,2), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(8,7,3), 0, 0)
			),
// chamber/addon/full_column_ranged_spawner
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "three_column_start", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 1, 1),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,4,1), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(1,4,4), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(3,4,0), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(4,4,3), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,7,2), 1, 1),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(0,12,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,12,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,12,4), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,2), 0, 0)
			),
// chamber/addon/full_corner_column
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_start", "", BlockDirection.WEST, BlockDirection.UP, new BPos(0,12,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,12,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,2), 0, 0)
			),
// chamber/addon/full_stacked_walkway
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "middle_start", "", BlockDirection.EAST, BlockDirection.UP, new BPos(4,7,3), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,12,13), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "upper_start", "", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,3), 0, 0)
			),
// chamber/addon/full_stacked_walkway_2
			List.of(
					new JigsawBlock(19, JointType.ALIGNED, "empty", "dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1,4,2), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "empty", "dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1,4,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "middle_start", "", BlockDirection.EAST, BlockDirection.UP, new BPos(4,7,3), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,12,8), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,12,13), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "upper_start", "", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,3), 0, 0)
			),
// chamber/addon/grate_bridge
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_start", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,6,0), 0, 0)
			),
// chamber/addon/hanging_platform
			List.of(
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "upper_start", "", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,2), 0, 0)
			),
// chamber/addon/lower_staircase_down
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_addon_extension", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0,2,2), 0, 0)
			),
// chamber/addon/lower_walkway_platform
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_start", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "lower_walkable_extension", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,4), 0, 0)
			),
// chamber/addon/middle_column_ranged_spawner
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "two_column_start", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 1, 1),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "lower_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,4), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,4,2), 1, 1)
			),
// chamber/addon/middle_walkway
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_two_high", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,17), 0, 0)
			),
// chamber/addon/platform_with_space
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "platform_with_space", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,6,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,7,7), 0, 0)
			),
// chamber/addon/short_grate_platform
			List.of(
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "empty", "upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,4), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "upper_start", "", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,2), 0, 0)
			),
// chamber/addon/short_platform
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_start", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,2), 0, 0)
			),
// chamber/addon/side_walkway
			List.of(
					new JigsawBlock(19, JointType.ALIGNED, "empty", "dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,4,17), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "full_room_side_platform", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,18), 0, 0)
			),
// chamber/addon/stairs_with_space
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "platform_with_space", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,6,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,7,7), 0, 0)
			),
// chamber/addon/stairs_with_space_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "platform_with_space", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,6,0), 0, 0)
			),
// chamber/addon/walkway_extension
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "empty", "lower_walkable_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,2,0), 0, 0)
			),
// chamber/addon/walkway_with_bridge_1
			List.of(

			),
// chamber/assembly/cover_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0)
			),
// chamber/assembly/cover_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "floor_dispenser", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(3,4,2), 0, 0)
			),
// chamber/assembly/cover_3
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0)
			),
// chamber/assembly/cover_4
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0)
			),
// chamber/assembly/cover_5
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "floor_dispenser", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,4,2), 0, 0)
			),
// chamber/assembly/cover_6
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0),
					new JigsawBlock(19, JointType.ALIGNED, "floor_dispenser", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,4,2), 0, 0)
			),
// chamber/assembly/full_column
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_addon", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1,0,1), 0, 0)
			),
// chamber/assembly/hanging_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_addon", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,3,1), 0, 0)
			),
// chamber/assembly/hanging_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_addon", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,5,2), 0, 0)
			),
// chamber/assembly/hanging_3
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_addon", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(2,4,2), 0, 0)
			),
// chamber/assembly/hanging_4
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_addon", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,4,2), 0, 0)
			),
// chamber/assembly/left_staircase_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "right_staircase", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,10), 0, 0)
			),
// chamber/assembly/left_staircase_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "right_staircase", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,10), 0, 0)
			),
// chamber/assembly/left_staircase_3
			List.of(
					new JigsawBlock(24, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,8), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "right_staircase", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,10), 0, 0)
			),
// chamber/assembly/platform_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "c6_addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 0, 0)
			),
// chamber/assembly/right_staircase_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "left_staircase", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/assembly/right_staircase_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "left_staircase", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/assembly/right_staircase_3
			List.of(
					new JigsawBlock(24, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,2), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "left_staircase", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/assembly/spawner_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0)
			),
// chamber/assembly/spawner_trap_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,4,2), 1, 1)
			),
// chamber/eruption/breeze_slice_1
			List.of(
					new JigsawBlock(25, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,4,8), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "breeze_slice", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,8,7), 0, 0)
			),
// chamber/eruption/center_1
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "center", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(3,1,2), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "empty", "slice", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,2), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "empty", "slice", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "empty", "slice", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,5,4), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "empty", "breeze_slice", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,2), 0, 0)
			),
// chamber/eruption/quadrant_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0)
			),
// chamber/eruption/quadrant_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,7,2), 0, 0)
			),
// chamber/eruption/quadrant_3
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,9,2), 0, 0)
			),
// chamber/eruption/quadrant_4
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(8,7,8), 0, 0)
			),
// chamber/eruption/quadrant_5
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(8,7,8), 0, 0)
			),
// chamber/eruption/slice_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "slice", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,5), 0, 0)
			),
// chamber/eruption/slice_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "slice", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0)
			),
// chamber/eruption/slice_3
			List.of(
					new JigsawBlock(26, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,4), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "slice", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0)
			),
// chamber/pedestal/center_1
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "center", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(4,0,3), 2, 2),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "slice", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "slice", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "slice", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "slice", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,9), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "slice", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "ominous_slice", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,9), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "slice", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "slice", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,7), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,9,6), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(6,9,3), 1, 1),
					new JigsawBlock(25, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,9,6), 1, 1)
			),
// chamber/pedestal/ominous_slice_1
			List.of(
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "ominous_slice", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,7), 0, 0)
			),
// chamber/pedestal/quadrant_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 0)
			),
// chamber/pedestal/quadrant_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0)
			),
// chamber/pedestal/quadrant_3
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0)
			),
// chamber/pedestal/slice_1
			List.of(
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "slice", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,8), 0, 0)
			),
// chamber/pedestal/slice_2
			List.of(
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "slice", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,7), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/pedestal/slice_3
			List.of(
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "slice", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,7), 0, 0)
			),
// chamber/pedestal/slice_4
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "slice", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(3,2,7), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/pedestal/slice_5
			List.of(
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "slice", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,7), 0, 0)
			),
// chamber/slanted/center
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "center", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "lower_arm", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "lower_arm", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "lower_arm", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,4), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "lower_arm", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "upper_arm", BlockDirection.WEST, BlockDirection.UP, new BPos(0,7,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "upper_arm", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0),
					new JigsawBlock(25, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,2), 1, 1),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "ominous_upper_arm", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,4), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "upper_arm", BlockDirection.EAST, BlockDirection.UP, new BPos(4,7,2), 0, 0)
			),
// chamber/slanted/hallway_1
			List.of(
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "lower_arm", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/slanted/hallway_2
			List.of(
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "lower_arm", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,7), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/slanted/hallway_3
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "lower_arm", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/slanted/hallway_4
			List.of(
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "lower_arm", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0)
			),
// chamber/slanted/hallway_5
			List.of(
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "lower_arm", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "empty", "quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0)
			),
// chamber/slanted/ominous_upper_arm_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "ominous_upper_arm", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,3), 0, 0)
			),
// chamber/slanted/quadrant_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,9), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,7), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,1), 0, 0),
					new JigsawBlock(26, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,7,2), 1, 1)
			),
// chamber/slanted/quadrant_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,6), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,9,1), 0, 0)
			),
// chamber/slanted/quadrant_3
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,6), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,9), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,2), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,7,1), 0, 0)
			),
// chamber/slanted/quadrant_4
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,9), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "quadrant", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,2), 0, 0)
			),
// chamber/slanted/ramp_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_arm", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(26, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,4,7), 1, 1)
			),
// chamber/slanted/ramp_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_arm", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(26, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,4,7), 1, 1)
			),
// chamber/slanted/ramp_3
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_arm", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,4,7), 1, 1)
			),
// chamber/slanted/ramp_4
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_arm", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0)
			),
// chests/supply
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "chest", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// chests/connectors/supply
			List.of(
					new JigsawBlock(14, JointType.ALIGNED, "empty", "chest", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "chest_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// corridor/atrium_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "atrium", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0), 1, 1),
					new JigsawBlock(44, JointType.ALIGNED, "slice", "plate", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(14,1,2), 0, 0),
					new JigsawBlock(0, JointType.ROLLABLE, "empty", "relief", BlockDirection.WEST, BlockDirection.UP, new BPos(7,3,13), 0, 0),
					new JigsawBlock(0, JointType.ROLLABLE, "empty", "relief", BlockDirection.EAST, BlockDirection.UP, new BPos(21,3,6), 0, 0),
					new JigsawBlock(0, JointType.ROLLABLE, "empty", "grand_staircase", BlockDirection.SOUTH, BlockDirection.UP, new BPos(8,4,10), 0, 0),
					new JigsawBlock(1, JointType.ROLLABLE, "empty", "entrance", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,11,20), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,15,17), 0, 0)
			),
// corridor/end_1
			List.of( // FIXME :empty
					new JigsawBlock(1, JointType.ROLLABLE, ":empty", "second_corridor", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 0, 0),
					new JigsawBlock(12, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,9,18), 0, 2),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,14,9), 0, 0)
			),
// corridor/end_2
			List.of( // FIXME :empty
					new JigsawBlock(1, JointType.ROLLABLE, ":empty", "second_corridor", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,2,14), 0, 0),
					new JigsawBlock(12, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,9,18), 0, 2)
			),
// corridor/entrance_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "entrance", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,4,18), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,14,14), 0, 0)
			),
// corridor/first_plate
			List.of(
					new JigsawBlock(1, JointType.ROLLABLE, "empty", "atrium", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 1, 1),
					new JigsawBlock(15, JointType.ALIGNED, "empty", "slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "empty", "slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,7), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "empty", "slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,12), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "empty", "slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,17), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "first_corridor", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,0,19), 1, 1)
			),
// corridor/second_plate
			List.of(
					new JigsawBlock(1, JointType.ROLLABLE, "empty", "intersection", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 1, 1),
					new JigsawBlock(15, JointType.ALIGNED, "empty", "slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "empty", "slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,7), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "empty", "slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,12), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "empty", "slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,17), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "second_corridor", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,0,19), 1, 1)
			),
// corridor/straight_1
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "slice", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.EAST, new BPos(7,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(13,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "empty", "addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_2
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "slice", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(13,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "lower_corridor_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,2), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "addon_connector", "addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "empty", "addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_3
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "slice", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.EAST, new BPos(7,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "addon_connector", "addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,10,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "empty", "addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_4
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "slice", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.EAST, new BPos(7,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(13,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "addon_connector", "addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "empty", "addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "upper_corridor_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,15,2), 0, 0)
			),
// corridor/straight_5
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "slice", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.EAST, new BPos(7,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(13,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "lower_corridor_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(18,5,2), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "addon_connector", "addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "empty", "addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_6
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "slice", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,3,2), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "addon_connector", "addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,3), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(18,10,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "empty", "addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_7
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "slice", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.EAST, new BPos(7,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(10,1,3), 0, 0),
					new JigsawBlock(16, JointType.ALIGNED, "empty", "addon", BlockDirection.UP, BlockDirection.WEST, new BPos(11,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "addon_connector", "addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,10,2), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "upper_corridor_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(18,15,2), 0, 0)
			),
// corridor/straight_8
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "slice", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "addon_connector", "addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(11,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(12,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "empty", "decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(9,10,2), 0, 0)
			),
// corridor/addon/arrow_dispenser
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "addon", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(6,0,1), 0, 0)
			),
// corridor/addon/bridge_lower
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "addon", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(6,0,1), 0, 0)
			),
// corridor/addon/chandelier_upper
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "addon_upper", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0)
			),
// corridor/addon/decoration_upper
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "addon_upper", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0)
			),
// corridor/addon/head_upper
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "addon_upper", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0)
			),
// corridor/addon/ladder_to_middle
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "addon", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0), 0, 0)
			),
// corridor/addon/open_walkway
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,2,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "empty", "addon_upper", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,4,1), 0, 0)
			),
// corridor/addon/open_walkway_upper
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "addon_upper", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,2,1), 0, 0)
			),
// corridor/addon/reward_upper
			List.of(
					new JigsawBlock(21, JointType.ALIGNED, "empty", "reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,2,1), 0, 0)
			),
// corridor/addon/staircase
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "addon", "empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0,0,0), 0, 0)
			),
// corridor/addon/wall
			List.of(

			),
// corridor/addon/walled_walkway
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "addon", "empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "empty", "spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,2,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "empty", "addon_upper", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,4,1), 0, 0)
			),
// corridor/atrium/bogged_relief
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "relief", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,2), 0, 0)
			),
// corridor/atrium/breeze_relief
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "relief", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,2), 0, 0)
			),
// corridor/atrium/grand_staircase_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "grand_staircase", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,2,0), 0, 0)
			),
// corridor/atrium/grand_staircase_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "grand_staircase", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,2,0), 0, 0)
			),
// corridor/atrium/grand_staircase_3
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "grand_staircase", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0,2,0), 0, 0)
			),
// corridor/atrium/spider_relief
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "relief", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,2), 0, 0)
			),
// corridor/atrium/spiral_relief
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "relief", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,1,2), 0, 0)
			),
// decor/barrel
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/candle_1
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/candle_2
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/candle_3
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/candle_4
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/dead_bush_pot
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "waxed_oxidized_cut_copper", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/empty_pot
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "waxed_oxidized_cut_copper", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/flow_pot
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/guster_pot
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/scrape_pot
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// decor/undecorated_pot
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "decor", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,0), 0, 0)
			),
// dispensers/chamber
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "dispenser", "empty", BlockDirection.UP, BlockDirection.WEST, new BPos(1,0,0), 0, 0)
			),
// dispensers/floor_dispenser
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "floor_dispenser", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0,1,0), 0, 0)
			),
// dispensers/wall_dispenser
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "copper_dispenser", "empty", BlockDirection.UP, BlockDirection.WEST, new BPos(0,0,0), 0, 0)
			),
// hallway/cache_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,14), 0, 0),
					new JigsawBlock(13, JointType.ALIGNED, "empty", "chest_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(5,3,7), 0, 0)
			),
// hallway/corner_staircase
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,2), 0, 0)
			),
// hallway/corner_staircase_down
			List.of(
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,2), 0, 0)
			),
// hallway/corridor_connector_1
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,2), 0, 0)
			),
// hallway/left_corner
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,2), 0, 0)
			),
// hallway/long_straight_staircase
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,11,9), 0, 0)
			),
// hallway/long_straight_staircase_down
			List.of(
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,11,9), 0, 0)
			),
// hallway/lower_hallway_connector
			List.of(
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(10,3,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "lower_corridor_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,13,2), 0, 0)
			),
// hallway/right_corner
			List.of(
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,2), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/rubble
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/rubble_chamber
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "chamber", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/rubble_chamber_thin
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "chamber", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/rubble_thin
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/straight
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,4), 0, 0)
			),
// hallway/straight_staircase
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,6,4), 0, 0)
			),
// hallway/straight_staircase_down
			List.of(
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "in_connector", "empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,6,4), 0, 0)
			),
// hallway/upper_hallway_connector
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "upper_corridor_connector", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,3,2), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(10,10,2), 0, 0)
			),
// intersection/intersection_1
			List.of(
					new JigsawBlock(1, JointType.ROLLABLE, "empty", "first_corridor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,0,21), 1, 1),
					new JigsawBlock(44, JointType.ROLLABLE, "intersection", "empty", BlockDirection.EAST, BlockDirection.UP, new BPos(21,0,9), 1, 1),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,4,14), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,16,9), 0, 0)
			),
// intersection/intersection_2
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "intersection", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,9), 1, 1),
					new JigsawBlock(1, JointType.ROLLABLE, "empty", "first_corridor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,0,21), 1, 1),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(22,4,4), 0, 0),
					new JigsawBlock(22, JointType.ROLLABLE, "empty", "ominous_vault", BlockDirection.EAST, BlockDirection.UP, new BPos(19,9,4), 0, 0)
			),
// intersection/intersection_3
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "intersection", "empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,10), 1, 1),
					new JigsawBlock(4, JointType.ROLLABLE, "empty", "in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(11,4,21), 0, 0),
					new JigsawBlock(1, JointType.ROLLABLE, "empty", "first_corridor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(11,17,21), 1, 1)
			),
// reward/ominous_vault
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "ominous_vault", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,1,0), 0, 0)
			),
// reward/vault
			List.of(
					new JigsawBlock(44, JointType.ROLLABLE, "reward_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,2,0), 0, 0)
			),
// spawner/breeze/breeze
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/connectors/breeze
			List.of(
					new JigsawBlock(30, JointType.ALIGNED, "empty", "spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "spawner_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
			// spawner/connectors/melee
			List.of(
					new JigsawBlock(30 /*husk FIXME*/ /* USES ALIAS */ /*"spawner/contents/melee"*/, JointType.ALIGNED, "empty", "spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "spawner_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
			// spawner/connectors/ranged
			List.of(
					new JigsawBlock(33 /*bogged FIXME*/ /* USES ALIAS */ /*"spawner/contents/ranged"*/, JointType.ALIGNED, "empty", "spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "spawner_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
			// spawner/connectors/slow_ranged
			List.of(
					new JigsawBlock(36 /*bogged FIXME*/ /* USES ALIAS */ /*"spawner/contents/slow_ranged"*/, JointType.ALIGNED, "empty", "spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "spawner_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
			// spawner/connectors/small_melee
			List.of(
					new JigsawBlock(39 /*baby zombie FIXME*/ /* USES ALIAS */ /*"spawner/contents/small_melee"*/, JointType.ALIGNED, "empty", "spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(44, JointType.ROLLABLE, "spawner_connector", "empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/melee/husk
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/melee/slime
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/melee/zombie
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/ranged/poison_skeleton
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/ranged/skeleton
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/ranged/stray
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/slow_ranged/poison_skeleton
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/slow_ranged/skeleton
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/slow_ranged/stray
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/small_melee/baby_zombie
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/small_melee/cave_spider
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/small_melee/silverfish
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
// spawner/small_melee/spider
			List.of(
					new JigsawBlock(44, JointType.ALIGNED, "spawner", "empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1,1,0), 0, 0)
			),
    		// empty
    		List.of()
    );
}
