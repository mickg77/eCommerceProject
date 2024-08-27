package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class launchCheckoutPage {
    WebDriver driver;

    public launchCheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //stop forgetting this!!!
    }


    @FindBy(id = "menu-item-44")
    WebElement cartLink;
    public void clickCart() {
        cartLink.click();
    }



    public void clickCheckoutLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           WebElement checkoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Checkout")));
        checkoutLink.click();
        System.out.println("First Name Entered");
    }

    @FindBy(id = "billing_first_name")
    WebElement firstNameBox;
    public void enterFirstName() {
        firstNameBox.click();
        firstNameBox.clear();
        firstNameBox.sendKeys("Mickey");
        System.out.println("First Name Entered");
    }


    @FindBy(id = "billing_last_name")
    WebElement lastNameBox;
    public void enterLastName() {

        lastNameBox.click();
        lastNameBox.clear();
        lastNameBox.sendKeys("Mouse");
        System.out.println("Last Name Entered");
    }

    @FindBy(id = "select2-billing_country-container")
    WebElement billingCountry;
    public void chooseBillingCountry() {

        billingCountry.click();
        System.out.println("Billing Country chosen");
    }

    @FindBy(id = "billing_address_1")
    WebElement billingAddressBox;
    public void enterBillingAddress() {
        billingAddressBox.click();
        billingAddressBox.clear();
        billingAddressBox.sendKeys("123 Main Road");
        System.out.println("Billing Address 1 entered");
    }

    @FindBy(id = "billing_city")
    WebElement billingCityBox;
    public void enterBillingCity() {
        billingCityBox.click();
        billingCityBox.clear();
        billingCityBox.sendKeys("Glasgow");
        System.out.println("Billing City Entered");
    }
    @FindBy(id = "billing_phone")
    WebElement billingPhoneBox;
    public void enterPhoneNumber() {
        billingPhoneBox.click();
        billingPhoneBox.clear();
        billingPhoneBox.sendKeys("0141 432 1234");
        System.out.println("Billing Phone Entered");

    }

    @FindBy(id = "billing_postcode")
    WebElement billingPostcode;
    public void enterPostcode() {
        billingPostcode.click();
        billingPostcode.clear();
        billingPostcode.sendKeys("G11 3XY");
        System.out.println("Billing Postcode Entered");
    }


    public void enterEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //had to add this to stop the JQuery overlay blocking the button. The button being present wasn't enough.
        WebElement emailBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("billing_email")));
        emailBox.click();
        emailBox.clear();
        emailBox.sendKeys("mickeymouse@hotmail.com");
        System.out.println("Email address entered");
    }


    public void placeOrder() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //had to add this to stop the JQuery overlay blocking the button. The button being present wasn't enough.
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".blockUI.blockOverlay")));

        WebElement placeOrderBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("place_order")));
        System.out.println("waiting to be clickable");
        placeOrderBtn.click();
        System.out.println("Place Order");

    }


}