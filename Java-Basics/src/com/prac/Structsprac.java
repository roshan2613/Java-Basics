package com.prac;

//using record to achive struts
public class Structsprac {
    public record Point(int x, int y) {


    }

    public static void main (String[] args ){
        Point point = new Point(10, 20);
        System.out.println(point.x() +","+ point.y());
    }




}
