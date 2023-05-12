package com.syntax.review8;

public class Hospital {

    public static void main(String[] args) {
        Doctor doc=new Doctor("John", "Doe");
        doc.printInfo();

        Doctor doc2=new Doctor("Jane", "Smith", "Cardiologyst");
        doc2.printInfo();
    }
}
