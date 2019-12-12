package pageObjects;

import framework.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HotelBookPage extends BasePage {

    @FindBy(linkText = "Hotels")
    private WebElement hotelLink;

    @FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;

    public HotelBookPage(){
        DriverManager.initPageFactory(this);
    }

    public void searchHotel(){
        click(hotelLink,"hotelLink");
        type(localityTextBox,"Indiranagar, Bangalore","localityTextBox");
        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        click(searchButton,"searchButton");
    }


}
