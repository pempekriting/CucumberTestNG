package pagesfactory.products;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class ProductsPage extends BasePage {

    @FindBy(id = "inventory_container")
    WebElement ctrInventory;

    public ProductsPage() {
        PageFactory.initElements(getDriver(), this);
    }
}
