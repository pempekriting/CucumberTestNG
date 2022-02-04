package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

public class WebDriverInstance {
    private static WebDriverInstance instance = null;
    private RemoteWebDriver webDriver;

    private WebDriverInstance() {
        initialize(Boolean.parseBoolean(System.getProperty("running-on-hub", "false")));
    }

    private void initialize(Boolean isRunningOnHub) {
        URL URL_ADDRESS;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage", "--incognito", "--start-maximized", "window-size=1920,1080");
        options.setHeadless(true);
        WebDriverManager.chromedriver().setup();

        if (isRunningOnHub) {
            try {
                URL_ADDRESS = new URL("http://172.20.0.2:4444/wd/hub");
                webDriver = new RemoteWebDriver(URL_ADDRESS, options);
            } catch (Exception e) {
                System.out.println("Error : " + e);
            }
        } else {
            webDriver = new ChromeDriver(options);
        }
        webDriver.get("https://www.saucedemo.com/");
    }

    public synchronized static WebDriverInstance getInstance() {
        if (instance == null) {
            instance = new WebDriverInstance();
        }
        return instance;
    }

    public void quitDriver() {
        instance = null;
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWebDriverWait() {
        return new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }
}