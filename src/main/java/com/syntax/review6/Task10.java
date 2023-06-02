package com.syntax.review6;

public class Task10 {

    public static void main(String[] args) {

        //Write a program to print out duplicate elements from an Array of Strings?
        String [] baking={"spatula", "weighing scale", "measuring cups", "mixer", "weighing scale",
                "muffin tins",
                "piping bags", "spatula", "mixer", "butter", "buttercream", "cake batter"};

        for (int i=0; i< baking.length; i++){

            for (int j=i+1; j< baking.length; j++) {

                System.out.println("i = "+i +" and j= "+j);

                if (baking[i].equals(baking[j])) {
                    System.out.println(baking[j]);
                }
            }
        }
    }
}
