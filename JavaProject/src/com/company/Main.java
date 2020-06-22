package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        printmenu();
        System.out.print("Please Select A Item s = ");
        int s = input.nextInt();

        System.out.print("Please Enter A Number n = ");
        int n = input.nextInt();

        String result = "0";

        switch (s){
            case 1:
                result = baseConvert10To2(n);
                break;
            case 2:
                result = baseConvert10To8(n);
                break;
            case 3:
                result = baseConvert10To16(n);
                break;
            case 4:
                result = baseConvert2To8(n);
                break;
            case 5:
                result = baseConvert2To10(n);
                break;
            case 6:
                result = baseConvert2To16(n);
                break;
            case 7:
                result = baseConvert8To10(n);
                break;
            default:
        }

        System.out.println(result);

    }//End of main

//----------------------- Menu ----------------------------

    private static void printmenu(){

        System.out.println("Number Base Converter:");

        System.out.print("1. 10 to 2\t\t2. 10 to 8\t\t3. 10 to 16");
        System.out.println();

        System.out.print("4. 2 to 8\t\t5. 2 to 10\t\t6. 2 to 16");
        System.out.println();

        System.out.print("7. 8 to 10");
        System.out.println();


    }

//---------------------------------  1. 10 to 2  ---------------------------------------------

    private static String baseConvert10To2(int n){
        String str = "(" + n + ")10 = (";

        int temp = 0;
        int i = 1;

        while ( n > 0) {
            temp = temp + ( n % 2)*i;
            n = n / 2;
            i*=10;
        }

        str = str + temp + ")2";

        return str;
    }

//---------------------------------  2. 10 to 8  ---------------------------------------------

    private static String baseConvert10To8(int n){
        String str = "(" + n + ")10 = (";

        int temp = 0;
        int i = 1;

        while ( n > 0) {
            temp = temp + (n % 8) * i;
            n = n / 8;
            i *= 10;
        }

        str = str + temp + ")8";

        return str;
    }

//---------------------------------  3. 10 to 16  --------------------------------------------

    private static String baseConvert10To16(int n){
        String str = "(" + n + ")10 = (";

        int temp = 0;
        int i = 1;

        while ( n > 0 ) {
            temp = (temp * 100) + (n % 16);
            n = n / 16;
        }

        n = temp;
        temp = 0;

        while ( n > 0) {
            temp = n % 100;
            switch (temp) {
                case 10:
                    str = str + "A";
                    break;
                case 11:
                    str = str + "B";
                    break;
                case 12:
                    str = str + "C";
                    break;
                case 13:
                    str = str + "D";
                    break;
                case 14:
                    str = str + "E";
                    break;
                case 15:
                    str = str + "F";
                    break;
                default:
                    str = str + temp;
            }

            n = n / 100;

        }

        str = str + ")16";

        return str;
    }

//---------------------------------  4. 2 to 8  ----------------------------------------------

    private static String baseConvert2To8(int n){
        String str = "";

        int temp = n;
        int flag = 0;
        while ( n > 0) {
            if ((n % 10) == 0 || (n % 10) == 1) n = n / 10;
            else {
                flag++;
                break;
            }
        }

        if (flag == 1) str = "You Have Not Entered A Correct Number!";
        else {
            n = temp;
            str = "(" + n + ")2 = (";

            int m = 0;
            int temp2 = 0;
            int j = 1;

            while ( n > 0) {
                m = n % 1000;
                temp = 0;

                for (int i = 0; i < 3; i++) {
                    temp = temp + (int) ((m % 10) * (Math.pow(2, i)));
                    m = m / 10;
                }

                temp2 = temp2 + (temp * j);
                j *= 10;
                n = n / 1000;
            }

            str = str + temp2 + ")8";

        }

        return str;
    }

//---------------------------------  5. 2 to 10  ---------------------------------------------

    private static String baseConvert2To10(int n){
        String str = "";
        int temp = n;
        int flag = 0;
        while ( n > 0) {
            if ((n % 10) == 0 || (n % 10) == 1) n = n / 10;
            else {
                flag++;
                break;
            }
        }

        if (flag == 1) str = "You Have Not Entered A Correct Number!";
        else {
            n = temp;
            str = "(" + n + ")2 = (";
            temp = 0;
            int i = 0;

            while ( n > 0) {
                temp = temp + (int) ((n % 10) * (Math.pow(2, i)));
                n = n / 10;
                i++;
            }

            str = str + temp + ")10";
        }

        return str;
    }

//---------------------------------  6. 2 to 16  ---------------------------------------------

    private static String baseConvert2To16(int n) {

        String str = "";
        int temp = n;
        int flag = 0;
        while (n > 0) {
            if ((n % 10) == 0 || (n % 10) == 1) n = n / 10;
            else {
                flag++;
                break;
            }
        }

        if (flag == 1) str = "You Have Not Entered A Correct Number!";
        else {
            n = temp;
            str = "(" + n + ")2 = (";
            int m = 0;
            int temp2 = 0;
            int j = 1;

            while (n > 0) {
                m = n % 10000;
                temp = 0;

                for (int i = 0; i < 4; i++) {
                    temp = temp + (int) ((m % 10) * (Math.pow(2, i)));
                    m = m / 10;
                }
                temp2 = temp2 + (temp * j);
                j *= 100;
                n = n / 10000;

            }
            n = temp2;
            temp = 0;
            j = 100;

            while (n > 0) {
                temp = (temp * j) + (n % 100);
                n = n / 100;
            }
            n = temp;
            temp = 0;

            while (n > 0) {
                temp = n % 100;
                switch (temp) {
                    case 10:
                        str = str + "A";
                        break;
                    case 11:
                        str = str + "B";
                        break;
                    case 12:
                        str = str + "C";
                        break;
                    case 13:
                        str = str + "D";
                        break;
                    case 14:
                        str = str + "E";
                        break;
                    case 15:
                        str = str + "F";
                        break;
                    default:
                        str = str + temp;
                }

                n = n / 100;

            }

            str = str + ")16";
        }

            return str;
    }

//---------------------------------  7. 8 to 10  ---------------------------------------------

    private static String baseConvert8To10(int n) {
        String str = "";
        int temp = n;
        int flag = 0;
        while (n > 0) {
            if ((n % 10) == 8 || (n % 10) == 9){
                flag++;
                break;
            }
            n = n / 10;

        }

        if (flag == 1) str = "You Have Not Entered A Correct Number!";
        else {
            n = temp;
            str = "(" + n + ")8 = (";
            temp = 0;
            int i = 0;

            while ( n > 0) {
                temp = temp + (int) ((n % 10) * (Math.pow(8, i)));
                n = n / 10;
                i++;
            }
            n = temp;

            str = str + temp + ")10";
        }

        return str;
    }

}//End of class
