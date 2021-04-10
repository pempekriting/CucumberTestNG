package pagesfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class MyAccountPage {
	public static WebDriver driver;
	
	@FindBy(xpath = "//h1[normalize-space()='My account']")
	private WebElement headerMyAccount;
	
	public MyAccountPage(WebDriver driver) {
		MyAccountPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
