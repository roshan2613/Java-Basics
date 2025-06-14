package com.Arraylistprac;



import java.util.ArrayList;


public class Iterator {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> cars = new ArrayList<>();

        // Add elements to the ArrayList
        cars.add("honda");
        cars.add("toyota");
        cars.add("hyndai1");
        cars.add("hyndai");



        // Iterate through the ArrayList 
        // advantge over using an Iterator 
        // loop is that it safely modifies the list over Iteration)
        java.util.Iterator<String> it = cars.iterator();

        // uses .hasnext () method
     
        while (it.hasNext()) {
            String color = it.next();
            System.out.println(color);
            if(color.equals("hyndai1")){
                it.remove();
            }
        }

        System.out.println("******************"+cars);

    }
}