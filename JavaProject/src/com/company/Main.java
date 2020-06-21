package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Pleas Enter A Number\t n = ");
        float n = input.nextFloat();

        System.out.print("Pleas Enter A Number (n / d)\t d = ");
        int d = input.nextInt();

        float temp = n;

        System.out.println("-------------- While loop ---------------");

        while (n > d){
            System.out.format("%.2f\n", n);
            n = n /d;
        }

        System.out.println("------------ do_while loop --------------");

        n = temp;

        do {
            System.out.format("%.2f\n", n);
            n = n /d;
        } while ( n > d);

    }//End of main
}//End of class
