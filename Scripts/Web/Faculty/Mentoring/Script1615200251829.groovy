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

WebUI.setText(findTestObject('Object Repository/Faculty/Mentoring/input_Faculty Login_username'), 'AITS051002')

WebUI.setEncryptedText(findTestObject('Object Repository/Faculty/Mentoring/input_Faculty Login_password'), '/HuGEUzXDLUt1zEZ6TwafQ==')

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_Login'))

WebUI.click(findTestObject('Faculty/Imports/svg_Dr PC Senthil Mahesh_svg-inline--fa fa-_fb601b'))

WebUI.click(findTestObject('Faculty/Imports/div_Role ()AdminFacultyHOD'))

WebUI.click(findTestObject('Faculty/Imports/svg_Dr PC Senthil Mahesh_svg-inline--fa fa-_fb601b'))

WebUI.click(findTestObject('Object Repository/Faculty/Notifications/a_Faculty'))

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/img'))

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_Profile'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_Education'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_Semester Wise Marks'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Faculty/Mentoring/button_More Details'))

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_Course and Faculty Details'))

WebUI.takeScreenshot()

WebUI.focus(findTestObject('Faculty/Mentoring/Course and Faculty Details_close'))

WebUI.click(findTestObject('Faculty/Mentoring/Course and Faculty Details_close'))

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_More Details'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_Student Details'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_Attendance Details'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_Marks Details'))

WebUI.takeScreenshot()

WebUI.focus(findTestObject('Faculty/Mentoring/Student Details_close'))

WebUI.click(findTestObject('Faculty/Mentoring/Student Details_close'))

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_More Details'))

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_Communication Details'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_Completed'))

WebUI.takeScreenshot()

WebUI.focus(findTestObject('Faculty/Mentoring/Communication Details_close'))

WebUI.click(findTestObject('Faculty/Mentoring/Communication Details_close'))

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/svg_Dr. P.C. Senthil Mahesh_svg-inline--fa _bc1b97'))

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_logout'))

