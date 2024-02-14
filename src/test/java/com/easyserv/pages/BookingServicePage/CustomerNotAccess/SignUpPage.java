package com.easyserv.pages.BookingServicePage.CustomerNotAccess;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By loginIcon = By.xpath("//*[name()='path' and contains(@d,'M20.1212 1')]");
    private By signUpLink = By.xpath("//a[@class='ant-typography sign-up']");
    private By signUpHeader = By.xpath("//span[contains(text(),'SIGN UP TO MOTORSERVE')]");
    private By firstname = By.xpath("//input[@id='firstName']");
    private By lastname = By.xpath("//input[@id='lastName']");
    private By email = By.xpath("//input[@id='email']");
    private By password = By.xpath("//input[@id='password']");
    private By phonenumber = By.xpath("//input[@id='phoneNumber']");
    private By eyeIcon = By.xpath("//span[@aria-label='eye-invisible']//*[name()='svg']");
    private By privacyURL = By.xpath("//a[contains(text(),'Motorserve Privacy Policy.')]");
    private By privacyHeader = By.xpath("//h1[contains(text(),'Motorserve Privacy Policy')]");
    private By loginLink = By.xpath("//a[contains(text(),'Log in')]");
    private By loginHeader = By.xpath("//span[contains(text(),'LOGIN TO YOUR ACCOUNT')]");
    private By backButton = By.xpath("//span[contains(text(),'Back')]");
    private By firstNameMess = By.xpath("//div[@id='firstName_help']//div[@class='ant-form-item-explain-error'][normalize-space()='Your Last name must not exceed 50 characters.']");
    private By lastNameMess = By.xpath("//div[@id='lastName_help']//div[@class='ant-form-item-explain-error'][normalize-space()='Your Last name must not exceed 50 characters.']");
    private By emailMess = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By phoneMess = By.xpath("//div[contains(text(),'Please add valid Phone Number.')]");
    private By firstNameReqMess = By.xpath("//div[contains(text(),'Your First name is required')]");
    private By lastNameReqMess = By.xpath("//div[contains(text(),'Your Last name is required')]");
    private By emailReqMess = By.xpath("//div[contains(text(),'Your Email is required')]");
    private By passReqMess = By.xpath("//div[contains(text(),'The password field is required')]");
    private By emailExitMess = By.xpath("//div[@class='ant-notification-notice-message']");
    private By signUpButton = By.xpath("//button[@type='submit']");
    private By passLongerReqMess = By.xpath("//div[contains(text(),'The password must be longer than or equal to 6 cha')]");



    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void SignUp_TC001(){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC002(){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC003(){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC004(){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC005(){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC006(){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC007(String pass){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(password,pass);
        validateHelper.clickElement(eyeIcon);
    }

    public void SignUp_TC008(){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.movetoElement(privacyURL);
        validateHelper.clickElement(privacyURL);
        validateHelper.SwitchBrowser();
    }

    public void SignUp_TC009(){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.movetoElement(loginLink);
        validateHelper.clickElement(loginLink);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC010(){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(backButton);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC011(String firstName_,String lastName_,String email_,String password_,String phoneNumber_){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(firstname,firstName_);
        validateHelper.setText(lastname,lastName_);
        validateHelper.setText(email,email_);
        validateHelper.movetoElement(password);
        validateHelper.setText(password,password_);
        validateHelper.setText(phonenumber,phoneNumber_);
    }

    public void SignUp_TC012(String firstName_,String lastName_,String email_,String password_,String phoneNumber_){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(firstname,firstName_);
        validateHelper.setText(lastname,lastName_);
        validateHelper.setText(email,email_);
        validateHelper.movetoElement(password);
        validateHelper.setText(password,password_);
        validateHelper.setText(phonenumber,phoneNumber_);
        validateHelper.movetoElement(signUpHeader);
        validateHelper.clearText(firstname);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC013(String firstName_,String lastName_,String email_,String password_,String phoneNumber_){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(firstname,firstName_);
        validateHelper.setText(lastname,lastName_);
        validateHelper.setText(email,email_);
        validateHelper.movetoElement(password);
        validateHelper.setText(password,password_);
        validateHelper.setText(phonenumber,phoneNumber_);
        validateHelper.movetoElement(signUpHeader);
        validateHelper.clearText(lastname);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC014(String firstName_,String lastName_,String email_,String password_,String phoneNumber_){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(firstname,firstName_);
        validateHelper.setText(lastname,lastName_);
        validateHelper.setText(email,email_);
        validateHelper.movetoElement(password);
        validateHelper.setText(password,password_);
        validateHelper.setText(phonenumber,phoneNumber_);
        validateHelper.movetoElement(signUpHeader);
        validateHelper.clearText(email);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC015(String firstName_,String lastName_,String email_){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(firstname,firstName_);
        validateHelper.setText(lastname,lastName_);
        validateHelper.setText(email,email_);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC016(String firstName_,String lastName_,String email_,String password_,String phoneNumber_){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(firstname,firstName_);
        validateHelper.setText(lastname,lastName_);
        validateHelper.setText(email,email_);
        validateHelper.movetoElement(password);
        validateHelper.setText(password,password_);
        validateHelper.setText(phonenumber,phoneNumber_);
        validateHelper.clickElement(signUpButton);
        validateHelper.waitForPageLoaded();
        validateHelper.movetoElement(email);
    }

    public void SignUp_TC017(String firstName_,String lastName_,String email_,String password_,String phoneNumber_){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(firstname,firstName_);
        validateHelper.setText(lastname,lastName_);
        validateHelper.setText(email,email_);
        validateHelper.movetoElement(password);
        validateHelper.setText(password,password_);
        validateHelper.setText(phonenumber,phoneNumber_);
        validateHelper.clearText(password);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC018(String password_){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.movetoElement(password);
        validateHelper.setText(password,password_);
        validateHelper.waitForPageLoaded();
    }

    public void SignUp_TC019(String firstName_,String lastName_,String email_,String password_,String phoneNumber_){
        validateHelper.clickElement(loginIcon);
        validateHelper.movetoElement(signUpLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(firstname,firstName_);
        validateHelper.setText(lastname,lastName_);
        validateHelper.setText(email,email_);
        validateHelper.movetoElement(password);
        validateHelper.setText(password,password_);
        validateHelper.setText(phonenumber,phoneNumber_);
        validateHelper.waitForPageLoaded();
    }

    public String verifyPassLongerReqMessage(){
        String passReq = validateHelper.checkText(passLongerReqMess);
        System.out.println("Printer PassReq Message : " +passReq);
        return passReq;
    }
    public String verifyPassReqMessage(){
        String passReq = validateHelper.checkText(passReqMess);
        System.out.println("Printer PassReq Message : " +passReq);
        return passReq;
    }
    public String verifyEmailExistMessage(){
        String emailExist = validateHelper.checkText(emailExitMess);
        System.out.println("Printer emailExist Message : " +emailExist);
        return emailExist;
    }

    public String verifyEmailReqMessage(){
        String emailReq = validateHelper.checkText(emailReqMess);
        System.out.println("Printer email Require Message : " +emailReq);
        return emailReq;
    }

    public String verifyLastNameReqMessage(){
        String lastnameReq = validateHelper.checkText(lastNameReqMess);
        System.out.println("Printer LastName Require Message : " +lastnameReq);
        return lastnameReq;
    }
    public String verifyFirtNameReqMessage(){
        String firtnameReq = validateHelper.checkText(firstNameReqMess);
        System.out.println("Printer FirtName Require Message : " +firtnameReq);
        return firtnameReq;
    }

    public String verifyEmailInvalidMessage(){
        String emailReq = validateHelper.checkText(emailMess);
        System.out.println("Printer Email Require Message : " +emailReq);
        return emailReq;
    }

    public String verifyPhoneNumberInvalidMessage(){
        String phoneReq = validateHelper.checkText(phoneMess);
        System.out.println("Printer Phone Require Message : " +phoneReq);
        return phoneReq;
    }

    public String verifyLastNameInvalidMessage(){
        String lastnameReq = validateHelper.checkText(lastNameMess);
        System.out.println("Printer LastName Require Message : " +lastnameReq);
        return lastnameReq;
    }

    public String verifyFirtNameInvalidMessage(){
        String firtnameReq = validateHelper.checkText(firstNameMess);
        System.out.println("Printer FirtName Require Message : " +firtnameReq);
        return firtnameReq;
    }

    public String verifyLoginHeader(){
        String loginTitle = validateHelper.checkText(loginHeader);
        System.out.println("Printer DataLogin Header : " +loginTitle);
        return loginTitle;
    }
    public String verifyPrivacyHeader(){
        String priv = validateHelper.checkText(privacyHeader);
        System.out.println("Printer Privacy Header : " +priv);
        return priv;
    }
    public String verifyValueOfPassword(){
        String passValue = validateHelper.getAttribute(password);
        System.out.println("Print value password :" + passValue);
        return passValue;
    }

    public boolean verifyStatusPhoneBox(){
        boolean phoneBox = validateHelper.enableElement(phonenumber);
        System.out.println("Print status of phone box :" + phoneBox);
        return phoneBox;
    }

    public boolean verifyStatusPasswordBox(){
        boolean passBox = validateHelper.enableElement(password);
        System.out.println("Print status of password box :" +passBox);
        return passBox;
    }
    public boolean verifyStatusEmailBox(){
        boolean emailBox = validateHelper.enableElement(email);
        System.out.println("Print status of email box :" +emailBox);
        return emailBox;
    }

    public boolean verifyStatusLastNameBox(){
        boolean lastName = validateHelper.enableElement(lastname);
        System.out.println("Print status of lastName box :" +lastName);
        return lastName;
    }
    public boolean verifyStatusFirtNameBox(){
        boolean firstName = validateHelper.enableElement(firstname);
        System.out.println("Print status of firstName box :" +firstName);
        return firstName;
    }

    public String verifySignUpHeader(){
        String signUp = validateHelper.checkText(signUpHeader);
        System.out.println("Printer SignUp Header :" +signUp);
        return signUp;
    }
}
