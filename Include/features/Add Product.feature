@ADDP
Feature: Add Product Feature
  As a Seller, I want to add product to sell in Secondhand

  Scenario Outline: <case> - Add Product with <condition>
    Given I login as <user>
    When I click jual button
    And I fill nama product <nama_product>
    And I fill harga product <harga_product>
    And I fill kategori <kategori>
    And I fill deskripsi <deskripsi>
    And I upload image product <img>
    And I click button Terbitkan
    Then I <status> add product

    Examples: 
      | case   | condition                     | nama_product | harga_product | kategori  | deskripsi | img       | status  | user  |
      | ADDP01 | valid data                    | correct      | correct       | correct   | correct   | correct   | success | user1 |
      | ADDP02 | multiple image                | correct      | correct       | correct   | correct   | multiple  | success | user1 |
      | ADDP03 | empty field Nama Produk       | incorrect    | correct       | correct   | correct   | correct   | failed  | user1 |
      | ADDP04 | empty field Harga Produk      | correct      | incorrect     | correct   | correct   | correct   | failed  | user1 |
      | ADDP05 | empty field Kategori          | correct      | correct       | incorrect | correct   | correct   | failed  | user1 |
      | ADDP06 | empty field Deskripsi         | correct      | correct       | correct   | incorrect | correct   | failed  | user1 |
      | ADDP07 | no upload image               | correct      | correct       | correct   | correct   | empty     | failed  | user1 |
      | ADDP08 | harga negative                | correct      | negative      | correct   | correct   | correct   | failed  | user1 |
      | ADDP09 | upload invalid image filetype | correct      | correct       | correct   | correct   | incorrect | failed  | user2 |
