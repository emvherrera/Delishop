package com.pluralsight.Model;

//Represents toppings that are included in the base sandwich price and do not incur an extra charg

public class RegularToppings extends Toppings{

    public RegularToppings(String name) {
        super(name);
    }
//getPrice() method will always return 0.0, as these are "Included".
    @Override
    public double getPrice() {
        return 0.0; // Regular toppings are included in the base sandwich price
    }
}
