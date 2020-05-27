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
//Libraries for User Input functions
import javax.swing.JOptionPane as JOptionPane
import javax.swing.JFrame as JFrame

//Get Current Calendar Week
//Open ERNI Connect
WebUI.openBrowser('https://www.calendar-week.org/')

'"Var1" will be filled-up by this step.'
var1 = WebUI.getText(findTestObject('Verify Report/Calendar Week - Text'))

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Modular Component/FIRST TC Open Connect (Delay 10s)'), [('URL') : 'https://connect-test.erninet.ch/3#Home'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Verify Report/Link - Dashboard - Available Employees'))

WebUI.delay(2)

//Popup portion
//var1 = 1 //to be attached on Excel formula sheet
JFrame frame = new JFrame('User Input Frame')

frame.requestFocus()

var2 = JOptionPane.showInputDialog('Please Enter latest Calendar Report week ', var1 // Entering correct Latest report calendar week will pass TC
    )

WebUI.verifyEqual(var1, var2)

