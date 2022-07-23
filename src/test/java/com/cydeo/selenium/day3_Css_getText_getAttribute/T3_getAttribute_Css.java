package com.cydeo.selenium.day3_Css_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_Css {
    public static void main(String[] args) {
//        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");


//        3- Verify “Log in” button text is as expected:
//        Expected: Log In
//        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
//        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));


        String expectedButtonText = "Log In";
        String actualButtonText = loginButton.getAttribute("value");

        if(actualButtonText.equals(expectedButtonText)){
            System.out.println("Log in Button text verification is passed!");
        }else{
            System.out.println("Log in Button text verification is failed!");
        }
            driver.quit();
    }
}
