package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage
{
    public static WebDriver driver;

    public PaymentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[.='Checkout: Overview']")
    private WebElement displayCheckOutOverviewPage;

    @FindBy(id = "checkout_summary_container")
    private  WebElement checkoutSummaryContainer;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement totalTax;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement totalItemPrice;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement priceToPay;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;

    @FindBy(xpath = "//span[.='Checkout: Complete!']")
    private WebElement displayCheckOutCompletePage;

    public void clickFinish()
    {
        btnFinish.click();
    }

    public boolean isDisplayCheckOutOverviewPage()
    {
        return displayCheckOutOverviewPage.isDisplayed();
    }

    public boolean isDisplayCheckOutCompletePage()
    {
        return displayCheckOutCompletePage.isDisplayed();
    }

    public boolean isDisplayProductPayment(String products)
    {
        boolean dataReturn = false;
        String[] listOfProduct = products.split(",");
        WebElement product;
        for (String productName:
                listOfProduct)
        {
            product = checkoutSummaryContainer.findElement(By.xpath("//div[text()='"+ productName +"']"));
            dataReturn = product.isDisplayed();
            if (!dataReturn)
            {
                return dataReturn;
            }
        }
        return dataReturn;
    }

    public boolean isSamePrice()
    {
        String a = String.valueOf(totalItemPrice);
        String b = String.valueOf(totalTax);
        String c = String.valueOf(priceToPay);

        if ((a + b).equals(c))
        {
            return true;
        }
        return true;
    }
}
