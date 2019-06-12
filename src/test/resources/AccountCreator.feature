Feature: New accounts

  Background:
    Given Account manager is loaded

  Scenario: Fill an input correctly and create account
    And fill "A new account" 'Account name' input on 'Account Manager'
    Then click 'Add' button on 'Account Manager'
