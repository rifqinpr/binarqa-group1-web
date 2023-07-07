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

import internal.GlobalVariable

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class ProductCategoryFilter {
	@Given("User is in homepage and see product category filter button")
	public void user_see_filter() {
		WebUI.openBrowser('https://secondhand.binaracademy.org/')
		WebUI.maximizeWindow()
		WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Verify Category Filter Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User click (.*) button")
	public void user_click_category_button(String category) {
		if(category == 'Semua') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Click Semua Category Filter'), [:], FailureHandling.STOP_ON_FAILURE)
		}else if(category == 'Hobi') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Click Hobi Category Filter'), [:], FailureHandling.STOP_ON_FAILURE)
		}else if(category == 'Kendaraan') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Click Kendaraan Category Filter'), [:], FailureHandling.STOP_ON_FAILURE)
		}else if(category == 'Baju') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Click Baju Category Filter'), [:], FailureHandling.STOP_ON_FAILURE)
		}else if(category == 'Elektronik') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Click Elektronik Category Filter'), [:], FailureHandling.STOP_ON_FAILURE)
		}else if(category == 'Kesehatan') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Click Kesehatan Category Filter'), [:], FailureHandling.STOP_ON_FAILURE)
		}
	}
	
	@Then("Verify List of products that match (.*) will be shown")
	public void verify_products_category_shown(String category) {
		if(category == 'Semua') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Verify First Product Card Category'), [('textExpected') : '\\bBaju|\\bElektronik|\\bHobi|\\bKendaraan|\\bKesehatan', ('isRegex') : true], FailureHandling.STOP_ON_FAILURE)
		}else if(category == 'Hobi') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Verify First Product Card Category'), [('textExpected') : WebUI.getText(findTestObject('Homepage/Kategori Filter/a_Filter Hobi')), ('isRegex') : false], FailureHandling.STOP_ON_FAILURE)
		}else if(category == 'Kendaraan') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Verify First Product Card Category'), [('textExpected') : WebUI.getText(findTestObject('Homepage/Kategori Filter/a_Filter Kendaraan')), ('isRegex') : false], FailureHandling.STOP_ON_FAILURE)
		}else if(category == 'Baju') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Verify First Product Card Category'), [('textExpected') : WebUI.getText(findTestObject('Homepage/Kategori Filter/a_Filter Baju')), ('isRegex') : false], FailureHandling.STOP_ON_FAILURE)
		}else if(category == 'Elektronik') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Verify First Product Card Category'), [('textExpected') : WebUI.getText(findTestObject('Homepage/Kategori Filter/a_Filter Elektronik')), ('isRegex') : false], FailureHandling.STOP_ON_FAILURE)
		}else if(category == 'Kesehatan') {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Category Filter Button/Verify First Product Card Category'), [('textExpected') : WebUI.getText(findTestObject('Homepage/Kategori Filter/a_Filter Kesehatan')), ('isRegex') : false], FailureHandling.STOP_ON_FAILURE)
		}
		WebUI.closeBrowser()
	}
}
