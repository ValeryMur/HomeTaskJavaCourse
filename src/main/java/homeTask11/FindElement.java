package homeTask11;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by ASUS PC on 06.11.2016.
 */
public class FindElement {
    WebDriver driver;
    public void findElement(By by){
        By selector = By.id("selector");
        try{
        driver.findElement(selector);
        }catch (NoSuchElementException e){
            System.out.println("No such element, wrong locator");
        }
    }
}
