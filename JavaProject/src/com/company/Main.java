package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A Number\tn = ");
        int n = input.nextInt();

        long result = fact(n);
        System.out.format("%d! = %d", n , result);

    }//End of main
//----------------  Method: Factorial  ----------------------
    private static long fact(int n){
        long r = 1;

        for (int i = 2; i <=n; i++){
            r = r * i;
        }

        return r;
    }
}//End of class
