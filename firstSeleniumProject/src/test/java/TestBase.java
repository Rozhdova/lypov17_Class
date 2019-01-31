import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;
    @BeforeMethod
    public void setup() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public void fillSearchForm(String f) {
        wd.findElement(By.name("search")).sendKeys(f);
    }

    public void clearSearch() {

        click(By.name("search"));
    }

    public void click(By locator) {
        wd.findElement(locator).clear();
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
        click(By.id("wpPassword1"));
    }

    public void clickPasswordForm() {
        submitLogin("wpPassword1");
    }

    public void fillLoginForm(String login) {
        wd.findElement(By.id("wpName1")).sendKeys(login);
    }

    public void clearLoginForm() {
        click(By.id("wpName1"));
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

