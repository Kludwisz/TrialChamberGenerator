package kludwisz.structure.jigsaws;

import java.util.*;

import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import kludwisz.structure.pieces.TrialChambersPieceSize;
import kludwisz.generator.TrialChambersPieces;
import kludwisz.generator.util.BlockBoxUtil;
import kludwisz.generator.util.MutableBlockPos;

public class TrialChambersJigsawBlocks {
	public static List<JigsawBlock> get(int pieceID) {
		return JIGSAW_BLOCKS_V2.get(pieceID);
	}

	private static final List<List<JigsawBlock>> JIGSAW_BLOCKS_V2 = Arrays.<List<JigsawBlock>>asList(
			// chamber/assembly id = 0
			Arrays.asList(
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.EAST, new BPos(32,2,15), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(29,3,12), 0, 0),
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
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,8,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,8,27), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,8,1), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,14), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,8,27), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,8,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,8,27), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,8,1), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(23,8,14), 1, 1),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,8,27), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(27,8,13), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(28,8,1), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.NORTH, new BPos(5,9,1), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,10,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(4,10,9), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(4,10,19), 0, 0),
					new JigsawBlock(30, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,10,14), 1, 1),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.EAST, new BPos(32,12,15), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:right_staircase", BlockDirection.NORTH, BlockDirection.UP, new BPos(29,13,12), 0, 0),
					new JigsawBlock(6, JointType.ROLLABLE, "minecraft:empty", "minecraft:left_staircase", BlockDirection.SOUTH, BlockDirection.UP, new BPos(29,13,16), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(33,13,14), 0, 0),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.NORTH, BlockDirection.UP, new BPos(19,14,4), 0, 0),
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
			Arrays.asList(
					new JigsawBlock(5, JointType.ALIGNED, "minecraft:empty", "minecraft:c1_breeze", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,1,12), 2, 2),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,14), 0, 3),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.EAST, new BPos(22,7,15), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:middle_start", BlockDirection.WEST, BlockDirection.UP, new BPos(22,8,14), 1, 1),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(23,8,14), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.WEST, new BPos(1,12,13), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.SOUTH, new BPos(8,12,27), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.NORTH, new BPos(10,12,1), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,13,14), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,5), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,10), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.EAST, BlockDirection.UP, new BPos(1,13,14), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,20), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,25), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,13,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,13,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,28), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,13,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,13,27), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,13,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,13,27), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,3), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,8), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,13), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,18), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,23), 0, 0)
			),
// chamber/chamber_2 id = 2
			Arrays.asList(
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.EAST, BlockDirection.UP, new BPos(6,3,14), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,3,16), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.EAST, new BPos(22,7,15), 0, 0),
					new JigsawBlock(30, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(9,8,14), 1, 1),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:middle_start", BlockDirection.WEST, BlockDirection.UP, new BPos(22,8,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(23,8,14), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.WEST, new BPos(1,12,13), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.SOUTH, new BPos(8,12,27), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.NORTH, new BPos(10,12,1), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,13,14), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,5), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,10), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.EAST, BlockDirection.UP, new BPos(1,13,14), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,13,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(7,13,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,1), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,12), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,16), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_start", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,27), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,13,28), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(11,13,14), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,13,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,13,27), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(18,13,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(20,13,27), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,3), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,8), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,13), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,18), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(22,13,23), 0, 0)
			),
// chamber/chamber_4 id = 3
			Arrays.asList(
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,1,8), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,1,9), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,1,10), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,1,20), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,1,20), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(15,1,20), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.WEST, new BPos(1,2,13), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,14), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(4,3,4), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(18,6,3), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(19,6,3), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(20,6,3), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(20,6,4), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(20,6,5), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(20,6,13), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(20,6,14), 0, 0),
					new JigsawBlock(20, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(20,6,15), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.WEST, new BPos(1,7,13), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.NORTH, new BPos(10,7,1), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,14), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,8,0), 0, 0),
					new JigsawBlock(32, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,8,14), 1, 1),
					new JigsawBlock(32, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(19,8,9), 1, 1),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(19,8,19), 0, 0),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,9,3), 0, 0)
			),
// chamber/chamber_8 id = 4
			Arrays.asList(
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.NORTH, new BPos(5,2,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,10), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,3,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,3,9), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,3,12), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,12), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,3,9), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,3,8), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,5), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,8,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,8,1), 0, 0),
					new JigsawBlock(31, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,8,4), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,8,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.SOUTH, new BPos(13,12,12), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,13,10), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,13,12), 0, 0),
					new JigsawBlock(31, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,13,10), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,13,13), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,13,8), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,18,5), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,18,1), 0, 0),
					new JigsawBlock(31, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,18,4), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,18,4), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,18,1), 0, 0),
					new JigsawBlock(31, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,18,4), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,18,3), 0, 0),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.WEST, BlockDirection.UP, new BPos(3,19,9), 0, 0)
			),
// chamber/entrance_cap id = 5
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:entrance_cap", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 2, 0), 0, 0)
            ),
// chamber/eruption id = 6
			Arrays.asList(
					new JigsawBlock(9, JointType.ALIGNED, "minecraft:empty", "minecraft:center", BlockDirection.UP, BlockDirection.NORTH, new BPos(12,0,12), 0, 1),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.SOUTH, new BPos(13,2,28), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.NORTH, new BPos(15,2,0), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,3,0), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,3,28), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.WEST, new BPos(0,7,13), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,14), 0, 0)
			),
// chamber/pedestal id = 7
			Arrays.asList(
					new JigsawBlock(10, JointType.ALIGNED, "minecraft:empty", "minecraft:center", BlockDirection.UP, BlockDirection.NORTH, new BPos(16,0,15), 2, 2),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.EAST, new BPos(32,2,20), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,5), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,10), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,25), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,3,30), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,3,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,3,32), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,3,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,3,32), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,3,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,3,32), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(28,3,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(30,3,32), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,3), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,8), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,23), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,3,28), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(33,3,19), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.NORTH, new BPos(20,7,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,5), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,10), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,25), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,8,30), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,8,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,8,32), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,8,1), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(19,8,0), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(23,8,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(25,8,32), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(28,8,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(30,8,32), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,3), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,23), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(32,8,28), 0, 0)
			),
// chamber/slanted id = 8
			Arrays.asList(
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:center", BlockDirection.UP, BlockDirection.EAST, new BPos(14,0,14), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.EAST, new BPos(27,2,15), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.EAST, BlockDirection.UP, new BPos(28,3,14), 0, 0),
					new JigsawBlock(21, JointType.ALIGNED, "minecraft:empty", "minecraft:disposal", BlockDirection.UP, BlockDirection.NORTH, new BPos(15,7,1), 0, 0),
					new JigsawBlock(8, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:entrance_cap", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,8,0), 0, 0)
			),
// chamber/addon/c1_breeze id = 9
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:c1_breeze", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,1,4), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,6,2), 1, 1),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(0,11,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,11,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,11,4), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(4,11,2), 0, 0)
			),
// chamber/addon/full_corner_column id = 10
			Arrays.asList(
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(4,2,8), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,12,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,12,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,2), 0, 0)
			),
// chamber/addon/full_stacked_walkway id = 11
			Arrays.asList(
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1,2,2), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:middle_start", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,7,3), 0, 0),
					new JigsawBlock(30, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,12,13), 1, 1),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,3), 0, 0)
			),
// chamber/addon/full_stacked_walkway_2 id = 12
			Arrays.asList(
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1,4,2), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1,4,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:middle_start", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,7,3), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,12,8), 0, 0),
					new JigsawBlock(30, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,12,13), 1, 1),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,12,3), 0, 0)
			),
// chamber/addon/grate_bridge id = 13
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 6, 0), 0, 0)
            ),
// chamber/addon/hanging_platform id = 14
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_addon_extension", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 3, 0), 0, 0)
            ),
// chamber/addon/lower_staircase_down id = 15
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon_extension", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 2, 2), 0, 0)
            ),
// chamber/addon/short_grate_platform id = 16
			Arrays.asList(
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,2), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(5, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_addon_extension", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,4), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,2), 0, 0)
			),
// chamber/addon/short_platform id = 17
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_start", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 3, 2), 0, 0)
            ),
// chamber/addon/walkway_with_bridge_1 id = 18
            Collections.emptyList(),
// chamber/assembly/cover_1 id = 19
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2, 3, 2), 0, 0)
            ),
// chamber/assembly/cover_2 id = 20
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2, 3, 2), 0, 0)
            ),
// chamber/assembly/cover_3 id = 21
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2, 3, 2), 0, 0)
            ),
// chamber/assembly/cover_4 id = 22
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2, 3, 2), 0, 0)
            ),
// chamber/assembly/cover_5 id = 23
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:floor_dispenser", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,4,2), 0, 0)
			),
// chamber/assembly/cover_6 id = 24
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,3,2), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:floor_dispenser", BlockDirection.SOUTH, BlockDirection.UP, new BPos(3,4,2), 0, 0)
			),
// chamber/assembly/cover_7 id = 25
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2, 3, 2), 0, 0)
            ),
// chamber/assembly/full_column id = 26
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(1, 0, 1), 0, 0)
            ),
// chamber/assembly/hanging_1 id = 27
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_addon", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(2, 3, 1), 0, 0)
            ),
// chamber/assembly/hanging_2 id = 28
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_addon", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(2, 5, 2), 0, 0)
            ),
// chamber/assembly/hanging_3 id = 29
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_addon", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(2, 4, 2), 0, 0)
            ),
// chamber/assembly/hanging_4 id = 30
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_addon", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 4, 2), 0, 0)
            ),
// chamber/assembly/hanging_5 id = 31
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_addon", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 0, 1), 0, 0)
            ),
// chamber/assembly/left_staircase_1 id = 32
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:right_staircase", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2, 7, 10), 0, 0)
            ),
// chamber/assembly/left_staircase_2 id = 33
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:right_staircase", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2, 7, 10), 0, 0)
            ),
// chamber/assembly/left_staircase_3 id = 34
			Arrays.asList(
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,8), 1, 1),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:right_staircase", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,10), 0, 0)
			),
// chamber/assembly/platform_1 id = 35
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2, 0, 2), 0, 0)
            ),
// chamber/assembly/right_staircase_1 id = 36
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:left_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 7, 0), 0, 0)
            ),
// chamber/assembly/right_staircase_2 id = 37
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:left_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 7, 0), 0, 0)
            ),
// chamber/assembly/right_staircase_3 id = 38
			Arrays.asList(
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,2), 1, 1),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:left_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0)
			),
// chamber/assembly/spawner_1 id = 39
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2, 3, 2), 0, 0)
            ),
// chamber/eruption/breeze_slice_1 id = 40
			Arrays.asList(
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,4,8), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:breeze_slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,8,7), 0, 0)
			),
// chamber/eruption/center_1 id = 41
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:center", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(3,1,2), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,2), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,5,4), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:breeze_slice", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,2), 0, 0)
			),
// chamber/eruption/quadrant_1 id = 42
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 5, 1), 0, 0)
            ),
// chamber/eruption/quadrant_2 id = 43
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,7,2), 0, 0)
			),
// chamber/eruption/quadrant_3 id = 44
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(7,9,2), 0, 0)
			),
// chamber/eruption/quadrant_4 id = 45
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(30, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(8,7,8), 0, 0)
			),
// chamber/eruption/quadrant_5 id = 46
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,5,1), 0, 0),
					new JigsawBlock(30, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(8,7,8), 0, 0)
			),
// chamber/eruption/slice_1 id = 47
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,5), 0, 0)
			),
// chamber/eruption/slice_2 id = 48
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0)
			),
// chamber/eruption/slice_3 id = 49
			Arrays.asList(
					new JigsawBlock(29, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,4), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,5,0), 0, 0),
					new JigsawBlock(9, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,5,1), 0, 0)
			),
// chamber/pedestal/center_1 id = 50
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:center", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(4,0,3), 2, 2),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 1),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 1),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 1),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,9), 0, 1),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 1),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_slice", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,9), 0, 1),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,2), 0, 1),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:slice", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,7), 0, 1),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(3,9,6), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(6,9,3), 1, 1),
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(6,9,6), 1, 1)
			),
// chamber/pedestal/ominous_slice_1 id = 51
			Arrays.asList(
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:ominous_slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,7), 0, 0)
			),
// chamber/pedestal/quadrant_1 id = 52
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 0)
			),
// chamber/pedestal/quadrant_2 id = 53
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0)
			),
// chamber/pedestal/quadrant_3 id = 54
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0)
			),
// chamber/pedestal/slice_1 id = 55
			Arrays.asList(
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,8), 0, 0)
			),
// chamber/pedestal/slice_2 id = 56
			Arrays.asList(
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,7), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/pedestal/slice_3 id = 57
			Arrays.asList(
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,7), 0, 0)
			),
// chamber/pedestal/slice_4 id = 58
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(3,2,7), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/pedestal/slice_5 id = 59
			Arrays.asList(
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:slice", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(10, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,7), 0, 0)
			),
// chamber/slanted/center id = 60
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:center", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(2,0,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_arm", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_arm", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_arm", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,4), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:lower_arm", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_arm", BlockDirection.WEST, BlockDirection.UP, new BPos(0,7,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_arm", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,7,0), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,2), 1, 1),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_upper_arm", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,7,4), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_arm", BlockDirection.EAST, BlockDirection.UP, new BPos(4,7,2), 0, 0)
			),
// chamber/slanted/hallway_1 id = 61
			Arrays.asList(
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/slanted/hallway_2 id = 62
			Arrays.asList(
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,7), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,2), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 0)
			),
// chamber/slanted/hallway_3 id = 63
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(11, JointType.ROLLABLE, "minecraft:empty", "minecraft:quadrant", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,7), 0, 1)
			),
// chamber/slanted/ominous_upper_arm_1 id = 64
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:ominous_upper_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,3), 0, 0)
			),
// chamber/slanted/quadrant_1 id = 65
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(1,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,2,9), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,2,0), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,7), 0, 0),
					new JigsawBlock(29, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,7,1), 1, 1)
			),
// chamber/slanted/quadrant_2 id = 66
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(1,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(6,7,2), 0, 0)
			),
// chamber/slanted/quadrant_3 id = 67
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,2), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,7), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(1,2,7), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,9), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(9,2,2), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(6,7,2), 0, 0)
			),
// chamber/slanted/quadrant_4 id = 68
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,3), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,2,8), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(1,2,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(6,2,1), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:quadrant", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,2,10), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(9,2,2), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(9,2,7), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(1,7,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(6,7,1), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(9,7,2), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(9,7,7), 0, 0)
			),
// chamber/slanted/ramp_1 id = 69
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(29, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,4,7), 1, 1)
			),
// chamber/slanted/ramp_2 id = 70
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(29, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,4,7), 1, 1)
			),
// chamber/slanted/ramp_3 id = 71
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,2,0), 0, 0),
					new JigsawBlock(30, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,4,7), 1, 1)
			),
// chamber/slanted/ramp_4 id = 72
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_arm", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 2, 0), 0, 0)
            ),
// chests/supply id = 73
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:chest", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// chests/connectors/supply id = 74
			Arrays.asList(
					new JigsawBlock(14, JointType.ALIGNED, "minecraft:empty", "minecraft:chest", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:chest_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// corridor/atrium_1 id = 75
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:atrium", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,0), 1, 1),
					new JigsawBlock(0, JointType.ROLLABLE, "minecraft:empty", "minecraft:relief", BlockDirection.WEST, BlockDirection.UP, new BPos(7,3,13), 0, 0),
					new JigsawBlock(0, JointType.ROLLABLE, "minecraft:empty", "minecraft:relief", BlockDirection.EAST, BlockDirection.UP, new BPos(21,3,6), 0, 0),
					new JigsawBlock(0, JointType.ROLLABLE, "minecraft:empty", "minecraft:grand_staircase", BlockDirection.SOUTH, BlockDirection.UP, new BPos(8,4,10), 0, 0),
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:entrance", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,11,20), 0, 0),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,15,17), 0, 0)
			),
// corridor/end_1 id = 76
			Arrays.asList(
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:second_corridor", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 0, 0),
					new JigsawBlock(12, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,9,18), 0, 2),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,14,9), 0, 0)
			),
// corridor/end_2 id = 77
			Arrays.asList(
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:second_corridor", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 0, 0),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,2,14), 0, 0),
					new JigsawBlock(12, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,9,18), 0, 2),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(10,16,9), 0, 0)
			),
// corridor/entrance_1 id = 78
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:entrance", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,4,18), 0, 0),
					new JigsawBlock(3, JointType.ROLLABLE, "minecraft:empty", "minecraft:display", BlockDirection.WEST, BlockDirection.UP, new BPos(5,7,5), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,14,14), 0, 0)
			),
// corridor/entrance_2 id = 79
			Arrays.asList(
					new JigsawBlock(3, JointType.ROLLABLE, "minecraft:empty", "minecraft:display", BlockDirection.WEST, BlockDirection.UP, new BPos(6,8,5), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:entrance", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,10,9), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(14,15,9), 0, 0)
			),
// corridor/entrance_3 id = 80
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:entrance", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,9), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,13,4), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,18,9), 0, 0)
			),
// corridor/first_plate id = 81
			Arrays.asList(
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:atrium", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 1, 1),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,7), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,12), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,17), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:first_corridor", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,0,19), 1, 1)
			),
// corridor/second_plate id = 82
			Arrays.asList(
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:intersection", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,0,0), 1, 1),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,7), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,12), 0, 0),
					new JigsawBlock(15, JointType.ALIGNED, "minecraft:empty", "minecraft:slice", BlockDirection.UP, BlockDirection.NORTH, new BPos(9,0,17), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:second_corridor", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,0,19), 1, 1)
			),
// corridor/straight_1 id = 83
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
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
// corridor/straight_2 id = 84
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
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
// corridor/straight_3 id = 85
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
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
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,8,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(5,8,3), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,10,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_4 id = 86
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
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
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
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
// corridor/straight_5 id = 87
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
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
// corridor/straight_6 id = 88
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(8,1,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,3,2), 0, 0),
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(13,8,3), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(18,10,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.WEST, new BPos(7,13,1), 0, 0)
			),
// corridor/straight_7 id = 89
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
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
					new JigsawBlock(17, JointType.ALIGNED, "minecraft:empty", "minecraft:addon", BlockDirection.UP, BlockDirection.NORTH, new BPos(7,7,0), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,8,3), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,10,2), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:upper_corridor_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(18,15,2), 0, 0)
			),
// corridor/straight_8 id = 90
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:slice", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(9,0,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(5,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(5,3,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,1), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,2), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,3,3), 0, 0),
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
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(9,10,2), 0, 0)
			),
// corridor/addon/arrow_dispenser id = 91
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(6, 0, 1), 0, 0)
            ),
// corridor/addon/bridge_lower id = 92
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(6, 0, 1), 0, 0)
            ),
// corridor/addon/chandelier_upper id = 93
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:addon_upper", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0, 0, 0), 0, 0)
            ),
// corridor/addon/decoration_upper id = 94
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:addon_upper", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0, 0, 0), 0, 0)
            ),
// corridor/addon/display_1 id = 95
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:display", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// corridor/addon/display_2 id = 96
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:display", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// corridor/addon/display_3 id = 97
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:display", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// corridor/addon/head_upper id = 98
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:addon_upper", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0, 0, 0), 0, 0)
            ),
// corridor/addon/ladder_to_middle id = 99
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0, 0, 0), 0, 0)
            ),
// corridor/addon/open_walkway id = 100
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,2,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,4,1), 0, 0)
			),
// corridor/addon/open_walkway_upper id = 101
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:addon_upper", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(30, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(2,2,1), 0, 0)
			),
// corridor/addon/reward_upper id = 102
			Arrays.asList(
					new JigsawBlock(47, JointType.ALIGNED, "minecraft:addon_upper", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(3,2,1), 0, 0)
			),
// corridor/addon/staircase id = 103
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.WEST, new BPos(0, 0, 0), 0, 0)
            ),
// corridor/addon/wall id = 104
            Collections.emptyList(),
// corridor/addon/walled_walkway id = 105
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:addon", "minecraft:empty", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(0,0,0), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(2,2,2), 0, 0),
					new JigsawBlock(18, JointType.ALIGNED, "minecraft:empty", "minecraft:addon_upper", BlockDirection.UP, BlockDirection.NORTH, new BPos(0,4,1), 0, 0)
			),
// corridor/atrium/bogged_relief id = 106
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:relief", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 1, 2), 0, 0)
            ),
// corridor/atrium/breeze_relief id = 107
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:relief", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 1, 2), 0, 0)
            ),
// corridor/atrium/grand_staircase_1 id = 108
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:grand_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0, 2, 0), 0, 0)
            ),
// corridor/atrium/grand_staircase_2 id = 109
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:grand_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0, 2, 0), 0, 0)
            ),
// corridor/atrium/grand_staircase_3 id = 110
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:grand_staircase", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(0, 2, 0), 0, 0)
            ),
// corridor/atrium/spider_relief id = 111
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:relief", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 1, 2), 0, 0)
            ),
// corridor/atrium/spiral_relief id = 112
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:relief", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 1, 2), 0, 0)
            ),
// decor/barrel id = 113
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/black_bed id = 114
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/blue_bed id = 115
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/brown_bed id = 116
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/candle_1 id = 117
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/candle_2 id = 118
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/candle_3 id = 119
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/candle_4 id = 120
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/cyan_bed id = 121
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/dead_bush_pot id = 122
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/disposal id = 123
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:disposal", "minecraft:empty", BlockDirection.DOWN, BlockDirection.EAST, new BPos(0, 2, 0), 0, 0)
            ),
// decor/empty_pot id = 124
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/flow_pot id = 125
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/gray_bed id = 126
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/green_bed id = 127
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/guster_pot id = 128
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/light_blue_bed id = 129
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/light_gray_bed id = 130
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/lime_bed id = 131
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/magenta_bed id = 132
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/orange_bed id = 133
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/pink_bed id = 134
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/purple_bed id = 135
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/red_bed id = 136
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/scrape_pot id = 137
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/undecorated_pot id = 138
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:decor", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0, 0, 0), 0, 0)
            ),
// decor/white_bed id = 139
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// decor/yellow_bed id = 140
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:bed", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// dispensers/chamber id = 141
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:dispenser", "minecraft:empty", BlockDirection.UP, BlockDirection.WEST, new BPos(1, 0, 0), 0, 0)
            ),
// dispensers/floor_dispenser id = 142
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:floor_dispenser", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(0, 1, 0), 0, 0)
            ),
// dispensers/wall_dispenser id = 143
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:copper_dispenser", "minecraft:empty", BlockDirection.UP, BlockDirection.WEST, new BPos(0, 0, 0), 0, 0)
            ),
// hallway/cache_1 id = 144
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,14), 0, 0),
					new JigsawBlock(13, JointType.ALIGNED, "minecraft:empty", "minecraft:chest_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(5,3,7), 0, 0)
			),
// hallway/corner_staircase id = 145
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,2), 0, 0)
			),
// hallway/corner_staircase_down id = 146
			Arrays.asList(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,8,2), 0, 0)
			),
// hallway/corridor_connector_1 id = 147
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,2), 0, 0)
			),
// hallway/encounter_1 id = 148
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(11,2,13), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,7,13), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(7,7,8), 1, 1),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(8,7,13), 0, 0)
			),
// hallway/encounter_2 id = 149
			Arrays.asList(
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,2,10), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,2,1), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,4), 1, 1),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(5,2,12), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,2,4), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,2,12), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(12,2,3), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(13,2,9), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,7,0), 0, 0)
			),
// hallway/encounter_3 id = 150
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(4,2,0), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,2,4), 0, 0),
					new JigsawBlock(27, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,15,3), 1, 1),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,17,4), 0, 0)
			),
// hallway/encounter_4 id = 151
			Arrays.asList(
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,2,9), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(13,10,14), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,15,0), 0, 0),
					new JigsawBlock(31, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(9,15,9), 1, 1)
			),
// hallway/encounter_5 id = 152
			Arrays.asList(
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(11,0,10), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(11,0,11), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(11,0,12), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(11,0,13), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(13,0,8), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,0,15), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(14,0,8), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,0,15), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(15,0,8), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,0,9), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,0,10), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(15,0,15), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,2,6), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,2,17), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,2,8), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(18,2,14), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,4), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,5), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,8), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,9), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,10), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,13), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,14), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.WEST, BlockDirection.UP, new BPos(3,4,15), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(8,4,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,4,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.NORTH, BlockDirection.UP, new BPos(10,4,3), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,4,20), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(14,4,20), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,4,18), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.EAST, BlockDirection.UP, new BPos(15,4,19), 0, 0),
					new JigsawBlock(2, JointType.ALIGNED, "minecraft:empty", "minecraft:decor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(15,4,20), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,6,5), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,6,10), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,6,15), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.EAST, new BPos(1,6,20), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(3,6,1), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(4,6,23), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(8,6,1), 0, 0),
					new JigsawBlock(28, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,6,5), 1, 1),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(10,6,22), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.SOUTH, new BPos(13,6,1), 0, 0),
					new JigsawBlock(24, JointType.ALIGNED, "minecraft:empty", "minecraft:reward_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(14,6,4), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(15,6,22), 0, 0),
					new JigsawBlock(22, JointType.ALIGNED, "minecraft:empty", "minecraft:copper_dispenser", BlockDirection.DOWN, BlockDirection.WEST, new BPos(17,6,18), 0, 0)
			),
// hallway/left_corner id = 153
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(4,3,2), 0, 0)
			),
// hallway/long_straight_staircase id = 154
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,11,9), 0, 0)
			),
// hallway/long_straight_staircase_down id = 155
			Arrays.asList(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,11,9), 0, 0)
			),
// hallway/lower_hallway_connector id = 156
			Arrays.asList(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(10,3,2), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_corridor_connector", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,13,2), 0, 0)
			),
// hallway/right_corner id = 157
			Arrays.asList(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,3,2), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0)
			),
// hallway/rubble id = 158
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 3, 0), 0, 0)
            ),
// hallway/rubble_chamber id = 159
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 3, 0), 0, 0)
            ),
// hallway/rubble_chamber_thin id = 160
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 3, 0), 0, 0)
            ),
// hallway/rubble_thin id = 161
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2, 3, 0), 0, 0)
            ),
// hallway/straight id = 162
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,3,4), 0, 0)
			),
// hallway/straight_staircase id = 163
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,6,4), 0, 0)
			),
// hallway/straight_staircase_down id = 164
			Arrays.asList(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.NORTH, BlockDirection.UP, new BPos(2,3,0), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:in_connector", "minecraft:empty", BlockDirection.SOUTH, BlockDirection.UP, new BPos(2,6,4), 0, 0)
			),
// hallway/trapped_staircase id = 165
			Arrays.asList(
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(10,13,2), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:lower_corridor_connector", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,23,2), 0, 0)
			),
// hallway/upper_hallway_connector id = 166
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:upper_corridor_connector", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(10,3,2), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(10,10,2), 0, 0)
			),
// intersection/intersection_1 id = 167
			Arrays.asList(
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:first_corridor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,0,21), 1, 1),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:intersection", "minecraft:empty", BlockDirection.EAST, BlockDirection.UP, new BPos(21,0,9), 1, 1),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.EAST, BlockDirection.UP, new BPos(7,4,8), 0, 0),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.EAST, BlockDirection.UP, new BPos(7,4,10), 0, 0),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,4,14), 0, 0),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.WEST, BlockDirection.UP, new BPos(11,4,8), 0, 0),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.WEST, BlockDirection.UP, new BPos(11,4,10), 0, 0),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.WEST, BlockDirection.UP, new BPos(0,16,9), 0, 0)
			),
// intersection/intersection_2 id = 168
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:intersection", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,9), 1, 1),
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:first_corridor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(13,0,21), 1, 1),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.EAST, BlockDirection.UP, new BPos(22,4,4), 0, 0),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.SOUTH, BlockDirection.UP, new BPos(7,9,2), 0, 0),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.NORTH, BlockDirection.UP, new BPos(7,9,6), 0, 0),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.SOUTH, BlockDirection.UP, new BPos(9,9,2), 0, 0),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.NORTH, BlockDirection.UP, new BPos(9,9,6), 0, 0),
					new JigsawBlock(25, JointType.ROLLABLE, "minecraft:empty", "minecraft:ominous_vault", BlockDirection.EAST, BlockDirection.UP, new BPos(19,9,4), 0, 0)
			),
// intersection/intersection_3 id = 169
			Arrays.asList(
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:intersection", "minecraft:empty", BlockDirection.WEST, BlockDirection.UP, new BPos(0,0,10), 1, 1),
					new JigsawBlock(4, JointType.ROLLABLE, "minecraft:empty", "minecraft:in_connector", BlockDirection.SOUTH, BlockDirection.UP, new BPos(11,4,21), 0, 0),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.EAST, BlockDirection.UP, new BPos(9,16,8), 0, 0),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.EAST, BlockDirection.UP, new BPos(9,16,10), 0, 0),
					new JigsawBlock(19, JointType.ROLLABLE, "minecraft:empty", "minecraft:bed", BlockDirection.EAST, BlockDirection.UP, new BPos(9,16,12), 0, 0),
					new JigsawBlock(1, JointType.ROLLABLE, "minecraft:empty", "minecraft:first_corridor", BlockDirection.SOUTH, BlockDirection.UP, new BPos(11,17,21), 1, 1)
			),
// reward/ominous_vault id = 170
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:ominous_vault", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1, 1, 0), 0, 0)
            ),
// reward/vault id = 171
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ROLLABLE, "minecraft:reward_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1, 2, 0), 0, 0)
            ),
// spawner/breeze/breeze id = 172
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/connectors/breeze id = 173
			Arrays.asList(
					new JigsawBlock(33, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:spawner_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/connectors/melee id = 174
			Arrays.asList(
					new JigsawBlock(/* FIXME ALIAS -> spawner/melee/husk */ 34, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:spawner_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/connectors/ranged id = 175
			Arrays.asList(
					new JigsawBlock(/* FIXME ALIAS -> spawner/ranged/poison_skeleton */ 37, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:spawner_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/connectors/slow_ranged id = 176
			Arrays.asList(
					new JigsawBlock(/* FIXME ALIAS -> spawner/slow_ranged/poison_skeleton */ 40, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:spawner_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/connectors/small_melee id = 177
			Arrays.asList(
					new JigsawBlock(/* FIXME ALIAS -> spawner/small_melee/baby_zombie */ 43, JointType.ALIGNED, "minecraft:empty", "minecraft:spawner", BlockDirection.DOWN, BlockDirection.NORTH, new BPos(1,0,0), 0, 0),
					new JigsawBlock(47, JointType.ROLLABLE, "minecraft:spawner_connector", "minecraft:empty", BlockDirection.NORTH, BlockDirection.UP, new BPos(1,0,2), 0, 0)
			),
// spawner/melee/husk id = 178
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/melee/spider id = 179
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/melee/zombie id = 180
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/ranged/poison_skeleton id = 181
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/ranged/skeleton id = 182
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/ranged/stray id = 183
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/slow_ranged/poison_skeleton id = 184
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/slow_ranged/skeleton id = 185
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/slow_ranged/stray id = 186
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/small_melee/baby_zombie id = 187
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/small_melee/cave_spider id = 188
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/small_melee/silverfish id = 189
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
// spawner/small_melee/slime id = 190
            Collections.singletonList(
                    new JigsawBlock(47, JointType.ALIGNED, "minecraft:spawner", "minecraft:empty", BlockDirection.UP, BlockDirection.NORTH, new BPos(1, 1, 0), 0, 0)
            ),
			// empty
			Collections.emptyList()
	);

	// ---------------------------------------------------------------------

	public static final JigsawBlock[][] JIGSAW_BLOCKS;
	static {
		JIGSAW_BLOCKS = new JigsawBlock[JIGSAW_BLOCKS_V2.size()][];
		for (int i = 0; i < JIGSAW_BLOCKS.length; i++) {
			JIGSAW_BLOCKS[i] = JIGSAW_BLOCKS_V2.get(i).toArray(new JigsawBlock[0]);
		}
	}

	public static HashMap<String, Set<BlockDirection>>[] PIECE_CONNECTION_DIRECTIONS = new HashMap[JIGSAW_BLOCKS_V2.size()];
	static {
		for (int i = 0; i < JIGSAW_BLOCKS_V2.size(); i++) {
			PIECE_CONNECTION_DIRECTIONS[i] = new HashMap<>();
			for (JigsawBlock block : JIGSAW_BLOCKS_V2.get(i)) {
				PIECE_CONNECTION_DIRECTIONS[i].computeIfAbsent(block.name, (p) -> new HashSet<>()).add(TrialChambersPieces.BlockJigsawInfo.getOpposite(block.direction1));
			}
			for (Map.Entry<String, Set<BlockDirection>> entry : PIECE_CONNECTION_DIRECTIONS[i].entrySet()) {
				entry.setValue(EnumSet.copyOf(entry.getValue()));
			}
		}
	}

	public static HashMap<String, BlockBox>[] PIECE_TARGET_MIN_BOXES = new HashMap[JIGSAW_BLOCKS_V2.size()];
	static {
		for (int i = 0; i < JIGSAW_BLOCKS_V2.size(); i++) {
			HashMap<String, BlockBox> targetMinBoxes = new HashMap<>();

			for (JigsawBlock parentJigsaw : JIGSAW_BLOCKS_V2.get(i)) {
				BlockBox minBox = targetMinBoxes.get(parentJigsaw.targetName);

				if (TrialChambersPools.get(parentJigsaw.poolType) == null) continue;
				for (Pair<Integer, Integer> pair : TrialChambersPools.get(parentJigsaw.poolType)) {
					int childPieceId = pair.getFirst();
					if (childPieceId == TrialChambersPieces.EMPTY_PIECE_ID) continue;

					BPos childPieceSize = TrialChambersPieceSize.get(childPieceId);
					if (childPieceSize.getX() < 1 || childPieceSize.getY() < 1 || childPieceSize.getZ() < 1) continue;

					for (BlockRotation childPieceRotation : BlockRotation.values()) {
						for (JigsawBlock childJigsaw : JIGSAW_BLOCKS_V2.get(childPieceId)) {
							if (!childJigsaw.name.equals(parentJigsaw.targetName)) continue;
							if (childJigsaw.direction1.getAxis() == BlockDirection.Axis.Y) continue;
							if (childPieceRotation.rotate(childJigsaw.direction1) != parentJigsaw.direction1.getOpposite()) continue;

							BlockBox childPieceBox = new BlockBox(0, 0, 0, 0, 0, 0);
							BlockBoxUtil.setSizeRotatePos(childPieceBox, childPieceSize, childPieceRotation, new MutableBlockPos().set(BPos.ORIGIN.subtract(childPieceRotation.rotate(childJigsaw.relativePos, BPos.ORIGIN))));

							if (minBox == null) {
								minBox = childPieceBox;
							} else {
								BlockBoxUtil.intersect(minBox, childPieceBox);
							}
						}
					}
				}

				if (minBox != null && !BlockBoxUtil.isEmpty(minBox)) {
					targetMinBoxes.put(parentJigsaw.targetName, minBox);
				}
			}

			PIECE_TARGET_MIN_BOXES[i] = targetMinBoxes;
		}
	}

	public static final int[][] PIECE_JIGSAW_SORT_OFFSETS = new int[JIGSAW_BLOCKS_V2.size()][3];
	static {
		for (int pieceID = 0; pieceID < 170; pieceID++) {
			List<JigsawBlock> pieceJigsaws = JIGSAW_BLOCKS_V2.get(pieceID);
			pieceJigsaws.sort(
					Comparator.comparingInt(
						(var0x) -> -var0x.selectionPriority
					)
			);

			for (JigsawBlock jigsaw : pieceJigsaws) {
				if (jigsaw.selectionPriority == 2)
					PIECE_JIGSAW_SORT_OFFSETS[pieceID][1]++;
				if (jigsaw.selectionPriority >= 1)
					PIECE_JIGSAW_SORT_OFFSETS[pieceID][0]++;
			}
		}
	}
}
