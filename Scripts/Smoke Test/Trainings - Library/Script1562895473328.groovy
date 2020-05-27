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

WebUI.click(findTestObject('Smoke Test/Trainings/Library/Link/Trainings - Library'))

WebUI.delay(10)

////
WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library Tab'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - All'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - Search Bar'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - Filter icon'), 1, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - Show Column'), 1, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - ERNI logo'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - Add Training icon'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

//Table Verify
WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - ID'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - Full Name'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - Connect Name'), 1, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - Category'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - On Profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - Mandatory'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - Status'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Smoke Test/Trainings/Library/Viewports/Library - Edit'), FailureHandling.CONTINUE_ON_FAILURE)

