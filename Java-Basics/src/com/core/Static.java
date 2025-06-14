package com.core;

public class Static {
    String wordInClassField  = "This is from class field";

    static {
        System.out.println("Hello from static block 1");
    }
    public void sayHello(String name){
        String word  = "Hello";
        System.out.println(word+" "+name);
    }

    public static void main(String[] args) {
        Static staticExp = new Static();
        System.out.println(staticExp.wordInClassField);
        staticExp.sayHello("Roshan");
    }

}
