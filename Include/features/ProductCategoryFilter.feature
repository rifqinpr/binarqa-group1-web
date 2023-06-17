@ProductCategoryFilter
Feature: Product Category Filter
  As a User, I want to see product based on category filter

  @CAT
  Scenario Outline: ProductCategoryFilter - See <category> Product Category
    Given User is in homepage and see product category filter button 
    When User click <category> button
    Then Verify List of products that match <category> will be shown

    Examples: 
      | category   |
      | Semua      |
      | Hobi       |
      | Kendaraan  |
      | Baju       |
      | Elektronik |
      | Kesehatan  |
