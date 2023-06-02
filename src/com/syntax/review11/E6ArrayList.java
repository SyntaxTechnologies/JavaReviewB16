package com.syntax.review11;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {

        ArrayList<String> student = new ArrayList<>();
        student.add("Adam");
        student.add("Sarah");
        student.add("Halima");
        student.add("Abdul");
        student.add("Semir");
        student.add("Semir");

        ArrayList<String> feeDefaulter = new ArrayList<>();
        feeDefaulter.add("Axel");
        feeDefaulter.add("Leandro");
        feeDefaulter.add("Farwa");
        feeDefaulter.add("Adam");

        student.removeAll(feeDefaulter);
        System.out.println(student);


    }
}
