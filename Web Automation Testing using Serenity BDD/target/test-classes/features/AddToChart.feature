@AddToChart
Feature: Feature check out

#    Scenario: Normal login
#      Given User open the website sauce demo
#      When User input "standard_user" as userName and input "secret_sauce" as password
#      And User pick item Sauce Labs Backpack
#
#    Scenario: Sort Product and Add Product To Cart
#      Given User open the website sauce demo
#      When User input "standard_user" as userName and input "secret_sauce" as password
#      Then User already on landing page
#      And User sort product by "Price (low to high)" as sortBy
#      And User pick item Sauce Labs Backpack
#
#  Scenario Outline: Invalid Login
#    Given User open website saucedemo
#    When User input "<username>" as userName and input "<password>" as password
#    Then User see error "<errorMessage>" on login page
#    Examples:
#      | username | password | errorMessage                                                              |
#      | dicky    | 123      | Epic sadface: Username and password do not match any user in this service |
#      | dicky    |          | Epic sadface: Password is required                                        |
#      |          | 123      | Epic sadface: Username is required                                        |

  Scenario: Checkout Product
    Given User open website saucedemo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on landing page
    And User sort product by "Name (Z to A)" as sortBy
    And User checkout "Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red)" as products to cart
    And User click on checkout icon
    Then User verify that "Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red)" as products in a list
    And User remove "Test.allTheThings() T-Shirt (Red)" as products in a list
    And User click checkout button
    Then User already on Checkout: Your Information
    When User input "Muhammad" as First Name , input "Fikri" as Last Name and input "10020" as Zip/Postal Code
    Then User already on Checkout: Overview Page
    Then User verify that "Sauce Labs Onesie" as products in payment list
    And User verifies the price of goods according to the price displayed
    And User click on finish button
    Then User already on Checkout: Complete!