package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Pleas Enter A Number\t n1 = ");
        int n1 = input.nextInt();

        System.out.print("Pleas Enter A Number\t n2 = ");
        int n2 = input.nextInt();

        int result = gcd(n1 , n2);
        System.out.format("Greatest Common Divisor of %d and %d is:\t%d", n1, n2, result);

        System.out.println("\n------------------------------------------------------------");

        result = lcm(n1 , n2);
        System.out.format("Least Common Multiple of %d and %d is:\t%d", n1, n2, result);

        System.out.println();

    }//End of main
//----------------------- Method: Greatest Common Divisor ----------------------------
    private static int gcd(int n1 , int n2){
        int r = 0;

        for (int i = 1; i <= n1; i++) {

            if ( n1 % i == 0 && n2 % i == 0) r = i;

        }

        return r;
    }

//----------------------- Method: Least Common Multiple ------------------------------
    private static int lcm(int n1 , int n2){
        int r = 0;

        int i = 2;

        while (true) {

            if ( n1 % i == 0 || i % n1 == 0) {

                if (n2 % i == 0 || i % n2 == 0) {

                    if (i >= n1 && i >= n2) {
                        r = i;
                        break;
                    }

                }

            }

            i++;

        }

        return r;
    }

}//End of class
