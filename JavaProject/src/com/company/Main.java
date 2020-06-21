package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Pleas Enter A Number\t n = ");
        int n = input.nextInt();

        int result = anagram(n);
        System.out.format("Anagram of %d = %d", n , result);


    }//End of main
//----------------------- Method: Anagram of a number ----------------------------
    private static int anagram (int n){
        int r = 0;

        while ( n > 0) {

            r = ( n % 10 ) + (r * 10);
            n = n / 10;

        }

        return r;
    }
}//End of class
