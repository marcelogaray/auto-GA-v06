Feature: Modify an existing expense

  Background:
    Given Account manager is loaded
    And fill "A new account" 'Account name' input on 'Account Manager'
    And click 'Add' button on 'Account Manager'
    Then click "A new account" button on 'Account Manager'
    And click 'Expenses' button on 'Account Main Menu'

    Scenario: Create a new Expense and Modify it
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
      Then select expense registered on 'Expense View'

  Scenario: Can not enter letters in the modify amount field
    And fill "abc" 'Enter new amount' input on 'Income Expenses View'
    Then 'Enter new amount' input is zero
