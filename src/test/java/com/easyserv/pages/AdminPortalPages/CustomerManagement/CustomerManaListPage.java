package com.easyserv.pages.AdminPortalPages.CustomerManagement;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CustomerManaListPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By CustomerMana = By.xpath("//a[contains(text(),'Customer Management')]");
    private By customerHeader = By.xpath("//span[@title='Customer Management']");
    private By searchBox = By.xpath("//input[@placeholder='Search']");
    private By searchIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");
    private By noData = By.xpath("//div[contains(text(),'No data')]");
    private By filterButton = By.xpath("//span[@aria-label='filter']");
    private By statusDropdown = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-single ant-select-show-arrow']");
    private By clearallButton = By.xpath("//span[contains(text(),'Clear all')]");
    private By applyButton = By.xpath("//span[normalize-space()='Apply']");
    private By allOption = By.xpath("//span[@title='All']");
    private By inactiveOption = By.xpath("//div[contains(text(),'Inactive')]");
    private By activeOption = By.xpath("//div[contains(text(),'Active')]");
    private By clearallbt = By.xpath("//u[contains(text(),'Clear all')]");
    private By pageDropdown = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By page_10 = By.xpath("//div[contains(text(),'10 / page')]");
    private By paginationDrop = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By sendSMSIcon = By.xpath("//button[@id='1']//span[@aria-label='message']//*[name()='svg']//*[name()='path' and contains(@d,'M924.3 338')]");
    private By smsheader = By.xpath("//div[@id='rc_unique_0']");
    private By cusRow_1 = By.xpath("//tbody/tr[2]/td[1]");
    private By cusDetailHeader = By.xpath("//h1[contains(text(),'Customer Details')]");
    public CustomerManaListPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void CustomerList_TC001(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerList_TC002(String email, String password,String customername) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox,customername);
        validateHelper.clickElement(searchIcon);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerList_TC003(String email, String password,String customername) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.setText(searchBox,customername);
        validateHelper.clickElement(searchIcon);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerList_TC004(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.clickElement(filterButton);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerList_TC005_1(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(inactiveOption);
        validateHelper.clickElement(applyButton);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerList_TC005_2(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(activeOption);
        validateHelper.clickElement(applyButton);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerList_TC006(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(inactiveOption);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(clearallButton);
        validateHelper.delay(2);
    }

    public void CustomerList_TC007(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(allOption);
        validateHelper.clickElement(activeOption);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(clearallbt);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerList_TC008(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.movetoElement(paginationDrop);
        validateHelper.clickElement(pageDropdown);
        validateHelper.clickElement(page_10);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerList_TC009(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.clickElement(sendSMSIcon);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerList_TC010(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
        validateHelper.clickElement(cusRow_1);
        validateHelper.waitForPageLoaded();
    }

    public String verifyCustomerDetailHeader(){
        String cusdetail = validateHelper.checkText(cusDetailHeader);
        System.out.println("Print Customer Detail Header : " + cusdetail);
        return cusdetail;
    }
    public String verifySMSHeader(){
        String smstitle = validateHelper.checkText(smsheader);
        System.out.println("Print SMS Header : " + smstitle);
        return smstitle;
    }


    public boolean verifyApplyButton(){
        boolean status = validateHelper.enableElement(applyButton);
        System.out.println("Print status of Apply Button :" +status);
        return status;
    }

    public boolean verifyClearButton(){
        boolean status = validateHelper.enableElement(clearallButton);
        System.out.println("Print status of Clear Button :" +status);
        return status;
    }
    public boolean verifyFilterStatus(){
        boolean status = validateHelper.enableElement(statusDropdown);
        System.out.println("Print status of fileter :" +status);
        return status;
    }

    public String verifyNoData(){
        String nodata = validateHelper.checkText(noData);
        System.out.println("Print Empty Data : " + nodata);
        return nodata;
    }
    public String verifyCustomerHeader(){
        String cus_header = validateHelper.checkText(customerHeader);
        System.out.println("Print Customer Header : " + cus_header);
        return cus_header;
    }

    public int verifyTotalCustomer(){
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        System.out.println("Total Customer is :" + rows.size());
        return rows.size();
    }

    public void verifySearchCustomerName(String customer_searching) {
        validateHelper.waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
            String cusName = rowElement.getText();
            if (cusName.equals(customer_searching)){
                Assert.assertEquals(cusName,customer_searching);
            } else {
                System.out.println("Customer Name was found :" + rowElement.getText());
            }
        }
    }

    public void verifyCustomerInactive(String status_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String inactiveStatus = rowElement.getText();
            if (inactiveStatus.equals(status_expected)) {
                WebElement cusName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
                System.out.println("Print Inactive Status :" + cusName.getText());
            } else {
                throw new Exception("Cannot finding Inactive Status");
            }
        }
    }

    public void verifyCustomerActive(String status_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String activeStatus = rowElement.getText();
            if (activeStatus.equals(status_expected)) {
                WebElement cusName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
                System.out.println("Print Active Status :" + cusName.getText());
            } else {
                throw new Exception("Cannot finding Active Status");
            }
        }
    }

    public void verifyStatusCustomerList(String active_status, String inactive_status) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/span"));
            String status = rowElement.getText();
            if (status.equals(inactive_status) || status.equals(active_status)) {
                System.out.println("Print Status of Customer:" + rowElement.getText());
            } else {
                throw new Exception("Cannot finding Active/Inactive Status");
            }
        }
    }
}
