package com.easyserv.pages.AdminPortalPages.UserAccess;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAdminPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By headerPageText = By.xpath("//h3[contains(text(),'Welcome back')]");
    private By contentText = By.xpath("//p[contains(text(),'Please enter your details to sign in')]");
    private By emailTitle = By.xpath("//label[contains(text(),'Email')]");
    private By emailBox = By.xpath("//input[@id='email']");
    private By passTitle = By.xpath("//label[contains(text(),'Password')]");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By eyeIcon = By.xpath("//span[@aria-label='eye-invisible']//*[name()='svg']");
    private By rememberCheckbox = By.xpath("//input[@id='remember']");
    private By rememberText = By.xpath("//span[contains(text(),'Remember my credentials')]");
    private By forgotpassLink = By.xpath("//a[contains(text(),'Forgot Password?')]");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By emailValidate = By.xpath("//div[contains(text(),'The Email field is required')]");
    private By passValidate = By.xpath("//div[contains(text(),'The Password field is required')]");
    private By backtoLoginText = By.xpath("//p[contains(text(),'Back to DataLogin')]");
    private By backtoLoginButton = By.xpath("//button[@class='jsx-2559333700 btn']");
    private By selectStoreHearder = By.xpath("//h3[normalize-space()='Select Store']");
    private By storeTitle = By.xpath("//label[contains(text(),'Store')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By wrongCredText = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    private By wrongCredNoti = By.xpath("//div[@class='ant-notification-notice ant-notification-notice-error ant-notification-notice-closable']");
    private By validationPassword = By.xpath("//div[contains(text(),'Your Password must not exceed 20 characters.')]");
    private By validationEmail = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By storeName = By.xpath("//span[@class='ant-select-selection-item']");
    private By selectStoreHeader = By.xpath("//h3[contains(text(),'Select Store')]");

    public LoginAdminPage(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LoginAdmin_TC002(String email,String password){
        validateHelper.clickElement(signinButton);
        validateHelper.delay(2);
    }

    public void LoginAdmin_TC003(String email,String password){
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.delay(2);
    }

    public void LoginAdmin_TC004(String email,String password){
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.pressEnter(passwordBox);
        validateHelper.delay(2);
    }

    public void LoginAdmin_TC005(String email,String password){
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.delay(2);
    }

    public void LoginAdmin_TC006(String email,String password){
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.delay(2);
    }

    public void LoginAdmin_TC007(String email,String password){
        validateHelper.setText(emailBox, email);
        validateHelper.delay(2);
    }

    public void LoginAdmin_TC008(String email,String password){
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.delay(2);
    }

    public void LoginAdmin_TC009(String email,String password){
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.delay(2);
    }

    public void LoginAdmin_TC010(String email,String password){
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.delay(2);
    }

    public void LoginAdmin_TC011(String email,String password){
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.delay(2);
    }

    public String verifyEmailValidMess(){
        String emailMess = validateHelper.checkText(validationEmail);
        System.out.println("Print Email Validation Mess :" + emailMess);
        return emailMess;
    }

    public String verifyMaxlengthPassword(){
        String maxlengPass = validateHelper.checkText(validationPassword);
        System.out.println("Print Maxlength Password :" + maxlengPass);
        return maxlengPass;
    }

    public String verifyWrongCredentials(){
        String wrongCreMess = validateHelper.checkText(wrongCredText);
        System.out.println("Print Wrong Credentials Text :" + wrongCreMess);
        return wrongCreMess;
    }

    public String verifySelectStoreHeader(){
        String selectHeader = validateHelper.checkText(selectStoreHeader);
        System.out.println("Print Select Store Header :" + selectHeader);
        return selectHeader;
    }

    public String verifyEmailReqMess(){
        String emailMess = validateHelper.checkText(emailValidate);
        System.out.println("Print Email Req Mess :" + emailMess);
        return emailMess;
    }

    public String verifyPassReqMess(){
        String passMess = validateHelper.checkText(passValidate);
        System.out.println("Print Pass Req Mess :" + passMess);
        return passMess;
    }

    public String vefiryLoginHeader(){
        String loginHeader = validateHelper.checkText(headerPageText);
        System.out.println("Print Login Header :" +loginHeader);
        return loginHeader;
    }

    public String verifyContent() {
        String content = driver.findElement(contentText).getText();
        return content;
    }

    public String verifyEmailTitle() {
        String email = driver.findElement(emailTitle).getText();
        return email;
    }

    public Boolean verifyEmailTextbox() {
        WebElement emailbox = driver.findElement(emailBox);
        boolean status_emailBox = emailbox.isEnabled();
        return status_emailBox;
    }

    public String verifyPasswordTitle() {
        String password = driver.findElement(passTitle).getText();
        return password;
    }

    public Boolean verifyPasswordTextbox() {
        WebElement passwordbox = driver.findElement(emailBox);
        boolean status_passwordBox = passwordbox.isEnabled();
        return status_passwordBox;
    }

    public Boolean verifyRemeberCheckbox() {
        WebElement remeCheckbox = driver.findElement(rememberCheckbox);
        boolean status_remember = remeCheckbox.isEnabled();
        return status_remember;
    }

    public String verifyRememberText() {
        String remText = driver.findElement(rememberText).getText();
        return remText;
    }

    public String verifyForgotPassLink() {
        String forgotLink = driver.findElement(forgotpassLink).getText();
        return forgotLink;
    }

    public boolean verifySignInButton() {
        WebElement signbt = driver.findElement(signinButton);
        boolean status_signbt = signbt.isDisplayed();
        return status_signbt;
    }

}
