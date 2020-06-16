package com.company;

public class Main {

    public static void main(String[] args) {

        int N = 10;
        int A = N;
        System.out.format("N = %d.\n", N);
        System.out.println("---------------------");
        
        int B = A++;
        System.out.format("B = %d.\n", B);
        System.out.format("A = %d.\n", A);
        System.out.println("---------------------");

        int C = ++A;
        System.out.format("C = %d.\n", C);
        System.out.format("A = %d.\n", A);
        System.out.println("---------------------");

    }//End of main
}//End of class
