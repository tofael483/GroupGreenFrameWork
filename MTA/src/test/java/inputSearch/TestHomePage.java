package inputSearch;

import ObjectPages.HomePage;
import ObjectPages.SchedulePage;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestHomePage extends HomePage
{
HomePage homePage;
    @BeforeMethod
    public void initialize(){
      homePage = new HomePage(driver);
    }
    @Test
    public void Test(){
       searchBox();}

    public void TestSchedules(){

    }
}


