Feature: Check list accounts on Account Creator
  Scenario: Create a new account and enter to this
    Given 'Account creator' is loaded
    And window is maximized
    And fill "University" 'Account name' text field on 'Account Creator'
    And press 'Add' button on 'Account Creator'
    When "University" button is visible on 'Account Creator'
    Then click "University" button in the list accounts on 'Account Creator'
    And 'Personal Wallet' button is visible on 'Account Home'