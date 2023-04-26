package com.syntax.review5;

public class ArrayRecap {

    public static void main(String[] args) {

        String[] languages={"English", "Russian", "Turkish", "French", "Spanish", "German"};

        for(String language: languages) {
            System.out.print(language+" ");
        }

        System.out.println(" ----------   REVERSE  -----------    ");
        //I want to print elements in reverse order

        for(int i=languages.length-1; i>=0; i-- ){
            System.out.print(languages[i]+" ");
        }

    }
}
