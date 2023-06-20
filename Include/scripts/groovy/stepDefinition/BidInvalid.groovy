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



class BidInvalid {
	@Given("buyer invalid already login")
	public void buyer_already_login() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : "alexbeli1@gmail.com"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : "asdqwe"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer click last cart product")
	public void buyer_click_last_cart_product() {
		WebUI.callTestCase(findTestCase('Bid/Click Last Cart Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer invalid click Saya tertarik dan ingin nego button")
	public void buyer_invalid_click_button() {
		WebUI.callTestCase(findTestCase('Bid/Click Saya Tertarik dan Ingin Nego'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer invalid memasukkan harga tawaran {string}")
	public void buyer_invalid_memasukkan_harga_tawaran(String harga) {
		WebUI.callTestCase(findTestCase('Bid/Input Harga Tawar'), [('harga') : harga], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer invalid click tombol Kirim")
	public void buyer_invalid_click_tombol_Kirim() {
		WebUI.callTestCase(findTestCase('Bid/Click Button Kirim'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("buyer invalid menunggu respon penjual")
	public void buyer_invalid_menunggu_respon_penjual() {
		WebUI.callTestCase(findTestCase('Bid/Verify Text'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}