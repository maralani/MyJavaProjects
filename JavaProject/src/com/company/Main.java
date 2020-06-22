package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        printmenu();
        System.out.print("Please Select A Shape s = ");
        int s = input.nextInt();
        System.out.print("Please Enter A Number n = ");
        int n = input.nextInt();

        String result = "";

        switch (s){
            case 1:
                result = shapeOne(n);
                break;
            case 2:
                result = shapeTwo(n);
                break;
            case 3:
                result = shapeThree(n);
                break;
            case 4:
                result = shapeFour(n);
                break;
            case 5:
                result = shapeFive(n);
                break;
            case 6:
                result = shapeSix(n);
                break;
            default:
        }

        System.out.println(result);

    }//End of main

//----------------------- Root-finding algorithms: Bisection Method ----------------------------

    private static void printmenu(){

        System.out.println("*\n**\n***\n****\n...\tShape 1");
        System.out.println();

        System.out.println("   *\n  **\n ***\n****\n...\tShape 2");
        System.out.println();

        System.out.println("   *\n  ***\n *****\n*******\n...\tShape 3");
        System.out.println();

        System.out.println("   *\n  * *\n * * *\n* * * *\n * * *\n  * *\n   *\n...\tShape 4");
        System.out.println();

        System.out.println("*\n**\n***\n****\n***\n**\n*\n...\tShape 5");
        System.out.println();

        System.out.println("   *\n  **\n ***\n****\n ***\n  **\n   *\n...\tShape 6");
        System.out.println();

    }

//---------------------------------  Shape 1  ---------------------------------------------

    private static String shapeOne(int n){
        String str = "";

        for (int i = 1; i <= n; i++) {
            str = str + star(i);
            str = str + "\n";
        }

        return str;
    }

//---------------------------------  Shape 2  ---------------------------------------------

    private static String shapeTwo(int n){
        String str = "";

        for (int i = 1; i <= n; i++) {
            str = str + space(n -i);
            str = str + star(i);
            str = str + "\n";
        }

        return str;
    }

//---------------------------------  Shape 3  ---------------------------------------------

    private static String shapeThree(int n) {
        String str = "";

        for (int i = 1; i <= n; i++) {
            str = str + space(n -i);
            str = str + star((i*2)-1);
            str = str + "\n";
        }

        return str;
    }

//---------------------------------  Shape 4  ---------------------------------------------

    private static String shapeFour(int n) {
        String str = "";

        n = ( n / 2 ) + 1;
        for (int i = 1; i <= n; i++) {
            str = str + space(n-i);
            str = str + starSpace(i);
            str = str + "\n";
        }

        n = n - 1;
        for (int i = n; i >= 1; i--) {
            str = str + space(n-i);
            str = str + spaceStar(i);
            str = str + "\n";
        }

        return str;
    }

//---------------------------------  Shape 5  ---------------------------------------------

    private static String shapeFive(int n) {
        String str = "";

        n = ( n / 2 ) + 1;
        for (int i = 1; i <= n; i++) {
            str = str + star(i);
            str = str + "\n";
        }

        n = n - 1;
        for (int i = n; i >= 1; i--) {
            str = str + star(i);
            str = str + "\n";
        }

        return str;
    }

//---------------------------------  Shape 6  ---------------------------------------------

    private static String shapeSix(int n) {
        String str = "";

        n = ( n / 2 ) + 1;
        for (int i = 1; i <= n; i++) {
            str = str + space(n-i);
            str = str + star(i);
            str = str + "\n";
        }

        for (int i = n; i >= 1; i--) {
            str = str + space(n-i);
            str = str + star(i);
            str = str + "\n";
        }

        return str;
    }

//---------------------------------  Space  ---------------------------------------------

    private static String space(int n){
        String str = "";

        for (int i = 1; i <= n; i++) {
            str = str + " ";
        }

        return str;
    }

//---------------------------------  Star  ---------------------------------------------

    private static String star(int n){
        String str = "";

        for (int i = 1; i <= n; i++) {
            str = str + "*";
        }

        return str;
    }

//---------------------------------  Star Space  ---------------------------------------------

    private static String starSpace(int n){
        String str = "";

        for (int i = 1; i <= n; i++) {
            str = str + "* ";
        }

        return str;
    }

//---------------------------------  SpaceStar  ---------------------------------------------

    private static String spaceStar(int n){
        String str = "";

        for (int i = 1; i <= n; i++) {
            str = str + " *";
        }

        return str;
    }

}//End of class
