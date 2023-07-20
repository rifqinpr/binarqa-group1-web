@UpdateStatus
Feature: Update Status Batalkan Transaksi
  Seller update status to Batalkan Transaksi

  @UPD02
  Scenario:  Seller wants to update status to batalkan transaksi
  	Given Precondition update
    And seller has already login and has product and approved
    When sellers click notification
    And sellers click all notification
    And sellers click first notification 
    And sellers click Status
    And sellers click radio button Batalkan Transaksi
    And sellers click Kirim button
    Then Verify text Penjualan dibatalkan
