package com.garuna.roomcomposition;

public class Door {
    private Dimensions dimensions;
    private boolean hasLock;
    private boolean isLocked = false;

    public Door(Dimensions dimensions, boolean hasLock) {
        this.dimensions = dimensions;
        this.hasLock = hasLock;
    }

    public boolean isHasLock() {
        return hasLock;
    }

    public void setHasLock(boolean hasLock) {
        this.hasLock = hasLock;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
