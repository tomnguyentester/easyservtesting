package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.helpers.ValidateUIHelpers;
import com.easyserv.pages.AdminPortalPages.UserAccess.LoginEasyPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserAccessTest extends BaseSetup {
    private WebDriver driver;
    private ExcelHelpers excelHelpers;
    public LoginEasyPage loginEasyPage;
    public ValidateHelper validateHelper;
    public ValidateUIHelpers validateUIHelpers;
    String urlPage = "https://motorserve-admin-uat.siliconstack.com.au/login";

    @BeforeTest
    public void setUp() {
        driver = getDriver();
        loginEasyPage = new LoginEasyPage(driver);
        validateUIHelpers = new ValidateUIHelpers(driver);
        excelHelpers = new ExcelHelpers();
    }

    @Test(priority = 1)
    public void LoginTest_TC001() {
        Assert.assertTrue(validateUIHelpers.verifyURLPage(urlPage), "The URL page incorrect");
        Assert.assertEquals(loginEasyPage.verifyHearder(), "Welcome back");
        Assert.assertEquals(loginEasyPage.verifyContent(), "Please enter your details to sign in");
        Assert.assertEquals(loginEasyPage.verifyEmailTitle(), "Email");
        Assert.assertTrue(loginEasyPage.verifyEmailTextbox(), "Email_TextBox not avaible");
        Assert.assertEquals(loginEasyPage.verifyPasswordTitle(), "Password");
        Assert.assertTrue(loginEasyPage.verifyPasswordTextbox(), "Password_TextBox not avaible");
        Assert.assertTrue(loginEasyPage.verifyRemeberCheckbox(), "Remember CheckBox not avaible");
        Assert.assertEquals(loginEasyPage.verifyRememberText(), "Remember my credentials");
        Assert.assertEquals(loginEasyPage.verifyForgotPassLink(), "Forgot password?");
        Assert.assertTrue(loginEasyPage.verifySignInButton(), "SignIn button not avaible");
    }

    @Test(priority = 2)
    public void LoginTest_TC002() throws Exception {
        loginEasyPage.LoginPage_TC002();
        Assert.assertTrue(loginEasyPage.validationemail(), "Email Validation Message Not Avaible");
        Assert.assertTrue(loginEasyPage.validationpass(), "Pass Validation Message Not Avaible");
    }

    @Test(priority = 3)
    public void LoginTest_TC003() {
        loginEasyPage.LoginPage_TC003("12345678");
        Assert.assertTrue(loginEasyPage.veriyEncryptedPassON(), "The Password is not Masking");
        //Should be capture Screen
    }

    @Test(priority = 4)
    public void LoginTest_TC004() {
        loginEasyPage.LoginPage_TC004("12345678");
        Assert.assertTrue(loginEasyPage.veriyEncryptedPassOFF(), "The Password field cannot get attribute [value]");
        //Should be capture Screen
    }

    @Test(priority = 5)
    public void LoginTest_TC005() {
        loginEasyPage.LoginPage_TC005("admin@example.com", "12345678");
        Assert.assertTrue(loginEasyPage.verifyBackButton(), "\"Back\" button not avaible");
        Assert.assertEquals(loginEasyPage.verifyBacktoText(), "Back to DataLogin");
        Assert.assertEquals(loginEasyPage.verifyStoreHearder(), "Select Store");
        Assert.assertEquals(loginEasyPage.verifyStoreLabel(), "Store");
        Assert.assertTrue(loginEasyPage.verifyStoreDrop(), "Store Dropdown not avaible");
        Assert.assertTrue(loginEasyPage.verifyNextButton(), "\"Next\" button not avaible");
    }

    @Test(priority = 6)
    public void LoginTest_TC006() {
        loginEasyPage.LoginPage_TC006("admin@example.com", "12345678");
        //After user input password and press Enter
        //System jump to [Select Store] Screen
        Assert.assertEquals(loginEasyPage.verifyStoreHearder(), "Select Store");
    }

    @Test(priority = 7)
    public void LoginTest_TC007() {
        loginEasyPage.LoginPage_TC007("admin@example.com", "123");
        Assert.assertTrue(loginEasyPage.verifyCredentialsNoti(), "The Notification not display");
        Assert.assertEquals(loginEasyPage.verifyCredText(), "Wrong credentials provided");
    }

    @Test(priority = 8)
    public void LoginTest_TC008() {
        loginEasyPage.LoginPage_TC008("admin@example.com", "1234567890987654321012");
        Assert.assertEquals(loginEasyPage.validationPassword(), "Your Password must not exceed 20 characters.");
    }

    @Test(priority = 9)
    public void LoginTest_TC009() throws Exception {
//        loginEasyPage.LoginPage_TC009("tom.nguyen@.com.au");
//        Assert.assertEquals(loginEasyPage.validationEmail(),"The email field must be a valid email");
//        loginEasyPage.LoginPage_TC009("tom.nguyen@siliconstack");
//        Assert.assertEquals(loginEasyPage.validationEmail(),"The email field must be a valid email");
//        loginEasyPage.LoginPage_TC009("tom.nguyensiliconstack.com.au");
//        Assert.assertEquals(loginEasyPage.validationEmail(),"The email field must be a valid email");
//        loginEasyPage.LoginPage_TC009("@siliconstack.com.au");
//        Assert.assertEquals(loginEasyPage.validationEmail(),"The email field must be a valid email");
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx", "Sheet2");
        for (int i = 1; i < 5; i++) {
            loginEasyPage.LoginPage_TC009(excelHelpers.getCellData("username", i));
            Assert.assertEquals(loginEasyPage.validationEmail(), "The email field must be a valid email");
        }
    }

    @Test(priority = 10)
    public void LoginTest_TC010() throws Exception {
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx", "Sheet1");
        loginEasyPage.LoginPage_TC010(excelHelpers.getCellData("username", 2), excelHelpers.getCellData("password", 2));
        Assert.assertTrue(loginEasyPage.verifyCredentialsNoti(), "The Notification not display");
        Assert.assertEquals(loginEasyPage.verifyCredText(), "Wrong credentials provided");
    }

    @Test(priority = 11)
    public void LoginTest_TC011() throws Exception {
        excelHelpers.setExcelFile("resources/datatest/user_access.xlsx", "Sheet1");
        loginEasyPage.LoginPage_TC0011(excelHelpers.getCellData("username", 1), excelHelpers.getCellData("password", 1), 10);
        Assert.assertEquals(loginEasyPage.verifyStoreNameFromDrop(), "Global");
    }

}

