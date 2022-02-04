package steps;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pagesfactory.PageFactoryManager;
import pagesfactory.login.LoginPageAction;
import pagesfactory.login.LoginPageValidation;
import pagesfactory.products.ProductsPageValidation;

public class LoginSteps {
    private final LoginPageAction action;
    private final LoginPageValidation loginPageValidation;
    private final ProductsPageValidation productsPageValidation;

    public LoginSteps(TestContext context) {
        action = PageFactoryManager.getLoginPageAction(context);
        loginPageValidation = PageFactoryManager.getLoginPageValidation(context);
        productsPageValidation = PageFactoryManager.getProductsPageValidation(context);
    }

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        Assert.assertTrue(loginPageValidation.isOnPage());
    }

    @Then("Notification error {} is displayed")
    public void notificationErrorAuthenticationFailedIsDisplayed(String messageNotification) {
        Assert.assertTrue(action.getMessageContainer().contains(messageNotification));
    }

    @When("User provide invalid username and password")
    public void userProvideInvalidUsernameAndPassword() {
        action.inputUsername("invalid_username")
                .inputPassword("password")
                .andLogin();
    }

    @When("User provide valid username and password")
    public void userProvideValidUsernameAndPassword() {
        action.inputUsername("standard_user")
                .inputPassword("secret_sauce")
                .andLogin();
    }

    @Then("User directed to the products page")
    public void userDirectedToTheProductsPage() {
        Assert.assertTrue(productsPageValidation.isOnPage());
    }

    @When("User provide invalid username")
    public void userProvideInvalidUsername() {
        action.inputUsername("invalid")
                .inputPassword("secret_sauce")
                .andLogin();
    }

    @When("User provide invalid password")
    public void userProvideInvalidPassword() {
        action.inputUsername("standard_user")
                .inputPassword("invalid")
                .andLogin();
    }

    @When("User not provide the data for login")
    public void userNotProvideTheDataForLogin() {
        action.andLogin();
    }

    @When("User provide password only")
    public void userProvidePasswordOnly() {
        action.inputPassword("secret_sauce")
                .andLogin();
    }

    @When("User provide username only")
    public void userProvideUsernameOnly() {
        action.inputUsername("standard_user")
                .andLogin();
    }
}
