package com.syntax.review12;

import java.util.HashMap;
import java.util.Map;

public class E8Dog {
    public static void main(String[] args) {

        /*
         */
        Dog dog1=new Dog("Jodi",10);
        Dog dog2=new Dog("jimmi",11);
        Dog dog3=new Dog("lucy",15);
        Map<String,Dog> dogMap=new HashMap<>();
        dogMap.put("Jodi",dog1);
        dogMap.put("jimmi",dog2);
        dogMap.put("lucy",dog3);
        System.out.println(dogMap);
        dogMap.forEach((k,v)-> v.printInfo());




    }
}
