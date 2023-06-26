import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://secondhand.binaracademy.org/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/input_Email_useremail'), 'syafradha@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/input_Password_userpassword'), 
    'FPYExdvWvvd1Zn9qtGusuw==')

WebUI.click(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/input_Password_commit'))

WebUI.click(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/i_Keluar_bi bi-person me-4 me-lg-0'))

WebUI.click(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/img_Profil Saya_img-avatar w-100 rounded-4 mb-2'))

WebUI.setText(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/input_Nama_username'), 'deksa syafradhaa')

WebUI.selectOptionByValue(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/select_Pilih KotaSoloJogjaJakartaBandungSemarang'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/select_Pilih KotaSoloJogjaJakartaBandungSemarang'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/textarea_fds'), 'fdsewew')

WebUI.setText(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/input_No Handphone_userphone_number'), 
    '444324236565')

WebUI.click(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/input_Password_commit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/User Profile/Page_SecondHand/Page_SecondHand/h1_Bulan RamadhanBanyak diskon'), 
    0)

WebUI.closeBrowser()

