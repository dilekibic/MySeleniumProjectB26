package com.cydeo.selenium.Self_Practice;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class findElementspractice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> allColors = driver.findElements(By.name("color"));
        System.out.println(allColors.size());


        for (WebElement eachColor : allColors){
            System.out.println("Current radio button is " + eachColor.getAttribute("id"));
            System.out.println("Is it enabled: " + eachColor.isEnabled());
            System.out.println("Is it selected " + eachColor.isSelected());
        }

    }
}