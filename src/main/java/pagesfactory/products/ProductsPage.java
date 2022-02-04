package pagesfactory.products;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class ProductsPage extends BasePage {

    @FindBy(id = "inventory_container")
    WebElement ctrInventory;

    public ProductsPage(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }
}
