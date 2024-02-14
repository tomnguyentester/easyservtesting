package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.FlightDeckSetting.GatewaysPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GatewaysTest extends BaseSetup {
    private WebDriver driver;
    private GatewaysPage gatewaysPage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;
    private By cancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    private By gatewaynameTextbox = By.xpath("//input[@id='form_in_modal_name']");
    private By noteTextbox = By.xpath("//input[@id='form_in_modal_description']");
    private By closeButton = By.xpath("//span[@aria-label='close']//*[name()='svg']");
    private By saveButton = By.xpath("//span[normalize-space()='Save']");
    private By yesButton = By.xpath("//span[contains(text(),'Yes')]");
    private By searchIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");

    @BeforeTest
    public void setup(){
        driver = getDriver();
        gatewaysPage = new GatewaysPage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Gateways\" tab")
    public void GatewaysTest_TC001() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC001(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertTrue(gatewaysPage.verifyStatusSearchBox(),"Search Box not avaible");
        Assert.assertTrue(gatewaysPage.verifyStatusAddGatewayButton(),"Add Beacon Button not avaible");
        Assert.assertTrue(gatewaysPage.verifyStatusFilterButton(),"Filter button not avaible");
    }

    @Test(priority = 2, description = "Verify that user can searching when enter valid \"Gateway Name\"")
    public void GatewaysTest_TC002() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC002(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Gateway");
        gatewaysPage.searchGatewayName("Gateway 6","Gateway 6");
    }

    @Test(priority = 3, description = "Verify that system allow user searching with maxlength >20Chars")
    public void GatewaysTest_TC003() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC003(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"testing by QC team 222");
        Assert.assertEquals(gatewaysPage.verifyMaxlenghtSearchBox(),20);
        Assert.assertEquals(gatewaysPage.verifyValueSearchBox(),"testing by QC team 2");
    }

    @Test(priority = 4, description = "Verify system will display popup when user click \"Add Gateway\" button")
    public void GatewaysTest_TC004() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC004(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(gatewaysPage.verifyAddGatewayHeader(),"Add Gateway");
        Assert.assertTrue(gatewaysPage.verifyStatusToggleButton(),"Status Toggle Button is False");
        Assert.assertFalse(gatewaysPage.verifyStatusAddButton(),"Add Button is Avaible");
    }

    @Test(priority = 5, description = "Verify that system will display \"Filter\" popup when user click on button")
    public void GatewaysTest_TC005() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC005(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(gatewaysPage.verifyFilterHeader(),"Filters");
        Assert.assertTrue(gatewaysPage.verifyStatusClearAllButton(),"ClearAll Button Not Avaible");
        Assert.assertTrue(gatewaysPage.verifyStatusApplyButton(),"Apply Button Not Avaible");
    }

    @Test(priority = 6, description = "Verify that user can filter data based on \"Inactive\" status")
    public void GatewaysTest_TC006_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC006_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        gatewaysPage.verifyGatewayInactive("Inactive");
    }

    @Test(priority = 7, description = "Verify that user can filter data based on \"Active\" status")
    public void GatewaysTest_TC006_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC006_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        gatewaysPage.verifyGatewayActive("Active");
    }

    @Test(priority = 8, description = "Verify that system will clear \"Inactive\" data when click on \"Clear all\" button ")
    public void GatewaysTest_TC007_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC007_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        gatewaysPage.verifyStatusTable("Active","Inactive");
    }

    @Test(priority = 9, description = "Verify that system will clear \"Active\" data when click on \"Clear all\" button ")
    public void GatewaysTest_TC007_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC007_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        gatewaysPage.verifyStatusTable("Active","Inactive");
    }

    @Test(priority = 10, description = "Verify that user can sorting Ascending/ Descending for \"Status/BayName/Note\" ")
    public void GatewaysTest_TC008() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC008(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        gatewaysPage.verifySortingGatewayName();
    }

    @Test(priority = 11, description = "Verify system in case the user click on \"Action\" column (For Active status)")
    public void GatewaysTest_TC009_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC009_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC233FC0E2A9");
        Assert.assertEquals(gatewaysPage.verifyEditActionTitle(),"Edit");
        Assert.assertEquals(gatewaysPage.verifySetToInactiveTitle(),"Set to Inactive");
    }

    @Test(priority = 12, description = "Verify system in case the user click on \"Action\" column (For Inactive status)")
    public void GatewaysTest_TC009_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC009_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING123");
        Assert.assertEquals(gatewaysPage.verifyEditActionTitle(),"Edit");
        Assert.assertEquals(gatewaysPage.verifyRemoveActionTitle(),"Remove");
        Assert.assertEquals(gatewaysPage.verifySetToActiveTitle(),"Set to Active");
    }

    @Test(priority = 13, description = "Verify system in case the user click on \"Edit\" icon (For Active status)")
    public void GatewaysTest_TC010_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC010_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC233FC0E2A9");
        Assert.assertEquals(gatewaysPage.verifyEditGatewayTitle(),"Edit Gateway");
    }

    @Test(priority = 14, description = "Verify system in case the user click on \"Edit\" icon (For Inactive status)")
    public void GatewaysTest_TC010_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC010_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING123");
        Assert.assertEquals(gatewaysPage.verifyEditGatewayTitle(),"Edit Gateway");
    }

    @Test(priority = 15, description = "Verify system in case the user click on \"Remove\" icon (For Inactive status)")
    public void GatewaysTest_TC011() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC011(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING123");
        Assert.assertEquals(gatewaysPage.verifyConfirmTitle(),"Confirm");
        Assert.assertEquals(gatewaysPage.verifyConfirmText(),"Are you sure you want to delete this gateway?");
        Assert.assertTrue(gatewaysPage.verifyStatusNoButton(),"No Button Not Avaible");
        Assert.assertTrue(gatewaysPage.verifyStatusYesButton(),"Yes Button Not Avaible");
    }

    @Test(priority = 16, description = "Verify system in case the user click on \"Set to Inactive\" icon")
    public void GatewaysTest_TC012_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC012_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC233FC0E2A9");
        Assert.assertEquals(gatewaysPage.verifyConfirmTitle(),"Confirm");
        Assert.assertEquals(gatewaysPage.verifyConfirmSetInactiveText(),"Are you sure you want to set this gateway to Inactive status?");
        Assert.assertTrue(gatewaysPage.verifyStatusNoButton(),"No Button Not Avaible");
        Assert.assertTrue(gatewaysPage.verifyStatusYesButton(),"Yes Button Not Avaible");
    }

    @Test(priority = 17, description = "Verify system in case the user click on \"Set to Active\" icon")
    public void GatewaysTest_TC012_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC012_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING123");
        Assert.assertEquals(gatewaysPage.verifyConfirmTitle(),"Confirm");
        Assert.assertEquals(gatewaysPage.verifyConfirmSetActiveText(),"Are you sure you want to set this gateway to Active status?");
        Assert.assertTrue(gatewaysPage.verifyStatusNoButton(),"No Button Not Avaible");
        Assert.assertTrue(gatewaysPage.verifyStatusYesButton(),"Yes Button Not Avaible");
    }

    @Test(priority = 18, description = "Verify that the system in case user action with the pagination")
    public void GatewaysTest_TC013() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC013(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(gatewaysPage.verifyTotalGateway(),10);
    }

    @Test(priority = 19, description = "Verify system will display popup when user click \"Add Gateway\" button")
    public void GatewaysTest_TC014() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC014(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertTrue(gatewaysPage.verifyStatusToggleButton(),"Status Toggle Button is Inactive");
    }

    @Test(priority = 20, description = "Verify that the system will be close \"Add Gateway\" screen when the user click on \"Cancel/[X]\" button")
    public void GatewaysTest_TC015() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC015(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertTrue(gatewaysPage.verifyCancelButton(),"Cancel button not avaible");
        validateHelper.clickElement(cancelButton);
    }

    @Test(priority = 21, description = "Verify that the system in case user enter \"Gateway Code\" with max length >12Chars")
    public void GatewaysTest_TC016() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC016(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC233FC0E2A999");
        Assert.assertEquals(gatewaysPage.verifyMaxlengthGatewayCodeTextBox(),12);
        Assert.assertEquals(gatewaysPage.verifyValueGatewayCode(),"AC233FC0E2A9");
    }

    @Test(priority = 22, description = "Verify that the system in case user enter \"Gateway Code\" with max length >12Chars")
    public void GatewaysTest_TC017() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC017(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertTrue(gatewaysPage.verifyGatewayNameTextbox(),"Gateway Name not avaible");
        validateHelper.setText(gatewaynameTextbox,"Gateway Testing");
        Assert.assertTrue(gatewaysPage.verifyNoteTextbox(),"Note textbox not avaible");
        validateHelper.setText(noteTextbox,"Testing by QC team");
    }

    @Test(priority = 23, description = "Verify system in case the user skip input \"Gateway Code\" field ")
    public void GatewaysTest_TC018() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC018(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC233FC0E2A9","Gateway Testing","Testing by QC Team");
        Assert.assertEquals(gatewaysPage.verifyGateCodeRequiredMessage(),"The Gateway Code field is required");
        Assert.assertFalse(gatewaysPage.verifyStatusAddButton(),"Add Button is Avaible");
    }

    @Test(priority = 24, description = "Verify system in case the user enter a duplicated Gateway Code")
    public void GatewaysTest_TC019() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC019(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC233FC0E2A9","Gateway Testing","Testing by QC Team");
        Assert.assertEquals(gatewaysPage.verifyGateCodeExistedMessage(),"Gateway code is already existed. Please try again.");
        Assert.assertFalse(gatewaysPage.verifyStatusAddButton(),"Add Button is Avaible");
    }

    @Test(priority = 25, description = "Verify system in case the user filling all required fields not yet")
    public void GatewaysTest_TC020() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC020(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Gateway Testing","Testing by QC Team");
        Assert.assertFalse(gatewaysPage.verifyStatusAddButton(),"Add Button is Avaible");
    }

    @Test(priority = 26, description = "Verify system in case the user filling all required fields")
    public void GatewaysTest_TC021() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC021(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC233FC0E2A9","Gateway Testing","Testing by QC Team");
        Assert.assertTrue(gatewaysPage.verifyStatusAddButton(),"Add Button Not Avaible");
    }

    @Test(priority = 27, description = "Verify that the user can \"Add\" success a Gateway with Active status")
    public void GatewaysTest_TC022() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC022(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2024","Gateway Testing","Testing by QC Team");
        Assert.assertTrue(gatewaysPage.verifyDisplayNotification(), "The Notification not display");
        Assert.assertEquals(gatewaysPage.verifySuccessText(), "Item has been successfully created");
        Assert.assertEquals(gatewaysPage.verifyAddGatewayActiveSuccess("TESTING2024"),"TESTING2024");
        Assert.assertEquals(gatewaysPage.verifyGatewayStatus(),"Active");
    }

    @Test(priority = 28, description = "Verify that the user can \"Add\" success a Gateway with Inactive status")
    public void GatewaysTest_TC023() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC023(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2025","Gateway Testing","Testing by QC Team");
        Assert.assertTrue(gatewaysPage.verifyDisplayNotification(), "The Notification not display");
        Assert.assertEquals(gatewaysPage.verifySuccessText(), "Item has been successfully created");
        Assert.assertEquals(gatewaysPage.verifyAddGatewayInactiveSuccess("TESTING2025"),"TESTING2025");
        Assert.assertEquals(gatewaysPage.verifyGatewayStatus(),"Inactive");
    }

    @Test(priority = 29, description = "Verify that user can change status of gateway from Active to Inactive")
    public void GatewaysTest_TC024() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC024(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2024");
        Assert.assertEquals(gatewaysPage.verifyGatewayStatus(),"Inactive");
    }

    @Test(priority = 30, description = "Verify that user can change status of gateway from Inactive to Active")
    public void GatewaysTest_TC025() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC025(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2025");
        Assert.assertEquals(gatewaysPage.verifyGatewayStatus(),"Active");
    }

    @Test(priority = 31, description = "Verify that the system will be close \"Edit Gateway\" screen when the user click on \"[X]\" icon")
    public void GatewaysTest_TC026() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC026(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2024");
        Assert.assertTrue(gatewaysPage.verifyCloseIcon(),"Close Icon not avaible");
        validateHelper.clickElement(closeButton);
    }

    @Test(priority = 32, description = "Verify the \"Save\" button in case user doesn't any change regarding to these Gateway’s fields (Active)")
    public void GatewaysTest_TC027() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC027(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2025");
        Assert.assertFalse(gatewaysPage.verifySaveButton(),"Save Button is avaible");
    }

    @Test(priority = 33, description = "Verify the \"Save\" button in case user doesn't any change regarding to these Gateway’s fields (Inactive)")
    public void GatewaysTest_TC028() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC028(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2024");
        Assert.assertFalse(gatewaysPage.verifySaveButton(),"Save Button is avaible");
    }

    @Test(priority = 34, description = "Verify the \"Save\" button will be enabled only if have any change regarding to required fields (Active)")
    public void GatewaysTest_TC029() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC029(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2025","Gateway Testing1","Testing by QC Team1");
        Assert.assertFalse(gatewaysPage.verifyGatewayCodeTextbox(),"Gateway Code Textbox is avaible");
        Assert.assertTrue(gatewaysPage.verifySaveButton(),"Save Button not avaible");
        validateHelper.clickElement(saveButton);
        validateHelper.waitForPageLoaded();
        Assert.assertTrue(gatewaysPage.verifyDisplayNotification(), "The Notification not display");
        Assert.assertEquals(gatewaysPage.verifyUpdatedText(), "Item has been successfully updated");
        Assert.assertEquals(gatewaysPage.verifyGatewayNameValue(),"Gateway Testing1");
        Assert.assertEquals(gatewaysPage.verifyNoteValue(),"Testing by QC Team1");
    }

    @Test(priority = 35, description = "Verify system in case the user skip gateway Code")
    public void GatewaysTest_TC030() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC030(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2024");
        Assert.assertEquals(gatewaysPage.verifyGateCodeRequiredMessage(),"The Gateway Code field is required");
    }

    @Test(priority = 35, description = "Verify system in case the user Enter a duplicated Gateway Code")
    public void GatewaysTest_TC031() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC031(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2024","AC233FC0E2A2");
        Assert.assertEquals(gatewaysPage.verifyGateCodeExistedMessage(),"Gateway code is already existed. Please try again.");
    }

    @Test(priority = 36, description = "Verify that user can \"Set to Inactive\" in case Gateway is not communicating with any beacon")
    public void GatewaysTest_TC032() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC032(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2025");
        Assert.assertTrue(gatewaysPage.verifyDisplayNotification(), "The Notification not display");
        Assert.assertEquals(gatewaysPage.verifyUpdatedText(), "Item has been successfully updated");
        Assert.assertEquals(gatewaysPage.verifyGatewayStatus(),"Inactive");
    }

    @Test(priority = 37, description = "Verify that user can \"Set to Inactive\" in case Gateway is not communicating with any beacon")
    public void GatewaysTest_TC033() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC033(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2024");
        Assert.assertTrue(gatewaysPage.verifyDisplayNotification(), "The Notification not display");
        Assert.assertEquals(gatewaysPage.verifyUpdatedText(), "Item has been successfully updated");
        Assert.assertEquals(gatewaysPage.verifyGatewayStatus(),"Active");
    }

    @Test(priority = 38, description = "Verify that user can remove an existing Gateway")
    public void GatewaysTest_TC034() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        gatewaysPage.GatewaysTab_TC034(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2025");
        Assert.assertEquals(gatewaysPage.verifyConfirmRemoveText(),"Are you sure you want to delete this gateway?");
        validateHelper.clickElement(yesButton);
        validateHelper.waitForPageLoaded();
        Assert.assertTrue(gatewaysPage.verifyDisplayNotification(), "The Notification not display");
        Assert.assertEquals(gatewaysPage.verifyRemoveText(), "Item has been successfully deleted");
        validateHelper.clickElement(searchIcon);
        Assert.assertEquals(gatewaysPage.verifyNoData(),"No data");
    }
}
