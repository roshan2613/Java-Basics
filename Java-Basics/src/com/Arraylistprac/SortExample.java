package com.Arraylistprac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortExample {
    public static void main (String [] args){
        ArrayList<String>list = new ArrayList<>();
        list.add("Honda");
        list.add("BMW");
        list.add("Alpha Remo");

        //sorting on strings on bases of alphabetic order
        Collections.sort(list);

        System.out.println(list);
    }
}
