package pagesfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class TopBarPages {
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	private WebElement btnSignIn;
	
	public TopBarPages(WebDriver driver) {
		TopBarPages.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickButtonSignIn() {
		btnSignIn.click();
	}
}
