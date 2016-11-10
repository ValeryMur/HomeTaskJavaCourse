package homeTask12DataproviderAbstractClass;

import homeTask5.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by valeria on 09.11.2016.
 */
public class LoginDataprovider {
    WebDriver driver;

    @BeforeTest
    public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @DataProvider (name="LoginOnSites")
    public Object[][] loginMethod(){
        return new Object[][]{
                {new LoginUkrnet(driver), "vbleramail@ukr.net", "123456vb"},
                {new LoginVK(driver), "380957304344", "12345mvv"},
                {new LoginFB(driver), "in-grid707@rambler.ru", "in-grid707"},
                {new LoginGmail(driver), "valerytestvb@gmail.com", "097531vb"},
                {new LoginMail(driver), "vbvaleramail@mail.ru", "123456vb"},
        };
    }

    @Test (dataProvider = "LoginOnSites", dataProviderClass = LoginDataprovider.class )
    public void loginOnSite(AbstractLogin abstractLogin, String email, String password){
            abstractLogin.login(email, password);
    }

    @AfterTest
    public void tearDown(){
        System.out.println("tearDown");
        driver.close();
        driver.quit();
    }
}



