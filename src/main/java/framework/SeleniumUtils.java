package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class SeleniumUtils {

    public static void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static boolean isElementPresent(By by) {
        try {
            DriverManager.getDriver().findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
