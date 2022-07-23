package com.cydeo.selenium.day7_TestingNG;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_Simple_Dropdown {

    WebDriver driver;
//    1. Open Chrome browser


    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }


       @Test
    public void stateDropdownTest() throws InterruptedException {
           Select stataDropdown = new Select(driver.findElement(By.id("state")));

           //        3. Select Illinois with selectbyValue()
           Thread.sleep(3000);
           stataDropdown.selectByValue("IL");


//          4. Select Virginia with selectByVisibleText()
           Thread.sleep(3000);
           stataDropdown.selectByVisibleText("Virginia");


//          5. Select California with selectByIndex
           Thread.sleep(3000);
           stataDropdown.selectByIndex(5);

//          6. Verify final selected option is California.
//           USE ALL select option (visible text, value, index)
           //getFirstSelectedOption() method will return to current selected option

           String actualSelectOption = stataDropdown.getFirstSelectedOption().getText();
           String expectedSelectOption = "California";


           Assert.assertEquals(actualSelectOption,expectedSelectOption, "Selected option verification is failed!");
           //OR YOU CAN DO

       //    Assert.assertEquals(stataDropdown.getFirstSelectedOption().getText(),"California", "Selected option verification is failed!");

       }}



