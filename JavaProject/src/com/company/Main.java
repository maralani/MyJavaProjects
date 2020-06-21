package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Pleas Enter A Number\t n = ");
        int n = input.nextInt();

        String result = fib(n);
        System.out.println(result);

    }//End of main
//----------------------- Method: Fibonacci Number ----------------------------
    private static String fib(int n){
        String srt = "";

        long temp1 = 0; //Fib1
        long temp2 = 1; //Fib2
        long fib = 1;
        int i = 3;

        while (true) {

            fib = fib + temp1;
            temp1 = temp2;
            temp2 = fib;

            if ( n == fib ) {
                srt = i + "th number of fibonacci number is " + n + ".";
                break;
            }else if ( n < fib ) {
                srt = n + " is not a fibonacci number!";
                break;
            } else {
                i++;
            }

        }//End of while

        return srt;
    }

}//End of class
