package com.cydeo.selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.cydeo.selenium.utility.WebDriverFactory.getDriver;

public class day6_Etsy_Homework {

    //1. Go to https://www.etsy.com
    WebDriver driver;

    @BeforeClass
    public void start() {
        driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");
    }
    //2. Search for “wooden spoon'
        @Test
        public void etsyPage() throws InterruptedException {
        WebElement searchWoodenSpoon= driver.findElement(By.xpath("//input[@data-id='search-query']"));
        searchWoodenSpoon.sendKeys("wooden spoon" + Keys.ENTER);

    //3. Click on filters

        WebElement filter = driver.findElement(By.xpath("//span[@class='wt-hide-xs wt-show-md filter-expander']"));
        filter.click();

//        4. Select free shipping

        WebElement selectFreeShipping = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        selectFreeShipping.click();

 //       4.Select on Sale
        WebElement SelectOnSale = driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
        SelectOnSale.click();

//        5. Select under $25 Click on apply filters

        WebElement selectUnder25 = driver.findElement(By.xpath("//label[@for='price-input-1']"));
        selectUnder25.click();

        WebElement apply = driver.findElement(By.xpath("//button[@aria-label='Apply']"));
        apply.click();


//            6. Print count of results

            Thread.sleep(3000);
        WebElement results = driver.findElement(By.xpath("//span[@class='wt-display-inline-flex-sm']"));
        String actualResult = results.getText();
        System.out.println("actualResult = " + actualResult);


    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

}



