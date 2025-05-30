package com.pluralsight.Model;

//interface
//defines a common contract for any item in application that has a price
//promotes polymorphism with objects in uniform to calculate the total order cost
public interface Priceable {
    double getPrice();
}
