package com.garuna.roomcomposition;

public class Room {
    private Dimensions dimensions;
    private Door[] doors;
    private Window[] windows;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;

    public Room(Dimensions dimensions, Door[] doors, Window[] windows, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling) {
        this.dimensions = dimensions;
        this.doors = doors;
        this.windows = windows;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
    }
}
