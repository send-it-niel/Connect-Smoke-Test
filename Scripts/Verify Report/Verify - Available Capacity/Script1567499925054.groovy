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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//Libraries for User Input functions
import javax.swing.JOptionPane as JOptionPane
import javax.swing.JFrame as JFrame

var1 = var1
/*
JFrame frame = new JFrame('Reminder')

frame.requestFocus()

JOptionPane.showInputDialog("Katalon Capacity Allocation.xlsx Needs to be updated prior to executing Test Case."
	)
*/
//Access to Connect
WebUI.callTestCase(findTestCase('Modular Component/FIRST TC Open Connect (Delay 10s)'), [('URL') : 'https://connect-test.erninet.ch/3#Home'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Verify Report/Link - Dashboard - Available Capacity'))

WebUI.delay(2)

//Popup portion
JFrame frame = new JFrame('User Input Frame')

frame.requestFocus()

var2 = JOptionPane.showInputDialog('Please Enter latest Available Capacity Report ', var1 // Entering correct Latest report calendar week will pass TC
    )

WebUI.verifyEqual(var1, var2)

