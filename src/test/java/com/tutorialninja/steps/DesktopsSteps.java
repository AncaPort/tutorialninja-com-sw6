package com.tutorialninja.steps;

import com.tutorialninja.pages.DesktopsPage;
import com.tutorialninja.pages.TopMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopsSteps {

    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I  Mouse hover on Desktops Tab and click")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new TopMenuPage().mouseHoverToElementAndClickOnDesktop();
    }

    @And("I Click on “Show All Desktops”")
    public void iClickOnShowAllDesktops() {
        new TopMenuPage().selectMenu("Show AllDesktops");
    }

    @And("I Select Sort By position {string}")
    public void iSelectSortByPosition(String order) {
        new DesktopsPage().sortByPositionNameZtoA("Name (Z - A)");
    }

    @Then("I Verify the Product will arrange in Descending order.")
    public void iVerifyTheProductWillArrangeInDescendingOrder() {
        new DesktopsPage().getProductsArrangeInDescendingOrderText();
    }

    @When("I Mouse hover on Currency Dropdown and click")
    public void iMouseHoverOnCurrencyDropdownAndClick() {
        new DesktopsPage().clickOnCurrencyLink();
    }


    @And("I Mouse hover on £Pound Sterling and click")
    public void iMouseHoverOn£PoundSterlingAndClick() {
        new DesktopsPage().clickOnPoundsterling();
    }


    @And("I Mouse hover on Desktops Tab.")
    public void iMouseHoverOnDesktopsTab() {
        new TopMenuPage().mouseHoverToElementAndClickOnDesktop();
        new TopMenuPage().selectMenu("Show AllDesktops");
    }


    @And("I Select product “<product>”")
    public void iSelectProductProduct(String product) {
        new DesktopsPage().clickOnProduct(product);
    }


    @And("I Verify the Text {string}")
    public void iVerifyTheText(String product) {
        Assert.assertEquals(new DesktopsPage().getProductName(), product);
    }

    @And("I Enter Qty 1 using Select class")
    public void iEnterQtyUsingSelectClass(String qty) {
        new DesktopsPage().enterQuantity1("1");
    }

    @And("I Click on “Add to Cart” button")
    public void iClickOnAddToCartButton() {
        new DesktopsPage().clickOnAdToCart();
    }

    @And("I Verify the Message “Success: You have added “<product>” to your shopping cart!”")
    public void iVerifyTheMessageSuccessYouHaveAddedProductToYourShoppingCart(String product) {
        String expectedMessage = "Success: You have added " + product + " to your shopping cart!";
        Assert.assertEquals(new DesktopsPage().getSuccessAlertMsg().substring(0, expectedMessage.length()), expectedMessage);

    }

    @And("I Click on link “shopping cart” display into success message")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new DesktopsPage().clickOnShoppingCart();
    }

    @And("I Verify the Product name {string}")
    public void iVerifyTheProductName(String productName) {
        Assert.assertEquals(new DesktopsPage().getProductName(), productName);
    }

    @And("I Verify the Model <model>")
    public void iVerifyTheModelModel(String model) {
        Assert.assertEquals(new DesktopsPage().getModel(), model);
    }

    @And("I Verify the Total {string}")
    public void iVerifyTheTotal(String total) {
        Assert.assertEquals(new DesktopsPage().getTotal(), total);

    }

}