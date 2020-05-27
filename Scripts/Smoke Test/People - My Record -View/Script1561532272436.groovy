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

WebUI.callTestCase(findTestCase('Modular Component/FIRST TC Open Connect (Delay 10s)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Modular Component/Click - My record (Delay 10s)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Smoke Test/People - My record/Link - Objects/Link - My record - ERNI Information'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'"My record" tab will not be available in viewport if "ERNI Information" is at the top-most of viewport.'
WebUI.verifyElementNotVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Tab My record'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - ERNI Information'), 
    0)

'Click "Contact Information"'
WebUI.click(findTestObject('Smoke Test/People - My record/Link - Objects/Link - My record - Contact Information'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'ERNI Information portion will not be available in viewport if Contact Information" is at the top-most of viewport.'
WebUI.verifyElementNotVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - ERNI Information'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Contact information'), 
    0)

'Click "Career Summary"'
WebUI.click(findTestObject('Smoke Test/People - My record/Link - Objects/Link - My record - Career Summary'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Contact information'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Career Summary'), 
    0)

'Click "Roles"'
WebUI.click(findTestObject('Smoke Test/People - My record/Link - Objects/Link - My record - Roles'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Career Summary'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Roles'), 
    0)

'Click "Widgets"'
WebUI.click(findTestObject('Smoke Test/People - My record/Link - Objects/Link - My record - Widgets'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Roles'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Widgets'), 
    0)

'Click "Skills Overview"'
WebUI.click(findTestObject('Smoke Test/People - My record/Link - Objects/Link - My record - Skills Overview'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Widgets'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Skills Overview'), 
    0)

'Click "ERNI Trainings"'
WebUI.click(findTestObject('Smoke Test/People - My record/Link - Objects/Link - My record - ERNI Trainings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Skills Overview'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - ERNI Trainings'), 
    0)

'Click "Education"'
WebUI.click(findTestObject('Smoke Test/People - My record/Link - Objects/Link - My record - Education'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - ERNI Trainings'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Education'), 
    0)

'Click "Experience"'
WebUI.click(findTestObject('Smoke Test/People - My record/Link - Objects/Link - My record - Experience'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Education'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Experience'), 
    0)

'Click "Projects"'
WebUI.click(findTestObject('Smoke Test/People - My record/Link - Objects/Link - My record - Projects'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Experience'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Smoke Test/People - My record/Viewport - Objects/Viewport - My record - Projects'), 
    0)

