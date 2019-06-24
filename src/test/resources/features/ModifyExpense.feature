Feature: Modify Expense Feature

  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
    And clicked 'Add' button on 'AccountHomeMenu'
    Then  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Income Pre requirement for testing
    Given click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Prueba income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "100" on 'Income Page'
    And fill 'DateField' field with "05/23/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    Then Search 'transaction success' alert on 'Income Page'
    And click 'PersonalWallet' button on 'Header' page

  Scenario Outline: Expenses Pre requirement for testing
    Then click 'Expenses' button on 'MainMenu' page
    And fill 'expense name' field with "<Name>" on 'Expenses Page'
    And select "Others" values on 'category' selector on 'Expenses Page'
    And fill 'AmountBS' field with "1" on 'Expenses Page'
    And fill 'Date of the Transaction' field with "05/23/2019" on 'Expenses Page'
    And click 'Register Transaction' button on 'Expenses Page'
    Then Search 'transaction success' alert on 'Expenses' page
    And click 'PersonalWallet' button on 'Header' page
    Examples:
      | Name          |
      | Prueba        |
      | EmptyCategory |
      | EmptyNewName  |
      | EmptyDate     |
      | EmptyAmount   |
      | SameName      |
      | NegativeAmount|
      | Zero Amount   |
      | HugeAmount    |

  Scenario: Change a transaction
    Given click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "Prueba" on 'Expenses Page'
    Then fill 'new name' field with "prueba1" on 'Expenses Page'
    And select category "Others" in 'new category' on 'expenses page'
    And fill 'new amount' with "1" on 'expense page'
    And fill 'new date' field with "05/23/2019" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeSuccess' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page


  Scenario Outline: try to modify expense with inapropiate data
    Given click 'Expenses' button on 'MainMenu' page
    Then Select 'name' "<Name>" on 'Expenses Page'
    Then fill 'new name' field with "<new Name>" on 'Expenses Page'
    And select category "<new Category>" in 'new category' on 'expenses page'
    And fill 'new amount' with "<new Amount>" on 'expense page'
    And fill 'new date' field with "<new Date>" on 'expense page'
    And click 'Register Changes' button' on 'Expense' page
    Then Search 'changeFail' alert on 'Expenses page'
    And click 'PersonalWallet' button on 'Header' page
    Examples:
      | Name          | new Name        | new Category | new Amount | new Date   |
      | EmptyNewName  |                 | Others       | 1          | 05/23/2019 |
      | EmptyDate     | EmptyDateError  | Others       | 1          |            |
      | SameName      | SameName        | Others       | 1          | 05/23/2019 |
      | NegativeAmount| NegativeWrong   | Others       | -10        | 05/23/2019 |
      | HugeAmount    | HugeWrong       | Others       | 100000     | 05/23/2019 |
      | EmptyAmount   | EmptyAWrong     | Others       |            | 05/23/2019 |
      |               | EmptyNameWrong  | Others       | 1          | 05/23/2019 |
      | EmptyCategory | EmptyCatWtrong  |              | 1          | 05/23/2019 |
      | ZeroAmount    | WrongZeroAmount | Others       | 0          | 05/23/2019 |

    Scenario: 'New Amount' field stars empty
      Given click 'Expenses' button on 'MainMenu' page
      Then click 'new amount' field on 'Expenses' page
      And 'new amount' field should be empty on 'Expenses' page