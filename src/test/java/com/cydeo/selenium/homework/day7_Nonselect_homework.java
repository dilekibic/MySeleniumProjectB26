package com.cydeo.selenium.homework;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day7_Nonselect_homework {
    WebDriver driver;
//    TC : Selecting value from non-select dropdown


    @BeforeMethod
    public void setUp() {
        //1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");
    }
        //3. Click to non-select dropdown

        @Test
    public void nonSelectDropDown() throws InterruptedException {

            WebElement dropDownLinkButton = driver.findElement(By.xpath("//a[@role='button']"));
            Thread.sleep(3000);
            dropDownLinkButton.click();

            //4. Select Facebook from dropdown
        WebElement selectFacebook = driver.findElement(By.xpath("//a[.='Facebook']"));
        Thread.sleep(3000);
        selectFacebook.click();

//5. Verify title is “Facebook - log in or sign up”

            String expectedTitle = "Facebook";
            String actualTitle = driver.getTitle();

            Assert.assertTrue(actualTitle.contains(expectedTitle));
//
//            *Remember: If there is no <select>  tag, it is called HTML
//    dropdown and We handle just as any other web
//    element. We locate. We click.

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
