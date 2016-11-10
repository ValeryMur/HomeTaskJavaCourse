package HomeTask1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by ASUS PC on 03.10.2016.
 */
public class Currency {
    @Test
    public void getCurrencyFromSite(){

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);



        driver.get("http://minfin.com.ua/");
        String text = driver.findElement(By.xpath("(//*[@class='mf-currency-ask'])[3]")).getText();
        System.out.println(text);

        text = text.replace("$", ""); // Заменить символ $ на нифига

        System.out.println("Replaced: "+text);

        double oil = Double.parseDouble(text);
        System.out.println((float)oil+10.10);

        driver.quit();
    }

}
