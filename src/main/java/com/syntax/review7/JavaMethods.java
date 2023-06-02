package com.syntax.review7;

public class JavaMethods {

        /*
            method is a block of code to perform specific task

            In the future we have to develop methods:
                            open/close browser
                            click on buttons
                            opening excel
                            extracting data from excel
         */

        /*

              Methods: return value
                       do not return anything

              Methods: with parameters
                       without parameters
         */

    void hello(){
        System.out.println("Hello");
    }

    void helloName(String name){
        System.out.println("Hello "+name);
    }

    // I want methods that accepts 3 Strings, concatenates them and return a new Concatenated String
    String concatenate(String str1, String str2, String str3) {
        return str1.concat(str2).concat(str3);
    }

    //I want to create a method that will return me the largest numbers from given 2 numbers
    int largest(int num1, int num2) {
        int large;
        if (num1>num2){
            large=num1;
        }else {
            large=num2;
        }
        return large;
    }

    // we need a method that will convert Celsius to Farein..... and return the value
    double convertTemp(double cel) {
        double f = cel * 9 / 5 + 32;
        return f;
    }

    //create a method that will return an Array of words from given Sentence
    String[] words(String sentence) {
        String[] words = sentence.split(" ");
        return words;
    }
}


