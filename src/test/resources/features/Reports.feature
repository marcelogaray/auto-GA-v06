Feature: Test reports for new account

  Background:
    Given The 'AccountHomeMenu' is loaded
    Given Fill account name field on 'home menu' page with "Test"
    And Click 'Add' button on 'home menu' page

  Scenario: Reports page title includes account name
    Given Click "Test" button on 'home menu' page
    When Click 'Reports' button on 'main menu' page
    Then The title is "Reports for: Test"

  Scenario: Reports table is empty for a category report when there is no data for account
    Given Click "Test" button on 'home menu' page
    When Click 'Reports' button on 'main menu' page
    And Select 'By category' in 'Select report type' selector on 'reports' page
    And Click 'Show report' button on 'reports' page
    Then The table has "1" rows

  Scenario: Creation of report by date shows error when start date is bigger than end date
    Given Click "Test" button on 'home menu' page
    And Click 'Reports' button on 'main menu' page
    Given Select 'By date' in 'Select report type' selector on 'reports' page
    When Fill 'From' date picker with "12/12/2019" on 'reports' page
    And Fill 'To' date picker with "12/01/2019" on 'reports' page
    And Click 'Show report' button on 'reports' page
    Then "Please insert valid start and end dates" error shows up on 'reports' page

  Scenario: Reports table by date filters account data using the specified date range
    Given Click "Test" button on 'home menu' page
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Ingreso1" on 'Income Page'
    And select "Salary" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "12/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given fill 'income name' field with "Ingreso2" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given Click 'Personal wallet' button on 'income' page
    And Click 'Reports' button on 'main menu' page
    When Select 'By date' in 'Select report type' selector on 'reports' page
    And Fill 'From' date picker with "12/01/2019" on 'reports' page
    And Fill 'To' date picker with "12/31/2019" on 'reports' page
    And Click 'Show report' button on 'reports' page
    Then Reports table shows
      | Date       | Amount | Name     | Category |
      | 2019-12-04 | 100    | Ingreso1 | Salary   |

  Scenario: Reports table by category sorts account data by category
    Given Click "Test" button on 'home menu' page
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Ingreso1" on 'Income Page'
    And select "Salary" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "12/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given fill 'income name' field with "Ingreso2" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given Click 'Personal wallet' button on 'income' page
    And click 'Expenses' button on 'MainMenu' page
    Given fill 'expense name' field with "Egreso1" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "1000" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "11/04/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Given Click 'Personal wallet' button on 'expense' page
    And Click 'Reports' button on 'main menu' page
    When Select 'By category' in 'Select report type' selector on 'reports' page
    And Click 'Show report' button on 'reports' page
    Then Reports table shows
      | Category | Amount | Name     | Date       |
      | Salary   | 100    | Ingreso1 | 2019-12-04 |
      | Others   | 1000   | Ingreso2 | 2019-11-04 |
      |          | -1000  | Egreso1  | 2019-11-04 |

  Scenario: Expenses are shown in red in reports table by category
    Given Click "Test" button on 'home menu' page
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Ingreso1" on 'Income Page'
    And select "Salary" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "12/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given Click 'Personal wallet' button on 'income' page
    And click 'Expenses' button on 'MainMenu' page
    Given fill 'expense name' field with "Expense1" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "50" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "11/04/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Given Click 'Personal wallet' button on 'expense' page
    And Click 'Reports' button on 'main menu' page
    When Select 'By category' in 'Select report type' selector on 'reports' page
    And Click 'Show report' button on 'reports' page
    Then "Expense1" row is red

  Scenario: Incomes are shown in green in reports table by category
    Given Click "Test" button on 'home menu' page
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Ingreso1" on 'Income Page'
    And select "Salary" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "12/04/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Given Click 'Personal wallet' button on 'income' page
    And click 'Expenses' button on 'MainMenu' page
    Given fill 'expense name' field with "Expense1" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "50" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "11/04/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Given Click 'Personal wallet' button on 'expense' page
    And Click 'Reports' button on 'main menu' page
    When Select 'By category' in 'Select report type' selector on 'reports' page
    And Click 'Show report' button on 'reports' page
    Then "Ingreso1" row is green

  Scenario: Creation of report by date shows error when there are no dates
    Given Click "Test" button on 'home menu' page
    And Click 'Reports' button on 'main menu' page
    Given Select 'By date' in 'Select report type' selector on 'reports' page
    When Click 'Show report' button on 'reports' page
    Then "Please insert valid start and end dates" error shows up on 'reports' page