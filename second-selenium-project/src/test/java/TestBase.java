import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        OpenSite("https://trello.com/");
    }

    public void clickOnLoginButton() {
        wd.findElement(By.className("global-header-section-button")).click();
    }

    public void confirmLogin() {
        wd.findElement(By.cssSelector("#login")).click();
    }

    public void fillLoginForm() {
        wd.findElement(By.cssSelector("input[type=email]")).click();
        wd.findElement(By.cssSelector("input[type=email]")).clear();
        wd.findElement(By.cssSelector("input[type=email]")).sendKeys("elena.telran@yahoo.com");

        wd.findElement(By.cssSelector("input[type=email]")).click();
        wd.findElement(By.cssSelector("input[type=email]")).clear();
        wd.findElement(By.cssSelector("input[type=email]")).sendKeys("12345.com");
    }

    public void OpenSite(String url) {
        wd.get(url);
    }
    public void login(){
        clickOnLoginButton();
        fillLoginForm();
        confirmLogin();
    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        //wd.quit();
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.cssSelector("img.member-avatar"));

    }

    private boolean isElementPresent(By by) {
            try {
                wd.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }
}
