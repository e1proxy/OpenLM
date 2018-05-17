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

WebUI.click(findTestObject('Sign_In/Page_OpenLM license parser (FLEXlmF/a_Sign in'))

'Sign In Form'
WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/div_      SIGN IN'), 
    0)

'Close Button'
WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/button_'), 0)

WebUI.verifyElementClickable(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/button_'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/h4_SIGN IN'), 0)

WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/h5_Great to have you back'), 
    0)

WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/input_email'), 0)

WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/input_password'), 0)

WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/label_remember me'), 
    0)

WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/button_Sign in'), 0)

WebUI.verifyElementClickable(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/button_Sign in'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/button_Sign in with google'), 
    0)

WebUI.verifyElementClickable(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/button_Sign in with google'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/a_forgot password'), 
    0)

WebUI.waitForElementClickable(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/a_forgot password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Sign_In/Sign_In_Form/Page_OpenLM license parser (FLEXlmF/a_Create a free account'), 
    0)

WebUI.closeBrowser()

