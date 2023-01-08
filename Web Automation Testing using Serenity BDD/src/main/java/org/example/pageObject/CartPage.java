package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[.='Your Cart']")
    private WebElement displayCheckOutPage;

    @FindBy(id = "cart_contents_container")
    private  WebElement cartContentsContainer;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckOut;

    @FindBy(xpath = "//span[.='Checkout: Your Information']")
    private WebElement displayCheckOutPageInformation;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;

    public boolean isDisplayCheckOutPage()
    {
        return displayCheckOutPage.isDisplayed();
    }

    public boolean isDisplayProduct(String products)
    {
        boolean dataReturn = false;
        String[] listOfProduct = products.split(",");
        WebElement product;
        for (String productName:
                listOfProduct)
        {
            product = cartContentsContainer.findElement(By.xpath("//div[text()='"+ productName +"']"));
            dataReturn = product.isDisplayed();
            if (!dataReturn)
            {
                return dataReturn;
            }
        }
        return dataReturn;
    }

    public void removeToCartContainer(String products) {
        String[] listOfProduct = products.split(",");
        WebElement selectedProduct;
        for (String productName:
                listOfProduct) {
            String xPathSelectedProduct = "//button[@id='remove-"+productName.toLowerCase().replace(" ", "-")+"']";
            selectedProduct = cartContentsContainer.findElement(By.xpath(xPathSelectedProduct));
            selectedProduct.click();
        }
    }

    public void clickCheckOutButton()
    {
        btnCheckOut.click();
    }

    public boolean isDisplayCheckOutPageInformation()
    {
        return displayCheckOutPageInformation.isDisplayed();
    }

    public void setFirstName(String firstName1)
    {
        firstName.sendKeys(firstName1);
    }

    public void setLastName(String lastName1)
    {
        lastName.sendKeys(lastName1);
    }

    public void setPostalCode(String postalCode1)
    {
        postalCode.sendKeys(postalCode1);
    }

    public void clickContinue()
    {
        btnContinue.click();
    }

}