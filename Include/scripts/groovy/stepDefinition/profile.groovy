package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.net.ssl.SSLEngineResult.Status

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


class profile {
	@Given("User already login to the web and on the Edit Profile Page")
	public void user_on_the_login_page() {
		//setting email in global variable
		def setGlobalVariable = new createGlobalVariables()
		setGlobalVariable.addGlobalVariable('email', 'group1qatest@mytestmail.net')
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.maximizeWindow()
		WebUI.callTestCase(findTestCase('Step Definition/Feature Login/LGN01 - User login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Profile Icon Navbar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click Profile Account'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User upload image with valid file type")
	public void user_uploadProfilePhoto() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Upload Image'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Profile/Verify Image Filled'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Nama Profile with (.*)")
	public void user_inputNamaProfile(String nama) {
		if (nama == 'empty') {
			WebUI.callTestCase(findTestCase('Pages/Profile/Input Nama'), [('nama') : ''], FailureHandling.STOP_ON_FAILURE)
		} else {
			WebUI.callTestCase(findTestCase('Pages/Profile/Input Nama'), [('nama') : nama], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("User set Kota with (.*)")
	public void user_setKotaProfile(String kota) {
		if (kota == 'empty') {
			WebUI.callTestCase(findTestCase('Pages/Profile/Set Kota'), [('kota') : 'Pilih Kota'], FailureHandling.STOP_ON_FAILURE)
		} else {
			WebUI.callTestCase(findTestCase('Pages/Profile/Set Kota'), [('kota') : kota], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("User input Alamat Profile with (.*)")
	public void user_inputAlamatProfile(String alamat) {
		if (alamat == 'empty') {
			WebUI.callTestCase(findTestCase('Pages/Profile/Input Alamat'), [('alamat') : ''], FailureHandling.STOP_ON_FAILURE)
		} else {
			WebUI.callTestCase(findTestCase('Pages/Profile/Input Alamat'), [('alamat') : alamat], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("User input No Handphone with (.*)")
	public void user_inputNoHP_Profile(String noHP) {
		if (noHP == 'empty') {
			WebUI.callTestCase(findTestCase('Pages/Profile/Input No Handphone'), [('noHP') : ''], FailureHandling.STOP_ON_FAILURE)
		} else {
			WebUI.callTestCase(findTestCase('Pages/Profile/Input No Handphone'), [('noHP') : '0843434343'], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("User click Simpan button to submit")
	public void user_clickSimpan_profile() {
		WebUI.callTestCase(findTestCase('Pages/Profile/Click Button Simpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User verify edit profile: (.*)")
	public void user_input_nama(String status) {
		if (status == 'success') {
			WebUI.callTestCase(findTestCase('Pages/Profile/Verify Success Edit Profile'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
		} else if (status == 'empty nama') {
			WebUI.callTestCase(findTestCase('Pages/Profile/Verify Required Nama'), [:], FailureHandling.STOP_ON_FAILURE)
		} else if (status == 'empty alamat') {
			WebUI.callTestCase(findTestCase('Pages/Profile/Verify Required Alamat'), [:], FailureHandling.STOP_ON_FAILURE)
		} else if (status == 'empty kota') {
			WebUI.callTestCase(findTestCase('Pages/Profile/Verify Required Kota'), [:], FailureHandling.STOP_ON_FAILURE)
		} else if (status == 'empty noHP') {
			WebUI.callTestCase(findTestCase('Pages/Profile/Verify Required No Handphone'), [:], FailureHandling.STOP_ON_FAILURE)
		}
		WebUI.closeBrowser()
	}
}