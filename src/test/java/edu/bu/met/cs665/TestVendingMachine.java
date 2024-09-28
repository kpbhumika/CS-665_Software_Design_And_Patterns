package edu.bu.met.cs665;
import edu.bu.met.cs665.assignment1.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class TestVendingMachine {
    @Test
    public void testPrepareEspresso() {
        VendingMachine vendingMachine = new VendingMachine();
        Beverage beverage = vendingMachine.prepareBeverage("Espresso", 0, 0);
        assertEquals("Espresso", beverage.getName());
        assertEquals(2.5, beverage.getBasePrice(), 0.0);
        assertEquals(0, beverage.getCondiments().size());
    }

    @Test
    public void testPrepareLatteMacchiatoWithCondiments() {
        VendingMachine vendingMachine = new VendingMachine();
        Beverage beverage = vendingMachine.prepareBeverage("Latte Macchiato", 2, 1);
        assertEquals("Latte Macchiato", beverage.getName());
        assertEquals(3.0, beverage.getBasePrice(),0.0);
        assertEquals(2, beverage.getCondiments().size());
        // ... verify condiment types and units
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testInvalidBeverageType() {
        VendingMachine vendingMachine = new VendingMachine();
        thrown.expect(IllegalArgumentException.class);
        vendingMachine.prepareBeverage("InvalidBeverage", 0, 0);
    }

    @Test
    public void testInvalidCondimentUnits() {
        VendingMachine vendingMachine = new VendingMachine();
        thrown.expect(IllegalArgumentException.class);
        vendingMachine.prepareBeverage("Espresso", 4, 2);
    }

}
