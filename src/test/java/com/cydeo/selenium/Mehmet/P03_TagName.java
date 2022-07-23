package com.cydeo.selenium.Mehmet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_TagName {

        /*


    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com/
    3- Click Registration Form
    4- Verify following fields has these default values
            - First name ---> first name
            - Last name  ---> last name
            - Username   ---> username

         */

        public static void main(String[] args) {
        /*

    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com/
    3- Verify first link text is "Home"

         */

            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://practice.cydeo.com/");
            String linkText = driver.findElement(By.tagName("a")).getText();
            System.out.println(linkText);


            if(linkText.equals("Home"))
                System.out.println("PASSED");
            else
                System.out.println("FAILED");


            driver.quit();

        }
    }


