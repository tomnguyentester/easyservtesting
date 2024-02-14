package com.easyserv.pages.BookingServicePage.CustomerNotAccess;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class EnquiriesPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;
    String URL = "https://motorserve-booking.siliconstack.com.au/";

    private By enquiriIcon = By.xpath("//a[@class='ant-typography btn btn-primary']//div[@class='ant-card ant-card-bordered icon-button']");
    private By enquiriHeader = By.xpath("//span[contains(text(),'GENERAL ENQUIRIES')]");
    private By enquiriText = By.xpath("//p[contains(text(),'Please provide a brief message and your contact de')]");
    private By selectStoreDrop = By.xpath("//div[@class='ant-form-item-control-input-content']");
    private By firtName = By.xpath("//input[@id='basic_firstName']");
    private By lastName = By.xpath("//input[@id='basic_lastName']");
    private By phoneNumber = By.xpath("//input[@id='basic_mobileNumber']");
    private By Email = By.xpath("//input[@id='basic_email']");
    private By postCode = By.xpath("//div[@class='ant-form-item-control-input-content']//span//input[@type='text']");
    private By yourEnquiry = By.xpath("//textarea[@id='basic_note']");
    private By sendButton = By.xpath("//button[@type='submit']");
    private By backButton = By.xpath("//span[contains(text(),'Back')]");
    private By firtNameReqMess = By.xpath("//div[contains(text(),'Your First Name must not exceed 50 characters.')]");
    private By lastNameReqMess = By.xpath("//div[contains(text(),'Your Last Name must not exceed 50 characters.')]");
    private By phoneReqMess = By.xpath("//div[contains(text(),'Your Phone number must not exceed 20 characters.')]");
    private By emailReqMess = By.xpath("//div[contains(text(),'Your Email must not exceed 50 characters.')]");
    private By postCodeReqMess = By.xpath("//div[contains(text(),'The postCode field must be 4 characters')]");
    private By phoneMess = By.xpath("//div[contains(text(),'Please add valid Phone Number.')]");
    private By emailMes = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By postMess = By.xpath("//div[contains(text(),'No valid post code found.')]");
    private By yourEnquMess = By.xpath("//div[contains(text(),'The enquiries field is required')]");
    private By artarmonStore = By.xpath("//div[contains(text(),'Artarmon')]");
    private By enquirySend = By.xpath("//p[contains(text(),'ENQUIRY SENT')]");
    private By doneButton = By.xpath("//span[normalize-space()='Done']");
    private By homeHeader = By.xpath("//span[contains(text(),'BOOK A SERVICE')]");
    private By privacyURL = By.xpath("//a[@class='ant-typography url-privacy']");
    private By privacyHeader = By.xpath("//h1[contains(text(),'Motorserve Privacy Policy')]");



    public EnquiriesPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void EnquiriePage_TC001(){
        validateHelper.clickElement(enquiriIcon);
    }

    public void EnquiriePage_TC002(String firstname,String lastname,String phonenumber,String email,String postcode){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(firtName,firstname);
        validateHelper.setText(lastName,lastname);
        validateHelper.setText(phoneNumber,phonenumber);
        validateHelper.setText(Email,email);
        validateHelper.movetoElement(postCode);
        validateHelper.setText(postCode,postcode);
    }

    public void EnquiriePage_TC003(String phonenumber,String email,String postcode,String yourEnq){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(phoneNumber,phonenumber);
        validateHelper.setText(Email,email);
        validateHelper.movetoElement(postCode);
        validateHelper.setText(yourEnquiry,yourEnq);
        validateHelper.clearText(yourEnquiry);
        validateHelper.setText(postCode,postcode);
    }

    public void EnquiriePage_TC004(String firstname,String lastname,String phonenumber,String email,String postcode,String yourEnqui){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.clickElement(selectStoreDrop);
        validateHelper.clickElement(artarmonStore);
        validateHelper.setText(firtName,firstname);
        validateHelper.setText(lastName,lastname);
        validateHelper.setText(phoneNumber,phonenumber);
        validateHelper.setText(Email,email);
        validateHelper.movetoElement(postCode);
        validateHelper.setText(postCode,postcode);
        validateHelper.setText(yourEnquiry,yourEnqui);
        validateHelper.clickElement(sendButton);
    }

    public void EnquiriePage_TC005(String firstname,String lastname,String phonenumber,String email,String postcode,String yourEnqui){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.clickElement(selectStoreDrop);
        validateHelper.clickElement(artarmonStore);
        validateHelper.setText(firtName,firstname);
        validateHelper.setText(lastName,lastname);
        validateHelper.setText(phoneNumber,phonenumber);
        validateHelper.setText(Email,email);
        validateHelper.movetoElement(postCode);
        validateHelper.setText(postCode,postcode);
        validateHelper.setText(yourEnquiry,yourEnqui);
        validateHelper.clickElement(sendButton);
        validateHelper.clickElement(backButton);
    }

    public void EnquiriePage_TC006(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.clickElement(privacyURL);
        validateHelper.SwitchBrowser();
    }

    public String verifyPrivacyHeader(){
        String priv = validateHelper.checkText(privacyHeader);
        System.out.println("Printer Privacy Header : " +priv);
        return priv;
    }

    public String verifYourEnquiReqMess(){
        String enq = validateHelper.checkText(yourEnquMess);
        System.out.println("Printer Your Enquiry Required Message : " +enq);
        return enq;
    }

    public String verifyHomeHeader(){
        String home = validateHelper.checkText(homeHeader);
        System.out.println("Printer Home Header : " +home);
        return home;
    }
    public String verifyEnquirySentHeader(){
        String enqsent = validateHelper.checkText(enquirySend);
        System.out.println("Printer Enquiry Sent Header : " +enqsent);
        return enqsent;
    }

    public String verifyPostCodeAlert(){
        String posReq = validateHelper.checkText(postMess);
        System.out.println("Printer Post Code Require Message : " +posReq);
        return posReq;
    }

    public String verifyPhoneNumberAlert(){
        String phoneReq = validateHelper.checkText(phoneMess);
        System.out.println("Printer Phone Require Message : " +phoneReq);
        return phoneReq;
    }

    public String verifyEmailAlert(){
        String emailReq = validateHelper.checkText(emailMes);
        System.out.println("Printer Email Require Message : " +emailReq);
        return emailReq;
    }


    public String verifyPostCodeReqMessage(){
        String postReq = validateHelper.checkText(postCodeReqMess);
        System.out.println("Printer PostCode Require Message : " +postReq);
        return postReq;
    }

    public String verifyEmailReqMessage(){
        String emailReq = validateHelper.checkText(emailReqMess);
        System.out.println("Printer Email Require Message : " +emailReq);
        return emailReq;
    }

    public String verifyPhoneNumberReqMessage(){
        String phoneReq = validateHelper.checkText(phoneReqMess);
        System.out.println("Printer Phone Require Message : " +phoneReq);
        return phoneReq;
    }

    public String verifyLastNameReqMessage(){
        String lastnameReq = validateHelper.checkText(lastNameReqMess);
        System.out.println("Printer LastName Require Message : " +lastnameReq);
        return lastnameReq;
    }

    public String verifyFirtNameReqMessage(){
        String firtnameReq = validateHelper.checkText(firtNameReqMess);
        System.out.println("Printer FirtName Require Message : " +firtnameReq);
        return firtnameReq;
    }
    public boolean verifyStatusSendButton(){
        boolean sendbt = validateHelper.enableElement(sendButton);
        System.out.println("Printer Status Send Button :" + sendbt);
        return  sendbt;
    }
    public boolean verifyStatusYourEnqiryField(){
        boolean yourEnq = validateHelper.enableElement(yourEnquiry);
        System.out.println("Printer Status Your Enquiry field :" + yourEnq);
        return  yourEnq;
    }

    public boolean verifyStatusEmailField(){
        boolean emailfield = validateHelper.enableElement(Email);
        System.out.println("Printer Status email field :" + emailfield);
        return  emailfield;
    }

    public boolean verifyStatusLastNameField(){
        boolean lastname = validateHelper.enableElement(lastName);
        System.out.println("Printer Status last name :" + lastname);
        return  lastname;
    }

    public boolean verifyStatusFirtNameField(){
        boolean firstname = validateHelper.enableElement(firtName);
        System.out.println("Printer Status first name :" + firstname);
        return  firstname;
    }

    public boolean verifySelectStore(){
        boolean selectStore = validateHelper.enableElement(selectStoreDrop);
        System.out.println("Printer Status Select Store :" +selectStore);
        return  selectStore;
    }

    public String verifyEnquiryHeader(){
        String enquiry = validateHelper.checkText(enquiriHeader);
        System.out.println("Printer Enquiry Header :" +enquiry);
        return  enquiry;
    }
}
