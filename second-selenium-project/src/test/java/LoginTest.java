import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver wd;
    @BeforeClass
            public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
    }
    @Test
            public void testLogin() {
        OpenSite("https://trello.com/");
        clickOnLoginButton();
        fillLoginForm();
        confirmLogin();
    }

    public void clickOnLoginButton() {
        wd.findElement(By.className("global-header-section-button")).click();
    }

    public void confirmLogin() {
    }

    public void fillLoginForm() {
    }

    public void OpenSite(String url) {
        wd.get(url);
    }

}
