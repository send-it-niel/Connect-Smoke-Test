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

WebUI.callTestCase(findTestCase('Modular Component/Click - Customer Search'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Customers/Viewports/Viewport - Customer Search - TAB'), 
    1)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Customers/Viewports/Viewport - Customer Search - Entity Dropdown'), 
    1)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Customers/Viewports/Viewport - Customer Search - Search field'), 
    1)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Customers/Viewports/Viewport - Customer Search - Show Customer Checkbox'), 
    1)

WebUI.delay(5)

WindowTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(WindowTitle, 'Customers | ERNI Connect', false)
