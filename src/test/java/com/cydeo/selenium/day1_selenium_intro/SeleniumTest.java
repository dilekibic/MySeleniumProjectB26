package com.cydeo.selenium.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // 1. Setting Up Web driver Manager

        WebDriverManager.chromedriver().setup();   // abstract class

        // 2. Create instance of the chrome driver

        WebDriver driver = new ChromeDriver(); // this one is object - interface

        driver.get("https://www.google.com");

    }

}
