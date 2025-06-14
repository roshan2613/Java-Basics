package com.Arraylistprac;

public class Employee {

    int age;
    String fname;
    String lname;

    public Employee(int age, String fname, String lname) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }

    public Employee() {
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
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
