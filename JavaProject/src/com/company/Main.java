package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        printMenu();

        String result = "";
        System.out.print("Please select a item:\ts = ");
        int s = input.nextInt();
        System.out.println();

        switch (s){
            case 1:
                result = lTrim(str);
                break;
            case 2:
                result = rTrim(str);
                break;
            case 3:
                result = trim(str);
                break;
            case 4:
                result = fullTrim(str);
                break;
            default:
        }

        System.out.println(result);


    }//End of main

//---------------------------  Menu  -----------------------------------------

    private static void printMenu(){
        System.out.println("1. LTrim\t\t2. RTrim\t\t3. Trim\t\t4. Full Trim");
    }
//--------------------------- String: LTrim ------------------------------

    private static String lTrim(String s){

        String str = "";

        int n = 0;
        while (s.charAt(n)== ' ') {
            n++;
        }
        for (int i = n; i <s.length() ; i++) {
            str = str + s.charAt(i);
        }

        return str;
    }

//--------------------------- String: LTrim ------------------------------

    private static String rTrim(String s){

        String str = "";

        int flag = 0;
        int n = 0;
        int temp ;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) != ' ') {
                break;
            }
            str = str + s.charAt(i);
            n++;
        }
        for (int i = n ; i <s.length() ; i++) {
            temp = i;
            while (flag < 2 &&s.charAt(temp)== ' ' ) {
                flag++;
                temp++;
            }
            if (flag > 1) {
                break;
            }else {
                flag = 0;
            }

            str = str + s.charAt(i);
        }

        return str;
    }

//--------------------------- String: Trim ------------------------------

    private static String trim(String s){

        String str = "";

        int n = 0;
        int m = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) != ' ') {
                break;
            }
            n++;
        }
        for (int i = s.length() - 1; i>=0 ; i--) {
            if (s.charAt(i) != ' ') {
                break;
            }
            m++;
        }
        for (int i = n ; i <s.length() - m ; i++) {
            str = str + s.charAt(i);
        }

        return str;
    }

//--------------------------- String: Full Trim ------------------------------

    private static String fullTrim(String s){

        String str = "";

        int n = 0;
        int m = 0;
        int temp ;

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) != ' ') {
                break;
            }
            n++;
        }

        for (int i = s.length() - 1; i>=0 ; i--) {
            if (s.charAt(i) != ' ') {
                break;
            }
            m++;
        }
        for (int i = n ; i <s.length() - m ; i++) {
            temp = i;
            int flag = 0;
            while (s.charAt(temp)== ' ' ) {
                flag++;
                temp++;
            }
            if (flag >= 1) {
                i = temp - 1;
            }
            str = str + s.charAt(i);
        }

        return str;
    }
}//End of class

