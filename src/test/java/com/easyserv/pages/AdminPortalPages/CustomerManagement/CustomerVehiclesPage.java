package com.easyserv.pages.AdminPortalPages.CustomerManagement;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerVehiclesPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By CustomerMana = By.xpath("//a[contains(text(),'Customer Management')]");
    private By vehicleTitle = By.xpath("//h1[contains(text(),'Vehicles')]");
    private By searchbox = By.xpath("//input[@placeholder='Search']");
    private By statusCol = By.xpath("//th[normalize-space()='Status']");
    private By regoCol = By.xpath("//th[normalize-space()='Rego']");
    private By vehicleCol = By.xpath("//span[contains(text(),'Vehicle')]");
    private By upcoCol = By.xpath("//th[contains(text(),'Upcoming Booking')]");
    private By lastBooking = By.xpath("//th[contains(text(),'Last Booking')]");
    private By totalBookCol = By.xpath("//th[contains(text(),'Total Bookings')]");
    private By actionCol = By.xpath("//th[contains(text(),'Action')]");
    private By cusRow_1 = By.xpath("//tbody/tr[2]/td[1]");
    private By searchBox = By.xpath("//input[@placeholder='Search']");
    private By searchIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");
    private By vehicleTab = By.xpath("//div[@id='rc-tabs-0-tab-two-columns-tabs-tab-vehicles']");
    private By regoRow = By.xpath("//tbody/tr[2]/td[2]/span[1]");
    private By action3Dot = By.xpath("//tbody/tr[2]/td[7]/span[1]/*[1]");
    private By deactivate = By.xpath("//span[@aria-label='eye-invisible']//*[name()='svg']");
    private By confirmTitle = By.xpath("//span[@class='ant-modal-confirm-title']");
    private By confirmText = By.xpath("//div[@class='ant-modal-confirm-content']");
    private By yesButton = By.xpath("//span[normalize-space()='Yes']");
    private By conf_mess = By.xpath("//div[@class='ant-notification-notice ant-notification-notice-error ant-notification-notice-closable']");
    private By Nodata = By.xpath("//div[contains(text(),'No data')]");

    public CustomerVehiclesPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void CustomerVehicle_TC001(String email, String password, String customer) {
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
        validateHelper.clickElement(vehicleTab);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerVehicle_TC002(String email, String password, String customer,String rego) {
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
        validateHelper.clickElement(vehicleTab);
        validateHelper.setText(searchbox,rego);
        validateHelper.clickElement(searchIcon);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerVehicle_TC003(String email, String password, String customer,String rego) {
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
        validateHelper.clickElement(vehicleTab);
        validateHelper.setText(searchbox,rego);
        validateHelper.clickElement(searchIcon);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerVehicle_TC004(String email, String password, String customer,String rego) {
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
        validateHelper.clickElement(vehicleTab);
        validateHelper.setText(searchbox,rego);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(action3Dot);
        validateHelper.clickElement(deactivate);
        validateHelper.waitForPageLoaded();
    }

    public String vefiryNodata(){
        String nodata = validateHelper.checkText(Nodata);
        System.out.println("Print Empty Data :" + nodata);
        return nodata;
    }

    public String vefiryNotiMess(){
        String mess = validateHelper.checkText(conf_mess);
        System.out.println("Print Confirm Message :" +mess);
        return mess;
    }
    public String verifyConfirmTitle(){
        String confTitle = validateHelper.checkText(confirmTitle);
        System.out.println("Print Confirm Title :" + confTitle);
        return confTitle;
    }

    public String verifyConfirmText(){
        String confText = validateHelper.checkText(confirmText);
        System.out.println("Print Confirm Text :" + confText);
        return confText;
    }

    public Boolean verifyStausYesButton(){
        boolean yes_bt = validateHelper.enableElement(yesButton);
        System.out.println("Print Status Yes Button :" + yes_bt);
        return yes_bt;
    }

    public Boolean verifyStausNoButton(){
        boolean no_bt = validateHelper.enableElement(yesButton);
        System.out.println("Print Status No Button :" + no_bt);
        return no_bt;
    }

    public String verifyRegoResult(){
        String rego = validateHelper.checkText(regoRow);
        System.out.println("Print Rego Result :" + rego);
        return rego;
    }

    public String verifyVehiclesHeader() {
        String vehicletitle = validateHelper.checkText(vehicleTitle);
        System.out.println("Print Vehicle Title :" + vehicletitle);
        return vehicletitle;
    }

    public Boolean verifyStatusSerachBox(){
        boolean seach_box = validateHelper.enableElement(searchbox);
        System.out.println("Print Status Search Box" + seach_box);
        return seach_box;
    }

    public String verifyStatusColumn() {
        String statusColumn = validateHelper.checkText(statusCol);
        System.out.println("Print Status Title Column :" + statusColumn);
        return statusColumn;
    }

    public String verifyRegoColumn() {
        String regoColumn = validateHelper.checkText(regoCol);
        System.out.println("Print Rego Title Column :" + regoColumn);
        return regoColumn;
    }

    public String verifyVehicleColumn() {
        String vehicleColumn = validateHelper.checkText(vehicleCol);
        System.out.println("Print Vehicle Title Column :" + vehicleColumn);
        return vehicleColumn;
    }

    public String verifyUpcomingBookingColumn() {
        String upcomColumn = validateHelper.checkText(upcoCol);
        System.out.println("Print Upcoming Booking Title Column :" + upcomColumn);
        return upcomColumn;
    }

    public String verifyLastBookingColumn() {
        String lastBookColumn = validateHelper.checkText(lastBooking);
        System.out.println("Print Last Booking Title Column :" + lastBookColumn);
        return lastBookColumn;
    }

    public String verifyTotalBookingsColumn() {
        String totalBookColumn = validateHelper.checkText(totalBookCol);
        System.out.println("Print Total Booking Title Column :" + totalBookColumn);
        return totalBookColumn;
    }

    public String verifyActionColumn() {
        String actionColumn = validateHelper.checkText(actionCol);
        System.out.println("Print Action Title Column :" + actionColumn);
        return actionColumn;
    }
}
