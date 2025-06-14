package com.designpattern;


public class Singleton {

    // Step 1: Create a private static instance of the class
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent instantiation
    private Singleton() {
        // Private constructor to prevent instantiation
    }

    // Step 3: Provide a public static method to get the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            // Create the instance if it doesn't exist
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}