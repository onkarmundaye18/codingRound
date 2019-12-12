package framework;

import com.sun.xml.internal.messaging.saaj.soap.impl.ElementFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverManager {

    public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return dr.get();
    }

    public static void setWebDriver(WebDriver driver) {
        dr.set(driver);
    }

    public static void initPageFactory(Object page) {
        PageFactory.initElements(DriverManager.getDriver(), page);
    }
}
