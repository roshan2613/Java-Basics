package com.statics;

public class Main {


   public static void addAddOne(){
        int num1 = 15;
        System.out.println(num1+1);
    }

    public static void main (String [] args ){
        addAddOne();
        System.out.println("hello world");

    }

    static {
        int num = 10;
        num++;
        System.out.println(num);
    }
}
