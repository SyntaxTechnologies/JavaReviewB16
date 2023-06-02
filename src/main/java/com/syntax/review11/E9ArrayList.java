package com.syntax.review11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E9ArrayList {
    public static void main(String[] args) {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.amazon.com/");
        List<WebElement> allATags = webDriver.findElements(By.xpath("//a"));
        for(WebElement e:allATags){
            if(!e.getText().isEmpty()){
            System.out.println(e.getText());}
        }

        webDriver.close();

    }
}
