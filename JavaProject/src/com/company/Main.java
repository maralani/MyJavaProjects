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

        System.out.println();
        printMenu();
        System.out.println();

        System.out.print("Please Select A Method:\ts = ");
        int s = input.nextInt();
        System.out.println();

        result = sort(n,A,s);
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

//--------------------- Menu ----------------------------------------

    private static void printMenu(){
        System.out.print("1. Bubble Sort\t2. Insertion Sort\t3. Selection Sort");
    }

//--------------------- Sort ----------------------------------------

    private static String sort(int n, int[] a, int s) {
        String str = "";

        int Flag = 1;
        for (int i = 1; i <n; i++) {
            if (a[i] <= a[i + 1]) Flag++;
            else break;
        }
        if ( Flag == n) str = "This Array is A Orderly Array!";
        else {

            switch (s){
                case 1:
                    str = bubbleSort(n, a);
                    break;
                case 2:
                    str = insertionSort(n, a);
                    break;
                case 3:
                    str = selectionSort(n, a);
                    break;
                default:
            }
        }

        return str;
    }

//------------------------------  Bubble Sort  ------------------------------------

    private static String bubbleSort(int n, int[]a){

        String str = "";

        int temp = 0;
        int m = n;

        for (int i = 1; i <n ; i++) {

            for (int j = 1; j <m; j++) {
                if ( a[j] > a[j+1]) {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }

            m--;
        }

        str = arrayOutput(n, a);

        return str;
    }

//------------------------------  Insertion Sort  ---------------------------------

    private static String insertionSort(int n, int[]a){

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

//------------------------------  Selection Sort  ---------------------------------

    private static String selectionSort(int n, int[]a){

        String str = "";

        int temp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <=n; j++) {
                if ( a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        str = arrayOutput(n, a);

        return str;
    }

}//End of class
