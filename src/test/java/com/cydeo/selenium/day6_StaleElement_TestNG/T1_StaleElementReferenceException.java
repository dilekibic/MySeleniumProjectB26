package com.cydeo.selenium.day6_StaleElement_TestNG;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementReferenceException {
    //    TC #1: StaleElementReferenceException handling
//1. Open Chrome browser
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra time for our driver before it throws NoSuchElementException

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//2. Go to https://practice.cydeo.com/add_remove_elements/

        driver.get("https://practice.cydeo.com/add_remove_elements/");

// 3. Click to “Add Element” button

        WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));


//            4. Verify “Delete” button is displayed after clicking.
        addElementBtn.click();
        WebElement deleteBtn = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deletebtn.isDisplayed()=" + deleteBtn.isDisplayed());

//5. Click to “Delete” button.
        deleteBtn.click();

//6. Verify “Delete” button is NOT displayed after clicking.
//        System.out.println("deleteBtn.isDisplayed()" + deleteBtn.isDisplayed());

        try{
            System.out.println("deleteBtn.isDisplayed()" + deleteBtn.isDisplayed());

        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown!");
            System.out.println("This means web element is completely deleted from the page and html");


        }



    }
}