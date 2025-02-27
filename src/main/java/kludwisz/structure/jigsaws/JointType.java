package kludwisz.structure.jigsaws;

public enum JointType {
	ALIGNED,
	ROLLABLE;
	
	public boolean isRollable() {
		return this.equals(ROLLABLE);
	}
}
