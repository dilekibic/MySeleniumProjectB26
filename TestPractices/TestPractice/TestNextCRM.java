package TestPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNextCRM {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://login2.nextbasecrm.com/");

        Thread.sleep(3000);

        WebElement InvalidUserName = driver.findElement(By.name("USER_LOGIN"));
        InvalidUserName.sendKeys("marketingg59@cybertekschool.com" + Keys.ENTER);
        Thread.sleep(3000);
        WebElement passwordInvalidLogin =driver.findElement(By.name("USER_PASSWORD"));
        Thread.sleep(3000);
        passwordInvalidLogin.sendKeys("UserUser1" + Keys.ENTER);
        Thread.sleep(3000);


        driver.get("http://login2.nextbasecrm.com/");
                WebElement usernameValidLogin = driver.findElement(By.name("USER_LOGIN"));
        Thread.sleep(3000);

        usernameValidLogin.sendKeys("helpdesk59@cybertekschool.com" + Keys.ENTER);
        WebElement passwordValidLogin = driver.findElement(By.name("USER_PASSWORD"));
        Thread.sleep(3000);
        passwordValidLogin.sendKeys("UserUser" + Keys.ENTER);

          driver.quit();
    }

}

