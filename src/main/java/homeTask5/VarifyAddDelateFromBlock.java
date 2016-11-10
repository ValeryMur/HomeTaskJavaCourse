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
public class VarifyAddDelateFromBlock {
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
    public void addDelateFromFavorite() throws InterruptedException {
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

        //Add to  Block
        driver.get("https://kismia.com/profile/selected");
        Thread.sleep(6000);
        driver.findElement(By.xpath(".//*[@id='content']/ul/li/ul/li[6]/a")).click();
        Thread.sleep(6000);
        driver.findElement(By.linkText("заблокированные")).click();
        wait.until(ExpectedConditions.urlContains("/profile/delete"));
        assertTrue(currentUrl.contains("/profile/delete"));

        //Remove from Block
        driver.findElement(By.linkText("yinchengli...")).click();
        wait.until(ExpectedConditions.urlContains("u20979146"));
        assertTrue(currentUrl.contains("u20979146"));
        driver.findElement(By.xpath("//div[@class='left_menu']/a[4]")).click();
        driver.get("https://kismia.com/profile/delete");
        boolean selectedMan = driver.getPageSource().contains("yinchengli...");
        assertFalse(selectedMan);
    }
    @AfterTest
    public void tesrDown() {
        System.out.println("Tear down");
        driver.close();
        driver.quit();
    }
    }
