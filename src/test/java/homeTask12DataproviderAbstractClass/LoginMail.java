package homeTask12DataproviderAbstractClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by ASUS PC on 08.11.2016.
 */
public class LoginMail extends AbstractLogin {
    //String email="vbvaleramail@mail.ru";
    //String password="123456vb";

    public LoginMail(WebDriver driver) {
        super(driver);
    }

    public void sleep(int milles) {
        try {
            Thread.sleep(milles);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openMail() {
        driver.get("https://mail.ru/");
        String title = "Mail.Ru: почта, поиск в интернете, новости, игры";
        Assert.assertEquals(driver.getTitle(), title);
        sleep(3000);
    }

    void putEmail(String email){
        By emaillocator = By.id("mailbox__login");
        driver.findElement(emaillocator).clear();
        driver.findElement(emaillocator).sendKeys(email);
    };
    void putPassword(String password){
        By passwordlocator = By.id("mailbox__password");
        driver.findElement(passwordlocator).clear();
        driver.findElement(passwordlocator).sendKeys(password);
    };
    void clickLoginButton(){
        driver.findElement(By.id("mailbox__auth__button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("inbox"));
    };

    //@Test(priority = 1)
    void login(String email, String password){
        openMail();
        putEmail(email);
        putPassword(password);
        clickLoginButton();
    };
}
