@EDP
Feature: Edit Product
  I want to edit product

  Scenario Outline: <case> - Edit Product with <condition>
    Given I login
    And I click Product saya
    And I click Detail Product
    When I click button Edit
    And I edit nama product <nama_product>
    And I edit harga product <harga_product>
    And I edit kategori <kategori>
    And I edit deskripsi <deskripsi>
    When I click button terbitkan
    Then I <status> edit product

    Examples: 
      | case  | condition   | nama_product | harga_product | kategori | deskripsi | status  |
      | EDP01 | valid data  | correct      | correct       | correct  | correct   | success |
      | EDP02 | empty field | incorrect    | correct       | correct  | correct   | failed  |
