package com.syntax.review11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E7ArrayList {
    public static void main(String[] args) {

        List<String> student = new ArrayList<>();
        student.add("Adam");
        student.add("Sarah");
        student.add("Halima");
        student.add("Abdul");
        student.add("Semir");
        student.add("Semir");
        // student.remove("Halima");
        student.add(3, "James");
        System.out.println(student);


    }
}
