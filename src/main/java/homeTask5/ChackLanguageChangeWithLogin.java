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

/**
 * Created by ASUS PC on 15.10.2016.
 */
public class ChackLanguageChangeWithLogin {
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
    public void changeLanguage() throws InterruptedException {
        System.out.println("Test");
        driver.get("https://kismia.com/");
        Assert.assertEquals(driver.getTitle(), Constants.KISMIA_MAIN_PAGE_TITLE);

        //Login
        MainPage mainPage = new MainPage(driver);
        mainPage.login(email, password);
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.urlContains("u21763983"));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("u21763983"));

        //Check Eng lng
        driver.findElement(By.linkText("English")).click();
        wait.until(ExpectedConditions.urlContains("en.kismia"));
        String currentUrlEng = driver.getCurrentUrl();
        Assert.assertTrue(currentUrlEng.contains("en.kismia"));

        //Check Fr lng
        driver.findElement(By.linkText("Français")).click();
        wait.until(ExpectedConditions.urlContains("fr.kismia"));
        String currentUrlFr = driver.getCurrentUrl();
        Assert.assertTrue(currentUrlFr.contains("fr.kismia"));

        //Check Port lng
        driver.findElement(By.linkText("Português")).click();
        wait.until(ExpectedConditions.urlContains("pt.kismia"));
        String currentUrlPort = driver.getCurrentUrl();
        Assert.assertTrue(currentUrlPort.contains("pt.kismia"));

        //Check Esp lng
        driver.findElement(By.linkText("Español")).click();
        wait.until(ExpectedConditions.urlContains("es.kismia"));
        String currentUrlEsp = driver.getCurrentUrl();
        Assert.assertTrue(currentUrlEsp.contains("es.kismia"));

        //Check Ru lng
        driver.findElement(By.linkText("Русский")).click();
        Thread.sleep(8000);
        Assert.assertEquals(driver.getTitle(), Constants.KISMIA_PROFILE_TITLE);
    }

    @AfterTest
    public void tearDown() {
        System.out.println("Tear down");
        driver.close();
        driver.quit();
    }
}
