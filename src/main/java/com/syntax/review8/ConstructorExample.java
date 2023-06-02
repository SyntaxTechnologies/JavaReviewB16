package com.syntax.review8;

public class ConstructorExample {

    /*
        how to create a constructor? Rules
        1. must have same name as a class
        2. no return type, not even void
     */
    //If we want to create our own constructor we can create: 1. non argument 2. parametrized constructor
    ConstructorExample(){
        System.out.println("I created this constructor");
    }

    ConstructorExample(String str){
        System.out.println("I am parametrized constructor "+str);
    }

    public static void main(String[] args) {

        new ConstructorExample(); //calling a constructor of ConstructorExample class
                                    //when we do not create -> compiler create a default constructor for us
                                // why - constructor is used to initialize the state of the object

        ConstructorExample var=new ConstructorExample("Hello");
    }
}
