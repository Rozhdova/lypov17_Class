import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions(){
        if(!isUserLoggedIn()){
         login();
        }
    }


    @Test
    public void testLogout(){
        clickOnAvatar();
        clickOnLogOutButton();

        Assert.assertFalse(isUserLoggedIn());

    }

    private void clickOnAvatar() {
        click("");
    }

    private void click(String locator) {
        wd.findElement(By.cssSelector(locator)).click();
    }

    private void clickOnLogOutButton() {
        wd.findElement(By.cssSelector("js-logout")).click();
    }
}
