Feature: Account main menu

  Background:
    Given Account manager is loaded
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    And click "A new account" button on 'Account Manager'

  Scenario: Account main menu buttons are visible
    Then 'Income' button is visible on 'Account Main Menu'
    And 'Expenses' button is visible on 'Account Main Menu'
    And 'Transfer' button is visible on 'Account Main Menu'
    And 'Report' button is visible on 'Account Main Menu'
