package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Pleas Enter A Number\t n = ");
        int n = input.nextInt();

        String result = MultiplicationTable(n);
        System.out.println(result);

    }//End of main
//----------------  Method: Multiplication table  ----------------------
    private static String MultiplicationTable(int n){
        String srt = "";

        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= n; j++){
                srt = srt + "\t" + (i * j);

            }
            srt = srt + "\n";
        }

        return srt;
    }
}//End of class
