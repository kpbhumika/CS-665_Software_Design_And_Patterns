package edu.bu.met.cs665.assignment1;

public class GreenTea extends Tea {

    public GreenTea() {
        super("Green Tea", 2);
    }

    @Override
    public void brew() {
        System.out.println("Brewing green tea");
    }
}
