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



class editprofilewithoutalamat {
	@Given("user on the login page")
	public void user_on_the_login_page() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input email")
	public void user_input_email(String email) {
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : 'syafradha@gmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input password")
	public void user_input_password(String password) {
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : 'meditran5'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click login button")
	public void user_click_login_button() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click user profile")
	public void user_click_user_profile() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click user profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click image2'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click image")
	public void user_click_image() {

		WebUI.callTestCase(findTestCase('Pages/Login/Click Image Profile Masuk'), [:], FailureHandling.STOP_ON_FAILURE)



		WebUI.callTestCase(findTestCase('Pages/Profile/Upload Image'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input nama")
	public void user_input_nama() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Input Nama 2'), [('nama') : 'Deksa'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input kota")
	public void user_input_kota() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Set Kota'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input alamat")
	public void user_input_alamat() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Input Alamat'), [('alamat') : ''], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input no handphone")
	public void user_input_no_handphone() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Input No Handphone'), [('noHP') : '0843434343'], FailureHandling.STOP_ON_FAILURE)
	}
	@When("user click button submit")
	public void user_click_button_submit() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Click Button Simpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I verify the step success")
	public void i_verify_the_step_success() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Verify Required Nama'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}