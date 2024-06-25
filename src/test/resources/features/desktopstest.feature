#2. desktopstest.feature and write following scenarios
#1.verifyProductArrangeInAlphaBaticalOrder
#1.1 Mouse hover on Desktops Tab.and click
#1.2 Click on “Show All Desktops”
#1.3 Select Sort By position "Name: Z to A"
#1.4 Verify the Product will arrange in Descending order.
#2. verifyProductAddedToShoppingCartSuccessFully
#2.1 Mouse hover on Currency Dropdown and click
#2.2 Mouse hover on £Pound Sterling and click
#2.3 Mouse hover on Desktops Tab.
#2.4 Click on “Show All Desktops”
#2.5 Select Sort By position "Name: A to Z"
#2.6 Select product “<product>”
#2.7 Verify the Text "<product>"
#2.8.Enter Qty "1” using Select class.
#2.9 Click on “Add to Cart” button
#2.10 Verify the Message “Success: You have added “<product>” to your shopping cart!”
#2.11 Click on link “shopping cart” display into success message
#2.12 Verify the text "Shopping Cart"
#2.13 Verify the Product name "<product>"
#2.14 Verify the Model "<model>"
#2.15 Verify the Total "<price>"
Feature: Desktops Feature
  In order to perform desktop page
  As a User
  I am able to  access all order functions

  @sanity @smoke @regression
  Scenario: verify Product Arrange In AlphaBatical Order
    Given I am on home page
    When  I  Mouse hover on Desktops Tab and click
    And   I Click on “Show All Desktops”
    And   I Select Sort By position "Name: Z to A"
    Then  I Verify the Product will arrange in Descending order.

  @smoke @regression
  Scenario Outline: verify Product Added To Shopping Cart SuccessFully
    Given I am on home page
    When I Mouse hover on Currency Dropdown and click
    And I Mouse hover on £Pound Sterling and click
    And I Mouse hover on Desktops Tab.
    And I Click on “Show All Desktops”
    And I Select Sort By position "Name: A to Z"
    And I Select product “<product>”
    And I Verify the Text "<product>"
    And I Enter Qty "1”
    And I Click on Add to Cart button
    And I Verify the Message “Success: You have added “<product>” to your shopping cart!”
    And I Click on shopping cart display into success message
    And I Verify the Shopping text
    And I Verify the Product name "<product>"
    And I Verify the Model "<model>"
    And I Verify the Total "<price>"

    Examples:
      | product      | model      | price   |
      | HTC Touch Hd | Product 1  | £74.73  |
      | iPhone       | Product 11 | £75.46  |
      | iPod Classic | Product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBookAir   | Product 17 | £736.23 |
      | Sony Vaio    | Product 19 | £736.23 |





