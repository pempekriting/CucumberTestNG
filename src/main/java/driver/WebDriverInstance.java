package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class WebDriverInstance {
    private WebDriverInstance instance = null;
    private static WebDriver webDriver;

    public WebDriverInstance() {
        initialize();
    }

    public static void initialize() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage", "--incognito", "--start-maximized", "window-size=1920,1080");
        options.setHeadless(true);
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.saucedemo.com/");
    }

    public synchronized void getInstance() throws IOException {
        if (instance == null) {
            instance = new WebDriverInstance();
        }
    }

    public static void quitDriver() {
        webDriver.quit();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static WebDriverWait getWebDriverWait() {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }
}