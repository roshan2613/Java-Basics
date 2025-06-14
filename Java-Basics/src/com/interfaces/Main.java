package com.interfaces;

import java.io.Serializable;
import java.util.*;

public class Main implements Math, Serializable {


    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int product(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }


    @Override
    public int div(int num1 ,int num2) {
        return num1 / num2;
    }

    @Override
    public double addOneToPi(int num1) {
        return this.pi + num1;
    }

    public double add2Pi() {
        return pi + 2;
    }


    public static void main (String [] args ){
//        Main mathOperations = new Main();
//
//        //calling the default method from the interface
//        mathOperations.aboutMath();
//
//         System.out.println();
//
//        //prinitng the abstract methods from the interface
//        System.out.println("sum : "+ mathOperations.sum(2,3));
//        System.out.println("product : "+ mathOperations.product(6,3));
//        System.out.println("sub : "+ mathOperations.sub(1,3));
//        System.out.println("div : "+ mathOperations.div(6,2));
//        System.out.println("addOneToPi : "+ mathOperations.addOneToPi(1));
//
//
//        System.out.println("the sum of add PI method is: "+ mathOperations.addPi(10));
//
//        System.out.println("The result of add2Pi method is: "+ mathOperations.add2Pi());

        Employee e1 = new Employee();
        e1.setName("Roshan");
        e1.setAddress("US");

        Employee e2 = new Employee();
        e2.setName("Roshan1");
        e2.setAddress("US1");

        System.out.println(e1.getName()+", "+e1.getAddress());
        System.out.println(e2.getName()+", "+e2.getAddress());

//        if(e1==e2){
//            System.out.println("Obj Equals");
//        }
//        if(e1.equals(e2)){
//            System.out.println("Obj Equals");
//        }

        System.out.println("e1 "+e1.count);
        System.out.println("e2 "+e2.count);

        e1.count = 100;
        e1.setName("Siri");
        e1.setAddress("Texas");

        System.out.println("e1 "+e1.count);
        System.out.println("e2 "+e2.count);

        System.out.println(e1.getName()+", "+e1.getAddress());
        System.out.println(e2.getName()+", "+e2.getAddress());



        List<String> list = new ArrayList<>();
        //Linkedlist
        list.add("Roshan");
        list.add("Mahesh");
        list.add("Siri");
        list.add("Siri");

        System.out.println("*************************");
        for(int i=0;i<list.size();i++){
            System.out.println("value == "+list.get(i));
        }
        System.out.println("*************************");
        for(String str :list){
            System.out.println("value for == "+str);
        }
        System.out.println("*************************");
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("John");
        set.add("adam");
        set.add("adam");

        for(String str :set){
            System.out.println("value set == "+str);
        }
        System.out.println("*************************");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Roshan");
        map.put(2, "Siri");
        map.put(3,"John");
        map.put(3,"Adam");
        map.put(4,"Siri");

        System.out.println("map == "+map);

        String value = map.get(1);
        System.out.println("*************************"+value);
    }
}
