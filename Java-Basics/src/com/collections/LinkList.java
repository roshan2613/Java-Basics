package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {


        LinkedList<String> carlinkedlist = new LinkedList<>();

        carlinkedlist.add("honda");
        carlinkedlist.add("toyota");
        carlinkedlist.add("vw");

        //using enhanced for loop
        System.out.println("using enhanced for loop  ");
        for (String printLinkedlist: carlinkedlist ){
            System.out.println(printLinkedlist);
        }

        System.out.println(" ");

        //using regular for loop
        System.out.println("using regular for loop  ");

        for (int i = 0; i < carlinkedlist.size(); i++) {
            System.out.println(carlinkedlist.get(i));
        }
    }


}
