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
      | global                | global    | success |
      | satugroup@gmail.com   | abc!12345 | success |
      | namakusilmi@gmail.com |  12345678 | success |

  @LGN02 @LGN05 @Negative
  Scenario Outline: Verify to login with invalid email: <condition>
    Given I already registered an account and go to Login page
    When I input email <email>
    And I input password <password>
    And I click Masuk button
    Then I should see the next step <status>

    Examples: 
      | email                   | password  | status         | condition             |
      | unregistered@gmail.com  |  12345678 | invalid        | unregistered          |
      | inimisal.typo@gmail.com |  12345678 | invalid        | wrong email           |
      | empty                   |  12345678 | required email | empty email           |
      | groupsatu@gm            |  12345678 | required email | non-tld               |
      | aa@ss                   |  12345678 | required email | non-tld registered    |
      | namaku1357.com          | abc!12345 | required email | without @             |
      | namaku1357gmail         | abc!12345 | required email | without @ and non-tld |

  #note: akun aa@ss berhasil ter-register, sehingga saat login terjadi 'bug' dan muncul error krn tidak sesuai dg expected result
  #
  @LGN04 @Negative
  Scenario Outline: Verify to login with invalid password: <condition>
    Given I already registered an account and go to Login page
    When I input email <email>
    And I input password <password>
    And I click Masuk button
    Then I should see the next step <status>

    Examples: 
      | email               | password | status        | condition      |
      | groupsatu@gmail.com | abc!     | invalid       | wrong password |
      | groupsatu@gmail.com | empty    | required pass | empty password |

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
