package com.cydeo.selenium.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    public static void crm_login(WebDriver driver){

        driver.get("https://login2.nextbasecrm.com/");

        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("marketing59@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();
    }

//    @Test
//    public static void crm_login(WebDriver driver, String username, String password){
//
//        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//        inputUsername.sendKeys(username);
//
//        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
//        inputPassword.sendKeys(password);
//
//        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
//        loginBtn.click();
}