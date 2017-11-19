package com.garuna.roomcomposition;

public class Wall {
    private Dimensions dimensions;
    private String direction;

    public Wall(Dimensions dimensions, String direction) {
        this.dimensions = dimensions;
        this.direction = direction;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getDirection() {
        return direction;
    }
}
