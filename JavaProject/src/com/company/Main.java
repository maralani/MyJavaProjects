package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random Generator = new Random();
        int R = Generator.nextInt();
        System.out.format("R = %d.\t A random number", R);
        System.out.println();
        System.out.println("--------------------------------------------------------");

        R = Generator.nextInt(100);
        System.out.format("R = %d.\t A random number between 1 and 100", R);
        System.out.println();
        System.out.println("--------------------------------------------------------");

        System.out.println("Create a random number between Min and Max");
        System.out.print("Please Enter A Minimum Number Min = ");
        int Min = input.nextInt();
        System.out.print("Please Enter A Maximum Number Max = ");
        int Max = input.nextInt();
        System.out.println();

        R = Generator.nextInt( Max - Min + 1) + Min;
        System.out.format("R = %d.\t A random number between %d and %d\"", R, Min, Max);
        System.out.println();

    }//End of main
}//End of class
