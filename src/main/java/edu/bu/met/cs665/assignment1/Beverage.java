package edu.bu.met.cs665.assignment1;

import java.util.ArrayList;
import java.util.List;

// Declaring an abstract class
public abstract class Beverage {

    private String name;
    private double basePrice;
    private List<Condiment> condiments = new ArrayList<>();

    // constructor
    public Beverage(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName(){
        return name;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public List<Condiment> getCondiments() {
        return condiments;
    }

    // abstract method to brew
    public abstract void brew() ;
}
