import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Modular Component/FIRST TC Open Connect (Delay 10s)'), [('URL') : 'https://connect-test.erninet.ch/3#Home'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modular Component/Click - People Search (Delay 10s)'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify "People Search" Tab is Visible'
WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - People Search/Viewport - Objects/Tab - People Search'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

'Verify "Enity Dropdown" is Visible'
WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - People Search/Viewport - Objects/Dropdown - People Search'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

'Verify "Search Field" is Visible'
WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - People Search/Viewport - Objects/Field - Search'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

'Verify "Filter" dropdown is Visible'
WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - People Search/Viewport - Objects/Button - Filter'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

'Verify "Show Columns" Dropdown is Visible'
WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - People Search/Viewport - Objects/Dropdown - Show Columns'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

'Verify "Export" Button is Visible'
WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - People Search/Viewport - Objects/Button - Export People'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Main Table is Visible'
WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - People Search/Viewport - Objects/Main Table'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

'Verify ERNI Logo is Visible'
WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - People Search/Viewport - Objects/Image - ERNI Logo'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

