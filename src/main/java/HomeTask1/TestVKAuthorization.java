package HomeTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by ASUS PC on 28.09.2016.
 */

public class TestVKAuthorization {

    public static void main(String args[]) {
    }
    @Test
        public void AuthorisationVb() throws InterruptedException {

            String MyEmail = "valery_muravska@mail.ua";
            String MyPassword = "12345mvv";

            WebDriver driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

            driver.get("https://vk.com/");

            driver.findElement(By.xpath("//div/form//input[@id='index_email']")).clear();
            driver.findElement(By.id("index_email")).sendKeys(MyEmail);

            driver.findElement(By.xpath("//input[@id='index_pass']")).clear();
            driver.findElement(By.id("index_pass")).sendKeys(MyPassword);

            driver.findElement(By.id("index_login_button")).click();
            Thread.sleep(3000);

            String title = driver.getTitle();
            System.out.println(title);

            driver.close();
            driver.quit();

        }
    }

