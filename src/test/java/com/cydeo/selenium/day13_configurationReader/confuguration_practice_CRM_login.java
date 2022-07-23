package com.cydeo.selenium.day13_configurationReader;

import com.cydeo.selenium.base.TestBase;
import com.cydeo.selenium.utility.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class confuguration_practice_CRM_login extends TestBase {

    @Test
    public void login_crm_app(){
//
        //driver.get("https://login2.nextbasecrm.com/");
      driver.get(ConfigurationReader.getProperty("env"));

//        3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        //inputUsername.sendKeys("hr1@cydeo.com");
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));


//        4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        //inputPassword.sendKeys("UserUser");
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));


//        5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

//        6. Verify title is as expected:
//        Expected: Portal
        //    BrowserUtils.verifyTitle(driver,"(1) Portal");

    }
}

