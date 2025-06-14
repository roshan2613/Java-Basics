package com.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create an ArrayList and add elements to it
        ArrayList<String> cars = new ArrayList<>();
        cars.add("honda");
        cars.add("toyota");
        cars.add("hyundai");
        cars.add("benz");

        // Create a TreeSet and add elements from the ArrayList
        TreeSet<String> carSet = new TreeSet<>(cars);

        // Prints according to alphbetical order for strings
        System.out.println("TreeSet elements sorted:");
        for (String car : carSet) {
            System.out.println(car);
        }
    }
}
