package com.cydeo.selenium.nextBaseCrm;

import com.cydeo.selenium.base.TestBase;
import com.cydeo.selenium.utility.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nextBaseCrmSearch extends TestBase {

    @Test
    public void searchpeople (){


        CRM_Utilities.crm_login(driver);

//        1. Verify users can search a valid info from search box. (employee, doc, post, etc)
//        2. Verify users get menu item and suggested modules when they type in the box.
        WebElement searchBtn = driver.findElement(By.xpath("//input[@id='search-textbox-input']"));
        searchBtn.sendKeys("employee");

        WebElement menu = driver.findElement(By.xpath("//div[@class='search-title-top-result']"));
        Assert.assertTrue(menu.isDisplayed());

    }
}
