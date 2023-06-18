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


class sellproduct {

	@Given("I login as Seller")
	public void i_login_as_seller() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://secondhand.binaracademy.org/')
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/Navbar/a_Masuk'))
		WebUI.setText(findTestObject('Object Repository/Login/input_Email'), 'groupsatu@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Login/input_Password'), 'abc!12345')
		WebUI.click(findTestObject('Object Repository/Login/button_Masuk'))
	}

	@When("I click jual button")
	public void i_click_jual_button() {
		WebUI.click(findTestObject('Object Repository/HomePage/a_Button Jual'))
	}

	@When("I fill nama product (.*)")
	public void i_fill_nama_product(String nama_product) {
		if(nama_product=='correct') {
			WebUI.setText(findTestObject('Object Repository/Products/Add Product Page/input_Nama Produk'), 'Baju')
		}
		else if (nama_product=='incorrect'){
			WebUI.setText(findTestObject('Object Repository/Products/Add Product Page/input_Nama Produk'), '')
		}
	}

	@When("I fill harga product (.*)")
	public void I_fill_harga_product(String harga_product) {
		if(harga_product=='correct') {
			WebUI.setText(findTestObject('Object Repository/Products/Add Product Page/input_Harga Produk'), '300000')
		}
		else if (harga_product=='incorrect'){
			WebUI.setText(findTestObject('Object Repository/Products/Add Product Page/input_Harga Produk'), '')
		}
	}

	@When("I fill kategori (.*)")
	public void I_fill_kategori(String kategori) {
		if(kategori=='correct') {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Products/Add Product Page/select_Kategori'), 'Elektronik', false)
		}
		else if (kategori=='incorrect'){
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Products/Add Product Page/select_Kategori'), 'Elektronik', false)
		}
	}

	@When("I fill deskripsi (.*)")
	public void I_fill_deskripsi(String deskripsi) {
		if(deskripsi=='correct') {
			WebUI.setText(findTestObject('Object Repository/Products/Add Product Page/textarea_Deskripsi'), 'Lampu dengan watt yang bagus')
		}
		else if (deskripsi=='incorrect'){
			WebUI.setText(findTestObject('Object Repository/Products/Add Product Page/textarea_Deskripsi'), 'Lampu dengan watt yang bagus')
		}
	}

	@When("I upload image product (.*)")
	public void I_fill_image(String img) {
		if(img=='correct') {
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Gambar Produk'), [('pathToFile') : 'C:\\binar.png'], 
    FailureHandling.STOP_ON_FAILURE)
		}
		else if (img=='incorrect'){
			WebUI.callTestCase(findTestCase('Pages/Add Product/Input Gambar Produk'), [('pathToFile') : 'C:\\Users\\ntt.reka\\Downloads\\binar.pdf'], 
    FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("I click button Terbitkan")
	public void i_click_button_Terbitkan() {
		WebUI.click(findTestObject('Object Repository/Products/Add Product Page/label_Button Terbitkan'))
	}

	@Then("I (.*) add product")
	public void i_add_product(String status) {
		if(status=='success') {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Products/Product Detail Page/img_Gambar Produk'), 0)
		}
		else if (status=='failed'){
			WebUI.verifyElementPresent(findTestObject('Object Repository/Products/Add Product Page/label_Button Terbitkan'), 0)
		}
	}
}
