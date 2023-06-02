package com.syntax.review2;

public class Casting {

    public static void main(String[] args) {

        // widening
        // byte-> short->int->long->float->double
        double d=19;
        System.out.println(d); //19.0

        //narrowing
        // double-> float->long->int->short->byte
        int i=(int)19.9;
        System.out.println(i); //19
    }
}
