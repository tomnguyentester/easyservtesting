package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.CustomerManagement.CustomerDetailsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerDetailsTest extends BaseSetup {
    private WebDriver driver;
    private CustomerDetailsPage customerDetailsPage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        customerDetailsPage = new CustomerDetailsPage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Contact information\" tab _001,_002")
    public void CustomerDetails_TC001() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerDetailsPage.CustomerDetails_TC001(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com");
        Assert.assertEquals(customerDetailsPage.verifyCustomerName(),"tom nguyen");
        Assert.assertEquals(customerDetailsPage.verifycustomerDetailTitle(),"Customer Details");
        Assert.assertEquals(customerDetailsPage.verifyEmailInfo(),"nguyentrungdtu@gmail.com");
        Assert.assertEquals(customerDetailsPage.verifyOtherInforTitle(),"Other Information");
        Assert.assertEquals(customerDetailsPage.verifyCustomerDetailsHeader(),"Customer Details");
        Assert.assertTrue(customerDetailsPage.verifyStatusSaveButton(),"Save Button Not Avaible");
    }

    @Test(priority = 2, description = "Verify validation message for \"Customer Details\" screen in case Max Length required field _004_1")
    public void CustomerDetails_TC002() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerDetailsPage.CustomerDetails_TC002(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com",
                "Testing by Tom Nguyen testttttttttttttttttttttttttt",
                "Testing by Tom Nguyen testttttttttttttttttttttttttt",
                "0909789789090909090909",
                "364 Testing By Tom Nguyen 09090",
                "364 Testing By Tom Nguyen 09090",
                "210",
                "Silicon stack testinggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg",
                "202333333333333333333");
        Assert.assertEquals(customerDetailsPage.verifyFirstNameReqMess(),"Your First Name must not exceed 50 characters.");
        Assert.assertEquals(customerDetailsPage.verifyLastNameReqMess(),"Your Last Name must not exceed 50 characters.");
        Assert.assertEquals(customerDetailsPage.verifyPhoneNumberReqMess(),"Your Phone Number must not exceed 20 characters.");
        Assert.assertEquals(customerDetailsPage.verifyAdress1ReqMess(),"Your Address Line 1 must not exceed 30 characters.");
        Assert.assertEquals(customerDetailsPage.verifyAdress2ReqMess(),"Your Address Line 2 must not exceed 20 characters.");
        Assert.assertEquals(customerDetailsPage.verifyPostCodeReqMess(),"The postCode field must be 4 characters");
        Assert.assertEquals(customerDetailsPage.verifyCompanyReqMess(),"Your Company Name must not exceed 100 characters.");
        Assert.assertEquals(customerDetailsPage.verifyNRMAReqMess(),"Your NRMA Member No. must not exceed 20 characters.");
    }

    @Test(priority = 3, description = "Verify validation message for \"Customer Details\" screen enter invalid for \"PhoneNumber/Postcode _004_2")
    public void CustomerDetails_TC003() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerDetailsPage.CustomerDetails_TC003(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com", "+840909A","test");
        Assert.assertEquals(customerDetailsPage.verifyPhoneInvalidMess(),"Please add valid Mobile Number.");
        Assert.assertEquals(customerDetailsPage.verifyPostCodeInvalidMess(),"No valid post code found.");
    }

    @Test(priority = 4, description = "Verify validation message for \"Customer Details\" screen in case required field is blank _004_3")
    public void CustomerDetails_TC004() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerDetailsPage.CustomerDetails_TC004(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com");
        Assert.assertEquals(customerDetailsPage.verifyFirtNameEmptyMess(),"The First Name field is required");
        Assert.assertEquals(customerDetailsPage.verifyLastNameEmptyMess(),"The Last Name field is required");
        Assert.assertEquals(customerDetailsPage.verifyPhoneEmptyMess(),"The Phone Number field is required");
        Assert.assertEquals(customerDetailsPage.verifyPostCodeEmptyMess(),"The Postcode field is required");
    }

    @Test(priority = 5, description = "Verify the system in case the user enter the Email already exists in system _005")
    public void CustomerDetails_TC005() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerDetailsPage.CustomerDetails_TC005(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com","admin@example.com");
        Assert.assertEquals(customerDetailsPage.verifyEmailExistsMess(),"Email already exists. Please login or use another email to continue.");
    }

    @Test(priority = 6, description = "Verify that the system update success infor when the user edit customer _006")
    public void CustomerDetails_TC006() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerDetailsPage.CustomerDetails_TC006(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com",
                "tom","nguyen","364 Cong Hoa","364 Cong Hoa","2100","SS Team","2023");
        Assert.assertEquals(customerDetailsPage.verifySuccessMessNoti(),"Item has been successfully updated");
    }

    @Test(priority = 7, description = "Verify that the system will clear all changes when user click \"Cancel\" button _007")
    public void CustomerDetails_TC007() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerDetailsPage.CustomerDetails_TC007(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com",
                "Testing","Testing","364 Cong Hoa","364 Cong Hoa","2100","SS Team","2023");
        Assert.assertEquals(customerDetailsPage.verifyFirstNameText(),"tom");
    }

    @Test(priority = 8, description = "Verify that the user cannot switch <Active> button from ON to OFF _010")
    public void CustomerDetails_TC008() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerDetailsPage.CustomerDetails_TC008(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com");
        Assert.assertEquals(customerDetailsPage.verifyActiveMessNoti(),"There's associated upcoming booking. You cannot de-activate this customer.");
    }

    @Test(priority = 9, description = "Verify system in case the user edit Note _014")
    public void CustomerDetails_TC009() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerDetailsPage.CustomerDetails_TC009(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com","Testing by Tom");
        Assert.assertEquals(customerDetailsPage.verifyNoteText(),"Testing by Tom");
    }
}
