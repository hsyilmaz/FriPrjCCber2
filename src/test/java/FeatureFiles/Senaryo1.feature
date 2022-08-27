Feature: Create Functionality

  Background:
    Given Navigate to site

  Scenario: Create a account
    When  Click on the element in the Dialog
      | createAccountButton |

    And User sending the keys in Dialog content
      | firstname            | Ferdi            |
      | lastname             | Ferdan              |
      | email_address        | ferd211@hotmail.com |
      | password             | Ferd212022          |
      | passwordConfirmation | Ferd212022          |
    When Click on the element in the Dialog
      | createAccountButton2 |
    Then Success message should be displayed
