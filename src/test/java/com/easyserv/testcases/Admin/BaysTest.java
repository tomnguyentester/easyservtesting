package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.FlightDeckSetting.BaysPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaysTest extends BaseSetup {
    private WebDriver driver;
    private BaysPage baysPage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;
    private By cancelButton = By.xpath("//span[contains(text(),'Cancel')]");

    @BeforeTest
    public void setup(){
        driver = getDriver();
        baysPage = new BaysPage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Bays\" tab")
    public void BayTest_TC001() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC001(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertTrue(baysPage.verifyStatusSearchBox(),"Search Box not avaible");
        Assert.assertTrue(baysPage.verifyStatusAddBayButton(),"Add Bay Button not avaible");
        Assert.assertTrue(baysPage.verifyStatusFilterButton(),"Filter button not avaible");
    }

    @Test(priority = 2, description = "Verify that user can searching when enter valid \"Bay Name\"",enabled = true)
    public void BayTest_TC002() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC002(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Pick Up 1");
        baysPage.verifySearchBayName("Pick Up 1");
    }

    @Test(priority = 3, description = "Verify that system allow user searching with maxlength >20Chars")
    public void BayTest_TC003() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC003(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"testing by QC team 233");
        Assert.assertEquals(baysPage.verifyMaxlenghtSearchBox(),20);
        Assert.assertEquals(baysPage.verifyValueSearchBox(),"testing by QC team 2");
    }

    @Test(priority = 4, description = "Verify system will display popup when user click \"Add Bay\" button")
    public void BayTest_TC004() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC004(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(baysPage.verifyAddBayHeader(),"Add Bay");
        Assert.assertTrue(baysPage.verifyStatusToggleButton(),"Status Toggle Button is False");
        Assert.assertFalse(baysPage.verifyStatusAddButton(),"Add Button is Avaible");
    }

    @Test(priority = 5, description = "Verify that system will display \"Filter\" popup when user click on button")
    public void BayTest_TC005() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC005(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(baysPage.verifyFilterHeader(),"Filters");
        Assert.assertTrue(baysPage.verifyStatusClearAllButton(),"ClearAll Button Not Avaible");
        Assert.assertTrue(baysPage.verifyStatusApplyButton(),"Apply Button Not Avaible");
    }

    @Test(priority = 6, description = "Verify that user can filter data based on \"Inactive\" status")
    public void BayTest_TC006_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC006_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        baysPage.verifyBayInactive("Inactive");
    }

    @Test(priority = 7, description = "Verify that user can filter data based on \"Inactive\" status")
    public void BayTest_TC006_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC006_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        baysPage.verifyBayActive("Active");
    }

    @Test(priority = 8, description = "Verify that system will clear \"Inactive\" data when click on \"Clear all\" button ")
    public void BayTest_TC007_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC007_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        baysPage.verifyStatusTable("Active","Inactive");
    }

    @Test(priority = 9, description = "Verify that system will clear \"Active\" data when click on \"Clear all\" button ")
    public void BayTest_TC007_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC007_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        baysPage.verifyStatusTable("Active","Inactive");
    }

    @Test(priority = 10, description = "Verify that user can sorting Ascending/ Descending for \"Status/BayName/Note\"")
    public void BayTest_TC008() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC008(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        String[] expectedSortBayName = {"Bay 1", "Bay 10", "Bay 11", "Bay 13",
                "Bay 14", "Bay 15", "Bay 16", "Bay 3", "Bay 4", "Bay 5", "Bay 6", "Bay 7", "Bay 8", "Bay 9","Bay test"};
        baysPage.verifySortingBayName(expectedSortBayName);
    }

    @Test(priority = 11, description = "erify system in case the user click on \"Action\" column (For Active status)")
    public void BayTest_TC009_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC009_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Pick Up 1");
        Assert.assertEquals(baysPage.verifyEditActionTitle(),"Edit");
        Assert.assertEquals(baysPage.verifySetToInactiveTitle(),"Set to Inactive");
    }

    @Test(priority = 12, description = "erify system in case the user click on \"Action\" column (For Inactive status)")
    public void BayTest_TC009_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC009_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Bay 4");
        Assert.assertEquals(baysPage.verifyEditActionTitle(),"Edit");
        Assert.assertEquals(baysPage.verifyRemoveActionTitle(),"Remove");
        Assert.assertEquals(baysPage.verifySetToActiveTitle(),"Set to Active");
    }

    @Test(priority = 13, description = "Verify system in case the user click on \"Edit\" icon (For Active status)")
    public void BayTest_TC010_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC010_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Pick Up 1");
        Assert.assertEquals(baysPage.verifyEditBayTitle(),"Edit Bay");
    }

    @Test(priority = 14, description = "Verify system in case the user click on \"Edit\" icon (For Inactive status)")
    public void BayTest_TC010_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC010_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Bay 4");
        Assert.assertEquals(baysPage.verifyEditBayTitle(),"Edit Bay");
    }

    @Test(priority = 15, description = "Verify system in case the user click on \"Remove\" icon")
    public void BayTest_TC011() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC011(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Bay 4");
        Assert.assertEquals(baysPage.verifyConfirmTitle(),"Confirm");
        Assert.assertEquals(baysPage.verifyConfirmText(),"Are you sure you want to delete this bay?");
        Assert.assertTrue(baysPage.verifyStatusNoButton(),"No Button Not Avaible");
        Assert.assertTrue(baysPage.verifyStatusYesButton(),"Yes Button Not Avaible");
    }

    @Test(priority = 16, description = "Verify system in case the user click on \"Set to Inactive\" icon")
    public void BayTest_TC012_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC012_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Pick Up 1");
        Assert.assertEquals(baysPage.verifyConfirmTitle(),"Confirm");
        Assert.assertEquals(baysPage.verifyConfirmSetInactiveText(),"Are you sure you want to set this bay to Inactive status?");
        Assert.assertTrue(baysPage.verifyStatusNoButton(),"No Button Not Avaible");
        Assert.assertTrue(baysPage.verifyStatusYesButton(),"Yes Button Not Avaible");
    }

    @Test(priority = 17, description = "Verify system in case the user click on \"Set to Active\" icon")
    public void BayTest_TC012_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC012_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Bay 4");
        Assert.assertEquals(baysPage.verifyConfirmTitle(),"Confirm");
        Assert.assertEquals(baysPage.verifyConfirmSetActiveText(),"Are you sure you want to set this bay to Active status?");
        Assert.assertTrue(baysPage.verifyStatusNoButton(),"No Button Not Avaible");
        Assert.assertTrue(baysPage.verifyStatusYesButton(),"Yes Button Not Avaible");
    }

    @Test(priority = 18, description = "Verify that the system in case user action with the pagination")
    public void BayTest_TC013() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC013(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(baysPage.verifyTotalBay(),10);
    }

    @Test(priority = 19, description = "Verify toggle Active button when user go to \"Add Bay\" screen")
    public void BayTest_TC014() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC014(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertTrue(baysPage.verifyStatusToggleButton(),"Status Toggle Button is False");
    }

    @Test(priority = 20, description = "Verify that the system will be close \"Add Bay\" screen when the user click on \"Cancel\" button")
    public void BayTest_TC015() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC015(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertTrue(baysPage.verifyCancelButton(),"Cancel Button Not Avaible");
        validateHelper.clickElement(cancelButton);
    }

    @Test(priority = 21, description = "Verify that the system in case user enter \"Bay Name\" with max length >100Chars")
    public void BayTest_TC016() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC016(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1), "testing by tom");
        Assert.assertEquals(baysPage.verifyMaxlengthBayNameTextBox(),100);
        Assert.assertEquals(baysPage.verifyValueBayName(),"testing by tom");
    }

    @Test(priority = 22, description = "Verify that the user can choose any \"Service Progress\" from dropdown list")
    public void BayTest_TC017_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC017_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(baysPage.verifyServicingDrop(),"Servicing");
    }

    @Test(priority = 23, description = "Verify List \"Service Progress\" from dropdown list")
    public void BayTest_TC017_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC017_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        //String[] expectedSerProg = {"Checked In","Servicing","Tyres/ Wheel Servicing","Washing","Ready For Pick Up","Picked Up"};
        baysPage.verifyListServiceProgress();
    }

    @Test(priority = 24, description = "Verify that \"Assign Gateway\" list box will show list  \"Active\" gateway with Formatted as {Gateway Name}")
    public void BayTest_TC018() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC018(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(baysPage.verifyGateNameLabel(),"Gateway 1");
    }

    @Test(priority = 25, description = "Verify system in case the user Skip filling Bay Name field ")
    public void BayTest_TC019() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC019(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Testing");
        Assert.assertEquals(baysPage.verifyBayNameRequiredMess(),"The Bay Name field is required");
    }

    @Test(priority = 26, description = "Verify system in case the user Skip filling \"Assign Gateway\" field ")
    public void BayTest_TC020() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC020(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Testing23","testing23");
        Assert.assertEquals(baysPage.verifyBayName_23(),"Testing23");
    }

    @Test(priority = 27, description = "Verify system in case enter a duplicated Bay Name")
    public void BayTest_TC021() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC021(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Testing23","testing23");
        Assert.assertEquals(baysPage.verifyBayNameDuplicateMess(),"Bay name is already existed. Please try again.");
    }


    @Test(priority = 28, description = "Verify system in case the user filling all required fields not yet")
    public void BayTest_TC022() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC022(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Testing23");
        Assert.assertFalse(baysPage.verifyAddButton(),"Add Button is avaible");
    }

    @Test(priority = 29, description = "Verify system in case the user filling all required fields")
    public void BayTest_TC023() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC023(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Testing23","testing23");
        Assert.assertTrue(baysPage.verifyAddButton(),"Add Button is not avaible");
    }

    @Test(priority = 30, description = "Verify that the user can \"Add\" success a Bay with Default is Active status.")
    public void BayTest_TC024() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        baysPage.BaysTab_TC024(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Testing24","testing24");
        Assert.assertEquals(baysPage.verifyBayName_24(),"Testing24");
        Assert.assertEquals(baysPage.verifyActiveStatus(),"Active");
    }
}
