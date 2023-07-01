@Login
Feature: Web User Login
  As a user, I want to login the Secondhand Store Website

  @LGN01 @Positive
  Scenario Outline: Verify to login with valid credentials
    Given I already registered an account and go to Login page
    When I input email <email>
    And I input password <password>
    And I click Masuk button
    Then I should see the next step <status>

    Examples: 
      | email                 | password  | status  |
      | satugroup@gmail.com   | abc!12345 | success |
      | groupsatu@gmail.com   | abc!12345 | success |
      | namakusilmi@gmail.com |  12345678 | success |
			#note: akun groupsatu@gmail.com seharusnya berhasil login, akan tetapi akun tsb mengalami dampak dari 'bug' add product sehingga tidak bisa dibuka dan muncul error krn tidak sesuai dg expected result
  
  @LGN02 @LGN05 @Negative
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
      | empty                   |  12345678 | required email |
      | groupsatu@gm            |  12345678 | required email |
      | aa@ss                   |  12345678 | required email |
      | namaku1357.com          | abc!12345 | required email |
      | namaku1357gmail         | abc!12345 | required email |
			#note: akun aa@ss berhasil ter-register, sehingga saat login terjadi 'bug' dan muncul error krn tidak sesuai dg expected result
  
  @LGN04 @Negative
  Scenario Outline: Verify to login with invalid password
    Given I already registered an account and go to Login page
    When I input email <email>
    And I input password <password>
    And I click Masuk button
    Then I should see the next step <status>

    Examples: 
      | email               | password | status        |
      | groupsatu@gmail.com | abc!     | invalid       |
      | groupsatu@gmail.com | empty    | required pass |

  @LGN03 @Negative
  Scenario Outline: Verify to login without enter any data
    Given I already registered an account and go to Login page
    When I input email <email>
    And I input password <password>
    And I click Masuk button
    Then I should see the next step <status>

    Examples: 
      | email | password | status         |
      | empty | empty    | required email |
