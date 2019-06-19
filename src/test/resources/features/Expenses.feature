Feature: Manage Expenses
  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked 'Add' button on 'AccountHomeMenu'
    Given  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Create an expense category
    Given click 'Expenses' button on 'MainMenu' page
    And fill 'category name' field with "category1" on 'Expenses page'
    And click 'Register Category' button on 'Expenses page'
    Then Search 'category success' alert on 'Expenses page'
    And clear 'category name' field on 'Expenses page'
    Then fill 'category name' field with "" on 'Expenses page'
    And click 'Register Category' button on 'Expenses page'
    Then Search 'Missing or repeat data to complete register category!' alert on 'Expenses page'
    And clear 'category name' field on 'Expenses page'
    Then fill 'category name' field with "category1" on 'Expenses page'
    And click 'Register Category' button on 'Expenses page'
    Then Search 'Missing or repeat data to complete register category!' alert on 'Expenses page'

  Scenario: Register expenses
    Then click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "05/11/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction success' alert on 'Income Page'
    And click 'PersonalWallet' button on 'Header' page
    Given click 'Expenses' button on 'MainMenu' page
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "1" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "Prueba" on 'Expenses Page'
    And fill 'AmountBS' field with "1" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "Prueba" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "Prueba" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "1" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "Prueba" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "1" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction success' alert on 'Expenses' page
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "Prueba" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "1" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "Prueba1" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "0" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "Prueba1" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "-10" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "Prueba1" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "100000" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    Then fill 'new name' field with "prueba1" on 'Expenses Page'
    And select category "Others" in 'new caegory' on 'expenses page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And fill 'new amount' with "1" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    And select category "Others" in 'new caegory' on 'expenses page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And fill 'new amount' with "1" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    Then fill 'new name' field with "prueba1" on 'Expenses Page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And fill 'new amount' with "1" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    Then fill 'new name' field with "prueba1" on 'Expenses Page'
    And select category "Others" in 'new caegory' on 'expenses page'
    And fill 'new amount' with "1" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    Then fill 'new name' field with "prueba1" on 'Expenses Page'
    And select category "Others" in 'new caegory' on 'expenses page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    Then fill 'new name' field with "prueba1" on 'Expenses Page'
    And select category "Others" in 'new caegory' on 'expenses page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And fill 'new amount' with "1" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    Then fill 'new name' field with "Prueba" on 'Expenses Page'
    And select category "Others" in 'new caegory' on 'expenses page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And fill 'new amount' with "1" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    Then fill 'new name' field with "prueba1" on 'Expenses Page'
    And select category "Others" in 'new caegory' on 'expenses page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And fill 'new amount' with "0" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    Then fill 'new name' field with "prueba1" on 'Expenses Page'
    And select category "Others" in 'new caegory' on 'expenses page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And fill 'new amount' with "-10" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    Then fill 'new name' field with "prueba1" on 'Expenses Page'
    And select category "Others" in 'new caegory' on 'expenses page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And fill 'new amount' with "100000" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Then click 'Expenses' button on 'MainMenu' page