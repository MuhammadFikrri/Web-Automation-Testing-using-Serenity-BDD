package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.PaymentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PaymentSteps
{
    private WebDriver webDriver;

    public PaymentSteps()
    {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on Checkout: Overview Page")
    public void verifyDisplayCheckOutOverview() throws InterruptedException
    {
        PaymentPage paymentPage = new PaymentPage(webDriver);
        Assert.assertTrue(paymentPage.isDisplayCheckOutOverviewPage());
        Thread.sleep(3000);
    }

    @Then("User verify that \"(.*)\" as products in payment list")
    public void verifyListOfProduct(String products) throws InterruptedException
    {
        PaymentPage paymentPage = new PaymentPage(webDriver);
        Assert.assertTrue(paymentPage.isDisplayProductPayment(products));
        Thread.sleep(3000);
    }

    @And("User verifies the price of goods according to the price displayed")
    public void verifyPriceOfProduct() throws InterruptedException
    {
        PaymentPage paymentPage = new PaymentPage(webDriver);
        Assert.assertTrue(paymentPage.isSamePrice());
        Thread.sleep(3000);
    }

    @And("User click on finish button")
    public void clickFinishButton() throws InterruptedException
    {
        PaymentPage paymentPage = new PaymentPage(webDriver);
        paymentPage.clickFinish();
        Thread.sleep(3000);
    }

    @Then("User already on Checkout: Complete!")
    public void verifyDisplayCheckOutComplete() throws InterruptedException
    {
        PaymentPage paymentPage = new PaymentPage(webDriver);
        Assert.assertTrue(paymentPage.isDisplayCheckOutCompletePage());
        Thread.sleep(3000);
    }
}
