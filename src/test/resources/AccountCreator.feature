Feature: New accounts

  Background:
    Given Account manager is loaded

  Scenario: 'Account Creator' page is visible
    Then 'Add' button is visible on 'Account Creator'
    And 'Account name' input is visible on 'Account Creator'
