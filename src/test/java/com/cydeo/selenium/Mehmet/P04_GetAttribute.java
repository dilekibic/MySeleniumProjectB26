package com.cydeo.selenium.Mehmet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_GetAttribute {
    public static void main(String[] args) throws InterruptedException {


        /*

        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/
        3- Click to Multiple Buttons
        4- Click "Don't Click" button
        5- Verify Result is : "Now it's gone!"

         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        // locate multiple buttons
        WebElement multiple = driver.findElement(By.partialLinkText("Multiple"));
        // click it
        multiple.click();
        // click Don't Click
        WebElement disappearing_button = driver.findElement(By.id("disappearing_button"));
        // Verify "message is Now it's gone!"
        String result = driver.findElement(By.id("result")).getText();
        System.out.println(result);

        Thread.sleep(3000);

        driver.quit();


    }
}


