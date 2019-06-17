Feature: Manage Income
  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked 'Add' button on 'AccountHomeMenu'
    Given  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Create an income category
    Given click 'Income' button on 'MainMenu' page
    And fill 'category name' field with "testcategory" on 'Income page'
    And click 'Register Category' button on 'Income page'
    Then Search 'category success' alert on 'Income page'
    And Search "testcategory" on 'category' selector on 'Income page'

  Scenario: create an income
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income 1" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction success' alert on 'Income Page'

  Scenario: Try to create an income with negative amount
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "-1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction fail' alert on 'Income Page'

  Scenario:  Try to create an income with  empty amount,name,category and date
    Given click 'Income' button on 'MainMenu' page
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction fail' alert on 'Income Page'

  Scenario: Try to register income with new created category
    Given click 'Income' button on 'MainMenu' page
    And fill 'category name' field with "Pruebas" on 'Income page'
    And click 'Register Category' button on 'Income page'
    Then Search 'category success' alert on 'Income page'
    And Search "Pruebas" on 'category' selector on 'Income page'
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Pruebas" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction success' alert on 'Income Page'

  Scenario: Try to create an income with letter amount
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "amount" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction fail' alert on 'Income Page'

  Scenario: Try to create an income  with duplicate name
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction fail' alert on 'Income Page'

  Scenario: Try to create a duplicate  income category
    Given click 'Income' button on 'MainMenu' page
    And fill 'category name' field with "Prueba" on 'Income page'
    And click 'Register Category' button on 'Income page'
    And click 'Register Category' button on 'Income page'
    Then Search 'category fail' alert on 'Income page'

  Scenario: Try to create an income category with empty name
    Given click 'Income' button on 'MainMenu' page
    And click 'Register Category' button on 'Income page'
    Then Search 'category fail' alert on 'Income page'



  Scenario: Try to modify an Income without select transaction name, new name ,new amount , new date
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Test" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    And fill 'Select transaction Name' with "Test" field on 'Income page'
    And click 'Register Changes' button
    Then Search 'changeFail' alert on 'Income page'

  Scenario: Try to modify an Income with the same old transaction name
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Test" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    And fill 'Select transaction Name' with "Test" field on 'Income page'
    And fill 'New name' field with "Test" on 'Income page'
    And fill 'New category' selector with "Others" on 'Income page'
    And fill 'New amount' field  with "100" on 'Income page'
    And fill 'New Date' field with "10/10/2019" on 'Income page'
    And click 'Register Changes' button
    Then Search 'changeFail' alert on 'Income page'

  Scenario: Try to modify an Income with new negative amount is registered
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Test" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    And fill 'Select transaction Name' with "Test" field on 'Income page'
    And fill 'New name' field with "new Name" on 'Income page'
    And fill 'New category' selector with "Others" on 'Income page'
    And fill 'New amount' field  with "-100" on 'Income page'
    And fill 'New Date' field with "10/10/2019" on 'Income page'
    And click 'Register Changes' button
    Then Search 'changeSuccess' alert on 'Income page'

  Scenario: Try to modify an Income
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Test 1" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    And fill 'Select transaction Name' with "Test 1" field on 'Income page'
    And fill 'New name' field with "new Name 1" on 'Income page'
    And fill 'New category' selector with "Others" on 'Income page'
    And fill 'New amount' field  with "100" on 'Income page'
    And fill 'New Date' field with "10/10/2019" on 'Income page'
    And click 'Register Changes' button
    Then Search 'changeSuccess' alert on 'Income page'

