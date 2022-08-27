Feature: Login Functionality

  Background:
    Given Navigate to site

  Scenario: Login Successfully
    When Click on the element in the Dialog
      | signInButton1 |
    And User sending the keys in Dialog content
      | email         | ferd211@hotmail.com |
      | logInPassword | Ferd212022          |
    When Click on the element in the Dialog
      | signInButton2 |
    Then Success message should be displayed Login
