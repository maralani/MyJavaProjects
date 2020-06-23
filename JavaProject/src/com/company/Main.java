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
        System.out.println("A[]= " + result);

        result = sort(n, A);
        System.out.println("Sort A[]= " + result);

        System.out.print("Please Enter A Number That You Want To Search s = ");
        int s = input.nextInt();

        result = search(n, A, s);
        System.out.println(result);
    }//End of main

//---------------------- Method: Output Array---------------------------
    private static String arrayOutput(int n, int A[]){

        String str = "{";

        for (int i = 1; i <= n; i++) {
            str = str + "  " +  A[i];
        }

        str = str + "  }";

        return str;
    }

//--------------------- Binary Number ----------------------------------------

    private static String search(int n, int[] a, int s) {
        String str = "";

        int temp = 0;
        for (int i = 2; i <=n; i++) {
            for (int j = 1; j <i; j++) {

                if ( a[i] < a[j]) {
                    temp = a[i];

                    for (int k = i; k >=j; k--) {
                        a[k] = a[k-1];
                    }

                    a[j] = temp;
                }
            }
        }

        int Max = n;
        int Min = 1;
        int Flag = 0;

        while ( Max >= Min) {
            int mid = (Max + Min) / 2;
            if ( s == a[mid]) {
                str = " Index of " + s + " is " + mid;
                Flag++;
                break;
            }else if ( s < a[mid]) {
                Max = mid - 1;
            }else if ( s > a[mid]) {
                Min = mid + 1;
            }
        }

        if ( Flag == 0) {

            str = s + " there is not in array!";
        }

        return str;
    }

//--------------------- Sort Array ----------------------------------------

    private static String sort(int n, int[] a) {
        String str = "";

        int temp = 0;
        for (int i = 2; i <=n; i++) {
            for (int j = 1; j <i; j++) {

                if ( a[i] < a[j]) {
                    temp = a[i];

                    for (int k = i; k >=j; k--) {
                        a[k] = a[k-1];
                    }

                    a[j] = temp;
                }
            }
        }

        str = arrayOutput(n, a);

        return str;
    }
}//End of class
