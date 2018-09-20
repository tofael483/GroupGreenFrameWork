package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;
    String baseurl;

    @Parameters({"url"})

    @BeforeMethod
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","/Users/asifchowdhury/Desktop/Expedia/Generic/driver/chromedriver");
        driver = new ChromeDriver();
        baseurl = "http://www.expedia.com/";
        driver.getWindowHandles().clear();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);
    }

    @Test
    public void test(){

    }

   // @AfterMethod
    //public void close(){
        //driver.close();
    }
    //public void searchIn(){ driver.findElement(By.id(""));
    //}
//}
