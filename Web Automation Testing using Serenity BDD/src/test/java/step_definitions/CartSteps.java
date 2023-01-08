package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps
{
    private WebDriver webDriver;

    public CartSteps()
    {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User verify that \"(.*)\" as products in a list")
    public void verifyListOfProduct(String products) throws InterruptedException
    {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.isDisplayProduct(products));
        Thread.sleep(3000);
    }

    @And("User remove \"(.*)\" as products in a list")
    public void removeListOfProduct(String products) throws InterruptedException
    {
        CartPage checkOutPage = new CartPage(webDriver);
        checkOutPage.removeToCartContainer(products);
        Thread.sleep(5000);
    }

    @And("User click checkout button")
    public void clickCheckOutButton1() throws InterruptedException
    {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCheckOutButton();
        Thread.sleep(3000);
    }

    @Then("User already on Checkout: Your Information")
    public void verifyLandingPage() throws InterruptedException
    {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.isDisplayCheckOutPageInformation());
        Thread.sleep(3000);
    }

    @When("User input \"(.*)\" as First Name , input \"(.*)\" as Last Name and input \"(.*)\" as Zip/Postal Code")
    public void inputCredential(String firstName, String lastName, String postalCode) throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.setFirstName(firstName);
        Thread.sleep(1000);
        cartPage.setLastName(lastName);
        Thread.sleep(1000);
        cartPage.setPostalCode(postalCode);
        Thread.sleep(2000);
        cartPage.clickContinue();
        Thread.sleep(2000);
    }

}
