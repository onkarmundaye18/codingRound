package framework;

import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestFixtures {

    private WebDriver driver;

    @BeforeClass
    public void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }

    @BeforeMethod
    public void setDriver(){
        driver = new ChromeDriver();
        DriverManager.setWebDriver(driver);
    }

    @AfterMethod
    public void quit() {
         DriverManager.getDriver().quit();
    }

    public void launchBrowser(String url){
        DriverManager.getDriver().get(url);
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
