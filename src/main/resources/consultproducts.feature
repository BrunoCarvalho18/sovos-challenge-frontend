#Author: Bruno Carvalho

@general
Feature: Consult Products
  I would like to consult the products

  @consult-products
  Scenario: Consult Products
    Given  I am on the home page
    When I put this "<item>" on the cart
    Then I should see products on the cart
  
  Examples:
    |item            |
    |Mackbook air M1 |

  
