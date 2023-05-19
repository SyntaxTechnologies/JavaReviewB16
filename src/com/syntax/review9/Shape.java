package com.syntax.review9;

public abstract class Shape {
    public String type;
    protected String color;
    Shape( String type, String color){
        this.type=type;
        this.color=color;
    }
    protected void printInfo(){
        System.out.println("We build "+color+" "+type);
    }
    public abstract double calculateArea();
}

class Triangle extends Shape {

    int base;
    int height;

    Triangle(String type, String color, int base, int height){
        super(type, color);
        this.base=base;
        this.height=height;
    }

    //when we provide implementation for the abstract methods from parent class we must follow rules of overriding
    public double calculateArea(){
        double area=(base * height)/2;
        return area;
    }

    public void print(){
        System.out.println(type +"  has demensiion as "+base+" "+height);
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(String type, String color, double length, double width){
        super(type, color);
        this.length=length;
        this.width=width;
    }

    public double calculateArea() {
        return length*width;
    }
}