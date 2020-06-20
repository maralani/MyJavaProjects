package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A Number\tn = ");
        int n = input.nextInt();

        String result = prime(n);
        System.out.println(result);



    }//End of main
//----------------  Method: Prime number  ----------------------
    private static String prime(int n){
        String srt = "";

        int count = 0;

        for (int i = 1; i <= n; i++){
            if ( n % i == 0) count++;

            if ( count > 2){
                srt = "The number " + n + " is not a prime number!";
                break;
            }
        }//End of for

        if ( count == 2) srt = "The number " + n + " is a prime number!";

        return srt;

    }
}//End of class
