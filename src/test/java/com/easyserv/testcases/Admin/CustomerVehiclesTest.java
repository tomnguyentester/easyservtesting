package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.CustomerManagement.CustomerVehiclesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerVehiclesTest extends BaseSetup {
    private WebDriver driver;
    private CustomerVehiclesPage customerVehiclesPage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;
    private By yesButton = By.xpath("//span[normalize-space()='Yes']");


    @BeforeClass
    public void setup(){
        driver = getDriver();
        customerVehiclesPage = new CustomerVehiclesPage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Vehicles\" tab _001,_002")
    public void CustomerVehicle_TC001() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerVehiclesPage.CustomerVehicle_TC001(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com");
        Assert.assertEquals(customerVehiclesPage.verifyVehiclesHeader(),"Vehicles");
        Assert.assertTrue(customerVehiclesPage.verifyStatusSerachBox(),"Search Box Not Avaible");
        Assert.assertEquals(customerVehiclesPage.verifyStatusColumn(),"Status");
        Assert.assertEquals(customerVehiclesPage.verifyRegoColumn(),"Rego");
        Assert.assertEquals(customerVehiclesPage.verifyVehicleColumn(),"Vehicle");
        Assert.assertEquals(customerVehiclesPage.verifyUpcomingBookingColumn(),"Upcoming Booking");
        Assert.assertEquals(customerVehiclesPage.verifyLastBookingColumn(),"Last Booking");
        Assert.assertEquals(customerVehiclesPage.verifyTotalBookingsColumn(),"Total Bookings");
        Assert.assertEquals(customerVehiclesPage.verifyActionColumn(),"Action");
    }

    @Test(priority = 2, description = "Verify the system in case the user search with value valid \"Rego\",_003")
    public void CustomerVehicle_TC002() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerVehiclesPage.CustomerVehicle_TC002(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com","123456");
        Assert.assertEquals(customerVehiclesPage.verifyRegoResult(),"123456");
    }

    @Test(priority = 3, description = "Verify the system in case the user search with value invalid \"Rego\",_004")
    public void CustomerVehicle_TC003() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerVehiclesPage.CustomerVehicle_TC002(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com","testing");
        Assert.assertEquals(customerVehiclesPage.vefiryNodata(),"No data");
    }

    @Test(priority = 4, description = "Verify system in case the user choose Deactivate vehicle _004")
    public void CustomerVehicle_TC004() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        customerVehiclesPage.CustomerVehicle_TC004(excelHelpers.getCellData("username",1), excelHelpers.getCellData("password",1),"nguyentrungdtu@gmail.com","123456");
        Assert.assertEquals(customerVehiclesPage.verifyConfirmTitle(),"Confirm");
        Assert.assertEquals(customerVehiclesPage.verifyConfirmText(),"Are you sure you want to deactivate this vehicle?");
        Assert.assertTrue(customerVehiclesPage.verifyStausYesButton(),"Yes Button Not Avaible");
        Assert.assertTrue(customerVehiclesPage.verifyStausNoButton(),"No Button Not Avaible");
        validateHelper.clickElement(yesButton);
        Assert.assertEquals(customerVehiclesPage.vefiryNotiMess(),"A Booked In booking is current associated to this Customer. You cannot deactivate it.");

    }
}
