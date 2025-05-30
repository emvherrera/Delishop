package com.pluralsight.Model;

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
