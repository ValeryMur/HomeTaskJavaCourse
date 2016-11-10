package HomeTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by ASUS PC on 28.09.2016.
 */
public class testFbAuthorization {

    String MyEmail = "valery_muravska@mail.ua";
    String MyPassword = "12345mvv";

    @Test
    public void AuthorisationFb() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(MyEmail);

        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(MyPassword);

        driver.findElement(By.id("u_0_l")).click();
        Thread.sleep(3000);

        String title = driver.getTitle();
        System.out.println(title);

        driver.close();
        driver.quit();

    }
}
