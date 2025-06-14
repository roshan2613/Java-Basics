package com.oops;

public class Employee {
    int employeeId;
    String Fname;
    String Lname;
    String position;



    public Employee(){

    }

    public Employee(int employeeId, String fname, String lname, String position) {
        this.employeeId = employeeId;
        this.Fname = fname;
        this.Lname = lname;
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    private String samplePrivateMethod(String word){
        return word;
    }


}
