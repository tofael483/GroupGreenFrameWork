package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestHomePage extends CommonAPI {
    WebDriver driver;
    String baseUrl;

   @BeforeMethod
    public void beforeMethod (){
        driver = new ChromeDriver();
        baseUrl = "http://www.expedia.com";

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void test (){
       driver.findElement(By.id("header-history")).click();
       driver.findElement(By.id("tab-flight-tab")).click();
       driver.findElement(By.id("flight-origin")).sendKeys("New York");
       driver.findElement(By.id("flight-destination")).sendKeys("California");
       driver.findElement(By.id("flight-departing")).sendKeys("09/19/18");
       driver.findElement(By.id("flight-returning")).sendKeys("10/19/18");
       driver.findElement(By.id("search-button")).click();

    }

    @AfterMethod
    public void afterMethod(){}

}
