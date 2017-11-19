package com.garuna.roomcomposition;

public class Bed {
    private Dimensions dimensions;
    private String pillows;
    private String quilt;
    private String bedSheet;

    public Bed(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Bed(Dimensions dimensions, String pillows, String quilt, String bedSheet) {
        this.dimensions = dimensions;
        this.pillows = pillows;
        this.quilt = quilt;
        this.bedSheet = bedSheet;
    }

    public String getPillows() {
        return pillows;
    }

    public void setPillows(String pillows) {
        this.pillows = pillows;
    }

    public String getQuilt() {
        return quilt;
    }

    public void setQuilt(String quilt) {
        this.quilt = quilt;
    }

    public String getBedSheet() {
        return bedSheet;
    }

    public void setBedSheet(String bedSheet) {
        this.bedSheet = bedSheet;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
