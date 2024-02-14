package com.easyserv.pages.AdminPortalPages.FlightDeckSetting;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class GatewaysPage {
    private WebDriver driver;
    public ValidateHelper validateHelper;
    static String sort;
    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By configMenu = By.xpath("//span[contains(text(),'Configuration')]");
    private By flightdeckMenu = By.xpath("//a[contains(text(),'Flight Deck Setting')]");
    private By gatewayTab = By.xpath("//div[@id='rc-tabs-0-tab-two-columns-tabs-tab-gateways']");
    private By searchBox = By.xpath("//input[@placeholder='Search']");
    private By searchIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");
    private By addgatewayButton = By.xpath("//span[normalize-space()='Add Gateway']");
    private By filterButton = By.xpath("//span[@aria-label='filter']");
    private By addgatewayHeader = By.xpath("//h3[contains(text(),'Add Gateway')]");
    private By toogleButton = By.xpath("//button[@class='ant-switch ant-switch-checked']");
    private By addButton = By.xpath("//div[@class='ant-modal-footer']//button[2]");
    private By filterHeader = By.xpath("//span[normalize-space()='Filters']");
    private By clearallButton = By.xpath("//u[normalize-space()='Clear all']");
    private By clearallbt = By.xpath("//span[normalize-space()='Clear all']");
    private By applyButton = By.xpath("//span[normalize-space()='Apply']");
    private By allOption = By.xpath("//span[@title='All']");
    private By inactiveOption = By.xpath("//div[contains(text(),'Inactive')]");
    private By activeOption = By.xpath("//div[contains(text(),'Active')]");
    private By filterNumber = By.xpath("//span[@class='ant-scroll-number-only-unit current']");
    private By gatenameColumn = By.xpath("//span[contains(text(),'Gateway Name')]");
    private By threeDotIcon = By.xpath("//span[@aria-label='more']");
    private By editAction = By.xpath("//span[contains(text(),'Edit')]");
    private By inactiveAction = By.xpath("//span[contains(text(),'Set to Inactive')]");
    private By removeAction = By.xpath("//span[contains(text(),'Remove')]");
    private By activeAction = By.xpath("//span[contains(text(),'Set to Active')]");
    private By editgatewayTitle = By.xpath("//h3[contains(text(),'Edit Gateway')]");
    private By confirmTitle = By.xpath("//span[contains(text(),'Confirm')]");
    private By confirmText = By.xpath("//div[contains(text(),'Are you sure you want to delete this gateway?')]");
    private By noButton = By.xpath("//div[@class='ant-modal-root']//button[1]");
    private By yesButton = By.xpath("//div[@class='ant-modal-root']//button[2]");
    private By confirmSetInactive = By.xpath("//div[contains(text(),'Are you sure you want to set this gateway to Inact')]");
    private By confirmSetActive = By.xpath("//div[contains(text(),'Are you sure you want to set this gateway to Activ')]");
    private By pageDropdown = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By page_10 = By.xpath("//div[contains(text(),'10 / page')]");
    private By paginationDrop = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By cancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    private By gatewaycodeTextbox= By.xpath("//input[@id='form_in_modal_code']");
    private By gatewaynameTextbox = By.xpath("//input[@id='form_in_modal_name']");
    private By noteTextbox = By.xpath("//input[@id='form_in_modal_description']");
    private By GateCodeReqMess = By.xpath("//div[contains(text(),'The Gateway Code field is required')]");
    private By GateCodeExistedMess = By.xpath("//div[contains(text(),'Gateway code is already existed. Please try again.')]");
    private By successNotification = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");
    private  By gatewayNew = By.xpath("//strong[contains(text(),'TESTING2025')]");
    private  By gateNew = By.xpath("//strong[contains(text(),'TESTING2024')]");
    private By inactiveToggle = By.xpath("//div[@class='ant-space ant-space-horizontal ant-space-align-center full space-between']//button[@role='switch']");
    private By activeToggle = By.xpath("//button[@class='ant-switch']");
    private By yesbt = By.xpath("//span[contains(text(),'Yes')]");
    private By saveButton = By.xpath("//span[normalize-space()='Save']");
    private By status = By.xpath("//tbody[1]/tr[2]/td[1]/span[1]");
    private By closeButton = By.xpath("//span[@aria-label='close']//*[name()='svg']");
    private By updateNotification = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");
    private By gatewaynameValue = By.xpath("//td[contains(text(),'Gateway Testing1')]");
    private By noteValue = By.xpath("//td[normalize-space()='Testing by QC Team1']");
    private By saveDisable = By.xpath("//button[span='Save']");
    private By confirmRemoveText = By.xpath("//div[contains(text(),'Are you sure you want to delete this gateway?')]");
    private By removeNotification = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");
    private By nodaText = By.xpath("//div[contains(text(),'No data')]");


    public GatewaysPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void GatewaysTab_TC001(String email, String password) {
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC002(String email, String password, String gatewayname) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gatewayname);
        validateHelper.clickElement(searchIcon);
    }

    public void GatewaysTab_TC003(String email, String password, String gatewayname) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gatewayname);
    }

    public void GatewaysTab_TC004(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC005(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(filterButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC006_1(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(inactiveOption);
        validateHelper.clickElement(applyButton);
    }

    public void GatewaysTab_TC006_2(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(activeOption);
        validateHelper.clickElement(applyButton);
    }

    public void GatewaysTab_TC007_1(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(inactiveOption);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(clearallButton);
    }

    public void GatewaysTab_TC007_2(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(activeOption);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(clearallButton);
    }

    public void GatewaysTab_TC008(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
    }

    public void GatewaysTab_TC009_1(String email, String password, String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC009_2(String email, String password, String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC010_1(String email, String password, String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC010_2(String email, String password, String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC011(String email, String password, String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(removeAction);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC012_1(String email, String password, String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(inactiveAction);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC012_2(String email, String password, String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(activeAction);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC013(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.movetoElement(paginationDrop);
        validateHelper.clickElement(pageDropdown);
        validateHelper.clickElement(page_10);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC014(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC015(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC016(String email, String password,String gatewaycode) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.setText(gatewaycodeTextbox,gatewaycode);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC017(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC018(String email, String password,String gatewaycode,String gatewayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.setText(gatewaycodeTextbox,gatewaycode);
        validateHelper.setText(gatewaynameTextbox,gatewayname);
        validateHelper.setText(noteTextbox,note);
        validateHelper.clearText(gatewaycodeTextbox);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC019(String email, String password,String gatewaycode,String gatewayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.setText(gatewaycodeTextbox,gatewaycode);
        validateHelper.setText(gatewaynameTextbox,gatewayname);
        validateHelper.setText(noteTextbox,note);
        validateHelper.clickElement(addButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC020(String email, String password,String gatewayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.setText(gatewaynameTextbox,gatewayname);
        validateHelper.setText(noteTextbox,note);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC021(String email, String password,String gatewaycode,String gatewayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.setText(gatewaycodeTextbox,gatewaycode);
        validateHelper.setText(gatewaynameTextbox,gatewayname);
        validateHelper.setText(noteTextbox,note);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC022(String email, String password,String gatewaycode,String gatewayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.setText(gatewaycodeTextbox,gatewaycode);
        validateHelper.setText(gatewaynameTextbox,gatewayname);
        validateHelper.setText(noteTextbox,note);
        validateHelper.clickElement(addButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC023(String email, String password,String gatewaycode,String gatewayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.clickElement(addgatewayButton);
        validateHelper.clickElement(inactiveToggle);
        validateHelper.clickElement(yesbt);
        validateHelper.setText(gatewaycodeTextbox,gatewaycode);
        validateHelper.setText(gatewaynameTextbox,gatewayname);
        validateHelper.setText(noteTextbox,note);
        validateHelper.clickElement(addButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC024(String email, String password,String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.clickElement(inactiveToggle);
        validateHelper.clickElement(yesbt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(saveButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC025(String email, String password,String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.clickElement(activeToggle);
        validateHelper.clickElement(yesbt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(saveButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC026(String email, String password,String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC027(String email, String password,String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC028(String email, String password,String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC029(String email, String password,String gateway_enter,String gatewayname,String note) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.clearText(gatewaynameTextbox);
        validateHelper.setText(gatewaynameTextbox,gatewayname);
        validateHelper.clearText(noteTextbox);
        validateHelper.setText(noteTextbox,note);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC030(String email, String password,String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.clearText(gatewaycodeTextbox);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC031(String email, String password,String gateway_enter,String gatewaycode) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(editAction);
        validateHelper.clearText(gatewaycodeTextbox);
        validateHelper.setText(gatewaycodeTextbox,gatewaycode);
        validateHelper.clickElement(saveButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC032(String email, String password,String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(inactiveAction);
        validateHelper.clickElement(yesButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC033(String email, String password,String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(threeDotIcon);
        validateHelper.clickElement(activeAction);
        validateHelper.clickElement(yesButton);
        validateHelper.waitForPageLoaded();
    }

    public void GatewaysTab_TC034(String email, String password,String gateway_enter) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 1);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(configMenu);
        validateHelper.clickElement(flightdeckMenu);
        validateHelper.clickElement(gatewayTab);
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
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

    public String verifyConfirmRemoveText() {
        String confirm_text = validateHelper.checkText(confirmRemoveText);
        System.out.println("Print Confirm Remove Text :" + confirm_text);
        return confirm_text;
    }


    public boolean verifyGatewayCodeTextbox(){
        boolean gatecode = validateHelper.enableElement(gatewaycodeTextbox);
        return gatecode;
    }

    public String verifyNoteValue(){
        String note = validateHelper.checkText(noteValue);
        return note;
    }

    public String verifyGatewayNameValue(){
        String gatename = validateHelper.checkText(gatewaynameValue);
        return gatename;
    }

    public String verifyUpdatedText() {
        validateHelper.waitForPageLoaded();
        String updateMess = validateHelper.checkText(updateNotification);
        System.out.println("The Message of Notification is :" +updateMess);
        return updateMess;
    }

    public boolean verifySaveButton(){
        boolean savebt = validateHelper.enableElement(saveDisable);
        System.out.println("Status Save Button is :" +savebt);
        return savebt;
    }

    public boolean verifyCloseIcon(){
        boolean closebt = validateHelper.isDiplayedElement(closeButton);
        System.out.println("Status Close Icon is: " + closebt);
        return closebt;
    }

    public String verifyGatewayStatus(){
        String gatewaystatus = validateHelper.checkText(status);
        System.out.println("Status new Gateway is : "+ gatewaystatus);
        return gatewaystatus;
    }

    public String verifyAddGatewayActiveSuccess(String gateway_enter){
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        String gatewayCode = validateHelper.checkText(gateNew);
        System.out.println("Gateway Code is :" + gatewayCode);
        return gatewayCode;
    }

    public String verifyAddGatewayInactiveSuccess(String gateway_enter){
        validateHelper.setText(searchBox, gateway_enter);
        validateHelper.clickElement(searchIcon);
        String gatewayCode = validateHelper.checkText(gatewayNew);
        System.out.println("Gateway Code is :" + gatewayCode);
        return gatewayCode;
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


    public String verifyGateCodeExistedMessage(){
        String codeMess = validateHelper.checkText(GateCodeExistedMess);
        System.out.println("Message Existed is :" +codeMess);
        return codeMess;
    }

    public String verifyGateCodeRequiredMessage(){
        String codeMess = validateHelper.checkText(GateCodeReqMess);
        System.out.println("Message Required is :" +codeMess);
        return codeMess;
    }

    public boolean verifyGatewayNameTextbox(){
        boolean gatename = validateHelper.isDiplayedElement(gatewaynameTextbox);
        System.out.println("Status Gateway Name textbox is: " + gatename);
        return gatename;
    }

    public boolean verifyNoteTextbox(){
        boolean note = validateHelper.isDiplayedElement(noteTextbox);
        System.out.println("Status Note textbox is: " + note);
        return note;
    }

    public String verifyValueGatewayCode() {
        String value = driver.findElement(gatewaycodeTextbox).getAttribute("value");
        System.out.println("Value Of GatewayCode TextBox is :" + value);
        return value;
    }

    public int verifyMaxlengthGatewayCodeTextBox() {
        int maxlenght = Integer.parseInt(driver.findElement(gatewaycodeTextbox).getAttribute("maxlength"));
        System.out.println("Maxlength Gateway Code Input is :" + maxlenght);
        return maxlenght;
    }
    public boolean verifyCancelButton(){
        boolean cancel_bt = validateHelper.enableElement(cancelButton);
        return cancel_bt;
    }

    public String verifyConfirmSetActiveText(){
        String activetext = validateHelper.checkText(confirmSetActive);
        System.out.println("Print Confirm Set Active :" +activetext);
        return activetext;
    }
    public String verifyConfirmSetInactiveText(){
        String inactivetext = validateHelper.checkText(confirmSetInactive);
        System.out.println("Print Confirm Set Inactive :" +inactivetext);
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


    public String verifyEditGatewayTitle() {
        String editgateTitle = validateHelper.checkText(editgatewayTitle);
        System.out.println("Print Edit Gateway Title :" + editgateTitle);
        return editgateTitle;
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

    public String verifyEditActionTitle() {
        String edit = validateHelper.checkText(editAction);
        System.out.println("Print Edit Title :" + edit);
        return edit;
    }

    public String verifySetToInactiveTitle() {
        String inactitle = validateHelper.checkText(inactiveAction);
        System.out.println("Print Inactive Title :" + inactitle);
        return inactitle;
    }

    public String verifyFilterNumber() {
        String numfil = validateHelper.checkText(filterNumber);
        System.out.println("Filter Number  :" + numfil);
        return numfil;
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
        boolean addbt = validateHelper.enableElement(addButton);
        System.out.println("Status Add Button is: " + addbt);
        return addbt;
    }

    public boolean verifyStatusToggleButton() {
        boolean togglebt = validateHelper.enableElement(toogleButton);
        System.out.println("Status Toggle Button is: " + togglebt);
        return togglebt;
    }

    public String verifyAddGatewayHeader() {
        String addgatewayheader = validateHelper.checkText(addgatewayHeader);
        System.out.println("Header of Add Gateway Popup: " + addgatewayheader);
        return addgatewayheader;
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

    public boolean verifyStatusAddGatewayButton() {
        boolean addButton = validateHelper.enableElement(addgatewayButton);
        System.out.println("Status of Add Beacon Button is: " + addButton);
        return addButton;
    }

    public boolean verifyStatusFilterButton() {
        boolean filterbt = validateHelper.enableElement(filterButton);
        System.out.println("Status of Filter Button is: " + filterbt);
        return filterbt;
    }

    public int verifyTotalGateway(){
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        System.out.println("Total Gateway is :" + rows.size());
        return rows.size();
    }

    public void searchGatewayName(String gatewayname_searching, String gatewayname_expected) {
        validateHelper.waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]"));
            String gatewayNameTable = rowElement.getText();
            if (gatewayNameTable.equals(gatewayname_searching)) {
                Assert.assertEquals(rowElement.getText(), gatewayname_expected);
                System.out.println("Gateway Name was found :" + rowElement.getText());
                break;
            } else {
                System.out.println("Print next Gateway : " + rowElement.getText());
            }
        }
    }

    public void verifyGatewayInactive(String status_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String inactiveStatus = rowElement.getText();
            if (inactiveStatus.equals(status_expected)) {
                WebElement gatewayName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]"));
                System.out.println("Print Inactive Status :" + gatewayName.getText());
            } else {
                //System.out.println("Print Active Status :" + rowElement.getText());
                throw new Exception("Cannot finding Inactive Status");
            }
        }
    }

    public void verifyGatewayActive(String status_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String inactiveStatus = rowElement.getText();
            if (inactiveStatus.equals(status_expected)) {
                WebElement gatewayName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]"));
                System.out.println("Print Active Status :" + gatewayName.getText());
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
                //System.out.println("Print Active Status :" + rowElement.getText());
                throw new Exception("Cannot finding Active/Inactive Status");
            }
        }
    }

    public void verifySortingGatewayName() {
//        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
//        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
//        for (int i = 2; i < rows.size() + 2; i++) {
//            WebElement beaconName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]"));
//            String beforesort = beaconName.getText();
//            System.out.println(beforesort);
//        }
//
//        validateHelper.clickElement(gatenameColumn);
//        System.out.println("===================================");
//        for (int i = 2; i < rows.size() + 2; i++) {
//            WebElement beaconName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]"));
//            String aftersort = beaconName.getText();
//            System.out.println(aftersort);
//        }
        List<WebElement> column = driver.findElements(By.xpath("//tbody/tr/td[3]"));
        String[] before = new String[column.size()];
        for (int i = 1; i < column.size(); i++) {
            before[i] = column.get(i).getText().trim();
            System.out.println(before[i]);
        }
        System.out.println("-----------------------");

        validateHelper.clickElement(gatenameColumn);
        validateHelper.delay(2);

        List<WebElement> column1 = driver.findElements(By.xpath("//tbody/tr/td[3]"));
        String[] after = new String[column1.size()];
        for (int i = 1; i < column1.size(); i++) {
            after[i] = column1.get(i).getText().trim();
            System.out.println(after[i]);
        }

        Assert.assertNotEquals(before, after);
    }

}
