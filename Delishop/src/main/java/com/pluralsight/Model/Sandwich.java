package com.pluralsight.Model;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Priceable{

    private String size = "";

    // "white", "wheat", "rye", "wrap"
    private final String breadType;
    private boolean toasted;

    // Allow multiple meats
    private final List<Meat> meats;

    // Allow multiple cheeses
    private final List<Cheese> cheese;

    private final List<RegularToppings> regularToppings;
    private final List<Sauce> sauce;

    public Sandwich(String size, String breadType) {

        this.size = size;
        this.breadType = breadType;
        this.toasted = false;
        this.meats = new ArrayList<>();
        this.cheese = new ArrayList<>();
        this.regularToppings = new ArrayList<>();
        this.sauce = new ArrayList<>();
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
    public void addMeat(String name, boolean isExtra){
        this.meats.add(new Meat(name, this.size, isExtra));
    }
    public void addCheese(String name, boolean isExtra){
        this.cheese.add(new Cheese(name, this.size, isExtra));
    }
    public void addRegularTopping(String name){
        this.regularToppings.add(new RegularToppings(name));
    }
    public void addSauce(String name){
        this.sauce.add(new Sauce(name));
    }

    @Override
    public double getPrice() {
        double price = 0.0;
//        calculating price based on the bread size
        if (size.equals("4")){
            price += 5.50;
        } else if (size.equals("8")) {
            price += 7.00;
        } else if (size.equals("12")) {
            price += 8.50;
        }

//        looping through premium topping and adding price
        for (Meat meat : meats){
            price += meat.getPrice();
        }
        for (Cheese cheese: cheese){
            price += cheese.getPrice();
        }
        return price;
    }
// this method overrides a method from a superclass (like Object's toString()).
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("   Size: ").append(size).append("\n");
        sb.append("   Bread: ").append(breadType).append("\n");
        if (toasted) {
            sb.append("   Toasted: Yes\n");
        }
        //check if any meat on sandwich
        if (!meats.isEmpty()) {
            sb.append("   Meats: ");
            for (int i = 0; i < meats.size(); i++) {
                sb.append(meats.get(i).getName());
                if (meats.get(i).isExtra) {
                    sb.append(" (Extra)");
                }
                // Add a comma and space if it's not the last meat in the list, for better readability.
                if (i < meats.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("\n");
        }
        // Check if there are any cheeses on the sandwich.

        if (!cheese.isEmpty()) {
            //label cheese
            sb.append("   Cheeses: ");
            //loop through each cheese name
            for (int i = 0; i < cheese.size(); i++) {
                sb.append(cheese.get(i).getName());
                //check if cheese is an extra portion
                if (cheese.get(i).isExtra) {
                    //if extra append Extra
                    sb.append(" (Extra)");
                }
                if (i < cheese.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("\n");
        }
        //check if any regular toppings
        if (!regularToppings.isEmpty()) {
            // Use Java Streams to get the names of all sauces and join them with ", ".
            sb.append("   Other Toppings: ").append(String.join(", ", regularToppings.stream().map(Toppings::getName).collect(java.util.stream.Collectors.toList()))).append("\n");
        }
        //check if any sauces
        if (!sauce.isEmpty()) {
            // Use Java Streams to efficiently get the names of all regular toppings and join them with ", ".
            // This is a more modern way to process collections.
            sb.append("   Sauces: ").append(String.join(", ", sauce.stream().map(Toppings::getName).collect(java.util.stream.Collectors.toList()))).append("\n");
        }
        sb.append(String.format("   Sandwich Price: $%.2f\n", getPrice()));
        //getPrice method that calculates total cost of sandwich class
        return sb.toString();
    }
}
