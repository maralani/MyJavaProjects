package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A Number\tn = ");
        int n = input.nextInt();

        int result = absolute(n);
        System.out.format("Absolute %d is:\t%d", n , result);

        System.out.println();
        System.out.println("--------------------------------");

        System.out.println("Using Math.abs:");
        System.out.format("Absolute %d is:\t%d", n , Math.abs(n));

    }//End of main
//----------------- Method: Absolute A Number  ---------------------
    private static int absolute(int n){
        int r;

        if ( n < 0) r = -n;
        else r = n;

        return r;
    }
}//End of class
