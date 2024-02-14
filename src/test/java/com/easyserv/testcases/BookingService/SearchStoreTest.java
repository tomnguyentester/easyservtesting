package com.easyserv.testcases.BookingService;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.BookingServicePage.CustomerNotAccess.SearchStorePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchStoreTest extends BaseSetup {
    private WebDriver driver;
    private SearchStorePage searchStorePage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        searchStorePage = new SearchStorePage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Booking Service Home\" page _001")
    public void SearchStoreTest_TC001() throws Exception{
        searchStorePage.SearchStore_TC001();
    }

    @Test(priority = 2, description = "Verify UI for \"Search Store\" popup _002,_007")
    public void SearchStoreTest_TC002() throws Exception{
        searchStorePage.SearchStore_TC002();
        Assert.assertEquals(searchStorePage.verifyEnterSubPlaceholder(),"Enter Suburb or Postcode");
        Assert.assertTrue(searchStorePage.verifySearchButton(),"Search Button Not Avaible");
        Assert.assertTrue(searchStorePage.verifyStatusUseLocationButton(),"Use Location Button Not Avaible");
        Assert.assertTrue(searchStorePage.verifyStatusViewAllButton(),"View All Button Not Avaible");
    }

    @Test(priority = 3, description = "Verify that user can search store when user Enter \"Suburb\" _010")
    public void SearchStoreTest_TC003() throws Exception{
        searchStorePage.SearchStore_TC003("Gladesville");
        searchStorePage.verifySearchStore("Gladesville");
    }

    @Test(priority = 4, description = "Verify that system will show all Store when user click on \"View all stores\" button _013")
    public void SearchStoreTest_TC004() throws Exception{
        searchStorePage.SearchStore_TC004("Kotara");
        searchStorePage.getListStore();
        searchStorePage.verifySearchStore("Kotara");
    }

    @Test(priority = 5, description = "Verify that system will show all Store when user click on \"Use Current Location\" button _013")
    public void SearchStoreTest_TC005() throws Exception{
        searchStorePage.SearchStore_TC005("Liverpool");
        searchStorePage.getListStore();
        searchStorePage.verifySearchStore("Liverpool");
    }

    @Test(priority = 6, description = "Verify that user will be change store is success when choose store from dropdownlist _011")
    public void SearchStoreTest_TC006() throws Exception{
        searchStorePage.SearchStore_TC006("Artarmon");
        Assert.assertEquals(searchStorePage.verifyStoreName(),"Artarmon");
    }
}
