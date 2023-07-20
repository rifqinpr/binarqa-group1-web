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
	@Given("Precondition update")
	public void precondition_update() {
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.maximizeWindow()
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : "alexjual1@gmail.com"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : "asdqwe"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Jual Floating Button'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Input Nama Produk'), [('namaProduk') : 'Produk A'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Input Harga Produk'), [('hargaProduk') : '100000'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Input Kategori Produk'), [('kategoriProduk') : 'Kesehatan'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Input Deskripsi Produk'), [('deskripsiProduk') : 'Deskripsi Produk A'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Input Gambar Produk'), [('pathToFile') : System.getProperty("user.dir") + "\\Data Files\\ImageForTest\\binar.jpg"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Add Product/Click Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : "alexbeli@gmail.com"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : "asdqwe"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click First Card Product'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Click Saya Tertarik dan Ingin Nego'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Input Harga Tawar'), [('harga') : '2000'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Product Detail/Buy Bid Product/Click Button Kirim'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : "alexjual1@gmail.com"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : "asdqwe"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Notification/Click Notification Icon on Navbar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Notification/Click Lihat Semua Notifikasi'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Notification/Click First Notification'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Offer Page/Seller Click Terima'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("seller already login and has product and approved")
	public void seller_already_login_and_has_product_and_approved() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Masuk from homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : "alexjual1@gmail.com"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : "asdqwe"], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click all notification")
	public void seller_click_all_notification() {
		WebUI.callTestCase(findTestCase('Pages/Notification/Click Notification Icon on Navbar'),[:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click all notifications")
	public void seller_click_all_notifications() {
		WebUI.callTestCase(findTestCase('Pages/Notification/Click Lihat Semua Notifikasi'),[:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click first notification and already bid and accepted")
	public void seller_click_first_notification_and_already_bid_and_accepted() {
		WebUI.callTestCase(findTestCase('Pages/Notification/Click First Notification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click Status")
	public void seller_click_Status() {
		WebUI.callTestCase(findTestCase('Pages/Offer Page/Click Status Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click radio button Berhasil terjual")
	public void seller_click_radio_button_Berhasil_terjual() {
		WebUI.callTestCase(findTestCase('Pages/Offer Page/Click Berhasil Terjual Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click Kirim button")
	public void seller_click_Kirim_button() {
		WebUI.callTestCase(findTestCase('Pages/Offer Page/Click Kirim Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Verify text Berhasil terjual")
	public void verify_text_Berhasil_terjual() {
		WebUI.callTestCase(findTestCase('Pages/Offer Page/Verify Berhasil terjual text'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}
}