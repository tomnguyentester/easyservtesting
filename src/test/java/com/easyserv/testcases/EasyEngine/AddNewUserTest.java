package com.easyserv.testcases.EasyEngine;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.EasyEngine.DataAccountSetting;
import com.easyserv.dataprovider.EasyEngine.DataLogin;
import com.easyserv.pages.EasyservEnginePages.AccountSettingPage;
import com.easyserv.pages.EasyservEnginePages.AddNewUserPage;
import net.datafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Locale;

public class AddNewUserTest extends BaseSetup {
    private WebDriver driver;
    private AddNewUserPage addNewUserPage;
    private ValidateHelper validateHelper;
    Faker faker = new Faker(new Locale("AUS"));
    String firtname_ = faker.name().firstName();
    String lastname_ = faker.name().lastName();
    String job_ = faker.job().position();
    String emailAdd_ = firtname_.toLowerCase() + lastname_.toLowerCase() +"@gmail.com";
    String mobiphone_ = faker.phoneNumber().subscriberNumber(10);


    private By permissTab = By.xpath("//div[@id='rc-tabs-0-tab-two-columns-tabs-tab-permissions']");
    private By firstName = By.xpath("//input[@id='firstName']");
    private By lastName = By.xpath("//input[@id='lastName']");
    private By jobTitle = By.xpath("//input[@id='jobTitle']");
    private By emailAddress = By.xpath("//input[@id='email']");
    private By mobileNum = By.xpath("//div[@data-label='Mobile Number']//input[@placeholder='Enter mobile number']");

    @BeforeClass
    public void setup() {
        driver = getDriver();
        addNewUserPage = new AddNewUserPage(driver);
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify Ui Add New User screen is correct design  _001", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC001(String email, String password) {
        addNewUserPage.AddNewUser_TC001(email, password);
        Assert.assertTrue(addNewUserPage.verifyStatusFirstNameField());
        Assert.assertTrue(addNewUserPage.verifyStatusLastNameField());
        Assert.assertTrue(addNewUserPage.verifyStatusJobTitle());
        Assert.assertTrue(addNewUserPage.verifyStatusEmailAddressField());
    }

    @Test(priority = 2, description = "Verify system disable \"Permissions\" tab when user when the user has not been successfully added _003", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC002(String email, String password) {
        addNewUserPage.AddNewUser_TC002(email, password);
        Assert.assertEquals(addNewUserPage.verifyStausPermissionTab(), "true");
        validateHelper.HoverAction(driver, permissTab);
        validateHelper.clickElement(permissTab);
    }

    @Test(priority = 3, description = "Verify that the system will jump to [Add New User] screen when user click on [Add User] button _004", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC003(String email, String password) {
        addNewUserPage.AddNewUser_TC003(email, password);
        Assert.assertEquals(addNewUserPage.verifyNewUserTitle(), "New User");
    }

    @Test(priority = 4, description = "Verify that the system will back to [User Management] list when user click on [<-] icon _005", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC004(String email, String password) {
        addNewUserPage.AddNewUser_TC004(email, password);
        Assert.assertEquals(addNewUserPage.verifyUserManagementTitle(), "User Management");
    }

    @Test(priority = 5, description = "Verify user can enter valid data some field on \"Add New User\" screen _006", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC005(String email, String password) {
        addNewUserPage.AddNewUser_TC005(email, password);
        Assert.assertTrue(addNewUserPage.verifyStatusFirstNameField());
        validateHelper.setText(firstName, "Nguyen");
        Assert.assertTrue(addNewUserPage.verifyStatusLastNameField());
        validateHelper.setText(lastName, "Thai");
        Assert.assertTrue(addNewUserPage.verifyStatusJobTitle());
        validateHelper.setText(jobTitle, "Testing");
        Assert.assertTrue(addNewUserPage.verifyStatusEmailAddressField());
        validateHelper.setText(emailAddress, "thai3@gmail.com");
        Assert.assertTrue(addNewUserPage.verifyStatusMobileNumberField());
        validateHelper.setText(mobileNum, "0123456789");
    }

    @Test(priority = 6, description = "Verify user click on \"Cancel\" button on \"Add New User screenn _007", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC006(String email, String password) {
        addNewUserPage.AddNewUser_TC006(email, password, "Anh", "anh123@gmail.com");
        Assert.assertEquals(addNewUserPage.verifyUserManagementTitle(), "User Management");
    }

    @Test(priority = 7, description = "Verify user enter valid data all required fileds on \"Add New User\" screen _009,_010,_011", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC007(String email, String password) {
        addNewUserPage.AddNewUser_TC007(email, password, firtname_, lastname_, job_, emailAdd_, mobiphone_);
        Assert.assertEquals(addNewUserPage.verifyAddUserSuccessMess(),"Item has been successfully created");
        Assert.assertEquals(addNewUserPage.verifyPermissionsTitle(),"Permissions");
        Assert.assertEquals(addNewUserPage.verifyContryInfo(),"Australia");
        Assert.assertEquals(addNewUserPage.verifyDepartmentInfo(),"Accounting");
    }

    @Test(priority = 8, description = "Remove all data on \"First Name\" field on \"Add New User\" section _013", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC008(String email, String password) {
        addNewUserPage.AddNewUser_TC008(email, password, firtname_);
        Assert.assertEquals(addNewUserPage.verifyFirtNameReqMess(),"The First Name field is required");
    }

    @Test(priority = 9, description = "Remove all data on \"Last Name\" field on \"Add New User\" section _015", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC009(String email, String password) {
        addNewUserPage.AddNewUser_TC009(email, password, lastname_);
        Assert.assertEquals(addNewUserPage.verifyLastNameReqMess(),"The Last Name field is required");
    }

    @Test(priority = 10, description = "Remove all data on \"Job title\" field on \"Add New User\" section _017", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC010(String email, String password) {
        addNewUserPage.AddNewUser_TC010(email, password, job_);
        Assert.assertEquals(addNewUserPage.verifyJobTitleReqMess(),"The Job Title field is required");
    }

    @Test(priority = 11, description = "Remove all data on \"Email address\" field on \"Add New User\" section _019", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC011(String email, String password) {
        addNewUserPage.AddNewUser_TC011(email, password, emailAdd_);
        Assert.assertEquals(addNewUserPage.verifyEmailAddressReqMess(),"The Email Address field is required");
    }

    @Test(priority = 12, description = "Remove all data on \"Mobile Number\" field on \"Add New User\" section _021", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC012(String email, String password) {
        addNewUserPage.AddNewUser_TC012(email, password, mobiphone_);
        Assert.assertEquals(addNewUserPage.verifyMobileReqMess(),"The Mobile Number field is required");
    }

    @Test(priority = 13, description = "Remove all data on \"Department\" field on \"Add New User\" section _023", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC013(String email, String password) {
        addNewUserPage.AddNewUser_TC013(email, password);
        Assert.assertEquals(addNewUserPage.verifyDepartmentReqMess(),"At least one department must be selected");
    }

    @Test(priority = 14, description = "User enter more than 5 Department on \"Department\" field on \"Add New User\" section _024", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC014(String email, String password) {
        addNewUserPage.AddNewUser_TC014(email, password);
        Assert.assertEquals(addNewUserPage.verifyDepartmentMoreThanMess(),"Cannot select more than 5 departments.");
    }

    @Test(priority = 15, description = "Verify user enter <Email Address> OR <Mobile Number> is already existed then system _025", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC015(String email, String password) {
        addNewUserPage.AddNewUser_TC015(email, password,firtname_,lastname_,job_,"","");
        //Assert.assertEquals(addNewUserPage.verifyDepartmentMoreThanMess(),"Cannot select more than 5 departments.");
    }

    @Test(priority = 16, description = "Verify user can not enter wrong data format on \"Mobile Number\" field on \"Add New User\" section _026", dataProvider = "Mobile", dataProviderClass = DataAccountSetting.class)
    public void AddNewUserTest_TC016(String email, String password,String mobilenum) {
        addNewUserPage.AddNewUser_TC016(email, password,mobilenum);
        Assert.assertEquals(addNewUserPage.verifyMobileMess(),"Please add valid Mobile Number.");
    }

    @Test(priority = 17, description = "Verify user can not enter wrong data format on \"email address\" field on \"Add New User\" section _027", dataProvider = "EmailAddress", dataProviderClass = DataAccountSetting.class)
    public void AddNewUserTest_TC017(String email, String password,String emailAdd) {
        addNewUserPage.AddNewUser_TC017(email, password,emailAdd);
        Assert.assertEquals(addNewUserPage.verifyemailValidMess(),"The email field must be a valid email");
    }

    @Test(priority = 18, description = "Verify user enter <Email Address> OR <Mobile Number> is already existed then system _025", dataProvider = "AccountInfo", dataProviderClass = DataLogin.class)
    public void AddNewUserTest_TC018(String email, String password) {
        addNewUserPage.AddNewUser_TC018(email, password,
                "testing",
                "nguyen",
                "PR",
                "testingtom09@gmail.com",
                "0938669429");
        Assert.assertEquals(addNewUserPage.verifyemailExistedMess(),"Email Address already existed. Please try again");
        Assert.assertEquals(addNewUserPage.verifymobileExistedMess(),"Mobile Number already existed. Please try again");
    }
}
