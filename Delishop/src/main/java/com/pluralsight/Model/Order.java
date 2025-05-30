package com.pluralsight.Model;

import java.util.ArrayList;
import java.util.List;

//concrete rep a complete customer order; 1 or more sandwiches, drinks, chips.
//provides methods to add items to the order and display details

public class Order implements Priceable {
    //    making Arrays for the order
    private final List<Sandwich> sandwiches;
    private final List<Drink> drinks;
    private final List<Chips> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void addSandwich(Sandwich sandwich) {
        this.sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
    }

    public void addChip(Chips chips) {
        this.chips.add(chips);
    }


    // calculates the total cost of the entire order by summing the prices of all items within its lists.
    @Override
    public double getPrice() {
//        total price for the order
        double totalPrice = 0.0;
        for (Sandwich sandwich : sandwiches) {
            totalPrice += sandwich.getPrice();
        }
        for (Drink drink : drinks) {
            totalPrice += drink.getPrice();
        }
        for (Chips chips : chips) {
            totalPrice += chips.getPrice();
        }
        return totalPrice;
    }
}