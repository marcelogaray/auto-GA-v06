Feature: Delete Exepense
  Background:
    Given The 'AccountHomeMenu' is loaded
    Given Fill account name field on 'home menu' page with "Test"
    And Click 'Add' button on 'home menu' page
    And Click "Test" button on 'home menu' page
    Then click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "05/23/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction success' alert on 'Income Page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "Prueba expense" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "1" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction success' alert on 'Expenses' page
    And click 'PersonalWallet' button on 'Header' page

    Scenario: Delete expense
      When Click 'Reports' button on 'main menu' page
      Then The title is "Reports for: Test"
      When Select 'By category' in 'Select report type' selector on 'reports' page
      And Click 'Show report' button on 'reports' page
      And "Prueba expense" row is visible on 'Reports' page
      Then Click on 'x' button in row "Prueba expense" on 'Reports' page
      And "Prueba expense" row is not visible on 'Reports' page