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

WebUI.setText(findTestObject('Object Repository/Faculty/Profile/input_Faculty Login_username'), 'AITS051002')

WebUI.setEncryptedText(findTestObject('Object Repository/Faculty/Profile/input_Faculty Login_password'), '/HuGEUzXDLUt1zEZ6TwafQ==')

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Login'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/svg_Dr. P.C. Senthil Mahesh_svg-inline--fa _bc1b97'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/div_Role ()AdminFacultyHOD'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/svg_Dr. P.C. Senthil Mahesh_svg-inline--fa _bc1b97'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/a_Faculty'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/img'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Change Profile Information'))

WebUI.doubleClick(findTestObject('Object Repository/Faculty/Profile/input_JNTUA No._jntuhID'))

WebUI.setText(findTestObject('Object Repository/Faculty/Profile/input_JNTUA No._jntuhID'), '123455678')

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Update'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Contact Details'))

WebUI.click(findTestObject('Faculty/Profile/button_Change Contact Information'))

WebUI.doubleClick(findTestObject('Object Repository/Faculty/Profile/input_Mobile No_mobileNumber'))

WebUI.setText(findTestObject('Object Repository/Faculty/Profile/input_Mobile No_mobileNumber'), '09248708087')

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Update Contact Details'))

WebUI.takeScreenshot()

/*
WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Qualification Details'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_ADD QUALIFICATION'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Faculty/Profile/select_Choose your optionPh.DM.PhilPost Gra_5fdd7f'), 
    'Ph.D', true)

WebUI.setText(findTestObject('Object Repository/Faculty/Profile/input_CollegeUniversity Name_collegeName'), 'OU')

WebUI.setText(findTestObject('Object Repository/Faculty/Profile/input_Branch Name_branchName'), 'CSE')

WebUI.setText(findTestObject('Object Repository/Faculty/Profile/input_Completion Year_yearOfPass'), '2005')

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Save Qualification'))

WebUI.click(findTestObject('Faculty/Profile/svg_CSE_svg-inline--fa fa-edit fa-w-18'))

WebUI.doubleClick(findTestObject('Object Repository/Faculty/Profile/input_Completion Year_yearOfPass'))

WebUI.setText(findTestObject('Object Repository/Faculty/Profile/input_Completion Year_yearOfPass'), '2006')

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Update Qualification'))

WebUI.click(findTestObject('Faculty/Profile/span_EMBEDDED SYSTEMS_cursor-pointer text-red-400'))

WebUI.focus(findTestObject('Faculty/Profile/button_Yes_Q'))

WebUI.click(findTestObject('Faculty/Profile/button_Yes_Q'))
*/
WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Book Publications'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Journal Publications'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Research Guidlance'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Profile/span_ MORE'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Workshop Details'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Profile/span_ MORE'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Grant Received'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Profile/span_ MORE'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Conferences'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Profile/span_ MORE'))

WebUI.click(findTestObject('Object Repository/Faculty/Profile/button_Ph.D Details'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/svg_Dr. P.C. Senthil Mahesh_svg-inline--fa _bc1b97'))

WebUI.click(findTestObject('Object Repository/Faculty/Mentoring/button_logout'))

