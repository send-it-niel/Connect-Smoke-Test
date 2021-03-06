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

WebUI.click(findTestObject('Smoke Test/Trainings/Training Employee Overview/Link/Trainings - Training Employee Overview'))

WebUI.delay(10)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Training Employee Overview/Viewports/Trainining Employee - Tab'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Training Employee Overview/Viewports/Trainining Employee - Entity'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Training Employee Overview/Viewports/Trainining Employee - Search Field'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Training Employee Overview/Viewports/Trainining Employee - Filter'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Training Employee Overview/Viewports/Trainining Employee - Show Columns'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Training Employee Overview/Viewports/Trainining Employee - Employee Name'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Training Employee Overview/Viewports/Trainining Employee - Unit'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/Trainings/Training Employee Overview/Viewports/Trainining Employee - BA'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

