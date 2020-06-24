package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        System.out.print("Please Enter A Character: ch = ");
        String ch = input.next();

        String result = "";
        result = indexOf(str, ch);
        System.out.println(result);

    }//End of main

//--------------------------- String: Index of ------------------------------

    private static String indexOf(String s , String c){

        String str = "";

        int flag = 0;
        for (int i = 0; i <s.length(); i++) {
            if ((s.charAt(i)) == c.charAt(0)) {
                str = str + "Index " + c + " = " + (i+1);
                flag++;
            }
        }

        if ( flag == 0) {
            str = "Char " + c + "there is not iN this string!";
        }

        return str;
    }

}//End of class