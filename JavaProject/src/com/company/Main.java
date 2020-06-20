package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number\tn = ");
        int n = input.nextInt();

        String result = divisors(n);
        System.out.println(result);


    }//End of main
//----------------  Method: The Divisors of a number  ----------------------
    private static String divisors (int n){

        String srt = "1";

        for (int i = 2; i <= n; i++){
            if ( n % i == 0){
                srt = srt + " , " + i;
            }

        }

        return srt;
    }
}//End of class
