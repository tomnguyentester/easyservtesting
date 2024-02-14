package com.easyserv.testcases.EasyEngine;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.EasyEngine.DataAccountSetting;
import com.easyserv.dataprovider.EasyEngine.DataLogin;
import com.easyserv.pages.EasyservEnginePages.AccountSettingPage;
import com.easyserv.pages.EasyservEnginePages.LoginEnginePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountSettingTest extends BaseSetup {
    private WebDriver driver;
    private AccountSettingPage accountSettingPage;
    private ValidateHelper validateHelper;

    private By firstName = By.xpath("//input[@id='firstName']");
    private By lastName = By.xpath("//input[@id='lastName']");
    private By jobTitle = By.xpath("//input[@id='jobTitle']");
    private By emailAddress = By.xpath("//input[@id='email']");
    private By mobileNumber = By.xpath("//input[@placeholder='Enter mobile number']");
    private By address = By.xpath("//input[@id='address']");
    private By auCountry =  By.xpath("//span[@title='Australia']");
    private By vnCountry =  By.xpath("//span[@title='Vietnam']");
    private By Austra = By.xpath("//div[contains(text(),'Australia')]");
    private By postCode = By.xpath("//div[@data-label='Post Code']//input[@type='text']");
    private By Vietnam = By.xpath("//div[contains(text(),'Vietnam')]");
    private By India = By.xpath("//div[contains(text(),'India')]");
    private By saveButton = By.xpath("//span[contains(text(),'Save')]");



    @BeforeClass
    public void setup(){
        driver = getDriver();
        accountSettingPage = new AccountSettingPage(driver);
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify UI for \"Contact Info\" Screen  _001",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC001(String email,String password) {
        accountSettingPage.AccountSetting_TC001(email,password);
        Assert.assertEquals(accountSettingPage.verifyFullName(),"Tom Nguyen");
        Assert.assertEquals(accountSettingPage.verifyContactInfoHeader(),"Contact Info");
        Assert.assertEquals(accountSettingPage.verifyEmailContact(),"trungnguyen@gmail.com");
        Assert.assertEquals(accountSettingPage.verifyDepartmentHeader(),"Department(s)");
        Assert.assertEquals(accountSettingPage.verifyMarketingTitle(),"Marketing");
    }

    @Test(priority = 2, description = "Verify Ui for \"Account Info\" Screen is correct Design  _002",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC002(String email,String password) {
        accountSettingPage.AccountSetting_TC002(email,password);
        Assert.assertTrue(accountSettingPage.verifyStatusFirstNameField());
        Assert.assertTrue(accountSettingPage.verifyStatusLastNameField());
        Assert.assertTrue(accountSettingPage.verifyStatusJobTitle());
        Assert.assertTrue(accountSettingPage.verifyStatusEmailAddressField());
        Assert.assertTrue(accountSettingPage.verifyStatusMobileNumFiled());
    }

    @Test(priority = 3, description = "Verify UI for \"Change Password\" function is correct design  _003",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC003(String email,String password) {
        accountSettingPage.AccountSetting_TC003(email,password);
        Assert.assertTrue(accountSettingPage.verifyStatusCurrentPassField());
        Assert.assertTrue(accountSettingPage.verifyStatusNewPassField());
        Assert.assertTrue(accountSettingPage.verifyStatusConfirmNewPassField());
        Assert.assertFalse(accountSettingPage.verifyStatusSaveButton());
    }

    @Test(priority = 4, description = "Verify user can enter free-text some field on \"Account info\" screen  _004",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC004(String email,String password) {
        accountSettingPage.AccountSetting_TC004(email,password);
        Assert.assertTrue(accountSettingPage.verifyStatusFirstNameField());
        validateHelper.clearText(firstName);
        validateHelper.setText(firstName,"Nguyen");
        Assert.assertTrue(accountSettingPage.verifyStatusLastNameField());
        validateHelper.clearText(lastName);
        validateHelper.setText(lastName,"Test");
        Assert.assertTrue(accountSettingPage.verifyStatusJobTitle());
        validateHelper.clearText(jobTitle);
        validateHelper.setText(jobTitle,"Sale Manager");
        Assert.assertTrue(accountSettingPage.verifyStatusEmailAddressField());
        validateHelper.clearText(emailAddress);
        validateHelper.setText(emailAddress,"nguyentest@gmail.com");
        Assert.assertTrue(accountSettingPage.verifyStatusMobileNumFiled());
        validateHelper.clearText(mobileNumber);
        validateHelper.setText(mobileNumber,"0357326263");
        validateHelper.clearText(address);
        validateHelper.setText(address,"222 Sydney Australia");
        validateHelper.clickElement(auCountry);
        validateHelper.clickElement(Austra);
        validateHelper.clearText(postCode);
        validateHelper.setText(postCode,"3000");
    }

    @Test(priority = 5, description = "Verify user can click on \"Country\" dropdown field on Account info screen  _005",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC005(String email,String password) {
        accountSettingPage.AccountSetting_TC005(email,password);
        validateHelper.clickElement(auCountry);
        validateHelper.clickElement(Vietnam);
        validateHelper.delay(2);
        Assert.assertEquals(accountSettingPage.verifyVietnamCountryTitle(),"Vietnam");
        validateHelper.clickElement(vnCountry);
        validateHelper.clickElement(India);
        validateHelper.delay(2);
        Assert.assertEquals(accountSettingPage.verifyIndiaCountryTitle(),"India");
    }

    @Test(priority = 6, description = "Verify user enter <Postcode> will then validate the list of <Suburb> and <State> accordingly  _006",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC006(String email,String password) {
        accountSettingPage.AccountSetting_TC006(email,password,"1004");
        Assert.assertEquals(accountSettingPage.verifyStateValue(),"NSW");
        Assert.assertEquals(accountSettingPage.verifySuburbValue(),"Sydney");
    }

    @Test(priority = 7, description = "Verify user click on \"Country\" =  India or viet nam then \"State/suburb/Post Code\" will dissable  _007",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC007(String email,String password) {
        accountSettingPage.AccountSetting_TC007(email, password);
        Assert.assertEquals(accountSettingPage.verifyStatusStateField(), "");
        Assert.assertEquals(accountSettingPage.verifyStatusSuburbField(), "");
        Assert.assertFalse(accountSettingPage.verifyStatusPostCodeField());
    }

    @Test(priority = 8, description = "Verify user can click on \"Change Password\" tab on Acount info screen  _008",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC008(String email,String password) {
        accountSettingPage.AccountSetting_TC008(email,password);
        Assert.assertTrue(accountSettingPage.verifyStatusCurrentPassField());
        Assert.assertTrue(accountSettingPage.verifyStatusNewPassField());
        Assert.assertTrue(accountSettingPage.verifyStatusConfirmNewPassField());
        Assert.assertFalse(accountSettingPage.verifyStatusSaveButton());
    }

    @Test(priority = 9, description = "Verify that system will be clear data the after user click on \"Cancel\" button  _009",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC009(String email,String password) {
        accountSettingPage.AccountSetting_TC009(email,password,
                "testing",
                "nguyen",
                "Manager",
                "testingnguyen@gmail.com",
                "0909789789",
                "364 Cong Hoa");
        Assert.assertEquals(accountSettingPage.getFirstNameValue(),"Tom");
        Assert.assertEquals(accountSettingPage.getLastNameValue(),"Nguyen");
        Assert.assertEquals(accountSettingPage.getJobValue(),"Tester");
        Assert.assertEquals(accountSettingPage.getEmailValue(),"trungnguyen@gmail.com");
        Assert.assertEquals(accountSettingPage.getMobileValue(),"0938669429");
        Assert.assertEquals(accountSettingPage.getAddressValue(),"364 Cong Hoa, Ho Chi Minh");
        Assert.assertEquals(accountSettingPage.verifyAustraCountryTitle(),"Australia");
    }

    @Test(priority = 10, description = "Verify user enter valid data all required fileds on \"Account info\" screen  _010",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC010(String email,String password) {
        accountSettingPage.AccountSetting_TC010(email,password,
                "testing",
                "nguyen");
        Assert.assertEquals(accountSettingPage.verifySaveSuccessMess(),"Item has been successfully updated");
        Assert.assertEquals(accountSettingPage.verifyContactName(),"testing nguyen");
        validateHelper.clickElement(firstName);
        validateHelper.clearText(firstName);
        validateHelper.setText(firstName,"Tom");
        validateHelper.clickElement(lastName);
        validateHelper.clearText(lastName);
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.clickElement(saveButton);
    }

    @Test(priority = 11, description = "Verify user Remove all data on \"First Name\" field on \"Account info\" section  _014",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC011(String email,String password) {
        accountSettingPage.AccountSetting_TC011(email,password);
        Assert.assertEquals(accountSettingPage.verifyFirstNameReqMess(),"The First Name field is required");
    }

    @Test(priority = 12, description = "Verify user Remove all data on \"Last Name\" field on \"Account info\" section  _016",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC012(String email,String password) {
        accountSettingPage.AccountSetting_TC012(email,password);
        Assert.assertEquals(accountSettingPage.verifyLastNameReqMess(),"The Last Name field is required");
    }

    @Test(priority = 13, description = "Verify user Remove all data on \"JobTitle\" field on \"Account info\" section  _018",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC013(String email,String password) {
        accountSettingPage.AccountSetting_TC013(email,password);
        Assert.assertEquals(accountSettingPage.verifyJobTitleReqMess(),"The Job Title field is required");
    }

    @Test(priority = 14, description = "Verify user Remove all data on \"EmailAddress\" field on \"Account info\" section  _020",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC014(String email,String password) {
        accountSettingPage.AccountSetting_TC014(email,password);
        Assert.assertEquals(accountSettingPage.verifyEmailAddressReqMess(),"The Email Address field is required");
    }

    @Test(priority = 15, description = "Verify user Remove all data on \"MobileNumber\" field on \"Account info\" section  _022",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC015(String email,String password) {
        accountSettingPage.AccountSetting_TC015(email,password);
        Assert.assertEquals(accountSettingPage.verifyMobileReqMess(),"The Mobile Number field is required");
    }

    @Test(priority = 16, description = "Verify User enter more than 20 characters on \"Mobile Number\" field on \"Account info\" section  _023",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC016(String email,String password) {
        accountSettingPage.AccountSetting_TC016(email,password,"09097766565656767676776");
        Assert.assertEquals(accountSettingPage.verifyMobileExceedCharMess(),"Your Mobile Number must not exceed 20 characters.");
    }

    @Test(priority = 17, description = "User enter least 4 characters on \"Post Code\" field on \"Account Info\" section  _25",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC017(String email,String password) {
        accountSettingPage.AccountSetting_TC017(email,password,"123");
        Assert.assertEquals(accountSettingPage.verifyPostCodeReqMess(),"The Post Code field must be 4 characters");
    }

    @Test(priority = 18, description = "User User  enter wrong data format on \"Postcode\" field on \"Account Info\" section  _27",dataProvider = "PostCode", dataProviderClass = DataAccountSetting.class)
    public void AccountSettingTest_TC018(String email,String password,String postcode) {
        accountSettingPage.AccountSetting_TC017(email,password,postcode);
        Assert.assertEquals(accountSettingPage.verifyPostCodeInvalidMess(),"No valid post code found.");
    }

    @Test(priority = 19, description = "User enter wrong data format on \"Mobile Number\" field on \"Account Info\" section  _28",dataProvider = "MobileNumber", dataProviderClass = DataAccountSetting.class)
    public void AccountSettingTest_TC019(String email,String password,String mobile) {
        accountSettingPage.AccountSetting_TC019(email,password,mobile);
        Assert.assertEquals(accountSettingPage.verifyMobileInvalidMess(),"Please add valid Mobile Number.");
    }

    @Test(priority = 20, description = "User enter wrong data format on \"Email address\" field on \"Account Info\" section  _29",dataProvider = "EmailAddress", dataProviderClass = DataAccountSetting.class)
    public void AccountSettingTest_TC020(String email,String password,String emailaddress) {
        accountSettingPage.AccountSetting_TC020(email,password,emailaddress);
        Assert.assertEquals(accountSettingPage.verifyEmailInvalidMess(),"The email field must be a valid email");
    }

    @Test(priority = 21, description = "Verify user click Logout _31",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC021(String email,String password) {
        accountSettingPage.AccountSetting_TC021(email,password);
        Assert.assertEquals(accountSettingPage.verifyLoginHeader(),"LOG IN");
    }

    @Test(priority = 22, description = "Verify user not enter Current Password _37",dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC022(String email,String password) {
        accountSettingPage.AccountSetting_TC022(email,password,"Testing123@");
        Assert.assertEquals(accountSettingPage.verifyCurrPassReqMess(),"This field is a required field");
    }

    @Test(priority = 23, description = "Verify user not enter New Password _38", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC023(String email,String password) {
        accountSettingPage.AccountSetting_TC023(email,password,"Testing1234@");
        Assert.assertEquals(accountSettingPage.verifyNewPassReqMess(),"This field is a required field");
    }

    @Test(priority = 24, description = "Verify user not enter Confirm New Password _39", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC024(String email,String password) {
        accountSettingPage.AccountSetting_TC024(email,password,"Testing1234@");
        Assert.assertEquals(accountSettingPage.verifyConfPassReqMess(),"This field is a required field");
    }

    @Test(priority = 25, description = "Verify system in case enter \"Current Password/New Password/Confirm New Password\" with max length of 21char _40", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC025(String email,String password) {
        accountSettingPage.AccountSetting_TC025(email,password,"333333333333333333333","212122222222222222222","212122222222222222222");
        Assert.assertEquals(accountSettingPage.verifyCurrPassExceedMess(),"Your Current Password must not exceed 20 characters.");
        Assert.assertEquals(accountSettingPage.verifyNewPassExceedMess(),"Your New Password must not exceed 20 characters.");
        Assert.assertEquals(accountSettingPage.verifyConfPassExceedMess(),"Your Confirm Password must not exceed 20 characters.");
    }

    @Test(priority = 26, description = "Verify user enter data for  \"Current Password/New password/Confirm New Password\" < 6 Characters _41", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AccountSettingTest_TC026(String email,String password) {
        accountSettingPage.AccountSetting_TC026(email,password,"12345","12346","12346");
        Assert.assertEquals(accountSettingPage.verifyCurrPassLeastMess(),"Current Password must have at least 6 characters");
        Assert.assertEquals(accountSettingPage.verifyNewPassLeastMess(),"New Password must have at least 6 characters");
        Assert.assertEquals(accountSettingPage.verifyConfPassLeastMess(),"Confirm Password must have at least 6 characters");
    }

}
