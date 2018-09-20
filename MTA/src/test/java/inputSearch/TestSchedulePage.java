package inputSearch;

import ObjectPages.SchedulePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSchedulePage extends SchedulePage {
    @BeforeMethod
    public void initialize(){
        SchedulePage schedulePage = new SchedulePage(driver);
    }
    @Test
    public void TestSchedule(){
        clickOnSchedules();

    }
    @Test
    public void TestRailWaysSchedule(){
        clickOnMetroNorth();

    }
   @Test
    public void TestNYcBusSchedule(){
        clickOnNYCBusQueens();

    }
    @Test
    public void TestNycBusBronx(){
        getNycBusBronx();

    }
    //@Test
    //public void TWNG(){
      //  Assert.assertEquals("Bronx",testWTng());
    //}





}
