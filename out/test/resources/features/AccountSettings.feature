Feature: Verify Account Settings Functionality
  Background:
    Given The 'AccountHomeMenu' is loaded
    And filled 'Account name' field on 'AccountHomeMenu' with "Settings"
    And clicked 'Add' button on 'AccountHomeMenu'

  Scenario: Check if an account is deleted
    Given clicked "Settings" button on 'AccountHomeMenu'
    When Click 'Account Settings' button on 'MainMenu' page
    And Click 'Delete account' button on 'AccountSettings' page
    Then 'AccountHomeMenu' has 1 account button

  Scenario: Check if the account title changes
    Given clicked "Settings" button on 'AccountHomeMenu'
    When Click 'Account Settings' button on 'MainMenu' page
    And Change 'Account name' field on 'AccountSettings' page by adding "Testing" to it
    And Click 'Change name' button on 'AccountSettings' page
    And Click 'Exit' button on 'AccountSettings' page
    Then The account title is "SettingsTesting"

  Scenario: Check if the account cannot rename to an existing account
    Given filled 'Account name' field on 'AccountHomeMenu' with "Settings2"
    And clicked 'Add' button on 'AccountHomeMenu'
    And clicked "Settings" button on 'AccountHomeMenu'
    When Click 'Account Settings' button on 'MainMenu' page
    And Change 'Account name' field on 'AccountSettings' page by adding "2" to it
    And Click 'Change name' button on 'AccountSettings' page
    And Click 'Exit' button on 'AccountSettings' page
    Then The account title is "Settings"

  Scenario: Account not deleted if has an income in it
    Given clicked "Settings" button on 'AccountHomeMenu'
    And click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "ingreso" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "06/15/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    And Click 'Account Settings' button on 'Income' page
    When Click 'Delete account' button on 'AccountSettings' page
    Then Button "Settings" exists

  Scenario: Check if an account can be renamed with symbols
    Given clicked "Settings" button on 'AccountHomeMenu'
    When Click 'Account Settings' button on 'MainMenu' page
    And Change 'Account name' field on 'AccountSettings' page by adding "@#$%" to it
    And Click 'Change name' button on 'AccountSettings' page
    And Click 'Exit' button on 'AccountSettings' page
    Then The account title is "Settings@#$%"

  Scenario: Check if 'Account Info' title exists on 'Account Settings'
    Given clicked "Settings" button on 'AccountHomeMenu'
    When Click 'Account Settings' button on 'MainMenu' page
    Then 'Account Info' title is visible on 'AccountSettings' page

  Scenario: Check if 'Account name' field starts with the account name in it
    Given clicked "Settings" button on 'AccountHomeMenu'
    When Click 'Account Settings' button on 'MainMenu' page
    Then 'Account name' field on 'AccountSettings' is filled with "Settings"

  Scenario: Account not deleted if has a transfer in it
    Given filled 'Account name' field on 'AccountHomeMenu' with "Settings2"
    And clicked 'Add' button on 'AccountHomeMenu'
    And clicked "Settings" button on 'AccountHomeMenu'
    And click 'Income' button on 'MainMenu' page
    And fill 'income name' field with "Test Income" on 'Income Page'
    And select "Others" values on 'category' selector on 'Income Page'
    And fill 'AmountBS' field with "1000" on 'Income Page'
    And fill 'DateField' field with "11/05/2019" on 'Income Page'
    And click 'Register Transaction' button on 'Income Page'
    And click 'Exit' button on 'Income' page
    And clicked "Settings" button on 'AccountHomeMenu'
    And clicked 'Transfer' Button on 'MainMenu' page
    And select "Settings2" value on 'Destination Account' selector on 'Transfer' Page
    And filled 'amount in BS' text field with "50" on 'Transfer' page
    And click 'Transfer' Button on 'Transfer' page
    And click 'Exit' button on 'Income' page
    When clicked "Settings2" button on 'AccountHomeMenu'
    And Click 'Account Settings' button on 'MainMenu' page
    And Click 'Delete account' button on 'AccountSettings' page
    Then Button "Settings2" exists
