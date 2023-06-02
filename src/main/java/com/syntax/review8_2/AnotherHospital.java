package com.syntax.review8_2;

import com.syntax.review8.Doctor;

public class AnotherHospital {

    public static void main(String[] args) {

        Doctor doc=new Doctor("Axel", "Moraga", "ENT");
        doc.printInfo(); //public
        // doc.treat(); //CE: no protected
        // doc.prescribeMedicine("antibiotics"); // CE: no default
    }
}
