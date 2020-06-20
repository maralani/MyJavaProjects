package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A Number\tn = ");
        int n = input.nextInt();

        System.out.print("1 + 2 + 3 + ... + n = ");
        int result = seriesSum(n);
        System.out.format("%d", result);

        System.out.println();
        System.out.println("-------------------------------");

        System.out.print("2 + 4 + 6 + ... + n = ");
        result = seriesSumEven(n);
        System.out.format("%d", result);

        System.out.println();
        System.out.println("-------------------------------");

        System.out.print("1 + 3 + 5 + ... + n = ");
        result = seriesSumOdd(n);
        System.out.format("%d", result);

    }//End of main
//----------------- Method: Sum Of Numbers  ---------------------
    private static int seriesSum (int n){
        int r = 0;

        for (int i = 1; i <= n; i++){
            r = r + i;
        }

        return r;
    }
//----------------- Method: Sum Of Even Numbers  ---------------------
    private static int seriesSumEven (int n){
        int r = 0;

        for (int i = 2; i <= n; i+=2){
            r = r + i;
        }

        return r;
    }
//----------------- Method: Sum Of Odd Numbers  ---------------------
    private static int seriesSumOdd (int n){
        int r = 0;

        for (int i = 1; i <= n; i+=2){
            r = r + i;
        }

        return r;
    }
}//End of class
