package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.EasyServ.DataLoginMoto;
import com.easyserv.pages.AdminPortalPages.UserAccess.LoginAdminPage;
import com.easyserv.pages.AdminPortalPages.UserManagement.UserManaListPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginAdminTest extends BaseSetup {
    private WebDriver driver;
    private LoginAdminPage loginAdminPage;
    private ValidateHelper validateHelper;

    @BeforeClass
    public void setup() {
        driver = getDriver();
        loginAdminPage = new LoginAdminPage(driver);
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Login page\" screen  _001", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC001(String email, String password) {
        Assert.assertEquals(loginAdminPage.vefiryLoginHeader(),"Welcome back");
        Assert.assertEquals(loginAdminPage.verifyContent(), "Please enter your details to sign in");
        Assert.assertEquals(loginAdminPage.verifyEmailTitle(), "Email");
        Assert.assertTrue(loginAdminPage.verifyEmailTextbox(), "Email_TextBox not avaible");
        Assert.assertEquals(loginAdminPage.verifyPasswordTitle(), "Password");
        Assert.assertTrue(loginAdminPage.verifyPasswordTextbox(), "Password_TextBox not avaible");
        Assert.assertTrue(loginAdminPage.verifyRemeberCheckbox(), "Remember CheckBox not avaible");
        Assert.assertEquals(loginAdminPage.verifyRememberText(), "Remember my credentials");
        Assert.assertEquals(loginAdminPage.verifyForgotPassLink(), "Forgot Password?");
        Assert.assertTrue(loginAdminPage.verifySignInButton(), "SignIn button not avaible");
    }

    @Test(priority = 2, description = "Verify validation message for Email/Password field  _002", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC002(String email, String password) {
        loginAdminPage.LoginAdmin_TC002(email, password);
        Assert.assertEquals(loginAdminPage.verifyEmailReqMess(),"The Email field is required");
        Assert.assertEquals(loginAdminPage.verifyPassReqMess(), "The Password field is required");
    }

    @Test(priority = 3, description = "Verify if a user will be able to login suscessfull with a valid Email and valid password.  _012", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC003(String email, String password) {
        loginAdminPage.LoginAdmin_TC003(email, password);
        Assert.assertEquals(loginAdminPage.verifySelectStoreHeader(),"Select Store");
    }

    @Test(priority = 4, description = "Verify login function when the user pressing Enter  _013", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC004(String email, String password) {
        loginAdminPage.LoginAdmin_TC004(email, password);
        Assert.assertEquals(loginAdminPage.verifySelectStoreHeader(),"Select Store");
    }

    @Test(priority = 5, description = "Verify login function in case Invalid \"Password\"   _014", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC005(String email, String password) {
        loginAdminPage.LoginAdmin_TC005("abc@gmail.com", "000000");
        Assert.assertEquals(loginAdminPage.verifyWrongCredentials(),"Wrong credentials provided");
    }

    @Test(priority = 6, description = "Verify login function in case \"password\" with max length of 21char  _015", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC006(String email, String password) {
        loginAdminPage.LoginAdmin_TC006("abc@gmail.com", "123456789012345678900");
        Assert.assertEquals(loginAdminPage.verifyMaxlengthPassword(),"Your Password must not exceed 20 characters.");
    }

    @Test(priority = 7, description = "Verify validation message for Email field  _016", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC007(String email, String password) {
        loginAdminPage.LoginAdmin_TC007("tom.nguyen@.com.au", "123456789012345678900");
        Assert.assertEquals(loginAdminPage.verifyEmailValidMess(),"The email field must be a valid email");
    }

    @Test(priority = 8, description = "Verify login function in case Invalid \"Email\"  _017", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC008(String email, String password) {
        loginAdminPage.LoginAdmin_TC008("testing@gmail.com", "12345678");
        Assert.assertEquals(loginAdminPage.verifyWrongCredentials(),"Wrong credentials provided");
    }

    @Test(priority = 9, description = "Verify login function in case Invalid \"Email/Password\"  _018", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC009(String email, String password) {
        loginAdminPage.LoginAdmin_TC009("testing@gmail.com", "12345678@");
        Assert.assertEquals(loginAdminPage.verifyWrongCredentials(),"Wrong credentials provided");
    }

    @Test(priority = 10, description = "Verify login function in case blank \"Password\" _020", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC010(String email, String password) {
        loginAdminPage.LoginAdmin_TC010("testing@gmail.com", "");
        Assert.assertEquals(loginAdminPage.verifyPassReqMess(), "The Password field is required");
    }

    @Test(priority = 11, description = "Verify login function in case blank \"Email\" _021", dataProvider = "AccountInfo", dataProviderClass = DataLoginMoto.class)
    public void LoginAdminTest_TC011(String email, String password) {
        loginAdminPage.LoginAdmin_TC011("", "123456");
        Assert.assertEquals(loginAdminPage.verifyEmailReqMess(),"The Email field is required");
    }
}
