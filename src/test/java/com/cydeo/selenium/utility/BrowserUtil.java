package com.cydeo.selenium.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BrowserUtil {
    public static boolean checkVisibilityOfElement(By locator, int timeToWait) {

        boolean result = false;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWait);
        try {
            wait.until(visibilityOfElementLocated(locator));
            result = true;
            System.out.println("Element was visible withing the timeframe");
        } catch (TimeoutException e) {
            System.out.println("Element was not visible within the timeframe" + e.getMessage());
        }
        return result;
    }

    public static boolean checkVisibilityOfElement(WebElement element, int timeToWait) {

        boolean result = false;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWait);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            result = true;
            System.out.println("Element was visible withing the timeframe");
        } catch (TimeoutException e) {
            System.out.println("Element was not visible within the timeframe" + e.getMessage());
        }
        return result;
    }
}