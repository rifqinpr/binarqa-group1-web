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
@BatalkanTransaksi
Feature: Update Status Batalkan Transaksi
  Seller update status to Batalkan Transaksi

  @BatalkanTransaksi01
  Scenario:  Seller wants to update status to batalkan transaksi
  	
    Given seller has already login and has product and approved
    When sellers click notification
    And sellers click all notification
    And sellers click first notification and already bid and accepted
    And sellers click Status
    And sellers click radio button Batalkan Transaksi
    And sellers click Kirim button
    Then Verify text Penjualan dibatalkan
