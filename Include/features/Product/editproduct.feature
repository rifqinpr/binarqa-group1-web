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
@tag
Feature: Edit Product

  @tag1
  Scenario Outline: Edit Product with <condition>
   	Given I login
    And I click Product saya
    And I click Detail Product
    When I click button Edit
    And I edit nama product <nama_product>
    And I edit harga product <harga_product>
    And I edit kategori <kategori>
    And I edit deskripsi <deskripsi>
    And I edit image product <img>
    When I click button terbitkan
    Then I <status> edit product
    

    Examples: 
      | case     | condition                 | nama_product | harga_product | kategori  | deskripsi | img       | status 	|
      | positive | valid credential          | correct      | correct       | correct   | correct   | correct   | Success	|
      | negative | incorrect credential harga| correct 		  | incorrect     | correct   | correct   | correct   | Failed	|
      | negative | empty field 							 | incorrect    | correct		    | correct   | correct   | correct   | Failed	|

