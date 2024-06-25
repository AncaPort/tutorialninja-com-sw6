package com.tutorialninja.steps;

import com.tutorialninja.pages.TopMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TopMenuSteps {

    @Given("I Mouse hover on “Desktops” Tab and click")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new TopMenuPage().mouseHoverToElementAndClickOnDesktop();
    }

    @And("I click on “Show All Desktops”")
    public void iClickOnShowAllDesktops() {
        new TopMenuPage().selectMenu("Show AllDesktops");
    }

    @Then("I should navigate to Desktops page Successfully")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        Assert.assertEquals(new TopMenuPage().getTextDesktop(), "Desktops", "Desktop page not displayed");
    }

    @Given("I Mouse hover on “Laptops & Notebooks” Tab and click")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new TopMenuPage().mouseHoverOnLaptopsAndNotebooksTab();
    }

    @And("I click on “Show All Laptops & Notebooks” tab")
    public void iClickOnShowAllLaptopsNotebooksTab() {
        new TopMenuPage().selectMenu("Show AllLaptops & Notebooks");
    }

    @Then("I should navigate to ‘Laptops & Notebooks’ page Successfully")
    public void iShouldNavigateToLaptopsNotebooksPageSuccessfully() {
        Assert.assertEquals(new TopMenuPage().getLaptopsAndNotebooksText(), "Laptops & Notebooks", "Laptops & Notebooks page not displayed");
    }

    @Given("I Mouse hover on “Components” Tab and click")
    public void iMouseHoverOnComponentsTabAndClick() {
        new TopMenuPage().mouseHoverToComponentsTab();
    }

    @And("I Click on “Show AllComponents” tab")
    public void iClickOnShowAllComponentsTab() {
        new TopMenuPage().selectMenu("Show AllComponents");
    }

    @Then("I should navigate to ‘Components’")
    public void iShouldNavigateToComponents() {
        Assert.assertEquals(new TopMenuPage().getComponentsText(), "Components", "Components page not displayed");
    }
}
