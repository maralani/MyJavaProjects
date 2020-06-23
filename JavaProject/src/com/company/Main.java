package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter length of Array cA = ");
        int cA = input.nextInt();

        int A[] = new int [cA+1];
        A[0] = cA;

        for (int i =1; i <=cA; i++) {
            System.out.format("digit %d = ", i);
            int N = input.nextInt();
            A[i] = N;
        }

        String result = arrayOutput(cA, A);
        System.out.println("Number 1 =  " + result);

        System.out.print("Please Enter length of Array cB = ");
        int cB = input.nextInt();

        int B[] = new int [cB+1];
        B[0] = cB;

        for (int i =1; i <=cB; i++) {
            System.out.format("digit %d = ", i);
            int N = input.nextInt();
            B[i] = N;
        }

        result = arrayOutput(cB, B);
        System.out.println("Number 2 =  " + result);

        System.out.println();
        printMenu();

        System.out.print("Please Select s = ");
        int s = input.nextInt();

        switch (s){
            case 1:
                result = sum(cA, A, cB, B);
                break;
            case 2:
                result = multiply(cA, A, cB, B);
                break;
            default:
        }

        System.out.println(result);
    }//End of main

//----------------------- Menu -----------------------------------------

    private static void printMenu(){
        System.out.println("Simple calculator:");
        System.out.println("1. Sum\t\t2. Multiply");
    }
//---------------------- Method: Output Array---------------------------
    private static String arrayOutput(int n, int A[]){

        String str = "";

        for (int i = 1; i <= n; i++) {
            str = str + A[i];
        }
        return str;
    }

//--------------------- Big Number: Sum ----------------------------------------

    private static String sum(int cA, int[] a, int cB, int[] b) {
        String str = arrayOutput(cA, a) + " + " + arrayOutput(cB, b) + " = ";

        int dLength = Math.abs(cA - cB);
        int temp = 0;
        int Count = 1;
        int cR = 0;
        int Counter = 0;
        int Flag = 0;

        if ( cA >= cB ) {
            cR = cA + 1; //CResult
            int Result[] = new int[cR + 1];
            for (int i = cA; i >= 1; i--) {

                if ((i - dLength) > 0) {
                    temp = a[i] + b[i - dLength] + temp;
                }else {
                    temp = a[i] + temp;
                }

                Result[i+1] = temp % 10;
                temp = temp / 10;
            }

            if (temp > 0) {
                Result[1] = temp % 10;
                Count--;
            }

            int div = (cR - Count) / 3;
            temp = (cR - Count) % 3;
            if ( temp == 0) {
                temp = 3;
                div--;
            }

            for (int i = 1 + Count; i <= cR; i++) {
                str = str + Result [i];
                Flag++;
                if ( Flag == temp && Counter < div) {
                    str = str + ",";
                    temp = temp + 3;
                    Counter++;
                }
            }
        }else {
            cR = cB + 1; //CResult
            int Result[] = new int[cR + 1];
            for (int i = cB; i >= 1; i--) {
                if ((i - dLength) > 0) {
                    temp = b[i] + a[i - dLength] + temp;
                }else {
                    temp = b[i] + temp;
                }
                Result[i+1] = temp % 10;
                temp = temp / 10;
            }
            if (temp > 0) {
                Result[1] = temp % 10;
                Count--;
            }
            int div = (cR - Count) / 3;
            temp = (cR - Count) % 3;
            if ( temp == 0) {
                temp = 3;
                div--;
            }
            for (int i = 1 + Count; i <= cR; i++) {
                str = str + Result[i];
                Flag++;
                if ( Flag == temp && Counter < div) {
                    str = str + ",";
                    temp = temp + 3;
                    Counter++;
                }
            }
        }

        return str;
    }

//--------------------- Big Number: Multiply ----------------------------------------

    private static String multiply(int cA, int[] a, int cB, int[] b) {
        String str = arrayOutput(cA, a) + " * " + arrayOutput(cB, b) + " = ";

        int temp1 = 0;
        int temp2 = 0;
        int cR = cA + cB; //CResult
        int Result[] = new int[cR + 1];
        Result[0] = cR;
        for (int i = cB; i >=1; i--) {
            int k = cR + i - cB;
            for (int j = cA; j >= 1; j--) {
                temp1 = b[i] * a[j] + temp1;
                Result[k] = (temp1 % 10) + Result[k] + temp2;
                if (Result[k] >= 10) {
                    temp2 = Result[k] / 10;
                    Result[k] = Result[k] % 10;
                }
                temp1 = temp1 / 10;
                k--;
                if ( temp2 > 0) {
                    Result[k] = Result[k] + temp2;
                    temp2 = 0;
                }
            }
            if ( temp1 > 0) {
                Result[k] = Result[k] + temp1;
                temp1 = 0;
            }
        }
        int count = 0;
        if ( Result[1] == 0) {
            count++;
        }
        int counter = 0;
        int flag = 0;
        int div = (cR - count) / 3;
        int temp = (cR - count) % 3;
        if ( temp == 0) {
            temp = 3;
            div--;
        }
        for (int i = 1 + count; i <= cR; i++) {
            str = str + Result[i];
            flag++;
            if ( flag == temp && counter < div) {
                str = str + ",";
                temp = temp + 3;
                counter++;
            }
        }

        return str;
    }

}//End of class
