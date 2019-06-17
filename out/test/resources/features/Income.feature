Feature: Manage Income
  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked 'Add' button on 'AccountHomeMenu'
    Given  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Create an income category
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'category name' field with "Prueba" on 'Income page'
    And click 'Register Category' button on 'Income page'
    Then Search 'category success' alert on 'Income page'
    And Search "Prueba" on 'category' selector on 'Income page'

  Scenario: create an income
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transition' button on 'Income Page'
    Then Search 'transaction success' alert on 'Income Page'

  Scenario: Try to create an income with negative amount
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "-1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transition' button on 'Income Page'
    Then Search 'transaction fail' alert on 'Income Page'

    #1 income with empty amount is not created then fail alert is visible on ‘income page’ LISTO
    #2income with empty name is not created then fail alert is visible on ‘income page’ LISTO
    #3income with empty date is not created then fail alert is visible on ‘income page’ LISTO
    #4 income with empty category is not created then fail alert is visible on ‘income page’ LISTO
    #5 income with new created category is  created then 'succes alert' is visible on ‘income page’ LISTO
    #6income with amount with letters is not created then fail alert is visible on ‘income page’ LISTO
    #7income with duplicate name is not created then fail alert is visible on ‘income page’ listo

    #8category with duplicate name is not created then fail alert is visible on ‘income page’ listo
    #9 category with empy name is not created then fail alert is visible on ‘income page’ listo


    #11 modify income without Select transaction Name is not registered then fail alert is visible on ‘income page’listo
    #12 modify income with empty new transaction Name is not registered then fail alert is visible on ‘income page’listo
    #13modify income with empty new category is not registered then fail alert is visible on ‘income page’ listo
    #14 modify income with empty new date is not registered then fail alert is visible on ‘income page’ listo
    #15 modify income with the same transaction name is not registered then fail alert is visible on ‘income page’ listo
    #16 modify income with negative amount is not registered then fail alert is visible on ‘income page’ listo
    #17 modify income with new transaction name is registered then succes alert is visible on ‘income page’ listo
  Scenario:  Try to create an income with  empty amount,name,category and date
    Given clicked 'Income' button on 'MainMenu' page
    And click 'Register Transition' button on 'Income Page'
    Then Search 'transaction fail' alert on 'Income Page'

  Scenario: Try to register income with new created category
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'category name' field with "Pruebas" on 'Income page'
    And click 'Register Category' button on 'Income page'
    Then Search 'category success' alert on 'Income page'
    And Search "Pruebas" on 'category' selector on 'Income page'
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Pruebas" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transition' button on 'Income Page'
    Then Search 'transaction success' alert on 'Income Page'

  Scenario: Try to create an income with letter amount
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "amount" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transition' button on 'Income Page'
    Then Search 'transaction fail' alert on 'Income Page'

  Scenario: Try to create an income  with duplicate name
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transition' button on 'Income Page'
    And click 'Register Transition' button on 'Income Page'
    Then Search 'transaction fail' alert on 'Income Page'

  Scenario: Try to create a duplicate  income category
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'category name' field with "Prueba" on 'Income page'
    And click 'Register Category' button on 'Income page'
    And click 'Register Category' button on 'Income page'
    Then Search 'category fail' alert on 'Income page'

  Scenario: Try to create an income category with empty name
    Given clicked 'Income' button on 'MainMenu' page
    And click 'Register Category' button on 'Income page'
    Then Search 'category fail' alert on 'Income page'

  

  Scenario: Try to modify an Income without select transaction name, new name ,new amount , new date
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Test" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transition' button on 'Income Page'
    And fill 'Select transaction Name' with "Test" field on 'Income page'
    And click 'Register Changes' button
    Then Search 'changeFail' alert on 'Income page'

  Scenario: Try to modify an Income with the same old transaction name
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Test" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transition' button on 'Income Page'
    And fill 'Select transaction Name' with "Test" field on 'Income page'
    And fill 'New name' field with "Test" on 'Income page'
    And fill 'New category' selector with "Others" on 'Income page'
    And fill 'New amount' field  with "100" on 'Income page'
    And fill 'New Date' field with "10/10/2019" on 'Income page'
    And click 'Register Changes' button
    Then Search 'changeFail' alert on 'Income page'

  Scenario: Try to modify an Income with new negative amount is registered
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Test" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transition' button on 'Income Page'
    And fill 'Select transaction Name' with "Test" field on 'Income page'
    And fill 'New name' field with "new Name" on 'Income page'
    And fill 'New category' selector with "Others" on 'Income page'
    And fill 'New amount' field  with "-100" on 'Income page'
    And fill 'New Date' field with "10/10/2019" on 'Income page'
    And click 'Register Changes' button
    Then Search 'changeSuccess' alert on 'Income page'

  Scenario: Try to modify an Income
    Given clicked 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Test" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transition' button on 'Income Page'
    And fill 'Select transaction Name' with "Test" field on 'Income page'
    And fill 'New name' field with "new Name" on 'Income page'
    And fill 'New category' selector with "Others" on 'Income page'
    And fill 'New amount' field  with "100" on 'Income page'
    And fill 'New Date' field with "10/10/2019" on 'Income page'
    And click 'Register Changes' button
    Then Search 'changeSuccess' alert on 'Income page'

