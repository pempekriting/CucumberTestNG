package hooks;

import context.TestContext;
import driver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CucumberHooks {
    private WebDriver driver;
    private final TestContext context;

    public CucumberHooks(TestContext context) {
        this.context = context;
    }

    @Before
    public void before() {
        driver = WebDriverInstance.initialize(Boolean.parseBoolean(System.getProperty("running-on-hub", "false")));
        context.driver = driver;
        context.driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void after(Scenario scenario) {
        scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES),
                "image/png", "evidence-test");
        driver.quit();
    }
}