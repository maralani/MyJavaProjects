package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A String: str = ");
        String str = input.nextLine();

        System.out.print("Please Enter A Split: ");
        char split = input.nextLine().charAt(0);

        String result = "";
        result = split(str, split);
        System.out.println(result);


    }//End of main

//--------------------------- String: Split ------------------------------

    private static String split(String s, char split){

        String str = "";
        int n = s.length();
        String A[] = new String [n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = "";
        }

        int j =1;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) != split) {
                A[j] = A[j] + s.charAt(i);
            }else {

                str = str + A[j] + "\n";
                j++;
            }
        }
        str = str + A[j];

        return str;
    }

}//End of class