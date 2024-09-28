package edu.bu.met.cs665.assignment1;

public class VendingMachine {

    public Beverage prepareBeverage(String beverageType, int milkUnits, int sugarUnits) throws IllegalArgumentException {
        Beverage beverage;

        if (beverageType.equalsIgnoreCase("Espresso")) {
            beverage = new Espresso();
        } else if (beverageType.equalsIgnoreCase("Americano")) {
            beverage = new Americano();
        } else if (beverageType.equalsIgnoreCase("Latte Macchiato")) {
            beverage = new LatteMacchiato();
        } else if (beverageType.equalsIgnoreCase("Black Tea")) {
            beverage = new BlackTea();
        } else if (beverageType.equalsIgnoreCase("Green Tea")) {
            beverage = new GreenTea();
        } else if (beverageType.equalsIgnoreCase("Yellow Tea")) {
            beverage = new YellowTea();
        } else {
            throw new IllegalArgumentException("Invalid beverage selection");
        }

        beverage.brew();
        addCondiments(beverage, milkUnits, sugarUnits);
        return beverage;
    }

    private void addCondiments(Beverage beverage, int milkUnits, int sugarUnits) {
        if (milkUnits > 0) {
            beverage.getCondiments().add(new Milk(milkUnits));
        }
        if (sugarUnits > 0) {
            beverage.getCondiments().add(new Sugar(sugarUnits));
        }
    }

    public double calculatePrice(Beverage beverage) {
        double totalPrice = beverage.getBasePrice();

        for (Condiment condiment : beverage.getCondiments()) {
            totalPrice += condiment.getPrice();
        }

        return totalPrice;
    }
}
