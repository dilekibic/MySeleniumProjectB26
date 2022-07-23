package com.cydeo.selenium.practice;

import com.cydeo.selenium.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gas_Mileage_Practice extends TestBase {

    @Test
    public void gasMileCalculator() throws InterruptedException {
//    Task #: Gas Mileage Calculator Automation Test
//
//1. Add a new class GasMileageCalculatorTest
//2. Go to https://www.calculator.net

    driver.get("https://www.calculator.net");

//            3. Search for “gas mileage” using search box

        driver.findElement(By.xpath("//input[@id='calcSearchTerm']")).sendKeys("gas mileage");
            Thread.sleep(3000);

//4. Click on the “Gas Mileage Calculator” link
        driver.findElement(By.cssSelector("a[href='/gas-mileage-calculator.html']")).click();

//5. On Next page verify:
//    a. Title equals: “Gas Mileage Calculator”
//    b. “Gas Mileage Calculator” label is displayed


        WebElement verification = driver.findElement(By.xpath("//h1[.='Gas Mileage Calculator']"));
        Assert.assertTrue(verification.isDisplayed(), "Gas mileage Calculator is verified");
//6. Locate, clear and type “7925” into “Current odometer” field
        WebElement currentOdometer = driver.findElement(By.xpath("//input[@id='uscodreading']"));
        currentOdometer.clear();

        WebElement newOdometer = driver.findElement(By.xpath("//input[@id='uscodreading']"));
            newOdometer.sendKeys("7925");

        //7. Locate, clear and type “7550” into “Previous odometer” field

 WebElement previousOdometer = driver.findElement(By.xpath("//input[@id='uspodreading']"));
 previousOdometer.clear();

 WebElement newOdometer2 = driver.findElement(By.xpath("//input[@id='uspodreading']"));
 newOdometer2.sendKeys("7550");

        //8. Locate, clear and type “16” into “Gas added” field
        WebElement gasAdd= driver.findElement(By.xpath("//input[@id='usgasputin']"));
       gasAdd.clear();

        WebElement gasAdd1 = driver.findElement(By.xpath("//input[@id='usgasputin']"));
        gasAdd1.sendKeys("16");
        //9. Locate, clear and type “3.55” into “Gas price” field

        WebElement gasPrice= driver.findElement(By.xpath("//input[@id='usgasprice']"));
        gasPrice.clear();

        WebElement gasPrice1 = driver.findElement(By.xpath("//input[@id='usgasprice']"));
        gasPrice1.sendKeys("3.55");
        //10. Click on Calculate button
        WebElement calculateBtn = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateBtn.click();

        //11. Verify mpg value is as expected:
//    Expected value: “23.44 mpg”

        WebElement gasTitle = driver.findElement(By.xpath("//p[@class='verybigtext']"));

        Assert.assertTrue(gasTitle.isDisplayed(), "23.44 mpg");
    }










}
