package edu.bu.met.cs665.assignment1;

public class BlackTea extends Tea {

    public BlackTea() {
        super("Black Tea", 2.0);
    }

    @Override
    public void brew() {
        System.out.println("Brewing BlackTea");
    }
}
