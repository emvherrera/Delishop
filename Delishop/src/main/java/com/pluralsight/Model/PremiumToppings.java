package com.pluralsight.Model;

public class PremiumToppings extends Toppings{

    //abstract class, base for premium toppings like meat and cheese
    //inherits methods from toppings
    public PremiumToppings(String name) {
        super(name);
    }

    //abstract getprice method, based on specific pricing
    @Override
    public double getPrice() {
        return 0;
    }
}
