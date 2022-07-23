package com.cydeo.selenium.Self_Practice;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_pr1 {
    public static void main(String[] args) {

        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("https://google.com");

       // search for cydeo

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("cydeo" + Keys.ENTER);

        //verify Cydeo linktext is appeared in the result

        WebElement cydeotext = driver.findElement(By.xpath("//h3[.='Cydeo']"));
        ////div[@class='yuRUbf']//h3[.='Cydeo'] another way of taking
         if(cydeotext.getText().equals("Cydeo")){
             System.out.println("Passed!");
         }else{
             System.out.println("Failed!");
         }
         driver.quit();

    }
}
