
import org.testng.annotations.Test;



public class LypovThrones extends TestBase {



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



}