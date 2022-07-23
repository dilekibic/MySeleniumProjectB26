package com.cydeo.selenium.homework;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class day6_Stale_Homework {
    //Open a chrome browser
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Go to: https://practice.cydeo.com/abtest

        driver.get("https://practice.cydeo.com/abtest");

        // Locate "CYDEO" link , verify it is displayed.

        WebElement CydeoLink = driver.findElement(By.xpath("//a[@ href=\"https://cydeo.com/\"]"));
        CydeoLink.isDisplayed();

        //Refresh the page

        driver.get("https://practice.cydeo.com/abtest");
        driver.navigate().refresh();

        //Verify it is displayed, again

//        WebElement CydeoLinkDisplayed = driver.findElement(By.xpath("//a[@target ='_blank']"));
//        CydeoLink.isDisplayed();

    try {
        WebElement CydeoLinkDisplayed = driver.findElement(By.xpath("//a[@target ='_blank']"));
        CydeoLink.isDisplayed();

        } catch(StaleElementReferenceException e){


            System.out.println("Stale Element Reference Exception is thrown!");

        }


driver.close();

}}
