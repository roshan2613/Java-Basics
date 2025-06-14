package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("honda");
        cars.add("toyota");
        cars.add("hyundai");
        cars.add("hyundai");
        cars.add("Alpha");
        cars.add(null);

        // Create a HashSet and add elements from the ArrayList
        HashSet<String> carSet = new HashSet<>();
        carSet.add("honda");
        carSet.add("toyota");
        carSet.add("hyundai");
        carSet.add("hyundai");
        carSet.add("Alpha");
        carSet.add(null);

        // Print elements of the HashSet
        System.out.println("HashSet elements:");
        for (String car : carSet) {
            System.out.println(car);
        }
    }
}