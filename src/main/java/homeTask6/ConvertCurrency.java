package homeTask6;

import homeTask5.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by ASUS PC on 20.10.2016.
 */
public class ConvertCurrency {
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
    public void privat24()  {
        System.out.println("Test");
        driver.get("https://www.privat24.ua");
        String title24 = "Приват24 - Ваш живий Інтернет-банк!";
        Assert.assertEquals(driver.getTitle(), title24);
        String dolprivat24 = driver.findElement(By.xpath("//div[@class='exchange-rates-container']/div[1]/div[2]")).getText();
        System.out.println(dolprivat24);
        dolprivat24 = dolprivat24.replace("/","");
        String privat24Arr[] = dolprivat24.split(" ");
        double pr24Arr[] = new double[privat24Arr.length];
        for (int i=0; i<privat24Arr.length; i++) {
            if("".equals(privat24Arr[i])){
                continue;
            }
            pr24Arr[i]= Double.parseDouble( privat24Arr[i]);

            System.out.println(pr24Arr[i]);
        }
        double buypr24 = pr24Arr[0];
        System.out.println(buypr24);
        double sellpr24 = pr24Arr[2];
        System.out.println(sellpr24);


        //перевести в массыив и циклом повыводить первый и второй элемент,
        // а затем циклом найти мин и макс число и вывесли в консоль, кждий банк это отдельный метод и затем метод общий на циклы
    }
}
