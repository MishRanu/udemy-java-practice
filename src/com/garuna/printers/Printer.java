package com.garuna.printers;

public class Printer {

    private String name;
    private Toner toner;
    private int trayCapacity;
    private boolean isBnw;
    private boolean isDuplex;

    public Printer(String name, Toner toner, int trayCapacity, boolean isBnw, boolean isDuplex) {
        this.name = name;
        this.toner = toner;
        this.trayCapacity = trayCapacity;
        this.isBnw = isBnw;
        this.isDuplex = isDuplex;
    }

    public void refillToner(){
        getToner().refillToner();
    }

    public boolean checkPageInTray(){
        return true;
    }

    public void printPage(String content, int pageNo){
        if(getToner().getTonerCapacity()==0){
            System.out.println("Cannot print. Please refill the toner to print");
            return;
        }
        else if(getToner().getTonerCapacity()<=5){
            System.out.println("Low toner capacity. Please refill the toner soon");
        }
        System.out.println("Printing page " + pageNo);
    }

    public void printOrder(int numPages, boolean isDuplex){

        for(int i=0; i<numPages; i++) {
            if (checkPageInTray()) {
                printPage("", i+1);
                if(isDuplex)
                    printPage("", i+1);
            }
        }

    }

    public String getName() {
        return name;
    }

    public int getTrayCapacity() {
        return trayCapacity;
    }

    public boolean isBnw() {
        return isBnw;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public Toner getToner() {
        return toner;
    }

    public void setToner(Toner toner) {
        this.toner = toner;
    }
}
