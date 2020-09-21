Feature: Expenses Testing

  Background: Preconditions

    Scenario: Check if 'Expenses' button is displayed and visible
      Given Fill "Cuenta1" in 'Account Name' text field on 'Account Creator'
      And Click 'Create Account' Button on 'Account Creator'
      And Select and Click  Account "Cuenta1" Button on 'Account Creator'
      And Check if "Expenses" Button is displayed and clickable on 'Account Home'

    Scenario: Expense Home elements are displayed
      Given Fill "Cuenta1" in 'Account Name' text field on 'Account Creator'
      And Click 'Create Account' Button on 'Account Creator'
      And Select and Click  Account "Cuenta1" Button on 'Account Creator'
      Then Click 'Expenses' Button on 'Account Home'
      Given Check if 'Expense Name' TextField is visible on 'Expenses Page'
      And Check if 'Expense Category Selector' is visible on 'Expense Page'
      And Check if 'Expense Amount' TextField is visible on 'Expenses Page'
      And Check if 'Date Picker' is Visible on 'Expenses Page'

    Scenario: Expense Creating
      Given Fill "Cuenta1" in 'Account Name' text field on 'Account Creator'
      And Click 'Create Account' Button on 'Account Creator'
      And Select and Click  Account "Cuenta1" Button on 'Account Creator'
      Then Click 'Expenses' Button on 'Account Home'
      And Fill "Medical Bills" in 'Expense Name' on 'Expenses Page'
      And Fill "Expenses" in 'Expense Category' on 'Expense Page'
      And Fill "1000" in 'Expense Amount' on 'Expense Page'
      And Fill "12/06/2019" in 'Expense Date' on 'Expense Page'
      And Click 'Create Expense' Button on 'Expense Page'
