package pagesfactory;

import driver.WebDriverInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriverInstance webDriverInstance = WebDriverInstance.getInstance();

    public WebDriverWait getWait() {
        return webDriverInstance.getWebDriverWait();
    }

    public WebDriver getDriver() {
        return webDriverInstance.getWebDriver();
    }

    public String getValueAttribute(WebElement webElement, String attributeName) {
        return webElement.getAttribute(attributeName);
    }
}
