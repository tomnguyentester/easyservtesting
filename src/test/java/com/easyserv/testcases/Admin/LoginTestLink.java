package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.pages.AdminPortalPages.BookingManagement.BookingMangeLink;
import com.easyserv.pages.AdminPortalPages.BookingManagement.DashBoardPageLink;
import com.easyserv.pages.AdminPortalPages.UserAccess.LoginPageLink;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestLink extends BaseSetup {
    private WebDriver driver;
    public LoginPageLink loginPageLink;
    public DashBoardPageLink dashBoardPageLink;
    public BookingMangeLink bookingMangeLink;

    @BeforeTest
    public void setUp(){
        driver = getDriver();
    }

    @Test(priority = 1)
    public void LoginEasy() throws Exception{
        System.out.println(driver);
        loginPageLink = new LoginPageLink(driver);

        Assert.assertTrue(loginPageLink.verifyCurrentURL(),"Current URL doesn't match");
        Assert.assertTrue(loginPageLink.verifyHeaderLoginPage(),"Header page text not matching");

        //loginPageLink.loginlink("admin@example.com","12345678",0);

        dashBoardPageLink = loginPageLink.loginlink("admin@example.com","12345678",0);

    }

    @Test(priority = 2)
    public void Dashboard() throws Exception{
        //dashBoardPageLink = new DashBoardPageLink(driver);
        Assert.assertTrue(dashBoardPageLink.verifyHeaderDashBoard(),"Header page text not matching");
        bookingMangeLink = dashBoardPageLink.clickBookingModule();
    }

    @Test(priority = 3)
    public void BookingManage(){
        Assert.assertTrue(bookingMangeLink.verifyCurrentURL(),"Current URL doesn't match");
        Assert.assertTrue(bookingMangeLink.verifyHeaderBookingManage(),"Header page text not matching");
    }
}
