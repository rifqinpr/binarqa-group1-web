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
@editprofile
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Profile with jpg
    Given user on the login page
    When user input email <email>
    And user input password <password>
    And user click login button
    And user click user profile
    And user click image
    And user input nama
    And user input kota
    And user input alamat
    And user input no handphone
    And user click button submit
    Then I verify the step success

    Examples: 
      | email               | password  | status  |
      | syafradha@gmail.com | meditran5 | success |
