package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A Number:\tn = ");
        int n = input.nextInt();

        int A[] = new int [n+1];
        A[0] = n;

        for (int i =1; i <=n; i++) {
            System.out.format("Please Enter A Number A[%d] = ", i);
            int N = input.nextInt();
            A[i] = N;
        }

        String result = arrayOutput(n, A);
        System.out.println(result);

        int m = min(n, A);
        System.out.format("Min = %d", m);

    }//End of main

//---------------------- Method: Output Array---------------------------
    private static String arrayOutput(int n, int A[]){

        String str = "Array[] = {";

        for (int i = 1; i <= n; i++) {
            str = str + "  " +  A[i];
        }

        str = str + "  }";

        return str;
    }

//--------------------- Minimum ----------------------------------------

    private static int min(int n, int[] a) {
        int r = a[1];

        for (int i = 2; i <= n; i++) {
            if (a[i] < r) r = a[i];
        }

        return r;
    }

}//End of class
