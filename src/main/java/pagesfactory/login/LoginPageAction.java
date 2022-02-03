package pagesfactory.login;

public class LoginPageAction extends LoginPage {
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
