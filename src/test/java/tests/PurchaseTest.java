package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.InventoryPage;
import pages.CartPage;
import pages.CheckoutPage;

public class PurchaseTest extends BaseTest {

    @Test
    public void testEndToTargetPurchaseFlow() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");


        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addTwoItemsToCart();
        Assert.assertEquals(inventoryPage.getCartBadgeCount(), "2", "Cart badge count is incorrect!");


        inventoryPage.clickCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();


        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillInformation("Vishwani", "Punchihewa", "10230");


        checkoutPage.clickFinish();
        String confirmationMsg = checkoutPage.getConfirmationMessage();
        Assert.assertEquals(confirmationMsg, "Thank you for your order!", "Order completion failed!");
    }
}