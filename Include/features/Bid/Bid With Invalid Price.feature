#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@BidInvalid
Feature: Bid Invalid
  Buyer wants to bid with invalid harga

	@BidInvalid01
  Scenario: Bid - buyer wants to bid with invalid harga
    Given buyer invalid already login
    
    When 	buyer click last cart product
    And buyer invalid click Saya tertarik dan ingin nego button
    And buyer invalid memasukkan harga tawaran "99999999"
    And buyer invalid click tombol Kirim
    Then buyer invalid menunggu respon penjual