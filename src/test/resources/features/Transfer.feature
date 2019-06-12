Feature: Trasnfer Between Accounts

  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
      And clicked 'Add' button on 'AccountHomeMenu'
    Given filled 'Account name' field on 'AccountHomeMenu' with "Destination"
      And clicked 'Add' button on 'AccountHomeMenu'
    Given  clicked "Test" button on 'AccountHomeMenu'
    Given clicked 'Income' button on 'MainMenu' page
      And  fill the 'Name' field with "Test Income" on the 'Income' page
      And select "Others" value on the 'Category' selector on the 'Income' page
      And fill the 'Amount BS' field with "100" on the 'Income' page
      And fill the 'Date of the Transaction' date field with "12/06/2019" on the 'Income' page
      And click the 'Register Transaction' button on the 'Income' page
    Then click the 'Exit' button on the 'Income' page
    Given  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Check Error Message When No Category is Selected to Transfer
    Given clicked the 'Transfer' Button on 'MainMenu' page
    And filled 'amount in BS' text field with "100" on 'Transfer' page
    And click the 'Transfer' Button on 'Transfer' page
    Then Search the 'Error Message' fail alert on 'Transfer' page

  Scenario: Check Error Message When No Ammount is filled in text field on 'Transfer' page
    Given clicked the 'Transfer' Button on 'MainMenu' page
    And select the "Destination" value on 'Destination Account' selector on 'Transfer' Page
    And click the 'Transfer' Button on 'Transfer' page
    Then Search the 'Error Message' fail alert on 'Transfer' page

  Scenario: Check Success Message When Transfered Correctly
    Given clicked the 'Transfer' Button on 'MainMenu' page
    And select the "Destination" value on 'Destination Account' selector on 'Transfer' Page
    And filled 'amount in BS' text field with "50" on 'Transfer' page
    And click the 'Transfer' Button on 'Transfer' page
    Then search the 'Success Message' alert on 'Transfer' page
