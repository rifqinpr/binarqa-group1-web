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
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://secondhand.binaracademy.org/')
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/Navbar/a_Masuk'))
		WebUI.setText(findTestObject('Object Repository/Login/input_Email'), 'groupbinar1@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Login/input_Password'), 'group1@123')
		WebUI.click(findTestObject('Object Repository/Login/button_Masuk'))
	}

	@Given("I click Product")
	public void i_click_Product() {
		WebUI.click(findTestObject('Object Repository/Navbar/a_Produk Saya Icon'))
	}

	@Given("I click Product Detail")
	public void i_click_Product_Detail() {
		WebUI.click(findTestObject('Object Repository/Daftar Jual Saya/div_ProductCard'))
	}

	@When("I click button Delete")
	public void i_click_button_delete() {
		WebUI.click(findTestObject('Object Repository/Products/Product Detail Page/Button_Delete_gherkin'))
	}
	
	@Then("I success delete product")
	public void i_success_delete_product() {
		WebUI.callTestCase(findTestCase('Pages/Delete Product/Verif delete produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
}
