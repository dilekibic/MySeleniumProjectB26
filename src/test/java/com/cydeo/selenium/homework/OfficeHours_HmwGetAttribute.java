package com.cydeo.selenium.homework;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfficeHours_HmwGetAttribute {
    public static void main(String[] args) {


//    GetAttribute
//    1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

//    2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/ ");

//            3- Click Registration Form
        WebElement registration = driver.findElement(By.cssSelector("a[href=\"/registration_form\"]"));
        registration.click();

//    4- Verify following fields has these default values
//        - First name ---> first name
        WebElement firstName = driver.findElement(By.cssSelector("input.form-control"));
        String actual = firstName.getAttribute("placeholder");
        String expected ="first name";

        if(actual.equals(expected)){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
//
//            - Last name  ---> last name
        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        actual = lastName.getAttribute("placeholder");
       expected ="last name";
        if(actual.equals(expected)){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
//            - Username   ---> username
            WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
            actual = username.getAttribute("placeholder");
            expected ="username";
            if(actual.equals(expected)){
                System.out.println("Passed!");
            }else{
                System.out.println("Failed!");

    }
            driver.quit();
}}