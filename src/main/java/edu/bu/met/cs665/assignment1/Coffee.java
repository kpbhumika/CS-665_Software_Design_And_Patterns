package edu.bu.met.cs665.assignment1;

public abstract class Coffee extends Beverage {

    public Coffee(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public abstract void brew();
}

