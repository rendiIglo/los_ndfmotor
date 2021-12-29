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

not_run: WebUI.setText(findTestObject('TC.02_Task Survey/txtCustomerName'), 'a')

not_run: WebUI.setText(findTestObject('TC.02_Task Survey/txtLeadID'), '1')

not_run: WebUI.setText(findTestObject('TC.02_Task Survey/txtScheduleDate'), '16/07/2020')

not_run: WebUI.setText(findTestObject('TC.02_Task Survey/txtScheduleTime'), '12:00')

WebUI.click(findTestObject('TC.02_Task Survey/ddlSurveyType'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_Task Survey/ddlSurveyType - SilentSurvey'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_Task Survey/btnSearch'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('TC.02_Task Survey/btnNextPage'))

WebUI.click(findTestObject('TC.02_Task Survey/spanFoundFirst'))

WebUI.click(findTestObject('TC.02_Task Survey/btnPickUp'))

WebUI.delay(10)

not_run: WebUI.click(findTestObject('TC.03_Silent Survey/Credit_structure'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/Survey_result'))

WebUI.delay(3)

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Profession'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Profession_ABRI-POL-AK'))

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_JobPosition'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_JobPosition_Manager'))

not_run: WebUI.scrollToElement(findTestObject('TC.03_Silent Survey/Scroll_tremOfCredit'), 5)

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Keterkenalan Debitur'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Keterkenalan Debitur-Spouse 1'))

WebUI.delay(2)

WebUI.setText(findTestObject('TC.03_Silent Survey/Survey Result/SR_Lama Bekerja- Usaha (tahun)'), '5')

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Status Pekerjaan'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Status Pekerjaan_Usaha tidak ada'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Penggunaan Unit Jaminan'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Penggunaan Unit Jaminan_digunakan orang lain'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Kondisi Unit'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Kondisi Unit_Tidak di pakai'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Upload Image (1)'))

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Silent Survey/Survey Result/SR_Upload Image (1)'), 'H:\\AllProject\\KatalonBFI\\Katalon\\Document\\npwp.jpg')

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_detail job'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_detail job-AnggotaMPR-DPR-DPD'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Kepemilikan Rumah'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Kepemilikan Rumah-Conversion'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Silent Survey/Survey Result/SR_Lama Tinggal Domisili (tahun)'), '5')

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Kepemilikan Unit'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Kepemilikan Unit-milik debitur-pasangan'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Lokasi Pemakaian Unit'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Lokasi Pemakaian Unit-Dalam kota'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Character'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Character-Blocket prospect'))

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_Foto dengan Rumah'))

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Silent Survey/Survey Result/SR_Foto dengan Rumah'), 'H:\\AllProject\\KatalonBFI\\Katalon\\Document\\npwp.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('TC.03_Silent Survey/Survey Result/SR_btn_save'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

