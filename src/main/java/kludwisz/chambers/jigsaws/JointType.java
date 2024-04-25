package kludwisz.chambers.jigsaws;

public enum JointType {
	ALIGNED,
	ROLLABLE;
	
	public boolean isRollable() {
		return this.equals(ROLLABLE);
	}
}
