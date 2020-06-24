package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        System.out.print("Please Enter A Number i = ");
        int i = input.nextInt();
        System.out.print("Please Enter A Number l = ");
        int l = input.nextInt();

        String result = "";
        result = subString(str, i, l);
        System.out.println(result);


    }//End of main

//--------------------------- String: Sub String ------------------------------

    private static String subString(String s, int in, int l){

        String str = "";

        for (int i = in-1; i < in + l - 1 ; i++) {
            str = str + s.charAt(i);
        }

        return str;
    }

}//End of class
