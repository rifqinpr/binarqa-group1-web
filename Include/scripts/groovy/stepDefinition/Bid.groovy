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
import com.thoughtworks.selenium.webdriven.commands.Click

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

class Bid {
	private void preconditionforbid() {
		//setting email in global variable
		def setGlobalVariable = new createGlobalVariables()
		setGlobalVariable.addGlobalVariable('email', 'group1qatest@mytestmail.net')
		//to make sure first product card not make error
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : GlobalVariable.email], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Jual Floating Button'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Input Nama Produk'), [('namaProduk') : 'Produk A'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Input Harga Produk'), [('hargaProduk') : '100000'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Input Kategori Produk'), [('kategoriProduk') : 'Kesehatan'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Input Deskripsi Produk'), [('deskripsiProduk') : 'Deskripsi Produk A'],FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Input Gambar Produk'), [('pathToFile') : System.getProperty("user.dir") + "\\Data Files\\ImageForTest\\binar.jpg"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Click Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given('buyer already login')
	public void buyer_login() {
		preconditionforbid()
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : 'alexbeli1@gmail.com'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : 'asdqwe'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('buyer click first product card')
	public void click_first_card() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click First Card Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('buyer click Saya tertarik dan ingin nego button')
	public void click_nego() {
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Click Saya Tertarik dan Ingin Nego'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('buyer memasukkan harga tawaran (.*)')
	public void input_tawar(String price) {
		if(price != 'empty') {
			WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Input Harga Tawar'), [('harga') : price], FailureHandling.STOP_ON_FAILURE)
		}else if(price == 'empty') {
			WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Input Harga Tawar'), [('harga') : ''], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And('buyer click tombol Kirim')
	public void click_kirim() {
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Click Button Kirim'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('verify buy status expected (.*)')
	public void verify_buy_status(String status) {
		if(status == 'success') {
			WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Verify Text - Menunggu respon penjual'), [:], FailureHandling.STOP_ON_FAILURE)
		}else {
			WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Verify Input Harga Tawar'), [:], FailureHandling.STOP_ON_FAILURE)
		}
		WebUI.closeBrowser()
	}
}