@BidInvalid01
Feature: Bid Invalid01
  Buyer wants to bid with minus harga

	@BidInvalid01
  Scenario: Bid - buyer wants to bid with negative harga
  
    Given buyer invalid already login  
    When 	buyer click cart product
    And buyer invalid click Saya tertarik dan ingin nego button
    And buyer memasukkan harga tawaran
    And buyer invalid click tombol Kirim
    Then buyer invalid verify
    

	@BidInvalid02
  Scenario: Bid - buyer wants to bid alphabet and special character
  
    Given buyer click homepage
    When 	buyer click cart product ketiga
    And buyer invalid click Saya tertarik dan ingin nego button
    And buyer memasukkan harga tawaran alphabet
    And buyer invalid click tombol Kirim
    And buyer invalid verify text
    Then buyer click X
    
  @BidInvalid03
  Scenario: Bid - buyer wants to bid with null harga
  
    Given buyer click homepage
    When 	buyer click last cart
    And buyer invalid click Saya tertarik dan ingin nego button
    And buyer memasukkan harga tawaran null
    And buyer invalid click tombol Kirim
    Then buyer invalid verify
 