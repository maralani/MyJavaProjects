package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        System.out.print("Please Enter A String subStr = ");
        String subStr = input.nextLine();

        System.out.print("Please Enter A String repStr = ");
        String repStr = input.nextLine();

        String result = "";
        result = replace(str, subStr, repStr);
        System.out.println(result);


    }//End of main

//--------------------------- String: Replace ------------------------------

    private static String replace(String s, String subS, String repS){

        String str = "";

        s = s.toLowerCase();
        subS = subS.toLowerCase();
        repS = repS.toLowerCase();
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
                for (int k = 0; k <repS.length(); k++) {
                    str = str + repS.charAt(k);
                }
                continue;
            }
            str = str + s.charAt(i);
        }

        return str;
    }

}//End of class
