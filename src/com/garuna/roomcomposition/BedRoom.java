package com.garuna.roomcomposition;

public class BedRoom extends Room {
    private String name;
    private Bed bed;
    private TableLamp tableLamp;

    public BedRoom(String name, Dimensions dimensions, Door[] doors, Window[] windows, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling) {
        super(dimensions, doors, windows, wall1, wall2, wall3, wall4, ceiling);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public TableLamp getTableLamp() {
        return tableLamp;
    }

    public void setTableLamp(TableLamp tableLamp) {
        this.tableLamp = tableLamp;
    }
}
