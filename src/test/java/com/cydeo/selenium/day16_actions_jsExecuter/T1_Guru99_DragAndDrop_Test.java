package com.cydeo.selenium.day16_actions_jsExecuter;

import com.cydeo.selenium.utility.ConfigurationReader;
import com.cydeo.selenium.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Guru99_DragAndDrop_Test {

    @Test
    public void guru99_dragAndDrop_Test() throws InterruptedException {

        //    1- Open a chrome browser
//    2- Go to: https://demo.guru99.com/test/drag_drop.html
        Driver.getDriver().get(ConfigurationReader.getProperty("guru99_dropdown.url"));
//    3- Drag “BANK” and drop into Account area under Debit Side
        WebElement bank = Driver.getDriver().findElement(By.partialLinkText("BANK"));
        WebElement debitAccount =Driver.getDriver().findElement(By.id("bank"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(bank,debitAccount).perform();

//    4- Drag “5000” and drop into Amount area under Debit Side
      WebElement fiveK = Driver.getDriver().findElement(By.linkText("5000"));
      WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7"));
      actions.dragAndDrop(fiveK,debitAmount).perform();

//    5- Drag “SALES” and drop into Account area under Credit Side
     WebElement Sales = Driver.getDriver().findElement(By.linkText("SALES"));
     WebElement saleAccount = Driver.getDriver().findElement(By.id("loan"));
     actions.dragAndDrop(Sales,saleAccount).perform();
//    6- Drag “5000” and drop into Amount area under Credit Side
        WebElement fiveK2 = Driver.getDriver().findElement(By.linkText("5000"));
        WebElement debitAmount2 = Driver.getDriver().findElement(By.id("amt8"));
        actions.dragAndDrop(fiveK2,debitAmount2).perform();


//    7- Verify “Perfect!” text displayed.

        WebElement resultMsg = Driver.getDriver().findElement(By.xpath("//*[@id='equal']/a"));
        System.out.println(resultMsg.getText());
        Assert.assertEquals(resultMsg.getText(),"Perfect!");





    }


}
