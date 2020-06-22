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

        System.out.print("Please Enter A Number:\tm = ");
        int m = input.nextInt();
        result = deleteElement(m, n, A);
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

//--------------------- Delete element in array ----------------------------------------

    private static String deleteElement(int m, int n, int A[]) {
        String str = "Array[] = {";

        for (int i = 1; i <= n; i++) {
            if (A[i] == m) continue;
            else str = str + "  " + A[i];
        }

        str = str + "  }";

        return str;
    }

}//End of class
