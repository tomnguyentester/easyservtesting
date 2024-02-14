package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.CustomerManagement.CustomerBookingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerBookingTest extends BaseSetup {
    private WebDriver driver;
    private CustomerBookingPage customerBookingPage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;
    private By bookDateTime = By.xpath("//span[normalize-space()='Booking Date & Time']");

    @BeforeClass
    public void setup(){
        driver = getDriver();
        customerBookingPage = new CustomerBookingPage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Booking\" tab _001,_002")
    public void CustomerBookings_TC001() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerBookingPage.CustomerBooking_TC001(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com");
        Assert.assertEquals(customerBookingPage.verifyBookingsHeader(),"Bookings");
        Assert.assertEquals(customerBookingPage.verifyDateTimeTitleColumn(),"Booking Date & Time");
        Assert.assertEquals(customerBookingPage.verifyBooKNoTitleColumn(),"Booking No.");
        Assert.assertEquals(customerBookingPage.verifyBooKTypeTitleColumn(),"Booking Type");
        Assert.assertEquals(customerBookingPage.verifyRegoTitleColumn(),"Rego");
        Assert.assertEquals(customerBookingPage.verifyVehicleTitleColumn(),"Vehicle");
        Assert.assertEquals(customerBookingPage.verifyStatusTitleColumn(),"Status");
        Assert.assertEquals(customerBookingPage.verifyActionTitleColumn(),"Action");
    }

    @Test(priority = 2, description = "Verify the system in case the user search with value valid \"Booking No.\" _003")
    public void CustomerBookings_TC002() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerBookingPage.CustomerBooking_TC002(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com","3397");
        customerBookingPage.searchBookingNo("3397","3397");
    }

    @Test(priority = 3, description = "Verify the system in case the user search value invalid _004")
    public void CustomerBookings_TC003() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerBookingPage.CustomerBooking_TC003(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com","cat");
        Assert.assertEquals(customerBookingPage.verifyNodata(),"No data");
    }

    @Test(priority = 4, description = "Verify that the system will display \"Filter\" popup when the user click on [Filter] button _005")
    public void CustomerBookings_TC004() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerBookingPage.CustomerBooking_TC004(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com");
        String[] expectedStatus = {"All Status", "Booked In", "Checked In", "Completed", "Cancelled"};
        customerBookingPage.verifyListBookingStatus(expectedStatus);
        Assert.assertTrue(customerBookingPage.verifyStatusApplyButton(),"Apply Button Not Avaible");
    }
    @Test(priority = 5, description = "Verify that the system will data filter success when the user apply filter based on criteria: Booked In _006")
    public void CustomerBookings_TC005() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerBookingPage.CustomerBooking_TC005(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com");
        customerBookingPage.verifyBookedInStatus("Booked In");
    }

    @Test(priority = 6, description = "Verify that the system will data filter success when the user apply filter based on criteria: Checked In _006")
    public void CustomerBookings_TC006() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerBookingPage.CustomerBooking_TC006(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com");
        customerBookingPage.verifyBookedInStatus("Checked In");
    }

    @Test(priority = 7, description = "Verify that sytem will clear all condition in case the user click on \"Clear all\" button _007")
    public void CustomerBookings_TC007() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerBookingPage.CustomerBooking_TC007(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com");
        customerBookingPage.verifyStatusTable("Booked In","Checked In","Completed","Cancelled");
        validateHelper.clickElement(bookDateTime);
        customerBookingPage.verifyStatusTable("Booked In","Checked In","Completed","Cancelled");
        validateHelper.clickElement(bookDateTime);
        customerBookingPage.verifyStatusTable("Booked In","Checked In","Completed","Cancelled");
        validateHelper.clickElement(bookDateTime);
        customerBookingPage.verifyStatusTable("Booked In","Checked In","Completed","Cancelled");
    }

    @Test(priority = 8, description = "Verify sytem in case the user click on \"Clear all\"  button next [Filter] icon _008")
    public void CustomerBookings_TC008() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerBookingPage.CustomerBooking_TC008(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com");
        customerBookingPage.verifyStatusTable("Booked In","Checked In","Completed","Cancelled");
        validateHelper.clickElement(bookDateTime);
        customerBookingPage.verifyStatusTable("Booked In","Checked In","Completed","Cancelled");
        validateHelper.clickElement(bookDateTime);
        customerBookingPage.verifyStatusTable("Booked In","Checked In","Completed","Cancelled");
        validateHelper.clickElement(bookDateTime);
        customerBookingPage.verifyStatusTable("Booked In","Checked In","Completed","Cancelled");
    }

    @Test(priority = 9, description = "Verify that sytem will change booking status success _010")
    public void CustomerBookings_TC009() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerBookingPage.CustomerBooking_TC009(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com","2981");
        Assert.assertEquals(customerBookingPage.vefirySuccessMess(),"Item has been successfully updated");
    }
    @Test(priority = 10, description = "Verify that system will jump to \"Booking Details\" when the user select a booking ID _011")
    public void CustomerBookings_TC010() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerBookingPage.CustomerBooking_TC010(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com","2981");
        Assert.assertEquals(customerBookingPage.BookingDetailHeader(),"Booking Details");
    }
}
