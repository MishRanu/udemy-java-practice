package com.garuna.roomcomposition;

public class TableLamp {
    private String name;
    private boolean battery;
    private Dimensions dimensions;
    private String rating;

    public TableLamp(String name, boolean battery, Dimensions dimensions, String rating) {
        this.name = name;
        this.battery = battery;
        this.dimensions = dimensions;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public boolean isBattery() {
        return battery;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getRating() {
        return rating;
    }
}
