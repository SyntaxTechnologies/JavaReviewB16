package com.syntax.review2;

import java.util.Scanner;

public class NotScanner {

    public static void main(String[] args) {

        int i = 10;
        // 1. we need to create Scanner
        Scanner key = new Scanner(System.in);

        System.out.println("Please enter full sentence");
        String sentence=key.nextLine();
        System.out.println(sentence);

        System.out.println("Please enter 1 word");
        //2. use command to capture value
        String word = key.next();
        System.out.println("Word that was captured = " + word);

        System.out.println("Please enter integer value");
        int number=key.nextInt();
        System.out.println("Entered number is = "+number);

        System.out.println("Please enter decimal value");
        double decimal=key.nextDouble();
        System.out.println("DEcimal value = "+decimal);




    }
}
