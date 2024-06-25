package com.tutorialninja.steps;

import com.tutorialninja.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LaptopsNotebookStep {
    @When("I Mouse hover on Laptops & Notebooks Tab and click")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new LaptopsAndNotebooksPage().mouseHoverOnLaptopsAndDesktopTab();
    }

    @And("I Click on “Show All Laptops & Notebooks”")
    public void iClickOnShowAllLaptopsNotebooks() {
        new LaptopsAndNotebooksPage().clickOnShowAllLaptopsAndNotebooks();
    }

    @And("I Select Sort By {string}")
    public void iSelectSortBy(String arg0) {
        new LaptopsAndNotebooksPage().sortByPriceHighToLow();
    }

    @Then("Verify the Product price will arrange in High to Low order")
    public void verifyTheProductPriceWillArrangeInHighToLowOrder() {
        new LaptopsAndNotebooksPage().GetSortByHighToLowOrder();
    }

    @And("I Select Product “Sony VAIO”")
    public void iSelectProductSonyVAIO() {
        new LaptopsAndNotebooksPage().clickOnSonyTab();
    }

    @And("I Click on ‘Add To Cart’ button")
    public void iClickOnAddToCartButton() {
        new LaptopsAndNotebooksPage().clickOnAddToCartButton();
    }

    @And("I Verify the message “Success: You have added Sony VAIO to your shopping cart!”")
    public void iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getSuccessTextFromLink(),"Success: You have added Sony VAIO to your shopping cart!\n" + "×");
    }

    @And("I Change Quantity {string}")
    public void iChangeQuantity(String qty) {
        new LaptopsAndNotebooksPage().changeQuantityTo2();
        new LaptopsAndNotebooksPage().sendTextChangeQuantityTo2("2");
    }

    @And("I Click on “Update” Tab")
    public void iClickOnUpdateTab() {
        new LaptopsAndNotebooksPage().clickOnUpdateCart();
    }

    @And("I Verify the message “Success: You have modified your shopping cart!”")
    public void iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getSuccessModifiedCartMessage(),"Success: You have modified your shopping cart!\n" + "×");
    }

    @And("I Verify the Total ")
    public void iVerifyTheTotal() throws InterruptedException {
       Assert.assertEquals(new LaptopsAndNotebooksPage().getVerifyTotal(),"$2,404.00","price not dispalyed");
       Thread.sleep(2000);
    }


    @And("I Click on “Checkout” button")
    public void iClickOnCheckoutButton() {
        new LaptopsAndNotebooksPage().clickOnCheckoutButton();
    }

    @And("I Verify the text “Checkout”")
    public void iVerifyTheTextCheckout() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getCheckoutText(),"Checkout","message not displayed");
    }

    @And("I Verify the Text “New Customer”")
    public void iVerifyTheTextNewCustomer() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getNewCustomerText(),"New Customer","message not dispalyed");
    }

    @And("I Click on “Guest Checkout” radio button")
    public void iClickOnGuestCheckoutRadioButton() {
        new LaptopsAndNotebooksPage().clickOnGuestCheckoutRadioButton();
    }

    @And("I Click on “Continue” tab")
    public void iClickOnContinueTab() {
        new LaptopsAndNotebooksPage().clickOnContinueTab();
    }

    @And("I Fill the mandatory fields")
    public void iFillTheMandatoryFields() {
        new LaptopsAndNotebooksPage().enterName("Shita");
        new LaptopsAndNotebooksPage().enterLastName("Sangani");
        new LaptopsAndNotebooksPage().enterEmail("prime1234@gmail.com");
        new LaptopsAndNotebooksPage().enterTelephone("1234567890");
        new LaptopsAndNotebooksPage().enterAddress("1,kenton road");
        new LaptopsAndNotebooksPage().enterCity("Harrow");
        new LaptopsAndNotebooksPage().enterPostcode("HA3 5NV");
        new LaptopsAndNotebooksPage().enterCountry("America");
        new LaptopsAndNotebooksPage().enterZone("Angus");
    }

    @And("I Click on “Continue” Button")
    public void iClickOnContinueButton() {
        new LaptopsAndNotebooksPage().clickOnContinueButton();
    }

    @And("I Add Comments About your order into text area")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new LaptopsAndNotebooksPage().enterTextToTextArea("Please confirm delivery date");
        new LaptopsAndNotebooksPage().clickOnContinue1();
    }

    @And("I Check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox() {
        new LaptopsAndNotebooksPage().clickOnTermsAndConditionsCheckbox();
    }

    @Then("I Click on final “Continue” button")
    public void iClickOnFinalContinueButton() {
        new LaptopsAndNotebooksPage().clickOnFinalContinueButton();
    }


}
