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

class SearchProduct {
	@Given('User is in Secondhand homepage')
	public void user_in_secondhand_homepage() {
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
	}
	
	@When("User input (.*) of product name in search field")
	public void input_search_field(String text) {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Input Text in Search Field'), [('text') : text], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User press Enter key")
	public void press_Enter_key() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Press Enter Key'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("List of products that match with (.*) inputted will be shown")
	public void product_searched(String text) {
		text = '(?i).*'+text+'.*'
		WebUI.callTestCase(findTestCase('Pages/Homepage/Verify First Product Card Name'), [('text') : text], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}
}
