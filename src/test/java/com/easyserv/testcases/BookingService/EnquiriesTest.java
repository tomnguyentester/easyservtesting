package com.easyserv.testcases.BookingService;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.DataBookingService;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.BookingServicePage.CustomerNotAccess.EnquiriesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EnquiriesTest extends BaseSetup {
    private WebDriver driver;
    private EnquiriesPage enquiriesPage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;

    private By doneButton = By.xpath("//span[normalize-space()='DONE']");
    @BeforeClass
    public void setup(){
        driver = getDriver();
        enquiriesPage = new EnquiriesPage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1,description = "Verify UI for \"General Enquiries\" form _003")
    public void EnquiriesTest_TC001(){
        enquiriesPage.EnquiriePage_TC001();
        Assert.assertEquals(enquiriesPage.verifyEnquiryHeader(),"GENERAL ENQUIRIES");
        Assert.assertTrue(enquiriesPage.verifySelectStore(),"Select Store Not Avaible");
        Assert.assertTrue(enquiriesPage.verifyStatusFirtNameField(),"First Name Not Avaible");
        Assert.assertTrue(enquiriesPage.verifyStatusLastNameField(),"Last Name Not Avaible");
        Assert.assertTrue(enquiriesPage.verifyStatusEmailField(),"Email Not Avaible");
        Assert.assertTrue(enquiriesPage.verifyStatusYourEnqiryField(),"Your Enquiry Not Avaible");
        Assert.assertFalse(enquiriesPage.verifyStatusSendButton(),"Send Button is Avaible");
    }

    @Test(priority = 2,dataProvider = "data_enqiry_1", dataProviderClass = DataBookingService.class, description = "Verify validation message for case \"max length\" screen _014")
    public void EnquiriesTest_TC002(String firstname,String lastname,String phonenumber,String email,String postcode){
        enquiriesPage.EnquiriePage_TC002(firstname,lastname,phonenumber,email,postcode);
        Assert.assertEquals(enquiriesPage.verifyFirtNameReqMessage(),"Your First Name must not exceed 50 characters.");
        Assert.assertEquals(enquiriesPage.verifyLastNameReqMessage(),"Your Last Name must not exceed 50 characters.");
        Assert.assertEquals(enquiriesPage.verifyPhoneNumberReqMessage(),"Your Phone number must not exceed 20 characters.");
        Assert.assertEquals(enquiriesPage.verifyEmailReqMessage(),"Your Email must not exceed 50 characters.");
        Assert.assertEquals(enquiriesPage.verifyPostCodeReqMessage(),"The postCode field must be 4 characters");

    }

    @Test(priority = 3,dataProvider = "data_enqiry_2", dataProviderClass = DataBookingService.class,description = "Verify validation message for case Enter invalid for \"PhoneNumber/Email/Postcode\" _014")
    public void EnquiriesTest_TC003(String phonenumber,String email,String postcode,String yourEnq){
        enquiriesPage.EnquiriePage_TC003(phonenumber,email,postcode,yourEnq);
        Assert.assertEquals(enquiriesPage.verifyPhoneNumberAlert(),"Please add valid Phone Number.");
        Assert.assertEquals(enquiriesPage.verifyEmailAlert(),"The email field must be a valid email");
        Assert.assertEquals(enquiriesPage.verifYourEnquiReqMess(),"The enquiries field is required");
        Assert.assertEquals(enquiriesPage.verifyPostCodeAlert(),"No valid post code found.");
    }

    @Test(priority = 4,dataProvider = "data_enqiry_3", dataProviderClass = DataBookingService.class,description = "Verify that system will send infor is success when user fill full required field _015")
    public void EnquiriesTest_TC004(String firstname,String lastname,String phonenumber,String email,String postcode,String yourEnqui){
        enquiriesPage.EnquiriePage_TC004(firstname,lastname,phonenumber,email,postcode,yourEnqui);
        Assert.assertEquals(enquiriesPage.verifyEnquirySentHeader(),"ENQUIRY SENT");
        validateHelper.clickElement(doneButton);
        Assert.assertEquals(enquiriesPage.verifyHomeHeader(),"BOOK A SERVICE");
    }

    @Test(priority = 5,dataProvider = "data_enqiry_3", dataProviderClass = DataBookingService.class,description = "Verify that system will back to \"Landing_Page\" screen when user click on \"Back\" button on \"Enquiry Sent\" screen _016")
    public void EnquiriesTest_TC005(String firstname,String lastname,String phonenumber,String email,String postcode,String yourEnqui){
        enquiriesPage.EnquiriePage_TC005(firstname,lastname,phonenumber,email,postcode,yourEnqui);
        Assert.assertEquals(enquiriesPage.verifyHomeHeader(),"BOOK A SERVICE");
    }

    @Test(priority = 6, description = "Verify that system will landing to \"Privacy Policy\" page when user click \"Silicon Stack Privacy Policy\" link _017")
    public void EnquiriesTest_TC006(){
        enquiriesPage.EnquiriePage_TC006();
        Assert.assertEquals(enquiriesPage.verifyPrivacyHeader(),"MOTORSERVE PRIVACY POLICY");
    }
}
