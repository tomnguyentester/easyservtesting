package com.easyserv.pages.EasyservEnginePages;

import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.EasyEngine.DataLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.bouncycastle.cms.RecipientId.password;

public class AccountSettingPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By emailTextbox = By.xpath("//input[@id='email']");
    private By passwordTextbox = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By selectDepartment = By.xpath("//div[@class='ant-select-selector']");
    private By nextButton = By.xpath("//span[normalize-space()='Next']");
    private By accounting = By.xpath("//div[contains(text(),'Accounting')]");
    private By userProfile =  By.xpath("//span[@class='ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line']");
    private By accountSetting = By.xpath("//a[normalize-space()='Account Settings']");
    private By fullName = By.xpath("//h1[contains(text(),'Nguyen')]");
    private By contactInfo = By.xpath("//h4[contains(text(),'Contact Info')]");
    private By emailContact = By.xpath("//span[contains(text(),'trungnguyen@gmail.com')]");
    private By departHeader = By.xpath("//h4[contains(text(),'Department(s)')]");
    private By marketing = By.xpath("//span[contains(text(),'Marketing')]");
    private By firstName = By.xpath("//input[@id='firstName']");
    private By lastName = By.xpath("//input[@id='lastName']");
    private By jobTitle = By.xpath("//input[@id='jobTitle']");
    private By emailAddress = By.xpath("//input[@id='email']");
    private By mobileNumber = By.xpath("//input[@placeholder='Enter mobile number']");
    private By address = By.xpath("//input[@id='address']");
    private By state = By.xpath("");
    private By suburb = By.xpath("");
    private By postCode = By.xpath("//input[@placeholder='Enter post code']");
    private By changePassTab = By.xpath("//div[@id='rc-tabs-1-tab-two-columns-tabs-tab-change-password']");
    private By currPass = By.xpath("//input[@id='currentPassword']");
    private By newPass = By.xpath("//input[@id='newPassword']");
    private By confNewPass = By.xpath("//input[@id='confirmNewPassword']");
    private By cancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    private By saveBt = By.xpath("//div[@class='ant-form-item']//button[@type='submit']");
    private By country =  By.xpath("//span[@title='Australia']");
    private By Austra = By.xpath("//div[contains(text(),'Australia')]");
    private By Vietnam = By.xpath("//div[contains(text(),'Vietnam')]");
    private By India = By.xpath("//div[contains(text(),'India')]");
    private By vietnamTitle = By.xpath("//span[@title='Vietnam']");
    private By indiaTitle = By.xpath("//span[@title='India']");
    private By nswState = By.xpath("//span[@title='NSW']");
    private By sydSuburb = By.xpath("//span[@title='Sydney']");
    private By postcodeField = By.xpath("//div[@data-label='Post Code']//input[@type='text']");
    private By stateField = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-status-success ant-select-single ant-select-show-arrow ant-select-disabled']//div[@class='ant-select-selector']");
    private By suburbField = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-status-success ant-select-single ant-select-show-arrow ant-select-disabled ant-select-show-search']//div[@class='ant-select-selector']");
    private By postField = By.xpath("//input[@class='ant-input ant-input-disabled ant-input-status-success']");
    private By saveButton = By.xpath("//span[contains(text(),'Save')]");
    private By saveSuccessMess = By.xpath("//div[@class='ant-notification-notice-message']");
    private By contactName = By.xpath("//h1[contains(text(),'testing nguyen')]");
    private By FirNameReqMess = By.xpath("//div[contains(text(),'The First Name field is required')]");
    private By LastNameReqMess = By.xpath("//div[contains(text(),'The Last Name field is required')]");
    private By JobTitReqMess = By.xpath("//div[contains(text(),'The Job Title field is required')]");
    private By EmailAddReqMess = By.xpath("//div[contains(text(),'The Email Address field is required')]");
    private By MobileReqMess = By.xpath("//div[contains(text(),'The Mobile Number field is required')]");
    private By MobileExceedCharMess = By.xpath("//div[contains(text(),'Your Mobile Number must not exceed 20 characters.')]");
    private By PostCodeReqMess = By.xpath("//div[contains(text(),'The Post Code field must be 4 characters')]");
    private By postCodeInvalidMess = By.xpath("//div[contains(text(),'No valid post code found.')]");
    private By mobileNumberInvalidMess = By.xpath("//div[contains(text(),'Please add valid Mobile Number.')]");
    private By emailAddInvalidMess =By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By logoutButton = By.xpath("//strong[normalize-space()='Logout']");
    private By loginHeader = By.xpath("//h3[contains(text(),'LOG IN')]");
    private By currPassReqMess = By.xpath("//div[@id='currentPassword_help']//div[@class='ant-form-item-explain-error'][normalize-space()='This field is a required field']");
    private By newPassReqMess = By.xpath("//div[@id='newPassword_help']//div[@class='ant-form-item-explain-error'][normalize-space()='This field is a required field']");
    private By confPassReqMess = By.xpath("//div[@id='confirmNewPassword_help']//div[@class='ant-form-item-explain-error'][normalize-space()='This field is a required field']");
    private By currentPassword = By.xpath("//input[@id='currentPassword']");
    private By newPassword = By.xpath("//input[@id='newPassword']");
    private By confPassword = By.xpath("//input[@id='confirmNewPassword']");
    private By currPassExceed= By.xpath("//div[contains(text(),'Your Current Password must not exceed 20 character')]");
    private By newPassExceed = By.xpath("//div[contains(text(),'Your New Password must not exceed 20 characters.')]");
    private By confPassExceed = By.xpath("//div[contains(text(),'Your Confirm Password must not exceed 20 character')]");
    private By currPassLeast = By.xpath("//div[contains(text(),'Current Password must have at least 6 characters')]");
    private By newPassLeast = By.xpath("//div[contains(text(),'New Password must have at least 6 characters')]");
    private By confPassLeast = By.xpath("//div[contains(text(),'Confirm Password must have at least 6 characters')]");



    public AccountSettingPage(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void AccountSetting_TC001(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC002(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC003(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(changePassTab);
        validateHelper.movetoElement(saveBt);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC004(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC005(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(country);
        validateHelper.clickElement(Austra);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC006(String email,String password,String postCode){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(country);
        validateHelper.clickElement(Austra);
        validateHelper.clickElement(postcodeField);
        validateHelper.clearText(postcodeField);
        validateHelper.setText(postcodeField,postCode);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC007(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(country);
        validateHelper.clickElement(Vietnam);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC008(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(changePassTab);
        validateHelper.delay(1);
    }

    public void AccountSetting_TC009(String email,String password,String firstname,String lastname,String job,String emailAdd,String mobile,String add){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(firstName);
        validateHelper.clearText(firstName);
        validateHelper.setText(firstName,firstname);
        validateHelper.clickElement(lastName);
        validateHelper.clearText(lastName);
        validateHelper.setText(lastName,lastname);
        validateHelper.clickElement(jobTitle);
        validateHelper.clearText(jobTitle);
        validateHelper.setText(jobTitle,job);
        validateHelper.clickElement(emailAddress);
        validateHelper.clearText(emailAddress);
        validateHelper.setText(emailAddress,emailAdd);
        validateHelper.clickElement(mobileNumber);
        validateHelper.clearText(mobileNumber);
        validateHelper.setText(mobileNumber,mobile);
        validateHelper.clickElement(address);
        validateHelper.clearText(address);
        validateHelper.setText(address,add);
        validateHelper.clickElement(country);
        validateHelper.clickElement(Vietnam);
        validateHelper.clickElement(cancelButton);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC010(String email,String password,String firstname,String lastname){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(firstName);
        validateHelper.clearText(firstName);
        validateHelper.setText(firstName,firstname);
        validateHelper.clickElement(lastName);
        validateHelper.clearText(lastName);
        validateHelper.setText(lastName,lastname);
        validateHelper.clickElement(saveButton);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC011(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(firstName);
        validateHelper.clearText(firstName);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC012(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(lastName);
        validateHelper.clearText(lastName);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC013(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(jobTitle);
        validateHelper.clearText(jobTitle);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC014(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(emailAddress);
        validateHelper.clearText(emailAddress);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC015(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(mobileNumber);
        validateHelper.clearText(mobileNumber);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC016(String email,String password,String mobile){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(mobileNumber);
        validateHelper.clearText(mobileNumber);
        validateHelper.setText(mobileNumber,mobile);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC017(String email,String password,String postcode){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(country);
        validateHelper.clickElement(Austra);
        validateHelper.clickElement(postcodeField);
        validateHelper.clearText(postcodeField);
        validateHelper.setText(postcodeField,postcode);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC018(String email,String password,String postcode){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(country);
        validateHelper.clickElement(Austra);
        validateHelper.clickElement(postcodeField);
        validateHelper.clearText(postcodeField);
        validateHelper.setText(postcodeField,postcode);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC019(String email,String password,String mobile){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(mobileNumber);
        validateHelper.clearText(mobileNumber);
        validateHelper.setText(mobileNumber,mobile);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC020(String email,String password,String emailaddress){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(emailAddress);
        validateHelper.clearText(emailAddress);
        validateHelper.setText(emailAddress,emailaddress);
        validateHelper.delay(2);
    }

    public void AccountSetting_TC021(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.movetoElement(logoutButton);
        validateHelper.clickElement(logoutButton);
        validateHelper.delay(3);
    }

    public void AccountSetting_TC022(String email,String password,String currpass){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(changePassTab);
        validateHelper.clickElement(currentPassword);
        validateHelper.setText(currentPassword,currpass);
        validateHelper.clearText(currentPassword);
        validateHelper.delay(3);
    }

    public void AccountSetting_TC023(String email,String password,String newpass){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(changePassTab);
        validateHelper.clickElement(newPassword);
        validateHelper.setText(newPassword,newpass);
        validateHelper.clearText(newPassword);
        validateHelper.delay(3);
    }

    public void AccountSetting_TC024(String email,String password,String confpass){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(changePassTab);
        validateHelper.clickElement(confPassword);
        validateHelper.setText(confPassword,confpass);
        validateHelper.clearText(confPassword);
        validateHelper.delay(3);
    }

    public void AccountSetting_TC025(String email,String password,String currpass,String newpass,String confpass){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(changePassTab);
        validateHelper.clickElement(currentPassword);
        validateHelper.setText(currentPassword,currpass);
        validateHelper.clickElement(newPassword);
        validateHelper.setText(newPassword,newpass);
        validateHelper.clickElement(confPassword);
        validateHelper.setText(confPassword,confpass);
        validateHelper.delay(3);
    }

    public void AccountSetting_TC026(String email,String password,String currpass,String newpass,String confpass){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(userProfile);
        validateHelper.clickElement(accountSetting);
        validateHelper.clickElement(changePassTab);
        validateHelper.clickElement(currentPassword);
        validateHelper.setText(currentPassword,currpass);
        validateHelper.clickElement(newPassword);
        validateHelper.setText(newPassword,newpass);
        validateHelper.clickElement(confPassword);
        validateHelper.setText(confPassword,confpass);
        validateHelper.delay(3);
    }

    public String verifyCurrPassLeastMess(){
        String currPass = validateHelper.checkText(currPassLeast);
        return currPass;
    }

    public String verifyNewPassLeastMess(){
        String newPass = validateHelper.checkText(newPassLeast);
        return newPass;
    }

    public String verifyConfPassLeastMess(){
        String confPass = validateHelper.checkText(confPassLeast);
        return confPass;
    }
    public String verifyCurrPassExceedMess(){
        String currPass = validateHelper.checkText(currPassExceed);
        return currPass;
    }

    public String verifyNewPassExceedMess(){
        String newPass = validateHelper.checkText(newPassExceed);
        return newPass;
    }

    public String verifyConfPassExceedMess(){
        String confPass = validateHelper.checkText(confPassExceed);
        return confPass;
    }

    public String verifyCurrPassReqMess(){
        String changePass = validateHelper.checkText(currPassReqMess);
        return changePass;
    }

    public String verifyNewPassReqMess(){
        String newPass = validateHelper.checkText(newPassReqMess);
        return newPass;
    }

    public String verifyConfPassReqMess(){
        String confPass = validateHelper.checkText(confPassReqMess);
        return confPass;
    }


    public String verifyLoginHeader(){
        String login_header = validateHelper.checkText(loginHeader);
        System.out.println("Printer DataLogin Header :" + login_header);
        return login_header;
    }

    public String verifyEmailInvalidMess(){
        String emailAdd = validateHelper.checkText(emailAddInvalidMess);
        System.out.println("Print email Invalid Required Message :" + emailAdd);
        return emailAdd;
    }

    public String verifyMobileInvalidMess(){
        String mobileNum = validateHelper.checkText(mobileNumberInvalidMess);
        System.out.println("Print Mobile Invalid Required Message :" + mobileNum);
        return mobileNum;
    }
    public String verifyPostCodeInvalidMess(){
        String postCode = validateHelper.checkText(postCodeInvalidMess);
        System.out.println("Print PostCode Invalid Required Message :" + postCode);
        return postCode;
    }
    public String verifyPostCodeReqMess(){
        String postCode = validateHelper.checkText(PostCodeReqMess);
        System.out.println("Print PostCode Required Message :" + postCode);
        return postCode;
    }
    public String verifyMobileExceedCharMess(){
        String mobile = validateHelper.checkText(MobileExceedCharMess);
        System.out.println("Print MobileExceed Required Message :" + mobile);
        return mobile;
    }

    public String verifyMobileReqMess(){
        String mobile = validateHelper.checkText(MobileReqMess);
        System.out.println("Print MobileNum Required Message :" + mobile);
        return mobile;
    }
    public String verifyEmailAddressReqMess(){
        String emailAddMess = validateHelper.checkText(EmailAddReqMess);
        System.out.println("Print Email Required Message :" + emailAddMess);
        return emailAddMess;
    }

    public String verifyJobTitleReqMess(){
        String jobTitMess = validateHelper.checkText(JobTitReqMess);
        System.out.println("Print JobTitle Required Message :" + jobTitMess);
        return jobTitMess;
    }
    public String verifyLastNameReqMess(){
        String lastNameMess = validateHelper.checkText(LastNameReqMess);
        System.out.println("Print LastName Required Message :" + lastNameMess);
        return lastNameMess;
    }
    public String verifyFirstNameReqMess(){
        String firstNameMess = validateHelper.checkText(FirNameReqMess);
        System.out.println("Print FirstName Required Message :" + firstNameMess);
        return firstNameMess;
    }
    public String verifySaveSuccessMess(){
        String saveMess = validateHelper.checkText(saveSuccessMess);
        System.out.println("Print Save Message :" + saveMess);
        return saveMess;
    }

    public String verifyContactName(){
        String contName = validateHelper.checkText(contactName);
        System.out.println("Print Contact Name :" + contName);
        return contName;
    }
    public String verifyAustraCountryTitle(){
        String audrop = validateHelper.checkText(country);
        System.out.println("Print value Drop :" + audrop);
        return  audrop;
    }

    public String getAddressValue(){
        String add = validateHelper.getAttribute(address);
        System.out.println("Print value of Address :" + add);
        return add;
    }
    public String getMobileValue(){
        String mob = validateHelper.getAttribute(mobileNumber);
        System.out.println("Print value of mobile :" + mob);
        return mob;
    }
    public String getEmailValue(){
        String emailAdd = validateHelper.getAttribute(emailAddress);
        System.out.println("Print value of emailAdd :" + emailAdd);
        return emailAdd;
    }
    public String getJobValue(){
        String jobTit = validateHelper.getAttribute(jobTitle);
        System.out.println("Print value of jobTitle :" + jobTit);
        return jobTit;
    }

    public String getLastNameValue(){
        String lasName = validateHelper.getAttribute(lastName);
        System.out.println("Print value of lastName :" + lasName);
        return lasName;
    }
    public String getFirstNameValue(){
        String firName = validateHelper.getAttribute(firstName);
        System.out.println("Print value of firtName :" +firName);
        return firName;
    }
    public String verifyStatusStateField(){
        String state = validateHelper.checkText(stateField);
        System.out.println("Print status State Field :" + state);
        return state;
    }

    public String verifyStatusSuburbField(){
        String subu = validateHelper.checkText(suburbField);
        System.out.println("Print status Suburb Field :" + subu);
        return subu;
    }

    public boolean verifyStatusPostCodeField(){
        boolean postCode = validateHelper.enableElement(postField);
        System.out.println("Print status PostCode Field :" + postCode);
        return postCode;
    }
    public String verifyStateValue(){
        String state = validateHelper.checkText(nswState);
        System.out.println("Print value State :" + state);
        return  state;
    }

    public String verifySuburbValue(){
        String subu = validateHelper.checkText(sydSuburb);
        System.out.println("Print value Suburb :" + subu);
        return  subu;
    }


    public String verifyVietnamCountryTitle(){
        String vndrop = validateHelper.checkText(vietnamTitle);
        System.out.println("Print value Drop :" + vndrop);
        return  vndrop;
    }

    public String verifyIndiaCountryTitle(){
        String indrop = validateHelper.checkText(indiaTitle);
        System.out.println("Print value Drop :" + indrop);
        return  indrop;
    }

    public Boolean verifyStatusSaveButton(){
        boolean cancelBt = validateHelper.enableElement(saveBt);
        System.out.println("Printer Status Save Button :" + cancelBt);
        return cancelBt;
    }
    public Boolean verifyStatusCurrentPassField(){
        boolean currentPass = validateHelper.enableElement(currPass);
        System.out.println("Printer Status Current Pass textbox :" +currentPass);
        return currentPass;
    }

    public Boolean verifyStatusNewPassField(){
        boolean newPassword = validateHelper.enableElement(newPass);
        System.out.println("Printer Status New Pass textbox :" + newPassword);
        return newPassword;
    }

    public Boolean verifyStatusConfirmNewPassField(){
        boolean confirmPass = validateHelper.enableElement(confNewPass);
        System.out.println("Printer Status confirm New Pass textbox :" + confirmPass);
        return confirmPass;
    }

    public Boolean verifyStatusFirstNameField(){
        boolean firstname = validateHelper.enableElement(firstName);
        System.out.println("Printer Status firstName textbox :" +firstname);
        return firstname;
    }

    public Boolean verifyStatusLastNameField(){
        boolean lastname = validateHelper.enableElement(lastName);
        System.out.println("Printer Status LastName textbox :" + lastname);
        return lastname;
    }

    public Boolean verifyStatusJobTitle(){
        boolean jobtit = validateHelper.enableElement(jobTitle);
        System.out.println("Printer Status Jobtitle textbox :" + jobtit);
        return jobtit;
    }

    public Boolean verifyStatusEmailAddressField(){
        boolean emailAdd = validateHelper.enableElement(emailAddress);
        System.out.println("Printer Status email textbox :" + emailAdd);
        return emailAdd;
    }

    public Boolean verifyStatusMobileNumFiled(){
        boolean mobile = validateHelper.enableElement(mobileNumber);
        System.out.println("Printer Status Mobile textbox :" + mobile);
        return mobile;
    }

    public String verifyFullName(){
        String fullname = validateHelper.checkText(fullName);
        System.out.println("Printer Full Name :" + fullname);
        return fullname;
    }

    public String verifyContactInfoHeader(){
        String contact = validateHelper.checkText(contactInfo);
        System.out.println("Printer contact header :" + contact);
        return contact;
    }

    public String verifyEmailContact(){
        String emailcontact = validateHelper.checkText(emailContact);
        System.out.println("Printer email contact :" + emailcontact);
        return emailcontact;
    }

    public  String verifyDepartmentHeader(){
        String depart = validateHelper.checkText(departHeader);
        System.out.println("Printer Department Header :" + depart);
        return depart;
    }

    public  String verifyMarketingTitle(){
        String mark = validateHelper.checkText(marketing);
        System.out.println("Printer Marketing Title :" + mark);
        return mark;
    }
}
