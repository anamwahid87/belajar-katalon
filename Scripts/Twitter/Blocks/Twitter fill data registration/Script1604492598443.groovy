import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('Object Repository/Twitter Page/Registration Page/input_name'),'Anamuno')

WebUI.click(findTestObject('Object Repository/Twitter Page/Registration Page/label_useEmailinstead'))

String chars = 'abcdefghijklmnopqrstuvwyz1234567890'
String email = CustomKeywords.'com.belajarkatalon.function.string.RandomUtil.randomString'(chars, 10) + '@gmail.com'

WebUI.setText(findTestObject('Object Repository/Twitter Page/Registration Page/input_email'), email)

WebUI.selectOptionByValue(findTestObject('Object Repository/Twitter Page/Registration Page/select_month'),'6', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Twitter Page/Registration Page/select_day'),'4', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Twitter Page/Registration Page/select_year'),'1996', false)

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Twitter Page/Registration Page/button_next'), 'data-focusable', 5)

WebUI.click(findTestObject('Object Repository/Twitter Page/Registration Page/button_next'))