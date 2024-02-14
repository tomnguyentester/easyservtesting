package com.easyserv.pages.AdminPortalPages.BookingManagement;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateBookingPage {
    private WebDriver driver;
    public ValidateHelper validateHelper;
    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By bookManaMenu = By.xpath("//a[contains(text(),'Booking Management')]");
    private By newbookButton = By.xpath("//span[contains(text(),'New Booking')]");
    private By newbookingHeader = By.xpath("//span[contains(text(),'New Booking')]");
    private By bookingdetailTab = By.xpath("//div[@id='rc-tabs-0-tab-two-columns-tabs-tab-booking']");
    private By selectcustomerTitle = By.xpath("//h4[contains(text(),'Select Customer')]");
    private By searchcusBox = By.xpath("//input[@id='searchCustomerText']");
    private By searchcusIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");
    private By cancelButton = By.xpath("//span[contains(text(),'Cancel')]");
    private By nextbookingButton = By.xpath("//button[@class='ant-btn ant-btn-primary']");
    private By searchmessValidation_1 = By.xpath("//div[contains(text(),'You must enter data to search')]");
    private By searchmessValidation_2 = By.xpath("//div[contains(text(),'Your Input must not exceed 100 characters.')]");
    private By addnewcusText = By.xpath("//a[contains(text(),'Add New Customer')]");
    private By customerEmpty = By.xpath("//div[contains(text(),'No data')]");
    private By customerName = By.xpath("//p[contains(text(),'tom nguyen')]");
    private By vehicleNumber = By.xpath("//p[contains(text(),'576')]");
    private By addnewcusHeader = By.xpath("//div[@class='ant-modal-title']");
    private By addButton = By.xpath("//span[contains(text(),'Add')]");
    private By firstnameReq = By.xpath("//div[contains(text(),'The First Name field is required')]");
    private By lastnameReq = By.xpath("//div[contains(text(),'The Last Name field is required')]");
    private By phonenumReq = By.xpath("//div[contains(text(),'The Phone Number field is required')]");
    private By postcodeReq = By.xpath("//div[contains(text(),'The Postcode field is required')]");
    private By subreq = By.xpath("//div[contains(text(),'The suburb field is required')]");
    private By postcodeBox = By.xpath("//input[@class='ant-input ant-input-status-error']");

    public CreateBookingPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void CreateBooking_TC001(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(newbookButton);
    }

    public void CreateBooking_TC002(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(newbookButton);
        validateHelper.clickElement(searchcusIcon);
    }

    public void CreateBooking_TC003(String email, String password, String searchvalue) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(newbookButton);
        validateHelper.setText(searchcusBox, searchvalue);
    }

    public void CreateBooking_TC004(String email, String password, String customername) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(newbookButton);
        validateHelper.setText(searchcusBox, customername);
    }

    public void CreateBooking_TC005(String email, String password, String customername) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(newbookButton);
        validateHelper.setText(searchcusBox, customername);
    }

    public void CreateBooking_TC006(String email, String password, String customername) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(newbookButton);
        validateHelper.setText(searchcusBox, customername);
    }

    public void AddNewCustomer_TC007(String email, String password, String customername) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(newbookButton);
        validateHelper.setText(searchcusBox, customername);
        validateHelper.clickElement(addnewcusText);
        validateHelper.clickElement(addButton);
    }

//    public void AddNewCustomer_TC008(String email, String password, String customername,String postcode) {
//        validateHelper.refreshPage();
//        validateHelper.setText(emailBox, email);
//        validateHelper.setText(passwordBox, password);
//        validateHelper.clickElement(signinButton);
//        validateHelper.clickDropdown(storeDropdown);
//        validateHelper.chooseStore(storeDropdown, 0);
//        validateHelper.clickElement(nextButton);
//        validateHelper.clickElement(bookManaMenu);
//        validateHelper.clickElement(newbookButton);
//        validateHelper.setText(searchcusBox, customername);
//        validateHelper.clickElement(addnewcusText);
//        validateHelper.clickElement(postcodeBox);
//        validateHelper.setText(postcodeBox,postcode);
//    }

    public String checkPostCodeFromDrop(String suburb) {
        validateHelper.waitForPageLoaded();
        WebElement parentResult = driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']"));
        List<WebElement> rows = parentResult.findElements(By.xpath("//div[@class='ant-select-item-option-content']"));
        System.out.println("Total Post Code: " + rows.size());
        int i = 0;
        for (WebElement element : rows) {
            if (element.getText().contains(suburb)) {
                System.out.println("Customer " + i + ":" + element.getText());
                i++;
            } else {
                System.out.println("Not Found");
            }
        }
        return suburb;
    }

    public String validationmessPostCode(){
        String postcode = validateHelper.checkText(postcodeReq);
        System.out.println("Validation Mess PostCode: "+postcode);
        return postcode;
    }

    public String validationmessSuburb(){
        String suburb = validateHelper.checkText(subreq);
        System.out.println("Validation Mess Sub: "+suburb);
        return suburb;
    }

    public String validationmessPhoneNumber(){
        String phonenum = validateHelper.checkText(phonenumReq);
        System.out.println("Validation Mess Number: "+phonenum);
        return phonenum;
    }

    public String validationmessFirstName(){
        String firtname = validateHelper.checkText(firstnameReq);
        System.out.println("Validation Mess FirstName: "+firtname);
        return firtname;
    }

    public String validationmessLastName(){
        String lastname = validateHelper.checkText(lastnameReq);
        System.out.println("Validation Mess LastName: "+lastname);
        return lastname;
    }

    public String verifyAddNewCusHeader(){
        String cusheader = validateHelper.checkText(addnewcusHeader);
        System.out.println("Add New Cus Header: "+cusheader);
        return cusheader;
    }

    public String verifyCustomerNameSection(){
        String cusname = validateHelper.checkText(customerName);
        System.out.println("Customer Name is: "+cusname);
        return cusname;
    }

    public String verifyVehicleNumberSection(){
        String vehinum =  validateHelper.checkText(vehicleNumber);
        System.out.println("Vehicle Number is: " +vehinum);
        return vehinum;
    }

    public String verifyCustomerEmpty() {
        String cusempty = validateHelper.checkText(customerEmpty);
        System.out.println("Print Result from Dropdownlisst: " + cusempty);
        return cusempty;
    }

    public String verifyAddNewCustomerText() {
        String addnewcus = validateHelper.checkText(addnewcusText);
        System.out.println("Print Add New Cus Text : " + addnewcus);
        return addnewcus;
    }

    public String selectcustomerFromDrop(String customerinfor) {
        validateHelper.waitForPageLoaded();
        WebElement parentResult = driver.findElement(By.xpath("//div[@class='jsx-1876145436 customer-select-dropdown']"));
        List<WebElement> rows = parentResult.findElements(By.xpath("//div[@class='jsx-1876145436 customer-row']"));
        System.out.println(rows.size());
        int i = 0;
        for (WebElement element : rows) {
            if (element.getText().contains(customerinfor)) {
                System.out.println("Customername is: " + element.getText());
                element.click();
                break;
            } else {
                System.out.println("Not Found");
            }
        }
        return customerinfor;
    }

    public String checkCustomerFromDrop(String customername) {
//        validateHelper.waitForPageLoaded();
//        WebElement parentResult = driver.findElement(By.xpath("//div[@class='jsx-1876145436 customer-select-dropdown']"));
//        List<WebElement> rows = parentResult.findElements(By.xpath("//div[@class='jsx-1876145436 customer-row']"));
//        System.out.println(rows.size());
//        int i=0;
//        for(WebElement element:rows){
//            System.out.println("Customer "+i+":"+element.getText());
//            i++;
//        }
//        return rows.size();

        validateHelper.waitForPageLoaded();
        WebElement parentResult = driver.findElement(By.xpath("//div[@class='jsx-1876145436 customer-select-dropdown']"));
        List<WebElement> rows = parentResult.findElements(By.xpath("//div[@class='jsx-1876145436 customer-row']"));
        System.out.println("Total Customer: " + rows.size());
        int i = 0;
        for (WebElement element : rows) {
            if (element.getText().contains(customername)) {
                System.out.println("Customer " + i + ":" + element.getText());
                i++;
            } else {
                System.out.println("Not Found");
            }
        }
        return customername;
    }

    public String verifyValidationMessageSearchbox2() {
        String searchmess = validateHelper.checkText(searchmessValidation_2);
        System.out.println("validation message for \"searchbox\" in case more than 50char : " + searchmess);
        return searchmess;
    }

    public String verifyValidationMessageSearchbox1() {
        String searchmess = validateHelper.checkText(searchmessValidation_1);
        System.out.println("validation message for \"searchbox\" in case blank field : " + searchmess);
        return searchmess;
    }

    public String verifyNewBookingHeader() {
        String bookheader = validateHelper.checkText(newbookingHeader);
        System.out.println("New Booking Header is: " + bookheader);
        return bookheader;
    }

    public String verifyBookingDetailTab() {
        String booktab = validateHelper.checkText(bookingdetailTab);
        System.out.println("Booking Detail Tab title is: " + booktab);
        return booktab;
    }

    public String verifySelectCustomerTitle() {
        String selectcus = validateHelper.checkText(selectcustomerTitle);
        System.out.println("Select Customer Title is: " + selectcus);
        return selectcus;
    }

    public boolean verifyCancelButton() {
        boolean cancelbt = validateHelper.enableElement(cancelButton);
        System.out.println("Status Cancel Button: " + cancelbt);
        return cancelbt;
    }

    public boolean verifyNextButton() {
        boolean nextbt = validateHelper.enableElement(nextbookingButton);
        System.out.println("Status Next Button: " + nextbt);
        return nextbt;
    }


}
