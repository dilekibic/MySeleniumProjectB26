package com.cydeo.selenium.day17_pom_syncronization;

import com.cydeo.pages.LoginPage;
import com.cydeo.selenium.base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Pom_WebOrderTest extends TestBase {


    @Test
    public void testValidLogin() {


        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        assertTrue(loginPage.isAt());
        loginPage.login("Test", "test");

    }

       @Test

       public void testInvalidLogin(){
           LoginPage loginPage = new LoginPage();
           loginPage.goTo();
            assertTrue(loginPage.isAt());
           loginPage.login("WRONG","test");
           assertTrue(loginPage.isLoginErrorPresent(), "Login error message was not present");

        }}



//        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//
//        LoginPage loginPage = new LoginPage();
//        loginPage.usernameBox.sendKeys("Tester");
//        loginPage.passwordBox.sendKeys("test");
//        loginPage.loginButton.click();





