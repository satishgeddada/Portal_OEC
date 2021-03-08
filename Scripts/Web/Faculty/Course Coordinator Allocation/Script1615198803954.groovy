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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://oecfrontend.vercel.app/')

WebUI.setText(findTestObject('Object Repository/Faculty/Course Coordinator Allocation/input_Faculty Login_username'), 'AITS051002')

WebUI.setEncryptedText(findTestObject('Object Repository/Faculty/Course Coordinator Allocation/input_Faculty Login_password'), 
    '/HuGEUzXDLUt1zEZ6TwafQ==')

WebUI.click(findTestObject('Object Repository/Faculty/Course Coordinator Allocation/button_Login'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/svg_Dr. P.C. Senthil Mahesh_svg-inline--fa _bc1b97'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/div_Role ()AdminFacultyHOD'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/svg_Dr. P.C. Senthil Mahesh_svg-inline--fa _bc1b97'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/a_Faculty'))

WebUI.click(findTestObject('Object Repository/Faculty/Course Coordinator Allocation/img'))

WebUI.click(findTestObject('Object Repository/Faculty/Course Coordinator Allocation/button_Others'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Course Coordinator Allocation/button_CO-PO Mapping'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Course Coordinator Allocation/button_Question Paper Entry'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Course Coordinator Allocation/button_Reports'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Notifications/svg_Dr. P.C. Senthil Mahesh_svg-inline--fa _bc1b97'))

WebUI.click(findTestObject('Object Repository/Faculty/Notifications/button_logout'))

WebUI.closeBrowser()

