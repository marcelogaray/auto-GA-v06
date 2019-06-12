Feature: Select an account

  Background:
    Given Account manager is loaded

  Scenario: Check if new account button is visible
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then check if "A new account" button is visible on 'Account Manager'

  Scenario: Choose the general user account
    Then click 'General' account button on 'Account Manager'
