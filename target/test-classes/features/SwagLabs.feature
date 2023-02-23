  Feature: SwagLabs Login tests
  Scenario: Login with standard_user
    Given I go to "https://www.saucedemo.com/"
    Then I fill username "standard_user"
    Then I fill password "secret_sauce"
    Then I click on Login
    Then Just wait 5000
    #Complete this exercise


  Scenario: Login with locked_out_user and verify locked out message
    Given I go to "https://www.saucedemo.com/"
    Then I fill username "locked_out_user"
    Then I fill password "secret_sauce"
    Then I click on Login
    Then I verify error text
    Then Just wait 5000
    #Complete this exercise

  Scenario: Cart Scenario
    Given I go to "https://www.saucedemo.com/"
    Then I fill username "standard_user"
    Then I fill password "secret_sauce"
    Then I click on Login
    Then I click on Sauce Labs Backpack
    Then I check Sauce Labs Backpack change to "REMOVE"
    Then I click on Cart button
    Then I check on cart "Sauce Labs Backpack"
    Then I click on Continue Shopping
    Then I click on Cart button
    Then I check on cart "Sauce Labs Backpack"
    Then Just wait 5000
    #Homework_7