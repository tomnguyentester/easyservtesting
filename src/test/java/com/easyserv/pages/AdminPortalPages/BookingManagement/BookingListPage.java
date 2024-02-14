package com.easyserv.pages.AdminPortalPages.BookingManagement;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingListPage {
    private WebDriver driver;
    public ValidateHelper validateHelper;

    private By emailBox = By.xpath("//input[@id='email']");
    private By passwordBox = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By bookManaMenu = By.xpath("//a[contains(text(),'Booking Management')]");
    private By bookManaTitle = By.xpath("//span[contains(text(),'Booking Management')]");
    private By newbookButton = By.xpath("//span[contains(text(),'New Booking')]");
    private By searchBox = By.xpath("//input[@placeholder='Search']");
    private By searchIcon = By.xpath("//span[@aria-label='search']//*[name()='svg']");
    private By filterButton = By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-lg ant-btn-icon-only']");
    private By nodata_1 = By.xpath("//div[contains(text(),'No data')]");
    private By nodata_2= By.xpath("//div[@class='ant-empty-description']");
    private By filterTitle = By.xpath("//span[contains(text(),'Filters')]");
    private By clearallButton = By.xpath("//span[contains(text(),'Clear all')]");
    private By applyButton = By.xpath("//span[contains(text(),'Apply')]");
    private By statusDrop = By.xpath("//span[contains(text(),'All Status')]");
    private By bookedStatus = By.xpath("//div[contains(text(),'Booked In')]");
    private By filterNumber = By.xpath("//span[@class='ant-scroll-number-only-unit current']");
    private By bookingType = By.xpath("//div[@class='ant-select-selection-overflow']");
    private By serviceType = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Service']");
    private By startdayInput = By.xpath("//input[@placeholder='Start date']");
    private By endayInput = By.xpath("//input[@placeholder='End date']");
    private By clearbutton = By.xpath("//u[contains(text(),'Clear all')]");
    private By filterEmpty = By.xpath("//div[contains(text(),'0')]");
    private By paginationDrop = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']//div[@class='ant-select-selector']");
    private By page = By.xpath("//div[@class='ant-select ant-pagination-options-size-changer ant-select-single ant-select-show-arrow']");
    private By page_10 = By.xpath("//div[contains(text(),'10 / page')]");
    private By page_15 = By.xpath("//div[contains(text(),'15 / page')]");
    private By page_30 = By.xpath("//div[contains(text(),'30 / page')]");
    private By statusbox = By.xpath("//div[@class='ant-select ant-select-borderless ant-select-single ant-select-show-arrow']");
    private By checkedInSelect = By.xpath("//div[contains(text(),'Checked In')]");
    private By checkedInBox = By.xpath("//tbody/tr[2]/td[7]/div[1]/div[1]");
    private By bookedInSelect = By.xpath("//div[contains(text(),'Booked In')]");
    private By checkedInStatus = By.xpath("//span[@title='Checked In']");
    private By messChangeStatus = By.xpath("//div[@class='ant-notification-notice ant-notification-notice-success ant-notification-notice-closable']");
    private By previouspageButton = By.xpath("//li[@title='Previous Page']//button[@type='button']");
    private By nextpageButton = By.xpath("//li[@title='Next Page']//button[@type='button']");
    private By pageNumber_3 = By.xpath("//a[normalize-space()='3']");
    private By pageNunber_1 = By.xpath("//a[normalize-space()='1']");
    private By pageNunber_5 = By.xpath("//a[normalize-space()='198']");
    private By listviewButton = By.xpath("//span[@aria-label='unordered-list']//*[name()='svg']");

    public  BookingListPage(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void BookingList_TC001(String email, String pass){
        validateHelper.setText(emailBox,email);
        validateHelper.setText(passwordBox,pass);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
    }

    public void BookingList_TC002(String email, String password, String bookingid) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.setText(searchBox, bookingid);
        validateHelper.clickElement(searchIcon);
    }

    public void BookingList_TC003(String email, String password, String bookingid) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.setText(searchBox, bookingid);
        validateHelper.clickElement(searchIcon);
        validateHelper.delay(3);
    }

    public void BookingList_TC004(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.clickElement(filterButton);
    }

    public void BookingList_TC005(String email, String password, String startday, String enday) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(statusDrop);
        validateHelper.clickElement(bookedStatus);
        validateHelper.clickElement(bookingType);
        validateHelper.clickElement(serviceType);
        validateHelper.clickElement(bookingType);
        validateHelper.clickElement(startdayInput);
        validateHelper.setText(startdayInput, startday);
        validateHelper.clickElement(endayInput);
        validateHelper.setText(endayInput, enday);
        validateHelper.clickElement(applyButton);
    }

    public void BookingList_TC006(String email, String password, String startday, String enday) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.clickElement(filterButton);
        validateHelper.clickElement(statusDrop);
        validateHelper.clickElement(bookedStatus);
        validateHelper.clickElement(bookingType);
        validateHelper.clickElement(serviceType);
        validateHelper.clickElement(bookingType);
        validateHelper.clickElement(startdayInput);
        validateHelper.setText(startdayInput, startday);
        validateHelper.clickElement(endayInput);
        validateHelper.setText(endayInput, enday);
        validateHelper.clickElement(applyButton);
        validateHelper.clickElement(clearbutton);
        validateHelper.clickElement(filterButton);
    }

    public void BookingList_TC007_1(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.movetoElement(paginationDrop);
        validateHelper.clickElement(page);
        validateHelper.clickElement(page_10);
    }

    public void BookingList_TC007_2(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.movetoElement(paginationDrop);
        validateHelper.clickElement(page);
        validateHelper.clickElement(page_15);
    }

    public void BookingList_TC007_3(String email, String password) {
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.movetoElement(paginationDrop);
        validateHelper.clickElement(page);
        validateHelper.clickElement(page_30);
    }

    public void BookingList_TC008(String email,String password,String idbooking){
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.setText(searchBox,idbooking);
        validateHelper.clickElement(searchIcon);
        validateHelper.clickElement(statusbox);
        validateHelper.clickElement(checkedInSelect);
        validateHelper.delay(4);
        validateHelper.clickElement(checkedInBox);
        validateHelper.clickElement(bookedInSelect);
    }

    public void BookingList_TC009(String email,String password){
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.movetoElement(pageNumber_3);
        validateHelper.clickElement(pageNumber_3);
        validateHelper.movetoElement(pageNumber_3);
    }

    public void BookingList_TC010_1(String email,String password){
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.movetoElement(pageNunber_1);
    }

    public void BookingList_TC010_2(String email,String password){
        validateHelper.refreshPage();
        validateHelper.setText(emailBox, email);
        validateHelper.setText(passwordBox, password);
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(bookManaMenu);
        validateHelper.clickElement(listviewButton);
        validateHelper.movetoElement(pageNunber_5);
        validateHelper.clickElement(pageNunber_5);
    }

    public boolean verifyStatusOfPreviousButton(){
        boolean prev = validateHelper.enableElement(previouspageButton);
        System.out.println("Status Of Previous Button is :"+prev);
        return prev;
    }

    public boolean verifyStatusofNextButton(){
        boolean next = validateHelper.enableElement(nextpageButton);
        System.out.println("Status Of Next Button is :"+next);
        return next;
    }


    public String verifyMessageStatus(){
        String mess = validateHelper.checkText(messChangeStatus);
        System.out.println("Alert Booking status :" +mess);
        return mess;
    }
    public String verifyStatusBooking(){
        String status = validateHelper.checkText(checkedInStatus);
        System.out.println("Currently Status Booking :" +status);
        return status;
    }

    public int verifyTotalRowPage(){
        int total = validateHelper.totalBookingId();
        System.out.println("Total Row :" +total);
        return total;
    }

    public String verifyFilterNumberEmpty() {
        String filtempty = validateHelper.checkText(filterEmpty);
        System.out.println("Filter number is: "+ filtempty);
        return filtempty;
    }

    public String verifyFilterNumber() {
        String numfil = validateHelper.checkText(filterNumber);
        System.out.println("Filter Number  :" + numfil);
        return numfil;
    }

    public String verifyFilterTitle() {
        String filtername = validateHelper.checkText(filterTitle);
        System.out.println("Filter Name Title : " + filtername);
        return filtername;
    }

    public boolean verifyClearAllButton() {
        boolean clearallbt = validateHelper.enableElement(clearallButton);
        System.out.println("Status of Clear All Button: " + clearallbt);
        return clearallbt;
    }

    public boolean verifyApplyButton() {
        boolean applybt = validateHelper.enableElement(applyButton);
        System.out.println("Status of Apply Button: " + applybt);
        return applybt;
    }

    public int verifyBookIdInTable(int idBooking) {
        int bookid = validateHelper.searchBookingId(idBooking);
        return bookid;
    }

    public String verifyBookIdNotExits() {
        String bookId = validateHelper.checkText(nodata_2);
        System.out.println(bookId);
        return bookId;
    }

    public String verifyBookingManaTitle() {
        String bookMana = validateHelper.checkText(bookManaTitle);
        return bookMana;
    }

    public boolean verifyNewBookingButton() {
        boolean newbook = validateHelper.enableElement(newbookButton);
        System.out.println("Status of \"NewBookingButton is\" : " + newbook);
        return newbook;
    }

    public boolean verifySearchBox() {
        boolean searchbox = validateHelper.enableElement(searchBox);
        System.out.println("Status of \"search box\" is : " + searchbox);
        return searchbox;
    }
    public boolean verifyFilterButton() {
        boolean filter = validateHelper.enableElement(filterButton);
        System.out.println("Status of \"filter button\" is : " + filter);
        return filter;
    }

}
