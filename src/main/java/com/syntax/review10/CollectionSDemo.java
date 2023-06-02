package com.syntax.review10;

import java.util.ArrayList;

public class CollectionSDemo {
    public static void main(String[] args) {

        String [] names= new String[10];

        ArrayList<String> amazonList=new ArrayList<>();

        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            amazonList.add(String.valueOf(i));
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);





    }
}
