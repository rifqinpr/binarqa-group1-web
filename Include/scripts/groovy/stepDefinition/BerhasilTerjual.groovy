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



class BerhasilTerjual {
	@Given("seller already login and has product and approved")
	public void seller_already_login_and_has_product_and_approved() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : "alexjual1@gmail.com"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : "asdqwe"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click all notification")
	public void seller_click_all_notification() {
		WebUI.callTestCase(findTestCase('Pages/Buyer Bid/Click Notification'),[:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click all notifications")
	public void seller_click_all_notifications() {
		WebUI.callTestCase(findTestCase('Pages/Buyer Bid/Click Lihat semua notifikasi'),[:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click first notification and already bid and accepted")
	public void seller_click_first_notification_and_already_bid_and_accepted() {
		WebUI.callTestCase(findTestCase('Pages/Buyer Bid/Click First Notification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click Status")
	public void seller_click_Status() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Order/Click Status Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click radio button Berhasil terjual")
	public void seller_click_radio_button_Berhasil_terjual() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Order/Click Berhasil Terjual Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click Kirim button")
	public void seller_click_Kirim_button() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Order/Click Kirim Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Verify text Berhasil terjual")
	public void verify_text_Berhasil_terjual() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Order/Verify Berhasil terjual text'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}