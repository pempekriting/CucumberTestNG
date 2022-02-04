package pagesfactory.products;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPageValidation extends ProductsPage {

    public ProductsPageValidation(TestContext context) {
        super(context);
    }

    public boolean isOnPage() {
        return getWait().until(ExpectedConditions.visibilityOf(ctrInventory)).isDisplayed();
    }
}
