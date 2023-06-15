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

class Login {
	@Given("I already registered an account and go to Login page")
	public void i_already_registered_an_account() {
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.click(findTestObject('Login/Page_SecondHand/a_Masuk'))
	}

	@When("I input email (.*)")
	public void i_input_email(String email) {
		WebUI.setText(findTestObject('Login/Page_SecondHand/input_Email_useremail'), email)
	}

	@And("I input password (.*)")
	public void i_input_password(String password) {
		WebUI.setText(findTestObject('Login/Page_SecondHand/input_Password_userpassword'), password)
	}

	@And("I click Masuk button")
	public void i_click_Masuk_button() {
		WebUI.click(findTestObject('Login/Page_SecondHand/button_Masuk'))
	}

	@Then("I should see the next step (.*)")
	public void i_should_see_the_nextstep(String status) {
		if (status == 'success') {
			WebUI.verifyElementVisible(findTestObject('User Profile/Page_SecondHand/a_Profil Saya'))
		}
		else if (status == 'required email') {
			WebUI.verifyElementAttributeValue(findTestObject('Login/Page_SecondHand/input_Email_useremail'), 'required', 'true', 20)
		}
		else if (status == 'required pass') {
			WebUI.verifyElementAttributeValue(findTestObject('Login/Page_SecondHand/input_Password_userpassword'), 'required', 'true', 20)
		}
		else if (status == 'invalid') {
			WebUI.verifyElementVisible(findTestObject('Login/Page_SecondHand/errormsg-invalidemail'))
		}
		WebUI.closeBrowser()
	}
}