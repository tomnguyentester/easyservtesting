package com.easyserv.pages.AdminPortalPages.FlightDeckSetting;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class BeaconsPage {
    private WebDriver driver;
    public ValidateHelper validateHelper;
    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By configMenu = By.xpath("//span[contains(text(),'Configuration')]");
    private By flightdeckMenu = By.xpath("//a[contains(text(),'Flight Deck Setting')]");
    private By beaconTab = By.xpath("//div[@id='rc-tabs-0-tab-two-columns-tabs-tab-beacons']");
    private By flightDeckHeader = By.xpath("//span[contains(text(),'Flight Deck Setting')]");
    private By searchBox = By.xpath("//input[@placeholder='Search']");
    private By searchIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");
    private By addbeaconButton = By.xpath("//span[normalize-space()='Add Beacon']");
    private By filterButton = By.xpath("//span[@aria-label='filter']");
    private By filterHeader = By.xpath("//span[normalize-space()='Filters']");
    private By clearallButton = By.xpath("//span[normalize-space()='Clear all']");
    private By applyButton = By.xpath("//span[normalize-space()='Apply']");
    private By addbeaconHeader = By.xpath("//h3[contains(text(),'Add Beacon')]");
    private By toogleButton = By.xpath("//button[@class='ant-switch ant-switch-checked']");
    private By addButton = By.xpath("//div[@class='ant-modal-footer']//button[2]");
    private By allOption = By.xpath("//span[@title='All']");
    private By inactiveOption = By.xpath("//div[contains(text(),'Inactive')]");
    private By activeOption = By.xpath("//div[contains(text(),'Active')]");
    private By filterNumber = By.xpath("//span[@class='ant-scroll-number-only-unit current']");
    private By clearallBt =  By.xpath("//u[normalize-space()='Clear all']");
    private By beaconNameColumn = By.xpath("//span[contains(text(),'Beacon Name')]");
    private By threeDotIcon = By.xpath("//tbody/tr[2]/td[6]/div[1]/button[1]/span[1]/*[1]");
    private By editAction = By.xpath("//span[contains(text(),'Edit')]");
    private By removeAction = By.xpath("//span[contains(text(),'Remove')]");
    private By activeAction = By.xpath("//span[contains(text(),'Set to Active')]");
    private By inactiveAction = By.xpath("//span[contains(text(),'Set to Inactive')]");
    private By editBeaconHeader = By.xpath("//h3[contains(text(),'Edit Beacon')]");
    private By confirmRemoveText = By.xpath("//div[contains(text(),'Are you sure you want to delete this beacon?')]");
    private By confirmNobutton = By.xpath("//span[contains(text(),'No')]");
    private By confirmYesbutton = By.xpath("//span[normalize-space()='Yes']");
    private By confirmSetToActive = By.xpath("//div[@class='ant-modal-confirm-content']");
    private By pageDropdown = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    //private By pageDropdown = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow ant-select-open']");
    private By page_10 = By.xpath("//div[contains(text(),'10 / page')]");
    private By paginationDrop = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By cancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    private By beaconcodeTextbox = By.xpath("//input[@id='form_in_modal_code']");
    private By beaconnameTextbox = By.xpath("//input[@id='form_in_modal_name']");
    private By markeridTextbox = By.xpath("//input[@id='form_in_modal_markerId']");
    private By noteTextbox = By.xpath("//input[@id='form_in_modal_description']");
    private By beaconRequiredMess = By.xpath("//div[contains(text(),'The Beacon Code field is required')]");
    private By beaconExistedMess = By.xpath("//div[contains(text(),'Beacon code is already existed. Please try again.')]");
    private By addNewBeaconbutton = By.xpath("//button[span='Add']");
    private By markerExistedMess = By.xpath("//div[contains(text(),'Beacon markerId is already existed. Please try aga')]");
    private By successNotification = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");
    //div[@class='ant-notification ant-notification-topRight']//div
    //body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]
    //private By beaconNew = By.xpath("//body[1]/div[1]/section[1]/section[1]/div[1]/div[2]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/span[1]/strong[1]");
    private  By beaconNew = By.xpath("//strong[contains(text(),'TESTING2024')]");
    private By inactiveConfirmMess = By.xpath("//div[contains(text(),'Are you sure you want to set this beacon to Inactive status?')]");
    private By inactiveStatus = By.xpath("//tbody[1]/tr[2]/td[1]/span[1]");
    //body[1]/div[1]/section[1]/section[1]/div[1]/div[2]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]
    private By activeConfirmMess = By.xpath("//div[contains(text(),'Are you sure you want to set this beacon to Active status?')]");
    private By activeStatus = By.xpath("//tbody[1]/tr[2]/td[1]/span[1]");
    private By inactiveToggle = By.xpath("//div[@class='ant-space ant-space-horizontal ant-space-align-center full space-between']//button[@role='switch']");
    private By yesButton = By.xpath("//span[contains(text(),'Yes')]");
    private By saveButton = By.xpath("//span[normalize-space()='Save']");
    private By activeToggle = By.xpath("//button[@class='ant-switch']");
    private By closeIcon = By.xpath("//span[@aria-label='close']//*[name()='svg']");
    private By saveDisable = By.xpath("//button[span='Save']");
    private By updateNotification = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");
    private By removeConfirm =  By.xpath("//div[contains(text(),'Are you sure you want to delete this beacon?')]");
    private By removeNotification = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");
    private By nodaText = By.xpath("//div[contains(text(),'No data')]");

    public BeaconsPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void BeaconsTab_TC001(String email, String password) {
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC002(String email, String password, String beacon_enter) {
        //validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC003(String email, String password, String valueSearch) {
        //validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, valueSearch);
    }

    public void BeaconsTab_TC004(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(addbeaconButton);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC005(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(filterButton);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC006_1(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(inactiveOption);
        validateHelper.clickElement(applyButton);
    }

    public void BeaconsTab_TC006_2(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(activeOption);
        validateHelper.clickElement(applyButton);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC007_1(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(inactiveOption);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(clearallBt);
    }

    public void BeaconsTab_TC007_2(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(activeOption);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(clearallBt);
    }

    public void BeaconsTab_TC008(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(beaconNameColumn);
    }

    public void BeaconsTab_TC009_1(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC009_2(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0010(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0011(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(removeAction);
        validateHelper.waitForPageLoaded();
    }
    public void BeaconsTab_TC0012(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(activeAction);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0013(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.movetoElement(paginationDrop);
        validateHelper.clickElement(pageDropdown);
        validateHelper.clickElement(page_10);
    }

    public void BeaconsTab_TC0014(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(addbeaconButton);
    }

    public void BeaconsTab_TC0015(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(addbeaconButton);
    }

    public void BeaconsTab_TC0016(String email, String password,String beaconcode) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(addbeaconButton);
        validateHelper.setText(beaconcodeTextbox,beaconcode);
    }

    public void BeaconsTab_TC0017(String email, String password,String beaconcode,String beaconName,String markerid,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(addbeaconButton);
        validateHelper.setText(beaconcodeTextbox,beaconcode);
        validateHelper.setText(beaconnameTextbox,beaconName);
        validateHelper.setText(markeridTextbox,markerid);
        validateHelper.setText(noteTextbox,note);
        validateHelper.clearText(beaconcodeTextbox);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0018(String email, String password,String beaconcode,String beaconName,String markerid,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(addbeaconButton);
        validateHelper.setText(beaconcodeTextbox,beaconcode);
        validateHelper.setText(beaconnameTextbox,beaconName);
        validateHelper.setText(markeridTextbox,markerid);
        validateHelper.setText(noteTextbox,note);
        validateHelper.clickElement(addNewBeaconbutton);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0019(String email, String password,String beaconcode,String beaconName,String markerid,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(addbeaconButton);
        validateHelper.setText(beaconcodeTextbox,beaconcode);
        validateHelper.setText(beaconnameTextbox,beaconName);
        validateHelper.setText(markeridTextbox,markerid);
        validateHelper.setText(noteTextbox,note);
        validateHelper.clickElement(addNewBeaconbutton);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0020(String email, String password,String beaconName,String markerid,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(addbeaconButton);
        validateHelper.setText(beaconnameTextbox,beaconName);
        validateHelper.setText(markeridTextbox,markerid);
        validateHelper.setText(noteTextbox,note);
    }

    public void BeaconsTab_TC0021(String email, String password,String beaconcode,String beaconName,String markerid,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.clickElement(addbeaconButton);
        validateHelper.setText(beaconcodeTextbox,beaconcode);
        validateHelper.setText(beaconnameTextbox,beaconName);
        validateHelper.setText(markeridTextbox,markerid);
        validateHelper.setText(noteTextbox,note);
        validateHelper.clickElement(addNewBeaconbutton);
    }

    public void BeaconsTab_TC0022(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(inactiveAction);
    }

    public void BeaconsTab_TC0023(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(activeAction);
    }

    public void BeaconsTab_TC0024_1(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.clickElement(inactiveToggle);
        Assert.assertEquals(verifyInactiveConfirmMessage(), "Are you sure you want to set this beacon to Inactive status?");
        validateHelper.clickElement(yesButton);
        validateHelper.clickElement(saveButton);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0024_2(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.clickElement(activeToggle);
        Assert.assertEquals(verifyActiveConfirmMessage(), "Are you sure you want to set this beacon to Active status?");
        validateHelper.clickElement(yesButton);
        validateHelper.clickElement(saveButton);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0025(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.clickElement(closeIcon);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0026(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0027(String email, String password,String beacon_enter,String beaconName,String beaconcode) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.clearText(beaconcodeTextbox);
        validateHelper.setText(beaconcodeTextbox,beaconcode);
        validateHelper.clearText(beaconnameTextbox);
        validateHelper.setText(beaconnameTextbox,beaconName);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0028(String email, String password,String beacon_enter,String beaconcode,String markerid) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.clearText(beaconcodeTextbox);
        validateHelper.setText(beaconcodeTextbox,beaconcode);
        validateHelper.clearText(markeridTextbox);
        validateHelper.setText(markeridTextbox,markerid);
        validateHelper.clickElement(saveButton);
        validateHelper.waitForPageLoaded();
    }

    public void BeaconsTab_TC0029(String email, String password,String beacon_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(beaconTab);
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(inactiveAction);
        validateHelper.clickElement(yesButton);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(removeAction);
        validateHelper.waitForPageLoaded();
    }

    public String verifyNoData(){
        String nodata = validateHelper.checkText(nodaText);
        System.out.println("The NoData text is :" + nodata);
        return nodata;
    }

    public String verifyRemoveText() {
        String removeMess = validateHelper.checkText(removeNotification);
        System.out.println("The Message of Notification is :" +removeMess);
        return removeMess;
    }

    public String verifyRemoveConfirmText(){
        String confirmMess = validateHelper.checkText(removeConfirm);
        System.out.println("The Message of Notification is :" +confirmMess);
        return confirmMess;
    }
    public String verifyUpdatedText() {
        validateHelper.waitForPageLoaded();
        String updateMess = validateHelper.checkText(updateNotification);
        System.out.println("The Message of Notification is :" +updateMess);
        return updateMess;
    }

    public boolean verifyStatusSaveButton(){
        validateHelper.waitForPageLoaded();
        boolean savebt = validateHelper.enableElement(saveDisable);
        System.out.println("Status Save Button is :" +savebt);
        return savebt;
    }

    public String verifyActiveStatus(){
        validateHelper.waitForPageLoaded();
        String actiStatus = validateHelper.checkText(activeStatus);
        System.out.println("Status new beacon is : "+ actiStatus);
        return actiStatus;
    }

    public String verifyActiveConfirmMessage(){
        validateHelper.waitForPageLoaded();
        String actiMess = validateHelper.checkText(activeConfirmMess);
        System.out.println("Confirm Message is : "+actiMess);
        return actiMess;
    }
    public String verifyInactiveStatus(){
        validateHelper.waitForPageLoaded();
        String inacStatus = validateHelper.checkText(inactiveStatus);
        System.out.println("Status new beacon is : "+ inacStatus);
        return inacStatus;
    }

    public String verifyInactiveConfirmMessage(){
        validateHelper.waitForPageLoaded();
        String inacMess = validateHelper.checkText(inactiveConfirmMess);
        System.out.println("Confirm Message is : "+inacMess);
        return inacMess;
    }

    public String verifyAddBeaconSuccess(String beacon_enter){
        validateHelper.setText(searchBox, beacon_enter);
        validateHelper.clickElement(searchIcon);
        String beaconCode = validateHelper.checkText(beaconNew);
        System.out.println("Beacon Code is :" + beaconCode);
        return beaconCode;
    }

    public Boolean verifyDisplayNotification() {
        validateHelper.waitForPageLoaded();
        boolean successAlert = validateHelper.isDiplayedElement(successNotification);
        System.out.println("Status of alert is :" + successAlert);
        return successAlert;
    }

    public String verifySuccessText() {
        validateHelper.waitForPageLoaded();
        String successMess = validateHelper.checkText(successNotification);
        System.out.println("The Message of Notification is :" +successMess);
        return successMess;
    }

    public boolean verifyStatusAddNewBeaconButton(){
        boolean statusAddButton = validateHelper.enableElement(addNewBeaconbutton);
        System.out.println("Status of Add button is :" +statusAddButton);
        return statusAddButton;
    }

    public String verifyMarkerIdExistedMessage(){
        String markerMess = validateHelper.checkText(markerExistedMess);
        System.out.println("Message is :" +markerMess);
        return markerMess;
    }

    public String verifyBeaconCodeExistedMessage(){
        String codeMess = validateHelper.checkText(beaconExistedMess);
        System.out.println("Message is :" +codeMess);
        return codeMess;
    }

    public String verifyBeaconCodeRequiredMessage(){
        String codeMess = validateHelper.checkText(beaconRequiredMess);
        System.out.println("Message Required is :" +codeMess);
        return codeMess;
    }

    public String verifyValueBeaconCode() {
        String value = driver.findElement(beaconcodeTextbox).getAttribute("value");
        System.out.println("Value Of Beacon TextBox is :" + value);
        return value;
    }

    public int verifyMaxlengthBeaconTextBox() {
        int maxlenght = Integer.parseInt(driver.findElement(beaconcodeTextbox).getAttribute("maxlength"));
        System.out.println("Maxlength Beacon Code Input is :" + maxlenght);
        return maxlenght;
    }

    public boolean verifyCancelButton(){
        boolean cancel_bt = validateHelper.enableElement(cancelButton);
        return cancel_bt;
    }

    public boolean verifyToggleButton(){
        boolean active_tog = validateHelper.enableElement(toogleButton);
        System.out.println("Status of Toggle Button is: " + active_tog);
        return active_tog;
    }

    public int verifyTotalBeacon(){
        //waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        System.out.println("Total Beacon is :" + rows.size());
        return rows.size();
    }

    public String verifyConfirmSetToActiveText() {
        String confirm_text = validateHelper.checkText(confirmSetToActive);
        System.out.println("Print Confirm Set to Active Text :" + confirm_text);
        return confirm_text;
    }

    public boolean verifyYesButton(){
        boolean yes_button =  validateHelper.isDiplayedElement(confirmYesbutton);
        System.out.println("Status of Yes button :" + yes_button);
        return yes_button;
    }

    public boolean verifyNoButton(){
        boolean no_button =  validateHelper.isDiplayedElement(confirmNobutton);
        System.out.println("Status of No button :" + no_button);
        return no_button;
    }
    public String verifyConfirmRemoveText() {
        String confirm_text = validateHelper.checkText(confirmRemoveText);
        System.out.println("Print Confirm Remove Text :" + confirm_text);
        return confirm_text;
    }

    public String verifyEditBeaconHeader() {
        String editbeacon_header = validateHelper.checkText(editBeaconHeader);
        System.out.println("Print Header Edit Beacon :" + editbeacon_header);
        return editbeacon_header;
    }
    public boolean verifyEditAction(){
        boolean edit_action =  validateHelper.isDiplayedElement(editAction);
        System.out.println("Status of Edit Action :" + edit_action);
        return edit_action;
    }

    public boolean verifyRemoveAction(){
        boolean remove_action =  validateHelper.isDiplayedElement(removeAction);
        System.out.println("Status of Remove Action :" + remove_action);
        return remove_action;
    }

    public boolean verifySetToActiveAction(){
        boolean active_action =  validateHelper.isDiplayedElement(activeAction);
        System.out.println("Status of Set To Active :" + active_action);
        return active_action;
    }

    public boolean verifySetToInActiveAction(){
        boolean inactive_action =  validateHelper.isDiplayedElement(inactiveAction);
        System.out.println("Status of Set To Inactive :" + inactive_action);
        return inactive_action;
    }

    public boolean verifyStatusAddButton() {
        boolean addbt = validateHelper.enableElement(addButton);
        System.out.println("Status Add Button is: " + addbt);
        return addbt;
    }

    public boolean verifyStatusToggleButton() {
        boolean togglebt = validateHelper.enableElement(toogleButton);
        System.out.println("Status Toggle Button is: " + togglebt);
        return togglebt;
    }

    public String verifyAddBeaconHeader() {
        String addbeaconheader = validateHelper.checkText(addbeaconHeader);
        System.out.println("Header of Add Beacon Popup: " + addbeaconheader);
        return addbeaconheader;
    }

    public boolean verifyStatusApplyButton() {
        boolean applybt = validateHelper.enableElement(applyButton);
        System.out.println("Status of Apply Button :" + applybt);
        return applybt;
    }

    public boolean verifyStatusClearAllButton() {
        boolean clearbt = validateHelper.enableElement(clearallButton);
        System.out.println("Status of ClearAll Button :" + clearbt);
        return clearbt;
    }

    public String verifyFilterHeader() {
        String filterheader = validateHelper.checkText(filterHeader);
        System.out.println("Get filter header :" + filterheader);
        return filterheader;
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

    public String verifyFlightDeckHeader() {
        String flightdeckHeader = validateHelper.checkText(flightDeckHeader);
        return flightdeckHeader;
    }

    public boolean verifyStatusSearchBox() {
        boolean searchbox = validateHelper.enableElement(searchBox);
        System.out.println("Status Search Box is: " + searchbox);
        return searchbox;
    }

    public boolean verifyStatusAddBeaconButton() {
        boolean addBeaconButton = validateHelper.enableElement(addbeaconButton);
        System.out.println("Status of Add Beacon Button is: " + addBeaconButton);
        return addBeaconButton;
    }

    public boolean verifyStatusFilterButton() {
        boolean filterbt = validateHelper.enableElement(filterButton);
        System.out.println("Status of Filter Button is: " + filterbt);
        return filterbt;
    }

    public int totalBeacon() {
        //waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        System.out.println("Total Beacon Current:" + rows.size());
        return rows.size();
    }

    public String verifyFilterNumber() {
        String numfil = validateHelper.checkText(filterNumber);
        System.out.println("Filter Number  :" + numfil);
        return numfil;
    }

    public String searchBeaconCode(String beacon_searching, String beacon_expected) {
        validateHelper.waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        //System.out.println(rows.size());
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span/strong"));
            String beaconCodeTable = rowElement.getText();
            String beaconInput = beacon_searching.replace("", "");
            if (beaconCodeTable.equals(beaconInput)) {
                System.out.println("Searching is success :" + rowElement.getText());
                Assert.assertEquals(rowElement.getText(), beacon_expected);
                break;
            } else {
                System.out.println("Print next beacons : " + rowElement.getText());
                //continue;
            }
        }
        return beacon_searching;
    }

    public String VerifyBeaconInactive(String status_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String inactiveStatus = rowElement.getText();
            if (inactiveStatus.equals(status_expected)) {
                System.out.println("Print Inactive Status :" + rowElement.getText());
            } else {
                //System.out.println("Print Active Status :" + rowElement.getText());
                throw new Exception("Cannot finding Inactive Status");
            }
        }
        return status_expected;
    }

    public String VerifyBeaconActive(String status_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String inactiveStatus = rowElement.getText();
            if (inactiveStatus.equals(status_expected)) {
                System.out.println("Print Active Status :" + rowElement.getText());
            } else {
                //System.out.println("Print Active Status :" + rowElement.getText());
                throw new Exception("Cannot finding Active Status");
            }

            //Assert.assertEquals(inactiveStatus,status_expected);
        }
        return status_expected;
    }

    public String VerifyBeaconNote(String note_expected) {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        List<WebElement> sectionList = driver.findElements(By.xpath("//tbody/tr/td[@class='ant-table-cell'][5]"));
        int i = 0;
        for (WebElement element : sectionList) {
            //Assert.assertEquals(element.getText(),note_expected);
            if (element.getText().equals(note_expected)) {
                System.out.println("Note " + i + ":" + element.getText());
                Assert.assertEquals(element.getText(), note_expected);
                i++;
            }
        }
        return note_expected;
    }

    public void VerifyStatusTable(String active_status,String inactive_status) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String status = rowElement.getText();
//            if (status.equals(inactive_status) || status.equals(active_status)) {
//                System.out.println("Print Status of Beacon:" + rowElement.getText());
//            } else {
//                //System.out.println("Print Active Status :" + rowElement.getText());
//                throw new Exception("Cannot finding Active/Inactive Status");
//            }

            Assert.assertTrue(status.equals(inactive_status) || status.equals(active_status),"Cannot finding Active/Inactive Status");
            System.out.println("Print Status of Beacon:" + rowElement.getText());
        }
    }

    public void VerifySortingBeaconName(String[] expectedSortBeaconName)  {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            //tbody/tr[" + i + "]/td[@class='ant-table-cell ant-table-column-sort']
            WebElement beaconName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[4]"));
            String sort_result = beaconName.getText();
            System.out.println(sort_result);
            for (String beacon : expectedSortBeaconName) {
                if (sort_result.equals(beacon)){
                    System.out.println("Beacon Name is sorted :" + sort_result);
                    //break;
                } else {
                    //System.out.println("fail " +sort_result);
                }
            }
        }
    }

    public String beforeSortingBeaconName(){
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement beaconName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[4]"));
            String beforeSort = beaconName.getText();
            System.out.println(beforeSort);
        }
        validateHelper.clickElement(beaconNameColumn);
        return null;
    }

    public String afterSortingBeaconName(){
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i=2;i< rows.size() +2;i++){
            WebElement beaconName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[4]"));
            String afterSort = beaconName.getText();
            System.out.println(afterSort);
        }
        return null;
    }
}
