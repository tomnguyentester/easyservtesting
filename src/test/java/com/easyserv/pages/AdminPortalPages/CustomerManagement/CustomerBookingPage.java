package com.easyserv.pages.AdminPortalPages.CustomerManagement;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CustomerBookingPage {
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
    private By bookingTab = By.xpath("//div[@id='rc-tabs-0-tab-two-columns-tabs-tab-bookings']");
    private By bookingsHeader = By.xpath("//h1[contains(text(),'Bookings')]");
    private By bookDateTimerCol = By.xpath("//th[@aria-label='Booking Date & Time']//div[@class='ant-table-column-sorters']");
    private By bookNo = By.xpath("//th[contains(text(),'Booking No.')]");
    private By bookType = By.xpath("//th[contains(text(),'Booking Type')]");
    private By rego = By.xpath("//th[contains(text(),'Rego')]");
    private By vehicle = By.xpath("//th[contains(text(),'Vehicle')]");
    private By status = By.xpath("//span[normalize-space()='Status']");
    private By action = By.xpath("//th[contains(text(),'Action')]");
    private By bookingNumber = By.xpath("//td[@class='ant-table-cell']//span[@class='ant-typography'][normalize-space()='3397']");
    private By nodata = By.xpath("//div[@class='ant-empty-description']");
    private By filterBt = By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-lg ant-btn-icon-only']");
    private By statusDrop = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-single ant-select-show-arrow']");
    private By applyBt = By.xpath("//span[normalize-space()='Apply']");
    private By bookedInStatus = By.xpath("//div[contains(text(),'Booked In')]");
    private By checkedInStatus = By.xpath("//div[contains(text(),'Checked In')]");
    private By clearAllBt = By.xpath("//span[normalize-space()='Clear all']");
    private By filterButton = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-btn-icon-only']");
    private By clearButton =  By.xpath("//u[contains(text(),'Clear all')]");
    private By statusBox = By.xpath("//span[@title='Booked In']");
    private By successMess = By.xpath("//div[@class='ant-notification-notice-message']");
    private By bookingDetailtab = By.xpath("//span[contains(text(),'Booking Details')]");
    private By bookingrow = By.xpath("//tbody/tr[2]/td[2]/span[1]");


    public CustomerBookingPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void CustomerBooking_TC001(String email, String password,String customer) {
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
        validateHelper.clickElement(bookingTab);
        validateHelper.waitForPageLoaded();
    }
    public void CustomerBooking_TC002(String email, String password,String customer,String bookingNo) {
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
        validateHelper.clickElement(bookingTab);
        validateHelper.clickElement(searchBox);
        validateHelper.setText(searchBox,bookingNo);
        validateHelper.clickElement(searchIcon);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerBooking_TC003(String email, String password,String customer,String booking_invalid) {
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
        validateHelper.clickElement(bookingTab);
        validateHelper.clickElement(searchBox);
        validateHelper.setText(searchBox,booking_invalid);
        validateHelper.clickElement(searchIcon);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerBooking_TC004(String email, String password,String customer) {
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
        validateHelper.clickElement(bookingTab);
        validateHelper.clickElement(searchBox);
        validateHelper.clickElement(filterBt);
        validateHelper.clickElement(statusDrop);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerBooking_TC005(String email, String password,String customer) {
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
        validateHelper.clickElement(bookingTab);
        validateHelper.clickElement(searchBox);
        validateHelper.clickElement(filterBt);
        validateHelper.clickElement(statusDrop);
        validateHelper.clickElement(bookedInStatus);
        validateHelper.clickElement(applyBt);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerBooking_TC006(String email, String password,String customer) {
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
        validateHelper.clickElement(bookingTab);
        validateHelper.clickElement(searchBox);
        validateHelper.clickElement(filterBt);
        validateHelper.clickElement(statusDrop);
        validateHelper.clickElement(checkedInStatus);
        validateHelper.clickElement(applyBt);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerBooking_TC007(String email, String password,String customer) {
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
        validateHelper.clickElement(bookingTab);
        validateHelper.clickElement(searchBox);
        validateHelper.clickElement(filterBt);
        validateHelper.clickElement(statusDrop);
        validateHelper.clickElement(bookedInStatus);
        validateHelper.clickElement(applyBt);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(clearAllBt);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerBooking_TC008(String email, String password,String customer) {
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
        validateHelper.clickElement(bookingTab);
        validateHelper.clickElement(searchBox);
        validateHelper.clickElement(filterBt);
        validateHelper.clickElement(statusDrop);
        validateHelper.clickElement(checkedInStatus);
        validateHelper.clickElement(applyBt);
        validateHelper.clickElement(clearButton);
        validateHelper.waitForPageLoaded();
    }

    public void CustomerBooking_TC009(String email, String password,String customer,String bookingid) {
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
        validateHelper.clickElement(bookingTab);
        validateHelper.clickElement(searchBox);
        validateHelper.setText(searchBox,bookingid);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(statusBox);
        validateHelper.clickElement(checkedInStatus);
        validateHelper.waitForPageLoaded();
    }
    public void CustomerBooking_TC010(String email, String password,String customer,String bookingid) {
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
        validateHelper.clickElement(bookingTab);
        validateHelper.clickElement(searchBox);
        validateHelper.setText(searchBox,bookingid);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(bookingrow);
        validateHelper.waitForPageLoaded();
    }

    public String BookingDetailHeader(){
        String bookdetail = validateHelper.checkText(bookingDetailtab);
        System.out.println("Print Booking Detail Header :" + bookdetail);
        return bookdetail;
    }
    public String vefirySuccessMess(){
        String mess = validateHelper.checkText(successMess);
        System.out.println("Print Success Message :" +mess);
        return mess;
    }

    public boolean verifyStatusApplyButton(){
        boolean applyButton = validateHelper.enableElement(applyBt);
        System.out.println("Print Status Apply Button :" +applyButton);
        return applyButton;
    }

    public String verifyBookingsHeader(){
        String book_header = validateHelper.checkText(bookingsHeader);
        System.out.println("Printer Booking Header :" + book_header);
        return book_header;
    }

    public String verifyDateTimeTitleColumn(){
        String datetime_col = validateHelper.checkText(bookDateTimerCol);
        System.out.println("Printer DataTime Title :" + datetime_col);
        return datetime_col;
    }

    public String verifyBooKNoTitleColumn(){
        String bookNo_col = validateHelper.checkText(bookNo);
        System.out.println("Printer BookNo Title :" + bookNo_col);
        return bookNo_col;
    }
    public String verifyBooKTypeTitleColumn(){
        String booktype_col = validateHelper.checkText(bookType);
        System.out.println("Printer BookType Title :" + booktype_col);
        return booktype_col;
    }
    public String verifyRegoTitleColumn(){
        String rego_col = validateHelper.checkText(rego);
        System.out.println("Printer Rego Title :" + rego_col);
        return rego_col;
    }
    public String verifyVehicleTitleColumn(){
        String vehicle_col = validateHelper.checkText(vehicle);
        System.out.println("Printer Vehicle Title :" + vehicle_col);
        return vehicle_col;
    }
    public String verifyStatusTitleColumn(){
        String status_col = validateHelper.checkText(status);
        System.out.println("Printer Status Title :" + status_col);
        return status_col;
    }
    public String verifyActionTitleColumn(){
        String action_col = validateHelper.checkText(action);
        System.out.println("Printer Action Title :" + action_col);
        return action_col;
    }
    public String searchBookingNo(String booking_searching, String booking_expected) {
        validateHelper.waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        //System.out.println(rows.size());
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]/span"));
            String bookingNumTable = rowElement.getText();
            String bookingInput = booking_searching.replace("", "");
            if (bookingNumTable.equals(bookingInput)) {
                System.out.println("Searching is success :" + rowElement.getText());
                Assert.assertEquals(rowElement.getText(), booking_expected);
                break;
            } else {
                System.out.println("Print next booking : " + rowElement.getText());
                //continue;
            }
        }
        return booking_searching;
    }

    public String verifyNodata(){
        String emty_data = validateHelper.checkText(nodata);
        System.out.println("Print Nodata Text :" +emty_data);
        return emty_data;
    }

    public void verifyListBookingStatus(String[] expectedStatus) {
        WebElement parentTable = driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//div[contains(@class, 'ant-select-item ant-select-item-option')]"));
        //String[] expectedStatus = {"All Status", "Booked In", "Checked In", "Completed", "Cancelled"};
        for (int i = 0; i < rows.size(); i++) {
            System.out.println(rows.get(i).getText());
            Assert.assertEquals(rows.get(i).getText(), expectedStatus[i]);
        }
    }

    public void verifyBookedInStatus(String status_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/div/div/span[@class='ant-select-selection-item']"));
            String bookedStatus = rowElement.getText();
            System.out.println(bookedStatus);

            Assert.assertEquals(bookedStatus,status_expected);

            WebElement bookNo = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
            System.out.println("Booking No. :"+ bookNo.getText());

        }
    }

    public void verifyCheckedInStatus(String status_expected) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/div/div/span[@class='ant-select-selection-item']"));
            String checkedInStatus = rowElement.getText();
            System.out.println(checkedInStatus);

            Assert.assertEquals(checkedInStatus,status_expected);

            WebElement bookNo = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
            System.out.println("Booking No. :"+ bookNo.getText());

        }
    }

    public void verifyStatusTable(String bookedIn_status, String checkedIn_status,String completed_status,String canceled_status) throws Exception {
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']"));
        for (int i = 2; i < rows.size() + 2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='ant-table-cell']/div/div/span[@class='ant-select-selection-item']"));
            String status = rowElement.getText();
            if (status.equals(bookedIn_status) || status.equals(checkedIn_status) || status.equals(completed_status) || status.equals(canceled_status)) {
                WebElement bookNo = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]"));
                System.out.println("Print Status Booking "+ bookNo.getText() + ":" + rowElement.getText());
            } else {
                throw new Exception("Cannot finding Status");
            }
        }
    }
}
