@BID
Feature: Buyer Bid Product
  As a buyer, I want to buy/bid product

  Scenario Outline: <case> - Bid with <condition>
    Given buyer already login
    When buyer click first product card
    And buyer click Saya tertarik dan ingin nego button
    And buyer memasukkan harga tawaran <price>
    And buyer click tombol Kirim
    Then verify buy status expected <status>

    Examples: 
      | case  | condition                      | price     | status  |
      | BID01 | valid input                    |      1000 | success |
      | BID02 | input harga tawar>harga produk | 999999999 | failed  |
      | BID03 | input negative                 |    -10000 | failed  |
      | BID04 | input non-numeric              | *&AS*SAD- | failed  |
      | BID05 | empty field                    | empty     | failed  |
