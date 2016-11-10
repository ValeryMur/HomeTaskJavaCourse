package homeTask5;

import lesson5Selenium.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by ASUS PC on 15.10.2016.
 */
public class EditUsrData {
    WebDriver driver;
    String email = "lemyrka@meta.ua";
    String password = "test_123";
    String weigh = "55 кг";
    String someTextEd = "более одного высшего";
    String language = "английский, французский, украинский, русский";


    @BeforeTest
    public void setUpBrowser() {
        System.out.println("Set up Chrom");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void addEditData() throws InterruptedException {
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

        //Edit data
        driver.findElement(By.cssSelector("#user_info_edit")).click();
        driver.findElement(By.xpath("//*[@name='education']//*[@value='3']")).click();

        //Select education
        //WebElement selectElem = driver.findElement(By.name("education"));
        //Select select = new Select(selectElem);
        //WebElement selectedOption = select.getFirstSelectedOption();
        //WebElement selectedOption = selectByVisibleText(someText);
       // WebElement selectedOption = selectByValue("3");

        //Select education
//        Select select = new Select(driver.findElement(By.xpath("//*[@name='education']")));
//        select.deselectAll();
//        select.selectByVisibleText("более одного высшего");
//        Thread.sleep(6000);

        driver.findElement(By.xpath("//*[@id='foreign_languages_5']")).click();
//        driver.findElement(By.name("weight")).clear();
//        webElement.sendKeys("\u0008"); - use backspace if clear is not working

        driver.findElement(By.xpath(".//*[@id='user_info']/table/tbody/tr[9]/td/div/input")).clear();

        driver.findElement(By.name("weight")).sendKeys("55");

        //Save edit
        driver.findElement(By.xpath("//*[@id='user_info_save']")).click();

        //Check edit
        //String education = driver.findElement(By.xpath("//*[@id='user_info']/table/tbody/tr[1]/td/span")).getAttribute("span");
        String education = driver.findElement(By.xpath("//*[@id='user_info']/table/tbody/tr[1]/td/span")).getText();
        Assert.assertEquals(education, someTextEd);
        String weightAfterEdit = driver.findElement(By.xpath("//*[@id='user_info']/table/tbody/tr[9]/td/span")).getText();
        Assert.assertEquals(weightAfterEdit, weigh);
        String lang = driver.findElement(By.xpath("//*[@id='user_info']/table/tbody/tr[4]/td/span[1]")).getText();
        Assert.assertEquals(lang, language);
    }


    @AfterTest
    public void tesrDown() {
        System.out.println("Tear down");
        driver.close();
        driver.quit();
    }
}