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



class Register {
	@Given("I already access the website and user on the register page")
	public void i_already_access_the_website_and_user_on_the_register_page() {
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.callTestCase(findTestCase('Pages/Login/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Register/Click Button Daftar di sini from login page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I register with input Nama (.*) and (.*)")
	public void i_register_with_input_Nama(String nama, statusnama) {
		if (statusnama == 'random') {
			WebUI.callTestCase(findTestCase('Pages/Register/Input Nama with custom keyword'), [('nama') : nama], FailureHandling.STOP_ON_FAILURE)
		}
		else if (statusnama == 'required') {
			WebUI.callTestCase(findTestCase('Pages/Register/Input Nama with test data'), [('nama') : nama], FailureHandling.STOP_ON_FAILURE)
		}
		else if (statusnama == 'non-tld') {
			WebUI.callTestCase(findTestCase('Pages/Register/Input Nama with test data'), [('nama') : 'Email with non-TLD'], FailureHandling.STOP_ON_FAILURE)
		}
		else if (statusnama == 'invalid') {
			WebUI.callTestCase(findTestCase('Pages/Register/Input Nama with test data'), [('nama') : nama], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("I register with input Email (.*) and (.*)")
	public void i_register_with_input_Email(String email, statusemail) {
		if (statusemail == 'random') {
			WebUI.callTestCase(findTestCase('Pages/Register/Input Email with custom keyword'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
		}
		else if (statusemail == 'required') {
			WebUI.callTestCase(findTestCase('Pages/Register/Input Email with test data'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
		}
		else if (statusemail == 'non-tld') {
			WebUI.callTestCase(findTestCase('Pages/Register/Input Email with non-TLD'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
		}
		else if (statusemail == 'invalid') {
			WebUI.callTestCase(findTestCase('Pages/Register/Input Email with test data'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("I register with input Password (.*)")
	public void i_register_with_input_Password(String password) {
		WebUI.callTestCase(findTestCase('Pages/Register/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I click Daftar button")
	public void i_click_Daftar_button() {
		WebUI.callTestCase(findTestCase('Pages/Register/Click Button Daftar to submit'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("I should see the result for register (.*)")
	public void see_the_result_register(String status) {
		if (status == 'success') {
			WebUI.callTestCase(findTestCase('Pages/Register/Verify Register Valid'), [('status') : status], FailureHandling.STOP_ON_FAILURE)
		}
		else if (status == 'required') {
			WebUI.callTestCase(findTestCase('Pages/Register/Verify Required Email'), [('status') : status], FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementVisible(findTestObject('Register/h2_Daftar'), FailureHandling.STOP_ON_FAILURE)
		}
		else if (status == 'invalid') {
			WebUI.callTestCase(findTestCase('Pages/Register/Read Error Msg - Registered Email'), [('status') : status], FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementVisible(findTestObject('Register/h2_Daftar'), FailureHandling.STOP_ON_FAILURE)
		}
		WebUI.closeBrowser()
	}
}