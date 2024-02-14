package com.easyserv.testcases.EasyEngine;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.EasyEngine.DataLogin;
import com.easyserv.pages.EasyservEnginePages.ForgotPasswordPage;
import com.easyserv.pages.EasyservEnginePages.ResetPasswordPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResetPasswordTest extends BaseSetup {
    private WebDriver driver;
    private ResetPasswordPage resetPasswordPage;
    private ValidateHelper validateHelper;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        resetPasswordPage = new ResetPasswordPage(driver);
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI of \"Reset password\" screen as the same Requirement  _001")
    public void ResetPasswordTest_TC001() {
        resetPasswordPage.ResetPassword_TC001();
        Assert.assertEquals(resetPasswordPage.verifyResetPasswordHeader(),"RESET PASSWORD");
        Assert.assertTrue(resetPasswordPage.verifyStatusNewPassTextbox());
        Assert.assertTrue(resetPasswordPage.verifyStatusConfirmPassTextbox());
        Assert.assertEquals(resetPasswordPage.verifyNewPassPlaceholder(),"Enter new password");
        Assert.assertEquals(resetPasswordPage.verifyConfirmPassPlaceholder(),"Confirm new password");
        Assert.assertFalse(resetPasswordPage.verifyStatusResetButton());
    }

    @Test(priority = 2, description = "Verify user enters more than 5 characters in both <New Password> and <Confirm New Password> text boxes on Reset Password screen  _002")
    public void ResetPasswordTest_TC002() {
        resetPasswordPage.ResetPassword_TC002("123456","123456");
        Assert.assertTrue(resetPasswordPage.verifyStatusResetButton());
    }

    @Test(priority = 3, description = "Verify system in case New Password is Empty  _003")
    public void ResetPasswordTest_TC003() {
        resetPasswordPage.ResetPassword_TC003("123456","123456");
        Assert.assertEquals(resetPasswordPage.verifyNewPassReqMess(),"The new Password field is required");
    }

    @Test(priority = 4, description = "Verify system in case user enter less than 6 characters in New Password field  _004",dataProvider = "NewPass", dataProviderClass = DataLogin.class)
    public void ResetPasswordTest_TC004(String newpass) {
        resetPasswordPage.ResetPassword_TC004(newpass);
        Assert.assertEquals(resetPasswordPage.verifyNewPassLeastCharMess(),"Password must be at least 6 characters");
    }

    @Test(priority = 5, description = "Verify system in case user enter more than 20 characters in \"New Password\" field  _005")
    public void ResetPasswordTest_TC005() {
        resetPasswordPage.ResetPassword_TC005("abc%$#123jue_+7621ddt");
        Assert.assertEquals(resetPasswordPage.verifyNewPassExceedCharMess(),"Your password must not exceed 20 characters.");
    }

    @Test(priority = 6, description = "Verify system in case Confirm New Password is Empty  _006")
    public void ResetPasswordTest_TC006() {
        resetPasswordPage.ResetPassword_TC006("123456","123456");
        Assert.assertEquals(resetPasswordPage.verifyConfirmPassReqMess(),"The Confirm New Password field is required");
    }

    @Test(priority = 7, description = "Verify system in case  user enter less than 6 characters in \"Confirm New Password\" field  _007", dataProvider = "NewPass", dataProviderClass = DataLogin.class)
    public void ResetPasswordTest_TC007(String confirmpass) {
        resetPasswordPage.ResetPassword_TC007("123456", confirmpass);
        Assert.assertEquals(resetPasswordPage.verifyNewPassLeastCharMess(),"Password must be at least 6 characters");
    }

    @Test(priority = 8, description = "Verify system in case user enter more than 20 characters in \"Confirm New Password\" field  _008")
    public void ResetPasswordTest_TC008() {
        resetPasswordPage.ResetPassword_TC008("123456","abc%$#123jue_+7621ddt");
        Assert.assertEquals(resetPasswordPage.verifyNewPassExceedCharMess(),"Your password must not exceed 20 characters.");
    }

    @Test(priority = 9, description = "Verify \"Confirm Password\" is not matched with \"New Password\"  _013")
    public void ResetPasswordTest_TC009() {
        resetPasswordPage.ResetPassword_TC009("123456abc","12345678");
        Assert.assertEquals(resetPasswordPage.verifyConfirmPassNotMatchedMess(),"The confirmed password is not matched. Please try again.");
    }
}
