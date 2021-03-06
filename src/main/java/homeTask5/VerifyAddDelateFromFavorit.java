package homeTask5;

import lesson5Selenium.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by ASUS PC on 15.10.2016.
 */
public class VerifyAddDelateFromFavorit {
    WebDriver driver;
    String email = "lemyrka@meta.ua";
    String password = "test_123";

    @BeforeTest
    public void setUpBrowser() {
        System.out.println("Set up Chrom");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void addDeleteFromFavorite() throws InterruptedException {
        System.out.println("Test");
        driver.get("https://kismia.com/");
        Assert.assertEquals(driver.getTitle(), Constants.KISMIA_MAIN_PAGE_TITLE);

        //Login
        MainPage mainPage = new MainPage(driver);
        mainPage.login(email, password);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.urlContains("u21763983"));
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("u21763983"));

        //Add to favorite
        driver.get("https://kismia.com/u18330465");
        Thread.sleep(5000);
//        driver.findElement(By.linkText("Добавить в избранное")).click();
//        driver.findElement(By.xpath("//div[@class='left_menu']/a[5]")).click();
        driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[2]/a[5]")).click();
//        driver.findElement(By.xpath(".//*[@id='aside']/div[2]/ul/li[7]/a")).click();
//        Thread.sleep(8000);
        driver.findElement(By.cssSelector(".favorites")).click();
//        driver.findElement(By.linkText("мои избранные")).click();
        wait.until(ExpectedConditions.urlContains("profile/selected"));
        String currentUrlFavor = driver.getCurrentUrl();
        assertTrue(currentUrlFavor.contains("profile/selected"));
        boolean selectedMan = driver.getPageSource().contains("Сашко");
        assertTrue(selectedMan);

        //Delete from Favorite
        driver.findElement(By.linkText("Сашко")).click();
        wait.until(ExpectedConditions.urlContains("u18330465"));
        driver.findElement(By.xpath("//div[@class='left_menu']/a[5]")).click();
        Thread.sleep(8000);
        driver.findElement(By.cssSelector(".favorites")).click();
        wait.until(ExpectedConditions.urlContains("profile/selected"));
        assertTrue(currentUrlFavor.contains("profile/selected"));
        driver.getPageSource().contains("Сашко");
        assertFalse(selectedMan);

    }

    @AfterTest
    public void tesrDown() {
        System.out.println("Tear down");
        driver.close();
        driver.quit();
    }
}
