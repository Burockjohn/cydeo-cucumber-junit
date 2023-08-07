Feature: Web table user order feature


  Scenario: User should be able to place order and order seen in web table

    Given user is should already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "MasterCard"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    When user should see "Sherlock Holmes" in first row of the web table

  @wip
  Scenario Outline:User should be able to place order and order seen in web table

    Given user is should already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipCode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expiryDate>"
    And user enters process order button
    When user should see "<expectedName>" in first row of the web table

    Examples: Famous female scientists
      | productType | quantity | customerName      | street            | city   | state   | zipCode | cardType   | cardNumber       | expiryDate | expectedName      |
      | Familybea   | 2        | Rosalind Franklin | 221B Baker Street | London | England | 50505   | Mastercard | 1111222233334444 | 12/23      | Rosalind Franklin |
      | MoneyCog    | 2        | Marie Curie       | 221B Baker Street | London | England | 50505   | Mastercard | 1111222233334444 | 12/23      | Marie Curie        |
      | Screenable  | 2        | List Meitner      | 221B Baker Street | London | England | 50505   | Mastercard | 1111222233334444 | 12/23      | List Meitner      |

