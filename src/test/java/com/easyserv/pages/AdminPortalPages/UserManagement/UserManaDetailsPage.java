package com.easyserv.pages.AdminPortalPages.UserManagement;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserManaDetailsPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By configMenu = By.xpath("//span[contains(text(),'Configuration')]");
    private By userManaMenu = By.xpath("//a[contains(text(),'User Management')]");
    private By nameCol = By.xpath("//tbody/tr[2]/td[2]");
    private By contactInfoTitler = By.xpath("//h4[contains(text(),'Contact Information')]");
    private By userDetailTab = By.xpath("//div[contains(text(),'User Detail')]");
    private By firstName = By.xpath("//input[@id='firstName']");
    private By lastName = By.xpath("//input[@id='lastName']");
    private By phoneNumber = By.xpath("//input[@id='phoneNumber']");
    private By emailbox = By.xpath("//input[@id='email']");
    private By address = By.xpath("//input[@id='addressLine1']");
    private By postCode = By.xpath("//body/div[@id='__next']/section[1]/section[1]/div[1]/div[2]/main[1]/section[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]");
    private By cancelBt = By.xpath("//button[@class='ant-btn ant-btn-default']");
    private By saveBt = By.xpath("//button[@type='submit']");
    private By firtnameReq = By.xpath("//div[contains(text(),'The firstName field is required')]");
    private By lastnameReq = By.xpath("//div[contains(text(),'The lastName field is required')]");
    private By emailReq = By.xpath("//div[contains(text(),'The email field is required')]");
    private By phoneValidMess = By.xpath("//div[contains(text(),'Please add valid Phone Number.')]");
    private By emailValidMess = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By postcodeValidMess = By.xpath("//div[contains(text(),'No valid post code found')]");
    private By emailExistsAlert = By.xpath("//div[@class='ant-notification-notice-message']");
    private By suburb = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-status-success ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By selectAllambie = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Allambie']");
    private By SubAllambie = By.xpath("//span[@title='Allambie']");
    private By nodataText = By.xpath("//div[contains(text(),'No data')]");
    private By successMess = By.xpath("//div[@class='ant-notification-notice-message']");//div[@class='ant-notification-notice-message']
    private By backBt = By.xpath("//span[@aria-label='arrow-left']//*[name()='svg']");
    private By userManaHeader = By.xpath("//span[@title='User Management']");
    private By addUser = By.xpath("//span[contains(text(),'Add User')]");
    private By addUserTitle = By.xpath("//span[contains(text(),'Add New User')]");
    private By addButton = By.xpath("//button[@type='submit']");
    private By addSuccesMess = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");

    public UserManaDetailsPage(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void UserManaDetails_TC001(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(nameCol);
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC002(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(nameCol);
        validateHelper.clickElement(firstName);
        validateHelper.clearText(firstName);
        validateHelper.clickElement(lastName);
        validateHelper.clearText(lastName);
        validateHelper.clickElement(emailbox);
        validateHelper.clearText(emailbox);
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC003(String email,String password,String phonenum_,String email_,String postcode_){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(nameCol);
        validateHelper.clickElement(phoneNumber);
        validateHelper.clearText(phoneNumber);
        validateHelper.setText(phoneNumber,phonenum_);
        validateHelper.clickElement(emailbox);
        validateHelper.clearText(emailbox);
        validateHelper.setText(emailbox,email_);
        validateHelper.clickElement(postCode);
        validateHelper.clearText(postCode);
        validateHelper.setText(postCode,postcode_);
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC004(String email,String password,String email_){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(nameCol);
        validateHelper.clickElement(emailbox);
        validateHelper.clearText(emailbox);
        validateHelper.setText(emailbox,email_);
        validateHelper.clickElement(saveBt);
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC005(String email,String password,String postCode_){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(nameCol);
        validateHelper.clickElement(postCode);
        validateHelper.clearText(postCode);
        validateHelper.setText(postCode,postCode_);
        validateHelper.clickElement(suburb);
        validateHelper.clickElement(selectAllambie);
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC006(String email,String password,String postCode_){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(nameCol);
        validateHelper.clickElement(postCode);
        validateHelper.clearText(postCode);
        validateHelper.setText(postCode,postCode_);
        validateHelper.clickElement(suburb);
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC007(String email,String password,String address_){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(nameCol);
        validateHelper.clickElement(address);
        validateHelper.clearText(address);
        validateHelper.setText(address,address_);
        validateHelper.movetoElement(saveBt);
        validateHelper.clickElement(saveBt);
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC008(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(nameCol);
        validateHelper.clickElement(backBt);;
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC009(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUser);
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC010(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUser);
        validateHelper.clickElement(saveBt);
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC011(String email,String password,String phonenum_,String email_,String postcode_){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUser);
        validateHelper.clickElement(phoneNumber);
        validateHelper.setText(phoneNumber,phonenum_);
        validateHelper.clickElement(emailbox);
        validateHelper.setText(emailbox,email_);
        validateHelper.clickElement(postCode);
        validateHelper.setText(postCode,postcode_);
        validateHelper.delay(2);
    }

    public void UserManaDetails_TC012(String email,String password,String firtName_,String lastName_,String phonenum_,String email_,String address_){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUser);
        validateHelper.clickElement(firstName);
        validateHelper.setText(firstName,firtName_);
        validateHelper.clickElement(lastName);
        validateHelper.setText(lastName,lastName_);
        validateHelper.clickElement(phoneNumber);
        validateHelper.setText(phoneNumber,phonenum_);
        validateHelper.clickElement(emailbox);
        validateHelper.setText(emailbox,email_);
        validateHelper.clickElement(address);
        validateHelper.setText(address,address_);
        validateHelper.clickElement(addButton);
        validateHelper.delay(4);
    }

    public void UserManaDetails_TC013(String email,String password,String firtName_,String lastName_,String phonenum_,String email_,String address_){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUser);
        validateHelper.clickElement(firstName);
        validateHelper.setText(firstName,firtName_);
        validateHelper.clickElement(lastName);
        validateHelper.setText(lastName,lastName_);
        validateHelper.clickElement(phoneNumber);
        validateHelper.setText(phoneNumber,phonenum_);
        validateHelper.clickElement(emailbox);
        validateHelper.setText(emailbox,email_);
        validateHelper.clickElement(address);
        validateHelper.setText(address,address_);
        validateHelper.clickElement(cancelBt);
        validateHelper.delay(2);
    }

    public String verifyContactInforTitle(){
        String contact = validateHelper.checkText(contactInfoTitler);
        System.out.println("Print Contact Title :" + contact);
        return  contact;
    }

    public String verifyUserDetailTitle(){
        String user_detail = validateHelper.checkText(userDetailTab);
        System.out.println("Print UserDetail Title :" + user_detail);
        return  user_detail;
    }

    public boolean verifyStatusFirstName(){
        boolean firtname = validateHelper.enableElement(firstName);
        System.out.println("Print status firstName button: "+ firtname);
        return firtname;
    }

    public boolean verifyStatusLastName(){
        boolean lastname = validateHelper.enableElement(lastName);
        System.out.println("Print status lastName button: " + lastname);
        return  lastname;
    }

    public boolean verifyStatusEmail(){
        boolean email_ = validateHelper.enableElement(emailbox);
        System.out.println("Print status email button: " + email_);
        return  email_;
    }

    public boolean verifyStatusCancelButton(){
        boolean cancel_bt = validateHelper.isDiplayedElement(cancelBt);
        System.out.println("Print status Cancel button: " + cancel_bt);
        return  cancel_bt;
    }

    public boolean verifyStatusSaveButton(){
        boolean save_bt = validateHelper.isDiplayedElement(saveBt);
        System.out.println("Print Status Save button: " + save_bt);
        return  save_bt;
    }

    public String verifyFirstNameReqMess(){
        String firtname_mess = validateHelper.checkText(firtnameReq);
        System.out.println("Printer FirstName Req Message :" +firtname_mess);
        return firtname_mess;
    }

    public String verifyLastNameReqMess(){
        String lastname_mess = validateHelper.checkText(lastnameReq);
        System.out.println("Printer LastName Req Message :" + lastname_mess);
        return lastname_mess;
    }

    public String verifyEmailReqMess(){
        String email_mess = validateHelper.checkText(emailReq);
        System.out.println("Printer Email Req Message :" + emailReq);
        return email_mess;
    }

    public String verifyPhoneValidMess(){
        String phone_mess = validateHelper.checkText(phoneValidMess);
        System.out.println("Printer Phone Valid Message :" + phone_mess);
        return phone_mess;
    }

    public String verifyEmailValidMess(){
        String email_mess = validateHelper.checkText(emailValidMess);
        System.out.println("Printer email Valid Message :" + email_mess);
        return email_mess;
    }

    public String verifyPostCodeInvalidMess(){
        String postcode = validateHelper.checkText(postcodeValidMess);
        System.out.println("Print Post Code Message :" +postcode);
        return postcode;
    }

    public String verifyEmailAlreadyExists(){
        String emailExis = validateHelper.checkText(emailExistsAlert);
        System.out.println("Print Email Exist Message :" + emailExis);
        return emailExis;
    }

    public String verifySuburb(){
        String sub_ = validateHelper.checkText(SubAllambie);
        System.out.println("Print Surb :" + sub_);
        return sub_;
    }

    public String verifySubNoData(){
        String nodata_ = validateHelper.checkText(nodataText);
        System.out.println("Print Nodata Text :" + nodata_);
        return nodata_;
    }

    public String verifySuccessMess(){
        String succ_mess = validateHelper.checkText(successMess);
        System.out.println("Print Success Mess :" + succ_mess);
        return succ_mess;
    }

    public String verifyUserManaHeader(){
        String header = validateHelper.checkText(userManaHeader);
        System.out.println("Print UserMan Header :" + header);
        return header;
    }

    public String VerifyAddNewUserTitle(){
        String addUse = validateHelper.checkText(addUserTitle);
        System.out.println("Print AddNew title :" + addUse);
        return addUse;
    }

    public String verifyAddSuccessMess(){
        String succ_mess = validateHelper.checkText(addSuccesMess);
        System.out.println("Print Success Mess :" + succ_mess);
        return succ_mess;
    }

    public String verifyFirtNameText(){
        String firtname_ = validateHelper.checkText(firstName);
        System.out.println("Print Value FirstName :" + firtname_);
        return firtname_;
    }

    public String verifyLastNameText(){
        String lastname_ = validateHelper.checkText(lastName);
        System.out.println("Print Value LastName :" + lastname_);
        return lastname_;
    }



}
