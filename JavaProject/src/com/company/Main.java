package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        String result = "";
        result = upper(str);
        System.out.println(result);

    }//End of main

//--------------------------- String: Upper ------------------------------

    private static String upper(String s){

        String str = "";

        char c;
        for (int i = 0; i <s.length(); i++) {
            if ( i == 0) {
                c = s.charAt(i);
                if ( c >= 97 && c <=122){
                    c= (char) (c - 32);
                    str = str + c;
                    continue;
                }

            }

            if (s.charAt(i) == ' ') {
                str = str + " ";
                c = s.charAt(i+1);
                if ( c >= 97 && c <=122){
                    c = (char) (c - 32);
                    str = str + c;
                    i++;
                }
            }else {
                str = str + s.charAt(i);
            }
        }

        return str;
    }

}//End of class