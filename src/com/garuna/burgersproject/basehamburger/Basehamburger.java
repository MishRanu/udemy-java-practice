package com.garuna.burgersproject.basehamburger;

import com.garuna.burgersproject.additionalitem.AdditionalItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 06-Nov-17.
 */
public class Basehamburger {
    private long basePrice;
    private String breadType;
    private String meat;
    private List<AdditionalItem> additionalItems = new ArrayList<>();
    private long totalPrice;

    public Basehamburger(long basePrice, String breadType, String meat) {
        this.basePrice = basePrice;
        this.breadType = breadType;
        this.meat = meat;
    }

    public void addAdditionalItem(AdditionalItem additionalItem){
        System.out.println("adding additional item");
        additionalItems.add(additionalItem);
    }

    private long calculatePrice(){
        totalPrice+=basePrice;
        for(AdditionalItem additionalItem:additionalItems){
            totalPrice+=additionalItem.getPrice();
        }

        return totalPrice;
    }

    public boolean makeHamburger(){
        System.out.println("Making Base Hamburger");
        System.out.println(toString());
        return true;
    }

    public long getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(long basePrice) {
        this.basePrice = basePrice;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<AdditionalItem> getAdditionalItems() {
        return additionalItems;
    }

    public void setAdditionalItems(List<AdditionalItem> additionalItems) {
        this.additionalItems = additionalItems;
    }

    @Override
    public String toString() {
        return "Basehamburger{" +
                "basePrice=" + basePrice +
                ", breadType='" + breadType + '\'' +
                ", meat='" + meat + '\'' +
                ", additionalItems=" + additionalItems +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
