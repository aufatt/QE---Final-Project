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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://qa.alta.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Auth/Register/Icon login'))

for (int i = 1; i <= 2; i++) {
    WebUI.setText(findTestObject('Auth/Login/Email field login'), findTestData('data login').getValue(1, i))

    WebUI.setText(findTestObject('Auth/Login/Password field login'), findTestData('data login').getValue(2, i))

    WebUI.click(findTestObject('Auth/Login/Login button (2)'))

    WebUI.refresh()
}

WebUI.verifyTextNotPresent('https://qa.alta.id/', true)

WebUI.click(findTestObject('Home Page/drop down list'))

WebUI.click(findTestObject('Home Page/Select category'))

WebUI.verifyTextPresent('Products is empty!', false)

WebUI.click(findTestObject('Home Page/close filter'))

WebUI.click(findTestObject('Home Page/detil item'))

WebUI.verifyTextPresent('Tensi Darah Elektrik', true)

WebUI.back()

WebUI.click(findTestObject('Home Page/beli button'))

WebUI.click(findTestObject('Home Page/cart icon'))

WebUI.verifyTextPresent('Tensi Darah Elektrik', true)

WebUI.click(findTestObject('Cart/add item'))

WebUI.verifyTextPresent('480000', true)

WebUI.click(findTestObject('Cart/Reduce item'))

WebUI.verifyTextPresent('240000', true)

WebUI.click(findTestObject('Cart/bayar button'))

WebUI.verifyTextPresent('No data available', false)

WebUI.click(findTestObject('Auth/Logout/user icon'))

WebUI.click(findTestObject('Auth/Logout/logout button'))

WebUI.closeBrowser()

