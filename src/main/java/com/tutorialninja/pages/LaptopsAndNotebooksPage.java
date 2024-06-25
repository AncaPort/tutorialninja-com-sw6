package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyLink;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndDesktopTab;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllLaptops & Notebooks')]")
    WebElement showAllLaptopsAndNotebooksTab;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortByPriceHighToLow;

    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    WebElement getSortByHighToLowOrder;

    @CacheLookup
    @FindBy(linkText = "Sony VAIO")
    WebElement sonyTab;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement getSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Shopping Cart')]")
    WebElement getShoppingCartText;

    @CacheLookup
    @FindBy(linkText = "Sony VAIO")
    WebElement getProductSonyVaioText;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement changeQuantityTo2;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement updateTab;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement getMessageModifiedCart;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement getTotalPriceText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkoutButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement getCheckoutText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-6']//h2")
    WebElement getNewCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@name='account' and @value='guest']")
    WebElement guestCheckoutRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueTab;

    @CacheLookup
    @FindBy(name = "firstname")
    WebElement nameField;

    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastnameField;

    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephone;

    @CacheLookup
    @FindBy(name = "address_1")
    WebElement address1;

    @CacheLookup
    @FindBy(name = "city")
    WebElement cityName;

    @CacheLookup
    @FindBy(name = "postcode")
    WebElement postCode;

    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement countryName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement zoneName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement addCommentsToTextArea;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]")
    WebElement termsAndConditionsCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement finalContinueButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement getPaymentMethodMessage;


    public void mouseHoverOnLaptopsAndDesktopTab() {
        log.info("MouseHover On LaptopsAndDesktopTab" + laptopsAndDesktopTab.toString());
        mouseHoverToElementAndClick(laptopsAndDesktopTab);
    }

    public void clickOnShowAllLaptopsAndNotebooks() {
        log.info("clickOnShowAllLaptopsAndNotebooks" + showAllLaptopsAndNotebooksTab.toString());
        clickOnElement(showAllLaptopsAndNotebooksTab);
    }

    public void sortByPriceHighToLow() {
        log.info("Sort By PriceHighToLow" + sortByPriceHighToLow.toString());
        selectByVisibleTextFromDropDown(sortByPriceHighToLow, "Price (High > Low)");
    }

    public String GetSortByHighToLowOrder() {
        // Get all the products price and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (Low > High)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
        // Assert.assertEquals("Product not sorted by price High to Low",
        // originalProductsPrice, afterSortByPrice);

        return null;

    }

    public void clickOnCurrencyLink() {
        clickOnElement(currencyLink);
        List<WebElement> currencyList = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }

    public void clickOnSonyTab() {
        log.info("Click On MacBookTab" + sonyTab.toString());
        clickOnElement(sonyTab);
    }

    public void clickOnAddToCartButton() {
        log.info("Click On AddToCartButton" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getSuccessTextFromLink() {
        log.info("Get SuccessText From Link" + getSuccessMessage.toString());
        return getTextFromElement(getSuccessMessage);
    }

    public void clickOnShoppingCart() {
        log.info("Click On ShoppingCart" + shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);
    }

    public String getShoppingCartMessage() {
        log.info("get ShoppingCart Message" + getShoppingCartText.toString());
        return getTextFromElement(getShoppingCartText);
    }

    public String getVerifyProductSonyVaio() {
        log.info("Get VerifyProduct Macbook" + getProductSonyVaioText.toString());
        return getTextFromElement(getProductSonyVaioText);
    }

    public void changeQuantityTo2() {
        driver.findElement(By.xpath("//input[contains(@name, 'quantity')]")).clear();

    }

    public void sendTextChangeQuantityTo2(String text) {
        log.info("sendTextChangeQuantityTo2" + changeQuantityTo2.toString());
        sendTextToElement(changeQuantityTo2, "2");
    }

    public void clickOnUpdateCart() {
        log.info("Click On UpdateCart" + updateTab.toString());
        clickOnElement(updateTab);
    }

    public String getSuccessModifiedCartMessage() {
        log.info("getSuccessModifiedCartMessage" + getMessageModifiedCart.toString());
        return getTextFromElement(getMessageModifiedCart);
    }

    public String getVerifyTotal() {
        log.info("Get VerifyTotal" + getTotalPriceText.toString());
        return getTextFromElement(getTotalPriceText);
    }

    public void clickOnCheckoutButton() {
        log.info("Click On CheckoutButton" + checkoutButton.toString());
        clickOnElement(checkoutButton);
    }

    public String getCheckoutText() {
        log.info("Get Checkout Text" + getCheckoutText.toString());
        return getTextFromElement(getCheckoutText);
    }

    public String getNewCustomerText() {
        log.info("Get NewCustomer Text" + getNewCustomerText.toString());
        return getTextFromElement(getNewCustomerText);
    }

    public void clickOnGuestCheckoutRadioButton() {
        log.info("Click On GuestCheckoutRadioButton" + guestCheckoutRadioButton.toString());
        clickOnElement(guestCheckoutRadioButton);
    }

    public void clickOnContinueTab() {
        log.info("Click On ContinueTab" + continueTab.toString());
        clickOnElement(continueTab);
    }

    public void enterName(String name) {
        log.info("Enter Name " + name + " in firstname field" + nameField.toString());
        sendTextToElement(nameField, name);
    }

    public void enterLastName(String lastname) {
        log.info("Enter LastName " + lastname + " in lastname field " + lastnameField.toString());
        sendTextToElement(lastnameField, lastname);
    }

    public void enterEmail(String email) {
        log.info("Enter Email  " + email + " to email field" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterTelephone(String phone) {
        log.info("Enter Telephone " + phone + " in telephone field " + phone.toString());
        sendTextToElement(telephone, phone);
    }

    public void enterAddress(String street) {
        log.info("enter Address" + address1.toString());
        sendTextToElement(address1, street);
    }

    public void enterCity(String city) {
        log.info("Enter City " + cityName.toString());
        sendTextToElement(cityName, city);
    }

    public void enterPostcode(String code) {
        log.info("Enter Postcode" + postCode.toString());
        sendTextToElement(postCode, code);
    }

    public void enterCountry(String country) {
        log.info("enter Country" + countryName.toString());
        sendTextToElement(countryName, country);
    }

    public void enterZone(String state) {
        log.info("enter Zone" + zoneName.toString());
        sendTextToElement(zoneName, state);
    }

    public void clickOnContinueButton() {
        log.info("clickOnContinueButton" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void enterTextToTextArea(String message) {
        log.info("enterTextToTextArea" + addCommentsToTextArea.toString());
        sendTextToElement(addCommentsToTextArea, message);
    }

    public void clickOnTermsAndConditionsCheckbox() {
        log.info("clickOnTermsAndConditionsCheckbox" + termsAndConditionsCheckBox.toString());
        clickOnElement(termsAndConditionsCheckBox);
    }

    public void clickOnFinalContinueButton() {
        log.info("clickOnFinalContinueButton" + finalContinueButton.toString());
        clickOnElement(finalContinueButton);
    }

    public String getWarningPaymentMethodRequiredText() {
        log.info("getWarningPaymentMethodRequiredText" + getPaymentMethodMessage.toString());
        return getTextFromElement(getPaymentMethodMessage);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    WebElement continue1;

    public void clickOnContinue1() {
        clickOnElement(continue1);
        log.info("Click on continue" + continue1.toString());
    }
}
