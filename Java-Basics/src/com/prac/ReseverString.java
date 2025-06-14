package com.prac;

public class ReseverString {

    public static void main (String [] args){


     String str ="Roshan";
     String reversed = "";
     for (int i = str.length()-1; i >= 0; i--){
         reversed +=  str.charAt(i ) ;

        }


        System.out.println(reversed);


    }
}
