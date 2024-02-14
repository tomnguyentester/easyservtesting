package com.easyserv.pages.EasyservEnginePages;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By forgotPassLink = By.xpath("//a[contains(text(),'Forgot password?')]");
    private By forgotPassHeader = By.xpath("//h3[contains(text(),'FORGOT PASSWORD')]");
    private By emailAddressTitle = By.xpath("//label[contains(text(),'Email address')]");
    private By emailAddressTextbox = By.xpath("//input[@id='email']");
    private By emailPlaceholder = By.xpath("//input[@placeholder='Enter email address']");
    private By continueButton = By.xpath("//button[@type='submit']");
    private By backButton = By.xpath("//span[@aria-label='arrow-left']//*[name()='svg']");
    private By loginHeader = By.xpath("//h3[contains(text(),'LOG IN')]");
    private By checkEmailtitle = By.xpath("//h3[contains(text(),'Check Your Email')]");
    private By emailWarningMess = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By emailNotExistMess = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void ForgotPassword_TC001(){
        validateHelper.clickElement(forgotPassLink);
        validateHelper.delay(2);
    }

    public void ForgotPassword_TC002(){
        validateHelper.clickElement(forgotPassLink);
        validateHelper.delay(2);
    }

    public void ForgotPassword_TC003(String email){
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(emailAddressTextbox,email);
        validateHelper.delay(2);
    }

    public void ForgotPassword_TC004(){
        validateHelper.clickElement(forgotPassLink);
        validateHelper.clickElement(backButton);
        validateHelper.delay(2);
    }

    public void ForgotPassword_TC005(String email){
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(emailAddressTextbox,email);
        validateHelper.clickElement(continueButton);
        validateHelper.delay(2);
    }

    public void ForgotPassword_TC006(String email){
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(emailAddressTextbox,email);
        validateHelper.delay(2);
    }

    public void ForgotPassword_TC007(String email){
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(emailAddressTextbox,email);
        validateHelper.clickElement(continueButton);
        validateHelper.delay(2);
    }

    public String verifyEmailNotExistMess(){
        String emailMess = validateHelper.checkText(emailNotExistMess);
        System.out.println("Printer Email Warning Mess :" + emailMess);
        return emailMess;
    }
    public String verifyEmailWarningMess(){
        String emailMess = validateHelper.checkText(emailWarningMess);
        System.out.println("Printer Email Warning Mess :" + emailMess);
        return emailMess;
    }
    public String verifyCheckEmailTitle(){
        String checkEmail = validateHelper.checkText(checkEmailtitle);
        System.out.println("Printer Check Email title :" + checkEmail);
        return checkEmail;
    }

    public String verifyLoginHeader(){
        String login_header = validateHelper.checkText(loginHeader);
        System.out.println("Printer DataLogin Header :" + login_header);
        return login_header;
    }
    public Boolean verifyStatusEmailAddress(){
        boolean emailAdd = validateHelper.enableElement(emailAddressTextbox);
        System.out.println("Printer Status EmailAddress textbox :" +emailAdd);
        return emailAdd;
    }

    public String verifyForgotPassHeader(){
        String forgot = validateHelper.checkText(forgotPassHeader);
        System.out.println("Printer Forgot Password Header :" +forgot);
        return forgot;
    }

    public String verifyEmailPlaceholder(){
        String emailPlace = validateHelper.getPlaceholder(emailPlaceholder);
        System.out.println("Printer Placeholder Text :" +emailPlace);
        return emailPlace;
    }

    public Boolean verifyStatusContinueButton(){
        boolean resetBt = validateHelper.enableElement(continueButton);
        System.out.println("Print status Continue Button " +resetBt);
        return resetBt;
    }

}
