package com.cydeo.selenium.Self_Practice;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPractice {
    public static void main(String[] args) {


       // 1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();



        driver.get("http://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println(" Before click checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("After click checkbox1.isSelected() = " + checkbox1.isSelected());

        WebElement checkbox2 = driver.findElement(By.name("checkbox2"));
        System.out.println("Before click checkbox2.isSelected() = " + checkbox2.isSelected());
        checkbox2.click();
        System.out.println("After click checkbox2.isSelected() = " + checkbox2.isSelected());

// OR YOU CAN USE ATTRIBUTE METHOD
//
//        WebElement checkbox2 = driver.findElement(By.name("checkbox2"));
//        System.out.println("Before click checkbox2.getAttribute() = " + checkbox2.getAttribute("checked"));
//        WebElement checkbox2 = driver.findElement(By.name("checkbox2"));
//        System.out.println("After click checkbox2.getAttribute() = " + checkbox2.getAttribute("checked"));

        //IF WE WANT TO CHECK THE CHECKBOX

        if(checkbox1.isSelected()){
            System.out.println("checkbox1 is already selected");
        }else{
            checkbox1.click();
        }
    }
}
