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



class NegativeTestCaseBid {
	@When("buyer click cart product")
	public void buyer_click_cart_product() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Second Card Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer memasukkan harga tawaran")
	public void buyer_memasukkan_harga_tawaran() {
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Input Harga Tawar'), [('harga') : '-9999'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("buyer invalid verify")
	public void buyer_invalid_verify() {
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Verify Text - Menunggu respon penjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given("buyer click homepage")
	public void buyer_click_homepage() {
		WebUI.callTestCase(findTestCase('Pages/Buy Bid Product/Click Homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("buyer click cart product ketiga")
	public void buyer_click_cart_product_ketiga() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Third Card Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer memasukkan harga tawaran alphabet")
	public void buyer_memasukkan_harga_tawaran_alphabet() {
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Input Harga Tawar'), [('harga') : '*@BASJH-'], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("buyer invalid verify text")
	public void buyer_invalid_verify_text() {
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Verify Input Number'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("buyer click X")
	public void buyer_click_X() {
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Click X'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("buyer click last cart")
	public void buyer_click_last_cart() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Last Card Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("buyer memasukkan harga tawaran null")
	public void buyer_memasukkan_harga_tawaran_null() {
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Input Harga Tawar'), [('harga') : ''], FailureHandling.STOP_ON_FAILURE)
	}
	
}