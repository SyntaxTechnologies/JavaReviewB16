package com.syntax.review11;

import java.util.*;

public class E13Collections {
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        Set<Integer> set=new LinkedHashSet<>(numbers);
        System.out.println(set);


    }
}
