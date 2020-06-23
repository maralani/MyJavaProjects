package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter length of Array n = ");
        int n = input.nextInt();

        int A[] = new int [n+1];
        A[0] = n;

        Random Generator = new Random();

        for (int i = 1; i <= n; i++) {
            int R = Generator.nextInt(100);
            A[i] = R;
        }

        String result = arrayOutput(n, A);
        System.out.println(result);

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
}//End of class
