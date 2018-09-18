package search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class searchInput  {

    static WebDriver driver;
    @BeforeMethod
    public void browserSetup (){

        System.setProperty("webdriver.chrome.driver", "/Users/asifchowdhury/Desktop/automateWeb/Generic/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bestbuy.com/");
        driver.getWindowHandles().clear();
    }
    @AfterMethod
    public void closeDriver(){
        driver.close();
    }
    @Test
    public void search(){
    driver.findElement(By.id("gh-search-input")).sendKeys(Keys.ENTER);
    }

    @Test
    public void click (){

    }
}
