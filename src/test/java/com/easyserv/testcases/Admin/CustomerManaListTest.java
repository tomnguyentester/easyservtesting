package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.CustomerManagement.CustomerManaListPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerManaListTest extends BaseSetup {
    private WebDriver driver;
    private CustomerManaListPage customerManaListPage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        customerManaListPage = new CustomerManaListPage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Customer Management List\" tab _001")
    public void CustomerList_TC001() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC001(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(customerManaListPage.verifyCustomerHeader(),"Customer Management");
    }

    @Test(priority = 2, description = "Verify the system in case the user search valid \"Customer Name\" _004")
    public void CustomerList_TC002() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC002(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"Tom Nguyen");
        customerManaListPage.verifySearchCustomerName("Tom Nguyen");
    }

    @Test(priority = 3, description = "Verify the system in case the user enter invalid \"Customer Name\" _005")
    public void CustomerList_TC003() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC003(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"dog");
        Assert.assertEquals(customerManaListPage.verifyNoData(),"No data");
    }

    @Test(priority = 4, description = "Verify that the system will display \"Filter\" popup when the user click on [Filter] button _006")
    public void CustomerList_TC004() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC004(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertTrue(customerManaListPage.verifyFilterStatus(),"Dropdwon not avaible");
        Assert.assertTrue(customerManaListPage.verifyClearButton(),"Clear Button not avaible");
        Assert.assertTrue(customerManaListPage.verifyApplyButton(),"Apply Button not avaible");
    }

    @Test(priority = 5, description = "Verify that the system will data filter success when the user apply filter based on Inactive _007")
    public void CustomerList_TC005_1() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC005_1(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        customerManaListPage.verifyCustomerInactive("Inactive");
    }

    @Test(priority = 6, description = "Verify that the system will data filter success when the user apply filter based on Active _007")
    public void CustomerList_TC005_2() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC005_2(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        customerManaListPage.verifyCustomerActive("Active");
    }

    @Test(priority = 7, description = "Verify that sytem will clear all condition in case the user click on \"Clear all\" button  Inactive _008")
    public void CustomerList_TC006() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC006(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        customerManaListPage.verifyStatusCustomerList("Active","Inactive");
    }

    @Test(priority = 8, description = "Verify sytem in case the user click on \"Clear all\"  button next [Filter] icon _009")
    public void CustomerList_TC007() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC007(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        customerManaListPage.verifyStatusCustomerList("Active","Inactive");
    }

    @Test(priority = 9, description = "Verify that the system in case user action with the pagination _014")
    public void CustomerList_TC008() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC008(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(customerManaListPage.verifyTotalCustomer(),10);
    }

    @Test(priority = 10, description = "Verify system in case user action SMS icon _014")
    public void CustomerList_TC009() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC009(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(customerManaListPage.verifySMSHeader(),"Send SMS");
    }

    @Test(priority = 11, description = "Verify that system will jump to \"Customer Details\" when the user select a customer")
    public void CustomerList_TC010() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerManaListPage.CustomerList_TC010(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1));
        Assert.assertEquals(customerManaListPage.verifyCustomerDetailHeader(),"Customer Details");
    }
}
