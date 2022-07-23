package com.cydeo.selenium.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextBaseCrmHmw_2 {
    public static void main(String[] args) throws InterruptedException {


//        TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

//        3- Enter incorrect username into login box:
        WebElement userName = driver.findElement(By.className("login-inp"));
        userName.sendKeys("DilekSen");

        Thread.sleep(3000);

//        4- Click to Reset password button
        WebElement clickReset = driver.findElement(By.className("login-btn"));
        clickReset.click();

//        5- Verify “error” label is as expected
//        Expected: Login or E-mail not found
        WebElement textError = driver.findElement(By.className("errortext"));
        String actualText = textError.getText();
        String expectText ="Login or E-mail not found";

        if(actualText.equals(expectText)){
            System.out.println("Error is Passed");
        }else{
            System.out.println("Error is Failed");
        }
    }
}

