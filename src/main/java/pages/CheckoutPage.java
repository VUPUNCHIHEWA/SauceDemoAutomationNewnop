package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;

    
    private By txtFirstName = By.id("first-name");
    private By txtLastName = By.id("last-name");
    private By txtPostalCode = By.id("postal-code");
    private By btnContinue = By.id("continue");

    
    private By btnFinish = By.id("finish");
    private By lblConfirmationHeader = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInformation(String firstName, String lastName, String postalCode) {
        driver.findElement(txtFirstName).sendKeys(firstName);
        driver.findElement(txtLastName).sendKeys(lastName);
        driver.findElement(txtPostalCode).sendKeys(postalCode);
        driver.findElement(btnContinue).click();
    }

    public void clickFinish() {
        driver.findElement(btnFinish).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(lblConfirmationHeader).getText();
    }
}
