package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("f(x)= x^2 - 9 ");
        System.out.print("Please Enter A Minimum Number x1 = ");
        float x1 = input.nextFloat();
        System.out.print("Please Enter A Maximum Number x2 = ");
        float x2 = input.nextFloat();

        String result = rootFinding(x1 , x2);
        System.out.println(result);

    }//End of main

//----------------------- Root-finding algorithms: Bisection Method ----------------------------

    private static String rootFinding (float x1, float x2){
        String str = "";

        float mid = 0;
        float f1 = (float) (Math.pow(x1, 2) - 9);
        float f2 = (float) (Math.pow(x2, 2) - 9);
        float fm = 0;

        if (f1 * f2 < 0) {
            while (x2 - x1 > .001) {
                mid = (x1 + x2)/2;
                fm = (float) (Math.pow(mid, 2) - 9);
                if ( f1 * fm < 0) {
                    x2 = mid;
                }else {
                    x1 = mid;
                }
            }//End of while

            str = str + mid;
        } else {
            str = "This Equation don't have R in [ " + x1 + " to " + x2 + " ]";
        }

        return str;
    }

}//End of class
