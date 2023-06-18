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



class sellproduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open page home to add product")
	public void i_open_page_home_to_add_product() {
	}

	@When("I click jual button")
	public void i_click_jual_button() {
	}

	@When("I should redirect to product page")
	public void i_should_redirect_to_product_page() {
	}

	@When("I fill nama product correct")
	public void i_fill_nama_product_correct() {
	}

	@When("I fill harga product correct")
	public void i_fill_harga_product_correct() {
	}

	@When("I fill kategori correct")
	public void i_fill_kategori_correct() {
	}

	@When("I fill deskripsi correct")
	public void i_fill_deskripsi_correct() {
	}

	@When("I upload image product correct")
	public void i_upload_image_product_correct() {
	}

	@When("I click button Terbitkan")
	public void i_click_button_Terbitkan() {
	}

	@Then("The product successfully added to catalog")
	public void the_product_successfully_added_to_catalog() {
		
	}

	@When("I fill nama product incorrect")
	public void i_fill_nama_product_incorrect() {
		
	}

	@When("I fill harga product incorrect")
	public void i_fill_harga_product_incorrect() {
		
	}

	@When("I fill kategori incorrect")
	public void i_fill_kategori_incorrect() {
	
	}

	@When("I fill deskripsi incorrect")
	public void i_fill_deskripsi_incorrect() {

	}

	@When("I upload image product incorrect")
	public void i_upload_image_product_incorrect() {
	
	}

	@When("I upload image product wrong")
	public void i_upload_image_product_wrong() {
		
	}
}