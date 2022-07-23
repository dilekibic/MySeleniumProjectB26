package com.cydeo.selenium.Self_Practice;

import com.cydeo.selenium.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadioButtonPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("https://practice.cydeo.com/radio_buttons");

        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement  blueRadioButton = driver.findElement(By.id("blue"));
        System.out.println("Before clicking blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        blueRadioButton.click();
        System.out.println("After clicking blueRadioButton.isSelected() = " + blueRadioButton.isSelected());



        Thread.sleep(3000);

        //click on red radio button

        WebElement redRadioButton = driver.findElement(By.id("red"));
        System.out.println("Before clicking " + redRadioButton.isSelected());
        redRadioButton.click();
        System.out.println("After clicking " + redRadioButton.isSelected());

        Thread.sleep(3000);
        //click on yellow button

        WebElement yellowRadioButton = driver.findElement(By.id("yellow"));
        System.out.println("Before clicking " + yellowRadioButton.isSelected());
        yellowRadioButton.click();
        System.out.println("After clicking " + yellowRadioButton.isSelected());

        //check blue button is not selected
        Thread.sleep(3000);
        System.out.println("After selecting red blueRadioButton.isSelected() = " + blueRadioButton.isSelected());


        // Identify green radio button

        WebElement greenRadioButton = driver.findElement(By.id("green"));
        greenRadioButton.click();

        System.out.println("greenRadioButton isSelected() = " + greenRadioButton.isSelected());
        System.out.println("greenRadioButton isEnabled() = " + greenRadioButton.isEnabled());

    }
}
