Feature: Editar una cuenta


  Background:

    Given Browser is loaded
    Then Fill "Mateo" text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    And Click 'Mateo' button in 'Account Creator' page
    When 'Navbar' is loaded in 'Nav Bar' page
    Then Click 'Account Settings' button in 'NavBar' page
    When 'Account Settings' window is loaded

  Scenario Outline: Verify Account name can be edited with alphanumeric characters in 'Account Main Menu' Page

    Then Fill 'Account Name' text field with "<listAlphaNumericName>" in 'Account Settings' page
    And Click 'Change name' button in 'Account Settings' page

    Examples:

    |listAlphaNumericName|
    |Mateo1, PUNA2       |


  Scenario Outline: Verify Account name cannot be edited with empty character in 'Account Main Menu' Page

    Then Fill 'Account Name' text field with "<Name>" in 'Account Settings' page
    And Click 'Change name' button in 'Account Settings' page

    Examples:
    |Name|
    |    |


  Scenario Outline: Verify Account name can be edited with special characters in 'Account Main Menu' Page

    Then Fill 'Account Name' text field with "<listSpecialCharacterName>" in 'Account Settings' page
    And Click 'Change name' button in 'Account Settings' page

    Examples:
    |listSpecialCharacterName|
    |@#$%^&*  , tgg^7uj$     |
    |v{}{:}:, srffj6*9       |


  Scenario Outline: Verify Account name cannot be edited to have more than 200 characters 'Account Main Menu' Page

    Then Fill 'Account Name' text field with "<longName>" in 'Account Settings' page
    And Click 'Change name' button in 'Account Settings' page
    Then Click 'Home Page' button in 'NavBar' page
    Then Verify the name "<longName>" wasn't added to an account in 'Account Creator' Page

    Examples:
      |longName|
      |Pablito clavo un clavito en la cabeza de un calvito!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!|


  Scenario Outline: Verify edit can be cancelled without changing the name in 'Account Main Menu' Page

    Then Fill 'Account Name' text field with "<listName>" in 'Account Settings' page
    And Click 'Home Page' button in 'NavBar' page

    Examples:
    |listName|
    |fernando, 1P|
    |FERNANDO, 24^t|




