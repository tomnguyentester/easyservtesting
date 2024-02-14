package com.easyserv.pages.AdminPortalPages.FlightDeckSetting;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.*;

public class BaysPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;
    static String sort;
    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By configMenu = By.xpath("//span[contains(text(),'Configuration')]");
    private By flightdeckMenu = By.xpath("//a[contains(text(),'Flight Deck Setting')]");
    private By bayTab = By.xpath("//div[contains(text(), 'Bays')]");
    private By searchBox = By.xpath("//input[@placeholder='Search']");
    private By searchIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");
    private By addbayButton = By.xpath("//span[contains(text(),'Add Bay')]");
    private By filterButton = By.xpath("//span[@aria-label='filter']");
    private By toogleButton = By.xpath("//button[@class='ant-switch ant-switch-checked']");
    private By addbayHeader = By.xpath("//h3[contains(text(),'Add Bay')]");
    private By addBt = By.xpath("//div[@class='ant-modal-footer']//button[2]");
    private By filterHeader = By.xpath("//span[normalize-space()='Filters']");
    private By clearallButton = By.xpath("//u[normalize-space()='Clear all']");
    private By clearallbt = By.xpath("//span[normalize-space()='Clear all']");
    private By applyButton = By.xpath("//span[normalize-space()='Apply']");
    private By allOption = By.xpath("//span[@title='All']");
    private By inactiveOption = By.xpath("//div[contains(text(),'Inactive')]");
    private By activeOption = By.xpath("//div[contains(text(),'Active')]");
    private By baynameColumn = By.xpath("//span[contains(text(),'Bay Name')]");
    private By threeDotIcon = By.xpath("//span[@aria-label='more']");
    private By editAction = By.xpath("//span[contains(text(),'Edit')]");
    private By inactiveAction = By.xpath("//span[contains(text(),'Set to Inactive')]");
    private By activeAction = By.xpath("//span[contains(text(),'Set to Active')]");
    private By removeAction = By.xpath("//span[contains(text(),'Remove')]");
    private By editbayheader = By.xpath("//h3[contains(text(),'Edit Bay')]");
    private By confirmTitle = By.xpath("//span[contains(text(),'Confirm')]");
    private By confirmText = By.xpath("//div[contains(text(),'Are you sure you want to delete this bay?')]");
    private By noButton = By.xpath("//div[@class='ant-modal-root']//button[1]");
    private By yesButton = By.xpath("//div[@class='ant-modal-root']//button[2]");
    private By confirmSetInactive = By.xpath("//div[contains(text(),'Are you sure you want to set this bay to Inactive ')]");
    private By confirmSetActive = By.xpath("//div[contains(text(),'Are you sure you want to set this bay to Active st')]");
    private By pageDropdown = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By page_10 = By.xpath("//div[contains(text(),'10 / page')]");
    private By paginationDrop = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By cancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    private By baynameTextbox = By.xpath("//input[@id='form_in_modal_name']");
    private By serprogressDrop = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-single ant-select-show-arrow']");
    private By serviceOption = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Servicing']");
    private By servicing = By.xpath("//span[@title='Servicing']");
    private By assgatewayDrop = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-multiple ant-select-show-arrow ant-select-show-search']");
    private By gateway1 = By.xpath("//div[@title='Gateway 1']");
    private By gatewayLabel = By.xpath("//span[@class='ant-select-selection-item-content']");
    private By baynameReqMess = By.xpath("//div[contains(text(),'The Bay Name field is required')]");
    private By noteTextbox = By.xpath("//input[@id='form_in_modal_description']");
    private By inactiveToogle = By.xpath("//div[@class='ant-space ant-space-horizontal ant-space-align-center full space-between']//button[@role='switch']");
    private By yesConfirm = By.xpath("//div[@class='ant-modal-body']//button[2]");
    private By baynameAdded_23 = By.xpath("//td[normalize-space()='Testing23']");
    private By baynameDuplicateMess = By.xpath("//div[contains(text(),'Bay name is already existed. Please try again.')]");
    private By baynameAdded_24 = By.xpath("//td[normalize-space()='Testing24']");
    private By activeStatus = By.xpath("//tbody//tr//td//span[contains(text(),'Active')]");
    public BaysPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void BaysTab_TC001(String email, String password) {
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC002(String email, String password, String bayname) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.setText(searchBox, bayname);
        validateHelper.clickElement(searchIcon);
    }

    public void BaysTab_TC003(String email, String password, String bayname) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.setText(searchBox, bayname);
    }

    public void BaysTab_TC004(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC005(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(filterButton);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC006_1(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(inactiveOption);
        validateHelper.clickElement(applyButton);
    }

    public void BaysTab_TC006_2(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(activeOption);
        validateHelper.clickElement(applyButton);
    }

    public void BaysTab_TC007_1(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(inactiveOption);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(clearallButton);
    }

    public void BaysTab_TC007_2(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(activeOption);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(clearallButton);
    }

    public void BaysTab_TC008(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
    }

    public void BaysTab_TC009_1(String email, String password, String bayname_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.setText(searchBox, bayname_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC009_2(String email, String password, String bayname_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.setText(searchBox, bayname_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC010_1(String email, String password, String bay_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.setText(searchBox, bay_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC010_2(String email, String password, String bay_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.setText(searchBox, bay_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC011(String email, String password, String bay_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.setText(searchBox, bay_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(removeAction);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC012_1(String email, String password, String bay_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.setText(searchBox, bay_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(inactiveAction);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC012_2(String email, String password, String bay_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.setText(searchBox, bay_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(activeAction);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC013(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.movetoElement(paginationDrop);
        validateHelper.clickElement(pageDropdown);
        validateHelper.clickElement(page_10);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC014(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC015(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC016(String email, String password, String bayname) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.setText(baynameTextbox, bayname);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC017_1(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.clickElement(serprogressDrop);
        validateHelper.clickElement(serviceOption);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC017_2(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.clickElement(serprogressDrop);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC018(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.clickElement(assgatewayDrop);
        validateHelper.clickElement(gateway1);
        validateHelper.clickElement(gatewayLabel);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC019(String email, String password, String bayname) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.setText(baynameTextbox,bayname);
        validateHelper.clearText(baynameTextbox);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC020(String email, String password, String bayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.setText(baynameTextbox,bayname);
        validateHelper.clickElement(serprogressDrop);
        validateHelper.clickElement(serviceOption);
        validateHelper.clickElement(assgatewayDrop);
        validateHelper.clickElement(gateway1);
        validateHelper.setText(noteTextbox,note);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(inactiveToogle);
        validateHelper.clickElement(yesConfirm);
        validateHelper.clickElement(addBt);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(searchBox,bayname);
        validateHelper.clickElement(searchIcon);
    }

    public void BaysTab_TC021(String email, String password, String bayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.setText(baynameTextbox,bayname);
        validateHelper.clickElement(serprogressDrop);
        validateHelper.clickElement(serviceOption);
        validateHelper.clickElement(assgatewayDrop);
        validateHelper.clickElement(gateway1);
        validateHelper.setText(noteTextbox,note);
        validateHelper.clickElement(addBt);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC022(String email, String password,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.clickElement(assgatewayDrop);
        validateHelper.clickElement(gateway1);
        validateHelper.setText(noteTextbox,note);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC023(String email, String password, String bayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.setText(baynameTextbox,bayname);
        validateHelper.clickElement(serprogressDrop);
        validateHelper.clickElement(serviceOption);
        validateHelper.clickElement(assgatewayDrop);
        validateHelper.clickElement(gateway1);
        validateHelper.setText(noteTextbox,note);
        validateHelper.waitForPageLoaded();
    }

    public void BaysTab_TC024(String email, String password, String bayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(bayTab);
        validateHelper.clickElement(addbayButton);
        validateHelper.setText(baynameTextbox,bayname);
        validateHelper.clickElement(serprogressDrop);
        validateHelper.clickElement(serviceOption);
        validateHelper.clickElement(assgatewayDrop);
        validateHelper.clickElement(gateway1);
        validateHelper.setText(noteTextbox,note);
        validateHelper.clickElement(addBt);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(searchBox,bayname);
        validateHelper.clickElement(searchIcon);
        validateHelper.waitForPageLoaded();
    }

    public String verifyActiveStatus(){
        String active = validateHelper.checkText(activeStatus);
        System.out.println("Print Active Text :" + active);
        return active;
    }

    public String verifyBayName_24(){
        String bayname = validateHelper.checkText(baynameAdded_24);
        System.out.println("Print New Bay :" + bayname);
        return bayname;
    }

    public boolean verifyAddButton(){
        boolean addbt = validateHelper.enableElement(addBt);
        System.out.println("Print Status Add Button :" +addbt);
        return addbt;

    }

    public String verifyBayNameDuplicateMess(){
        String baynamedup = validateHelper.checkText(baynameDuplicateMess);
        System.out.println("Print Message :" +baynamedup);
        return baynamedup;
    }

    public String verifyBayName_23(){
        String bayname = validateHelper.checkText(baynameAdded_23);
        System.out.println("Print New Bay :" + bayname);
        return bayname;
    }

    public String verifyBayNameRequiredMess(){
        String reqmess = validateHelper.checkText(baynameReqMess);
        System.out.println("Print Required Message :" + reqmess);
        return reqmess;
    }

    public String verifyGateNameLabel(){
        String gatename =  validateHelper.checkText(gatewayLabel);
        System.out.println("Print Gateway Name :" +gatename);
        return gatename;
    }

    public void verifyListServiceProgress() {
        WebElement parentTable = driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//div[contains(@class, 'ant-select-item ant-select-item-option')]"));
        String[] expectedSerProg = {"Checked In", "Servicing", "Tyres/ Wheel Servicing", "Washing", "Ready For Pick Up", "Picked Up"};
        for (int i = 0; i < rows.size(); i++) {
            System.out.println(rows.get(i).getText());
            Assert.assertEquals(rows.get(i).getText(), expectedSerProg[i]);
        }
    }

    public String verifyServicingDrop() {
        String serv = validateHelper.checkText(servicing);
        System.out.println("Print text Service : " + serv);
        return serv;
    }

    public String verifyValueBayName() {
        String value = driver.findElement(baynameTextbox).getAttribute("value");
        System.out.println("Value Of GatewayCode TextBox is :" + value);
        return value;
    }

    public int verifyMaxlengthBayNameTextBox() {
        int maxlenght = Integer.parseInt(driver.findElement(baynameTextbox).getAttribute("maxlength"));
        System.out.println("Maxlength Gateway Code Input is :" + maxlenght);
        return maxlenght;
    }

    public boolean verifyCancelButton() {
        boolean cancel_bt = validateHelper.enableElement(cancelButton);
        return cancel_bt;
    }

    public int verifyTotalBay() {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        System.out.println("Total Bay is :" + rows.size());
        return rows.size();
    }

    public String verifyConfirmSetActiveText() {
        String activetext = validateHelper.checkText(confirmSetActive);
        System.out.println("Print Confirm Set Active :" + activetext);
        return activetext;
    }

    public String verifyConfirmSetInactiveText() {
        String inactivetext = validateHelper.checkText(confirmSetInactive);
        System.out.println("Print Confirm Set Inactive :" + inactivetext);
        return inactivetext;
    }

    public String verifyConfirmTitle() {
        String confirmtitle = validateHelper.checkText(confirmTitle);
        System.out.println("Print Confirm Title :" + confirmtitle);
        return confirmtitle;
    }

    public String verifyConfirmText() {
        String confirmtext = validateHelper.checkText(confirmText);
        System.out.println("Print Confirm Text :" + confirmtext);
        return confirmtext;
    }

    public boolean verifyStatusNoButton() {
        boolean nobutton = validateHelper.isDiplayedElement(noButton);
        System.out.println("Status No Button is: " + nobutton);
        return nobutton;
    }

    public boolean verifyStatusYesButton() {
        boolean yesbutton = validateHelper.isDiplayedElement(yesButton);
        System.out.println("Status Yes Button is: " + yesbutton);
        return yesbutton;
    }

    public String verifyEditBayTitle() {
        String editbayTitle = validateHelper.checkText(editbayheader);
        System.out.println("Print Edit Bay Title :" + editbayTitle);
        return editbayTitle;
    }

    public String verifyRemoveActionTitle() {
        String remove = validateHelper.checkText(removeAction);
        System.out.println("Print Remove Title :" + remove);
        return remove;
    }

    public String verifySetToActiveTitle() {
        String actitle = validateHelper.checkText(activeAction);
        System.out.println("Print Active Title :" + actitle);
        return actitle;
    }

    public String verifySetToInactiveTitle() {
        String actitle = validateHelper.checkText(inactiveAction);
        System.out.println("Print Active Title :" + actitle);
        return actitle;
    }

    public String verifyEditActionTitle() {
        String edit = validateHelper.checkText(editAction);
        System.out.println("Print Edit Title :" + edit);
        return edit;
    }

    public boolean verifyStatusApplyButton() {
        boolean applybt = validateHelper.enableElement(applyButton);
        System.out.println("Status of Apply Button :" + applybt);
        return applybt;
    }

    public boolean verifyStatusClearAllButton() {
        boolean clearbt = validateHelper.enableElement(clearallbt);
        System.out.println("Status of ClearAll Button :" + clearbt);
        return clearbt;
    }

    public String verifyFilterHeader() {
        String filterheader = validateHelper.checkText(filterHeader);
        System.out.println("Get filter header :" + filterheader);
        return filterheader;
    }

    public boolean verifyStatusAddButton() {
        boolean addbt = validateHelper.enableElement(addBt);
        System.out.println("Status Add Button is: " + addbt);
        return addbt;
    }

    public boolean verifyStatusToggleButton() {
        boolean togglebt = validateHelper.enableElement(toogleButton);
        System.out.println("Status Toggle Button is: " + togglebt);
        return togglebt;
    }

    public String verifyAddBayHeader() {
        String addbayheader = validateHelper.checkText(addbayHeader);
        System.out.println("Header of Add Bay Popup: " + addbayheader);
        return addbayheader;
    }

    public String verifyValueSearchBox() {
        String value = driver.findElement(searchBox).getAttribute("value");
        System.out.println("Value Of Search Box is :" + value);
        return value;
    }

    public int verifyMaxlenghtSearchBox() {
        int maxlenght = Integer.parseInt(driver.findElement(searchBox).getAttribute("maxlength"));
        System.out.println("Maxlength Search Box is :" + maxlenght);
        return maxlenght;
    }

    public boolean verifyStatusSearchBox() {
        boolean searchbox = validateHelper.enableElement(searchBox);
        System.out.println("Status Search Box is: " + searchbox);
        return searchbox;
    }

    public boolean verifyStatusAddBayButton() {
        boolean addButton = validateHelper.enableElement(addbayButton);
        System.out.println("Status of Add Beacon Button is: " + addButton);
        return addButton;
    }

    public boolean verifyStatusFilterButton() {
        boolean filterbt = validateHelper.enableElement(filterButton);
        System.out.println("Status of Filter Button is: " + filterbt);
        return filterbt;
    }

    public void verifySearchBayName(String bayname_searching) {
        validateHelper.waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
            String bayNameTable = rowElement.getText();
            Assert.assertEquals(bayNameTable, bayname_searching);
            System.out.println("Bay Name was found :" + rowElement.getText());
        }
    }

    public void verifyBayInactive(String status_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String inactiveStatus = rowElement.getText();
            if (inactiveStatus.equals(status_expected)) {
                WebElement bayName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
                System.out.println("Print Inactive Status :" + bayName.getText());
            } else {
                //System.out.println("Print Active Status :" + rowElement.getText());
                throw new Exception("Cannot finding Inactive Status");
            }
        }
    }

    public void verifyBayActive(String status_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String inactiveStatus = rowElement.getText();
            if (inactiveStatus.equals(status_expected)) {
                WebElement bayName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
                System.out.println("Print Active Status :" + bayName.getText());
            } else {
                //System.out.println("Print Active Status :" + rowElement.getText());
                throw new Exception("Cannot finding Active Status");
            }
        }
    }

    public void verifyStatusTable(String active_status, String inactive_status) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String status = rowElement.getText();
            if (status.equals(inactive_status) || status.equals(active_status)) {
                System.out.println("Print Status of Beacon:" + rowElement.getText());
            } else {
                throw new Exception("Cannot finding Active/Inactive Status");
            }
        }
    }

    public void verifySortingBayName(String[] expectedSortBayName) throws Exception {
        validateHelper.waitForPageLoaded();
        List<WebElement> column = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        String[] before = new String[column.size()];
        for (int i = 1; i < column.size(); i++) {
            before[i] = column.get(i).getText().trim();
            System.out.println(before[i]);
        }
        System.out.println("-----------------------");


        validateHelper.clickElement(baynameColumn);
        validateHelper.delay(2);

        List<WebElement> column1 = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        String[] after = new String[column1.size()];
        for (int i = 1; i < column1.size(); i++) {
            after[i] = column1.get(i).getText().trim();
            //System.out.println(after[i]);
            for (String bayname : expectedSortBayName) {
                if (after[i].equals(bayname)) {
                    System.out.println("Matched : " + after[i]);
                } else {
                    //throw new Exception("Sorting is failed : " + bayname);
                    //System.out.println("Sorting is failed : " + bayname);
                }
            }
        }
    }

}
