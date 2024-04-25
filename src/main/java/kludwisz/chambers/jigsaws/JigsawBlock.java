package kludwisz.chambers.jigsaws;

import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.pos.BPos;

public class JigsawBlock {
    public int poolType;
    public String poolAlias;
    public JointType jointType;
    public String name;
    public String targetName;
    public BlockDirection direction1;
    public BlockDirection direction2;
    public BPos relativePos;
    
    private int selectionPriority;
    private int placementPriority;

    public JigsawBlock(int poolType, JointType jointType, String name, String targetName,
                       BlockDirection direction1, BlockDirection direction2, BPos relativePos,
                       int selectionPrio, int placementPrio)
    {
        this.poolType = poolType;
        this.poolAlias = null;
        this.jointType = jointType;
        this.name = name;
        this.targetName = targetName;
        this.direction1 = direction1;
        this.direction2 = direction2;
        this.relativePos = relativePos;
        
        // new nbt values, introduced in 23w43a
        this.selectionPriority = selectionPrio;
        this.placementPriority = placementPrio;
    }
    
    /*
    public JigsawBlock(String alias, JointType jointType, String name, String targetName,
            BlockDirection direction1, BlockDirection direction2, BPos relativePos)
	{
		this(-1, jointType, name, targetName, direction1, direction2, relativePos);
		this.poolAlias = alias;
	}
	*/
    
    public int getSelectionPriority() {
    	return this.selectionPriority;
    }
    
    public int getPlacementPriority() {
    	return this.placementPriority;
    }
}