package com.cydeo.selenium.homework;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework_Alev {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() throws InterruptedException {
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://qa2.vytrack.com/");
        WebElement driver1 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        driver1.sendKeys("storemanager213" + Keys.ENTER);

        WebElement password = driver.findElement(By.xpath("//input[@name='_password']"));
        password.sendKeys("UserUser123" + Keys.ENTER);

    }

        @Test
        public void OdometerPage() throws InterruptedException {

            WebElement fleet = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
            fleet.click();

            Thread.sleep(3000);

            WebElement odometer = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
            odometer.click();
            Thread.sleep(3000);


            WebElement text = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));
            Assert.assertEquals(text.getText(), "Vehicles Odometers", "Vehicles Odometers Test is Failed");

            driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();

            driver.findElement(By.xpath("//input[@name='custom_entity_type[OdometerValue]']")).sendKeys("15000" + Keys.ENTER); // id attribute was dynamic


            driver.findElement(By.xpath("//a[@title='Delete Vehicle Odometer']")).click();
            driver.findElement(By.xpath("//a[@class='btn ok btn-danger']")).click();



        }}









