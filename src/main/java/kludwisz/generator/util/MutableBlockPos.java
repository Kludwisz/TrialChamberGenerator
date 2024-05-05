package kludwisz.generator.util;

import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mccore.util.pos.BPos;

public class MutableBlockPos {
    public static final MutableBlockPos ORIGIN = new MutableBlockPos();

    public int x;
    public int y;
    public int z;

    public MutableBlockPos() {

    }

    public BPos toImmutable() {
        return new BPos(this.x, this.y, this.z);
    }

    public MutableBlockPos set(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public MutableBlockPos set(BPos pos) {
        return this.set(pos.getX(), pos.getY(), pos.getZ());
    }

    public MutableBlockPos rotate(BlockRotation rotation) {
        switch (rotation) {
            case NONE:
                break;
            case CLOCKWISE_90:
                this.x = -this.z;
                this.z = this.x;
                break;
            case CLOCKWISE_180:
                this.x = -this.x;
                this.z = -this.z;
                break;
            case COUNTERCLOCKWISE_90:
                this.x = this.z;
                this.z = -this.x;
                break;
        }
        return this;
    }

    public MutableBlockPos offset(int x, int y, int z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }

    public void setRotateOffset(BPos point, BlockRotation rotation, MutableBlockPos offset) {
        switch (rotation) {
            case NONE:
                this.x = offset.x + point.getX();
                this.y = offset.y + point.getY();
                this.z = offset.z + point.getZ();
                break;
            case CLOCKWISE_90:
                this.x = offset.x - point.getZ();
                this.y = offset.y + point.getY();
                this.z = offset.z + point.getX();
                break;
            case CLOCKWISE_180:
                this.x = offset.x - point.getX();
                this.y = offset.y + point.getY();
                this.z = offset.z - point.getZ();
                break;
            case COUNTERCLOCKWISE_90:
                this.x = offset.x + point.getZ();
                this.y = offset.y + point.getY();
                this.z = offset.z - point.getX();
                break;
        }
    }
}
