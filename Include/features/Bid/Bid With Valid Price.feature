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

Feature: Bid Valid
  Buyer wants to bid with valid harga

  Scenario Outline: Bid - buyer wants to bid with valid harga
  
    Given buyer is in Sign In Page 
    When buyer login with email "alexbeli@gmail.com"
    And buyer login with password "asdqwe"
    And buyer click Sign In button
    
    