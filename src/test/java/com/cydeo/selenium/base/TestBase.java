package com.cydeo.selenium.base;

import com.cydeo.selenium.utility.ConfigurationReader;
import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;


    @BeforeMethod
    public void setUp() {
        //driver= WebDriverFactory.getDriver("chrome");
        //        1. Open chrome browser
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions = new Actions(driver);

        wait=new WebDriverWait(driver,10);
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }


    }


//    @AfterMethod
//    public void tearDownMethod() {
//        driver.quit();
//    }
