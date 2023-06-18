Feature: User Register
  As a user, I want to register in Secondhand Store Website

  @REG01
  Scenario Outline: Verify to register with valid credentials
    Given I already access the website and user on the register page
    When I register with input Nama <nama> and <statusnama>
    And I register with input Email <email> and <statusemail>
    And I register with input Password <password>
    And I click Daftar button
    Then I should see the result for register <status>

    Examples: 
      | nama | statusnama | email | statusemail | password  | status  |
      |      | random     |       | random      | abc!12345 | success |

  @REG02
  Scenario Outline: Verify to register with invalid email
    Given I already access the website and user on the register page
    When I register with input Nama <nama> and <statusnama>
    And I register with input Email <email> and <statusemail>
    And I register with input Password <password>
    And I click Daftar button
    Then I should see the result for register <status>

    Examples: 
      | nama       | statusnama | email               | statusemail | password  | status   |
      | registered | invalid    | groupsatu@gmail.com | invalid     | abc!12345 | invalid  |
      | without @  | required   | groupsatugm.com     | required    | abc!12345 | required |
      | without @  | required   | groupsatugmail      | required    | abc!12345 | required |
      | kosong aja | required   |                     | required    | abc!12345 | required |
      | incomplete | required   | @gmail.com          | required    | abc!12345 | required |

  #note: This test result @REG03 should be FAILED, because it's not match with EXPECTED RESULT ----- (BUG)
  @REG03
  Scenario Outline: Verify to register with non-TLD email format
    Given I already access the website and user on the register page
    When I register with input Nama <nama> and <statusnama>
    And I register with input Email <email> and <statusemail>
    And I register with input Password <password>
    And I click Daftar button
    Then I should see the result for register <status>

    Examples: 
      | nama | statusnama | email | statusemail | password  | status   |
      |      | non-tld    |       | non-tld     | abc!12345 | required |

  @REG04
  Scenario Outline: Verify to register without enter any data
    Given I already access the website and user on the register page
    When I register with input Nama <nama> and <statusnama>
    And I register with input Email <email> and <statusemail>
    And I register with input Password <password>
    And I click Daftar button
    Then I should see the result for register <status>

    Examples: 
      | nama | statusnama | email | statusemail | password | status   |
      |      | required   |       | required    |          | required |
