package com.cydeo.selenium.vytruck;

import com.cydeo.selenium.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verify_odometer extends TestBase {

        /*
        Given the driver is on a Quick Launchpad page
        When the driver clicks on Fleet tab
        And navigate to vehicles  Odometer sub-tab.
        Then you will be able to see Vehicle Odometer  page
         */
        @BeforeMethod
        public void setUp(){
            driver.get("https://qa2.vytrack.com/");
            WebElement driver1 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
            driver1.sendKeys("user180" + Keys.ENTER);

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


        /*

Given the driver is on a Quick Launchpad page
When the driver clicks on Fleet tab
And navigate to vehicles  Odometer sub-tab.
Then you will be able to see Vehicle Odometer  page
And truck driver able to see all vehicle odometer informations
on the grid.
     */

            WebElement text = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));
            Thread.sleep(3000);
//        Assert.assertEquals(text.getText(),"Vehicles Odometers","Vehicles Odometers Test is Failed");
//Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@name='custom_entity_type[OdometerValue]']")).sendKeys("15000" + Keys.ENTER);

            driver.findElement(By.xpath("//a[@title='Delete Vehicle Odometer']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@class='btn ok btn-danger']")).click();

/*

Then you will verify "https://qa2.vytrack.com/entity/Extend%5CEntity%5CVehiclesOdometer" url on the page.

 */
//       Assert.assertEquals(driver.getCurrentUrl(),"https://qa2.vytrack.com/entity/Extend%5CEntity%5CVehiclesOdometer","URL is Failed");


       /*
       Given the driver is on a Quick Launchpad page
When the driver clicks on Fleet tab
And navigate to vehicles  Odometer sub-tab.
And click on the "Grid Setting" icon
And select id and close Grid Settings window
And click Reset icon next to Grid Settings.
Then you click Grid Settings icon
And verify Grid setting is reseted

        */
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@title='Grid Settings']")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("//input[@id='column-c1039']")).click();
            driver.findElement(By.xpath("//a[@title='Grid Settings']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@title='Reset']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@title='Grid Settings']")).click();

            WebElement isDisplayedId =driver.findElement(By.xpath("//input[@id='column-c1039']"));
            if(!isDisplayedId.isSelected()){
                System.out.println("Test is passed");
            }
            else{
                System.out.println("Test is failed");
            }
        }



    }
