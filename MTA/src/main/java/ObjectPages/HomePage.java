package ObjectPages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI{


    @FindBy(xpath = "//*[@id=\"subwayDiv\"]/ul/li[1]/a")
    public static WebElement searchStatusComponentTheWeekDay;
    @FindBy(className="t tdiv selectedStatusTab")
    public static WebElement searchStatusComponentRail;
    @FindBy(id="busTab")
    public static WebElement searchStatusComponentBus;

    @FindBy(id="bntTab")
    public static WebElement searchStatusComponentBridgesTunnels;
@FindBy(id="edit-submit")
    public static WebElement searchButton;
    public HomePage(){};

    public HomePage(WebDriver driver)
    {   this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //checkComponentsOfServiceStatus
    public void SearchComponentsOfServiceStatus(){
        searchStatusComponentBridgesTunnels.click();
    }

    public void searchBox(){
        typeOnInputField("edit-search-keys","schedule");
        searchButton.click();

    }


}



