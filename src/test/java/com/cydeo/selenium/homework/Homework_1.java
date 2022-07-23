package com.cydeo.selenium.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://google.com");


        Thread.sleep(3000);

        WebElement GmailLinkText = driver.findElement(By.linkText("Gmail"));
        GmailLinkText.click();

        Thread.sleep(3000);


        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();


        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!");

        } driver.navigate().back();
            Thread.sleep(3000);

            String expectedTitle2 = "Google";
            String actualTitle2 = driver.getTitle();


            if(actualTitle2.equals(expectedTitle2)){
                System.out.println("Gmail Title Verification passed!");
            }else{
                System.out.println("Gmail Title Verification failed!");
            }

            driver.quit();
        }

    }