Feature: Select an account

  Background:
    Given Account manager is loaded

  Scenario: New account button is visible on 'Account List'
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then check if "A new account" button is visible on 'Account Manager'

  Scenario: Choose a new account on 'Account List'
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    And click "A new account" button on 'Account Manager'
    Then 'Income' button is visible on 'Account Main Menu'

  Scenario: Choose the general user account on 'Account List'
    And click 'General' account button on 'Account Manager'
    Then title is visible on 'General Reports'
