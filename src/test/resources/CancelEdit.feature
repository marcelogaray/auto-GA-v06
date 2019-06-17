Feature: Cancelar edicion del nombre de una cuenta
  Scenario: Edit account name
    Given Browser is loaded
    Then Fill 'Account Name' text field in 'Account Creator' page
    And Click 'Add' button in 'Account Creator' page
    And Click 'Mateo' button in 'Account Creator' page
    When 'Navbar' is loaded in 'Nav Bar' page
    Then Click 'Account Settings' button in 'NavBar' page
    When 'Account Settings' window is loaded
    Then Fill 'Account Name' text field with "Fernando" in 'Account Settings' page
    And Click 'Home Page' button in 'NavBar' page