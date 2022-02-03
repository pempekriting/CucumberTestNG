package pagesfactory.login;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageValidation extends LoginPage {
    public boolean isOnPage() {
        return getWait().until(ExpectedConditions.visibilityOf(btnlogin)).isDisplayed();
    }
}
