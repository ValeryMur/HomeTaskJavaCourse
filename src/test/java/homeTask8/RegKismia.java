package homeTask8;

import homeTask5.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by ASUS PC on 27.10.2016.
 */
public class RegKismia {
    WebDriver driver;

    @BeforeTest
    public void setUpBrowser() {
        System.out.println("Set up Chrom");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test (priority = 1)
    public void openSiteKismia() throws InterruptedException {
        System.out.println("TEST");
        driver.get("https://kismia.com");
        Assert.assertEquals(driver.getTitle(), Constants.KISMIA_MAIN_PAGE_TITLE);
        driver.findElement(By.id("form-registration")).click();
        //.redio-form-field>lable:nth-of-type(2)  ищем Ж
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='block-first']/div[1]/div[2]/label")).click();
        driver.findElement(By.id("user-reg-myname")).clear();
        driver.findElement(By.id("user-reg-myname")).sendKeys("Вася");
        driver.findElement(By.xpath("//*[@id='block-first']/button")).click();
        Thread.sleep(5000);
    }

    public void regUserVerifyEmail(String email) {
        driver.findElement(By.id("user-reg-myemail")).clear();
        driver.findElement(By.id("user-reg-myemail")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id='block-last']/button")).click();
        //Thread.sleep(5000);
    }

    @DataProvider(name="validAndPopularEmails")
    public static Object[][] validEmails() {
        return new Object[][]{
                {"emails@domain.com"},
                {"firstname.lastname@domain.com"},
                {"eM8ail@yahoo.com"},
                {"email2016@gmail.com"},
                {"email_2016@mail.ru"},
                {"email2016@hotmail.com"},
                {"Email2016@outlook.com"},
                {"email2016@yandex.ua"},
        };
    }
    @DataProvider(name="invalidAndPopularEmails")
    public static Object[][] invalidEmails() {
        return new Object[][]{
                //{" "},
                {"firstname.lastname@com"},
                {"eM8ail@"},
                {"email  2016@gmail.com"},
                {"!@#$%^&*()_+}?>:{PL<@hotmail.com"},
                {"Email2016outlook.com"},
                {"email2016"},
        };
    }

    @Test (dataProvider = "validAndPopularEmails", dataProviderClass = RegKismia.class, dependsOnMethods = "openSiteKismia")
    public void dataProvaiderValidEmail(String email){
        regUserVerifyEmail(email);
        // String noPassword = driver.findElement(By.cssSelector(".error-msg no-password")).getText();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='block-last']/div[3]/span[2]"),"Введите пароль" ));
        /*String noPassword = driver.findElement(By.xpath("/*//*[@id='block-last']/div[3]/span[2]")).getText();
        Assert.assertTrue(noPassword.contains("Введите пароль"));*/
    }

    @Test (dataProvider = "invalidAndPopularEmails", dataProviderClass = RegKismia.class, dependsOnMethods = "openSiteKismia")
    public void dataProvaiderInvalidEmail(String email){
        regUserVerifyEmail(email);
        // String emptyEmail = driver.findElement(By.cssSelector(".error-msg empty-fields")).getText();

        // String incorrectEmail = driver.findElement(By.cssSelector(".error-msg incorrect-email")).getText();
        String incorrectEmail = driver.findElement(By.xpath("//*[@id='block-last']/div[3]/span[6]")).getText();
        //Assert.assertTrue(emptyEmail.contains("Введите, пожалуйста, свой e-mail и пароль"));
        Assert.assertTrue(incorrectEmail.contains("Неверный формат email"));
    }

    @AfterTest
    public void tearDown(){
        System.out.println("tearDown");
        driver.close();
        driver.quit();
    }

}
