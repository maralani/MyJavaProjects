package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        int result = 0;
        result = parsInt(str);
        System.out.format("int: %d",result);
        System.out.println();

		result = Integer.parseInt(str);
        System.out.format("parseint: %d", result);

    }//End of main

//--------------------------- String: ParsInt ------------------------------

    private static int parsInt(String s){

        int r = 0;
        int temp = 1;
        for (int i = s.length()-1; i >=0; i--) {
            r = r + ((s.charAt(i)) - 48) * temp;
            temp = temp * 10;
        }

        return r;
    }

}//End of class