package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.pages.AdminPortalPages.UserAccess.LoginPage;
import com.easyserv.pages.AdminPortalPages.UserAccess.LoginPageFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseSetup {
    private WebDriver driver;
    public LoginPage loginPage;
    public LoginPageFactory loginPageFactory;

    @BeforeTest
    public void setUp(){
        driver = getDriver();
    }

    @Test(priority = 1)
    public void LoginEasy() throws Exception{
        System.out.println(driver);
        loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.verifyCurrentURL(),"Current URL doesn't match");
        Assert.assertTrue(loginPage.verifyHeaderLoginPage(),"Header page text not matching");

        loginPage.LoginEasy("admin@example.com","12345678",20);
        

    }

    @Test(priority = 2)
    public void LoginEasy1(){
        loginPage.refreshPage();

        Assert.assertTrue(loginPage.verifyCurrentURL(),"Current URL doesn't match");
        Assert.assertTrue(loginPage.verifyHeaderLoginPage(),"Header page text not matching");

        loginPage.LoginEasy("admin@example.com","12345678",20);
    }

    @Test(priority = 3)
    public void LoginEasy2(){
        loginPage.refreshPage();
        loginPageFactory = new LoginPageFactory(driver);
        Assert.assertTrue(loginPageFactory.verifyCurrentURL(),"Current URL doesn't match");
        Assert.assertTrue(loginPageFactory.verifyHeaderLoginPage(),"Header page text not matching");

        loginPageFactory.login("admin@example.com","12345678");

    }
}
