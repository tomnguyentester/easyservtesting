package com.easyserv.pages.BookingServicePage.CustomerAccess;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginBookingPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By loginIcon = By.xpath("//*[name()='path' and contains(@d,'M20.1212 1')]");
    private By loginHeader = By.xpath("//span[contains(text(),'DataLogin To Your Account')]");
    private By emailTextbox = By.xpath("//input[@id='email']");
    private By passwordTextbox = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By rememberCheckbox = By.xpath("//input[@id='remember']");
    private By forgotLink =  By.xpath("//a[contains(text(),'Forgot password?')]");
    private By signUpLink = By.xpath("//a[contains(text(),'Sign up')]");
    private By loginNoti = By.xpath("//div[@class='ant-notification-notice-message']");
    private By bookSerHeader = By.xpath("//span[contains(text(),'BOOK A SERVICE')]");
    private By loginUnsuccNoti = By.xpath("//div[@class='ant-notification-notice-message']");
    private By emailValidationMess = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By resetPassHeader = By.xpath("//span[@class='ant-typography title']");


    public LoginBookingPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LoginBooking_TC001(String email,String password){
        validateHelper.clickElement(loginIcon);
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.delay(2);
    }
    public void LoginBooking_TC002(String email,String password){
        validateHelper.clickElement(loginIcon);
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.pressEnter(passwordTextbox);
        validateHelper.delay(2);
    }

    public void LoginBooking_TC003(String email,String password){
        validateHelper.clickElement(loginIcon);
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.delay(2);
    }

    public void LoginBooking_TC004(String email,String password){
        validateHelper.clickElement(loginIcon);
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
    }

    public void LoginBooking_TC005(String email){
        validateHelper.clickElement(loginIcon);
        validateHelper.setText(emailTextbox,email);
        validateHelper.delay(2);
    }

    public void LoginBooking_TC006(String email,String password){
        validateHelper.clickElement(loginIcon);
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.delay(1);
    }

    public void LoginBooking_TC007(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotLink);
    }

    public String verifyResetPasswordHeader() {
        String reset = validateHelper.checkText(resetPassHeader);
        System.out.println("Printer Reset Pass Header " + reset);
        return reset;
    }
        public Boolean verifyStatusRememberCheckbox(){
        boolean remem = validateHelper.enableElement(rememberCheckbox);
        System.out.println("Print status Remember checkbox "+ remem);
        return remem;
    }
    public Boolean verifyStatusLoginButton(){
        boolean loginBt = validateHelper.enableElement(loginButton);
        System.out.println("Print status DataLogin Button "+loginBt);
        return loginBt;
    }

    public String verifyEmailValidationMessage(){
        String email = validateHelper.checkText(emailValidationMess);
        System.out.println("Printer email validation Mess "+ email);
        return email;
    }
    public String verifyPasswordValue(){
        String pass = validateHelper.getAttribute(passwordTextbox);
        System.out.println("Printer Value Of Password "+ pass);
        return pass;
    }
    public String verifyLoginUnsuccessNoti(){
        String unsucNoti = validateHelper.checkText(loginUnsuccNoti);
        System.out.println("Printer Unsuccess Noti Message :" + unsucNoti);
        return unsucNoti;
    }

    public String verifyLoginSuccessNoti(){
        String sucNoti = validateHelper.checkText(loginNoti);
        System.out.println("Printer Success Noti Message :" + sucNoti);
        return sucNoti;
    }

    public String verifyBookServiceHeader(){
        String bookServ = validateHelper.checkText(bookSerHeader);
        System.out.println("Printer Book Service Header :" + bookServ);
        return bookServ;
    }


}
