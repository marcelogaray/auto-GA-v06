Feature: Test reports for new account

  Background:
    Given The main page is loaded
    Given Fill account name field on 'home menu' page with "Test"
    And Click 'Add' button on 'home menu' page

  Scenario: Check that the title of the reports page includes the account name
    Given Click "Test" button on 'home menu' page
    When Click 'Reports' button on 'main menu' page
    Then The title is "Reports for: Test"

  Scenario: Check that the reports table is empty when there is no data for the account
    Given Click "Test" button on 'home menu' page
    When Click 'Reports' button on 'main menu' page
    And Select 'By category' in the select option on 'reports' page
    And Click 'Show report' button on 'reports' page
    Then The table has "1" rows