package com.Arraylistprac;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employeelist {
    public static void main (String []args){

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(30,"Roshan", "RK"));
        list.add(new Employee(32,"Ravi", "krish"));
        list.add(new Employee(34,"Latha", "boshini"));


    for (Employee e: list){
        System.out.println(e);
    }


        List<String> lastNamesOfFiltered = list.stream()
                .filter(e -> e.getAge() > 30)
                .map(Employee::getLname)
                .collect(Collectors.toList());


        System.out.println("\nLast Names of Filtered Employees Age > 30:");
        lastNamesOfFiltered.forEach(System.out::println);


    }
}
