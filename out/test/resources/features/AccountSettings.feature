Feature: Verify Account Settings Functionality
  Background:
    Given The 'AccountHomeMenu' is loaded
    And filled 'Account name' field on 'AccountHomeMenu' with "Settings"
    And clicked 'Add' button on 'AccountHomeMenu'

  Scenario: Check if an account is deleted
    Given Clicked "Settings" account button 'AccountHomeMenu' page
    When Click 'Account Settings' button on 'MainMenu' page
    And Click 'Delete account' button on 'AccountSettings' page
    Then 'AccountHomeMenu' has 1 account button

  Scenario: Check if the account title changes
    Given Clicked "Settings" account button 'AccountHomeMenu' page
    When Click 'Account Settings' button on 'MainMenu' page
    And Change 'Account name' field on 'AccountSettings' page by adding "Testing" to it
    And Click 'Change name' button on 'AccountSettings' page
    And Click 'Exit' button on 'AccountSettings' page
    Then The account title is "SettingsTesting"
