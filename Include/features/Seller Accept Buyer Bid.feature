@Accept
Feature: Seller Accept Bid
  Seller wants to accept buyer bid offer

  @ACC01
  Scenario: Seller wants to accept buyer bid
  	Given Precondition success
    And Seller already login
    When seller click notification
    And seller accept click all notification
    And seller click first notification
    And seller click Terima
    Then button hubungi buyer di whatsapp akan muncul
