@ProductCategoryFilter
Feature: Product Category Filter
  As a User, I want to see product based on category filter

  @CAT
  Scenario Outline: <case> - See <category> Product Category
    Given User is in homepage and see product category filter button
    When User click <category> button
    Then Verify List of products that match <category> will be shown

    Examples: 
      | category   | case  |
      | Semua      | CAT01 |
      | Hobi       | CAT02 |
      | Kendaraan  | CAT03 |
      | Baju       | CAT04 |
      | Elektronik | CAT05 |
      | Kesehatan  | CAT06 |
