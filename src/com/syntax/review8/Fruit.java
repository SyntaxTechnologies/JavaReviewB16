package com.syntax.review8;

public class Fruit {

    public String name, color;

    Fruit(String name, String color){
        this.name=name;
        this.color=color;
    }

    public void eat(){

        System.out.println("We can eat "+name);
    }
}
// 1 parent - 1 child =single inheritance
class Mango extends Fruit{

    int price;

    Mango(String name, String color, int price){
        super(name, color);//we MUST make a call to the parent class Constructor
        this.price=price;
    }
    protected void grow(String country){
        System.out.println(name+" grows in "+country);
    }
}
// 1 parent - 2 child classes = hierarchical
class Apple extends Fruit {

    Apple(String name, String color){
        super(name, color);//we MUST make a call to the parent class Constructor
    }
    protected void makeJuice(){
        System.out.println("We can make "+name+" juice");
    }
}

// parent -> child -> grandchild = multilevel
class BabyApple extends Apple {

    BabyApple(String name, String color){
        super(name, color);//we MUST make a call to the parent class Constructor
    }
    void print(){
        System.out.println(name+" is very small");
    }
}