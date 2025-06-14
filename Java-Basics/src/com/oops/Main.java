package com.oops;

public class Main {
    public static void main(String[] args) {

            Employee emp1 = new Employee();
            emp1.setEmployeeId(102);
            emp1.setFname("Roshan");
            emp1.setLname("RK");
            emp1.setPosition("Java dev");

            System.out.println("The Employee ID : "+emp1.getEmployeeId() );
            System.out.println("The Employee First name : "+emp1.getFname());
            System.out.println("The Employee Last Name : "+emp1.getLname());
            System.out.println("The Employee Occuputation : "+emp1.getPosition());
      

        }
    }

