package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.EasyServ.DataLoginMoto;
import com.easyserv.pages.AdminPortalPages.UserManagement.UserManaDetailsPage;
import com.easyserv.pages.AdminPortalPages.UserManagement.UserManaListPage;
import net.datafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Locale;

public class UserManaDetailsTest extends BaseSetup {
    private WebDriver driver;
    private UserManaDetailsPage userManaDetailsPage;
    private ValidateHelper validateHelper;

    Faker faker = new Faker(new Locale("AUS"));
    String firtname_ = faker.name().firstName();
    String lastname_ = faker.name().lastName();
    String job_ = faker.job().position();
    String emailAdd_ = firtname_.toLowerCase() + lastname_.toLowerCase() +"@gmail.com";
    String mobiphone_ = "03"+ faker.phoneNumber().subscriberNumber(8);
    String address_ = faker.address().streetAddress();

    @BeforeClass
    public void setup() {
        driver = getDriver();
        userManaDetailsPage = new UserManaDetailsPage(driver);
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Contact information\" screen  _001", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC001(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC001(email, password);
        Assert.assertEquals(userManaDetailsPage.verifyContactInforTitle(),"Contact Information");
        Assert.assertEquals(userManaDetailsPage.verifyUserDetailTitle(),"User Details");
        Assert.assertTrue(userManaDetailsPage.verifyStatusFirstName());
        Assert.assertTrue(userManaDetailsPage.verifyStatusLastName());
        Assert.assertTrue(userManaDetailsPage.verifyStatusEmail());
        Assert.assertTrue(userManaDetailsPage.verifyStatusCancelButton());
        Assert.assertTrue(userManaDetailsPage.verifyStatusSaveButton());
    }

    @Test(priority = 2, description = "Verify validation message in case the All field is blank  _004", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC002(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC002(email, password);
        Assert.assertEquals(userManaDetailsPage.verifyFirstNameReqMess(),"The firstName field is required");
        Assert.assertEquals(userManaDetailsPage.verifyLastNameReqMess(),"The lastName field is required");
        Assert.assertEquals(userManaDetailsPage.verifyEmailReqMess(),"The email field is required");
    }

    @Test(priority = 3, description = "Verify validation message in case enter invalid for \"PhoneNumber/Email/Postcode\" _004", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC003(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC003(email, password,"testing","testing","testing");
        Assert.assertEquals(userManaDetailsPage.verifyPhoneValidMess(),"Please add valid Phone Number.");
        Assert.assertEquals(userManaDetailsPage.verifyEmailValidMess(),"The email field must be a valid email");
        Assert.assertEquals(userManaDetailsPage.verifyPostCodeInvalidMess(),"No valid post code found.");
    }

    @Test(priority = 4, description = "Verify validation message in case  Enter the Email already exists _004", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC004(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC004(email, password,"chahat.arora@siliconstack.com.au");
        Assert.assertEquals(userManaDetailsPage.verifyEmailAlreadyExists(),"Email already exists. Please login or use another email to continue.");
    }

    @Test(priority = 5, description = "Verify that system will be display \"Suburd\" dropdown-list  when the user enter valid \"Postcode\" _005", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC005(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC005(email, password,"2100");
        Assert.assertEquals(userManaDetailsPage.verifySuburb(),"Allambie");
    }

    @Test(priority = 6, description = "Verify that system doesn't display \"Suburd\" dropdown-list   when the user enter invalid \"Postcode\" _006", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC006(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC006(email, password,"0001");
        Assert.assertEquals(userManaDetailsPage.verifySubNoData(),"No data");
    }

    @Test(priority = 7, description = "Verify that system will be Edit User is success the after user click on \"Save\" button _007", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC007(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC007(email, password,"ADN");
        Assert.assertEquals(userManaDetailsPage.verifySuccessMess(),"Item has been successfully updated");
    }

    @Test(priority = 8, description = "Verify that the system will back to [User Managemnt] list when user click on [<-] icon _015", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC008(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC008(email, password);
        Assert.assertEquals(userManaDetailsPage.verifyUserManaHeader(),"User Management");
    }

    @Test(priority = 9, description = "Verify that the system will jump to [Add New User] screen when user click on [Add User] button _016", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC009(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC009(email, password);
        Assert.assertEquals(userManaDetailsPage.VerifyAddNewUserTitle(),"Add New User");
    }

    @Test(priority = 10, description = "Verify validation message for \"Add New User\" screen in case the All field is blank _017", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC010(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC010(email, password);
        Assert.assertEquals(userManaDetailsPage.verifyFirstNameReqMess(),"The firstName field is required");
        Assert.assertEquals(userManaDetailsPage.verifyLastNameReqMess(),"The lastName field is required");
        Assert.assertEquals(userManaDetailsPage.verifyEmailReqMess(),"The email field is required");
    }

    @Test(priority = 11, description = "Verify validation message for \"Add New User\" screen in case enter invalid for \"PhoneNumber/Email/Postcode\" _017", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC011(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC011(email, password,"testing","testing","test");
        Assert.assertEquals(userManaDetailsPage.verifyPhoneValidMess(),"Please add valid Phone Number.");
        Assert.assertEquals(userManaDetailsPage.verifyEmailValidMess(),"The email field must be a valid email");
        Assert.assertEquals(userManaDetailsPage.verifyPostCodeInvalidMess(),"No valid post code found.");
    }

    @Test(priority = 12, description = "Verify that the system will be \"Add a new User\" is success _018", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC012(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC012(email, password,firtname_,lastname_,mobiphone_,emailAdd_,address_);
        //Assert.assertEquals(userManaDetailsPage.verifyAddSuccessMess(),"Item has been successfully created");
        Assert.assertEquals(userManaDetailsPage.verifyContactInforTitle(),"Contact Information");
    }

    @Test(priority = 13, description = "Verify that system will clear all changes when the user click \"Cancel\" button _020", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void UserManaDetailTest_TC013(String email, String password) {
        userManaDetailsPage.UserManaDetails_TC013(email, password,firtname_,lastname_,mobiphone_,emailAdd_,address_);
        Assert.assertEquals(userManaDetailsPage.verifyFirtNameText(),"");
        Assert.assertEquals(userManaDetailsPage.verifyLastNameText(),"");
    }

}
