Feature: ELiminar ingresos y egresos

  Scenario: Delete income
    Given  Browser is loaded
    Then Fill 'Account Name' text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    Then  Click 'Mateo' button in 'Account Creator' page to load Account Main Menu
    When  'Account Main Menu' Page is loaded
    Then Click 'Report' button in 'Account Main Menu' Page
    And Click 'Report Type' Selector in 'Report' Page
    And Click 'By category' Type in 'Report Type Selector' in 'Report' Page
    Then Click 'Show Report' Button in 'Report' Page
    And Click 'Mateo' delete button in 'Report' table in 'Report' page


  Scenario: Delete outcome
    Given Browser is loaded
    Then  Click 'Mateo' button in 'Account Creator' page
    When  'Account Main Menu' Page is loaded
    Then Click 'Report' button in 'Account Main Menu' Page
    And Click 'Report Type' Selector in 'Report' Page
    And Click 'By category' Type in 'Report Type Selector' in 'Report' Page
    Then Click 'Show Report' Button in 'Report' Page
    And Click 'Celular' delete button in 'Report' table in 'Report' page


  Scenario: Add account with name repeated
      Given Browser is loaded
      Then Fill 'Account Name' text field in 'Account Creator' page
      And Click 'Add' button in 'Account Creator' page
      Then Get length of 'Account List' List in 'Account Creator' Page
      And Fill 'Account Name' text field in 'Account Creator' page
      And Click 'Add' button in 'Account Creator' page
      Then Text field 'Account Name' should be empty in  'Account Creator' Page
      And List 'Account List' length should not change in 'Account Creator Page'






