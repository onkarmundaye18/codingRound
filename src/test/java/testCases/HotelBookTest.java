package testCases;

import framework.SeleniumUtils;
import framework.TestFixtures;
import org.testng.annotations.Test;
import pageObjects.HotelBookPage;

public class HotelBookTest extends TestFixtures {
    private HotelBookPage hotelBookPage;

    @Test
    public void searchForHotelTest(){
        hotelBookPage = new HotelBookPage();
        launchBrowser("https://www.cleartrip.com/");
        SeleniumUtils.waitFor(2000);
        hotelBookPage.searchHotel();
    }
}
