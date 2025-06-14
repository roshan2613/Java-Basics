package com.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main( String [] args){

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}
