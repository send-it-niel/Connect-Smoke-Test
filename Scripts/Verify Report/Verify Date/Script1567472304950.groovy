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
import groovy.time.TimeCategory

use(TimeCategory, {
	today = new Date()
	lastWeek = (today - 1.week)
	NextWeek = (today + 1.week)
	NextMonth = (today + 1.month)
	twodaysAgo = (today- 2.days)
})

println ("today -- " + today.format('MM/dd/yyyy'))
println ("lastWeek -- " + lastWeek.format('MM/dd/yyyy'))
println ("NextWeek -- " + NextWeek.format('MM/dd/yyyy'))
println ("NextMonth -- " + NextMonth.format('MM/dd/yyyy'))
println ("twodaysAgo -- " + twodaysAgo.format('MM/dd/yyyy'))