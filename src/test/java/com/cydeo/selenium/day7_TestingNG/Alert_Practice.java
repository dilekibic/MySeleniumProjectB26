package com.cydeo.selenium.day7_TestingNG;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert_Practice {

    WebDriver driver;

    @BeforeMethod
            public void SetUpMethod(){
 //     1. Open browser
 //     2. Go to website: http://practice.cydeo.com/javascript_alerts

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void InformationAlertTest(){
//            3. Click to “Click for JS Alert” button

        WebElement javaScriptAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        javaScriptAlertButton.click();

//            4. Click to OK button from the alert

        Alert alert  = driver.switchTo().alert();    //SYNTAX FOR ALERT
        alert.accept();

//            5. Verify “You successfully clicked an alert” text is displayed.

    WebElement resultText = driver.findElement(By.id("result"));
        Assert.assertTrue(resultText.isDisplayed());

        String actual = resultText.getText();
        String expected = "You successfully clicked an alert";

        Assert.assertEquals(actual, expected,"ResultText did not appeared correctly!");




    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
