package edu.bu.met.cs665.assignment1;

public class LatteMacchiato extends Coffee {

    public LatteMacchiato() {
        super("Latte Macchiato", 3.0);
    }

    @Override
    public void brew() {
        System.out.println("Brewing LatteMacchiato");
    }
}
