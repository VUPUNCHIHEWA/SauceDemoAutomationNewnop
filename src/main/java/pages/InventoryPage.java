package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;


    private By btnAddToCartSauceLabsBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private By btnAddToCartSauceLabsBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private By shoppingCartBadge = By.className("shopping_cart_badge");
    private By btnCart = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addTwoItemsToCart() {
        driver.findElement(btnAddToCartSauceLabsBackpack).click();
        driver.findElement(btnAddToCartSauceLabsBikeLight).click();
    }

    public String getCartBadgeCount() {
        return driver.findElement(shoppingCartBadge).getText();
    }

    public void clickCart() {
        driver.findElement(btnCart).click();
    }
}