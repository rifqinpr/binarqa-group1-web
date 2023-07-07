@DP
Feature: Delete Product
  I want to delete product

  Scenario: DP01 - Delete product
    Given I Login
    And I click Product
    And I click Product Detail
    When I click button Delete
    Then I success delete product
