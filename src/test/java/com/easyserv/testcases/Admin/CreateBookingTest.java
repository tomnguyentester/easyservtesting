package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.BookingManagement.CreateBookingPage;
import com.easyserv.utilities.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateBookingTest extends BaseSetup {
    private WebDriver driver;
    private CreateBookingPage createBookingPage;
    private PropertiesFile propertiesFile;
    private ExcelHelpers excelHelpers;

    @BeforeTest
    public void setup(){
        driver = getDriver();
        createBookingPage = new CreateBookingPage(driver);
        propertiesFile = new PropertiesFile();
        excelHelpers = new ExcelHelpers();
    }

    @Test(priority = 1, description = "Verify the system will jump to “New Booking“ page when user click on \"New Booking\" button")
    public void CreateBookingTest_TC001() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        createBookingPage.CreateBooking_TC001(excelHelpers.getCellData("username",1),excelHelpers.getCellData("password",1) );
        Assert.assertEquals(createBookingPage.verifyNewBookingHeader(),"New Booking");
        Assert.assertEquals(createBookingPage.verifyBookingDetailTab(),"Booking Details");
        Assert.assertEquals(createBookingPage.verifySelectCustomerTitle(),"Select Customer");
        Assert.assertTrue(createBookingPage.verifyCancelButton(),"Cancel Button Not Avaible");
        Assert.assertFalse(createBookingPage.verifyNextButton(),"Next button avaible");
    }

    @Test(priority = 2, description = "Verify validation message for \"searchbox\" in case blank field")
    public void CreateBookingTest_TC002() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        createBookingPage.CreateBooking_TC002(excelHelpers.getCellData("username",1),excelHelpers.getCellData("password",1) );
        Assert.assertEquals(createBookingPage.verifyValidationMessageSearchbox1(),"You must enter data to search");
    }

    @Test(priority = 3, description = "Verify validation message for \"Searchbox\" in case input more than 50char")
    public void CreateBookingTest_TC003() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        createBookingPage.CreateBooking_TC003(excelHelpers.getCellData("username",1),excelHelpers.getCellData("password",1),"testing testing testing testing testing testing testing testing testing testing testing testing testing testing" );
        Assert.assertEquals(createBookingPage.verifyValidationMessageSearchbox2(),"Your Input must not exceed 100 characters.");
    }

    @Test(priority = 4, description = "Verify that system will be display list customer pop-up in case the user enter valid data")
    public void CreateBookingTest_TC004() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        createBookingPage.CreateBooking_TC004(excelHelpers.getCellData("username",1),excelHelpers.getCellData("password",1),"Tom Nguyen" );
        Assert.assertEquals(createBookingPage.checkCustomerFromDrop("Tom Nguyen"),"Tom Nguyen");
        Assert.assertEquals(createBookingPage.verifyAddNewCustomerText(),"Add New Customer");
    }

    @Test(priority = 5, description = "Verify that system doesn't display result in case the user enter valid data")
    public void CreateBookingTest_TC005() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        createBookingPage.CreateBooking_TC005(excelHelpers.getCellData("username",1),excelHelpers.getCellData("password",1),"love dog" );
        Assert.assertEquals(createBookingPage.verifyCustomerEmpty(),"No data");
    }

    @Test(priority = 6, description = "Verify that system display success the \"Customer and Vehicle\" section")
    public void CreateBookingTest_TC006() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        createBookingPage.CreateBooking_TC006(excelHelpers.getCellData("username",1),excelHelpers.getCellData("password",1),"Tom Nguyen" );
        createBookingPage.selectcustomerFromDrop("576");
        Assert.assertEquals(createBookingPage.verifyCustomerNameSection(),"tom nguyen");
        Assert.assertEquals(createBookingPage.verifyVehicleNumberSection(),"576");
    }

    @Test(priority = 7, description = "Verify validation message for \"Add New Customer\" screen in case the all field is blank")
    public void AddNewCustomerTest_TC007() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        createBookingPage.AddNewCustomer_TC007(excelHelpers.getCellData("username",1),excelHelpers.getCellData("password",1),"Tom Nguyen" );
        Assert.assertEquals(createBookingPage.verifyAddNewCusHeader(),"Add New Customer");
        Assert.assertEquals(createBookingPage.validationmessFirstName(),"The First Name field is required");
        Assert.assertEquals(createBookingPage.validationmessLastName(),"The Last Name field is required");
        Assert.assertEquals(createBookingPage.validationmessPhoneNumber(),"The Phone Number field is required");
        Assert.assertEquals(createBookingPage.validationmessPostCode(),"The Postcode field is required");
        Assert.assertEquals(createBookingPage.validationmessSuburb(),"The suburb field is required");
    }

//    @Test(priority = 8, description = "Verify validation message for \"Add New Customer\" screen in case the all field is blank")
//    public void AddNewCustomerTest_TC008() throws Exception{
//        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
//        createBookingPage.AddNewCustomer_TC008(excelHelpers.getCellData("username",1),excelHelpers.getCellData("password",1),"Tom Nguyen","2100");
//        createBookingPage.checkPostCodeFromDrop("Oxford Falls");
//
//    }
}
