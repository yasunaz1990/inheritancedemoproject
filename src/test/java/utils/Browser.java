package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    private static WebDriver driver;

    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public static void deleteSession() {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    public static WebDriver driver() {
        return driver;
    }
}