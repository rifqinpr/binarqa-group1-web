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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class Accept {

	@Given("seller already login")
	public void buyer_already_login() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : "alexjual@gmail.com"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : "asdqwe"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click notification")
	public void seller_click_notification() {
		WebUI.callTestCase(findTestCase('Buyer Bid/Click Notification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("seller click first notification")
	public void seller_click_first_notification() {
		WebUI.callTestCase(findTestCase('Buyer Bid/Click First Notification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("seller click Terima")
	public void seller_click_Terima() {
		WebUI.callTestCase(findTestCase('Buyer Bid/Seller Click Terima'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("button hubungi buyer di whatsapp akan muncul")
	public void button_hubungi_buyer_di_whatsapp_akan_muncul() {
		WebUI.callTestCase(findTestCase('Buyer Bid/Verify Whatsapp Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
