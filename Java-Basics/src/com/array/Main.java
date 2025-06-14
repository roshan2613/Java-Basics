package com.array;

import java.sql.Array;

public class Main {
    public static void main (String [] args){
        int [] arr = new int [5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;


        String [] words =  new String[5];

        words[0] = "Roshan";
        words[1] = "Vijay";

        for (int i = 0; i<words.length; i++){
            System.out.println(words[i]);
        }

   for (int i = 0; i< arr.length; i++){
       System.out.println(arr[i]);
   }




//        for (int i =0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }

    }
}
