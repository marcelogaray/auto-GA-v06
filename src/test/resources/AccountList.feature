Feature: Select an account
  Scenario: Check if new account button is visible
    Given Account manager is loaded
    And new account is created
    Then check if the account button is visible

  Scenario: Choose the general user account
    Given Account manager is loaded
    Then click General button
