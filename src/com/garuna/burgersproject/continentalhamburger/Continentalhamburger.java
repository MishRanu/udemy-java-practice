package com.garuna.burgersproject.continentalhamburger;

import com.garuna.burgersproject.basehamburger.Basehamburger;

/**
 * Created by User on 06-Nov-17.
 */
public class Continentalhamburger extends Basehamburger {


    public Continentalhamburger(long basePrice, String breadType, String meat) {
        super(basePrice, breadType, meat);
    }

    @Override
    public boolean makeHamburger(){
        System.out.println("Making continental hamburger");
        System.out.println(toString());
        return true;
    }

    @Override
    public String toString() {
        return "Continentalhamburger{} " + super.toString();
    }
}
