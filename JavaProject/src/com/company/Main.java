package com.company;

public class Main {

    public static void main(String[] args) {

        int N = 10 + 5;
        System.out.format("N = %d\n", N);
        System.out.print("N = " + N + "\n" );
        System.out.println("-------------------");

        N = 12345678;
        System.out.format("N = %+,d", N);
        System.out.println();
        System.out.println("-------------------");

        double pi = Math.PI;
        System.out.format("Pi = %.2f", pi);


    }//End of main
}//End of class
