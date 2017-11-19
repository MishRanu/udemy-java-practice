package com.garuna.burgersproject.cheesehamburger;

import com.garuna.burgersproject.additionalitem.AdditionalItem;
import com.garuna.burgersproject.basehamburger.Basehamburger;

/**
 * Created by User on 06-Nov-17.
 */

public class Cheesehamburger extends Basehamburger{

    public Cheesehamburger(long basePrice, String breadType, String meat) {
        super(basePrice, breadType, meat);
        addAdditionalItem(new AdditionalItem("cheese", 50, "delicious mozarella"));
    }

    @Override
    public boolean makeHamburger(){
        System.out.println("Making Cheese hamburger");
        System.out.println(toString());
        return true;
    }

    @Override
    public String toString() {
        return "Cheesehamburger{} " + super.toString();
    }
}