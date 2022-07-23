package com.cydeo.selenium.homework;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day7_dropdown_homework {
    WebDriver driver;
//
//    TC : Selecting date on dropdown and verifying
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");
    }
//            3. Select “December 1st, 1923” and verify it is selected.

    @Test
    public void selectDayMonthYear() throws InterruptedException {
        Select selectYears = new Select(driver.findElement(By.id("year")));
        Thread.sleep(3000);
        selectYears.selectByVisibleText("1923");
        Assert.assertEquals(selectYears.getFirstSelectedOption().getText(),("1923"), "FAILED!");



        Select selectMonth = new Select(driver.findElement(By.id("month")));
        Thread.sleep(3000);
        selectMonth.selectByValue("11");
        Assert.assertEquals(selectMonth.getFirstSelectedOption().getText(),("December"),"FAILED!");

        Select selectDay = new Select(driver.findElement(By.id("day")));
        Thread.sleep(3000);
        selectDay.selectByIndex(0);
        String actualSelectOption = selectDay.getFirstSelectedOption().getText();
        String expectedSelectOption ="1";
        Assert.assertEquals(actualSelectOption,expectedSelectOption);


////    Select year using   : visible text
////    Select month using    : value attribute Select
////    day using : index number

}
@AfterMethod
    public void tearDown(){
        driver.close();
}

}
