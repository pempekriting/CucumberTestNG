package pagesfactory.login;

import context.TestContext;

public class LoginPageAction extends LoginPage {
    public LoginPageAction(TestContext testContext) {
        super(testContext);
    }

    public LoginPageAction inputUsername(String username) {
        inpUsername.sendKeys(username);
        return this;
    }

    public LoginPageAction inputPassword(String username) {
        inpPassword.sendKeys(username);
        return this;
    }

    public void andLogin() {
        btnlogin.click();
    }

    public String getMessageContainer() {
        return ctrNotificationMessage.getText().trim();
    }
}
