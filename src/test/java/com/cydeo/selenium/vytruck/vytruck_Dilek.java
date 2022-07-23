package com.cydeo.selenium.vytruck;

import com.cydeo.selenium.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class vytruck_Dilek extends TestBase {


    @Test
    public void VehiclePage() throws InterruptedException {
        /*
    TC - AC1:
    Given the user logged in as a Store manager
    When the user click on vehicle page
    Then the user should see all vehicle information
         */

        driver.get("https://qa2.vytrack.com/");

        WebElement driver1 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        driver1.sendKeys("storemanager213" + Keys.ENTER);

        WebElement password = driver.findElement(By.xpath("//input[@name='_password']"));
        password.sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(3000);
//li[@class='title title-level-1']
        WebElement fleet1 = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleet1.click();
        Thread.sleep(3000);
        WebElement verifyVehicle1 = driver.findElement(By.xpath("//span[.='Vehicles']"));
        verifyVehicle1.click();


        /*
        TC-AC2:
    Given the user logged in as a Sales manager
    When the user click on vehicle page
    Then the click on the Create Car button
    Then user  click on the Cancel button
         */
        Thread.sleep(3000);
        WebElement createCar = driver.findElement(By.xpath("//a[@title='Create Car']"));
        createCar.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='btn back icons-holder-text ']")).click();


        /*
        TC-AC3:
    Given the user logged in as a Sales manager
    When the user click on vehicle page
    Then the user click on the add button to add Vehicle Module
    Then the user click on the add button to add Vehicle Make
         */
        WebElement createCar1 = driver.findElement(By.xpath("//a[@title='Create Car']"));
        createCar1.click();
        Thread.sleep(3000);
        WebElement licensePlate = driver.findElement(By.xpath("//*[@name='custom_entity_type[LicensePlate]']"));
        licensePlate.sendKeys("AF123");
        Thread.sleep(3000);


        WebElement vehicleModel = driver.findElement(By.xpath("(//button[@class='btn btn-medium add-btn'])[1]"));
        vehicleModel.click();
        Thread.sleep(3000);
        WebElement vehicleMake = driver.findElement(By.xpath("(//button[@class='btn btn-medium add-btn'])[2]"));
        vehicleMake.click();

        WebElement clickCheckBox= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        clickCheckBox.click();



//        WebElement addEvent = driver.findElement(By.xpath("//*[@id='container']/div[2]/div[1]/div/div/div[1]/div[1]/div[3]/a"));
//        addEvent.click();
//        Thread.sleep(3000);
//        WebElement createEvent = driver.findElement(By.xpath("//input[@name='oro_calendar_event_form[title]']"));
//        createEvent.sendKeys("Dilek" + Keys.ENTER);



        /*
        TC-AC4:
    Given the user logged in as a Sales manager
    When the user click on vehicle page
    Then the user click on the Edit button
    Then the user click on the Delete button
//         */
//        WebElement createCar2 = driver.findElement(By.xpath("//a[@title='Create Car']"));
//        createCar2.click();
//        Thread.sleep(3000);
//        WebElement licensePlate2 = driver.findElement(By.xpath("//*[@name='custom_entity_type[LicensePlate]']"));
//        licensePlate2.sendKeys("AF123" + Keys.ENTER);
//        WebElement editButton = driver.findElement(By.xpath("//*[@id='container']/div[2]/div[1]/div/div/div[1]/div[1]/div[1]/a"));
//        editButton.click();
//
//
//        WebElement addbtn1 = driver.findElement(By.xpath("(//button[@class='btn btn-medium add-btn'])[2]"));
//        addbtn1.click();
//
/*
        TC-AC5:
        Given the user logged in as a Sales manager
        When the user click on vehicle page
        Then the user click on the Add event button
        Then the user should add event

 */





        }
    }





