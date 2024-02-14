package com.easyserv.pages.AdminPortalPages.CustomerManagement;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerDetailsPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By CustomerMana = By.xpath("//a[contains(text(),'Customer Management')]");
    private By cusRow_1 = By.xpath("//tbody/tr[2]/td[1]");
    private By searchBox = By.xpath("//input[@placeholder='Search']");
    private By searchIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");
    private By customerName = By.xpath("//h1[contains(text(),'tom nguyen')]");
    private By customerDetailTitle = By.xpath("//h4[contains(text(),'Customer Details')]");
    private By otherInformationTitle = By.xpath("//h4[contains(text(),'Other Information')]");
    private By emailInfo = By.xpath("//span[contains(text(),'nguyentrungdtu@gmail.com')]");
    private By customerDetailHeader = By.xpath("//h1[contains(text(),'Customer Details')]");
    private By saveButton = By.xpath("//button[@type='submit']");
    private By cus_firstName = By.xpath("//input[@id='firstName']");
    private By cus_lastName = By.xpath("//input[@id='lastName']");
    private By phoneNumber = By.xpath("//input[@id='phoneNumber']");
    private By address1 = By.xpath("//input[@id='addressLine1']");
    private By address2 = By.xpath("//input[@id='addressLine2']");
    private By postCode = By.xpath("//body/div[@id='__next']/section[1]/section[1]/div[1]/div[2]/main[1]/section[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]");
    private By companyName = By.xpath("//input[@id='companyName']");
    private By nrmaNO = By.xpath("//input[@id='nrma']");
    private By firstname_req = By.xpath("//div[contains(text(),'Your First Name must not exceed 50 characters.')]");
    private By lastname_req = By.xpath("//div[contains(text(),'Your Last Name must not exceed 50 characters.')]");
    private By phone_req_1 = By.xpath("//div[contains(text(),'Please add valid Mobile Number.')]");
    private By phone_req_2 = By.xpath("//div[contains(text(),'Your Phone Number must not exceed 20 characters.')]");
    private By add_req_1 = By.xpath("//div[contains(text(),'Your Address Line 1 must not exceed 30 characters.')]");
    private By add_req_2 = By.xpath("//div[contains(text(),'Your Address Line 2 must not exceed 20 characters.')]");
    private By postcode_req= By.xpath("//div[contains(text(),'The postCode field must be 4 characters')]");
    private By company_req = By.xpath("//div[contains(text(),'Your Company Name must not exceed 100 characters.')]");
    private By nrma_req = By.xpath("//div[contains(text(),'Your NRMA Member No. must not exceed 20 characters')]");
    private By postcode_mess = By.xpath("//div[contains(text(),'No valid post code found')]");
    private By firtname_mess = By.xpath("//div[contains(text(),'The First Name field is required')]");
    private By lastname_mess = By.xpath("//div[contains(text(),'The Last Name field is required')]");
    private By phone_mess = By.xpath("//div[contains(text(),'The Phone Number field is required')]");
    private By code_mess = By.xpath("//div[contains(text(),'The Postcode field is required')]");
    private By email_cus = By.xpath("//input[@id='email']");
    private By emailExistsNoti = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");
    private By updateSuccessNoti = By.xpath("//div[@class='ant-notification-notice ant-notification-notice-success ant-notification-notice-closable']");
    private By cancelBt = By.xpath("//span[normalize-space()='Cancel']");
    private By firstNameValue =  By.id("firstName");
    private By activeToogle = By.xpath("//button[@role='switch']");
    private By yesBt = By.xpath("//div[@class='ant-modal-root']//button[2]");
    private By activeConfirmNoti = By.xpath("//div[@class='ant-notification-notice-message']");
    private By editBt = By.xpath("//strong[contains(text(),'Edit')]");
    private By editTextbox = By.xpath("//textarea[@class='ant-input']");
    private By checkBt = By.xpath("//span[@aria-label='check']//*[name()='svg']");
    private By noteText = By.xpath("//div[@class='ant-typography']");


    public CustomerDetailsPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void CustomerDetails_TC001(String email, String password,String customer) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox, customer);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(cusRow_1);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerDetails_TC002(String email, String password,String customer,String firstName,String lastName, String phone,String add1,String add2,String postcode,String copname,String nrma) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox, customer);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(cusRow_1);
        validateHelper.setText(cus_firstName,firstName);
        validateHelper.setText(cus_lastName,lastName);
        validateHelper.setText(phoneNumber,phone);
        validateHelper.setText(address1,add1);
        validateHelper.setText(address2,add2);
        validateHelper.setText(postCode,postcode);
        validateHelper.setText(companyName,copname);
        validateHelper.setText(nrmaNO,nrma);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerDetails_TC003(String email, String password,String customer,String phone,String postcode) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox, customer);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(cusRow_1);
        validateHelper.clearText(phoneNumber);
        validateHelper.setText(phoneNumber,phone);
        validateHelper.setText(postCode,postcode);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerDetails_TC004(String email, String password,String customer) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox, customer);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(cusRow_1);
        validateHelper.clickElement(cus_firstName);
        validateHelper.clearText(cus_firstName);
        validateHelper.clearText(cus_lastName);
        validateHelper.clearText(phoneNumber);
        validateHelper.clearText(postCode);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerDetails_TC005(String email, String password,String customer,String emailcus) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox, customer);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(cusRow_1);
        validateHelper.clickElement(email_cus);
        validateHelper.clearText(email_cus);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(email_cus,emailcus);
        validateHelper.clickElement(saveButton);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerDetails_TC006(String email, String password,String customer,String firstName,String lastName,String add1,String add2,String postcode,String copname,String nrma) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox, customer);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(cusRow_1);
        validateHelper.clickElement(cus_firstName);
        validateHelper.clearText(cus_firstName);
        validateHelper.setText(cus_firstName,firstName);
        validateHelper.clearText(cus_lastName);
        validateHelper.setText(cus_lastName,lastName);
        validateHelper.clearText(address1);
        validateHelper.setText(address1,add1);
        validateHelper.clearText(address2);
        validateHelper.setText(address2,add2);
        validateHelper.clearText(postCode);
        validateHelper.setText(postCode,postcode);
        validateHelper.clearText(companyName);
        validateHelper.setText(companyName,copname);
        validateHelper.clearText(nrmaNO);
        validateHelper.setText(nrmaNO,nrma);
        validateHelper.clickElement(saveButton);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerDetails_TC007(String email, String password,String customer,String firstName,String lastName,String add1,String add2,String postcode,String copname,String nrma) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox, customer);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(cusRow_1);
        validateHelper.clickElement(cus_firstName);
        validateHelper.clearText(cus_firstName);
        validateHelper.setText(cus_firstName,firstName);
        validateHelper.clearText(cus_lastName);
        validateHelper.setText(cus_lastName,lastName);
        validateHelper.clearText(address1);
        validateHelper.setText(address1,add1);
        validateHelper.clearText(address2);
        validateHelper.setText(address2,add2);
        validateHelper.clearText(postCode);
        validateHelper.setText(postCode,postcode);
        validateHelper.clearText(companyName);
        validateHelper.setText(companyName,copname);
        validateHelper.clearText(nrmaNO);
        validateHelper.setText(nrmaNO,nrma);
        validateHelper.clickElement(cancelBt);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerDetails_TC008(String email, String password,String customer) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox, customer);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(cusRow_1);
        validateHelper.clickElement(activeToogle);
        validateHelper.clickElement(yesBt);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerDetails_TC009(String email, String password,String customer,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox, customer);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(cusRow_1);
        validateHelper.clickElement(editBt);
        validateHelper.clickElement(editTextbox);
        validateHelper.setText(editTextbox,note);
        validateHelper.clickElement(checkBt);
        validateHelper.waitForPageLoaded();
    }

    public String verifyNoteText(){
        String note_text = validateHelper.checkText(noteText);
        System.out.println("Print Note Text :" + note_text);
        return note_text;
    }

    public String verifyActiveMessNoti(){
        String active_mess = validateHelper.checkText(activeConfirmNoti);
        System.out.println("Print Active Message :" + active_mess);
        return active_mess;
    }

    public String verifyFirstNameText(){
        String firtName = validateHelper.getAttribute(firstNameValue);
        System.out.println("Print First Name " + firtName);
        return firtName;
    }


    public String verifySuccessMessNoti(){
        String succ_mess = validateHelper.checkText(updateSuccessNoti);
        System.out.println("Print Success Message :" + succ_mess);
        return succ_mess;
    }

    public String verifyEmailExistsMess(){
        String email_mess = validateHelper.checkText(emailExistsNoti);
        System.out.println("Print Email Exits Message Confirm :" +email_mess);
        return email_mess;
    }

    public String verifyFirtNameEmptyMess(){
        String firstname = validateHelper.checkText(firtname_mess);
        System.out.println("Print First Name Message :" + firstname);
        return firstname;
    }

    public String verifyLastNameEmptyMess(){
        String lastname = validateHelper.checkText(lastname_mess);
        System.out.println("Print First Name Message :" + lastname);
        return lastname;
    }

    public String verifyPhoneEmptyMess(){
        String phonenum = validateHelper.checkText(phone_mess);
        System.out.println("Print Phone Number Message :" + phonenum);
        return phonenum;
    }

    public String verifyPostCodeEmptyMess(){
        String codenum = validateHelper.checkText(code_mess);
        System.out.println("Print Post Code Message :" + codenum);
        return codenum;
    }

    public String verifyPostCodeInvalidMess(){
        String postcode = validateHelper.checkText(postcode_mess);
        System.out.println("Print Post Code Message :" +postcode);
        return postcode;
    }

    public String verifyPhoneInvalidMess(){
        String phone = validateHelper.checkText(phone_req_1);
        System.out.println("Print Phone Message :" + phone);
        return phone;
    }

    public String verifyFirstNameReqMess(){
        String firstname_mess = validateHelper.checkText(firstname_req);
        System.out.println("Print First Name Required Message :" + firstname_mess);
        return firstname_mess;
    }

    public String verifyLastNameReqMess(){
        String last_mess = validateHelper.checkText(lastname_req);
        System.out.println("Print Last Name Required Message :" + last_mess);
        return last_mess;
    }

    public String verifyPhoneNumberReqMess(){
        String phone = validateHelper.checkText(phone_req_2);
        System.out.println("Print Phone Number Required Message :" + phone);
        return phone;
    }

    public String verifyAdress1ReqMess(){
        String add_mess = validateHelper.checkText(add_req_1);
        System.out.println("Print Address 1 Required Message :" + add_mess);
        return add_mess;
    }

    public String verifyAdress2ReqMess(){
        String add_mess = validateHelper.checkText(add_req_2);
        System.out.println("Print Address 2 Required Message :" + add_mess);
        return add_mess;
    }

    public String verifyPostCodeReqMess(){
        String postcode_mess = validateHelper.checkText(postcode_req);
        System.out.println("Print Post Code Required Message :" + postcode_mess);
        return postcode_mess;
    }

    public String verifyCompanyReqMess(){
        String comp_mess = validateHelper.checkText(company_req);
        System.out.println("Print Company Required Message :" + comp_mess);
        return comp_mess;
    }

    public String verifyNRMAReqMess(){
        String nrma_mess = validateHelper.checkText(nrma_req);
        System.out.println("Print NRMA required Message :" + nrma_mess);
        return nrma_mess;
    }

    public String verifyCustomerName(){
        String cus_name = validateHelper.checkText(customerName);
        System.out.println("Print Customer Name :" + cus_name);
        return cus_name;
    }

    public String verifycustomerDetailTitle(){
        String cus_detail = validateHelper.checkText(customerDetailTitle);
        System.out.println("Print Customer Detail title :" + cus_detail);
        return cus_detail;
    }

    public String verifyEmailInfo(){
        String email_info = validateHelper.checkText(emailInfo);
        System.out.println("Print Customer Detail title :" + email_info);
        return email_info;
    }

    public String verifyOtherInforTitle(){
        String other_info = validateHelper.checkText(otherInformationTitle);
        System.out.println("Print Customer Name :" + other_info);
        return other_info;
    }

    public String verifyCustomerDetailsHeader(){
        String cusdetail = validateHelper.checkText(customerDetailHeader);
        System.out.println("Print Customer Header :" + cusdetail);
        return cusdetail;
    }

    public boolean verifyStatusSaveButton(){
        boolean savebt = validateHelper.enableElement(saveButton);
        System.out.println("Print Status Save Button :" + savebt);
        return savebt;
    }
}
