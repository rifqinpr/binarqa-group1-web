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
@Terjual
Feature: Update Status Terjual
  Seller update status to berhasil terjual

  @Terjual01
  Scenario:  Seller wants to update status to berhasil terjual
  	
    Given seller already login and has product and approved
    When seller click all notification
    And seller click all notifications
    And seller click first notification and already bid and accepted
    And seller click Status
    And seller click radio button Berhasil terjual
    And seller click Kirim button
    Then Verify text Berhasil terjual
