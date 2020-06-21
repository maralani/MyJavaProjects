package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Pleas Enter A Number\t n = ");
        int n = input.nextInt();

        String result = pascalTriangle(n);
        System.out.println(result);

    }//End of main
//----------------------- Method: Pascal triangle ----------------------------
    private static String pascalTriangle(int n){
        String str = "";

        for (int i = 1; i <=n; i++) {

            str = str + space(n - i);
            long fact = 1;
            fact = fact(i);

            for (int j = 0; j <= i; j++) {

                int temp = 0;
                long num = 0;
                long factj = fact(j);
                temp = i - j;
                long factTemp = fact(temp);

                num = fact / (factj * factTemp);

                str = str + num + " ";

            }//End of for(j)

            str = str + space(n - i - 1);
            str = str + "\n";
        }

        return str;
    }

//----------------------- Method: Space ----------------------------

    private static String space(int n){
        String str = "";

        for (int i = 1; i <=n; i++){
            str = str + " ";
        }

        return str;
    }
//----------------  Method: Factorial  ----------------------

    private static long fact(int n){
        long r = 1;

        for (int i = 2; i <=n; i++){
            r = r * i;
        }

        return r;
    }
}//End of class
