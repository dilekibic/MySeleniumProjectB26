package com.cydeo.selenium.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextCRM {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://login2.nextbasecrm.com/");

        Thread.sleep(3000);

        WebElement NextCRmLinkText = driver.findElement(By.linkText("USER_LOGIN"));
        NextCRmLinkText.click();
    }

}
