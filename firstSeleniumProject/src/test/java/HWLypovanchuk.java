import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HWLypovanchuk {
    WebDriver wd;

    @BeforeMethod
    public void setup() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void wikiTest(){
        openSite();
        chooseEngLanguage("js-link-box-en");
        clickLogin();
        clickLoginForm();
        clearLoginForm();
        fillLoginForm();
        clickPasswordForm();
        clearPasswordForm();
        fillPasswordForm();
        rememberLogPas();
        submitLogin();


    }

    public void submitLogin() {
        wd.findElement(By.id("wpLoginAttempt")).click();
    }

    public void rememberLogPas() {
        wd.findElement(By.id("wpRemember")).click();
    }

    public void fillPasswordForm() {
        wd.findElement(By.id("wpPassword1")).sendKeys("12345hu");
    }

    public void clearPasswordForm() {
        wd.findElement(By.id("wpPassword1")).clear();
    }

    public void clickPasswordForm() {
        wd.findElement(By.id("wpPassword1")).click();
    }

    public void fillLoginForm() {
        wd.findElement(By.id("wpName1")).sendKeys("Lypovanchuk");
    }

    public void clearLoginForm() {
        wd.findElement(By.id("wpName1")).clear();
    }

    public void clickLoginForm() {
        wd.findElement(By.id("wpName1")).click();
    }

    public void clickLogin() {
        wd.findElement(By.id("pt-login")).click();
    }

    public void chooseEngLanguage(String s) {
        wd.findElement(By.id(s)).click();
    }

    public void openSite() {
        wd.get("https://www.wikipedia.org/");
    }

    @AfterMethod
    public void tearnDown(){
        //wd.quit();

    }


}