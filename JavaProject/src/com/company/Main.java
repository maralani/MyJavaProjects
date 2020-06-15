package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter A Integer Number\tN = ");
        int N = input.nextInt();
        System.out.format("N = %d", N);
        System.out.println();
        System.out.println("--------------------------------");

        System.out.print("Please Enter A Float Number\tF = ");
        float F = input.nextFloat();
        System.out.format("N = %f", F);
        System.out.println();

    }//End of main
}//End of class
