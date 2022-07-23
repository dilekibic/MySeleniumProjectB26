package com.cydeo.selenium.day17_pom_syncronization;

import com.cydeo.pages.DynamicallyLoadedPage7;
import com.cydeo.selenium.utility.Driver;
import org.testng.annotations.Test;

public class DynamicallyLoadedTest {


    @Test
    public void dynamically_load_page_7() {

//            1. Go to https://practice.cydeo.com/dynamic_loading/7

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        DynamicallyLoadedPage7 dynamicallyLoadedPage7 = new DynamicallyLoadedPage7();

//            2. Wait until title is “Dynamic title”
//            3. Assert: Message “Done” is displayed.
//            4. Assert: Image is displayed.


    }}
