package edu.bu.met.cs665.assignment1;

public class Americano extends Coffee{
    public Americano() {
        super("Americano", 2.0);
    }

    @Override
    public void brew() {
        System.out.println("Brewing Americano");
    }
}
