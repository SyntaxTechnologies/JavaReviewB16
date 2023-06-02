package com.syntax.review7;

public class StringMethods {

    public static void main(String[] args) {

        String str="Hello"; //String is immutable
        String str1="Hello";

        String str2=new String("Hello");

        System.out.println(str==str1);
        System.out.println(str1==str2);

        str.toUpperCase(); //brand new string is created is reassigned to variable str
        System.out.println(str); //Hello

        StringBuilder sb=new StringBuilder("Hello"); //String builder is mutable
        sb.reverse();
        System.out.println(sb); //olleH

        sb.append("Hello"); //we have a String builder object
        str=sb.toString(); //we convert String Builder Object to String Object and reassign to variable str
        System.out.println(str);

        //Write a code to reverse a String
        String given="Class";

        StringBuilder strb=new StringBuilder(given);
        given=strb.reverse().toString();
        System.out.println(given);

        //reverse String without using any inbuilt functions

    }
}
