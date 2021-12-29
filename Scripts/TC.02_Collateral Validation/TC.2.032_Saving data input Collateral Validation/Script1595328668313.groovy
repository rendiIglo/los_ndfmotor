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

    WebUI.maximizeWindow()
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
} 

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'yana')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_LOS'))

WebUI.click(findTestObject('TC.02_Collateral Validation/Menu Collateral Validation'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.02_Collateral Validation/ddlProduct'))

WebUI.click(findTestObject('TC.02_Collateral Validation/itemDdlProduct_NDF Motor'))

WebUI.click(findTestObject('TC.02_Collateral Validation/btnSearch'))

WebUI.waitForElementNotPresent(findTestObject('TC.02_Collateral Validation/divLoaderSearch'), 10)

WebUI.waitForElementPresent(findTestObject('TC.02_Collateral Validation/divLoaderSearch'), 10)

not_run: WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_Collateral Validation/span_FirstDataFound'))

WebUI.click(findTestObject('TC.02_Collateral Validation/btnProcess'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('TC.05_Collateral Appraisal/grid body motor'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

WebUI.click(findTestObject('TC.05_Collateral Appraisal/dropdown input conditional collateral value'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/pilihan dropdown ada modifikasi'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/button save input collateral condition value'))

not_run: WebUI.click(findTestObject('TC.05_Collateral Appraisal/grid interior mobil'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0, FailureHandling.OPTIONAL)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('TC.05_Collateral Appraisal/dropdown input conditional collateral value'))

not_run: WebUI.click(findTestObject('TC.05_Collateral Appraisal/pilihan dropdown Interior Tidak Lengkap'))

not_run: WebUI.click(findTestObject('TC.05_Collateral Appraisal/button save input collateral condition value'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/grid kondisi mesin'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.05_Collateral Appraisal/dropdown input conditional collateral value'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/pilihan dropdown mesin hidup'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/button save input collateral condition value'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/grid dokumen'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.05_Collateral Appraisal/dropdown input conditional collateral value'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/pilihan dropdown sesuai fisik'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/button save input collateral condition value'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/grid KM'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.05_Collateral Appraisal/dropdown input conditional collateral value'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/pilihan dropdown jarak km'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/button save input collateral condition value'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/grid karesori'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.05_Collateral Appraisal/dropdown input conditional collateral value'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/pilihan dropdown motor biasa'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/button save input collateral condition value'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos pilih grid nomor rangka'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos button upload'))

WebUI.setText(findTestObject('TC.05_Collateral Appraisal/asset photos update document input receive by'), 'Rexy')

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button upload'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Collateral Appraisal/asset photos update document button upload'), 
    GlobalVariable.filePath + '\\fotodenganrumah.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button save'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/button ok notification after upload asset'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

not_run: WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button cancel'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos pilih grid nomor mesin'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos button upload'))

WebUI.setText(findTestObject('TC.05_Collateral Appraisal/asset photos update document input receive by'), 'Saputro')

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button upload'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Collateral Appraisal/asset photos update document button upload'), 
    GlobalVariable.filePath + '\\fotodenganrumah.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button save'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/button ok notification after upload asset'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

not_run: WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button cancel'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos pilih grid selfie dengan unit kendaraan'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos button upload'))

WebUI.setText(findTestObject('TC.05_Collateral Appraisal/asset photos update document input receive by'), 'Sarwono')

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button upload'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Collateral Appraisal/asset photos update document button upload'), 
    GlobalVariable.filePath + '\\fotodenganrumah.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button save'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/button ok notification after upload asset'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

not_run: WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button cancel'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos pilih grid speedometer'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos button upload'))

WebUI.setText(findTestObject('TC.05_Collateral Appraisal/asset photos update document input receive by'), 'Marijan')

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button upload'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Collateral Appraisal/asset photos update document button upload'), 
    GlobalVariable.filePath + '\\fotodenganrumah.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button save'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/button ok notification after upload asset'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

not_run: WebUI.click(findTestObject('TC.05_Collateral Appraisal/asset photos update document button cancel'))

WebUI.click(findTestObject('TC.05_Collateral Appraisal/a_Save'))

