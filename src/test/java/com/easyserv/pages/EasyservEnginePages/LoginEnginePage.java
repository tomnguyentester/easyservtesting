package com.easyserv.pages.EasyservEnginePages;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginEnginePage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By loginHeader = By.xpath("//h3[contains(text(),'LOG IN')]");
    private By emailAdressTitle = By.xpath("//label[contains(text(),'Email')]");
    private By emailTextbox = By.xpath("//input[@id='email']");
    private By passwordTitle = By.xpath("//label[contains(text(),'Password')]");
    private By passwordTextbox = By.xpath("//input[@id='password']");
    private By rememberCheckbox = By.xpath("//input[@id='remember']");
    private By forgotLink = By.xpath("//a[contains(text(),'Forgot password?')]");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By forgotPasswordHeader = By.xpath("//h3[contains(text(),'FORGOT PASSWORD')]");
    private By emailReqMess = By.xpath("//div[contains(text(),'The Email field is required')]");
    private By emailMessage = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By passwordReqMess = By.xpath("//div[contains(text(),'The Password field is required')]");
    private By eyeIcon = By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/*[1]");
    private By selectDepartHeader = By.xpath("//h3[normalize-space()='Select Department']");
    private By loginWarning = By.xpath("//div[@class='ant-notification-notice-message']");
    private By passWarning = By.xpath("//div[contains(text(),'Password must have at least 6 characters')]");
    private By emailWarning = By.xpath("//div[@class='ant-notification-notice-message']");
    private By selectDepartment = By.xpath("//div[@class='ant-select-selector']");
    private By nextButton = By.xpath("//span[normalize-space()='Next']");
    private By accounting = By.xpath("//div[contains(text(),'Accounting')]");
    private By dashboardHeader = By.xpath("//a[contains(text(),'Dashboard')]");
    private By backButton = By.xpath("//span[@aria-label='arrow-left']//*[name()='svg']");

    public LoginEnginePage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LoginEngine_TC001(){
        //Verify Ui DataLogin is correct Design
        //verifyLoginHeader()
    }

    public void LoginEngine_TC002(){
        //Verify user can enter user email in textbox <Email address> on "Log In" screen
    }

    public void LoginEngine_TC003(){
        //Verify user can enter password in textbox <Password> on DataLogin screen
    }

    public void LoginEngine_TC004(){
        //Verify user can click Remember me in <Remember me> on DataLogin screen
    }

    public void LoginEngine_TC005(){
        validateHelper.clickElement(forgotLink);
        //Verify user can click Fogot Password in hyperlink <Fogot password> on DataLogin Screen
    }

    public void LoginEngine_TC006(String email){
        validateHelper.setText(emailTextbox,email);
        validateHelper.clearText(emailTextbox);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC007(String email){
        validateHelper.setText(emailTextbox,email);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC008(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clearText(passwordTextbox);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC009(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(eyeIcon);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC010(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC011(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC012(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC013(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.pressEnter(passwordTextbox);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC014(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC015(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC016(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC017(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC018(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC019(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC020(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.delay(2);
    }

    public void LoginEngine_TC021(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(backButton);
        validateHelper.delay(2);
    }

    public String verifyDashboardHeader(){
        String dasboard_header = validateHelper.checkText(dashboardHeader);
        System.out.println("Printer Dashboard Header :" + dasboard_header);
        return dasboard_header;
    }

    public String verifyEmailWarningMess(){
        String emailWar = validateHelper.checkText(emailWarning);
        System.out.println("Printer Email Warning Message :" + emailWar);
        return emailWar;
    }

    public String verifyPasswordWarningMess(){
        String passWar = validateHelper.checkText(passWarning);
        System.out.println("Printer Password Warning Message :" + passWar);
        return passWar;
    }

    public String verifyLoginWarningMess(){
        String unsucNoti = validateHelper.checkText(loginWarning);
        System.out.println("Printer Unsuccess Noti Message :" + unsucNoti);
        return unsucNoti;
    }

    public String verifySelectDepartHeader(){
        String selectDep = validateHelper.checkText(selectDepartHeader);
        System.out.println("Printer Select Depart Header :" +selectDep);
        return selectDep;
    }

    public Boolean  verifyStatusLoginButton(){
        boolean login = validateHelper.isDiplayedElement(loginButton);
        System.out.println("Print status Login Button :" +login);
        return login;
    }

    public String verifyPasswordValue(){
        String pass = validateHelper.getAttribute(passwordTextbox);
        System.out.println("Printer Value Of Password "+ pass);
        return pass;
    }

    public String verifyPasswordRequiredMessage(){
        String passReq = validateHelper.checkText(passwordReqMess);
        System.out.println("Printer Password Required Message :" + passReq);
        return passReq;
    }

    public String verifyEmailMessage(){
        String emailMess = validateHelper.checkText(emailMessage);
        System.out.println("Printer Email Message :" + emailMess);
        return emailMess;
    }
    public String verifyEmailRequiredMessage(){
        String emailReq = validateHelper.checkText(emailReqMess);
        System.out.println("Printer Email Required Message :" + emailReq);
        return emailReq;
    }
    public String verifyForgotPasswordHeader(){
        String forgot_header = validateHelper.checkText(forgotPasswordHeader);
        System.out.println("Printer Forgot Password Header :" + forgot_header);
        return forgot_header;
    }

    public Boolean verifyStatusRememberButton(){
        boolean rememberBt = validateHelper.isDiplayedElement(rememberCheckbox);
        System.out.println("Printer Status Remember Checkbox :" + rememberBt);
        return rememberBt;
    }
    public Boolean verifyStatusPassword(){
        boolean password = validateHelper.enableElement(passwordTextbox);
        System.out.println("Printer Status Password textbox :" + password);
        return password;
    }

    public Boolean verifyStatusEmailAddress(){
        boolean emailAdd = validateHelper.enableElement(emailTextbox);
        System.out.println("Printer Status EmailAddress textbox :" +emailAdd);
        return emailAdd;
    }

    public String verifyLoginHeader(){
        String login_header = validateHelper.checkText(loginHeader);
        System.out.println("Printer DataLogin Header :" + login_header);
        Assert.assertEquals(login_header,"LOG IN");
        return login_header;
    }
}
