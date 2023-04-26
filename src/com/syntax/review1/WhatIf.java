package com.syntax.review1;

public class WhatIf {

    public static void main(String[] args) {

        int a=10;
        int b=20;
        String c="Hello";
        String d="Bye";

        System.out.println(a+b+c+d); //30HelloBye

        System.out.println(a+c+b+d); //10Hello20Bye

        System.out.println(c  +  d+  a+  b); // HelloBye1020

        System.out.println(c  +  d+  (a+  b)); //HelloBye30


    }
}
