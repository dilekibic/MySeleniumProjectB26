package com.cydeo.selenium.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OfficeHours_Hmw1 {

    //       1- Open a chrome browser

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

//    2- Go to: https://practice.cydeo.com/

        driver.get("https://practice.cydeo.com/");

//            3- Click to Multiple Buttons
        WebElement MultipleButton = driver.findElement(By.cssSelector("div#content>ul>li>a[href='/multiple_buttons']"));
        MultipleButton.click();
//    4- Click "Don't Click" button
        WebElement dontClick =driver.findElement(By.id("disappearing_button"));
        dontClick.click();
//    5- Verify Result is : "Now it's gone"

        WebElement result =driver.findElement(By.id("result"));
        String actual = result.getText();

        String expected ="Now it's gone!";
        if(actual.equals(expected)){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }

        driver.quit();


    }
}

