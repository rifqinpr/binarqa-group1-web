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

WebUI.click(findTestObject('Navbar/a_Masuk'))

WebUI.setText(findTestObject('Login/input_Email'), 'alexjual@gmail.com')

WebUI.setText(findTestObject('Login/input_Password'), 'asdqwe')

WebUI.click(findTestObject('Login/button_Masuk'))

WebUI.click(findTestObject('Navbar/a_Notifikasi Icon'))

WebUI.click(findTestObject('Notification/a_Lihat Semua Notifikasi'))

WebUI.click(findTestObject('Notification/a_First Notification Card'))

WebUI.click(findTestObject('Info Penawaran/button_Status'))

WebUI.click(findTestObject('Info Penawaran/Status Produk/input_Batalkan Transaksi'))

WebUI.click(findTestObject('Info Penawaran/Status Produk/input_Kirim Update Status'))

WebUI.verifyTextPresent('Penjualan dibatalkan', true)
