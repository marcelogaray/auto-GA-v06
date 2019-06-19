Feature: Verify Adidas purchase process

  Background:
    Given 'AdidasHome' is loaded
    And hovered to 'HOMBRE' item on 'header'
    And clicked 'Fútbol' button on displayed container

  Scenario: Get price of the first item
    Given Wait until item price in 'AdidasShopMenu' is visible
    Then price of the first item is "$2,199"

  Scenario: Verify if shopping bag is one after a purchase
    Given clicked 'FirstItem' on 'AdidasShopMenu'
    And clicked on 'Elege tu Talla' button on 'ShoePage'
    And clicked on 'MX eight point five' button on 'ShoePage'
    When click 'Añadir al Carrito' button on 'ShoePage'
    And purchase info is visible on 'ShoePage'
    Then amount of bag should say "Cantidad: 1"

    #This Scenario can run into an error if not executed individually
  Scenario: Verify Bag elements functionality
    Given clicked 'FirstItem' on 'AdidasShopMenu'
    And clicked on 'Elege tu Talla' button on 'ShoePage'
    And clicked on 'MX eight point five' button on 'ShoePage'
    When click 'Añadir al Carrito' button on 'ShoePage'
    And purchase info is visible on 'ShoePage'
    And click 'Ver Carrito' button on 'ShoePage'
    Then shoe title is visible on 'BagPage'
    And Quantity Displayed on 'BagPage' is 1
    And price should be "$2,199.00"
    And total should be "$2,199.00"


