Feature: Manage Expenses
  Background:
    Given The main page is loaded
    Given filled the 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked the 'Add' button on 'AccountHomeMenu'
    Given  clicked the "Test" button on 'AccountHomeMenu'

  Scenario: Create an expense category
    Given clicked 'Expenses' button on 'MainMenu' page
      And fill 'category name' field with "Prueba" on 'Expenses page'
      And click 'Register Category' button on 'Expenses page'
    Then Search 'category success' alert on 'Expenses page'
    And Search 'category option' "Prueba" on 'category selector' on 'Expenses page'

  Scenario: Try to create an expense without enough amount
    Given clicked 'Expenses' button on 'MainMenu' page
      And fill 'expense name' field with "Prueba" on 'Expenses Page'
      And select "Others" values on category selector on 'Expenses Page'
      And fill 'AmountBS' field with "100" on 'Expenses Page'
      And fill 'DateField' field with "23/05/2019" on 'Expenses Page'
      And click 'Register Transition' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
