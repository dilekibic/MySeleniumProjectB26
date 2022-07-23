package com.cydeo.selenium.practice;

import com.cydeo.selenium.base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartBearPractice extends TestBase {

    //TC #1: Smartbear software link verification
//1. Open browser
//2. Go to website:
//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    @Test
    public void softwareLinkVerification() throws InterruptedException {


      SmartBearUtils.loginToSmartBear(driver);

//        6. Click on Order
        WebElement orderBtn = driver.findElement(By.xpath("//*[@id='ctl00_menu']/li[3]/a"));
        orderBtn.click();
        Thread.sleep(3000);

//        7. Select familyAlbum from product, set quantity to 2
        WebElement productBtn = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_ddlProduct']/option[2]"));
        productBtn.click();
        Thread.sleep(3000);

        WebElement quantityBtn = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        quantityBtn.sendKeys("2");
        Thread.sleep(3000);

//        8. Click to “Calculate” button

        WebElement calculateBtn = driver.findElement(By.xpath("//input[@class='btn_dark']"));

                calculateBtn.click();

        //*[@id='ctl00_MainContent_fmwOrder']/tbody/tr/td/ol[1]/li[5]/input[2]"));

//        9. Fill address Info with JavaFaker
        //• Generate: name, street, city, state, zip code


        Faker faker = new Faker();
        WebElement customerName = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_txtName']"));
        customerName.sendKeys(faker.name().fullName());
Thread.sleep(3000);
        WebElement street = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        street.sendKeys(faker.address().streetAddress());
        Thread.sleep(3000);
        WebElement city= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        city.sendKeys(faker.address().city());
        Thread.sleep(3000);
        WebElement state= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        state.sendKeys(faker.address().state());
        Thread.sleep(3000);
        WebElement zipcode = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
        zipcode.sendKeys(faker.numerify("#####"));
        Thread.sleep(3000);

//        10. Click on “visa” radio button
        WebElement visaBtn = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        visaBtn.click();

//        11. Generate card number using JavaFaker

        WebElement cardNumber = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
        cardNumber.sendKeys(faker.numerify("################"));
        Thread.sleep(3000);


        WebElement expDate = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
        expDate.sendKeys("12/25");
//        12. Click on “Process”
        WebElement processBtn = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        processBtn.click();


//        13. Verify success message “New order has been successfully added.”

        WebElement resultText = driver.findElement(By.xpath("//strong"));
        System.out.println(resultText.getText());
        Assert.assertEquals(resultText.getText(),"New order has been successfully added.");



    }
}











