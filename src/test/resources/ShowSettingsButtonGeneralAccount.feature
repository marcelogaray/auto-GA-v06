Feature: Settings Button in General Account
  Background:

    Given Browser is loaded
    Then Click 'General Account' button in 'Account Creator' page

    Scenario: Verify 'Account Settings' button is not visible in 'Account Creator' page

    Then Verify button 'Account Settings' is not visible in 'NavBar' Page