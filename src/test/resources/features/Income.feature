Feature: Manage Income
  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked 'Add' button on 'AccountHomeMenu'
    Given  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Create an income category
    Given click 'Income' button on 'MainMenu' page
    And fill 'category name' field with "Prueba" on 'Income page'
    And click 'Register Category' button on 'Income page'
    Then Search 'category success' alert on 'Income page'
    And Search "Prueba" on 'category' selector on 'Income page'

  Scenario: create an income
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction success' alert on 'Income Page'