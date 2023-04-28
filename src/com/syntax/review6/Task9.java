package com.syntax.review6;

import java.util.Arrays;

public class Task9 {

    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array?
        int[] numbers = {100,100,-20,30,40,44,40, 11,22,33,44};

        int largest = numbers[0];
        int secondLargest = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {

                secondLargest = largest;
                largest = numbers[i];

            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Number "+ secondLargest+" is the second largest number.");

        System.out.println("    -------------------   ");

        int num[] = {3, 2, 45, 6};
        Arrays.sort(num);
        System.out.print("Second largest number in the array is " + num[num.length - 2]);
    }
}

