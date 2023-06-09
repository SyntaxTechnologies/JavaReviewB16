package com.syntax.review12;

public class Dog {
    String name;
    int age;
    Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    void printInfo(){
        System.out.println(name+" "+age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
