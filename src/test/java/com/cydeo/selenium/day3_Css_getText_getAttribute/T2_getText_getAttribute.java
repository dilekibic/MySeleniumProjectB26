package com.cydeo.selenium.day3_Css_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getAttribute {
    public static void main(String[] args) throws InterruptedException {
//        TC #5: getText() and getAttribute() method practice
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//
//       2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

//       3- Verify header text is as expected:
//        Expected: Registration form
//          LOCATING HEADER TEXT to get text between opening and closing tag
        Thread.sleep(3000);
        WebElement headertext = driver.findElement(By.tagName("h2"));
        String expectedheader = "Registration form";
        String actualheader = headertext.getText(); //getText(); method;

        if(actualheader.equals(expectedheader)){
            System.out.println("Header Text verification passed!");
        }else{
            System.out.println("Header Text Verification failed!");
        }
                Thread.sleep(3000);
//        4- Locate “First name” input box

        WebElement firstnameInput = driver.findElement(By.className("form-control"));


//        5- Verify placeholder attribute’s value is as expected: Expected: first name
            String expectedPlaceHolder = "first name";
            //getAttribute(attribute argument) method is helping us to get value of attributes.
            String actualPlaceHolder = firstnameInput.getAttribute("placeholder");

            if(actualPlaceHolder.equals(expectedPlaceHolder)){
                System.out.println("Placeholder text verification passed!");
            }else{
                System.out.println("Placeholder text verification failed!");
            }
            driver.quit();
    }
}
