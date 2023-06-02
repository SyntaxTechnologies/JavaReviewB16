package com.syntax.review5;

public class Task5 {

    public static void main(String[] args) {

        /*
            Write a program to swap 2 numbers without a temporary variable?
         */

        int a=10;
        int b=20;

        a = a + b;//30
        b = a - b;//10
        a = a - b;//20
        System.out.println(" After swap : ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

        System.out.println(" --------------------------------- ");

        a=10;
        b=20;

        a=a*b; //200
        b=a/b; //10
        a=a/b; //20

        System.out.println(" After swap : ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }
}
