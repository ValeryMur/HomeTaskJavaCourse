package homeTask12DataproviderAbstractClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by ASUS PC on 08.11.2016.
 */
public class LoginVK extends AbstractLogin{
    //String email="valery_muravska@mail.ua";
    //String password="12345mvv";

    public LoginVK(WebDriver driver) {
        super(driver);
    }

    public void sleep(int milles) {
        try {
            Thread.sleep(milles);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openVK() {
        driver.get("https://vk.com/");
        String title = "Добро пожаловать | ВКонтакте";
        Assert.assertEquals(driver.getTitle(), title);
        sleep(3000);
    }

    void putEmail(String email){
        By loginlocator = By.id("index_email");
        driver.findElement(loginlocator).clear();
        driver.findElement(loginlocator).sendKeys(email);
    };
    void putPassword(String password){
        By passwordlocator = By.id("index_pass");
        driver.findElement(passwordlocator).clear();
        driver.findElement(passwordlocator).sendKeys(password);
    };
    void clickLoginButton(){
        driver.findElement(By.id("index_login_button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("feed"));
        //String currentUrl = driver.getCurrentUrl();
        //Assert.assertTrue(currentUrl.contains("feed"));
    };

    public void login(String email, String password){
        openVK();
        putEmail(email);
        putPassword(password);
        clickLoginButton();
    };
}
