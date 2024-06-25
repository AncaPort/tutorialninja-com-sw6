#4. myaccountstest.feature and write following scenarios
#1. verifyUserShouldNavigateToRegisterPageSuccessfully
#1.1 Clickr on My Account Link.
#1.2 Call the method “selectMyAccountOptions” method and pass the parameter
#“Register”
#1.3 Verify the text “Register Account”.
#2. verifyUserShouldNavigateToLoginPageSuccessfully
#2.1 Clickr on My Account Link.
#2.2 Call the method “selectMyAccountOptions” method and pass the parameter
#“Login”
#2.3 Verify the text “Returning Customer”.
#3. verifyThatUserRegisterAccountSuccessfully
#3.1 Clickr on My Account Link.
#3.2 Call the method “selectMyAccountOptions” method and pass the parameter
#“Register”
#3.3 Enter First Name
#3.4 Enter Last Name
#3.5 Enter Email
#3.6 Enter Telephone
#3.7 Enter Password
#3.8 Enter Password Confirm
#3.9 Select Subscribe Yes radio button
#3.10 Click on Privacy Policy check box
#3.11 Click on Continue button
#3.12 Verify the message “Your Account Has Been Created!”
#3.13 Click on Continue button
#3.14 Clickr on My Account Link.
#3.15 Call the method “selectMyAccountOptions” method and pass the parameter
#“Logout”
#3.16 Verify the text “Account Logout”
#3.17 Click on Continue button
#4. verifyThatUserShouldLoginAndLogoutSuccessfully
#4.1 Clickr on My Account Link.
#4.2 Call the method “selectMyAccountOptions” method and pass the parameter
#“Login”
#4.3 Enter Email address
#4.4 Enter Last Name
#4.5 Enter Password
#4.6 Click on Login button
#4.7 Verify text “My Account”
#4.8 Clickr on My Account Link.
#4.9 Call the method “selectMyAccountOptions” method and pass the parameter
#“Logout”
#4.10 Verify the text “Account Logout”
#4.11 Click on Continue button

Feature: Account Test Feature
  In order to perform Registration  successfully
  As a User
  I have to test all registration tab successfully

  @author_Shital  @sanity @smoke @regression
  Scenario: verify User Should Navigate To Register Page Successfully
    Given I am on homepage
    When  I click on My Account link
    And   I select MyAccount Options and pass the parameter Register
    Then  Verify text Register Account

  @author_Shital @smoke @regression
  Scenario: verify User Should Navigate To Login Page Successfully
    Given I am on homepage
    When  I click on My Account link
    And   I select MyAccount Options and pass the parameter Login
    Then  Verify the text Returning Customer

  @author_Shital @regression
  Scenario: verify That User Register Account Successfully
    Given I am on homepage
    When  I click on My Account link
    And I select MyAccount Options and pass the parameter Register
    And I Fill the mandatory Fields
    And I select radio button
    And I click on privacy policy
    And I click on continue
    And I verify text
    And I again click on continue
    And I click on My Account tab
    And I select MyAccount Options and pass the parameter Logout
    Then I verify Account Logout Text

  @regression
  Scenario: verify That User Should Login And Logout Successfully
    Given I am on homepage
    When I click on My Account link
    And I select MyAccount Options and pass the parameter Login
    And I enter email address
    And I enter password
    And I click on login button
    And I click on My Account tab
    And I select MyAccount Options and pass the parameter Logout
    And I verify text  Account Logout
    Then I click on continue again