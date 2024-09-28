package edu.bu.met.cs665.assignment1;

public class YellowTea extends Tea {

    public YellowTea() {
        super("Yellow Tea", 2);
    }

    @Override
    public void brew() {
        System.out.println("Brewing yellow tea");
    }
}
