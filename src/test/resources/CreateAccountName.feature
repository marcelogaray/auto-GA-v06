
Feature: Crear cuenta y asignarle un nombre


  Background:

    Given Browser is loaded

  Scenario Outline: Verify account with repeated name cannot be added in 'Account Creator' Page

    Then Fill "<AccountName>" text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    Then Get length of 'Account List' List in 'Account Creator' Page
    And Fill "<AccountName>" text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    Then Text field 'Account Name' should be empty in  'Account Creator' Page
    And List 'Account List' length should not change in 'Account Creator Page'


    Examples:

      |AccountName|
      |New Account|
      |Mateo4711  |

    Scenario Outline: Verify account with empty name cannot be added in 'Account Creator' Page


      And Fill "<AccountName>" text field in 'Account Creator' page
      And Click 'Add' button in 'Account Creator' page
      Then Text field 'Account Name' should be empty in  'Account Creator' Page
      And List 'Account List' length should not change in 'Account Creator Page'


      Examples:

        |AccountName|
        ||


  Scenario Outline: Verify account with name 'General' cannot be added in 'Account Creator' Page


    And Fill "<AccountName>" text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    Then Text field 'Account Name' should be empty in  'Account Creator' Page
    And List 'Account List' length should not change in 'Account Creator Page'


    Examples:

      |AccountName|
      |General|

  Scenario Outline: Verify account with name containing only spaces cannot be added in 'Account Creator' Page


    And Fill "  " text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    Then Text field 'Account Name' should be empty in  'Account Creator' Page
    And List 'Account List' length should not change in 'Account Creator Page'


    Examples:

      |AccountName|
      |      |


  Scenario Outline: Verify account with name larger than 200 characters cannot be added in 'Account Creator' Page


    And Fill "<AccountName>" text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    Then Text field 'Account Name' should be empty in  'Account Creator' Page
    And List 'Account List' length should not change in 'Account Creator Page'


    Examples:

      |AccountName|
      |  Pablito clavo un clavito en la cabeza de un calvito , !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  |



