package com.cydeo.selenium.day7_TestingNG;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGSelenium {
    public static class testNGSelenium {

        WebDriver driver;

        @BeforeMethod
        public void setUpMethod(){

            // set up chrome and create WebDriver instance
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            //Providing extra time for our driver before it throws NoSuchElementException
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @Test
        public void googleTitle(){

            // Get "https://google.com/"
            driver.get("https://google.com");

            // Assert: title is  "Google"
            String actualTitle = driver.getTitle();
            String expectedTitle ="Google";
            Assert.assertEquals(actualTitle,expectedTitle, "Title Verification is failed!");
        }
    }
}

