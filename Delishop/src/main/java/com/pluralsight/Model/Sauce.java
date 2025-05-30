package com.pluralsight.Model;

public class Sauce extends Toppings{
    public Sauce(String name) {
        super(name);
    }
    @Override
    public double getPrice(){
        return 0.0;
    }
}
