package com.syntax.review2;

public class IfElse {

    public static void main(String[] args) {

        int age=18;

        if(age>=18) {
            System.out.println("You can get a DL");
        } else {
            System.out.println("You are too young to drive");
        }

        System.out.println("    -------------   ");

        String expected="Best sellers";

        if(expected.equals("Best Sellers")) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fail");
        }

    }
}
