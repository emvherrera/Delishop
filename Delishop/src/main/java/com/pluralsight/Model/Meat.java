package com.pluralsight.Model;

//Concrete Represents premium meat toppings that can be added to a sandwich.
public class Meat extends PremiumToppings {

    private final String sandwichSize;
    boolean isExtra;

    public Meat(String name, String sandwichSize, boolean isExtra) {
        super(name);
        this.sandwichSize = sandwichSize;
        this.isExtra = isExtra;
    }

    // calculates the cost based on the sandwich size (4", 8", 12") and whether the customer requested "extra meat".
    public double getPrice() {
        double price = 0.0;
        if (sandwichSize.equals("4")) {
            price = 1.00;
        } else if (sandwichSize.equals("8")) {
            price = 2.00;
        } else if (sandwichSize.equals("12")) {
            price = 3.00;
        }

        if (isExtra) {
            if (sandwichSize.equals("4")) {
                price += 0.50;
            } else if (sandwichSize.equals("8")) {
                price += 1.00;
            } else if (sandwichSize.equals("12")) {
                price += 1.50;
            }
        }
        return price;
    }
}
