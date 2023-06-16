@Accept
Feature: Accept Bid
  Seller wants to accept buyer bid

  @AcceptValid
  Scenario: Seller wants to accept buyer bid
  
    Given Seller already login
    When seller click notification
    And seller click first notification
    And seller click Terima
    Then button hubungi buyer di whatsapp akan muncul
