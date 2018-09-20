package search;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SearchPageFactory extends CommonAPI {

    WebDriver driver;

    @FindBy(id = "header-history")
    WebElement headerHistory;

    @FindBy(name = "gcw-origin")
    WebElement flightTab;
    //gcw-origin
    @FindBy(id = "flight-origin")
    WebElement originCity;

    @FindBy(id = "flight-destination")
    WebElement destinationCity;

    @FindBy(id = "flight-departing")
    WebElement departureDate;

    @FindBy(id = "flight-returning")
    WebElement returnDate;

    public void clickFlightsTab() {
        headerHistory.click();
        flightTab.click();
    }

        public void setOriginCity (String origin){
            originCity.sendKeys(origin);
        }

        //public void setDestinationCity(String destinationCity){
        //destinationCity.
        //}

    @Test
    public void test(){

    }

}