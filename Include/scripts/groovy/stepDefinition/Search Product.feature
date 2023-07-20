@SearchProduct
Feature: Search Product
  As a user i want to search product by input product name in search field

  Background: 
    Given User is in Secondhand homepage

  @SRC01
  Scenario Outline: SRC01 - User want to search product
    When User input <text> of product name in search field
    And User press Enter key
    Then List of products that match with <text> inputted will be shown

    Examples: 
      | text    |
      | hrv     |
      | kemeja  |
      | zenbook |
