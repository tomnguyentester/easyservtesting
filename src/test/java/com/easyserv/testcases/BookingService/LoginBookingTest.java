package com.easyserv.testcases.BookingService;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.DataBookingService;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.BookingServicePage.CustomerAccess.LoginBookingPage;
import com.easyserv.pages.BookingServicePage.CustomerNotAccess.BookingServiceHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginBookingTest extends BaseSetup {
    private WebDriver driver;
    private LoginBookingPage loginBookingPage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        loginBookingPage = new LoginBookingPage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify if a user will be able to login suscessfull with a valid Email and valid password.  _041",dataProvider = "data_login", dataProviderClass = DataBookingService.class)
    public void LoginBookingTest_TC001(String email,String password) {
        loginBookingPage.LoginBooking_TC001(email,password);
        Assert.assertEquals(loginBookingPage.verifyLoginSuccessNoti(),"DataLogin successful");
        Assert.assertEquals(loginBookingPage.verifyBookServiceHeader(),"BOOK A SERVICE");
    }

    @Test(priority = 2, description = "Verify login function when the user pressing Enter (instead of Click on DataLogin button) _042",dataProvider = "data_login", dataProviderClass = DataBookingService.class)
    public void LoginBookingTest_TC002(String email,String password) {
        loginBookingPage.LoginBooking_TC002(email,password);
        Assert.assertEquals(loginBookingPage.verifyLoginSuccessNoti(),"DataLogin successful");
        Assert.assertEquals(loginBookingPage.verifyBookServiceHeader(),"BOOK A SERVICE");
    }

    @Test(priority = 3, description = "Verify login function in case Invalid \"UserName/Password\" _043",dataProvider = "dataInvalid_login", dataProviderClass = DataBookingService.class)
    public void LoginBookingTest_TC003(String email,String password) {
        loginBookingPage.LoginBooking_TC003(email,password);
        Assert.assertEquals(loginBookingPage.verifyLoginUnsuccessNoti(),"Your User Name and Password combination is not correct. Please try again");
    }

    @Test(priority = 4, description = "Verify login function in case \"password\" with max length >21char _044",dataProvider = "dataMaxlength_login", dataProviderClass = DataBookingService.class)
    public void LoginBookingTest_TC004(String email,String password) {
        loginBookingPage.LoginBooking_TC004(email,password);
        Assert.assertEquals(loginBookingPage.verifyPasswordValue(),"12345678901234567890");
    }

    @Test(priority = 5, description = "Verify validation message for Email field",dataProvider = "dataEmail_login", dataProviderClass = DataBookingService.class)
    public void LoginBookingTest_TC005(String email) {
        loginBookingPage.LoginBooking_TC005(email);
        Assert.assertEquals(loginBookingPage.verifyEmailValidationMessage(),"The email field must be a valid email");
    }

    @Test(priority = 6, description = "Verify login function in case blank field _048,_049,_050",dataProvider = "dataBlank_login", dataProviderClass = DataBookingService.class)
    public void LoginBookingTest_TC006(String email,String password) {
        loginBookingPage.LoginBooking_TC006(email,password);
        Assert.assertFalse(loginBookingPage.verifyStatusLoginButton());
    }

    @Test(priority = 7, description = "Verify system in case the user click \"Forgot Pass\" link")
    public void LoginBookingTest_TC007() {
        loginBookingPage.LoginBooking_TC007();
        Assert.assertEquals(loginBookingPage.verifyResetPasswordHeader(),"RESET PASSWORD");
    }
}
