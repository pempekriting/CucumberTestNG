package hooks;

import driver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CucumberHooks {
    static WebDriverInstance webDriverInstance;

    @Before
    public static void before() {
        webDriverInstance = WebDriverInstance.getInstance();
    }

    @After
    public static void after(Scenario scenario) {
        scenario.attach(((TakesScreenshot) webDriverInstance.getWebDriver()).getScreenshotAs(OutputType.BYTES),
                "image/png", "evidence-test");
        webDriverInstance.quitDriver();
    }
}