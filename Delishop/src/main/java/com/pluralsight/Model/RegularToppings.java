package com.pluralsight.Model;

public class RegularToppings extends Toppings{

    public RegularToppings(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return 0.0; // Regular toppings are included in the base sandwich price
    }
}
