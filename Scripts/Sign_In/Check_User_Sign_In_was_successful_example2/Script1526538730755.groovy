import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alllicenseparser.com/#/home')

WebUI.verifyElementPresent(findTestObject('Sign_In/Page_OpenLM license parser (FLEXlmF/a_Sign in'), 0)

WebUI.click(findTestObject('Sign_In/Page_OpenLM license parser (FLEXlmF/a_Sign in'))

WebUI.waitForElementClickable(findTestObject('Sign_In/Page_OpenLM license parser (FLEXlmF/input_email (1)'), 0)

WebUI.setText(findTestObject('Sign_In/Page_OpenLM license parser (FLEXlmF/input_email (1)'), 'proxyliro@gmail.com')

WebUI.waitForElementClickable(findTestObject('Sign_In/Page_OpenLM license parser (FLEXlmF/input_password'), 0)

WebUI.setText(findTestObject('Sign_In/Page_OpenLM license parser (FLEXlmF/input_password'), '12345')

WebUI.click(findTestObject('Sign_In/Page_OpenLM license parser (FLEXlmF/button_Sign in'))

WebUI.verifyElementClickable(findTestObject('Sign_In/Page_OpenLM license parser (FLEXlmF/a_Hello Timur'))

WebUI.closeBrowser()

