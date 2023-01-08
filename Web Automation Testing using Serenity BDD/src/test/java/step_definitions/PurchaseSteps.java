package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.CartPage;
import org.example.pageObject.InventoryPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps
{
    private WebDriver webDriver;

    public PurchaseSteps()
    {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User pick item Sauce Labs Backpack")
    public void clickItemBasket1() throws InterruptedException
    {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickBasket1();
        Thread.sleep(3000);
    }

    @Then("User already on landing page")
    public void verifyLandingPage() throws InterruptedException
    {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Assert.assertTrue(inventoryPage.isDisplayLandingPage());
        Thread.sleep(3000);
    }

    @And("User sort product by \"(.*)\" as sortBy")
    public void sortProduct(String sortBy) throws InterruptedException
    {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.sortProductBy(sortBy);
        Thread.sleep(3000);
    }

    @And("User checkout \"(.*)\" as products to cart")
    public void addProductToCart(String products) throws InterruptedException
    {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.addToCart(products);
        Thread.sleep(3000);
    }

    @And("User click on checkout icon")
    public void verifyCheckOutPage() throws InterruptedException
    {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        CartPage checkOutPage = new CartPage(webDriver);
        inventoryPage.clickCart();
        Thread.sleep(3000);
        Assert.assertTrue(checkOutPage.isDisplayCheckOutPage());
        Thread.sleep(3000);
    }

}