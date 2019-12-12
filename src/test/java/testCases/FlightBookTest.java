package testCases;

import framework.DriverManager;
import framework.SeleniumUtils;
import framework.TestFixtures;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.FlightBookPage;

public class FlightBookTest extends TestFixtures {
    private FlightBookPage flightBookPage;

    @Test
    public void oneWayJourneyResultTest(){
        flightBookPage = new FlightBookPage();
        launchBrowser("https://www.cleartrip.com/");
        SeleniumUtils.waitFor(2000);
        flightBookPage.setFromLocation("Banglore");
        SeleniumUtils.waitFor(5000);
        flightBookPage.setFirstOriginOption();
        flightBookPage.setToLocation("Delhi");
        SeleniumUtils.waitFor(2000);
        flightBookPage.setFirstDestinationOption();
        flightBookPage.clickDatePickerAnchor();
        flightBookPage.searchFlight();
        SeleniumUtils.waitFor(5000);
        Assert.assertTrue(SeleniumUtils.isElementPresent(By.className("searchSummary")));
    }
}
