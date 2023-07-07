package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import packages.createGlobalVariables


class EditProduct {

	@Given("I login")
	public void i_login() {
		//setting email in global variable
		def setGlobalVariable = new createGlobalVariables()
		setGlobalVariable.addGlobalVariable('email', 'group1qatest@mytestmail.net')
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : GlobalVariable.email], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("I click Product saya")
	public void i_click_Product_saya() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Click Product List Icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("I click Detail Product")
	public void i_click_Detail_Product() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Click Product Card in Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I click button Edit")
	public void i_click_button_Edit() {
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Click Button Edit'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I edit nama product (.*)")
	public void i_edit_nama_product(String nama_product) {
		if(nama_product=='correct') {
			WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Nama Produk Field'), [('namaProduk') : 'Tambahan'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (nama_product=='incorrect'){
			WebUI.setText(findTestObject('Object Repository/Products/Add Product Page/input_Nama Produk'), '')
		}
	}

	@When("I edit harga product (.*)")
	public void i_edit_harga_product(String harga_product) {
		if(harga_product=='correct') {
			WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Harga Produk Field'), [('hargaProduk') : '250000'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (harga_product=='incorrect'){
			WebUI.setText(findTestObject('Object Repository/Products/Add Product Page/input_Harga Produk'), '')
		}
	}

	@When("I edit kategori (.*)")
	public void i_edit_kategori(String kategori) {
		if(kategori=='correct') {
			WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Kategori Field'), [('kategoriProduk') : 'Kesehatan'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (kategori=='incorrect'){
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Products/Add Product Page/select_Kategori'), 'Pilih Kategori', false)
		}
	}

	@When("I edit deskripsi (.*)")
	public void i_edit_deskripsi(String deskripsi) {
		if(deskripsi=='correct') {
			WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Deskripsi Field'), [('deskripsiProduk') : 'Tambahan'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (deskripsi=='incorrect'){
			WebUI.setText(findTestObject('Object Repository/Products/Add Product Page/textarea_Deskripsi'), 'Lampu dengan watt yang bagus')
		}
	}

	@When("I click button terbitkan")
	public void i_click_button_terbitkan() {
		WebUI.callTestCase(findTestCase('Pages/Add Product/Click Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I (.*) edit product")
	public void i_edit_product(String status) {
		if(status=='success') {
			WebUI.callTestCase(findTestCase('Pages/Edit Product/Verify Success Edit Product'), [('namaProduk') : 'Tambahan', ('hargaProduk') : 'Rp 250.000', ('kategoriProduk') : 'Kesehatan', ('deskripsiProduk') : 'Tambahan'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (status=='failed'){
			WebUI.verifyElementPresent(findTestObject('Object Repository/Products/Add Product Page/label_Button Terbitkan'), 0)
		}
	}
}