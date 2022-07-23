package com.cydeo.selenium.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_2 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("Wooden spoon" + Keys.ENTER);


        String expectedTitle ="Wooden spoon | Etsy";
        String actualTitle =driver.getTitle();

        if(actualTitle.contains(expectedTitle)){

            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!");
        }


        driver.quit();
    }
}
