package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver=null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUP(@Optional("http://www.mta.info/") String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\IdeaProjects\\automation2\\Generic\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(url);



    }

    @AfterMethod
    public void driverClose(){
        driver.close();
    }
    public void searchBox(){

        driver.findElement(By.id("edit-search-keys")).sendKeys("bus schedule", Keys.ENTER);
    }


}
