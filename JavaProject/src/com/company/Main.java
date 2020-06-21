package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("f(x)= 2x ");

        printMenu();
        System.out.print("Select the item: ");
        int n = input.nextInt();

        System.out.print("Please Enter A Minimum Number x1 = ");
        int x1 = input.nextInt();
        System.out.print("Please Enter A Maximum Number x2 = ");
        int x2 = input.nextInt();

        double result = 0;

        switch (n){
            case 1:
                System.out.print("Please Enter A Step Number dx = ");
                double dx = input.nextDouble();
                result = rectangle(x1 , x2, dx);
                break;
            case 2:
                System.out.print("Please Enter A Step Number dx = ");
                dx = input.nextDouble();
                result = trapezoid(x1 , x2, dx);
                break;
            case 3:
                System.out.print("Please Enter A Even Number  m = ");
                float m = input.nextFloat();
                result = simpson(x1 , x2, m);
                break;
            case 4:
                System.out.print("Please Enter A Step Number dx = ");
                dx = input.nextDouble();
                result = midpoint(x1 , x2, dx);
                break;
            default:
        }

        System.out.format("integral 2x in [%d to %d] = %.2f", x1, x2, result);

    }//End of main
//----------------------- Method: Menu ----------------------------------

    private static void printMenu(){
        System.out.println("integral: Methods\n1. Rectangle method\n2. Trapezoid method\n3. Simpson method" +
                            "\n4. midpoint Method");
    }

//----------------------- 1. Rectangle method ----------------------------

    private  static double rectangle(int x1 , int x2, double dx){
        double integral = 0;

        for (double i = x1; i < x2; i+= dx) {
            integral = integral + (dx * (2*(i + dx)));
        }

        return integral;
    }

//----------------------- 2. Trapezoid method ----------------------------

    private  static double trapezoid(int x1 , int x2, double dx){
        double integral = 0;

        for (double i = x1; i < x2; i+= dx) {
            integral = integral + ((dx / 2) * ((2*i)+(2*(i + dx))));
        }

        return integral;
    }

//-----------------------  3. Simpson method  -----------------------------

    private static double simpson(int x1, int x2, float m){

        double dx = (x2 - x1) / m;
        double integral = 2 * x1;
        double x = x1;

        for (double i = 1; i < m; i++) {

            x = x + dx;
            if ( i % 2 == 0) {
                integral = integral + 2 * (2*x);
            }else {
                integral = integral + 4 * (2*x);
            }
        }//End of for

        integral =(dx / 3) * (integral + (2 * x2));

        return integral;
    }

//-----------------------  4. midpoint Method -----------------------------

    private  static double midpoint(int x1 , int x2, double dx){
        double integral = 0;

        for (double i = x1; i < x2; i+= dx) {
            integral = integral + (dx * (2*(i + dx/2)));
        }

        return integral;
    }

}//End of class
