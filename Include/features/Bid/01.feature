@BidInvalid
Feature: Bid Invalid
  Buyer wants to bid with invalid harga

	@BidInvalid
  Scenario: Bid - buyer wants to bid with invalid harga
    Given buyer invalid already login
    
    When 	buyer click first cart product
    And buyer invalid click Saya tertarik dan ingin nego button
    And buyer invalid memasukkan harga tawaran "9999999999"
    And buyer invalid click tombol Kirim
    Then buyer invalid menunggu respon penjual