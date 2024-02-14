package com.easyserv.pages.AdminPortalPages.UserAccess;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginEasyPage {
    private WebDriver driver;
    public ValidateHelper validateHelper;
    private By headerPageText = By.xpath("//h3[contains(text(),'Welcome back')]");
    private By contentText = By.xpath("//p[contains(text(),'Please enter your details to sign in')]");
    private By emailTitle = By.xpath("//label[contains(text(),'Email')]");
    private By emailBox = By.xpath("//input[@id='email']");
    private By passTitle = By.xpath("//label[contains(text(),'Password')]");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By eyeIcon = By.xpath("//span[@aria-label='eye-invisible']//*[name()='svg']");
    private By rememberCheckbox = By.xpath("//input[@id='remember']");
    private By rememberText = By.xpath("//span[contains(text(),'Remember my credentials')]");
    private By forgotpassLink = By.xpath("//a[contains(text(),'Forgot password?')]");
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



    public LoginEasyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void LoginPage_TC002() {
        validateHelper = new ValidateHelper(driver);
        validateHelper.refreshPage();
        validateHelper.clickElement(signinButton);
        validateHelper.delay(2);
    }

    public void LoginPage_TC003(String password) {
        validateHelper.refreshPage();
        validateHelper.setText(passwordBox, password);
    }

    public void LoginPage_TC004(String password) {
        validateHelper.refreshPage();
        validateHelper.clickElement(eyeIcon);
        validateHelper.setText(passwordBox, password);
    }

    public void LoginPage_TC005(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
    }

    public void LoginPage_TC006(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.pressEnter(passwordBox);
    }

    public void LoginPage_TC007(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
    }

    public void LoginPage_TC008(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
    }

    public void LoginPage_TC009(String email) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        System.out.println("The value of Attribute is: " + validateHelper.getAttribute(emailBox));
    }

    public void LoginPage_TC010(String email,String passwod) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox,passwod);
        validateHelper.clickElement(signinButton);
    }

    public void LoginPage_TC0011(String email, String password, int idStore) {
        validateHelper.refreshPage();
        validateHelper = new ValidateHelper(driver);
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown,idStore);
    }
    public String verifyStoreNameFromDrop(){
        WebElement getStoreName = driver.findElement(storeName);
        String storeNameTitle = getStoreName.getText();
        System.out.println("Store Name is: "+storeNameTitle);
        return storeNameTitle;
    }
    public String validationEmail() {
        String valEmail = validateHelper.checkText(validationEmail);
        System.out.println("Alert Message for email is: " + valEmail);
        return valEmail;
    }

    public String validationPassword() {
        String valPass = validateHelper.checkText(validationPassword);
        return valPass;
    }

    public Boolean verifyCredentialsNoti() {
        boolean credAlert = validateHelper.isDiplayedElement(wrongCredNoti);
        System.out.println("Status of alert is :" + credAlert);
        return credAlert;
    }

    public String verifyCredText() {
        String credMess = validateHelper.checkText(wrongCredText);
        System.out.println(credMess);
        return credMess;
    }

    public Boolean veriyEncryptedPassON() {
        WebElement input = driver.findElement(passwordBox);
        boolean isEncrypted = input.getAttribute("type").equals("password");
        System.out.println("The Atttibute of type is: " + input.getAttribute("type"));
        return isEncrypted;
    }

    public Boolean veriyEncryptedPassOFF() {
        WebElement input = driver.findElement(passwordBox);
        boolean isEncrypted = input.getAttribute("value").equals("12345678");
        System.out.println("The Atttibute of value is: " + input.getAttribute("value"));
        return isEncrypted;
    }

    public String verifyHearder() {
        String hearder = driver.findElement(headerPageText).getText();
        return hearder;
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

    public boolean validationemail() {
        String messgText = driver.findElement(emailValidate).getText();
        String expectedMessText = "The Email field is required";
        return messgText.equals(expectedMessText);
    }

    public boolean validationpass() {
        String messgText = driver.findElement(passValidate).getText();
        String expectedMessText = "The Password field is required";
        return messgText.equals(expectedMessText);
    }

    public void verifyContentText() {
        String content = driver.findElement(contentText).getText();
        Assert.assertEquals(content, "Please enter your details to sign in");
    }

    public Boolean verifyBackButton() {
        Boolean backbutton = validateHelper.enableElement(backtoLoginButton);
        System.out.println("Status of \"Back\" button is :" + backbutton);
        return backbutton;
    }

    public String verifyBacktoText() {
        String backtoText = validateHelper.checkText(backtoLoginText);
        return backtoText;
    }

    public String verifyStoreHearder() {
        String storeHerder = validateHelper.checkText(selectStoreHearder);
        return storeHerder;
    }

    public String verifyStoreLabel() {
        String storeLabel = validateHelper.checkText(storeTitle);
        return storeLabel;
    }

    public Boolean verifyStoreDrop() {
        Boolean storedrop = validateHelper.enableElement(storeDropdown);
        System.out.println("Status of \"Store\" Dropdown is :" + storedrop);
        return storedrop;
    }

    public Boolean verifyNextButton() {
        Boolean nextbt = validateHelper.enableElement(nextButton);
        System.out.println("Status of \"Next\" button is :" + nextbt);
        return nextbt;
    }


}
