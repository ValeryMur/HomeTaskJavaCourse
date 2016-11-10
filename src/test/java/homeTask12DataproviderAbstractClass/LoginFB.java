package homeTask12DataproviderAbstractClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by ASUS PC on 08.11.2016.
 */
public class LoginFB extends AbstractLogin {
    // String email="in-grid707@rambler.ru";
    // String password="in-grid707";

    public LoginFB(WebDriver driver) {
        super(driver);
    }


    public void sleep(int milles) {
        try {
            Thread.sleep(milles);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openFB() {
        driver.get("https://www.facebook.com/");
        String title = "Добро пожаловать на Фейсбук - заходите, регистрируйтесь и находите друзей.";
        Assert.assertEquals(driver.getTitle(), title);
        sleep(3000);
    }

    void putEmail(String email){
        By emaillocator = By.id("email");
        driver.findElement(emaillocator).clear();
        driver.findElement(emaillocator).sendKeys(email);
    };
    void putPassword(String password){
        By passwordlocator = By.id("pass");
        driver.findElement(passwordlocator).clear();
        driver.findElement(passwordlocator).sendKeys(password);
    };
    void clickLoginButton(){
        driver.findElement(By.id("u_0_l")).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("._2s25>span"),"Инна" ));
    };

    void login(String email, String password){
        openFB();
        putEmail(email);
        putPassword(password);
        clickLoginButton();
    };

}
