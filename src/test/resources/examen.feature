Feature: Add product to cart in Adidas Page
  Scenario: Add product to cart in 'Adidas' Page
    Given BrowserExamen is loaded
    Then Hover 'hombre' button in 'Adidas' navbar
    And Click 'Futbol' button in 'Adidas' navbar
    And Get 'Shoe Price Tag' in  'ShoeButton' Page
    Then Click 'Shoe Button' in 'Shoe Button' Page
    And Click 'Elige tu talla' select in 'ShoeDescription' Page
    And Click 'ochoYMedio' option in 'Elige tu talla' select
    And Click 'Anadir al carrito' button in 'Shoe Description' Page
    Then Verify 'Amount' equals "Cantidad: 1" in 'ShoeAddedToCart' Page
    And Click 'Ver Carrito' button in 'ShoeAddedToCart' Page
    Then Verify  title 'Calzado' is visible in 'CartResume' Page
    And Verify title 'Total' is equal to price in 'CartResume' Page


