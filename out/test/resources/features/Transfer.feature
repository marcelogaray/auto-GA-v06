Feature: Trasnfer Between Accounts

  Background:
    Given The 'AccountHomeMenu' is loaded
    Given filled 'Account name' field on 'AccountHomeMenu' with "Test"
      And clicked 'Add' button on 'AccountHomeMenu'
    Given filled 'Account name' field on 'AccountHomeMenu' with "Destination"
      And clicked 'Add' button on 'AccountHomeMenu'
    Given  clicked "Test" button on 'AccountHomeMenu'

  Scenario: Error Message is displayed when 'Budget Available in Bs' has 0 amount
    Given clicked the 'Transfer' Button on 'MainMenu' page
    And select the "Destination" value on 'Destination Account' selector on 'Transfer' Page
    And filled 'amount in BS' text field with "50" on 'Transfer' page
    And click the 'Transfer' Button on 'Transfer' page
    Then Search the 'Error Message' fail alert on 'Transfer' page

  Scenario: Error Message is displayed when No Category is Selected to Transfer
    Given click 'Income' button on 'MainMenu' page
      And  fill the 'Name' field with "Test Income" on the 'Income' page
      And select "Others" value on the 'Category' selector on the 'Income' page
      And fill the 'Amount BS' field with "10000" on the 'Income' page
      And fill the 'Date of the Transaction' date field with "12/06/2019" on the 'Income' page
      And click the 'Register Transaction' button on the 'Income' page
    Then click the 'Exit' button on the 'Income' page
    Given clicked "Test" button on 'AccountHomeMenu'
    Given clicked the 'Transfer' Button on 'MainMenu' page
    And filled 'amount in BS' text field with "100" on 'Transfer' page
    And click the 'Transfer' Button on 'Transfer' page
    Then Search the 'Error Message' fail alert on 'Transfer' page

  Scenario: Error Message is displayed when No Ammount is filled in text field on 'Transfer' page
    Given click 'Income' button on 'MainMenu' page
      And  fill the 'Name' field with "Test Income" on the 'Income' page
      And select "Others" value on the 'Category' selector on the 'Income' page
      And fill the 'Amount BS' field with "10000" on the 'Income' page
      And fill the 'Date of the Transaction' date field with "12/06/2019" on the 'Income' page
      And click the 'Register Transaction' button on the 'Income' page
    Then click the 'Exit' button on the 'Income' page
    Given clicked "Test" button on 'AccountHomeMenu'
    Given clicked the 'Transfer' Button on 'MainMenu' page
    And select the "Destination" value on 'Destination Account' selector on 'Transfer' Page
    And click the 'Transfer' Button on 'Transfer' page
    Then Search the 'Error Message' fail alert on 'Transfer' page

  Scenario: Success Message is displayed when filled 'Amount BS' with natural number
    Given click 'Income' button on 'MainMenu' page
      And  fill the 'Name' field with "Test Income" on the 'Income' page
      And select "Others" value on the 'Category' selector on the 'Income' page
      And fill the 'Amount BS' field with "10000" on the 'Income' page
      And fill the 'Date of the Transaction' date field with "12/06/2019" on the 'Income' page
      And click the 'Register Transaction' button on the 'Income' page
    Then click the 'Exit' button on the 'Income' page
    Given clicked "Test" button on 'AccountHomeMenu'
    Given clicked the 'Transfer' Button on 'MainMenu' page
    And select the "Destination" value on 'Destination Account' selector on 'Transfer' Page
    And filled 'amount in BS' text field with "50" on 'Transfer' page
    And click the 'Transfer' Button on 'Transfer' page
    Then search the 'Success Message' alert on 'Transfer' page

  Scenario: Check title 'Transfer' appears on 'Transfer' Page
    Given clicked the 'Transfer' Button on 'MainMenu' page
    Then check that title 'Transfer' title is visible on 'Transfer' Page

  Scenario: 'Transfer' Button is visible on 'Transfer' Page
    Given clicked the 'Transfer' Button on 'MainMenu' page
    Then check that 'Transfer' Button is visible on 'Transfer' page

  Scenario: 'Budget Available in Bs' field is visible after successfull transfer
    Given click 'Income' button on 'MainMenu' page
      And  fill the 'Name' field with "Test Income" on the 'Income' page
      And select "Others" value on the 'Category' selector on the 'Income' page
      And fill the 'Amount BS' field with "10000" on the 'Income' page
      And fill the 'Date of the Transaction' date field with "12/06/2019" on the 'Income' page
      And click the 'Register Transaction' button on the 'Income' page
    Then click the 'Exit' button on the 'Income' page
    Given clicked "Test" button on 'AccountHomeMenu'
    Given clicked the 'Transfer' Button on 'MainMenu' page
    And select the "Destination" value on 'Destination Account' selector on 'Transfer' Page
    And filled 'amount in BS' text field with "20" on 'Transfer' page
    And click the 'Transfer' Button on 'Transfer' page
    Then search the 'Success Message' alert on 'Transfer' page
    Then check that 'Budget Available in BS' field is visible

      Scenario: Error Message is displayed when filled 'Amount BS' field with negative number
        Given click 'Income' button on 'MainMenu' page
          And  fill the 'Name' field with "Test Income" on the 'Income' page
          And select "Others" value on the 'Category' selector on the 'Income' page
          And fill the 'Amount BS' field with "10000" on the 'Income' page
          And fill the 'Date of the Transaction' date field with "12/06/2019" on the 'Income' page
          And click the 'Register Transaction' button on the 'Income' page
        Then click the 'Exit' button on the 'Income' page
        Given clicked "Test" button on 'AccountHomeMenu'
        Given clicked the 'Transfer' Button on 'MainMenu' page
        And select the "Destination" value on 'Destination Account' selector on 'Transfer' Page
        And filled 'amount in BS' text field with "-30" on 'Transfer' page
        And click the 'Transfer' Button on 'Transfer' page
        Then Search the 'Error Message' fail alert on 'Transfer' page

      Scenario: Success Message is displayed when filled 'Amount BS' field with Rational number
        Given click 'Income' button on 'MainMenu' page
        And  fill the 'Name' field with "Test Income" on the 'Income' page
        And select "Others" value on the 'Category' selector on the 'Income' page
        And fill the 'Amount BS' field with "10000" on the 'Income' page
        And fill the 'Date of the Transaction' date field with "12/06/2019" on the 'Income' page
        And click the 'Register Transaction' button on the 'Income' page
        Then click the 'Exit' button on the 'Income' page
        Given clicked "Test" button on 'AccountHomeMenu'
        Given clicked the 'Transfer' Button on 'MainMenu' page
        And select the "Destination" value on 'Destination Account' selector on 'Transfer' Page
        And filled 'amount in BS' text field with "50.12" on 'Transfer' page
        And click the 'Transfer' Button on 'Transfer' page
        Then search the 'Success Message' alert on 'Transfer' page

      Scenario: Error Message is displayed when natural number filled in 'Amount BS' field exceeds 'Budget available in Bs' amount
        Given click 'Income' button on 'MainMenu' page
          And  fill the 'Name' field with "Test Income" on the 'Income' page
          And select "Others" value on the 'Category' selector on the 'Income' page
          And fill the 'Amount BS' field with "10000" on the 'Income' page
          And fill the 'Date of the Transaction' date field with "12/06/2019" on the 'Income' page
          And click the 'Register Transaction' button on the 'Income' page
        Then click the 'Exit' button on the 'Income' page
        Given clicked "Test" button on 'AccountHomeMenu'
        Given clicked the 'Transfer' Button on 'MainMenu' page
        And select the "Destination" value on 'Destination Account' selector on 'Transfer' Page
        And filled 'amount in BS' text field with "10000000" on 'Transfer' page
        And click the 'Transfer' Button on 'Transfer' page
        Then Search the 'Error Message' fail alert on 'Transfer' page


