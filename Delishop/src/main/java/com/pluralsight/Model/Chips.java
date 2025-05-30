package com.pluralsight.Model;


//concrete returns fixed price for 'included' chips
public class Chips implements Priceable{

    private final String type;

    public Chips(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override

// returns fixed price for chips; only one price regardless of chip type
    public double getPrice() {

        return 1.50;
    }
    @Override
    public String toString() {
        return type + " Chips - $" + String.format("%.2f", getPrice());
    }
}
