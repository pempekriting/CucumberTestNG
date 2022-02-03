package pagesfactory;

import driver.WebDriverInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriverWait getWait() {
        return WebDriverInstance.getWebDriverWait();
    }

    public WebDriver getDriver() {
        return WebDriverInstance.getWebDriver();
    }

    public String getValueAttribute(WebElement webElement, String attributeName) {
        return webElement.getAttribute(attributeName);
    }
}
