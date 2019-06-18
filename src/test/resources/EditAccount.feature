Feature: Editar una cuenta


  Background:

    Given Browser is loaded
    Then Fill 'Account Name' text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    And Click 'Mateo' button in 'Account Creator' page
    When 'Navbar' is loaded in 'Nav Bar' page
    Then Click 'Account Settings' button in 'NavBar' page
    When 'Account Settings' window is loaded

  Scenario: Verify Account name can be edited with alphanumeric characters in 'Account Main Menu' Page

    Then Fill 'Account Name' text field with "Puna" in 'Account Settings' page
    And Click 'Change name' button in 'Account Settings' page

  Scenario: Verify Account name cannot be edited with empty character in 'Account Main Menu' Page

    Then Fill 'Account Name' text field with " " in 'Account Settings' page
    And Click 'Change name' button in 'Account Settings' page

  Scenario: Verify Account name can be edited with special characters in 'Account Main Menu' Page

    Then Fill 'Account Name' text field with "!@#$%^" in 'Account Settings' page
    And Click 'Change name' button in 'Account Settings' page

  Scenario: Verify edit can be cancelled without changing the name in 'Account Main Menu' Page

    Then Fill 'Account Name' text field with "Fernando" in 'Account Settings' page
    And Click 'Home Page' button in 'NavBar' page

  Scenario: Verify 'Delete' Button deletes 'Mateo' account in 'Account Settings' Page

    Then Click 'Delete' button in Account Settings
