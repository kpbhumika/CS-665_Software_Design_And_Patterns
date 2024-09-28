/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;
import edu.bu.met.cs665.assignment1.*;
import java.util.Scanner;
//import edu.bu.met.cs665.example1.Person;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */

  //Assignment 1

  public static void main(String[] args) {
      VendingMachine vendingMachine = new VendingMachine();

      // Prepare a beverage with milk and sugar
      Beverage beverage = vendingMachine.prepareBeverage("Latte Macchiato", 3, 3);

      // Print the added condiments
      System.out.println("Condiments:");
      for (Condiment condiment : beverage.getCondiments()) {
          System.out.println("- " + condiment.getType() + ": " + condiment.getUnits() + " units");
      }

      System.out.println("Base Price: $" + beverage.getBasePrice());

      // Calculate and print the final price
      double totalPrice = vendingMachine.calculatePrice(beverage);
      System.out.println("Total Price: $" + totalPrice);
  }
}
