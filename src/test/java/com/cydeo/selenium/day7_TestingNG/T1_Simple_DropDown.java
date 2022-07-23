package com.cydeo.selenium.day7_TestingNG;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Simple_DropDown {
    WebDriver driver;

//    TC #1: Verifying “Simple dropdown” and “State selection”
//    dropdown default values


    //1. Open Chrome browser
    //2. Go to //2. Go to https://practice.cydeo.com/dropdown

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }


    //   3. Verify “Simple dropdown” default selected value is correct
//    Expected: “Please select an option”
    @Test
    public void dropDownTest() {

        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        String actualDefaultSimpleDropDown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedDefaultSimpleDropDown = "Please select an option";
        Assert.assertEquals(actualDefaultSimpleDropDown, expectedDefaultSimpleDropDown);
    }


    //            4. Verify “State selection” default selected value is correct
//              Expected: “Select a State”
    @Test
    public void StateDropDownTest() {

        Select stateDropDown = new Select(driver.findElement(By.id("state")));
        String actualStateDefaultText = stateDropDown.getFirstSelectedOption().getText();
        String expectedStateDefaultText = "Select a state";
        Assert.assertEquals(actualStateDefaultText, expectedStateDefaultText);

    }


    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
