package com.main;

public class Practice {
    public static void main(String[] args) {
        String word = "hello";
        int subStringBegin = word.length()/2 -1;
        int subStringEnd = word.length()/2+2;
        String middleTreeletters = word.substring(subStringBegin, subStringEnd);
        System.out.println(middleTreeletters);
    }
}
