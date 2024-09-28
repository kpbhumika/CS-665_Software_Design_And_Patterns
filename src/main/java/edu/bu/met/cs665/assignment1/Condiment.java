package edu.bu.met.cs665.assignment1;

public class Condiment {

    private final String type;
    private final int units;
    private final double pricePerUnit;

    public Condiment(String type, int units, double pricePerUnit) {
        if (units < 0 || units > 3) {
            throw new IllegalArgumentException("Units for "+ type + " must be between 0 and 3");
        }
        this.type = type;
        this.units = units;
        this.pricePerUnit = pricePerUnit;
    }

    public String getType() {
        return type;
    }

    public int getUnits() {
        return units;
    }

    public double getPrice() {
        return units * pricePerUnit;
    }
}

