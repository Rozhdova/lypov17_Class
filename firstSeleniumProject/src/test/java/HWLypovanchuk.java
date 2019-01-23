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
        wd.get("https://www.wikipedia.org/");
        wd.findElement(By.id("js-link-box-en")).click();
        wd.findElement(By.id("pt-login")).click();
        wd.findElement(By.id("wpName1")).click();
        wd.findElement(By.id("wpName1")).clear();
        wd.findElement(By.id("wpName1")).sendKeys("Lypovanchuk");
        wd.findElement(By.id("wpPassword1")).click();
        wd.findElement(By.id("wpPassword1")).clear();
        wd.findElement(By.id("wpPassword1")).sendKeys("12345hu");
        wd.findElement(By.id("wpRemember")).click();
        wd.findElement(By.id("wpLoginAttempt")).click();


    }
    @AfterMethod
    public void tearnDown(){
        //wd.quit();

    }


}