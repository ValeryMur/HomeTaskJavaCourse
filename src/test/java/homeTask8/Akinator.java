package homeTask8;

import homeTask5.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by ASUS PC on 27.10.2016.
 */
public class Akinator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //НАЧАТЬ ИГРУ
        driver.get("http://ru.akinator.com/");
        String Title = "Акинатор, Интернет-гений";
        Assert.assertEquals(driver.getTitle(), Title);
        driver.findElement(By.cssSelector(".rouge")).click();
        driver.findElement(By.id("elokence_sitebundle_identification_age")).sendKeys("25");
        driver.findElement(By.cssSelector("#infos-area-footer>input")).click();

        //ОТВЕТЫ
        By response1 = By.id("reponse1");
        String resp1 = driver.findElement(response1).getText();
        System.out.println("#1 " + resp1);
        By response2 = By.id("reponse2");
        String resp2 = driver.findElement(response2).getText();
        //String resp2 = driver.findElement(By.id("reponse2")).getText();
        System.out.println("#2 " + resp2);
        By response3 = By.id("reponse3");
        String resp3 = driver.findElement(response3).getText();
        System.out.println("#3 " + resp3);
        By response4 = By.id("reponse4");
        String resp4 = driver.findElement(response4).getText();
        System.out.println("#4 " + resp4);
        By response5 = By.id("reponse5");
        String resp5 = driver.findElement(response5).getText();
        System.out.println("#5 " + resp5);

        By[] responseArray = new By[]{
                response1, response2, response3, response4, response5
        };

        while (driver.findElements(By.cssSelector("#reponses")).size() > 0){
            Thread.sleep(500);
            //ВОПРОС
            String question = driver.findElement(By.id("bulle-inner")).getText();
            System.out.println("Вопрос: " + question);

            Scanner in = new Scanner(System.in);
            System.out.println("Введите номер ответа: ");
            int userResponse = in.nextInt();
            driver.findElement(responseArray[userResponse-1]).click();
            Thread.sleep(300);

//            if (userResponse == "1") {
//                driver.findElement(By.id("reponse1")).click();
//            }
//            if (userResponse == "2") {
//                driver.findElement(By.id("reponse2")).click();
//            }
//            if (userResponse == "3") {
//                driver.findElement(By.id("reponse3")).click();
//            }
//            if (userResponse == "4") {
//                driver.findElement(By.id("reponse4")).click();
//            }
//            if (userResponse == "5") {
//                driver.findElement(By.id("reponse5")).click();
//            }

        }

        String answ1 = driver.findElement(By.id("yesLink")).getText();
        System.out.println("#1 " + answ1);
        String answ2 = driver.findElement(By.id("noLink")).getText();
        System.out.println("#2 " + answ2);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа: ");
        String userAnsw = in.nextLine();

        if (userAnsw == "1") {
            driver.findElement(By.id("yesLink")).click();
        }
        if (userAnsw == "2") {
            driver.findElement(By.id("noLink")).click();
        }
    }

}
