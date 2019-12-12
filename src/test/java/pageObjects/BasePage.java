package pageObjects;

import framework.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
    }

    public void click(WebElement element, String elementName) {
        element.click();
    }

    public void type(WebElement element, String value, String elementName) {
        element.sendKeys(value);
    }

    public void clear(WebElement element, String elementText) {
        element.clear();
    }
}
