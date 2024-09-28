package edu.bu.met.cs665.assignment1;

public class Espresso extends Coffee{
    public Espresso() {
        super("Espresso", 2.5);
    }

    @Override
    public void brew() {
        System.out.println("Brewing espresso");
    }
}
