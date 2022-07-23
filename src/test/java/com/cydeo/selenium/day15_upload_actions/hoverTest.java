package com.cydeo.selenium.day15_upload_actions;

import com.cydeo.selenium.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class hoverTest extends TestBase {

    @Test
    public void hoverTest(){

        driver.get("http://practice.cydeo.com/hovers");

        WebElement img1 = driver.findElement(By.xpath("(//img)[1]"));
        WebElement img1Text = driver.findElement(By.xpath("//h5[text()='name: user1']"));

        Actions actions=new Actions(driver);

        actions.moveToElement(img1).perform();
        Assert.assertTrue(img1Text.isDisplayed());

        List<WebElement> images = driver.findElements(By.tagName("img"));
        for(WebElement image :images){
            actions.moveToElement(image).pause(2000).perform();

        }




    }
}
