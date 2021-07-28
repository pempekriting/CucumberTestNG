package steps;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.RunnerTest;

public class Login extends RunnerTest {
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		
	}

	@Given("User go to menu sign in")
	public void user_go_to_menu_sign_in() {
		wait.until(ExpectedConditions.visibilityOf(topBarPages.getBtnSignIn()));
		topBarPages.clickButtonSignIn();
	}

	@When("User enters <email> and <password>")
	public void user_enters_email_and_password(DataTable dataTable) {
		authenticationPage.fillFormsignIn(dataTable.cell(1, 0), dataTable.cell(1, 1));
	}
	
	@When("User enter <password>")
	public void user_enter_password(DataTable dataTable) {
		authenticationPage.fillFormsignIn("", dataTable.cell(1, 0));
	}
	
	@When("User enter <email>")
	public void user_enters_email(DataTable dataTable) {
		authenticationPage.fillFormsignIn(dataTable.cell(1, 0), "");
	}

	@When("Click sign in button")
	public void click_sign_in_button() {
		authenticationPage.clickButtonSignIn();
	}

	@Then("User can visit my account page")
	public void user_can_visit_my_account_page() {
		wait.until(ExpectedConditions.visibilityOf(myAccountPage.getHeaderMyAccount()));
		authenticationPage.clickButtonSignOut();
	}
	
	@Then("Notification error authentication failed is displayed")
	public void notification_error_authentication_failed_is_displayed() {
		wait.until(ExpectedConditions.visibilityOf(authenticationPage.getDivAuthenticationFailed()));
	}
	
	@Then("Notification error email address required is displayed")
	public void notification_error_email_address_required_is_displayed() {
		wait.until(ExpectedConditions.visibilityOf(authenticationPage.getDivEmailAddressRequired()));
	}
	
	@Then("Notification error password required is displayed")
	public void notification_error_password_required_is_displayed() {
		wait.until(ExpectedConditions.visibilityOf(authenticationPage.getDivPasswordRequired()));
	}
}
