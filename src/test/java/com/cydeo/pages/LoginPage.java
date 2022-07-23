package com.cydeo.pages;

import com.cydeo.selenium.utility.BrowserUtil;
import com.cydeo.selenium.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="ctl00_MainContent_username")
    public WebElement usernameBox;
    @FindBy(name="ctl00$MainContent$password")
    public WebElement passwordBox;
    @FindBy(css= "input[type='submit'][value='Login']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[.='Invalid Login or Password.'")
    public WebElement errorMsgElement;

    //once this constructor is called, it will initialized the value of webelements above.
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //write a method to navigate to login page

    public void goTo(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    //check if we are login page or not
    // return true if login page title match. False if not

    public  boolean isAt(){
        return Driver.getDriver().getTitle().equals("Web Orders Login");
    }

    public void login(String username,String password){
        this.usernameBox.sendKeys(username);
        this.passwordBox.sendKeys(password);
       this.loginButton.click();
}

/*
 check if error message is displayed for wrong credentials
 return true if error msg displayed , false if not
 */
public boolean isLoginErrorPresent(){
//        return errorMsgElement.isDisplayed();
    return BrowserUtil.checkVisibilityOfElement(errorMsgElement,2);
}

}
