package edu.bu.met.cs665.assignment1;

public abstract class Tea extends Beverage {

    public Tea(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public abstract void brew();
}

