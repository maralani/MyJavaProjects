package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        printMenu();

        System.out.print("Select the item: ");
        String str = input.nextLine();

        System.out.format("%s ", str);
        int d = input.nextInt();

        double result = 0;

        switch (str){
            case "sin":
                result = sin(d);
                break;
            case "cos":
                result = cos(d);
            default:
        }

        System.out.format("%s %d = %.2f", str, d, result);



    }//End of main
//----------------------- Method: Menu ----------------------------

    private static void printMenu(){
        System.out.println("Trigonometric functions: Sin\tCos");
    }

//----------------------- Method: Sine ----------------------------

    private static double sin(int d){

        d = 180 / d;
        double x = Math.PI / d;

        double r = x;

        int i = 3;
        double Condition = 0;
        int sign = -1;

        do {
            long fact = fact(i);
            r = (float) (r + sign * (Math.pow(x, i) / fact));
            i+=2;
            Condition = Math.pow(x, i) / fact;
            sign = sign * (-1);

        } while ( Condition > .01);

        return r;
    }

//----------------------- Method: Cosine ----------------------------

    private static float cos(int d){

        d = 180 / d;
        double x = Math.PI / d;

        float r = 1;
        int i = 2;
        double Condition = 0;
        int sign = -1;

        do {
            long fact = fact(i);
            r = (float) (r + sign * (Math.pow(x, i) / fact));
            i+=2;
            Condition = Math.pow(x, i) / fact;
            sign = sign * (-1);

        } while ( Condition > .01);

        return r;
    }

//----------------  Method: Factorial  ----------------------
    private static long fact(int n){
        long r = 1;

        for (int i = 2; i <=n; i++){
            r = r * i;
        }

        return r;
    }
}//End of class
