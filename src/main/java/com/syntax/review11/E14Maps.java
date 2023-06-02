package com.syntax.review11;

import java.util.*;

public class E14Maps {
    public static void main(String[] args) {

        Map<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2.5);
        fruit.put("Banana",2.0);
        fruit.put("Kiwi",3.2);
        fruit.put("Orange",4.0);
        fruit.put("Mango",5.1);
        System.out.println(fruit);
        fruit.remove("Mango");
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(3.2));
        fruit.replace("Kiwi",3.8);
        System.out.println(fruit);

        System.out.println(fruit.get("Banana"));



    }
}
