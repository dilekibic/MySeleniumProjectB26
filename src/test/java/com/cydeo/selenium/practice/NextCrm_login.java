package com.cydeo.selenium.practice;

import com.cydeo.selenium.utility.ConfigurationReader;
import com.cydeo.selenium.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NextCrm_login  {
    @Test
    public void crmLogin(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));


                WebElement userName1 = Driver.getDriver().findElement(By.name("USER_LOGIN"));
        userName1.sendKeys(ConfigurationReader.getProperty("username"));


        WebElement passWord1 = Driver.getDriver().findElement(By.name("USER_PASSWORD"));
        passWord1.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn1 =Driver.getDriver().findElement(By.xpath("//input[@value='Log In']"));
        loginBtn1.click();

    }
}