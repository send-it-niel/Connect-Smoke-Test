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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.DataFlavor as DataFlavor
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://connect-test.erninet.ch/')

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

'Handle Authentication Modal: Authenticate then Click HTML 5 if displayed. Click HTML 5 if not.'
if (WebUI.verifyTextNotPresent('beta-version', false, FailureHandling.CONTINUE_ON_FAILURE)) {
    'Please fill-up \'userName\' & \'password\' fields'
    WebUI.authenticate('https://connect-test.erninet.ch/', '', '', 5, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Smoke Test/HTML 5 Link'))
} else {
    WebUI.click(findTestObject('Smoke Test/HTML 5 Link'))
}

WebUI.delay(3)

'Refresh if encountered Indefinite loading.'
if (WebUI.verifyTextNotPresent('Your CV and everyone', false, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.refresh()
}

