package pagesfactory.login;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageValidation extends LoginPage {
    public LoginPageValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean isOnPage() {
        return getWait().until(ExpectedConditions.visibilityOf(btnlogin)).isDisplayed();
    }
}
