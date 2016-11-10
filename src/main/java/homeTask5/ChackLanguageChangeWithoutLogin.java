package homeTask5;

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
public class ChackLanguageChangeWithoutLogin {
    WebDriver driver;

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

        //Check Eng lng
        driver.findElement(By.linkText("English")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
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
        //driver.findElement(By.xpath("//ul//li[1]/a[@class='active']")).click();
        //driver.findElement(By.cssSelector(".active")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), Constants.KISMIA_MAIN_PAGE_TITLE);


    }

    @AfterTest
    public void tearDown() {
        System.out.println("Tear down");
        driver.close();
        driver.quit();
    }
}
