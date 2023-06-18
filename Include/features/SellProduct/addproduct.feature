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
# (Comments)
#Sample Feature Definition Template

@tag
Feature: Product Feature

  @tag1
  Scenario Outline: Add Product with <condition>
  	Given I login as Seller
    When I click jual button
    And I fill nama product <nama_product>
    And I fill harga product <harga_product>
    And I fill kategori <kategori>
    And I fill deskripsi <deskripsi>
    And I upload image product <img>
    When I click button Terbitkan
    Then The product successfully added to catalog
    

    Examples: 
      | case     | condition                 | nama_product | harga_product | kategori  | deskripsi | img       |
      | positive | valid credential          | correct      | correct       | correct   | correct   | correct   |
      | negative | empty field name product  | incorrect    | correct       | correct   | correct   | correct   |
      | negative | empty field harga product | correct      | incorrect     | correct   | correct   | correct   |
      | negative | empty field katageri      | correct      | correct       | incorrect | correct   | correct   |
      | negative | empty field deskripsi     | correct      | correct       | correct   | incorrect | correct   |
      | negative | no upload img             | correct      | correct       | correct   | correct   | incorrect |
      | negative | upload img format salah   | correct      | correct       | correct   | correct   | wrong     |
