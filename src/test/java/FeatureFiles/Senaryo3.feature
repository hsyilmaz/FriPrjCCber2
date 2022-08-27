Feature: Create Functionality

  Background:
    Given Navigate to site
    When Click on the element in the Dialog
      | signInButton1 |
    And User sending the keys in Dialog content
      | email         | ferd211@hotmail.com |
      | logInPassword | Ferd212022          |
    When Click on the element in the Dialog
      | signInButton2 |

  Scenario Outline: Create Address
    When Click on the element in the Dialog
      | myAccount1       |
      | myAccount2       |
      | manageAddress    |
      | newAddressButton |

    And User selecting Dialog content
      | country |

    And User sending the keys in Dialog content
      | streetAddress | <streetAddress> |
      | city          | <city>          |
      | zip           | <zip>           |
      | telephone     | <telephone>     |

    When Click on the element in the Dialog
      | saveAddress |

    Then Success message should be displayed Address

    Examples:
      | streetAddress | city      | zip   | telephone |
      | kadikoy1      | istanbul1 | 23231 | 55551     |
      | kadikoy2      | istanbul2 | 23232 | 55552     |
      | kadikoy3      | istanbul3 | 23233 | 55553     |