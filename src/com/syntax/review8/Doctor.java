package com.syntax.review8;

public class Doctor {

    String firstName, lastName;
    String speciality;
    int yearsOfExperience;
    double salary;
    static boolean degree;

    Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    /*
        to have more than 1 constructor we need to change number of the parameters or type of the parameters
     */
    Doctor(String firstName, String lastName, String speciality){
        this(firstName, lastName); // this() -> calling a current class constructor
        this.speciality=speciality; // this. referring to current class instance variables
    }

    void printInfo(){
        System.out.println("Doctors name is "+firstName+" "+lastName+". And speciality is "+speciality);
    }

}
