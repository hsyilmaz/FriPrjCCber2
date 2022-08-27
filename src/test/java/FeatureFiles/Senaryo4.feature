Feature: Shopping Functionality

  Background:
    Given Navigate to site
    When Click on the element in the Dialog
      | signInButton1 |
    And User sending the keys in Dialog content
      | email         | ferd211@hotmail.com |
      | logInPassword | Ferd212022          |
    When Click on the element in the Dialog
      | signInButton2 |

  Scenario: Shopping item
    When Click on the element in the Dialog
      | imgButton    |
      | addtoCard    |
      | shoppingCart |
      | checkout     |
      | shipHere     |
      | next         |
      | shipHere2    |
      | next2        |
    Then Success message should be displayed Shopping