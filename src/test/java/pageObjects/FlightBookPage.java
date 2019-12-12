package pageObjects;

import framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightBookPage extends  BasePage{

    @FindBy(id = "OneWay")
    private WebElement oneWayElem;

    @FindBy(id= "FromTag")
    private WebElement fromTagElem;

    @FindBy(id= "ui-id-1")
    private WebElement originOptionParent;

    @FindBy(id= "ui-id-2")
    private WebElement destinationOptionParent;

    @FindBy(id = "ToTag")
    private WebElement toTagElem;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
    private WebElement datePickerAnchor;

    @FindBy(id = "SearchBtn")
    private WebElement searchBtn;

    public FlightBookPage(){
        DriverManager.initPageFactory(this);
    }

    public void clickDatePickerAnchor(){
        click(datePickerAnchor,"datePickerAnchor");
    }

    public void searchFlight(){
        click(searchBtn,"searchBtn");
    }

    public void setFirstOriginOption(){
        List<WebElement> originOptions = originOptionParent.findElements(By.tagName("li"));
        click(originOptions.get(0), "firstOriginOption");
    }

    public void setFirstDestinationOption(){
        List<WebElement> destinationOptions = destinationOptionParent.findElements(By.tagName("li"));
        click(destinationOptions.get(0),"firstDestinationOption");
    }

    public void setFromLocation(String location){
        click(oneWayElem,"onewayelement");
        clear(fromTagElem,"onewayelement");
        type(fromTagElem,location,"fromTagElem");
    }

    public void setToLocation(String location){
        click(toTagElem,"toTagElem");
        clear(toTagElem,"toTagElem");
        type(toTagElem,location,"toTagElem");
    }



}
