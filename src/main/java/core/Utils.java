package core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utils {


    public static boolean isElementPresent(By locator) {
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> elements = Driver.get().findElements(locator);
        Driver.get().manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("test.timeout")), TimeUnit.SECONDS);
        return elements.size() > 0 && elements.get(0).isDisplayed();
    }

    public static boolean isElementPresent(By locator, int timeout) {
        Driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.MILLISECONDS);
        List<WebElement> elements = Driver.get().findElements(locator);
        Driver.get().manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("test.timeout")), TimeUnit.SECONDS);
        return elements.size() > 0 && elements.get(0).isDisplayed();
    }

    public static boolean isElementExist(By locator) {
        Driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> elements = Driver.get().findElements(locator);
        Driver.get().manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("test.timeout")), TimeUnit.SECONDS);
        return elements.size() > 0;
    }

    public static void clickJSAll(WebElement someButton) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", someButton);
    }

    public static void clickJS(WebElement someButton) {
        if (Config.getProperty("test.browser").equals("iexplore")) {
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", someButton);
        } else {
            someButton.click();
        }
    }

    public static WebElement setTextJS(WebElement someField, String someText) {
        if (Config.getProperty("test.browser").equals("iexplore")) {
            someField.clear();
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].value='" + someText + "';", someField);
        } else {
            someField.sendKeys(someText);
        }
        return someField;
    }

    public static void setTextAllJS(WebElement someField, String someText) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].value='" + someText + "';", someField);
    }

    public static WebElement setText(WebElement someField, String someText){
        someField.clear();
        someField.sendKeys(someText);
        return someField;
    }

    public static String getCurrentURL() {
        return Driver.get().getCurrentUrl();
    }

    public static void waitSleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignore) {}
    }
}
