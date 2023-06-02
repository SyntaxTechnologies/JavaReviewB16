package com.syntax.review4;

public class MoreNestedLoops {

    public static void main(String[] args) {

        System.out.println(" ----   CAR ------");

        for (int a = 0; a <= 9; a++) {

            for (int b = 0; b <= 9; b++) {

                for (int c = 0; c <= 9; c++) {

                    System.out.println(a + " " + b + " " + c);
                }
            }
        }

        System.out.println(" What is the output ??????? ");

        for(int i=1; i<3; i++){

            for(int j=0; j<3; j++){
                System.out.println("Hello");
            }
            System.out.println("Bye");
            break;
        }

        System.out.println(" What is the output ??????? ");

        for(int i=1; i<3; i++){

            for(int j=0; j<3; j++){
                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");

        }

        System.out.println(" What is the output ??????? ");

        for(int i=1; i<3; i++){

            for(int j=0; j<3; j++){
                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");
            break;
        }


        System.out.println(" What is the output ??????? ");

        for(int i=1; i<3; i++){

            for(int j=0; j<3; j++){
                if(j==2) {
                    continue;
                }
                System.out.println("Hello");
            }
            System.out.println("Bye");

        }

        System.out.println(" What is the output ??????? ");

        for(int i=1; i<3; i++){

            for(int j=0; j<3; j++){

                if(i==2) {
                    continue;
                }
                System.out.println("Hello");
            }
            System.out.println("Bye");

        }

    }
}
