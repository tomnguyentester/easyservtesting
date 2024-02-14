package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.BookingManagement.BookingListPage;
import com.easyserv.utilities.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingListTest extends BaseSetup {
    private WebDriver driver;
    private BookingListPage bookingListPage;
    private ValidateHelper validateHelper;
    private PropertiesFile propertiesFile;
    private ExcelHelpers excelHelpers;
    String urlPage = "https://osb-admin.siliconstack.com.au/login";

    @BeforeTest
    public void setUp() {
        driver = getDriver();
        bookingListPage = new BookingListPage(driver);
        excelHelpers = new ExcelHelpers();
        propertiesFile = new PropertiesFile();
    }

    @Test(priority = 1)
    public void BookingListTest_TC001(){
        bookingListPage.BookingList_TC001("admin@example.com","12345678");
        Assert.assertEquals(bookingListPage.verifyBookingManaTitle(), "Booking Management");
        Assert.assertTrue(bookingListPage.verifyNewBookingButton(), "New_Booking button not avaible");
        Assert.assertTrue(bookingListPage.verifySearchBox(), "Searchbox button not avaible");
        Assert.assertTrue(bookingListPage.verifyFilterButton(), "Filter button not avaible");
    }

    @Test(priority = 2)
    public void BookingListTest_TC002() throws Exception {
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx","Sheet1");
        bookingListPage.BookingList_TC002(excelHelpers.getCellData("username",1),excelHelpers.getCellData("password",1),"15");
        Assert.assertEquals(bookingListPage.verifyBookIdInTable(15), 15);
    }

    @Test(priority = 3)
    public void BookingListTest_TC003() throws Exception {
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx", "Sheet1");
        bookingListPage.BookingList_TC003(excelHelpers.getCellData("username", 1), excelHelpers.getCellData("password", 1), "4545");
        Assert.assertEquals(bookingListPage.verifyBookIdNotExits(), "No data");
    }

    @Test(priority = 4)
    public void BookingListTest_TC004() throws Exception {
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx", "Sheet1");
        bookingListPage.BookingList_TC004(excelHelpers.getCellData("username", 1), excelHelpers.getCellData("password", 1));
        Assert.assertEquals(bookingListPage.verifyFilterTitle(), "Filters");
        Assert.assertTrue(bookingListPage.verifyClearAllButton(),"Clear All button not avaible");
        Assert.assertTrue(bookingListPage.verifyApplyButton(),"Apply button not avaible");
    }

    @Test(priority = 5)
    public void BookingListTest_TC005() throws Exception {
        PropertiesFile.setPropertiesFile();
        bookingListPage.BookingList_TC005(PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("password"),"08/12/2022","31/12/2022");
        Assert.assertEquals(bookingListPage.verifyFilterTitle(), "Filters");
        Assert.assertEquals(bookingListPage.verifyFilterNumber(),"2");
    }

    @Test(priority = 6)
    public void BookingListTest_TC006() throws Exception {
        PropertiesFile.setPropertiesFile();
        bookingListPage.BookingList_TC006(PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("password"),"08/12/2022","31/12/2022");
        Assert.assertEquals(bookingListPage.verifyFilterNumberEmpty(),"0");
    }

    @Test(priority = 7)
    public void BookingListTest_TC007_1() throws Exception {
        PropertiesFile.setPropertiesFile();
        bookingListPage.BookingList_TC007_1(PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("password"));
        Assert.assertEquals(bookingListPage.verifyTotalRowPage(),10);
    }

    @Test(priority = 8)
    public void BookingListTest_TC007_2() throws Exception {
        PropertiesFile.setPropertiesFile();
        bookingListPage.BookingList_TC007_2(PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("password"));
        Assert.assertEquals(bookingListPage.verifyTotalRowPage(),15);
    }

    @Test(priority = 9)
    public void BookingListTest_TC007_3() throws Exception{
        PropertiesFile.setPropertiesFile();
        bookingListPage.BookingList_TC007_3(PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("password"));
        Assert.assertEquals(bookingListPage.verifyTotalRowPage(),30);
    }

    @Test(priority = 10)
    public void BookingListTest_TC008() throws Exception{
        PropertiesFile.setPropertiesFile();
        bookingListPage.BookingList_TC008(PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("password"),"55");
        Assert.assertEquals(bookingListPage.verifyStatusBooking(),"Checked In");
        Assert.assertEquals(bookingListPage.verifyMessageStatus(),"Item has been successfully updated");
    }

    @Test(priority = 11)
    public void BookingListTest_TC009() throws Exception{
        PropertiesFile.setPropertiesFile();
        bookingListPage.BookingList_TC009(PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("password"));
        Assert.assertTrue(bookingListPage.verifyStatusOfPreviousButton(),"Previous Button Not Avaible");
        Assert.assertTrue(bookingListPage.verifyStatusofNextButton(),"Next Button Not Avaible");
    }

    @Test(priority = 12)
    public void BookingListTest_TC010_1() throws Exception{
        PropertiesFile.setPropertiesFile();
        bookingListPage.BookingList_TC010_1(PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("password"));
        Assert.assertFalse(bookingListPage.verifyStatusOfPreviousButton(),"Previous button is Avaible");
    }

    @Test(priority = 13)
    public void BookingListTest_TC010_2() throws Exception{
        PropertiesFile.setPropertiesFile();
        bookingListPage.BookingList_TC010_2(PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("password"));
        Assert.assertFalse(bookingListPage.verifyStatusofNextButton(),"Next button is Avaible");
    }
}
