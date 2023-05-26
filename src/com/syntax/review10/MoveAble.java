package com.syntax.review10;

public interface MoveAble {
    void move();
}

class Dog implements MoveAble{
    @Override
    public void move() {
        System.out.println("Dog is moving");
    }
}
class Car implements MoveAble {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
class Human implements MoveAble{
    @Override
    public void move() {
        System.out.println("Human moving....");
    }
}
