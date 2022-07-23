package com.cydeo.selenium.practice;

import com.cydeo.selenium.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NextCrm_2 extends TestBase {
    @Test
    public void message() throws InterruptedException {

        driver.get("https://login2.nextbasecrm.com/");


        WebElement userName = driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("hr59@cybertekschool.com" + Keys.ENTER);

        Thread.sleep(3000);

        WebElement passWord = driver.findElement(By.name("USER_PASSWORD"));
        passWord.sendKeys("UserUser" + Keys.ENTER);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();


        WebElement message =driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']//span[.='Message']"));
        message.click();


    }
}
