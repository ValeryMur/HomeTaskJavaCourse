package homeTask12DataproviderAbstractClass;

import homeTask5.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by ASUS PC on 08.11.2016.
 */
public class LoginUkrnet extends AbstractLogin {
    //String email="vbleramail@ukr.net";
    //String password="123456vb";

    public LoginUkrnet(WebDriver driver) {
        super(driver);
    }


    public void sleep(int milles)  {
        try {
            Thread.sleep(milles);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void openUkrnet() {
        driver.get("https://www.ukr.net/");
        String title = "UKR.NET: Всі новини України, останні новини дня в Україні та Світі";
        Assert.assertEquals(driver.getTitle(), title);
        sleep(3000);
    }

    void putEmail(String email){
        By loginlocator = By.xpath(".//*[@name='Login']");
        driver.findElement(loginlocator).clear();
        driver.findElement(loginlocator).sendKeys(email);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(loginlocator));
    };

    void putPassword(String password){
        By passwordlocator = By.xpath(".//*[@name='Password']");
        driver.findElement(passwordlocator).clear();
        driver.findElement(passwordlocator).sendKeys(password);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(passwordlocator));
    };

    void clickLoginButton(){
        driver.findElement(By.cssSelector(".login-block__submit-but>button")).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".login-block__submit-but>button")));
        webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".top-bar__logout"),"Вийти" ));
    };

    public void login(String email, String password){
        driver.get("https://www.ukr.net/");
        putEmail(email);
        putPassword(password);
        clickLoginButton();
    };
}
