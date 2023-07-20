package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class DeleteProduct {
	@Given("I Login")
	public void i_login() {
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : GlobalVariable.email], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("I click Product")
	public void i_click_Product() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Click Product List Icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("I click Product Detail")
	public void i_click_Product_Detail() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Click Product Card in Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I click button Delete")
	public void i_click_button_delete() {
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Click Button Delete'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I success delete product")
	public void i_success_delete_product() {
		WebUI.callTestCase(findTestCase('Pages/Delete Product/Verify Success Delete Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
