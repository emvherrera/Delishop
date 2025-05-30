package com.pluralsight;

import com.pluralsight.ui.UserInterface;

public class Program {

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.run();
    }
}

// main application class where the command-line interface resides.
// It orchestrates the user interaction, menu navigation, and creation of Order and item objects.
// Displays the home screen options (New Order, Exit).

//Handles input for navigating to the order screen.
//Manages the process of adding sandwiches, drinks, and chips to the current Order.
//
// Handles the checkout process, displaying order details and saving the receipt to a file.
// Manages order cancellation.
//Interactions: It creates and manipulates instances of Order, Sandwich, Drink, and Chips, and uses a Scanner to read user input