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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')

WebUI.setText(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Login/input_Username_UserName'), 'nanang')

WebUI.setEncryptedText(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Login/a_Login'))

WebUI.click(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Page_Home Page - My ASPNET Application/a_LOS'))

WebUI.click(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Page_Home Page - My ASPNET Application/a_Funding Preparation'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

WebUI.delay(3)

WebUI.setText(findTestObject('TC.05_Funding_Preparation/Search By All Filed/App Number'), '202006401LS00012')

WebUI.sendKeys(findTestObject('TC.05_Funding_Preparation/Search By All Filed/App Number'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Page_Home Page - My ASPNET Application/input_App Date Start Text Box2'), 
    '01-Jun-2020')

WebUI.setText(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Page_Home Page - My ASPNET Application/input_App Date End Text Box2'), 
    '30-Jun-2020')

WebUI.setText(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Page_Home Page - My ASPNET Application/input_Customer Name_Customer Name  Text Box2'), 
    'Cecep')

WebUI.click(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Page_Home Page - My ASPNET Application/ComboBox_Product'))

WebUI.click(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Page_Home Page - My ASPNET Application/Product'))

WebUI.click(findTestObject('TC.05_Funding_Preparation/Search By All Filed/Page_Home Page - My ASPNET Application/Button Search/Button_Search'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('TC.05_Funding_Preparation/Selected Data'))

WebUI.click(findTestObject('TC.05_Funding_Preparation/Detail'))

WebUI.delay(1)

