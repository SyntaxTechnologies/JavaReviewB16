package com.syntax.review8;

public class SuperMarket {

    public static void main(String[] args) {

        Apple app=new Apple("Fuji", "green");
        //app.name="Fuji apple"; //comes from parent
        app.eat(); //comes from parent
        app.makeJuice(); // it is own method
        // app.grow(); // sibling classes do not share anything

        app.getClass(); //Method comes from Object class -> is the parent class of all Objects in Java

    }
}
