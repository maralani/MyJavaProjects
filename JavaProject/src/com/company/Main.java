package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A Number\tn = ");
        int n = input.nextInt();

        String result = evenOrOddNumber(n);
        System.out.println(result);

    }//End of main
//----------------- Method: Even Or Odd Number  ---------------------
    private static String evenOrOddNumber(int n){
        String str;

        if ( n % 2 == 0){
            str = "You have entered an EVEN number!";
        }else {
            str = "You have entered an ODD number";
        }

        return str;
    }
}//End of class
