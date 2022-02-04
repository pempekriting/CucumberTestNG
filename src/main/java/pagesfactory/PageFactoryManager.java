package pagesfactory;

import context.TestContext;
import pagesfactory.login.LoginPageAction;
import pagesfactory.login.LoginPageValidation;
import pagesfactory.products.ProductsPageValidation;

public class PageFactoryManager {
    private static LoginPageAction loginPageAction;
    private static LoginPageValidation loginPageValidation;
    private static ProductsPageValidation productsPageValidation;

    public static LoginPageAction getLoginPageAction(TestContext context) {
        return loginPageAction == null ? new LoginPageAction(context) : loginPageAction;
    }

    public static LoginPageValidation getLoginPageValidation(TestContext context) {
        return loginPageValidation == null ? new LoginPageValidation(context) : loginPageValidation;
    }

    public static ProductsPageValidation getProductsPageValidation(TestContext context) {
        return productsPageValidation == null ? new ProductsPageValidation(context) : productsPageValidation;
    }
}
