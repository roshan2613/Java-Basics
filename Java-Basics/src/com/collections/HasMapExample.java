package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HasMapExample {public static void main(String[] args) {

    HashMap<Integer, String> cars = new HashMap<>();

    // Add car brands to the HashMap (uses put method for hash map insted of add )
    cars.put(1, "Honda");
    cars.put(2, "Toyota");
    cars.put(3, "Hyundai");
    cars.put(4, "Benz");


    for (Integer key : cars.keySet()) {
        System.out.println("Key: " + key + ", Value: " + cars.get(key));
    }

    for(Map.Entry e : cars.entrySet()){

        System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
    }

    System.out.println("******* : " + cars.get(10));
}
}

