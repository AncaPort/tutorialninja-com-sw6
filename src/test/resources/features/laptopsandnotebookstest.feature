#3. Laptopsandnotebookstest.feature and write following scenarios
#1. verifyProductsPriceDisplayHighToLowSuccessfully
#1.1 Mouse hover on Laptops & Notebooks Tab.and click
#1.2 Click on “Show All Laptops & Notebooks”
#1.3 Select Sort By "Price (High > Low)"
#1.4 Verify the Product price will arrange in High to Low order.
#2. verifyThatUserPlaceOrderSuccessfully
#2.1 Mouse hover on Laptops & Notebooks Tab and click
#2.2 Click on “Show All Laptops & Notebooks”
#2.3 Select Sort By "Price (High > Low)"
#2.4 Select Product “MacBook”
#2.5 Verify the text “MacBook”
#2.6 Click on ‘Add To Cart’ button
#2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
#2.8 Click on link “shopping cart” display into success message
#2.9 Verify the text "Shopping Cart"
#2.10 Verify the Product name "MacBook"
#2.11 Change Quantity "2"
#2.12 Click on “Update” Tab
#2.13 Verify the message “Success: You have modified your shopping cart!”
#2.14 Verify the Total £737.45
#2.15 Click on “Checkout” button
#2.16 Verify the text “Checkout”
#2.17 Verify the Text “New Customer”
#2.18 Click on “Guest Checkout” radio button
#2.19 Click on “Continue” tab
#2.20 Fill the mandatory fields
#2.21 Click on “Continue” Button
#2.22 Add Comments About your order into text area
#2.23 Check the Terms & Conditions check box
#2.24 Click on “Continue” button
#2.25 Verify the message “Warning: Payment method required!”
Feature: verify  Laptops and notebooks tabs feature

  @sanity @smoke @regression
  Scenario: verify Products Price Display High To Low Successfully
    Given I am on home page
    When I Mouse hover on Laptops & Notebooks Tab and click
    And  I Click on “Show All Laptops & Notebooks”
    And  I Select Sort By "Price (High > Low)"
    Then Verify the Product price will arrange in High to Low order

  @smoke @regression
  Scenario: verify That User Place Order Successfully
    Given I am on home page
    When I Mouse hover on Laptops & Notebooks Tab and click
    And  I Click on “Show All Laptops & Notebooks”
    And  I Select Sort By "Price (High > Low)"
    And  I Select Product “Sony VAIO”
    And  I Click on ‘Add To Cart’ button
    And  I Click on link “shopping cart” display into success message
    And  I Change Quantity "2"
    And  I Click on “Update” Tab
    And  I Verify the message “Success: You have modified your shopping cart!”
    And  I Click on “Checkout” button
    And  I Verify the text “Checkout”
    And  I Verify the Text “New Customer”
    And  I Click on “Guest Checkout” radio button
    And  I Click on “Continue” tab
    And  I Fill the mandatory fields
    And  I Click on “Continue” Button
    And  I Add Comments About your order into text area
    And  I Check the Terms & Conditions check box
    Then I Click on final “Continue” button



