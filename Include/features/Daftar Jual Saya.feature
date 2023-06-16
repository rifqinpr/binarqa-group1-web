@DaftarJualSaya
Feature: Daftar Jual Saya
  As a user i want to see Daftar Jual

  @DJS01
  Scenario: DJS01 - See Daftar Jual Saya
    Given User already logged in and have product added
    And User in Daftar Jual Saya page
    When User click Semua Produk
    Then List of products added will be shown

  @DJS02
  Scenario: DJS02 - See Daftar Jual Saya No Product
    Given User already logged in and have no product
    And User in Daftar Jual Saya page
    When User click Semua Produk
    Then Daftar Jual Saya show Tambah Produk only

  @DJS03
  Scenario: DJS03 - See Diminati
    Given User already logged in and have product being bid
    And User in Daftar Jual Saya page
    When User click Diminati
    Then List of product being bid will be shown

  @DJS04
  Scenario: DJS04 - See Diminati No Product
    Given User already logged in and have product added but not yet bidded
    And User in Daftar Jual Saya page
    When User click Diminati
    Then No product message will be shown

  @DJS05
  Scenario: DJS03 - See Terjual
    Given User already logged in and have product already sold
    And User in Daftar Jual Saya page
    When User click Terjual
    Then List of product that already sold will be shown

  @DJS06
  Scenario: DJS03 - See Terjual No Product
    Given User already logged in and have product added but not yet sold
    And User in Daftar Jual Saya page
    When User click Terjual
    Then No product message will be shown
