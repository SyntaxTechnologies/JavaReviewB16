package com.syntax.review6;

public class IceCream {

    /*      Variables Syntax
            dataType name;
     */
    String flavor, color;
    boolean dairyFree;
    double price;

    /*  Methods Syntax
        returnType name() {}
     */
    void eat(){
        System.out.println("We can eat "+flavor+" ice cream");
    }
    void buy(){
        System.out.println(flavor +" ice cream cost "+price);
    }
}
