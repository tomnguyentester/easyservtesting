package com.easyserv.pages.AdminPortalPages.UserManagement;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserManaListPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By configMenu = By.xpath("//span[contains(text(),'Configuration')]");
    private By userManaMenu = By.xpath("//a[contains(text(),'User Management')]");
    private By userManaHeader = By.xpath("//span[@title='User Management']");
    private By addUserButton = By.xpath("//button[@class='ant-btn ant-btn-primary']");
    private By searchBox = By.xpath("//input[@placeholder='Search']");
    private By status = By.xpath("//th[contains(text(),'Status')]");
    private By name = By.xpath("//span[contains(text(),'Name')]");
    private By nameCol = By.xpath("//tbody/tr[2]/td[2]");
    private By phoneCol = By.xpath("//tbody/tr[2]/td[3]");
    private By emailCol = By.xpath("//tbody/tr[2]/td[4]");
    private By nodata = By.xpath("//div[contains(text(),'No data')]");
    private By filterButton = By.xpath("//*[name()='path' and contains(@d,'M349 838c0')]");
    private By filterTitle = By.xpath("//span[normalize-space()='Filters']");
    private By applyButton = By.xpath("//body//div//button[2]");
    private By clearallButton = By.xpath("//button[@class='ant-btn ant-btn-text']");
    private By userTypeDrop = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By globalType = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Global']");
    private By localType = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Local']");
    private By clearAllBt = By.xpath("//u[contains(text(),'Clear all')]");
    private By userDetailTab = By.xpath("//div[@id='rc-tabs-2-tab-two-columns-tabs-tab-user']");
    private By addUserTitle = By.xpath("//span[contains(text(),'Add New User')]");
    private By userDetailLink = By.xpath("//span[normalize-space()='User Details']");
    private By pageDropdown = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By page_10 = By.xpath("//div[contains(text(),'10 / page')]");
    private By paginationDrop = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");


    public UserManaListPage(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void UserManaList_TC001(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.delay(2);
    }

    public void UserManaList_TC002(String email,String password,String name){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(searchBox);
        validateHelper.setText(searchBox,name);
        validateHelper.pressEnter(searchBox);
        validateHelper.delay(2);
    }

    public void UserManaList_TC003(String email,String password,String phone){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(searchBox);
        validateHelper.setText(searchBox,phone);
        validateHelper.pressEnter(searchBox);
        validateHelper.delay(2);
    }

    public void UserManaList_TC004(String email,String password,String emailuser){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(searchBox);
        validateHelper.setText(searchBox,emailuser);
        validateHelper.pressEnter(searchBox);
        validateHelper.delay(2);
    }

    public void UserManaList_TC005(String email,String password,String emailuser){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(searchBox);
        validateHelper.setText(searchBox,emailuser);
        validateHelper.pressEnter(searchBox);
        validateHelper.delay(2);
    }

    public void UserManaList_TC006(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(filterButton);
        validateHelper.delay(2);
    }

    public void UserManaList_TC007(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(userTypeDrop);
        validateHelper.clickElement(globalType);
        validateHelper.clickElement(applyButton);
        validateHelper.delay(2);
    }

    public void UserManaList_TC008(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(userTypeDrop);
        validateHelper.clickElement(localType);
        validateHelper.clickElement(applyButton);
        validateHelper.delay(2);
    }

    public void UserManaList_TC009(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(userTypeDrop);
        validateHelper.clickElement(globalType);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(clearallButton);
        validateHelper.delay(2);
    }

    public void UserManaList_TC0010(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(userTypeDrop);
        validateHelper.clickElement(localType);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(clearAllBt);
        validateHelper.delay(2);
    }

    public void UserManaList_TC011(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(addUserButton);
        validateHelper.delay(2);
    }

    public void UserManaList_TC012(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.clickElement(nameCol);
        validateHelper.delay(2);
    }

    public void UserManaList_TC013(String email,String password){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(userManaMenu);
        validateHelper.movetoElement(paginationDrop);
        validateHelper.clickElement(pageDropdown);
        validateHelper.clickElement(page_10);
        validateHelper.waitForPageLoaded();
    }



    public String verifyUserManaHeader(){
        String header = validateHelper.checkText(userManaHeader);
        System.out.println("Print UserMan Header :" + header);
        return header;
    }

    public boolean verifyStatusAddUserButton(){
        boolean addBt = validateHelper.isDiplayedElement(addUserButton);
        System.out.println("Print status AddUser Button :" + addBt);
        return addBt;
    }

    public boolean verifyStatusSearchBox(){
        boolean search_box = validateHelper.enableElement(searchBox);
        System.out.println("Print status Search Box :" + search_box);
        return search_box;
    }

    public String verifyStatusTitle(){
        String statusCol = validateHelper.checkText(status);
        System.out.println("Print Status title :" + statusCol);
        return statusCol;
    }

    public String verifyNameTitle(){
        String nameCol = validateHelper.checkText(name);
        System.out.println("Print Name title :" + nameCol);
        return nameCol;
    }

    public String verifyNameColumn(){
        String name = validateHelper.checkText(nameCol);
        System.out.println("Print Name col :" + name);
        return name;
    }

    public String verifyPhoneColumn(){
        String phone = validateHelper.checkText(phoneCol);
        System.out.println("Print Phone col :" + phone);
        return phone;
    }

    public String verifyEmailColumn(){
        String email = validateHelper.checkText(emailCol);
        System.out.println("Print email col :" + email);
        return email;
    }

    public String verifySearchInvalid(){
        String noData = validateHelper.checkText(nodata);
        System.out.println("Print NoData :" + noData);
        return noData;
    }

    public String verifyFilterTitle(){
        String filHeader = validateHelper.checkText(filterTitle);
        System.out.println("Print filter Title :" + filHeader);
        return filHeader;
    }

    public boolean verifyStatusApplyButton(){
        boolean applyBt = validateHelper.isDiplayedElement(applyButton);
        System.out.println("Print status Apply Button :" + applyBt);
        return applyBt;
    }

    public boolean verifyClearButton(){
        boolean status = validateHelper.isDiplayedElement(clearallButton);
        System.out.println("Print status of Clear Button :" +status);
        return status;
    }

    public boolean verifyStatusUserType(){
        boolean status = validateHelper.enableElement(userTypeDrop);
        System.out.println("Print status of fileter :" +status);
        return status;
    }

    public void verifyUserTypeGlobal(String usertype_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]"));
            String globalType = rowElement.getText();
            if (globalType.equals(usertype_expected)) {
                WebElement userName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
                System.out.println("Print UserType Global :" + userName.getText());
            } else {
                throw new Exception("Cannot finding global type");
            }
        }
    }

    public void verifyUserTypeLocal(String usertype_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]"));
            String localType = rowElement.getText();
            if (localType.equals(usertype_expected)) {
                WebElement userName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
                System.out.println("Print UserType Local :" + userName.getText());
            } else {
                throw new Exception("Cannot finding local type");
            }
        }
    }

    public void verifyAllUserType(String global_status, String local_status) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]"));
            String usertype = rowElement.getText();
            if (usertype.equals(global_status) || usertype.equals(local_status)) {
                WebElement userName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
                System.out.println("Print UserName :" + userName.getText());
            } else {
                throw new Exception("Cannot finding Global/Local type");
            }
        }
    }

    public String VerifyAddNewUserTitle(){
        String addUse = validateHelper.checkText(addUserTitle);
        System.out.println("Print AddNew title :" + addUse);
        return addUse;
    }

    public String VerifyUserDetailLink(){
        String user_detail = validateHelper.checkText(userDetailLink);
        System.out.println("Print UserDetail Link :" + user_detail);
        return user_detail;
    }
}
