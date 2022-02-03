package hooks;

import driver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CucumberHooks {

    @Before
    public static void before() {
        WebDriverInstance.initialize();
    }

    @After
    public static void after(Scenario scenario) {
        scenario.attach(((TakesScreenshot) WebDriverInstance.getWebDriver()).getScreenshotAs(OutputType.BYTES),
                "image/png", "evidence-test");
        WebDriverInstance.quitDriver();
    }
}