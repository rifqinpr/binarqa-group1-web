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

class Login {
	@Given("I already registered an account and go to Login page")
	public void i_already_registered_an_account() {
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I input email (.*)")
	public void i_input_email(String email) {
		if (email == 'empty') {
			WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : ''], FailureHandling.STOP_ON_FAILURE)
		}else if (email == 'global') {
			//setting email in global variable
			def setGlobalVariable = new createGlobalVariables()
			setGlobalVariable.addGlobalVariable('email', 'group1qatest@mytestmail.net')
			WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : GlobalVariable.email], FailureHandling.STOP_ON_FAILURE)
		}
		else {
			WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("I input password (.*)")
	public void i_input_password(String password) {
		if (password == 'empty') {
			WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : ''], FailureHandling.STOP_ON_FAILURE)
		}else if (password == 'global') {
			WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)
		}
		else {
			WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("I click Masuk button")
	public void i_click_Masuk_button() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I should see the next step (.*)")
	public void i_should_see_the_nextstep(String status) {
		if (status == 'success') {
			WebUI.callTestCase(findTestCase('Pages/Login/Verify Login Valid'), [:], FailureHandling.STOP_ON_FAILURE)
		}
		else if (status == 'required email') {
			WebUI.callTestCase(findTestCase('Pages/Login/Verify Required Email'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
		}
		else if (status == 'required pass') {
			WebUI.callTestCase(findTestCase('Pages/Login/Verify Required Password'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
		}
		else if (status == 'invalid') {
			WebUI.callTestCase(findTestCase('Pages/Login/Read Error Msg - Invalid Email or Pass'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
		}
		WebUI.closeBrowser()
	}
}