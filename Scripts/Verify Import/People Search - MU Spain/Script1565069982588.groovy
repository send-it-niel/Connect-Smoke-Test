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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://connect-test.erninet.ch/3#peopleSearch')

WebUI.delay(10)

WebUI.click(findTestObject('Smoke Test/People - People Search/Viewport - Objects/Dropdown - People Search'))

WebUI.click(findTestObject('Smoke Test/People - People Search/Link - Objects/Dropdown - MU Spain'))

WebUI.delay(10)

WebUI.click(findTestObject('Smoke Test/People - People Search/Link - Objects/Dropdown - Domicile'))

WebUI.click(findTestObject('Smoke Test/People - People Search/Link - Objects/Dropdown - Superior'))

WebUI.verifyTextPresent(emp, false)

