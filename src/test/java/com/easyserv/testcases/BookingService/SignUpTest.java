package com.easyserv.testcases.BookingService;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.DataBookingService;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.BookingServicePage.CustomerAccess.LoginBookingPage;
import com.easyserv.pages.BookingServicePage.CustomerNotAccess.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpTest extends BaseSetup {
    private WebDriver driver;
    private SignUpPage signUpPage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;

    private By firstname = By.xpath("//input[@id='firstName']");
    private By lastname = By.xpath("//input[@id='lastName']");
    private By email = By.xpath("//input[@id='email']");
    private By password = By.xpath("//input[@id='password']");
    private By phonenumber = By.xpath("//input[@id='phoneNumber']");

    @BeforeClass
    public void setup(){
        driver = getDriver();
        signUpPage = new SignUpPage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify user can click on <Sign Up> hyperlink on the <LOGIN TO YOUR ACCOUNT> screen  _001,002")
    public void SignUpTest_TC001() {
        signUpPage.SignUp_TC001();
        Assert.assertEquals(signUpPage.verifySignUpHeader(),"SIGN UP TO MOTORSERVE");
    }

    @Test(priority = 2, description = "Verify user can input free-text for <First Name> textbox on \"Sign Up\" screen  _003")
    public void SignUpTest_TC002() {
        signUpPage.SignUp_TC002();
        Assert.assertTrue(signUpPage.verifyStatusFirtNameBox());
        validateHelper.setText(firstname,"Anh123@");
    }

    @Test(priority = 3, description = "Verify user can input free-text for <Last Name> textbox on \"Sign Up\" screen  _004")
    public void SignUpTest_TC003() {
        signUpPage.SignUp_TC003();
        Assert.assertTrue(signUpPage.verifyStatusLastNameBox());
        validateHelper.setText(lastname,"Nguyễn-22&");
    }

    @Test(priority = 4, description = "Verify user can input free-text for <Email> textbox on \"Sign Up\" screen  _005")
    public void SignUpTest_TC004() {
        signUpPage.SignUp_TC004();
        Assert.assertTrue(signUpPage.verifyStatusEmailBox());
        validateHelper.setText(email,"tuyetanh@gmail.com");
    }

    @Test(priority = 5, description = "Verify user can input free-text for <Password> textbox on \"Sign Up\" screen  _006")
    public void SignUpTest_TC005() {
        signUpPage.SignUp_TC005();
        Assert.assertTrue(signUpPage.verifyStatusPasswordBox());
        validateHelper.setText(password,"123*0#");
    }

    @Test(priority = 6, description = "Verify user can input free-text for <Phone Number> textbox on \"Sign Up\" screen  _007")
    public void SignUpTest_TC006() {
        signUpPage.SignUp_TC006();
        Assert.assertTrue(signUpPage.verifyStatusPhoneBox());
        validateHelper.setText(phonenumber,"0652abc%$#");
    }

    @Test(priority = 7, description = "Verify user click on \"Eye Password\" icon on <Password> textbox  _009")
    public void SignUpTest_TC007() {
        signUpPage.SignUp_TC007("123423");
        Assert.assertEquals(signUpPage.verifyValueOfPassword(),"123423");
    }

    @Test(priority = 8, description = "Verify user can click on <Motorserve Privacy Policy> hyperlink with a label <By clicking Sign Up, you have read and agreed to the> on \"Sign Up\" screen  _010")
    public void SignUpTest_TC008() {
        signUpPage.SignUp_TC008();
        Assert.assertEquals(signUpPage.verifyPrivacyHeader(),"MOTORSERVE PRIVACY POLICY");
    }

    @Test(priority = 9, description = "Verify user can click <Log in> hyperlink on \"Sign Up\" screen  _013")
    public void SignUpTest_TC009() {
        signUpPage.SignUp_TC009();
        Assert.assertEquals(signUpPage.verifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 10, description = "Verify user can click \"Back\" icon on \"Sign Up\" screen  _014")
    public void SignUpTest_TC010() {
        signUpPage.SignUp_TC010();
        Assert.assertEquals(signUpPage.verifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 11, description = "Verify user input invalid data for all fields on \"Sign Up\" screen _032",dataProvider = "dataLength_SignUp", dataProviderClass = DataBookingService.class)
    public void SignUpTest_TC011(String firstName_,String lastName_,String email_,String password_,String phoneNumber_) {
        signUpPage.SignUp_TC011(firstName_,lastName_,email_,password_,phoneNumber_);
        //Assert.assertEquals(signUpPage.verifyFirtNameReqMessage(),"Your First name must not exceed 50 characters");
        Assert.assertEquals(signUpPage.verifyLastNameInvalidMessage(),"Your Last name must not exceed 50 characters.");
        Assert.assertEquals(signUpPage.verifyEmailInvalidMessage(),"The email field must be a valid email");
        Assert.assertEquals(signUpPage.verifyPhoneNumberInvalidMessage(),"Please add valid Phone Number.");
    }

    @Test(priority = 12, description = "Verify User remove all data for <First name> textbox on \"Sign Up\" screen _033",dataProvider = "dataValid_SignUp", dataProviderClass = DataBookingService.class)
    public void SignUpTest_TC012(String firstName_,String lastName_,String email_,String password_,String phoneNumber_) {
        signUpPage.SignUp_TC012(firstName_,lastName_,email_,password_,phoneNumber_);
        Assert.assertEquals(signUpPage.verifyFirtNameReqMessage(),"Your First name is required");
    }

    @Test(priority = 13, description = "Verify User remove all data for <Last name> textbox on \"Sign Up\" screen _035",dataProvider = "dataValid_SignUp", dataProviderClass = DataBookingService.class)
    public void SignUpTest_TC013(String firstName_,String lastName_,String email_,String password_,String phoneNumber_) {
        signUpPage.SignUp_TC013(firstName_,lastName_,email_,password_,phoneNumber_);
        Assert.assertEquals(signUpPage.verifyLastNameReqMessage(),"Your Last name is required");
    }

    @Test(priority = 14, description = "Verify User remove all data for <Email> textbox on \"Sign Up\" screen _037",dataProvider = "dataValid_SignUp", dataProviderClass = DataBookingService.class)
    public void SignUpTest_TC014(String firstName_,String lastName_,String email_,String password_,String phoneNumber_) {
        signUpPage.SignUp_TC014(firstName_,lastName_,email_,password_,phoneNumber_);
        Assert.assertEquals(signUpPage.verifyEmailReqMessage(),"Your Email is required");
    }

    @Test(priority = 15, description = "Verify User input wrong format data  for <Email> textbox on \"Sign Up\" screen _039",dataProvider = "dataFormat_Email", dataProviderClass = DataBookingService.class)
    public void SignUpTest_TC015(String firstName_,String lastName_,String email_) {
        signUpPage.SignUp_TC015(firstName_,lastName_,email_);
        Assert.assertEquals(signUpPage.verifyEmailInvalidMessage(),"The email field must be a valid email");
    }

    @Test(priority = 16, description = "Verify User input Email address is duplicated with another Customer’s address _040",dataProvider = "dataEmailExists_SignUp", dataProviderClass = DataBookingService.class)
    public void SignUpTest_TC016(String firstName_,String lastName_,String email_,String password_,String phoneNumber_) {
        signUpPage.SignUp_TC016(firstName_,lastName_,email_,password_,phoneNumber_);
        Assert.assertEquals(signUpPage.verifyEmailExistMessage(),"Email already exists. Please login or use another email to continue.");
    }

    @Test(priority = 17, description = "Verify User remove all data for <Password> textbox on \"Sign Up\" screen _041",dataProvider = "dataEmailExists_SignUp", dataProviderClass = DataBookingService.class)
    public void SignUpTest_TC017(String firstName_,String lastName_,String email_,String password_,String phoneNumber_) {
        signUpPage.SignUp_TC017(firstName_,lastName_,email_,password_,phoneNumber_);
        Assert.assertEquals(signUpPage.verifyPassReqMessage(),"The password field is required");
    }

    @Test(priority = 18, description = "Verify User input less than 6 characters for <Password> textbox on \"Sign Up\" screen _042")
    public void SignUpTest_TC018() {
        signUpPage.SignUp_TC018("12345");
        Assert.assertEquals(signUpPage.verifyPassLongerReqMessage(),"The password must be longer than or equal to 6 character");
    }

    @Test(priority = 19, description = "Verify user input invalid data for <Phone Number> textbox _045,46,47,48,49,50,51,52",dataProvider = "dataInvalidPhone_SignUp", dataProviderClass = DataBookingService.class)
    public void SignUpTest_TC019(String firstName_,String lastName_,String email_,String password_,String phoneNumber_) {
        signUpPage.SignUp_TC019(firstName_,lastName_,email_,password_,phoneNumber_);
        Assert.assertEquals(signUpPage.verifyPhoneNumberInvalidMessage(),"Please add valid Phone Number.");
    }

    @Test
    public void testcase3(){
        boolean DataAvailable=false;
        System.out.println("Test Case3 - Conditional Skip");
        if(!DataAvailable)
            throw new SkipException("Skipping this exception");
        System.out.println("Executed Successfully");
    }
}
