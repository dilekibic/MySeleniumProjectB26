package com.cydeo.selenium.day2_locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FacebookTitleVerification {
    public static void main(String[] args) {
/*
        TC #1: Facebook title verification
        1. Open Chrome browser
        2. Go to https://www.facebook.com
        3. Verify title:
        Expected: “Facebook - log in or sign up

 */
// 1 - OPEN CHROME BROWSER

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
// 2- GO TO WEBPAGE
        driver.get("https://www.facebook.com");


 // 3 - VERIFY THE TITLE
  //      Expected:"Facebook - log in or sign up"
        String expectedTitle = "Facebook - log in or sign up";

        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Facebook title verification is passed!");
        }else{
            System.out.println("Facebook title verification is failed!");
        }
        driver.quit();
    }
}
