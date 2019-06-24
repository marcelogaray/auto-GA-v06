Feature: Register expenses
  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked 'Add' button on 'AccountHomeMenu'
    Then  clicked "Test" button on 'AccountHomeMenu'

   Scenario: Income requirement for tests
     Then click 'Income' button on 'MainMenu' page
     And fill 'income name' field with "Prueba income" on 'Income Page'
     And select "Others" values on 'category' selector on 'Income Page'
     And fill 'AmountBS' field with "100" on 'Income Page'
     And fill 'DateField' field with "05/23/2019" on 'Income Page'
     And click 'Register Transaction' button on 'Income Page'
     Then Search 'transaction success' alert on 'Income Page'
     And click 'PersonalWallet' button on 'Header' page

  Scenario Outline: Register empty expenses
    Given click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "<Name>" on 'Expenses Page'
    And select "<Category>" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "<Amount>" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "<Date>" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction fail' alert on 'Expenses Page'
    And click 'PersonalWallet' button on 'Header' page
    Examples: 
    |Name    |Category|Amount   |Date        |
    |        |Others  |1        |05/23/2019  |
    |Prueba  |        |1        |05/23/2019  |
    |Prueba  |Others  |         |05/23/2019  |
    |Prueba  |Others  |1        |            |

    Scenario: Register Expense
      Given click 'Expenses' button on 'MainMenu' page
      And fill 'expense name' field with "Prueba" on 'Expenses Page'
      And select "Others" values on 'category' selector on 'Expenses Page'
      And fill 'AmountBS' field with "1" on 'Expenses Page'
      And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
      And click 'Register Transaction' button on 'Expenses Page'
      Then Search 'transaction success' alert on 'Expenses' page
      And click 'PersonalWallet' button on 'Header' page

    Scenario Outline: Register expense with incorrect data
      Given click 'Expenses' button on 'MainMenu' page
      And fill 'expense name' field with "<Name>" on 'Expenses Page'
      And select "<Category>" values on 'category' selector on 'Expenses Page'
      And fill 'AmountBS' field with "<Amount>" on 'Expenses Page'
      And fill 'Date of the Transaction' field with "<Date>" on 'Expenses Page'
      And click 'Register Transaction' button on 'Expenses Page'
      Then Search 'transaction fail' alert on 'Expenses Page'
      And click 'PersonalWallet' button on 'Header' page
      Examples:
        |Name    |Category|Amount   |Date        |
        |Prueba  |Others  |1        |05/23/2019  |
        |Prueba1 |Others  |0        |05/23/2019  |
        |Prueba1 |Others  |-10      |05/23/2019  |
        |Prueba1 |Others  |100000   |05/23/2019  |
