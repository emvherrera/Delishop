package com.pluralsight.Model;

public class PremiumToppings extends Toppings{

    public PremiumToppings(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
