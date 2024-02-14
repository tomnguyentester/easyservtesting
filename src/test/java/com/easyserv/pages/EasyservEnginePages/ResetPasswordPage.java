package com.easyserv.pages.EasyservEnginePages;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPasswordPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    String urlReset = "";
    private By resetPassHeader = By.xpath("");
    private By enterNewPassTextbox = By.xpath("");
    private By confirmNewPassTextbox = By.xpath("");
    private By resetButton = By.xpath("");
    private By passReqMess = By.xpath("");
    private By passLeastCharMess = By.xpath("");
    private By passExceedCharMess = By.xpath("");
    private By confirmPassReqMess = By.xpath("");
    private By passNotMatched = By.xpath("");

    public ResetPasswordPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void ResetPassword_TC001(){
        driver.navigate().to(urlReset);
    }

    public void ResetPassword_TC002(String newpass,String confirmpass){
        driver.navigate().to(urlReset);
        validateHelper.setText(enterNewPassTextbox,newpass);
        validateHelper.setText(confirmNewPassTextbox,confirmpass);
    }

    public void ResetPassword_TC003(String newpass,String confirmpass){
        driver.navigate().to(urlReset);
        validateHelper.setText(enterNewPassTextbox,newpass);
        validateHelper.setText(confirmNewPassTextbox,confirmpass);
        validateHelper.clearText(enterNewPassTextbox);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC004(String newpass){
        driver.navigate().to(urlReset);
        validateHelper.setText(enterNewPassTextbox,newpass);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC005(String newpass){
        driver.navigate().to(urlReset);
        validateHelper.setText(enterNewPassTextbox,newpass);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC006(String newpass,String confirmpass){
        driver.navigate().to(urlReset);
        validateHelper.setText(enterNewPassTextbox,newpass);
        validateHelper.setText(confirmNewPassTextbox,confirmpass);
        validateHelper.clearText(confirmNewPassTextbox);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC007(String newpass,String confirmpass){
        driver.navigate().to(urlReset);
        validateHelper.setText(enterNewPassTextbox,newpass);
        validateHelper.setText(confirmNewPassTextbox,confirmpass);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC008(String newpass,String confirmpass){
        driver.navigate().to(urlReset);
        validateHelper.setText(enterNewPassTextbox,newpass);
        validateHelper.setText(confirmNewPassTextbox,confirmpass);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC009(String newpass,String confirmpass){
        driver.navigate().to(urlReset);
        validateHelper.setText(enterNewPassTextbox,newpass);
        validateHelper.setText(confirmNewPassTextbox,confirmpass);
        validateHelper.delay(2);
    }

    public String verifyConfirmPassNotMatchedMess(){
        String passMess = validateHelper.checkText(passNotMatched);
        System.out.println("Printer Confirm Pass Not Matched Mess :" + passMess);
        return passMess;
    }
    public String verifyConfirmPassReqMess(){
        String passMess = validateHelper.checkText(confirmPassReqMess);
        System.out.println("Printer Confirm Pass Required Mess :" + passMess);
        return passMess;
    }

    public String verifyNewPassExceedCharMess(){
        String passMess = validateHelper.checkText(passExceedCharMess);
        System.out.println("Printer Pass Required Mess :" + passMess);
        return passMess;
    }

    public String verifyNewPassLeastCharMess(){
        String passMess = validateHelper.checkText(passLeastCharMess);
        System.out.println("Printer Pass Required Mess :" + passMess);
        return passMess;
    }
    public String verifyNewPassReqMess(){
        String passMess = validateHelper.checkText(passReqMess);
        System.out.println("Printer Pass Required Mess :" + passMess);
        return passMess;
    }
    public String verifyResetPasswordHeader(){
        String reset_header = validateHelper.checkText(resetPassHeader);
        System.out.println("Printer ResetPass Header :" + reset_header);
        return reset_header;
    }
    public Boolean verifyStatusNewPassTextbox(){
        boolean newPass = validateHelper.enableElement(enterNewPassTextbox);
        System.out.println("Printer Status New Pass textbox :" + newPass);
        return newPass;
    }

    public Boolean verifyStatusConfirmPassTextbox(){
        boolean confirmPass = validateHelper.enableElement(confirmNewPassTextbox);
        System.out.println("Printer Status Confirm Pass textbox :" + confirmPass);
        return confirmPass;
    }

    public String verifyNewPassPlaceholder(){
        String newPassPlace = validateHelper.getAttribute(enterNewPassTextbox);
        System.out.println("Printer New Pass Placeholder Text :" + newPassPlace);
        return newPassPlace;
    }

    public String verifyConfirmPassPlaceholder(){
        String confirmPassPlace = validateHelper.getAttribute(confirmNewPassTextbox);
        System.out.println("Printer Confirm Pass Placeholder Text :" + confirmPassPlace);
        return confirmPassPlace;
    }

    public Boolean verifyStatusResetButton(){
        boolean resetBt = validateHelper.enableElement(resetButton);
        System.out.println("Print status Reset Button " + resetBt);
        return resetBt;
    }
}
