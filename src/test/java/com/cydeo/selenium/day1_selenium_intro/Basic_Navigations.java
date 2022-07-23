package com.cydeo.selenium.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {

        // 1- Setting up webdriver manager

        WebDriverManager.chromedriver().setup();

        // 2-Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);
        // 3- Make our page full screen

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");   // this one and driver navigate is giving the same result

        //navigate().to() method is for navigating to web page
        //driver.navigate().to("https://www.etsy.com");

        // it is using for stopping application. we are giving time to application to see steps
        Thread.sleep(3000);


        //navigate().to() method is for navigating to web page
        driver.navigate().back();

        //navigate().forward() method is for navigating to forward from web page
        driver.navigate().forward();

            Thread.sleep(3000);

        //navigate().refresh() method is for refressing the page
        driver.navigate().refresh();


        // String currentTitle = driver.getTitle()
        // getTitle is a string and get title will print the tile of the page on the console
        // shortcut is driver.getTitle().souttv


        //Getting title of the current page
        System.out.println("Etsy page driver.getTitle() = " + driver.getTitle());

        //getting URL of the current page
        System.out.println("Etsy page driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.get("https://www.tesla.com");
        System.out.println("Tesla page driver.getTitle() = " + driver.getTitle());
        System.out.println("Tesla page driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //this will close the currently open page
        driver.close();
        //this will close all the pages/tabs
        driver.quit();
    }

}
