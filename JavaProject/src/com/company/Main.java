package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        String result = "";
        result = reverse(str);
        System.out.println(result);

    }//End of main

//--------------------------- String: Reverse ------------------------------

    private static String reverse(String s){

        String str = "";

        for (int i = s.length()-1; i >= 0 ; i--) {
            str = str + s.charAt(i);
        }

        return str;
    }

}//End of class