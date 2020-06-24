package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        String result = "";
        result = deleteDigits(str);
        System.out.println(result);

    }//End of main

//--------------------------- Delete digits ------------------------------

    private static String deleteDigits(String s){

        String str = "";
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                continue;
            }
            str = str + s.charAt(i);
        }

        return str;
    }

}//End of class