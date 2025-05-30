package com.pluralsight.Model;


//an abstract base class for all types of toppings (regular and premium).
public abstract class Toppings implements Priceable {
    private final String name;

    public Toppings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    @Override
    public abstract double getPrice();

    @Override
    public String toString() {
        return name;
    }
}
