package com.cydeo.selenium.practice;

import com.cydeo.selenium.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBear_practice1 extends TestBase {
    //TC #1: Smartbear software link verification
//1. Open browser
//2. Go to website:
//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    @Test
    public void softwareLinkVerification() throws InterruptedException {


      SmartBearUtils.loginToSmartBear(driver);
//3. Enter username: “Tester”
//        WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
//        userName.sendKeys(ConfigurationReader.getProperty("username1"));
////4. Enter password: “test”
//        WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
//        passWord.sendKeys(ConfigurationReader.getProperty("password1"));
////5. Click to Login button
//        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='button']"));
//        loginBtn.click();



//                List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("The number of link is " + links.size());


        SmartBearUtils.loginToSmartBear(driver);

//6. Print out count of all the links on landing page

        List<WebElement> links = driver.findElements(By.tagName("a"));

        //7. Print out each link text on this page

        int count = 0;
        for(WebElement eachLinklist : links){


            System.out.println("The number of link is "+ count);


        }}}

