package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.FlightDeckSetting.BeaconsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeaconsTest extends BaseSetup {
    private WebDriver driver;
    private BeaconsPage beaconsPage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;

    private By cancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    private By beaconcodeTextbox = By.xpath("//input[@id='form_in_modal_code']");
    private By yesButton = By.xpath("//span[contains(text(),'Yes')]");
    private By saveButton = By.xpath("//button[span='Save']");
    private By searchIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");


    @BeforeTest
    public void setup(){
        driver = getDriver();
        beaconsPage = new BeaconsPage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Beacon\" tab")
    public void BeaconsTest_TC001() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC001(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(beaconsPage.verifyFlightDeckHeader(),"Flight Deck Setting");
        Assert.assertTrue(beaconsPage.verifyStatusSearchBox(),"Search Box not avaible");
        Assert.assertTrue(beaconsPage.verifyStatusAddBeaconButton(),"Add Beacon Button not avaible");
        Assert.assertTrue(beaconsPage.verifyStatusFilterButton(),"Filter button not avaible");
        beaconsPage.totalBeacon();
    }

    @Test(priority = 2, description = "Verify that user can searching when enter valid \"Beacon Code\"")
    public void BeaconsTest_TC002() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC002(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"test");
        beaconsPage.searchBeaconCode("TEST6YESFD","TEST6YESFD");
    }

    @Test(priority = 3, description = "Verify system in case the user searching \"Beacon_Info\" with max length >20Chars")
    public void BeaconsTest_TC003() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC003(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC4353FD545TESTING2023");
        Assert.assertEquals(beaconsPage.verifyMaxlenghtSearchBox(),20);
        Assert.assertEquals(beaconsPage.verifyValueSearchBox(),"AC4353FD545TESTING20");
    }

    @Test(priority = 4, description = "Verify system will display popup when user click \"Add Beacon\" button")
    public void BeaconsTest_TC004() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC004(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(beaconsPage.verifyAddBeaconHeader(),"Add Beacon");
        Assert.assertTrue(beaconsPage.verifyStatusToggleButton(),"Status Toggle Button is False");
        Assert.assertFalse(beaconsPage.verifyStatusAddButton(),"Add Button is Avaible");
    }

    @Test(priority = 5, description = "Verify that system will display \"Filter\" popup when user click on button")
    public void BeaconsTest_TC005() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC005(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(beaconsPage.verifyFilterHeader(),"Filters");
        Assert.assertTrue(beaconsPage.verifyStatusClearAllButton(),"ClearAll Button Not Avaible");
        Assert.assertTrue(beaconsPage.verifyStatusApplyButton(),"Apply Button Not Avaible");
    }

    @Test(priority = 6, description = "Verify that user can filter data based on \"Inactive\" status")
    public void BeaconsTest_TC006_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC006_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        beaconsPage.VerifyBeaconInactive("Inactive");
        Assert.assertEquals(beaconsPage.verifyFilterNumber(),"1");
    }

    @Test(priority = 7, description = "Verify that user can filter data based on \"Active\" status")
    public void BeaconsTest_TC006_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC006_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        beaconsPage.VerifyBeaconActive("Active");
        Assert.assertEquals(beaconsPage.verifyFilterNumber(),"1");
    }

    @Test(priority = 8, description = "Verify that system will clear filter data when click on \"Clear all\" button")
    public void BeaconsTest_TC007_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC007_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        beaconsPage.verifyFilterNumber();
        beaconsPage.VerifyStatusTable("Active","Inactive");
    }

    @Test(priority = 9, description = "Verify that system will clear filter data when click on \"Clear all\" button")
    public void BeaconsTest_TC007_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC007_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        beaconsPage.verifyFilterNumber();
        beaconsPage.VerifyStatusTable("Active","Inactive");
    }

    @Test(priority = 10, description = "Verify that user can sorting Ascending/Descending based on \"Beacon Name\"")
    public void BeaconsTest_TC008() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC008(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        String[] expectedSortBeaconName = {"Akko","Anh","Beacon 1_test","Beacon 2","Beacon 3","Beacon 4"};
        beaconsPage.VerifySortingBeaconName(expectedSortBeaconName);
        //Assert.assertEquals(beaconsPage.beforeSortingBeaconName(),beaconsPage.afterSortingBeaconName());
    }

    @Test(priority = 11, description = "Verify system in case the user click on \"Action\" column (For Inactive status)")
    public void BeaconsTest_TC009_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC009_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"KTEST1");
        Assert.assertTrue(beaconsPage.verifyEditAction(),"Edit Action Not Avaible");
        Assert.assertTrue(beaconsPage.verifyRemoveAction(),"Remove Action Not Avaible");
        Assert.assertTrue(beaconsPage.verifySetToActiveAction(),"Set to Active Not Avaible");
    }

    @Test(priority = 12, description = "Verify system in case the user click on \"Action\" column (For Active status)")
    public void BeaconsTest_TC009_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC009_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC233FE81A05");
        Assert.assertTrue(beaconsPage.verifyEditAction(),"Edit Action Not Avaible");
        Assert.assertTrue(beaconsPage.verifySetToInActiveAction(),"Set to Inactive Not Avaible");
    }

    @Test(priority = 13, description = "Verify system in case the user click on \"Edit\" icon")
    public void BeaconsTest_TC010() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0010(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC233FE81A05");
        Assert.assertEquals(beaconsPage.verifyEditBeaconHeader(),"Edit Beacon");
    }

    @Test(priority = 14, description = "Verify system in case the user click on \"Remove\" icon")
    public void BeaconsTest_TC011() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0011(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"KTEST1");
        Assert.assertEquals(beaconsPage.verifyConfirmRemoveText(),"Are you sure you want to delete this beacon?");
        Assert.assertTrue(beaconsPage.verifyNoButton(),"No button Not Avaible");
        Assert.assertTrue(beaconsPage.verifyYesButton(),"Yes button Not Avaible");
    }

    @Test(priority = 15, description = "Verify system in case the user click on \"Set to Inactive\" icon")
    public void BeaconsTest_TC012() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0012(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"KTEST1");
        Assert.assertEquals(beaconsPage.verifyConfirmSetToActiveText(),"Are you sure you want to set this beacon to Active status?");
        Assert.assertTrue(beaconsPage.verifyNoButton(),"No button Not Avaible");
        Assert.assertTrue(beaconsPage.verifyYesButton(),"Yes button Not Avaible");
    }

    @Test(priority = 16, description = "Verify that the system in case user action with the pagination")
    public void BeaconsTest_TC013() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0013(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(beaconsPage.verifyTotalBeacon(),10);

    }

    @Test(priority = 17, description = "Verify toggle button when user go to \"Add Beacon\" screen")
    public void BeaconsTest_TC014() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0014(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertTrue(beaconsPage.verifyToggleButton(),"Active Toggle defaul is Inactive");
    }

    @Test(priority = 18, description = "Verify Cancel button when user go to \"Add Beacon\" screen")
    public void BeaconsTest_TC015() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0015(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertTrue(beaconsPage.verifyCancelButton(),"Cancel button not avaible");
        validateHelper.clickElement(cancelButton);
    }

    @Test(priority = 19, description = "Verify system in case the user searching \"Beacon_Info\" with max length >12Chars")
    public void BeaconsTest_TC016() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0016(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING20234333");
        Assert.assertEquals(beaconsPage.verifyMaxlengthBeaconTextBox(),12);
        Assert.assertEquals(beaconsPage.verifyValueBeaconCode(),"TESTING20234");
    }

    @Test(priority = 20, description = "Verify system in case the user skip input \"Beacon Code\" field ")
    public void BeaconsTest_TC017() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0017(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING20234333","Beacon Test","TEST2023","Testing");
        Assert.assertEquals(beaconsPage.verifyBeaconCodeRequiredMessage(),"The Beacon Code field is required");
    }

    @Test(priority = 21, description = "Verify the system in case the user enter \"Beacon_Code\" is already existed")
    public void BeaconsTest_TC018() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0018(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"AC233FE819ED","Beacon Test","TEST2023","Testing");
        Assert.assertEquals(beaconsPage.verifyBeaconCodeExistedMessage(),"Beacon code is already existed. Please try again.");
    }

    @Test(priority = 22, description = "Verify the system in case the user enter \"Marker_ID\" is already existed")
    public void BeaconsTest_TC019() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0019(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2023","Beacon Test","1","Testing");
        Assert.assertEquals(beaconsPage.verifyMarkerIdExistedMessage(),"Beacon markerId is already existed. Please try again.");
    }

    @Test(priority = 23, description = "Verify the \"Add\" button in case user not enter required field")
    public void BeaconsTest_TC020() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0020(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Beacon Test","99","1");
        Assert.assertFalse(beaconsPage.verifyStatusAddNewBeaconButton(),"Staus button is Avaible");
        validateHelper.setText(beaconcodeTextbox,"TESTING2023");
        Assert.assertTrue(beaconsPage.verifyStatusAddNewBeaconButton(),"Staus button Not Avaible");
    }

    @Test(priority = 24, description = "Verify that the user can \"Add\" success a beacon")
    public void BeaconsTest_TC021() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0021(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2024","Beacon Testing","24","testing");
        Assert.assertTrue(beaconsPage.verifyDisplayNotification(), "The Notification not display");
        Assert.assertEquals(beaconsPage.verifySuccessText(), "Item has been successfully created");
        Assert.assertEquals(beaconsPage.verifyAddBeaconSuccess("TESTING2024"),"TESTING2024");
    }

    @Test(priority = 25, description = "Verify that the user can Set an active Beacon to Inactive status in case beacon doesn't in-used in any vehicle")
    public void BeaconsTest_TC022() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0022(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2023");
        Assert.assertEquals(beaconsPage.verifyInactiveConfirmMessage(), "Are you sure you want to set this beacon to Inactive status?");
        validateHelper.clickElement(yesButton);
        Assert.assertEquals(beaconsPage.verifyInactiveStatus(),"Inactive");
    }

    @Test(priority = 26, description = "Verify that the user can Set an in-active Beacon back to Active status in case the beacon is now in-used in any vehicle")
    public void BeaconsTest_TC023() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0023(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2023");
        Assert.assertEquals(beaconsPage.verifyActiveConfirmMessage(), "Are you sure you want to set this beacon to Active status?");
        validateHelper.clickElement(yesButton);
        Assert.assertEquals(beaconsPage.verifyActiveStatus(),"Active");
    }

    @Test(priority = 27, description = "Verify that user can set to Inactive for Beacon in “Edit Beacon“ screen")
    public void BeaconsTest_TC024_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0024_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2023");
        Assert.assertEquals(beaconsPage.verifyInactiveStatus(),"Inactive");
    }

    @Test(priority = 28, description = "Verify that user can set to Active for Beacon in “Edit Beacon“ screen")
    public void BeaconsTest_TC024_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0024_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2023");
        Assert.assertEquals(beaconsPage.verifyActiveStatus(),"Active");
    }

    @Test(priority = 29, description = "Verify that the system will be close \"Edit Beacon\" screen when the user click on \"[X]\" icon")
    public void BeaconsTest_TC025() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0025(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2023");
        Assert.assertEquals(beaconsPage.verifyFlightDeckHeader(),"Flight Deck Setting");
    }

    @Test(priority = 30, description = "Verify the \"Save\" button in case user doesn't any change regarding to these Beacon’s fields")
    public void BeaconsTest_TC026() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0026(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2023");
        Assert.assertFalse(beaconsPage.verifyStatusSaveButton(),"Save button is avaible");
    }

    @Test(priority = 31, description = "Verify the \"Save\" button will be enabled only if have any change regarding to these Beacon code")
    public void BeaconsTest_TC027() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0027(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2023","Beacon Testing 4","TESTING20231");
        Assert.assertTrue(beaconsPage.verifyStatusSaveButton(),"Save button Not Avaible");
        validateHelper.clickElement(saveButton);
        Assert.assertTrue(beaconsPage.verifyDisplayNotification(), "The Notification not display");
        Assert.assertEquals(beaconsPage.verifyUpdatedText(), "Item has been successfully updated");
    }

    @Test(priority = 32, description = "Verify the \"Save\" button will be enabled only if have any change regarding to these Beacon code")
    public void BeaconsTest_TC028() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0028(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2023","AC233FE81A09","3");
        Assert.assertEquals(beaconsPage.verifyBeaconCodeExistedMessage(),"Beacon code is already existed. Please try again.");
        Assert.assertEquals(beaconsPage.verifyMarkerIdExistedMessage(),"Beacon markerId is already existed. Please try again.");
    }

    @Test(priority = 33, description = "Verify that user can remove an existing Beacon")
    public void BeaconsTest_TC029() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        beaconsPage.BeaconsTab_TC0029(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"TESTING2024");
        Assert.assertEquals(beaconsPage.verifyConfirmRemoveText(),"Are you sure you want to delete this beacon?");
        validateHelper.clickElement(yesButton);
        Assert.assertTrue(beaconsPage.verifyDisplayNotification(), "The Notification not display");
        Assert.assertEquals(beaconsPage.verifyRemoveText(), "Item has been successfully deleted");
        validateHelper.clickElement(searchIcon);
        Assert.assertEquals(beaconsPage.verifyNoData(),"No data");
    }
}
