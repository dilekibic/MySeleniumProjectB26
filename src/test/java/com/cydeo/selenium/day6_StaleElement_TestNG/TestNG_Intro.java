package com.cydeo.selenium.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUp(){
        System.out.println("Before Class is Running!");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After Class is Running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before Method is running!");
    }
    @Test (priority = 2)
    public void test1(){
        System.out.println("Test 1 is running....");
        String actual = "apple";
        String expected = "apple";

        //assertequals(actual,expected, is optional : Message will appear only when it fails)
        Assert.assertEquals(actual,expected,"Test did not pass!"); //Static method and it is coming from testNg
}
@AfterMethod
public void SetUpMethod(){
    System.out.println("After Method is running!");
}

@Test (priority = 1)
    public void test2(){
    System.out.println("Test 2 is running....");
    Assert.assertEquals("orange","orange","IT DID NOT PASS!");
}


}
