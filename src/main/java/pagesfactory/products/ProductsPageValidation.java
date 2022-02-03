package pagesfactory.products;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPageValidation extends ProductsPage {

    public boolean isOnPage() {
        return getWait().until(ExpectedConditions.visibilityOf(ctrInventory)).isDisplayed();
    }
}
