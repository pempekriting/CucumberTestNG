package pagesfactory.login;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    WebElement inpUsername;

    @FindBy(id = "password")
    WebElement inpPassword;

    @FindBy(id = "login-button")
    WebElement btnlogin;

    @FindBy(xpath = "//div[@class='error-message-container error']//h3")
    WebElement ctrNotificationMessage;

    public LoginPage(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }
}
