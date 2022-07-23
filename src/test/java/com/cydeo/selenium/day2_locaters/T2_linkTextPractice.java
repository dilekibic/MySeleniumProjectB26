package com.cydeo.selenium.day2_locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_linkTextPractice {
   /*
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Click to A/B Testing from top of the list.
4- Verify title is:
    Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
    Expected: Practice */



    public static void main(String[] args) throws InterruptedException {
 //1. OPEN A CHROME BROWSER
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
//2. GO TO: https://practice.cydeo.com

        driver.get("https://practice.cydeo.com");

       Thread.sleep(3000);

//3. Click to A/B Testing from top of the list. <a href a>  <a anchor tag and used link text as locater
        WebElement abLinkText = driver.findElement(By.linkText("A/B Testing"));
        abLinkText.click();

        //finding element above and store in Web element. A/B Testing is WEB ELEMENT

       Thread.sleep(3000);

/*4- Verify title is:
   Expected: No A/B Test*/

        String expectedTitle ="No A/B Test";
        String actualTitle =driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!");
        }

//5- Go back to home page by using the .back();

            driver.navigate().back();

//6- Verify title equals:
//    Expected: Practice

        expectedTitle ="Practice";
        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Practice Title Verification passed!");
        }else{
            System.out.println("Practice Title Verification failed!");
        }

        driver.quit();
    }
}
