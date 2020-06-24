package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter row of Array cR = ");
        int cR = input.nextInt();
        System.out.print("Please Enter colun of Array cC = ");
        int cC = input.nextInt();

        printMenu();
        System.out.println();

        System.out.print("Select a item: s = ");
        int s = input.nextInt();

        String result = "";
        int matrix[][] = new int[cR][cC];
        switch (s){
            case 1:
                for (int i = 0; i < cR; i++) {
                    for (int j = 0; j < cC; j++) {
                        System.out.print("Matrix [" + i + "][" + j + "] = ");
                        matrix[i][j] = input.nextInt();
                    }
                }
                result = arrayOutput(cR, cC, matrix);
                break;
            case 2:
                matrix = randomMatrix(cR, cC);
                result = arrayOutput(cR, cC, matrix);

                break;
            case 3:
                matrix = unitaryMatrix(cR, cC);
                result = arrayOutput(cR, cC, matrix);
            default:
        }

        System.out.println(result);
    }//End of main

//----------------------- Menu -----------------------------------------

    private static void printMenu(){
        System.out.println("Matrix");
        System.out.println("1. Create a matrix");
        System.out.println("2. Create a random matrix");
        System.out.println("3. Create a Unitary matrix");
    }

//---------------------- Method: Output Array---------------------------
    private static String arrayOutput(int cR,int cC,  int A[][]){

        String str = "{  ";

        int Flag = 0;
        for (int i = 0; i < cR; i++) {
            for (int j = 0; j < cC; j++) {
                str = str + A[i][j] + "  ";
                Flag++;
            }
            if (Flag != cR*cC) {
                str = str + "\n   ";
            }
        }
        str = str + "}";

        return str;
    }

//--------------------- Create a random matrix ----------------------------------------

    private static int[][] randomMatrix(int cR, int cC) {

        int r [][] = new int [cR][cC];
        Random Generator = new Random();

        for (int i = 0; i < cR; i++) {
            for (int j = 0; j < cC; j++) {
                int R = Generator.nextInt(9);
                r[i][j] = R;
            }
        }

        return r;
    }

//--------------------- Create a Unitary matrix ----------------------------------------

    private static int[][] unitaryMatrix(int cR, int cC) {

        int r [][] = new int [cR][cC];

        for (int i = 0; i < cR; i++) {
            for (int j = 0; j < cC; j++) {
                r[i][j] = 1;
            }
        }

        return r;
    }

}//End of class
