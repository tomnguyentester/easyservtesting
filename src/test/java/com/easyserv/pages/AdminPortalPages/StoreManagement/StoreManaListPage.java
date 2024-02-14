package com.easyserv.pages.AdminPortalPages.StoreManagement;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StoreManaListPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By configMenu = By.xpath("//span[contains(text(),'Configuration')]");
    private By storeManaMenu = By.xpath("//a[normalize-space()='Store Management']");
    private By storeManaHeader = By.xpath("//span[@title='Store Management']");
    private By seachTextbox = By.xpath("//input[@placeholder='Search']");
    private By seachIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");
    private By storeNameCol = By.xpath("//tbody/tr[2]/td[2]");
    private By phoneNumCol = By.xpath("//tbody/tr[2]/td[4]");
    private By pageDropdown = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By page_10 = By.xpath("//div[contains(text(),'10 / page')]");
    private By paginationDrop = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By addStoreButton = By.xpath("//span[contains(text(),'Add Store')]");
    private By storeDetailHeader = By.xpath("//h1[contains(text(),'Store Details')]");
    private By storeName = By.xpath("//input[@id='name']");
    private By storePhone = By.xpath("//input[@id='contactPhoneNumber']");
    private By storeEmail = By.xpath("//input[@id='contactEmail']");
    private By storeAddress = By.xpath("//input[@id='addressLine1']");
    private By addButton = By.xpath("//button[@type='submit']");
    private By namerequiredMess = By.xpath("//div[contains(text(),'The Name field is required')]");
    private By phonerequiredMess = By.xpath("//div[contains(text(),'The Phone Number field is required')]");
    private By emailrequiredMess = By.xpath("//div[contains(text(),'The Email field is required')]");
    private By addressrequiredMess = By.xpath("//div[contains(text(),'The Address field is required')]");
    private By postcoderequiredMess = By.xpath("//div[contains(text(),'The Postcode field is required')]");
    private By suburbrequiredMess = By.xpath("//div[contains(text(),'The suburb field is required')]");
    private By phoneValidMess = By.xpath("//div[contains(text(),'Please add valid Phone Number.')]");
    private By emailValidMess = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By postcodeValidMess = By.xpath("//div[contains(text(),'No valid post code found')]");
    private By postCode = By.xpath("//body/div[@id='__next']/section[1]/section[1]/div[1]/div[2]/main[1]/section[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]");
    private By selectAllambie = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Allambie']");
    private By SubAllambie = By.xpath("//span[@title='Allambie']");
    private By suburb = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-status-success ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By cancelButton = By.xpath("//span[normalize-space()='Cancel']");
    private By hideStoreCheckbox = By.xpath("//input[@id='isHidden']");
    private By storeNameRow = By.xpath("//tbody/tr[2]/td[2]");
    private By operatingHoursTab = By.xpath("//div[@id='rc-tabs-0-tab-two-columns-tabs-tab-operating-hours']");
    private By generalScheduleTitle = By.xpath("//h1[contains(text(),'General Schedule')]");
    private By promotionCodesTab = By.xpath("//div[@id='rc-tabs-0-tab-two-columns-tabs-tab-promotion-codes']");
    private By proMana = By.xpath("//h1[contains(text(),'Promotion Management')]");
    private By searchProTextbox = By.xpath("//input[@placeholder='Search']");
    private By searchIcon = By.xpath("//*[name()='path' and contains(@d,'M909.6 854')]");
    private By nameProRow = By.xpath("//tbody/tr[1]/td[2]");
    private By ProCodeRow = By.xpath("//tbody/tr[1]/td[4]");
    private By ProDesRow = By.xpath("//tbody/tr[1]/td[3]");
    private By noData = By.xpath("//div[contains(text(),'No data')]");
    private By filterIcon = By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-lg ant-btn-icon-only']");
    private By filterHeader = By.xpath("//div[contains(text(),'Filters')]");
    private By applyButton = By.xpath("//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//button[2]");
    private By clearAllButton = By.xpath("//button[@class='ant-btn ant-btn-text']");
    private By addProCodeBt = By.xpath("//span[contains(text(),'Add promotion code')]");
    private By addName = By.xpath("//input[@id='basic_name']");
    private By addProCode = By.xpath("//input[@id='basic_promoCode']");
    private By addDescrip = By.xpath("//textarea[@id='basic_description']");
    private By startDay = By.xpath("//input[@id='basic_startDate']");
    private By startTodayBt = By.xpath("//a[@class='ant-picker-today-btn']");
    private By endDay = By.xpath("//input[@id='basic_endDate']");
    private By endTodatBt = By.xpath("//a[@class='ant-picker-today-btn']");
    private By AddButton = By.xpath("//span[normalize-space()='Add']");
    private By proCodeReqMess = By.xpath("//div[contains(text(),'The Promo Code field is required')]");
    private By nameReqMess = By.xpath("//div[contains(text(),'The Name field is required')]");
    private By addProSuccess = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");
    private By pakageCateTab = By.xpath("//div[@data-node-key='two-columns-tabs-tab-package-categories']");
    private By serviceTab = By.xpath("//strong[contains(text(),'Service')]");
    private By repairsTab = By.xpath("//strong[contains(text(),'Repairs')]");
    private By inspecTab = By.xpath("//strong[contains(text(),'Inspections')]");
    private By othersTab = By.xpath("//strong[contains(text(),'Others')]");
    private By capaSettingTab = By.xpath("//div[@data-node-key='two-columns-tabs-tab-capacity-preset']");
    private By capacitySettTitle = By.xpath("//p[normalize-space()='Capacity Setting']");



    public StoreManaListPage(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void StoreManaList_TC001(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.delay(2);
    }

    public void StoreManaList_TC002(String email,String password,String storename){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(seachTextbox);
        validateHelper.setText(seachTextbox,storename);
        validateHelper.clickElement(seachIcon);
        validateHelper.delay(2);
    }

    public void StoreManaList_TC003(String email,String password,String phonenumber){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(seachTextbox);
        validateHelper.setText(seachTextbox,phonenumber);
        validateHelper.clickElement(seachIcon);
        validateHelper.delay(2);
    }

    public void StoreManaList_TC004(String email, String password) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.movetoElement(paginationDrop);
        validateHelper.clickElement(pageDropdown);
        validateHelper.clickElement(page_10);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC005(String email, String password) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(addStoreButton);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC006(String email, String password) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(addStoreButton);
        validateHelper.clickElement(addButton);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC007(String email, String password,String phone_,String email_,String postCode_) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(addStoreButton);
        validateHelper.clickElement(storePhone);
        validateHelper.setText(storePhone,phone_);
        validateHelper.clickElement(storeEmail);
        validateHelper.setText(storeEmail,email_);
        validateHelper.clickElement(postCode);
        validateHelper.setText(postCode,postCode_);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC008(String email, String password,String name_,String phone_,String email_,String address_,String postCode_) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(addStoreButton);
        validateHelper.clickElement(storeName);
        validateHelper.setText(storeName,name_);
        validateHelper.clickElement(storePhone);
        validateHelper.setText(storePhone,phone_);
        validateHelper.clickElement(storeEmail);
        validateHelper.setText(storeEmail,email_);
        validateHelper.clickElement(storeAddress);
        validateHelper.setText(storeAddress,address_);
        validateHelper.clickElement(postCode);
        validateHelper.setText(postCode,postCode_);
        validateHelper.clickElement(suburb);
        validateHelper.clickElement(selectAllambie);
        //validateHelper.clickElement(addButton);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC009(String email, String password,String name_,String phone_,String email_,String address_,String postCode_) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(addStoreButton);
        validateHelper.clickElement(storeName);
        validateHelper.setText(storeName,name_);
        validateHelper.clickElement(storePhone);
        validateHelper.setText(storePhone,phone_);
        validateHelper.clickElement(storeEmail);
        validateHelper.setText(storeEmail,email_);
        validateHelper.clickElement(storeAddress);
        validateHelper.setText(storeAddress,address_);
        validateHelper.clickElement(postCode);
        validateHelper.setText(postCode,postCode_);
        validateHelper.clickElement(suburb);
        validateHelper.clickElement(selectAllambie);
        validateHelper.clickElement(cancelButton);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC010(String email, String password) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(addStoreButton);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC011(String email, String password) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(operatingHoursTab);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC012(String email, String password) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(promotionCodesTab);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC013(String email, String password,String proName) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(promotionCodesTab);
        validateHelper.clickElement(seachTextbox);
        validateHelper.setText(seachTextbox,proName);
        validateHelper.clickElement(seachIcon);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC014(String email, String password,String proCode) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(promotionCodesTab);
        validateHelper.clickElement(seachTextbox);
        validateHelper.setText(seachTextbox,proCode);
        validateHelper.clickElement(seachIcon);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC015(String email, String password,String proDes) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(promotionCodesTab);
        validateHelper.clickElement(seachTextbox);
        validateHelper.setText(seachTextbox,proDes);
        validateHelper.clickElement(seachIcon);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC016(String email, String password,String proCode) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(promotionCodesTab);
        validateHelper.clickElement(seachTextbox);
        validateHelper.setText(seachTextbox,proCode);
        validateHelper.clickElement(seachIcon);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC017(String email, String password) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(promotionCodesTab);
        validateHelper.clickElement(filterIcon);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC018(String email, String password,String name_,String descrip) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(promotionCodesTab);
        validateHelper.clickElement(addProCodeBt);
        validateHelper.clickElement(addName);
        validateHelper.setText(addName,name_);
        validateHelper.clickElement(addDescrip);
        validateHelper.setText(addDescrip,descrip);
        validateHelper.clickElement(startDay);
        validateHelper.clickElement(startTodayBt);
        validateHelper.clickElement(endDay);
        validateHelper.clickElement(endTodatBt);
        validateHelper.clickElement(AddButton);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC019(String email, String password,String proCode_,String descrip) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(promotionCodesTab);
        validateHelper.clickElement(addProCodeBt);
        validateHelper.clickElement(addProCode);
        validateHelper.setText(addProCode,proCode_);
        validateHelper.clickElement(addDescrip);
        validateHelper.setText(addDescrip,descrip);
        validateHelper.clickElement(startDay);
        validateHelper.clickElement(startTodayBt);
        validateHelper.clickElement(endDay);
        validateHelper.clickElement(endTodatBt);
        validateHelper.clickElement(AddButton);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC020(String email, String password,String name_,String proCode_,String descrip) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(promotionCodesTab);
        validateHelper.clickElement(addProCodeBt);
        validateHelper.clickElement(addName);
        validateHelper.setText(addName,name_);
        validateHelper.clickElement(addProCode);
        validateHelper.setText(addProCode,proCode_);
        validateHelper.clickElement(addDescrip);
        validateHelper.setText(addDescrip,descrip);
        validateHelper.clickElement(startDay);
        validateHelper.clickElement(startTodayBt);
        validateHelper.clickElement(endDay);
        validateHelper.clickElement(endTodatBt);
        validateHelper.clickElement(AddButton);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC021(String email, String password) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(pakageCateTab);
        validateHelper.waitForPageLoaded();
    }

    public void StoreManaList_TC022(String email, String password) {
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(storeManaMenu);
        validateHelper.clickElement(storeNameRow);
        validateHelper.clickElement(capaSettingTab);
        validateHelper.waitForPageLoaded();
    }

    public String verifyStoreManaHeader(){
        String storeHeader = validateHelper.checkText(storeManaHeader);
        System.out.println("Print StoreMana Header :" + storeHeader);
        return storeHeader;
    }

    public String verifyStoreNamecol(){
        String storeName = validateHelper.checkText(storeNameCol);
        System.out.println("Print StoreName Col :" + storeName);
        return storeName;
    }

    public String verifyPhoneNumcol(){
        String phonenum = validateHelper.checkText(phoneNumCol);
        System.out.println("Print PhoneNum Col :" + phonenum);
        return phonenum;
    }

    public String verifyStoreDetailHeader(){
        String storeDetail = validateHelper.checkText(storeDetailHeader);
        System.out.println("Print StoreDetail Header :" + storeDetail);
        return storeDetail;
    }

    public int verifyTotalStore(){
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        System.out.println("Total Customer is :" + rows.size());
        return rows.size();
    }

    public String verifyNameReqMess(){
        String name_ = validateHelper.checkText(namerequiredMess);
        System.out.println("Print NameReq Mess :" + name_);
        return name_;
    }

    public String verifyPhoneReqMess(){
        String phone_ = validateHelper.checkText(phonerequiredMess);
        System.out.println("Print PhoneReq Mess :" + phone_);
        return phone_;
    }

    public String verifyEmailReqMess(){
        String email_ = validateHelper.checkText(emailrequiredMess);
        System.out.println("Print EmailReq Mess :" + email_);
        return email_;
    }

    public String verifyAddressReqMess(){
        String address_ = validateHelper.checkText(addressrequiredMess);
        System.out.println("Print AddressReq Mess :" + address_);
        return address_;
    }

    public String verifyPostCodeReqMess(){
        String postCode_ = validateHelper.checkText(postcoderequiredMess);
        System.out.println("Print PostCodeReq Mess :" + postCode_);
        return postCode_;
    }

    public String verifySubReqMess(){
        String sub_ = validateHelper.checkText(suburbrequiredMess);
        System.out.println("Print SubReq Mess :" + sub_);
        return sub_;
    }

    public String verifyPhoneValidMess(){
        String phone_ = validateHelper.checkText(phoneValidMess);
        System.out.println("Print Phone Valid Mess :" + phone_);
        return phone_;
    }

    public String verifyEmailValidMess(){
        String email_ = validateHelper.checkText(emailValidMess);
        System.out.println("Print Email Valid Mess :" + email_);
        return email_;
    }

    public String verifyPostcodeValidMess(){
        String postCode_ = validateHelper.checkText(postcodeValidMess);
        System.out.println("Print PostCode Valid Mess :" + postCode_);
        return postCode_;
    }

    public String verifyStoreNameTextbox(){
        String storename_ = validateHelper.checkText(storeName);
        System.out.println("Print Value FirstName :" + storename_);
        return storename_;
    }

    public String verifyPhoneTextbox(){
        String storephone_ = validateHelper.checkText(storePhone);
        System.out.println("Print Value Phone :" + storephone_);
        return storephone_;
    }

    public Boolean verifyStatusHideStore(){
        boolean hideStore_ = validateHelper.enableElement(hideStoreCheckbox);
        System.out.println("Print Status Hide Store Checkbox: " +hideStore_);
        return hideStore_;
    }

    public String verifyGeneralScheduleTitle(){
        String geneSch_ = validateHelper.checkText(generalScheduleTitle);
        System.out.println("Print General Schedule Title: " + geneSch_);
        return geneSch_;
    }

    public String verifyPromotionManaTitle(){
        String proMana_ = validateHelper.checkText(proMana);
        System.out.println("Print ProMana Title: " + proMana_);
        return proMana_;
    }

    public String verifySearchNamePro(){
        String proName_ = validateHelper.checkText(nameProRow);
        System.out.println("Print ProName: " + proName_);
        return proName_;
    }

    public String verifySearchProCode(){
        String proCode_ = validateHelper.checkText(ProCodeRow);
        System.out.println("Print ProCode: " + proCode_);
        return proCode_;
    }

    public String verifySearchProDes(){
        String proDes_ = validateHelper.checkText(ProDesRow);
        System.out.println("Print ProDes: " + proDes_);
        return proDes_;
    }

    public String verifySearchNoData(){
        String proNodata_ = validateHelper.checkText(noData);
        System.out.println("Print ProNoData: " + proNodata_);
        return proNodata_;
    }

    public String verifyFilterHeader(){
        String filHeader_ = validateHelper.checkText(filterHeader);
        System.out.println("Print FilterHeader: " + filHeader_);
        return filHeader_;
    }

    public boolean verifyStatusApplyButton(){
        boolean applyBt_ = validateHelper.isDiplayedElement(applyButton);
        System.out.println("Print Apply Button: " + applyBt_);
        return applyBt_;
    }

    public boolean verifyStatusClearAllButton(){
        boolean clearallBt_ = validateHelper.isDiplayedElement(clearAllButton);
        System.out.println("Print Clear All Button: " + clearallBt_);
        return clearallBt_;
    }

    public String verifyProCodeReqMess(){
        String mess = validateHelper.checkText(proCodeReqMess);
        System.out.println("Print ProCode Req Mess :" + mess);
        return mess;
    }

    public String verifyProNameReqMess(){
        String mess = validateHelper.checkText(nameReqMess);
        System.out.println("Print ProName Req Mess :" + mess);
        return mess;
    }

    public String verifyAddProSuccess(){
        String mess = validateHelper.checkText(addProSuccess);
        System.out.println("Print Add Pro Mess :" + mess);
        return mess;
    }

    public String verifyServiceTitle(){
        String servTit = validateHelper.checkText(serviceTab);
        System.out.println("Print Service Title :" + servTit);
        return servTit;
    }

    public String verifyRepairTitle(){
        String repaTit = validateHelper.checkText(repairsTab);
        System.out.println("Print Repairs Title :" + repaTit);
        return repaTit;
    }
    public String verifyInspecTitle(){
        String inpecTit = validateHelper.checkText(inspecTab);
        System.out.println("Print Inpec Title :" + inpecTit);
        return inpecTit;
    }

    public String verifyOthersTitle(){
        String otherTit = validateHelper.checkText(othersTab);
        System.out.println("Print Other Title :" + otherTit);
        return otherTit;
    }

    public String verifyCapaSettingTitle(){
        String capaTit = validateHelper.checkText(capacitySettTitle);
        System.out.println("Print Capacity Title :" + capaTit);
        return capaTit;
    }



}
