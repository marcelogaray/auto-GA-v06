Feature: Check information account
  As a user
  I want to create and modify my new account name
  Scenario: Modify the name account in a new account created
    Given 'Account creator' is loaded
    And click "School" button existent in the list accounts on 'Account Creator'
    When 'Account settings' button is visible on 'Account Home'
    And click 'Account settings' button on 'Account Home'
    And 'Account Info' label is visible on 'Account Info'
    And clear 'Account name' text field on 'Account Info'
    And fill "University" 'Account name' text field on 'Account Info'
    And click 'Change name' button on 'Account Info'
    Then click 'exit' button on 'Account Info'
    And "University" button is visible on 'Account Creator'