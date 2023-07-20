@Register
Feature: Web User Register
  As a user, I want to register in Secondhand Store Website

  @REG01 @Positive
  Scenario Outline: Verify to register with valid credentials
    Given I already access the website and user on the register page
    When I register with input Nama <nama>
    And I register with input Email <email>
    And I register with input Password <password>
    And I click Daftar button
    Then I should see the result for register <status>

    Examples: 
      | nama   | email  | password  | status  |
      | random | random | abc!12345 | success |

  @REG02 @Negative
  Scenario Outline: Verify to register with invalid email: <condition>
    Given I already access the website and user on the register page
    When I register with input Nama <nama>
    And I register with input Email <email>
    And I register with input Password <password>
    And I click Daftar button
    Then I should see the result for register <status>

    Examples: 
      | nama       | email               | password  | status         | condition             |
      | registered | groupsatu@gmail.com | abc!12345 | invalid email  | already registered    |
      | without @  | groupsatugm.com     | abc!12345 | required email | without @             |
      | without @  | groupsatugmail      | abc!12345 | required email | without @ and non-tld |
      | kosong aja | empty               | abc!12345 | required email | empty email           |
      | incomplete | @gmail.com          | abc!12345 | required email | incomplete email      |

  #note: This test result @REG03 should be FAILED, because it's not match with EXPECTED RESULT ----- (BUG)
  @REG03 @Negative
  Scenario Outline: Verify to register with non-TLD email format
    Given I already access the website and user on the register page
    When I register with input Nama <nama>
    And I register with input Email <email>
    And I register with input Password <password>
    And I click Daftar button
    Then I should see the result for register <status>

    Examples: 
      | nama    | email   | password  | status         |
      | non-tld | non-tld | abc!12345 | required email |

  @REG04 @Negative
  Scenario Outline: Verify to register without enter any data
    Given I already access the website and user on the register page
    When I register with input Nama <nama>
    And I register with input Email <email>
    And I register with input Password <password>
    And I click Daftar button
    Then I should see the result for register <status>

    Examples: 
      | nama  | email | password | status        |
      | empty | empty | empty    | required nama |

  @REG05 @Negative
  Scenario Outline: Verify to register with invalid password: <condition>
    Given I already access the website and user on the register page
    When I register with input Nama <nama>
    And I register with input Email <email>
    And I register with input Password <password>
    And I click Daftar button
    Then I should see the result for register <status>

    Examples: 
      | nama            | email  | password | status            | condition      |
      | less than eight | random | aq12     | invalid password  | <8 char        |
      | kosoong         | random | empty    | required password | empty password |
		#less than eight char expected failed
