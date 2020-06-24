package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        System.out.print("Please Enter A Number n = ");
        int n = input.nextInt();

        String result = "";
        result = setW(str, n);
        System.out.println(result);


    }//End of main

//--------------------------- String: setW ------------------------------

    private static String setW(String s, int n){

        String str = "";

        for (int i = 0; i < n - s.length() ; i++) {
            str= str + ' ';
        }

        str = str + s;

        return str;
    }

}//End of class
