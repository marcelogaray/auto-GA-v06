Feature: Manage Expenses
  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked 'Add' button on 'AccountHomeMenu'
    Given  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Create an expense category
    Given clicked 'Expenses' button on 'MainMenu' page
      And fill 'category name' field with "Prueba" on 'Expenses page'
      And click 'Register Category' button on 'Expenses page'
    Then Search 'category success' alert on 'Expenses page'
    And Search "Prueba" on 'category' selector on 'Expenses page'
    Then fill 'category name' field with "" on 'Expenses page'
      And click 'Register Category' button on 'Expenses page'
    Then Search 'Missing or repeat data to complete register category!' alert on 'Expenses page'
    And Confirm that number of options on 'category selector' is "3" on 'Expenses page'

  Scenario: Try to create an expense without enough amount
    Given clicked 'Expenses' button on 'MainMenu' page
      And fill 'expense name' field with "Prueba" on 'Expenses Page'
      And select "Others" values on 'category' selector on 'Expenses Page'
      And fill 'AmountBS' field with "100" on 'Expenses Page'
      And fill 'DateField' field with "23/05/2019" on 'Expenses Page'
      And click 'Register Transition' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
