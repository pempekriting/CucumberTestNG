package pagesfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import lombok.Getter;

@Getter
public class FormRegistrationPage {
	public static WebDriver driver;

	@FindBy(id = "uniform-id_gender1")
	private WebElement rdbTitleMale;

	@FindBy(id = "uniform-id_gender2")
	private WebElement rdbTitleFemale;

	@FindBy(id = "customer_firstname")
	private WebElement inpCustomerFirstName;

	@FindBy(id = "customer_lastname")
	private WebElement inpCustomerLastName;

	@FindBy(id = "passwd")
	private WebElement inpPassword;

	@FindBy(id = "days")
	private WebElement slctDays;

	@FindBy(id = "months")
	private WebElement slctMonths;

	@FindBy(id = "years")
	private WebElement slctYears;

	@FindBy(id = "firstname")
	private WebElement inpFirstName;

	@FindBy(id = "lastname")
	private WebElement inpLastName;

	@FindBy(id = "address1")
	private WebElement inpFirstAddress;

	@FindBy(id = "city")
	private WebElement inpCity;

	@FindBy(id = "id_state")
	private WebElement slctState;

	@FindBy(id = "postcode")
	private WebElement inpPostCode;

	@FindBy(id = "id_country")
	private WebElement slctCountry;

	@FindBy(id = "phone_mobile")
	private WebElement inpMobilePhone;

	@FindBy(id = "alias")
	private WebElement inpAlias;

	@FindBy(id = "submitAccount")
	private WebElement btnRegister;

	public FormRegistrationPage(WebDriver driver) {
		FormRegistrationPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillFormRegistration(String gender, String customerFirstName, String customerLastName, String password,
			String days, String month, String years, String firstName, String lastName, String firstAddress,
			String city, String state, String postCode, String country, String mobilePhone, String aliasName) {
		
		Select drpDays = new Select(slctDays);
		Select drpMonth = new Select(slctMonths);
		Select drpYears = new Select(slctYears);
		Select drpState = new Select(slctState);
		Select drpCountry = new Select(slctCountry);
		
		if (gender == "male") {
			rdbTitleMale.click();
		}

		if (gender == "female") {
			rdbTitleFemale.click();
		}

		if (gender != "male" || gender != "female") {
			System.out.println("Please insert correct gender");
		}

		inpCustomerFirstName.sendKeys(customerFirstName);
		inpCustomerLastName.sendKeys(customerLastName);
		inpPassword.sendKeys(password);
		drpDays.selectByValue(days);
		drpMonth.selectByValue(month);
		drpYears.selectByValue(years);
		inpFirstName.sendKeys(firstName);
		inpLastName.sendKeys(lastName);
		inpFirstAddress.sendKeys(firstAddress);
		inpCity.sendKeys(city);
		drpState.selectByValue(state);
		inpPostCode.sendKeys(postCode);
		drpCountry.selectByValue(country);
		inpMobilePhone.sendKeys(mobilePhone);
		inpAlias.sendKeys(aliasName);
	}

	public void clickButtonRegister() {
		btnRegister.click();
	}
}
