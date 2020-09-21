Feature: Delete Account

  Background:

    Given Browser is loaded
    Then Fill "Mateo" text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    And Click 'Mateo' button in 'Account Creator' page
    When 'Navbar' is loaded in 'Nav Bar' page
    Then Click 'Account Settings' button in 'NavBar' page
    When 'Account Settings' window is loaded

  Scenario: Verify 'Delete' Button deletes 'Mateo' account in 'Account Settings' Page

    Then Click 'Delete' button in Account Settings