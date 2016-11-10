package homeTask5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by ASUS PC on 16.10.2016.
 */
public class RateIMDB {
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
    public void topIMDB() throws InterruptedException {
        System.out.println("Test");
        driver.get("http://www.imdb.com/chart/top");
        Assert.assertEquals(driver.getTitle(), Constants.TOP_IMDB_TITLE);
//        String allTitles =  driver.findElement(By.xpath("//tbody//tr/td[@class='titleColumn']/a")).getText();
        List<WebElement> filmNames = driver.findElements(By.xpath("//tbody//tr/td[@class='titleColumn']/a"));
        List<WebElement> scores =  driver.findElements(By.xpath("//tbody//tr//td/strong"));

        for (int i = 0; i < filmNames.size(); i++) {
            System.out.println("Film #" + (i + 1) + ": " + filmNames.get(i).getText() + ". Score is: " + scores.get(i).getText());
        }

        driver.findElement(By.xpath("//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select")).click();
        driver.findElement(By.xpath("//*[@id='main']/div/span/div/div/div[3]/div/div/div[1]/select//option[@value='us:descending']")).click();
        filmNames = driver.findElements(By.xpath("//tbody//tr/td[@class='titleColumn']/a"));
        System.out.println(filmNames.get(0).getText());
        System.out.println(filmNames.get(filmNames.size()-1).getText());
//        filmNames.get(filmNames.size()-1);

//        System.out.println("Title all 250films: " + allTitles);
//        String allScores =  driver.findElement(By.xpath("//tbody//tr//td/strong")).getText();
//        System.out.println("Scores of all 250films: " + allScores);
//        //как вывести все фильмы и балы и что б возде названия фильма был его бал???
//        System.out.println("Title and scores of all 250films: " +allTitles+ " " + allScores);
    }

    @AfterTest
    public void tesrDown() {
        System.out.println("Tear down");
        driver.close();
        driver.quit();
    }
}
