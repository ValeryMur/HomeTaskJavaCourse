package homeTask5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ASUS PC on 16.10.2016.
 */
public class MainPageVK {
    private WebDriver driver;

    public MainPageVK (WebDriver driver){
        this.driver = driver;
    }
      private void putEmail(String myEmail){
          driver.findElement(By.xpath("//div/form//input[@id='index_email']")).clear();
          driver.findElement(By.id("index_email")).sendKeys(myEmail);
      }
    private void putPassword(String myPassword){
        driver.findElement(By.xpath("//input[@id='index_pass']")).clear();
        driver.findElement(By.id("index_pass")).sendKeys(myPassword);

    }
    private void clickButton()  {
        driver.findElement(By.id("index_login_button")).click();

    }
    public void loginVK(String myEmail, String myPassword){
        putEmail(myEmail);
        putPassword(myPassword);
        clickButton();
    }
}
