package com.matrix;

public class Main {
    public static void main (String [] argas ){
        int [][] matrix = {
                {1,1},
                {3,1},
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
//            sum = sum + matrix[i][i];
            sum = sum + matrix[i][matrix.length-1-i];
        }
        System.out.println(sum);
    }
}

