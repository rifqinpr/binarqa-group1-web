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

@Bid
Feature: Bid Valid
  Buyer wants to bid with valid harga

	@Bid01
  Scenario: Bid - buyer wants to bid with valid harga
    Given buyer already login
    
    When 	buyer click first cart product
    And buyer click Saya tertarik dan ingin nego button
    And buyer memasukkan harga tawaran "1000"
    And buyer click tombol Kirim
    Then buyer menunggu respon penjual
    