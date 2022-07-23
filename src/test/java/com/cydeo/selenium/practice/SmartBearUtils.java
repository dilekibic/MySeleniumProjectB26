package com.cydeo.selenium.practice;

import com.cydeo.selenium.utility.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {

    public static void loginToSmartBear(WebDriver driver){



        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");
//3. Enter username: “Tester”
        WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys(ConfigurationReader.getProperty("username1"));
//4. Enter password: “test”
        WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passWord.sendKeys(ConfigurationReader.getProperty("password1"));
//5. Click to Login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='button']"));
        loginBtn.click();
    }
}
