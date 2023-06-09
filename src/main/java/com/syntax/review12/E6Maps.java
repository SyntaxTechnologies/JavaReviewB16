package com.syntax.review12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E6Maps {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Kiwi", 2);
        map.put("Orange", 4);
        map.put("Mango", 3);
        map.put("Banana", 30);
        var entrySet = map.entrySet();
        for (var entry : entrySet) {
            if(entry.getKey().contains("a") && entry.getValue()>4)
            System.out.println(entry);
        }


    }
}
