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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

try {
    String s = WebUI.getUrl()

    WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
} 

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'burhan')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_LOS'))

WebUI.click(findTestObject('Master/a_Task Survey'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('TC.04_Reguler Survey/SurveyType'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.04_Reguler Survey/SurveyType-Silent Survey'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_Task Survey/btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Task Survey/spanFoundFirst'))

WebUI.click(findTestObject('TC.02_Task Survey/btnPickUp'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 30, FailureHandling.OPTIONAL)

not_run: WebUI.delay(16)

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/TabSurveyResult'))

WebUI.scrollToElement(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/Scroll_SurveyResult'), 5)

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddProfession'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddProfessionItem_Buruh'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddJobPosition'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddJobPositionItem_Owner'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddKeterkenalanDebitur'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddKeterkenalanDebiturItem_Source Checking Mengenal Debitur'))

WebUI.setText(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/txtLamaBekerja'), '2')

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddStatusPekerjaan'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddStatusPekerjaanItem_TidakTahu'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddPenggunaanUnitJaminan'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddPenggunaanUnitJaminanItem_DigunakanDebitur'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddKondisiUnit'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddKondisiUnitItem_LayakPakai'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddDetailJob'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddDetailJob_BoardManagement'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddKepemilikanRumah'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddKepemilikanRumahItem_Keluarga'))

WebUI.setText(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/txtTinggalDomisili'), '1')

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddKepemilikanUnit'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddKepemilikanUnit_Keluarga'))

WebUI.setText(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/txtLamaMemilikiUnit'), '1')

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddLokasiPemakaianUnit'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddLokasiPemakaianUnitItem_DalamKota'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddCharacter'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/ddCharacterItem_GoodProspect'))

WebUI.click(findTestObject('TC.04_Reguler Survey/Survey Result/Silent Survey/button save'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

