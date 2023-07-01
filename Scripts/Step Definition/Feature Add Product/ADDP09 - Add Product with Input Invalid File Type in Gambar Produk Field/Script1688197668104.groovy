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

WebUI.callTestCase(findTestCase('Step Definition/Feature Register/REG01 - User register with valid credentials'), [:])

WebUI.callTestCase(findTestCase('Pages/Homepage/Click Profile Akun Icon'), [:])

WebUI.callTestCase(findTestCase('Pages/Homepage/Click Profile Akun'), [:])

WebUI.selectOptionByLabel(findTestObject('User Profile/select_Pilih Kota'), 'Jakarta', false)

WebUI.setText(findTestObject('User Profile/textarea_Alamat'), 'Alamat')

WebUI.setText(findTestObject('User Profile/input_No Handphone'), '0')

WebUI.uploadFile(findTestObject('User Profile/input_Avatar'), 'C:\\Users\\ASUS\\Downloads\\Image\\imgp.jpeg')

WebUI.click(findTestObject('User Profile/button_simpan'))

WebUI.callTestCase(findTestCase('Pages/Homepage/Click Jual Floating Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add Product/Verify Add Product Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add Product/Input Nama Produk'), [('namaProduk') : 'Produk A'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add Product/Input Harga Produk'), [('hargaProduk') : '100000'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add Product/Input Kategori Produk'), [('kategoriProduk') : 'Kesehatan'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add Product/Input Deskripsi Produk'), [('deskripsiProduk') : 'Deskripsi Produk A'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add Product/Input Gambar Produk'), [('pathToFile') : 'C:\\Users\\ASUS\\Downloads\\test.txt'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add Product/Click Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Add Product/Verify Error Message/Verify Gambar Produk Invalid File Error Message'), [:], 
    FailureHandling.STOP_ON_FAILURE)

