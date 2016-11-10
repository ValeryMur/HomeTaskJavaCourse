package homeTask5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static homeTask5.Constants.DEFAULT_WAIT_TIME;
import static homeTask5.Constants.LOGIN_PAGE_VK;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by ASUS PC on 16.10.2016.
 */
public class CongratulationVK {
    WebDriver driver;
    String myEmail = "380957304344";
    String myPassword = "12345mvv";

    private List<String> congrats = new ArrayList<String>(){{
        add("Happy Birthday!");
        add("Happy Birthday. Have fun!");
        add("Happy Birthday with best wishes!");
    }};

    @BeforeTest
    public void setUpBrowser() {
        System.out.println("Set up Chrom");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_TIME, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(DEFAULT_WAIT_TIME, SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void changeLanguage() throws InterruptedException {
        System.out.println("Test");
        driver.get("https://vk.com/");
        Assert.assertEquals(driver.getTitle(), LOGIN_PAGE_VK);

        //Login VK
        MainPageVK mainPageVK = new MainPageVK(driver);
        mainPageVK.loginVK(myEmail, myPassword);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("feed"));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("feed"));

        driver.get("https://vk.com/magor4ik?w=calendar");
        WebElement elem = driver.findElement(By.xpath("//*[@id='bd_calendar']/div[1]/div[2]/a"));
        elem.click();
        elem.click();
        List<WebElement> users = driver.findElements(By.cssSelector(".bd_day_events"));


// write to user logic
        congrats.get(generateRandom());
    }


    private static int generateRandom() {
        return (int) Math.floor(Math.random() * 3);
//        return (int) Math.floor(Math.random() * 3 - 1);
    }

}
