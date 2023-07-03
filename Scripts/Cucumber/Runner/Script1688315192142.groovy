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
import javassist.bytecode.stackmap.BasicBlock.Catch as Catch
import org.openqa.selenium.Keys as Keys

try{CucumberKW.runWithCucumberRunner(RunnerRegister.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerLogin.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerUserProfile.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerAddProduct.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerEditProduct.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerDeleteProduct.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerDaftarJual.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerProductCategory.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerSearch.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerBuyerBidProduct.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerSellerAcceptBid.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerSellerDeniedBid.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerUpdateStatusBerhasil.class)}catch(Exception){}
try{CucumberKW.runWithCucumberRunner(RunnerUpdateStatusBatalkan.class)}catch(Exception){}
