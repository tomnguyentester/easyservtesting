package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.EasyEngine.DataLogin;
import com.easyserv.dataprovider.EasyServ.DataLoginMoto;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.CustomerManagement.CustomerManaListPage;
import com.easyserv.pages.AdminPortalPages.UserManagement.UserManaListPage;
import com.easyserv.pages.EasyservEnginePages.AddNewUserPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserManaListTest extends BaseSetup {
    private WebDriver driver;
    private UserManaListPage userManaListPage;
    private ValidateHelper validateHelper;

    @BeforeClass
    public void setup() {
        driver = getDriver();
        userManaListPage = new UserManaListPage(driver);
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"User Management list\" screen  _001,_002", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC001(String email, String password) {
        userManaListPage.UserManaList_TC001(email,password);
        Assert.assertEquals(userManaListPage.verifyUserManaHeader(),"User Management");
        Assert.assertTrue(userManaListPage.verifyStatusAddUserButton());
        Assert.assertTrue(userManaListPage.verifyStatusSearchBox());
        Assert.assertEquals(userManaListPage.verifyStatusTitle(),"Status");
        Assert.assertEquals(userManaListPage.verifyNameTitle(),"Name");
    }

    @Test(priority = 2, description = "Verify the system in case the user search with value valid \"Name\",_003", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC002(String email, String password) {
        userManaListPage.UserManaList_TC002(email,password,"Administrator Mr. A");
        Assert.assertEquals(userManaListPage.verifyNameColumn(),"Administrator Mr. A");
        Assert.assertEquals(userManaListPage.verifyPhoneColumn(),"03 6983 3983");
    }

    @Test(priority = 3, description = "Verify the system in case the user search with value valid \"Phone\",_003", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC003(String email, String password) {
        userManaListPage.UserManaList_TC003(email,password,"0369833983");
        Assert.assertEquals(userManaListPage.verifyPhoneColumn(),"03 6983 3983");
    }

    @Test(priority = 4, description = "Verify the system in case the user search with value valid \"Email\",_003", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC004(String email, String password) {
        userManaListPage.UserManaList_TC004(email,password,"admin@example.com");
        Assert.assertEquals(userManaListPage.verifyEmailColumn(),"admin@example.com");
    }

    @Test(priority = 5, description = "Verify the system in case the user search with vaule invalid \"Email\",_004", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC005(String email, String password) {
        userManaListPage.UserManaList_TC004(email,password,"testzz@gmail.com");
        Assert.assertEquals(userManaListPage.verifySearchInvalid(),"No data");
    }

    @Test(priority = 6, description = "Verify that the system will display \"Filter\" popup when the user click on [Filter] icon, _005", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC006(String email, String password) {
        userManaListPage.UserManaList_TC006(email,password);
        Assert.assertEquals(userManaListPage.verifyFilterTitle(),"Filters");
        Assert.assertTrue(userManaListPage.verifyStatusUserType());
        Assert.assertTrue(userManaListPage.verifyStatusApplyButton());
        Assert.assertTrue(userManaListPage.verifyClearButton());
    }

    @Test(priority = 7, description = "Verify that the system will filter data success when the user apply filter based on user type: Global _006", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC007(String email, String password) throws Exception {
        userManaListPage.UserManaList_TC007(email,password);
        userManaListPage.verifyUserTypeGlobal("Global");
    }

    @Test(priority = 8, description = "Verify that the system will filter data success when the user apply filter based on user type: Local _006", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC008(String email, String password) throws Exception {
        userManaListPage.UserManaList_TC008(email,password);
        userManaListPage.verifyUserTypeLocal("Local");
    }

    @Test(priority = 9, description = "Verify that sytem will clear all condition in case the user click on \"Clear all\" button _007", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC009(String email, String password) throws Exception {
        userManaListPage.UserManaList_TC009(email,password);
        userManaListPage.verifyAllUserType("Global","Local");
    }

    @Test(priority = 10, description = "Verify sytem in case the user click on \"Clear all\"  button on the right most of the screen _008", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC010(String email, String password) throws Exception {
        userManaListPage.UserManaList_TC0010(email,password);
        userManaListPage.verifyAllUserType("Global","Local");
    }

    @Test(priority = 11, description = "Verify that system in case the user click on [Add User] button _009", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC011(String email, String password) throws Exception {
        userManaListPage.UserManaList_TC011(email,password);
        Assert.assertEquals(userManaListPage.VerifyAddNewUserTitle(),"Add New User");
    }

    @Test(priority = 12, description = "Verify that system will jump to \"User Details\" when the user select a User on datagird _011", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC012(String email, String password) throws Exception {
        userManaListPage.UserManaList_TC012(email,password);
        Assert.assertEquals(userManaListPage.VerifyUserDetailLink(),"User Details");
    }

    @Test(priority = 13, description = "Verify that the system in case user action with the pagination _012", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaListTest_TC013(String email, String password) throws Exception {
        userManaListPage.UserManaList_TC013(email,password);

    }
}
