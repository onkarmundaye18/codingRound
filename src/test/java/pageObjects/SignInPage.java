package pageObjects;

import framework.DriverManager;
import framework.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(linkText = "Your trips")
    private WebElement yourTripBtn;

    @FindBy(id = "SignIn")
    private WebElement signInLnk;

    @FindBy(id = "signInButton")
    private WebElement signInBtn;

    @FindBy(id = "errors1")
    private WebElement errorElem;

    @FindBy(id = "modal_window")
    private WebElement modalWindow;

    public SignInPage(){
        DriverManager.initPageFactory(this);
    }

    public void doSignIn(){
        click(yourTripBtn,"yourTripBtn");
        click(signInLnk,"signInLnk");
        SeleniumUtils.waitFor(2000);
        DriverManager.getDriver().switchTo().frame(modalWindow);
        click(signInBtn,"signInBtn");
    }

    public String getErrorText(){
        return errorElem.getText().trim();
    }
}
