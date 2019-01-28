import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LypovThrones {
    WebDriver wd;

    @BeforeMethod
    public void setup() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void throneTest(){
        openSite("https://www.wikipedia.org/");
        chooseEngLanguage("js-link-box-en");
        clickLogin();
        clickLoginForm();
        clearLoginForm();
        fillLoginForm("Lypovanchuk");
        clickPasswordForm();
        clearPasswordForm();
        fillPasswordForm("12345hu");
        rememberLogPas();
        submitLogin("wpLoginAttempt");
        clickSearch();
        clearSearch();
        fillSearchForm("Game of Thrones");


    }

    public void fillSearchForm(String f) {
        wd.findElement(By.name("search")).sendKeys(f);
    }

    public void clearSearch() {

        wd.findElement(By.name("search")).clear();
    }

    public void clickSearch() {
        wd.findElement(By.name("search")).click();
    }

    public void submitLogin(String log) {
        wd.findElement(By.id(log)).click();
    }

    public void rememberLogPas() {
        submitLogin("wpRemember");
    }

    public void fillPasswordForm(String s) {
        wd.findElement(By.id("wpPassword1")).sendKeys(s);
    }

    public void clearPasswordForm() {
        wd.findElement(By.id("wpPassword1")).clear();
    }

    public void clickPasswordForm() {
        submitLogin("wpPassword1");
    }

    public void fillLoginForm(String login) {
        wd.findElement(By.id("wpName1")).sendKeys(login);
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

    public void openSite(String url) {
        wd.get(url);
    }

    @AfterMethod
    public void tearnDown(){
        //wd.quit();

    }


}