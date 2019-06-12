Feature: Check incomes creator

  Background: Preconditions
    Given 'Account creator' is loaded
    And window is maximized
    And fill "Test Account" 'Account name' text field on 'Account Creator'
    And press 'Add' button on 'Account Creator'
    Then click on "Test Account" button

  Scenario: Check if income button is visible
    And the 'Income' button is visible

  Scenario: Check the web elements visibility on 'Income'
    Then click 'Income' Button
    When the  button 'Register Category' is visible
    And the field 'Name' on Register Category is visible
    When the field 'Name' on Incomes is visible
    And the selector 'category' on Incomes is visible
    And the field 'Amount BS' on Incomes is visible
    And the field 'Date' on Incomes is visible
    And the button 'Register Transaction' on Incomes is visible
    When the selector 'Select transaction Name' on Modify Income is visible
    And the field 'New Name' on Modify Income is visible
    And the selector 'New Category' on Modify Income is visible
    And the field 'Date' on Modify Income is visible
    And the field 'Amount' on Modify Income is visible
    And the button 'Register Changes' on Modify Income is visible

  Scenario: Create new 'Income' with default 'Salary' Category correctly
    Then click 'Income' Button
    And fill "Test Income" on the Income name field
    And select "Salary" on the Income category selector
    And fill "777" on the Income amount field
    And  fill "12/06/2019" on the Income date field
    Then click on 'Register Transaction' Income button
    And Income creation succeeded

  Scenario: Create new 'Income' wrong
    Then click 'Income' Button
    And fill "Bad Income" on the Income name field
    Then click on 'Register Transaction' Income button
    And Income creation failed

  Scenario: Create an 'Income' Category correctly
    Then click 'Income' Button
    And fill "Test Category" on the category field
    Then click Register category Button
    And category creation succeeded

  Scenario: Create an 'Income' Category wrong
    Then click 'Income' Button
    And fill "" on the category field
    Then click Register category Button
    And category creation failed

  Scenario: Create new 'Income' with custom 'Test Category' Category correctly
    Then click 'Income' Button
    And fill "Test Income 2" on the Income name field
    And select "Test Category" on the Income category selector
    And fill "1000" on the Income amount field
    And  fill "12/06/2019" on the Income date field
    Then click on 'Register Transaction' Income button
    And Income creation succeeded

  Scenario: Modify 'Income' wrong
    Then click 'Income' Button
    And select "Test Income 2" on the Modify name selector
    And fill "Test Income 2" on the Modify name field
    And select "Test Category" on the Modify category selector
    And  fill "11/06/2019" on the Modify date field
    And fill "69" on the modify amount field
    Then click 'Register Changes' button
    And edit Income failed

  Scenario: Modify 'Income' correctly
    Then click 'Income' Button
    And select "Test Income 2" on the Modify name selector
    And fill "New Name Income Test" on the Modify name field
    And select "Test Category" on the Modify category selector
    And  fill "11/06/2019" on the Modify date field
    And fill "69" on the modify amount field
    Then click 'Register Changes' button
    And edit Income succeeded
    And close Window
