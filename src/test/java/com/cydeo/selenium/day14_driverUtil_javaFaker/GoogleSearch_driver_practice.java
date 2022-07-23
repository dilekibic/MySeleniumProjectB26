package com.cydeo.selenium.day14_driverUtil_javaFaker;

import com.cydeo.selenium.utility.ConfigurationReader;
import com.cydeo.selenium.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch_driver_practice {

    @Test
    public void google_search_driver_practice(){

        // Go to "https://www.google.com/"
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
//        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver)           Driver.getDriver()).getSessionId());

        // Write “apple” in search box
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
//        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver)         Driver.getDriver()).getSessionId());
        searchBox.sendKeys("apple" + Keys.ENTER);

        // Verify title:
        //Expected: apple - Google Search
        String actualTitle = Driver.getDriver().getTitle();
//        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver)         Driver.getDriver()).getSessionId());
        String expectedTitle= "apple - Google Search";
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
