package com.syntax.review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class E11ConfigWrite {

    public static void main(String[] args) throws IOException {
        String path="Files/Test.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        properties.setProperty("Name","Vlad");
        FileOutputStream fos=new FileOutputStream(path);
        properties.store(fos,"adding a name");

    }

}
