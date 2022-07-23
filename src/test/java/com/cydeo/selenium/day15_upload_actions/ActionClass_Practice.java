package com.cydeo.selenium.day15_upload_actions;

import com.cydeo.selenium.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionClass_Practice extends TestBase {

    @Test
    public void dragAndDrop(){

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle=driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        //actions.dragAnddrop(smallCircle,bigCircle).perform();
        actions.moveToElement(smallCircle).pause(1000)
                .clickAndHold().pause(1000)
                .moveToElement(bigCircle).pause(1000)
                .release().perform();


        Assert.assertEquals(bigCircle.getText(),"You did great!");

    }
}
