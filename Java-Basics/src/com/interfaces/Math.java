package com.interfaces;

public interface Math {
    //member field
    final double pi = 3.14;
    public int sum (int num1 , int mum2);




    public int product (int num1 , int mum2);
    public int sub (int num1 , int mum2);

    public int div (int num1 , int num2);

    double addOneToPi( int num1);
    default void aboutMath(){
        System.out.println("Here I have performed some basic math operations... oh!! and this is prinitng from a default method in the interface");
    }

    default double addPi(int num1 ){
        return this.pi + num1;
    }

    default double add2Pi(){

        return this.pi + 2;
    }




}
