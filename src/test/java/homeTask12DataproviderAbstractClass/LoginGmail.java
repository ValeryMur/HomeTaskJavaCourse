package homeTask12DataproviderAbstractClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by ASUS PC on 08.11.2016.
 */
public class LoginGmail extends  AbstractLogin {
    //String email="vbleramail@ukr.net";
    //String password="123456vb";

    public LoginGmail(WebDriver driver) {
        super(driver);
    }


    public void sleep(int milles) {
        try {
            Thread.sleep(milles);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void openGmail() {
        driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=ru#identifier");
        String title = "Gmail";
        Assert.assertEquals(driver.getTitle(), title);
        sleep(3000);
    }

    void putEmail(String email){
        By emaillocator = By.id("Email");
        driver.findElement(emaillocator).clear();
        driver.findElement(emaillocator).sendKeys(email);
        driver.findElement(By.id("next")).click();
        sleep(3000);
    };
    void putPassword(String password){
        By passwordlocator = By.xpath(".//*[@id='Passwd']");
        driver.findElement(passwordlocator).clear();
        driver.findElement(passwordlocator).sendKeys(password);

    };
    void clickLoginButton(){
        driver.findElement(By.id("signIn")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("mail"));
    };

    //@Test(priority = 1)
    void login(String email, String password){
        openGmail();
        putEmail(email);
        putPassword(password);
        clickLoginButton();
    };

}
