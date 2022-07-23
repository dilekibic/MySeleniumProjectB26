package com.cydeo.selenium.nextBaseCrm;

import com.cydeo.selenium.base.TestBase;
import com.cydeo.selenium.utility.CRM_Utilities;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NextCrmPoll extends TestBase {

   @Test
    public void crmPoll(){

       CRM_Utilities.crm_login(driver);

//       1. Verify users can write a poll message title with question & answer.

       WebElement poll = driver.findElement(By.xpath("//div[@id='feed-add-post-form-tab']//following::span[.='Poll']/span"));
       poll.click();

       Faker faker = new Faker();

//       WebElement pollMessage = driver.findElement(By.xpath("//input[@id='question_0']"));


       WebElement pollAnswer = driver.findElement(By.xpath("//input[@id='answer_0__0_']"));

//       2. Verify users can check "allow multiple Choice"

      WebElement allowMultipleChoice = driver.findElement(By.xpath("//input[@id='multi_0']"));
      allowMultipleChoice.isSelected();

//       3. Verify users can add questions
//       4. Verify users can cancle poll

   }
}
