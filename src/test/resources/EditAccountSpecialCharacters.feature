Feature: Editar nombre con caracteres especiales
  Scenario: With special characters
    Given Browser is loaded
    Then Fill 'Account Name' text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    And Click 'Mateo' button in 'Account Creator' page
    When 'Navbar' is loaded in 'Nav Bar' page
    Then Click 'Account Settings' button in 'NavBar' page
    When 'Account Settings' window is loaded
    Then Fill 'Account Name' text field with "!@#$%^" in 'Account Settings' page
    And Click 'Change name' button in 'Account Settings' page