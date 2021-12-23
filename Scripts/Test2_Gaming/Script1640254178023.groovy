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

WebUI.waitForPageLoad(5)

WebUI.navigateToUrl('https://fr.wowhead.com/')

WebUI.click(findTestObject('Page_Wowhead  Cest comme prtendre tre malad_723237/bouton_Accepter_les_Cookies'))

WebUI.click(findTestObject('Page_Wowhead  Cest comme prtendre tre malad_723237/bouton_Refuser_les _notifs'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Page_Wowhead  Cest comme prtendre tre malad_723237/Onglet_recherche'), 'Lardeur')

WebUI.sendKeys(findTestObject('Page_Wowhead  Cest comme prtendre tre malad_723237/Onglet_recherche'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Page_Lardeur - Recherche Wowhead/Resultat_recherche_perso_Lardeur'), 5)

WebUI.click(findTestObject('Page_Lardeur - Recherche Wowhead/Resultat_recherche_perso_Lardeur'))

WebUI.waitForElementPresent(findTestObject('Page_Lardeur - PNJ - World of Warcraft/item_chahuteur_de_cadavre'), 5)

WebUI.click(findTestObject('Page_Lardeur - PNJ - World of Warcraft/item_chahuteur_de_cadavre'))

WebUI.closeBrowser()

