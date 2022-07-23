package com.cydeo.selenium.ShortVideoPractices;

import com.cydeo.selenium.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables_Practice extends TestBase {

    @Test
    public void webTablesTest(){
        driver.get("https://practice.cydeo.com/tables");

        //print out Jason from row and cell number

        WebElement row3Cell2 = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("Before clicking First Name: " + row3Cell2.getText());

        WebElement firstName = driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();
        row3Cell2 = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("After clicking First name: " + row3Cell2.getText());

        //print out the Jason from text

        WebElement JasonCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println(JasonCell.getText());

        //print out all cell in row 3

        List<WebElement> allRow3Cells = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));

        for(WebElement eachCell: allRow3Cells){
            System.out.println(eachCell.getText());
        }

    }
}
