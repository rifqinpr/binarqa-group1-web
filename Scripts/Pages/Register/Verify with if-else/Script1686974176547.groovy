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

if (status == 'success') {
    WebUI.callTestCase(findTestCase('Pages/Register/Verify Register Valid'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required email') {
    WebUI.verifyElementVisible(findTestObject('Register/h2_Daftar'), FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Pages/Register/Verify Required Email'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'invalid email') {
    WebUI.verifyElementVisible(findTestObject('Register/h2_Daftar'))

    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Msg - Registered Email'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required password') {
    WebUI.verifyElementVisible(findTestObject('Register/h2_Daftar'))

    WebUI.callTestCase(findTestCase('Pages/Register/Verify Required Password'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'invalid password') {
    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Msg - Password less than 8'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'required nama') {
    WebUI.verifyElementVisible(findTestObject('Register/h2_Daftar'))
	
	WebUI.callTestCase(findTestCase('Pages/Register/Verify Required Nama'), [('expected') : ''], FailureHandling.STOP_ON_FAILURE)
}

