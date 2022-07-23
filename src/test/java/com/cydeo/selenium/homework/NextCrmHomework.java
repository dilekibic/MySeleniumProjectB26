package com.cydeo.selenium.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextCrmHomework {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
//            3- Verify “remember me” label text is as expected:
                WebElement text = driver.findElement(By.cssSelector("login-item-checkbox-label"));
        String actualText =text.getText();
        //    Expected: Remember me on this computer
        String expectedText ="Remember me on this computer";
        if(actualText.equals(expectedText)){
            System.out.println("Text is passed");
        }else{
            System.out.println("Text is failed");
        }



//4- Verify “forgot password” link text is as expected:
//    Expected: FORGOT  YOUR PASSWORD?
        WebElement forgotPassword = driver.findElement(By.cssSelector("login-link-forgot-pass"));
        String actualForgotText = forgotPassword.getText();
        String expectedForgotText="FORGOT YOUR PASSWORD?";

        if(actualForgotText.equals(expectedForgotText)){
            System.out.println("Forgot Password is Passed");
        }else {
            System.out.println("Forgot Password is Failed");

        }

//            5- Verify “forgot password” href attribute’s value contains expected:
//           Expected: forgot_password=yes
//        WebElement forgotPassHref = driver.findElement(By.cssSelector("a[href='/?forgot_password=yes']"));

        String actualForgotPass = forgotPassword.getAttribute("href");
        String expectedForgotPass = "forgot_password=yes";

        if (actualForgotPass.contains(expectedForgotPass)){
            System.out.println("forgot password href test verification passed!");
        }else {
            System.out.println("forgot password href test verification failed!");
        }


driver.quit();



    }

}
