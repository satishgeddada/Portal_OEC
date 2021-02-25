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

WebUI.setText(findTestObject('Faculty/Imports/input_Faculty Login_username'), 'AITS051002')

WebUI.setEncryptedText(findTestObject('Faculty/Imports/input_Faculty Login_password'), '/HuGEUzXDLUt1zEZ6TwafQ==')

WebUI.click(findTestObject('Faculty/Imports/button_Login'))

WebUI.click(findTestObject('Faculty/Imports/svg_Dr PC Senthil Mahesh_svg-inline--fa fa-_fb601b'))

WebUI.click(findTestObject('Faculty/Imports/div_Role ()AdminFacultyHOD'))

WebUI.click(findTestObject('Faculty/Imports/svg_Dr PC Senthil Mahesh_svg-inline--fa fa-_fb601b'))

WebUI.click(findTestObject('Faculty/Imports/a_Faculty'))

WebUI.delay(2)

WebUI.click(findTestObject('Faculty/Imports/Imports'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Faculty/Imports/img_1'))

WebUI.focus(findTestObject('Faculty/Imports/Course_obj'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Faculty/Imports/cousrse_obj_close'))

WebUI.click(findTestObject('Faculty/Imports/course_outcome'))

WebUI.focus(findTestObject('Faculty/Imports/course_outcome_close'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Faculty/Imports/course_outcome_close'))

WebUI.click(findTestObject('Faculty/Imports/subject_exp'))

WebUI.focus(findTestObject('Faculty/Imports/subject_exp_close'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Faculty/Imports/subject_exp_close'))

WebUI.click(findTestObject('Faculty/Imports/a_Dashboard'))

WebUI.click(findTestObject('Faculty/Imports/svg_Dr PC Senthil Mahesh_svg-inline--fa fa-_fb601b'))

WebUI.click(findTestObject('Faculty/Imports/button_logout'))

WebUI.closeBrowser()

