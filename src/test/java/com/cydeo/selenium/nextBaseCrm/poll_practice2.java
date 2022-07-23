package com.cydeo.selenium.nextBaseCrm;

import com.cydeo.selenium.base.TestBase;
import com.cydeo.selenium.utility.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class poll_practice2 extends TestBase {
//1.Verify users can clock in
//2. Verify users can clock out.
//3. Verify users can edit Today's task under daily plan.
//4. Verify users can add events.
//5. Verify users can edit work day starting and ending time.
//(hour change buttons are webtable, great practice)


    @Test

    public void workHours() throws InterruptedException {

        CRM_Utilities.crm_login(driver);

        WebElement clock = driver.findElement(By.xpath("//span[@id='timeman-status-block']/i"));
        clock.click();

        WebElement clockIn = driver.findElement(By.xpath("//span[@class='webform-small-button-text']"));
        clockIn.click();

        Thread.sleep(2000);
        WebElement clockOut = driver.findElement(By.xpath("//span[@class='webform-small-button-text']"));
        clockOut.click();

        Thread.sleep(2000);

        WebElement newTab = driver.findElement(By.xpath("//input[@class='tm-popup-task-form-textbox']"));
        newTab.sendKeys("New Icon");

        Thread.sleep(2000);

        WebElement newTask = driver.findElement(By.xpath("//span[@class='tm-popup-task-form-submit']"));
        newTask.click();

        Thread.sleep(2000);

        WebElement newEvent = driver.findElement(By.xpath("//input[@class='tm-popup-event-form-textbox_am_pm']"));
        newEvent.sendKeys("Party");

        WebElement eventClick = driver.findElement(By.xpath("//span[@class='tm-popup-event-form-submit']"));
        eventClick.click();

        Thread.sleep(2000);

        WebElement editWork = driver.findElement(By.xpath("//span[@class='tm-popup-notice-pencil']"));
        editWork.click();

        Thread.sleep(2000);

//        WebElement time = driver.findElement(By.xpath("//div[@id='tm_18025_clock']/div[2]/table[1]/tbody/tr[1]/td[1]/input"));
//        time.click();


        Thread.sleep(2000);
    }

}
