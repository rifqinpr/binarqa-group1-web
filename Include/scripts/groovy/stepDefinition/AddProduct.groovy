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

class AddProduct {
	@Given("I login as (.*)")
	public void login_as(String user) {
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		if(user == 'user1') {
			//setting email in global variable
			def setGlobalVariable = new createGlobalVariables()
			setGlobalVariable.addGlobalVariable('email', 'group1qatest@mytestmail.net')
			WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : GlobalVariable.email], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		}
		else if(user == 'user2') {
			WebUI.callTestCase(findTestCase('Pages/Register/Click Button Daftar di sini from login page'), [:], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Register/Input Nama with custom keyword'), [('name') : ''], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Register/Input Email with custom keyword'), [('email') : ''], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Register/Input Password'), [('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Register/Click Button Daftar to submit'), [:], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Homepage/Click Profile Icon Navbar'), [:], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Homepage/Click Profile Account'), [:], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Profile/Upload Image'), [:], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Profile/Input Nama'), [('nama') : 'Group1'], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Profile/Set Kota'), [('kota') : 'Jakarta'], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Profile/Input Alamat'), [('alamat') : 'Jl. Kenangan'], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Profile/Input No Handphone'), [('noHP') : '0843434343'], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Profile/Click Button Simpan'), [:], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("I click jual button")
	public void i_click_jual_button() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Jual Floating Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I fill nama product (.*)")
	public void i_fill_nama_product(String nama_product) {
		if(nama_product=='correct') {
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Nama Produk'), [('namaProduk') : 'Produk A'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (nama_product=='incorrect'){
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Nama Produk'), [('namaProduk') : ''], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("I fill harga product (.*)")
	public void I_fill_harga_product(String harga_product) {
		if(harga_product=='correct') {
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Harga Produk'), [('hargaProduk') : '100000'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (harga_product=='incorrect'){
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Harga Produk'), [('hargaProduk') : ''], FailureHandling.STOP_ON_FAILURE)
		}
		else if (harga_product=='negative'){
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Harga Produk'), [('hargaProduk') : '-100000'], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("I fill kategori (.*)")
	public void I_fill_kategori(String kategori) {
		if(kategori=='correct') {
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Kategori Produk'), [('kategoriProduk') : 'Elektronik'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (kategori=='incorrect'){
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Kategori Produk'), [('kategoriProduk') : 'Pilih Kategori'], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("I fill deskripsi (.*)")
	public void I_fill_deskripsi(String deskripsi) {
		if(deskripsi=='correct') {
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Deskripsi Produk'), [('deskripsiProduk') : 'Deskripsi Produk A'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (deskripsi=='incorrect'){
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Deskripsi Produk'), [('deskripsiProduk') : ''], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("I upload image product (.*)")
	public void I_fill_image(String img) {
		if(img=='correct') {
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Gambar Produk'), [('pathToFile') : System.getProperty("user.dir") + "\\Data Files\\ImageForTest\\binar.jpg"], FailureHandling.STOP_ON_FAILURE)
		}
		else if (img=='multiple'){
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Gambar Produk'), [('pathToFile') : System.getProperty("user.dir") + "\\Data Files\\ImageForTest\\lemari_imut.jpg"], FailureHandling.STOP_ON_FAILURE)
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Gambar Produk'), [('pathToFile') : System.getProperty("user.dir") + "\\Data Files\\ImageForTest\\binar.jpg"], FailureHandling.STOP_ON_FAILURE)
		}
		else if (img=='incorrect'){
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Gambar Produk'), [('pathToFile') : System.getProperty("user.dir") + "\\Data Files\\ImageForTest\\invalid_image.txt"], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("I click button Terbitkan")
	public void i_click_button_Terbitkan() {
		WebUI.callTestCase(findTestCase('Pages/Add Product/Click Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I (.*) add product")
	public void i_add_product(String status) {
		if(status=='success') {
			WebUI.callTestCase(findTestCase('Pages/Add Product/Verify Success Add Product'), [('namaProduk') : 'Produk A', ('hargaProduk') : 'Rp 100.000', ('kategoriProduk') : 'Elektronik', ('deskripsiProduk') : 'Deskripsi Produk A'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (status=='failed'){
			WebUI.verifyElementPresent(findTestObject('Object Repository/Products/Add Product Page/label_Button Terbitkan'), 0)
		}
		WebUI.closeBrowser()
	}
}
