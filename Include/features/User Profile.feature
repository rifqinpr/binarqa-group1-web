@editprofile
Feature: Web User Profile
  As a User, I want to edit profile in Secondhand Webstore

  @USR01 @Positive
  Scenario Outline: Verify to edit profile with valid data
    Given User already login to the web and on the Edit Profile Page
    When User upload image with valid file type
    And User input Nama Profile with <nama>
    And User set Kota with <kota>
    And User input Alamat Profile with <alamat>
    And User input No Handphone with <noHP>
    And User click Simpan button to submit
    Then User verify edit profile: <status>

    Examples: 
      | nama     | kota    | alamat          | noHP          | status  |
      | Kelompok | Jakarta | Jl. Sumatera 21 | 0811122229911 | success |

  @USR02 @USR03 @USR04 @USR05 @Negative
  Scenario Outline: Verify to edit profile with <status>
    Given User already login to the web and on the Edit Profile Page
    When User upload image with valid file type
    And User input Nama Profile with <nama>
    And User set Kota with <kota>
    And User input Alamat Profile with <alamat>
    And User input No Handphone with <noHP>
    And User click Simpan button to submit
    Then User verify edit profile: <status>

    Examples: 
      | nama         | kota    | alamat          | noHP          | status          |
      | empty        | Jakarta | Jl. Sumatera 21 | 0811122229911 | empty nama      |
      | Kelompok 1   | empty   | Jl. Sumatera 22 | 0811122229911 | empty kota      |
      | Kelompok 10  | Solo    | empty           | 0811122229911 | empty alamat    |
      | Kelompok 100 | Bandung | Jl. Sumatera 23 | empty         | empty handphone |
