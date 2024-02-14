package com.easyserv.testcases.EasyEngine;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.EasyEngine.DataLogin;
import com.easyserv.pages.EasyservEnginePages.ForgotPasswordPage;
import com.easyserv.pages.EasyservEnginePages.LoginEnginePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseSetup {
    private WebDriver driver;
    private ForgotPasswordPage forgotPasswordPage;
    private ValidateHelper validateHelper;
    private By emailAddressTextbox = By.xpath("//input[@id='email']");
    private By continueButton = By.xpath("//button[@type='submit']");

    @BeforeClass
    public void setup(){
        driver = getDriver();
        forgotPasswordPage = new ForgotPasswordPage(driver);
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI on Forgot Password screen  _001")
    public void ForgotPasswordTest_TC001() {
        forgotPasswordPage.ForgotPassword_TC001();
        Assert.assertEquals(forgotPasswordPage.verifyForgotPassHeader(),"FORGOT PASSWORD");
        Assert.assertEquals(forgotPasswordPage.verifyEmailPlaceholder(),"Enter email address");
        Assert.assertFalse(forgotPasswordPage.verifyStatusContinueButton());
    }

    @Test(priority = 2, description = "Verify user can click Email Address _002")
    public void ForgotPasswordTest_TC002() {
        forgotPasswordPage.ForgotPassword_TC002();
        Assert.assertTrue(forgotPasswordPage.verifyStatusEmailAddress());
        validateHelper.setText(emailAddressTextbox,"Thai@gmail.com");
    }

    @Test(priority = 3, description = "Verify user can click Continue in <Continue> button on Forgot Password screen _003")
    public void ForgotPasswordTest_TC003() {
        forgotPasswordPage.ForgotPassword_TC003("trungnguyen@gmail.com");
        Assert.assertTrue(forgotPasswordPage.verifyStatusEmailAddress());
        Assert.assertTrue(forgotPasswordPage.verifyStatusContinueButton());
        validateHelper.clickElement(continueButton);
    }

    @Test(priority = 4, description = "Verify user can click on \"Back\" icon on Forgot Password screen _005")
    public void ForgotPasswordTest_TC004() {
        forgotPasswordPage.ForgotPassword_TC004();
        Assert.assertEquals(forgotPasswordPage.verifyLoginHeader(),"LOG IN");
    }

    @Test(priority = 5, description = "Verify user click Continue in <Continue> button on Forgot Password screen _006")
    public void ForgotPasswordTest_TC005() {
        forgotPasswordPage.ForgotPassword_TC005("trungnguyen@gmail.com");
        Assert.assertEquals(forgotPasswordPage.verifyCheckEmailTitle(),"Check Your Email");
    }

    @Test(priority = 6, description = "Verify user enter invalid data in <Email address> textbox on \"Forgot Password\" screen _010",dataProvider = "EmailInvalid", dataProviderClass = DataLogin.class)
    public void ForgotPasswordTest_TC006(String email) {
        forgotPasswordPage.ForgotPassword_TC006(email);
        Assert.assertEquals(forgotPasswordPage.verifyEmailWarningMess(),"The email field must be a valid email");
    }

    @Test(priority = 7, description = "Verify user enter Email not in the system _011")
    public void ForgotPasswordTest_TC007() {
        forgotPasswordPage.ForgotPassword_TC007("thai270@gmail.com");
        Assert.assertEquals(forgotPasswordPage.verifyEmailNotExistMess(),"Email does not exist");
    }

}
