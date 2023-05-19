package com.syntax.review9;

public class ShapeTest {

    public static void main(String[] args) {

        // new Shape("Circle", "Yellow");  we cannot create an Object of the Abstract Class

        Triangle tr=new Triangle("triangle", "purple", 12, 18);
        tr.print();
        System.out.println("area ="+tr.calculateArea());
        tr.printInfo();

        Rectangle rec=new Rectangle("rectangle", "green", 10, 20);
        rec.printInfo();
        System.out.println("Area of rectangle "+rec.calculateArea());

        Shape shape=new Triangle("triangle", "red", 120, 180);
        shape.printInfo();
        System.out.println(shape.calculateArea());

       Shape[] bigShape= {new Triangle("triangle", "pink", 200, 300),
                          new Rectangle("rectangle", "blue", 10, 200),
                          new Rectangle("rectangle", "brown", 100, 200)};


       for (Shape sh:bigShape){
           sh.printInfo();
           double area=sh.calculateArea();
           System.out.println("The area of "+sh.color+" "+sh.type+" = "+area);
       }
    }
}
