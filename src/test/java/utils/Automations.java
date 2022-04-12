package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Automations {

    // Fields
    private static WebDriver  driver = Browser.driver();
    private static WebDriverWait waits = new WebDriverWait(Browser.driver(), 15);

    // -- Constructors --//

    // Methods
    public static void visit(String url) {
        driver.get(url);
        pause();
    }

    public static void click(By locator) {
        pause();
        WebElement element = waits.until(ExpectedConditions.elementToBeClickable(locator));
        highlight(locator);
        element.click();
    }

    public static boolean isVisible(By locator) {
        pause();
        WebElement element = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
        highlight(locator);
        return element.isDisplayed();
    }

    public static boolean isInvisible(By locator) {
        pause();
        boolean isNotVisible = waits.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        return isNotVisible;
    }

    public static String screenshot() {
        String screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        return screenshot;
    }

    public static WebElement webElement(By locator) {
        pause();
        WebElement element = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
        highlight(locator);
        return element;
    }

    public static void highlight(By locator) {
        pause();
        WebElement element = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);
    }

    public static void highlightAll(By locator) {
        pause();
        List<WebElement> elements = waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (WebElement elem : elements) {
            pause();
            String cssValue = "arguments[0].setAttribute('style', 'border: 3px solid red; background-color:#ffeead;');";
            js.executeScript(cssValue, elem);
        }
    }

    public static void highlightAll(By locator, String color) {
        pause();
        List<WebElement> elements = waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String cssValue = "arguments[0].setAttribute('style', 'border: 1px dashed " + color + ";');";
        for (WebElement elem : elements) {
            pause();
            js.executeScript(cssValue, elem);
        }
    }

    public static void litBackground(By locator) {
        pause();
        WebElement element = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String cssValue = "arguments[0].setAttribute('style', 'border: 3px solid red; background-color:#ffeead;');";
        js.executeScript(cssValue, element);
    }

    public static void litBackground(By locator, String color) {
        pause();
        WebElement element = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String cssValue = "arguments[0].setAttribute('style', 'border: 3px solid red; background-color: " + color + ";');";
        js.executeScript(cssValue, element);
    }

    public static void type(By locator, String text) {
        pause();
        WebElement element = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
        highlight(locator);
        element.sendKeys(text);
    }

    public static void scrollToView(By locator) {
        pause();
        WebElement element = waits.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public static void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ignored) {
            // Do-Nothing
        }
    }

    public static void pause() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ignored) {
            // Do-Nothing
        }
    }
}
