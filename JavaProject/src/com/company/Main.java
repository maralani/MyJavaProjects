package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        String result = "";
        result = toUpperCase(str);
        System.out.println(result);

        // s = s.toUpperCase();
    }//End of main

//--------------------------- String: ToUpperCase ------------------------------

    private static String toUpperCase(String s){

        String str = "";

        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                str = str + (char) (s.charAt(i) - 32);
            }else {
                str = str + s.charAt(i);
            }
        }

        return str;
    }

}//End of class

