@Denied
Feature: Denied Bid
  Seller wants to denied buyer bid

  @DND01
  Scenario: Seller wants to denied buyer bid
    Given Precondition success
    And Seller Denied already login
    When seller denied click notification
    And seller denied click all notification
    And seller denied click first notification
    And seller click Tolak
    Then verify text Penawaran produk ditolak
