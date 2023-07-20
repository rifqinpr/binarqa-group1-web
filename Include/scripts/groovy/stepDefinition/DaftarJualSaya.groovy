package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.annotation.TearDown

public class DaftarJualSaya {
	@Given("User already logged in and have product added")
	public void user_login_have_product() {
		user_login()
	}

	@And("User in Daftar Jual Saya page")
	public void in_daftarjualsaya() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Click Product List Icon'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click Semua Produk")
	public void click_semua_produk() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Click Semua Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("List of products added will be shown")
	public void verify_product_exists() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Verify Product Exists'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User already logged in and have no product")
	public void user_login_have_no_product() {
		user_login('gunawansipembeli@jualbeli.com', 'a1b2c3d4')
	}

	@Then("Daftar Jual Saya show Tambah Produk only")
	public void verify_tambak_produk() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Verify Tambah Produk Only'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User already logged in and have product being bid")
	public void user_login_product_in_bid() {
		user_login()
	}

	@When("User click Diminati")
	public void click_diminati() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Click Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("List of product being bid will be shown")
	public void verify_product_in_bid() {
		verify_product_exists()
	}

	@Given("User already logged in and have product added but not yet bidded")
	public void user_login_no_product_in_bid() {
		user_login('gunawansipembeli@jualbeli.com', 'a1b2c3d4')
	}

	@Then("No product message will be shown")
	public void verify_no_product() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Verify No Product Exists'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User already logged in and have product already sold")
	public void user_login_product_sold() {
		user_login()
	}

	@When("User click Terjual")
	public void click_terjual() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Click Terjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("List of product that already sold will be shown")
	public void verify_product_sold(){
		verify_product_exists()
	}

	@Given("User already logged in and have product added but not yet sold")
	public void user_login_no_product_sold() {
		user_login('gunawansipembeli@jualbeli.com', 'a1b2c3d4')
	}

	private void user_login(String email = 'tukangjuallaptop@mail.mail', String password = 'a1b2c3d4') {
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
