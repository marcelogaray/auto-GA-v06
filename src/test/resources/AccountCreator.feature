Feature: New accounts
  Scenario: Fill an input correctly and create account
    Given Account manager is loaded
    And fill "A new account" account name input
    Then click create button
