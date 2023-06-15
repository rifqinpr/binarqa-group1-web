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

class Bid {

	@Given("buyer is in Sign In Page")
	public void buyer_is_in_Sign_In_Page() {
		WebUI.callTestCase(findTestCase('Bid/Click Button Masuk From HomePage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer login with email {string}")
	public void buyer_login_with_email(String email) {
		WebUI.callTestCase(findTestCase('Bid/Input Email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer login with password {string}")
	public void buyer_login_with_password(String password) {
		WebUI.callTestCase(findTestCase('Bid/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("buyer click Sign In button")
	public void buyer_click_Sign_In_button() {
		WebUI.callTestCase(findTestCase('Login/Click Button Sign In from Sign In Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user will be redirected to Homepage")
	public void user_will_be_redirected_to_HomePage() {
		WebUI.callTestCase(findTestCase('Login/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
