package com.garuna.printers;

public class Toner {

    private int tonerCapacity;
    private int totalPrints;
    private int maxPrints;

    public Toner(int tonerCapacity, int totalPrints, int maxPrints) {
        this.tonerCapacity = tonerCapacity;
        this.totalPrints = totalPrints;
        this.maxPrints = maxPrints;
    }


    public void refillToner(){
        tonerCapacity=100;
        totalPrints=0;
    }

    public void printPage(){
        totalPrints++;
        tonerCapacity = (1-totalPrints/maxPrints)*100;
        System.out.println("Printing the page");
    }

    public int getTonerCapacity() {
        return tonerCapacity;
    }


    public int getTotalPrints() {
        return totalPrints;
    }

    public int getMaxPrints() {
        return maxPrints;
    }
}
