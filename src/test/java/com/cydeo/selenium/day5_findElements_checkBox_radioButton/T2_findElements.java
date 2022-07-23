package com.cydeo.selenium.day5_findElements_checkBox_radioButton;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_findElements {
    public static void main(String[] args) {
//        TC #4: FindElements Task
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra time for our driver before it throws NOSUCHELEMENTEXCEPTION

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest ");


//        3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        //all links start with a

//        4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());


//        5- Print out the texts of the links.

        for( WebElement eachlink : allLinks) {
            System.out.println("eachlink.getText() = " + eachlink.getText());
            eachlink.getAttribute("Href values = " +eachlink.getAttribute("href"));

        }




//        6- Print out the HREF attribute values of the links





    }
}
