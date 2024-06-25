Feature: Topmenu Feature
  In order to see Topmenu successfully
  As a USer
  I can verify all text
#1. verifyUserShouldNavigateToDesktopsPageSuccessfully
#1.1 Mouse hover on “Desktops” Tab and click
#1.2 call selectMenu method and pass the menu = “Show All Desktops”
#1.3 Verify the text ‘Desktops’
#2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
#2.1 Mouse hover on “Laptops & Notebooks” Tab and click
#2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
#2.3 Verify the text ‘Laptops & Notebooks’
#3. verifyUserShouldNavigateToComponentsPageSuccessfully
#3.1 Mouse hover on “Components” Tab and click
#3.2 call selectMenu method and pass the menu = “Show All Components”
#3.3 Verify the text ‘Components’

  @author_Shital @sanity @smoke @regression
  Scenario:verify User Should Navigate To Desktops Page Successfully
    Given I Mouse hover on “Desktops” Tab and click
    And I click on “Show All Desktops”
    Then I should navigate to Desktops page Successfully

  @author_Shital @smoke @regression
    Scenario: verify User Should Navigate To Laptops And Notebooks Page Successfully
      Given I Mouse hover on “Laptops & Notebooks” Tab and click
      And I click on “Show All Laptops & Notebooks” tab
      Then I should navigate to ‘Laptops & Notebooks’ page Successfully

  @author_Shital  @regression
    Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
    Given I Mouse hover on “Components” Tab and click
    And I Click on “Show AllComponents” tab
    Then I should navigate to ‘Components’