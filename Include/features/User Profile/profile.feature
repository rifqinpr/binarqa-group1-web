@editprofile
Feature: edit profile feature
  I want to edit profile

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

 