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
Feature: Login
  As a user, I want to login the Secondhand Store Website

  @LGN01
  Scenario Outline: Verify to login with valid credentials
    Given I already registered an account and go to Login page
    When I input email <email>
    And I input password <password>
    And I click Masuk button
    Then I should see the next step <status>

    Examples: 
      | email                 | password  | status  |
      | groupsatu@gmail.com   | abc!12345 | success |
      | namakusilmi@gmail.com |  12345678 | success |

  @LGN02 @LGN05
  Scenario Outline: Verify to login with invalid email
    Given I already registered an account and go to Login page
    When I input email <email>
    And I input password <password>
    And I click Masuk button
    Then I should see the next step <status>

    Examples: 
      | email                   | password  | status         |
      | unregistered@gmail.com  |  12345678 | invalid        |
      | inimisal.typo@gmail.com |  12345678 | invalid        |
      |                         |  12345678 | required email |
      | groupsatu@gm            |  12345678 | required email |
      | aa@ss                   |  12345678 | required email |
      | namaku1357.com          | abc!12345 | required email |
      | namaku1357gmail         | abc!12345 | required email |
      #note: akun aa@ss berhasil ke register, kalo login harusnya 'bug' sehingga bakal muncul error krn tdk sesuai dg expected res
	
	@LGN04
  Scenario Outline: Verify to login with invalid password
    Given I already registered an account and go to Login page
    When I input email <email>
    And I input password <password>
    And I click Masuk button
    Then I should see the next step <status>

    Examples: 
      | email               | password | status        |
      | groupsatu@gmail.com | abc!     | invalid       |
      | groupsatu@gmail.com |          | required pass |
	
	@LGN03
  Scenario Outline: Verify to login without enter any data
    Given I already registered an account and go to Login page
    When I input email <email>
    And I input password <password>
    And I click Masuk button
    Then I should see the next step <status>

    Examples: 
      | email | password | status         |
      |       |          | required email |
