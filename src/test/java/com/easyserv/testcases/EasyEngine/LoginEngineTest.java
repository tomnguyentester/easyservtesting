package com.easyserv.testcases.EasyEngine;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.DataBookingService;
import com.easyserv.dataprovider.EasyEngine.DataLogin;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.listeners.TestListener;
import com.easyserv.pages.BookingServicePage.CustomerNotAccess.SignUpPage;
import com.easyserv.pages.EasyservEnginePages.LoginEnginePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class LoginEngineTest extends BaseSetup {
    private WebDriver driver;
    private LoginEnginePage loginEnginePage;
    private ValidateHelper validateHelper;
    private By emailTextbox = By.xpath("//input[@id='email']");
    private By passwordTextbox = By.xpath("//input[@id='password']");
    private By rememberCheckbox = By.xpath("//input[@id='remember']");
    private By rememberText = By.xpath("//span[contains(text(),'Remember me')]");

    @BeforeClass
    public void setup(){
        driver = getDriver();
        loginEnginePage = new LoginEnginePage(driver);
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI DataLogin is correct Design  _001")
    public void LoginEngineTest_TC001() {
        //Assert.assertEquals(loginEnginePage.verifyLoginHeader(),"LOG IN");
        loginEnginePage.verifyLoginHeader();
    }

    @Test(priority = 2, description = "Verify user can enter user email in textbox <Email address> on \"Log In\" screen _002")
    public void LoginEngineTest_TC002() {
        Assert.assertTrue(loginEnginePage.verifyStatusEmailAddress());
        validateHelper.clickElement(emailTextbox);
        validateHelper.setText(emailTextbox,"Thai@gmail.com");
    }

    @Test(priority = 3, description = "Verify user can enter password in textbox <Password> on DataLogin screen _003")
    public void LoginEngineTest_TC003() {
        Assert.assertTrue(loginEnginePage.verifyStatusPassword());
        validateHelper.clickElement(passwordTextbox);
        validateHelper.setText(passwordTextbox,"12345678");
    }

    @Test(priority = 4, description = "Verify user can click Remember me in <Remember me> on DataLogin screen _004")
    public void LoginEngineTest_TC004() {
        Assert.assertFalse(loginEnginePage.verifyStatusRememberButton());
        validateHelper.clickElement(rememberText);
    }

    @Test(priority = 5, description = "Verify user can click Fogot Password in hyperlink <Fogot password> on DataLogin Screen _005")
    public void LoginEngineTest_TC005() {
        loginEnginePage.LoginEngine_TC005();
        Assert.assertEquals(loginEnginePage.verifyForgotPasswordHeader(),"FORGOT PASSWORD");
    }

    @Test(priority = 6, description = "Verify system in case missing \"email address\" field _005")
    public void LoginEngineTest_TC006() {
        loginEnginePage.LoginEngine_TC006("Thai@gmail.com");
        Assert.assertEquals(loginEnginePage.verifyEmailRequiredMessage(),"The Email field is required");
    }

    @Test(priority = 7, description = "Verify user can't input invalid characters for <Email address> textbox on \"DataLogin\" screen field _007",dataProvider = "EmailInvalid", dataProviderClass = DataLogin.class)
    public void LoginEngineTest_TC007(String email) {
        loginEnginePage.LoginEngine_TC007(email);
        Assert.assertEquals(loginEnginePage.verifyEmailMessage(),"The email field must be a valid email");
    }

    @Test(priority = 8, description = "Verify system in case missing \"Password\" field _009")
    public void LoginEngineTest_TC008() {
        loginEnginePage.LoginEngine_TC008("Thai@gmail.com","12345678");
        Assert.assertEquals(loginEnginePage.verifyPasswordRequiredMessage(),"The Password field is required");
    }

    @Test(priority = 9, description = "Verify user can't input more than 20 characters for <Password> textbox on \"Login\" screen _010")
    public void LoginEngineTest_TC009() {
        loginEnginePage.LoginEngine_TC009("Thai@gmail.com","1315464648789465446465446454654546487484545");
        Assert.assertEquals(loginEnginePage.verifyPasswordValue(),"13154646487894654464");
    }

    @Test(priority = 10, description = "Verify user can input from 1 to 250 valid characters for <Email address> textbox on \"Login\" screen and input valid data for <Password> textbox on \"Login\" screen _011")
    public void LoginEngineTest_TC010() {
        loginEnginePage.LoginEngine_TC010("thai27082001@gmail.com","12345678");
        Assert.assertTrue(loginEnginePage.verifyStatusLoginButton());
    }

    @Test(priority = 11, description = "Verify user can input from 1 to 20 characters for <Password> textbox on \"Login\" screen and input valid characters for <Email address> textbox on \"Login\" screen _012")
    public void LoginEngineTest_TC011() {
        loginEnginePage.LoginEngine_TC011("thai27082001@gmail.com","12345678909876543210");
        Assert.assertTrue(loginEnginePage.verifyStatusLoginButton());
    }

    @Test(priority = 12, description = "Verify user input valid data for \"Email address\" textbox and \"Password\" textbox on \"Login\" screen _019",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void LoginEngineTest_TC012(String email,String password) {
        loginEnginePage.LoginEngine_TC012(email,password);
        Assert.assertEquals(loginEnginePage.verifySelectDepartHeader(),"Select Department");
    }

    @Test(priority = 13, description = "Verify user input valid data for \"Email address\" textbox and \"Password\" textbox and pressing \"Enter\" _020",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void LoginEngineTest_TC013(String email,String password) {
        loginEnginePage.LoginEngine_TC013(email,password);
        Assert.assertEquals(loginEnginePage.verifySelectDepartHeader(),"Select Department");
    }

    @Test(priority = 14, description = "Verify user input valid data for \"Email address\" textbox and invalid \"Password\" textbox  on \"Login\" screen _021")
    public void LoginEngineTest_TC014() {
        loginEnginePage.LoginEngine_TC014("thai27082001@gmail.com","00000000000");
        Assert.assertEquals(loginEnginePage.verifyLoginWarningMess(),"Wrong credentials provided");
    }

    @Test(priority = 15, description = "Verify user input invalid data for \"Email address\" textbox and valid \"Password\" textbox on \"Login\" screen _021")
    public void LoginEngineTest_TC015() {
        loginEnginePage.LoginEngine_TC014("thai27082001@gmailll.com","00000000000");
        Assert.assertEquals(loginEnginePage.verifyLoginWarningMess(),"Email does not exist");
    }

    @Test(priority = 16, description = "Verify user input invalid data for \"Email address\" textbox and invalid \"Password\" textbox  on \"Login\" screen _023")
    public void LoginEngineTest_TC016() {
        loginEnginePage.LoginEngine_TC016("thai27082001@gmailll.com","khong dung");
        Assert.assertEquals(loginEnginePage.verifyLoginWarningMess(),"Email does not exist");
    }

    @Test(priority = 17, description = "Verify user enter data for \"Email address\" textbox = valid and passwordd < 6 characters textbox on Login screen _024")
    public void LoginEngineTest_TC017() {
        loginEnginePage.LoginEngine_TC017("thai27082001@gmailll.com","12345");
        Assert.assertEquals(loginEnginePage.verifyPasswordWarningMess(),"Password must have at least 6 characters");
    }

    @Test(priority = 18, description = "Verify user enter data for \"email address\" is email is not existed in system _025")
    public void LoginEngineTest_TC018() {
        loginEnginePage.LoginEngine_TC018("testing123@gmailll.com","123456");
        Assert.assertEquals(loginEnginePage.verifyEmailWarningMess(),"Email does not exist");
    }

    @Test(priority = 19, description = "Verify user enter data for \"email address\" is email is not existed in system _025",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void LoginEngineTest_TC019(String email,String password) {
        loginEnginePage.LoginEngine_TC019(email,password);
        Assert.assertEquals(loginEnginePage.verifyDashboardHeader(),"Dashboard");
    }

    @Test(priority = 20, description = "Verify user have only 1 department _026",dataProvider = "AccountOneDepart", dataProviderClass = DataLogin.class)
    public void LoginEngineTest_TC020(String email,String password) {
        loginEnginePage.LoginEngine_TC020(email,password);
        Assert.assertEquals(loginEnginePage.verifyDashboardHeader(),"Dashboard");
    }

    @Test(priority = 21, description = "Verify user can click \"Back\" icon on select department screen _026",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void LoginEngineTest_TC021(String email,String password) {
        loginEnginePage.LoginEngine_TC021(email,password);
        Assert.assertEquals(loginEnginePage.verifyLoginHeader(),"LOG IN");
    }

}
