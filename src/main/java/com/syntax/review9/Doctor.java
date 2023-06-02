package com.syntax.review9;

public class Doctor {

    public String firstName, lastName;
    protected String speciality;
    int yearsOfExperience;
    private double salary;
    public static boolean degree;

    Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    /*
        to have more than 1 constructor we need to change number of the parameters or type of the parameters
     */
    public Doctor(String firstName, String lastName, String speciality){
        this(firstName, lastName); // this() -> calling a current class constructor
        this.speciality=speciality; // this. referring to current class instance variables
    }

    public void printInfo(){
        System.out.println("Doctors name is "+firstName+" "+lastName+". And speciality is "+speciality);
    }

    protected void treat(){
        System.out.println("Doctors treat patients");
    }

    //in overloading we look only at the signature (name +parameters)
    // signature must be different
    protected void treat(String patient){
        System.out.println("Doctor treats "+patient);
    }

    void prescribeMedicine(String medicine){
        System.out.println("Doctor prescribed "+medicine);
    }

    //private members do not participate in the inheritance
    private double getSalary(){
        return salary;
    }

}
