package com.tutorialninja.steps;

import com.tutorialninja.pages.MyAccountsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountStep {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on My Account link")
    public void iClickOnMyAccountLink() {
        new MyAccountsPage().clickOnMyAccountLink();
    }

    @And("I select MyAccount Options and pass the parameter Register")
    public void iSelectMyAccountOptionsAndPassTheParameterRegister() {
        new MyAccountsPage().selectMyAccountOptions("Register");
    }


    @Then("Verify text Register Account")
    public void verifyTextRegisterAccount() {
        Assert.assertEquals(new MyAccountsPage().getRegisterAccountMessage(), "Register Account", "message not found ");
    }


    @And("I select MyAccount Options and pass the parameter Login")
    public void iSelectMyAccountOptionsAndPassTheParameterLogin() {
        new MyAccountsPage().selectMyAccountOptions("Login");
    }

    @Then("Verify the text Returning Customer")
    public void verifyTheTextReturningCustomer() {
        Assert.assertEquals(new MyAccountsPage().getReturningCustomerMessage(), "Returning Customer", "Message not displayed");
    }


    @And("I Fill the mandatory Fields")
    public void iFillTheMandatoryFields() {
        new MyAccountsPage().enterFirstName("prime");
        new MyAccountsPage().enterLastName("testing");
        new MyAccountsPage().enterEmailId("prime123@gmail.com");
        new MyAccountsPage().enterPhoneNumber("07123756879");
        new MyAccountsPage().enterPassword("Prime123");
        new MyAccountsPage().enterConfirmPassword("Prime123");
    }

    @And("I select radio button")
    public void iSelectRadioButton() {
        new MyAccountsPage().clickSubscribeOnYesRadioButton();
    }

    @And("I click on privacy policy")
    public void iClickOnPrivacyPolicy() {
        new MyAccountsPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("I click on continue")
    public void iClickOnContinue() {
        new MyAccountsPage().clickOnContinue1();
    }

    @And("I verify text")
    public void iVerifyText() {
        Assert.assertEquals(new MyAccountsPage().getAccountCreatedMessage(), "Your Account Has Been Created!", "Message not displayed");
    }

    @And("I again click on continue")
    public void iAgainClickOnContinue() {
        new MyAccountsPage().clickOnContinueButton2();

    }

    @And("I click on My Account tab")
    public void iClickOnMyAccountTab() {
        new MyAccountsPage().clickOnMyAccountTab();
    }

    @And("I select MyAccount Options and pass the parameter Logout")
    public void iSelectMyAccountOptionsAndPassTheParameterLogout() {
        new MyAccountsPage().selectMyAccountOptions("Logout");
    }

    @Then("I verify Account Logout Text")
    public void iVerifyAccountLogoutText() {
        Assert.assertEquals(new MyAccountsPage().getAccountLogoutMessage(), "Account Logout", "Message not displayed");
    }

    @And("I enter email address")
    public void iEnterEmailAddress() {
        new MyAccountsPage().enterEmailId("Prime796@gmail.com");
    }


    @And("I enter password")
    public void iEnterPassword() {
        new MyAccountsPage().enterPassword("Prime123");
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new MyAccountsPage().clickOnLogin();
    }

    @And("I verify text  Account Logout")
    public void iVerifyTextAccountLogout() {
        Assert.assertEquals(new MyAccountsPage().getAccountLogoutMessage(), "Account Logout", "LogOut text not displayed" +
                "");
    }

    @Then("I click on continue again")
    public void iClickOnContinueAgain() {
        new MyAccountsPage().clickOnContinueButton3();
    }
}
