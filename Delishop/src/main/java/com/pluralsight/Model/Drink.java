package com.pluralsight.Model;

//concrete stores size and flavor of drink
//cost based on size

public class Drink implements Priceable{

    private final String size; // "Small", "Medium", "Large"
    private final String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    @Override

    public double getPrice() {
        if (size.equalsIgnoreCase("Small")){
            return 2.00;
        } else if (size.equalsIgnoreCase("Medium")) {
            return 2.50;
        }else if (size.equalsIgnoreCase("Large")){
            return 3.00;
        }
        return 0.0;
    }
    @Override
    public String toString() {
        return flavor + " (" + size + ") - $" + String.format("%.2f", getPrice());
    }
}
