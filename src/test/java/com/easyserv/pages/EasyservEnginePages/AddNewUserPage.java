package com.easyserv.pages.EasyservEnginePages;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewUserPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By emailTextbox = By.xpath("//input[@id='email']");
    private By passwordTextbox = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By selectDepartment = By.xpath("//div[@class='ant-select-selector']");
    private By nextButton = By.xpath("//span[normalize-space()='Next']");
    private By accounting = By.xpath("//div[contains(text(),'Accounting')]");
    private By configMenu = By.xpath("//span[contains(text(),'Configuration')]");
    private By userManaMenu = By.xpath("//a[contains(text(),'User Management')]");
    private By addUserButton = By.xpath("//span[contains(text(),'Add New User')]");
    private By firstName = By.xpath("//input[@id='firstName']");
    private By lastName = By.xpath("//input[@id='lastName']");
    private By jobTitle = By.xpath("//input[@id='jobTitle']");
    private By emailAddress = By.xpath("//input[@id='email']");
    private By mobileNum = By.xpath("//div[@data-label='Mobile Number']//input[@placeholder='Enter mobile number']");
    private By permissTab = By.xpath("//div[@id='rc-tabs-0-tab-two-columns-tabs-tab-permissions']");
    private By permissTitle = By.xpath("//h4[normalize-space()='Permissions']");
    private By newUserTitle = By.xpath("//h1[contains(text(),'New User')]");
    private By userManaTitle = By.xpath("//span[contains(text(),'User Management')]");
    private By backBt = By.xpath("//span[@aria-label='arrow-left']//*[name()='svg']");
    private By cancelBt = By.xpath("//span[normalize-space()='Cancel']");
    private By country =  By.xpath("//div[@data-label='Country']//div[@class='ant-select-selector']");
    private By Austra = By.xpath("//div[contains(text(),'Australia')]");
    private By depart = By.xpath("//div[@class='ant-select-selection-overflow']");
    private By depart_Account = By.xpath("//div[contains(text(),'Accounting')]");
    private By selectOffice = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By office_Molb = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Melbourne']");
    private By addUserSucc = By.xpath("//div[@class='ant-notification-notice-message']");
    private By addUserBt = By.xpath("//button[@type='submit']");
    private By ausCountry = By.xpath("//span[@class='ant-typography ant-typography-secondary']//span[contains(text(),'Australia')]");
    private By accDepart = By.xpath("//span[@class='ant-tag']");
    private By firtNameReq = By.xpath("//div[contains(text(),'The First Name field is required')]");
    private By lastNameReq = By.xpath("//div[contains(text(),'The Last Name field is required')]");
    private By jobTitleReq = By.xpath("//div[contains(text(),'The Job Title field is required')]");
    private By emailAddReq = By.xpath("//div[contains(text(),'The Email Address field is required')]");
    private By mobileNumReq = By.xpath("//div[contains(text(),'The Mobile Number field is required')]");
    private By removeDep = By.xpath("//span[@aria-label='close']//*[name()='svg']");
    private By departReq = By.xpath("//div[contains(text(),'At least one department must be selected')]");
    private By depart_Admin = By.xpath("//div[contains(text(),'Admin')]");
    private By depart_BA = By.xpath("//div[contains(text(),'Business Analyst')]");
    private By depart_BD = By.xpath("//div[contains(text(),'Business Development')]");
    private By depart_Customer = By.xpath("//div[contains(text(),'Customer Care')]");
    private By depart_Data = By.xpath("//div[contains(text(),'Data')]");
    private By moreDepatMess = By.xpath("//div[contains(text(),'Cannot select more than 5 departments.')]");
    private By mobileValidMes = By.xpath("//div[contains(text(),'Please add valid Mobile Number.')]");
    private By emailValidMess = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By emailExisted = By.xpath("//div[contains(text(),'Email Address already existed. Please try again')]");
    private By mobileExisted = By.xpath("//div[contains(text(),'Mobile Number already existed. Please try again')]");

    public AddNewUserPage(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void AddNewUser_TC001(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC002(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC003(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC004(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(backBt);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC005(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC006(String email,String password,String firstname,String emailAdd){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(firstName);
        validateHelper.setText(firstName,firstname);
        validateHelper.clickElement(emailAddress);
        validateHelper.setText(emailAddress,emailAdd);
        validateHelper.clickElement(cancelBt);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC007(String email,String password,String firstname,String lastname,String job,String emailAdd,String mobilenum){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(firstName);
        validateHelper.setText(firstName,firstname);
        validateHelper.clickElement(lastName);
        validateHelper.setText(lastName,lastname);
        validateHelper.clickElement(jobTitle);
        validateHelper.setText(jobTitle,job);
        validateHelper.clickElement(emailAddress);
        validateHelper.setText(emailAddress,emailAdd);
        validateHelper.clickElement(mobileNum);
        validateHelper.setText(mobileNum,mobilenum);
        validateHelper.clickElement(country);
        validateHelper.clickElement(Austra);
        validateHelper.clickElement(selectOffice);
        validateHelper.clickElement(office_Molb);
        validateHelper.clickElement(depart);
        validateHelper.clickElement(depart_Account);
        validateHelper.clickElement(depart);
        validateHelper.clickElement(addUserBt);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC008(String email,String password,String firstname){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(firstName);
        validateHelper.setText(firstName,firstname);
        validateHelper.clearText(firstName);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC009(String email,String password,String lastname){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(lastName);
        validateHelper.setText(lastName,lastname);
        validateHelper.clearText(lastName);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC010(String email,String password,String jobtit){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(jobTitle);
        validateHelper.setText(jobTitle,jobtit);
        validateHelper.clearText(jobTitle);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC011(String email,String password,String emailAdd){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(emailAddress);
        validateHelper.setText(emailAddress,emailAdd);
        validateHelper.clearText(emailAddress);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC012(String email,String password,String mobilenum){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(mobileNum);
        validateHelper.setText(mobileNum,mobilenum);
        validateHelper.clearText(mobileNum);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC013(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(depart);
        validateHelper.clickElement(depart_Account);
        validateHelper.clickElement(depart);
        validateHelper.clickElement(removeDep);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC014(String email,String password){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(depart);
        validateHelper.clickElement(depart_Account);
        validateHelper.clickElement(depart_Admin);
        validateHelper.clickElement(depart_BA);
        validateHelper.clickElement(depart_BD);
        validateHelper.clickElement(depart_Customer);
        validateHelper.clickElement(depart_Data);
        validateHelper.clickElement(depart);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC015(String email,String password,String firstname,String lastname,String job,String emailAdd,String mobilenum){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(firstName);
        validateHelper.setText(firstName,firstname);
        validateHelper.clickElement(lastName);
        validateHelper.setText(lastName,lastname);
        validateHelper.clickElement(jobTitle);
        validateHelper.setText(jobTitle,job);
        validateHelper.clickElement(emailAddress);
        validateHelper.setText(emailAddress,emailAdd);
        validateHelper.clickElement(mobileNum);
        validateHelper.setText(mobileNum,mobilenum);
        validateHelper.clickElement(country);
        validateHelper.clickElement(Austra);
        validateHelper.clickElement(selectOffice);
        validateHelper.clickElement(office_Molb);
        validateHelper.clickElement(depart);
        validateHelper.clickElement(depart_Account);
        validateHelper.clickElement(depart);
        validateHelper.clickElement(addUserBt);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC016(String email,String password,String mobilenum){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(mobileNum);
        validateHelper.setText(mobileNum,mobilenum);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC017(String email,String password,String emailAdd){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(emailAddress);
        validateHelper.setText(emailAddress,emailAdd);
        validateHelper.delay(2);
    }

    public void AddNewUser_TC018(String email,String password,String firstname,String lastname,String job,String emailAdd,String mobilenum){
        validateHelper.setText(emailTextbox,email);
        validateHelper.setText(passwordTextbox,password);
        validateHelper.clickElement(loginButton);
        validateHelper.clickElement(selectDepartment);
        validateHelper.clickElement(accounting);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.clickElement(firstName);
        validateHelper.setText(firstName,firstname);
        validateHelper.clickElement(lastName);
        validateHelper.setText(lastName,lastname);
        validateHelper.clickElement(jobTitle);
        validateHelper.setText(jobTitle,job);
        validateHelper.clickElement(emailAddress);
        validateHelper.setText(emailAddress,emailAdd);
        validateHelper.clickElement(mobileNum);
        validateHelper.setText(mobileNum,mobilenum);
        validateHelper.clickElement(country);
        validateHelper.clickElement(Austra);
        validateHelper.clickElement(selectOffice);
        validateHelper.clickElement(office_Molb);
        validateHelper.clickElement(depart);
        validateHelper.clickElement(depart_Account);
        validateHelper.clickElement(depart);
        validateHelper.clickElement(addUserBt);
        validateHelper.delay(2);
    }

    public String verifyemailExistedMess(){
        String emailMess = validateHelper.checkText(emailExisted);
        System.out.println(emailMess);
        return emailMess;
    }

    public String verifymobileExistedMess(){
        String mobileMess = validateHelper.checkText(mobileExisted);
        System.out.println(mobileMess);
        return mobileMess;
    }

    public String verifyemailValidMess(){
        String emailMess = validateHelper.checkText(emailValidMess);
        System.out.println(emailMess);
        return emailMess;
    }

    public String verifyMobileMess(){
        String mobMess = validateHelper.checkText(mobileValidMes);
        System.out.println(mobMess);
        return mobMess;
    }
    public String verifyDepartmentMoreThanMess(){
        String depMoreMess = validateHelper.checkText(moreDepatMess);
        System.out.println(depMoreMess);
        return depMoreMess;
    }
    public String verifyDepartmentReqMess(){
        String depReqMess = validateHelper.checkText(departReq);
        System.out.println(depReqMess);
        return depReqMess;
    }

    public String verifyMobileReqMess(){
        String mobReqMess = validateHelper.checkText(mobileNumReq);
        System.out.println(mobReqMess);
        return mobReqMess;
    }
    public String verifyEmailAddressReqMess(){
        String jonReqMess = validateHelper.checkText(emailAddReq);
        System.out.println(jonReqMess);
        return jonReqMess;
    }

    public String verifyJobTitleReqMess(){
        String jonReqMess = validateHelper.checkText(jobTitleReq);
        System.out.println(jonReqMess);
        return jonReqMess;
    }
    public String verifyLastNameReqMess(){
        String lastnameMess = validateHelper.checkText(lastNameReq);
        System.out.println(lastnameMess);
        return lastnameMess;
    }
    public String verifyFirtNameReqMess(){
        String firtnameMess = validateHelper.checkText(firtNameReq);
        System.out.println(firtnameMess);
        return firtnameMess;
    }
    public String verifyContryInfo(){
        String counInfo = validateHelper.checkText(ausCountry);
        System.out.println(counInfo);
        return counInfo;
    }

    public String verifyDepartmentInfo(){
        String depInfo = validateHelper.checkText(accDepart);
        System.out.println(depInfo);
        return depInfo;
    }
    public String verifyPermissionsTitle(){
        String permisTit = validateHelper.checkText(permissTitle);
        System.out.println(permisTit);
        return permisTit;
    }

    public String verifyAddUserSuccessMess(){
        String addSus = validateHelper.checkText(addUserSucc);
        System.out.println("Printer Add User Success Message :" + addSus);
        return addSus;
    }


    public String verifyUserManagementTitle(){
        String userMana = validateHelper.checkText(userManaTitle);
        System.out.println(userMana);
        return userMana;
    }
    public String verifyNewUserTitle(){
        String newUser = validateHelper.checkText(newUserTitle);
        System.out.println(newUser);
        return newUser;
    }
    public String verifyStausPermissionTab(){
        String permistit = driver.findElement(permissTab).getAttribute("aria-disabled");
        System.out.println(permistit);
        return permistit;
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

    public Boolean verifyStatusMobileNumberField(){
        boolean mobiNum = validateHelper.enableElement(mobileNum);
        System.out.println("Printer Status Mobile textbox :" + mobiNum);
        return mobiNum;
    }
}
