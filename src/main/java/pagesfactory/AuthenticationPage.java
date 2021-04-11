package pagesfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class AuthenticationPage {
	public static WebDriver driver;
	
	@FindBy(id = "email_create")
	private WebElement inpEmailRegistration;
	
	@FindBy(id = "email")
	private WebElement inpEmail;
	
	@FindBy(id = "passwd")
	private WebElement inpPassword;
	
	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	private WebElement btnCreateAccount;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	private WebElement btnSignIn;
	
	@FindBy(xpath = "//a[@title='Log me out']")
	private WebElement btnSignOut;
	
	@FindBy(xpath = "//li[normalize-space()='Authentication failed.']")
	private WebElement divAuthenticationFailed;
	
	@FindBy(xpath = "//li[normalize-space()='An email address required.']")
	private WebElement divEmailAddressRequired;
	
	@FindBy(xpath = "//li[normalize-space()='Password is required.']")
	private WebElement divPasswordRequired;
	
	public AuthenticationPage(WebDriver driver) {
		AuthenticationPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillFormsignIn(String email, String password) {
		inpEmail.clear();
		inpEmail.sendKeys(email);
		
		inpPassword.clear();
		inpPassword.sendKeys(password);
	}
	
	public void clickButtonSignIn() {
		btnSignIn.click();
	}
	
	public void registerNewAccount(String email) {
		inpEmailRegistration.sendKeys(email);
		
		btnCreateAccount.click();
	}
	
	public void clickButtonSignOut() {
		btnSignOut.click();
	}
}
