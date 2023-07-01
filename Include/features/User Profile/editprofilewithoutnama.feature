Feature: edit profile feature without nama
  I want to edit profile without nama

  Scenario: edit profile without nama
    Given user on the login page
    When user input email
    And user input password
    And user click login button
    And user click user profile
    And user click image
    And user input nama
    And user input kota
    And user input alamat
    And user input no handphone
    And user click button submit
    Then I verify the step success
