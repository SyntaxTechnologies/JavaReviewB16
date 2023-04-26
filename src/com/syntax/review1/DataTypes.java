package com.syntax.review1;

public class DataTypes {

    public static void main(String[] args) {

        /*
            Data types in Java: 2
            1. primitive - 8
                    numeric:
                            whole numbers: byte, short, int, long
                            decimal numbers: float, double
                    non numeric: char, boolean
            2. non primitive - many
         */

       byte door= 4;
       short horsePower=300;
       int mileage= 300000; //used the most
       long vinNumber=8768769867097097L;

       float weight=6000.5F;
       double price=50788.5; //used the most

       boolean electric=true;
       char symbol='A';

        System.out.println(horsePower); //300
        System.out.println("horsePower"); //horsePower
        //System.out.println(horsepower); error - always check spelling

    }
}
