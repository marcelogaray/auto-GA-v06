Feature: Manage Expenses
  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked 'Add' button on 'AccountHomeMenu'
    Given  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Create an expense category
    Given click 'Expenses' button on 'MainMenu' page
      And fill 'category name' field with "Prueba" on 'Expenses page'
      And click 'Register Category' button on 'Expenses page'
    Then Search 'category success' alert on 'Expenses page'
    And Search "Prueba" on 'category' selector on 'Expenses page'
    Then fill 'category name' field with "" on 'Expenses page'
      And click 'Register Category' button on 'Expenses page'
    Then Search 'Missing or repeat data to complete register category!' alert on 'Expenses page'
    And Confirm that number of options on 'category selector' is "3" on 'Expenses page'

  Scenario: Try to create an wrong expenses
    Then click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction success' alert on 'Income Page'
    And click 'PersonalWallet' button on 'Header' page
    Given click 'Expenses' button on 'MainMenu' page
      And fill 'expense name' field with "Prueba" on 'Expenses Page'
      And select "Others" values on 'category' selector on 'Expenses Page'
      And fill 'AmountBS' field with "10000" on 'Expenses Page'
      And fill 'Date of the Transaction' field with "23/05/2019" on 'Expenses Page'
      And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then check the 'Total Amount' label is "100" on 'Main Menu'
    Then click 'Expenses' button on 'MainMenu' page
      And fill 'expense name' field with "Prueba" on 'Expenses Page'
      And select "Others" values on 'category' selector on 'Expenses Page'
      And fill 'AmountBS' field with "-1000" on 'Expenses Page'
      And fill 'Date of the Transaction' field with "23/05/2019" on 'Expenses Page'
      And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then check the 'Total Amount' label is "100" on 'Main Menu'
    Then click 'Expenses' button on 'MainMenu' page
      And fill 'expense name' field with "Prueba" on 'Expenses Page'
      And select "Others" values on 'category' selector on 'Expenses Page'
      And fill 'AmountBS' field with "0" on 'Expenses Page'
      And fill 'Date of the Transaction' field with "23/05/2019" on 'Expenses Page'
      And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then check the 'Total Amount' label is "100" on 'Main Menu'
    Then click 'Expenses' button on 'MainMenu' page
      And fill 'expense name' field with "Prueba" on 'Expenses Page'
      And select "Others" values on 'category' selector on 'Expenses Page'
      And fill 'AmountBS' field with "" on 'Expenses Page'
      And fill 'Date of the Transaction' field with "23/05/2019" on 'Expenses Page'
      And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then check the 'Total Amount' label is "100" on 'Main Menu'
    Then click 'Expenses' button on 'MainMenu' page
      And fill 'expense name' field with "" on 'Expenses Page'
      And select "Others" values on 'category' selector on 'Expenses Page'
      And fill 'AmountBS' field with "1" on 'Expenses Page'
      And fill 'Date of the Transaction' field with "23/05/2019" on 'Expenses Page'
      And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And Check number of transactions is "0" on 'Select a Transaction' on 'Expenses' page
    Then fill 'expense name' field with "Prueba" on 'Expenses Page'
      And select "" values on 'category' selector on 'Expenses Page'
      And fill 'AmountBS' field with "1" on 'Expenses Page'
      And fill 'Date of the Transaction' field with "23/05/2019" on 'Expenses Page'
      And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And Search "Prueba" option is not on 'Transaction Name' selector on 'Expenses' page
    Then fill 'expense name' field with "Prueba" on 'Expenses Page'
      And select "Others" values on 'category' selector on 'Expenses Page'
      And fill 'AmountBS' field with "1" on 'Expenses Page'
      And fill 'Date of the Transaction' field with "" on 'Expenses Page'
      And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And Search "Prueba" option is not on 'Transaction Name' selector on 'Expenses' page

