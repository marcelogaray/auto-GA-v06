Feature: Expenses Testing

  Background: Preconditions

    Scenario: Expense Page Button displaying
      Given Fill Account Name
      And Click Create Account Button
      And Click Account Button
      And Check if Expenses Button is displayed and clickable

    Scenario: Expense Home elements are displayed
      Given Fill Account Name
      And Click Create Account Button
      And Click Account Button
      Then Click Expenses Button on Account Home
      Given Name Field visible
      And Category Selector visible
      And Amount field visible
      And Date Picker Visible

    Scenario: Expense Creating
      Given Fill Account Name
      And Click Create Account Button
      And Click Account Button
      Then Click Expenses Button on Account Home
      And Fill Expense Name
      And Fill Expense Category
      And Fill Expense Amount
      And Fill Expense Date
      And Click Create Expense Button
