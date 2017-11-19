package com.garuna.burgersproject;

import com.garuna.burgersproject.additionalitem.AdditionalItem;
import com.garuna.burgersproject.basehamburger.Basehamburger;
import com.garuna.burgersproject.cheesehamburger.Cheesehamburger;
import com.garuna.burgersproject.continentalhamburger.Continentalhamburger;

public class Main {

    public static void addAdditionalItems(Basehamburger hamburger, AdditionalItem additionalItem){
        if(hamburger.getAdditionalItems().size()<=4)
            hamburger.addAdditionalItem(additionalItem);
    }

    public static void main(String[] args) {
	// write your code here\
        Basehamburger basehamburger = new Basehamburger(100, "wheat", "pork");
        basehamburger.makeHamburger();
        Basehamburger cheeseHamburger = new Cheesehamburger(100, "wheat", "chicken");
        cheeseHamburger.makeHamburger();
        Basehamburger continentalHamBurger = new Continentalhamburger(120, "wheet floor", "tofu");
        continentalHamBurger.makeHamburger();
        addAdditionalItems(continentalHamBurger, new AdditionalItem("tomoto", 30, "tangy tomoato"));
        continentalHamBurger.toString();
    }
}
