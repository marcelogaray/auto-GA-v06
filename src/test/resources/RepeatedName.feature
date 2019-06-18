
Feature: Anadir cuenta con nombre repetido

Scenario: Add account with name repeated
    Given Browser is loaded
    Then Fill 'Account Name' text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    Then Get length of 'Account List' List in 'Account Creator' Page
    And Fill 'Account Name' text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    Then Text field 'Account Name' should be empty in  'Account Creator' Page
    And List 'Account List' length should not change in 'Account Creator Page'
