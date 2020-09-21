Feature: Check to delete an account
  As I user
  I want to delete an new account
  Scenario: Delete an account empty
    Given 'Account creator' is loaded
    And window is maximized
    When click "Savings" button existent in the list accounts on 'Account Creator'
    And 'Personal Wallet' button is visible on 'Account Home'
    And click 'Account settings' button on 'Account Home'
    Then 'Delete account' button is visible on 'Account Info'
    And click 'Delete account' button on 'Account Info'
    And 'General' button is visible on 'Account Creator'