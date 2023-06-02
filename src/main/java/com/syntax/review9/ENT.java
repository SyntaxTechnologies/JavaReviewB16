package com.syntax.review9;

public class ENT extends Doctor{

    String location;

    ENT(String firstName, String lastName, String speciality, String location){
        super(firstName, lastName, speciality);
        this.location=location;
    }

    /*
        override prescribeMedicine:
        1. we must have inheritance
        2. method signature MUST be same (name+parameters)
        3. return type MUST be same
        4. access modifiers can be same or give higher visibility
     */

    public void prescribeMedicine(String medicine) {
        System.out.println("ENT doctors prescribes "+medicine+" when needed");
    }

    protected void inspect(String bodyPart){
        System.out.println("Ent doctor checks "+bodyPart);
    }

    public static void main(String[] args) {

        ENT ent=new ENT("John", "Snow", "Ent", "Maryland");
        ent.printInfo(); //from parent
        ent.treat(); //from parent
        ent.treat("John Wick"); //from parent
        ent.prescribeMedicine("Fluticasone nasal preparations."); //overriding method
        ent.inspect("Nose"); // ent own method

        //Casting of non primitives: upcasting and downcasting
        // upcasting
        Doctor ent1=new ENT("John", "Wick", "Ent", "Miami");
        ent1.printInfo();
        ent1.treat();
        ent1.treat("Jane Smith");
        ent1.prescribeMedicine("Some medicine"); //runtime polymorphism
        //during compilation compiler gives accees to all methods based on the reference type
        // during runtime - java looks always at Object type
    }
}
