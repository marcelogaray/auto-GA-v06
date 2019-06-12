Feature: New accounts
  Background: : Create Accounts and do incomes
    Given Account creator is loaded
    And fill 'Account name' input with first account
    And click 'Add' button for first account
    And fill 'Account name' input with second account
    And click 'Add' button for second account
    Then select first account
    And click 'Income' button
    And fill 'Enter Name' input
    And fill 'Category' field
    And fill 'Enter Amount' input
    And fill 'mm/dd/yyyy' input
    Then click 'Register Transaction' button
    Then click 'Exit' Button
    And  Then select first account again

  Scenario: Transfer an amount to second account
    And click 'Transfer' button
    And select 'Second Account' option
    And fill "10" on field amount
    Then click 'Transfer' button on transfer page

  Scenario: Invalid transfer to a second transaction
    And click 'Transfer' button
    And select 'Second Account' option
    And fill "1100" on field amount
    Then click 'Transfer' button on transfer page
