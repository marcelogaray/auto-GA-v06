Feature: Register a new expense

  Background:
    Given Account manager is loaded
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then click "A new account" button on 'Account Manager'
    And click 'Expenses' button on 'Account Main Menu'

  Scenario: Create a new Expense
    Then go back home in 'Expenses'
    And click 'Income' button
    And fill 'Enter Name' input
    And fill 'Category' field
    And fill 'Enter Amount' input
    And fill 'mm/dd/yyyy' input
    Then click 'Register Transaction' button
    Then go back home in 'Expenses'
    And click 'Expenses' button on 'Account Main Menu'
    And fill 'Enter Name' input
    And select 'Category' field on 'Income Expenses View'
    And fill 'Enter Amount' input
    And fill 'mm/dd/yyyy' input
    Then click 'Register Transaction' button

  Scenario: Can not register an expense for an account that does not have enough money
    Then fill "My expense" in 'Enter Name' input on 'Income Expenses View'
    And select 'Category' field on 'Income Expenses View'
    And fill "200" 'Enter amount' input on 'Income Expenses View'
    And fill "01/01/2019" 'Date' input on 'Income Expenses View'
    And click 'Register Transaction' button on 'Income Expenses View'
    Then 'Transaction error' is visible

  Scenario: Can not enter letters in the amount field
    And fill "abc" 'Enter amount' input on 'Income Expenses View'
    Then 'Enter amount' input is empty
