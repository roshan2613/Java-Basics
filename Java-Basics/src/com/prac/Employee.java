package com.prac;

public class Employee {
    int age;
    String fname;
    String Lname;

    public Employee(){

    }

    public Employee(int age, String fname, String lname) {
        this.age = age;
        this.fname = fname;
        Lname = lname;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", fname='" + fname + '\'' +
                ", Lname='" + Lname + '\'' +
                '}';
    }
}
