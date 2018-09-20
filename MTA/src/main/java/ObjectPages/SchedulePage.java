package ObjectPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SchedulePage extends CommonAPI {

    public SchedulePage(){}
    public SchedulePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#menu-399-1 > a")
    public static WebElement schedules;
    @FindBy(css="#node-298556 > div > div > div > div > div.span-40 > ul > li:nth-child(1) > a")
    public static WebElement RailSchedulesLongInd;
    @FindBy(css="#node-298556 > div > div > div > div > div.span-40 > ul > li:nth-child(2) > a")
    public static WebElement MetroNorthRailroad;
    @FindBy(css="#node-298556 > div > div > div > div > div.span-40 > ul > li:nth-child(3) > a")
    public static WebElement StatenIsalandRailway;
    @FindBy(css="#node-298556 > div > div > div > div > div.span-21.push-2 > ul > li:nth-child(1) > a")
    public static WebElement NycBusBronx;
    @FindBy(css="#node-298556 > div > div > div > div > div.span-21.push-2 > ul > li:nth-child(2) > a")
    public static WebElement NycBusBrooklyn;
    @FindBy(css="#node-298556 > div > div > div > div > div.span-21.push-2 > ul > li:nth-child(3) > a")
    public static WebElement NycBusManhattan;
    @FindBy(css="#node-298556 > div > div > div > div > div.span-21.push-2 > ul > li:nth-child(4) > a")
    public static WebElement NycBusQueens;
    @FindBy(css="#node-298556 > div > div > div > div > div.span-21.push-2 > ul > li:nth-child(5) > a")
    public static WebElement NycStatenIsland;

    //clickOnSchedules Elements
    public void clickOnSchedules(){
        schedules.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        RailSchedulesLongInd.click();

    }

    public void clickOnMetroNorth(){
        schedules.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        MetroNorthRailroad.click();

    }

    public void clickOnStatenIsland(){
        schedules.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        StatenIsalandRailway.click();

    }

    public void clickOnNYCBusBronx(){
        schedules.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        NycBusBronx.click();}

    public void clickOnNYCBusBrooklyn(){
        schedules.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        NycBusBrooklyn.click();}

    public void clickOnNYCBusManhattan(){
        schedules.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        NycBusManhattan.click();}

    public void clickOnNYCBusQueens(){
        schedules.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        NycBusQueens.click();}

    public void clickOnNYCBusStatenIsland(){
        schedules.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        NycStatenIsland.click();}

    public WebElement getNycBusBronx(){
        clickOnNYCBusBronx();
        return NycBusBronx;
    }

    public String testWTng(){
        getNycBusBronx().getText();
        String data="Bronx";
    return data;}


            }








