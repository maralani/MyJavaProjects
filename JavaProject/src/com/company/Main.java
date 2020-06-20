package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number\tn = ");
        int n = input.nextInt();

        System.out.print("Please Enter the power of the number\tp = ");
        int p = input.nextInt();

        int result = pow(n , p);
        System.out.format("%d^%d = %d", n , p , result);

        System.out.println();
        System.out.println("---------------------------");

        float m = (float) n;
        System.out.println("Using Math.pow");
        System.out.format("%.0f^%d = %.0f", m , p , Math.pow(m , p));

    }//End of main
//----------------  Method: The power of a number  ----------------------
    private static int pow (int n , int p){

        int r = 1;

        for (int i =1; i <= p; i++){
            r = r * n;

        }
        return r;
    }
}//End of class
