Feature: Check account creator
  Background: Preconditions
    Given 'Account creator' is loaded

  Scenario: Check if text input field and add button are visible
    Then the 'Account name' text field and 'add' button is visible in 'Account Creator'

  Scenario: Check if new account is added to accounts list
    And fill "Savings" 'Account name' text field on 'Account Creator'
    And press 'Add' button on 'Account Creator'
    Then "Savings" button is visible on 'Account Creator'