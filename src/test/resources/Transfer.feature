Feature: Testing Transfer page
  Background: Previous steps
    Given 'Account creator' is loaded

    Scenario: Creating a sceneario previous test Transfer
      Then Insert the name "Count 1" in the field account name for create a new Account
      And click in the add button for create the new accoun 'Count1'
      Then Insert the name "Count 2" in the field account name for create a new Account
      And click in the add button for create the new accoun 'Count2'
      Then click in the 'Count 2'
      And click 'Income' Button in the main page 'Count2'
      Then Insert "Pepe" in the field 'Name' in the page 'Icome'
      And Insert "Salary" in the field 'Category' in the page 'Icome'
      And Insert "1000" in the field 'Mount' in the page 'Icome'
      And Insert "01/01/2019" in the field 'Date' in the page 'Icome'
      Then click the button 'Register Transaction' in the page 'Income'

  Scenario: Test Transfer page Function
    Then click in the 'Count 2'
    And click the button 'Transfer' in the main page in the 'Count 2'
    Then insert "Count 1" in the field destination in the page 'Tranfer'
    And insert "10" in the fiel mount in the page 'Tranfer'
    And click button 'Transfer' in the page 'Transfer'


  Scenario: Test message succesfull transaction
    Then click in the 'Count 2'
    And click the button 'Transfer' in the main page in the 'Count 2'
    Then insert "Count 1" in the field destination in the page 'Tranfer'
    And insert "10" in the fiel mount in the page 'Tranfer'
    And click button 'Transfer' in the page 'Transfer'
    Then Verify if the mesage 'Succesfull' appears

  Scenario: Test message bad for incomplete name account in the  transaction
    Then click in the 'Count 2'
    And click the button 'Transfer' in the main page in the 'Count 2'
    And insert "10" in the fiel mount in the page 'Tranfer'
    And click button 'Transfer' in the page 'Transfer'
    Then Verify if the mesage 'Bad' appears

  Scenario: Test message bad for incomplete mount in the  transaction
    Then click in the 'Count 2'
    And click the button 'Transfer' in the main page in the 'Count 2'
    Then insert "Count 1" in the field destination in the page 'Tranfer'
    And click button 'Transfer' in the page 'Transfer'
    Then Verify if the mesage 'Bad' appears

  Scenario: Test message bad for incomplete form in the  transaction
    Then click in the 'Count 2'
    And click the button 'Transfer' in the main page in the 'Count 2'
    And click button 'Transfer' in the page 'Transfer'
    Then Verify if the mesage 'Bad' appears

  Scenario: Category 'Expenses' is visible in the 'Category' selector on the 'Expenses' page.
    Then click in the 'Count 2'
    And Click button 'Expenses' on 'Account Home'
    Then verify if the category 'Expenses' is visible

  Scenario: Category 'Others' is visible in the 'Category' selector on the 'Expenses' page.
    Then click in the 'Count 2'
    And Click button 'Expenses' on 'Account Home'
    Then verify if the category 'Others' is visible


  Scenario: Category 'Others' is not visible in the 'Category' selector on the 'Expenses' page.
    Then click in the 'Count 2'
    And Click button 'Expenses' on 'Account Home'
    Then verify if the category 'Others' is not visible

  Scenario: Category 'Salary' is not visible in the 'Category' selector on the 'Income' page.
    Then click in the 'Count 2'
    And click 'Income' Button in the main page 'Count2'
    Then verify if the category 'Salary' is visible in the page 'Income'

  Scenario: Category 'Others' is not visible in the 'Category' selector on the 'Income' page.
    Then click in the 'Count 2'
    And click 'Income' Button in the main page 'Count2'
    Then verify if the category 'Others' is visible in the page 'Income'







