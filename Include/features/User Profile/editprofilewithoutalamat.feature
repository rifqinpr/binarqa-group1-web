@editprofile
Feature: edit profile feature
  I want to edit profile

  @EP2
  Scenario: Profile with jpg
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

    
 
