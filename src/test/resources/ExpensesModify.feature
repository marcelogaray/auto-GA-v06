Feature: Modify an existing expense

  Background:
    Given Account manager is loaded
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then click "A new account" button on 'Account Manager'
    And click 'Expenses' button on 'Account Main Menu'

  Scenario: Can not enter letters in the modify amount field
    And fill "abc" 'Enter new amount' input on 'Income Expenses View'
    Then 'Enter new amount' input is zero
