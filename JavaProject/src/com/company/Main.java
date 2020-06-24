package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        System.out.print("Please Enter A String subStr = ");
        String subStr = input.nextLine();

        String result = "";
        result = remove(str, subStr);
        System.out.println(result);


    }//End of main

//--------------------------- String: Remove ------------------------------

    private static String remove(String s, String subS){

        String str = "";

        s = s.toLowerCase();
        subS = subS.toLowerCase();
        int flag = 0;
        int temp = 0;
        for (int i = 0; i <s.length(); i++) {
            temp = i;
            flag = 0;
            for (int j = 0; j <subS.length(); j++) {
                if (s.charAt(temp) == subS.charAt(j) && i <= s.length()-subS.length()) {
                    temp++;
                    flag++;
                }else {
                    break;
                }
            }
            if (flag == subS.length()) {
                i = temp - 1;
                continue;
            }
            str = str + s.charAt(i);
        }

        return str;
    }

}//End of class
