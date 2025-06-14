package com.object;

public class MainUtil {


    public static void setData(Person person){
        person.setAge(10);
        person.setName("Roshan");
        person.setJob("dev");
    }

    public static void displayData(Person person){
        System.out.println(person.getAge());
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        setData(person1);
        displayData(person1);
    }

}
