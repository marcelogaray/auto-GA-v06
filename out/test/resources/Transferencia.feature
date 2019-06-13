Feature: testing transfer
  Background: previous steps
    Given Account creator is loadedd

  Scenario: creating counts
    Then insert name count "Count1"
    And click add button
    Then  new acount "Count2"
    And  click two add button
    And click Acount Button
    And click income buttonn
    And click button name
    And complete name "Recibo"
    And click Categoty
    And complete category "Salary"
    And click mont button
    And field mont "100"
    And fill data "10/10/2019"
    And click addtrnafer

  Scenario: transferencia
    Then click firstCount
    And click Transfer Button
    Then click destination
    And filed countname "Count2"
    And empty field amount
    And field mount tranfer "10"
    Then click transerferButton
    And check msg-succesful

  Scenario: transferencia bad
    Then click firstCountt
    And click Transfer Buttonn
    Then click destinationn
    And filed countnamee "Count2"
    Then click transerferButtonn
    And check msg-error

  Scenario: error empty count doing a tranfer
    Then click firstCoun
    And Click Tranfer button
    And Click trnasfer Button
    And check message error is true

Scenario: see other error
  Then click second count
  And click trasfer button
  Then empty fiel ammunt
  And files ammount tranfer "100000"
  Then try to make a biggest mount tranfer
  And check message error


