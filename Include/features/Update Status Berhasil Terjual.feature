@UpdateStatus
Feature: Update Status Terjual
  Seller update status to berhasil terjual

  @UPD01
  Scenario:  Seller wants to update status to berhasil terjual
  	Given Precondition update
    And seller already login and has product and approved
    When seller click all notification
    And seller click all notifications
    And seller click first notification and already bid and accepted
    And seller click Status
    And seller click radio button Berhasil terjual
    And seller click Kirim button
    Then Verify text Berhasil terjual
