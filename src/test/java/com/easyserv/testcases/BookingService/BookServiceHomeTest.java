package com.easyserv.testcases.BookingService;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.DataBookingService;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.BookingServicePage.CustomerNotAccess.BookingServiceHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookServiceHomeTest extends BaseSetup {
    private WebDriver driver;
    private BookingServiceHomePage bookingServiceHomePage;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;

    private By vehicleConfirmBt = By.xpath("//span[contains(text(),'Confirm and Proceed')]");
    private By addOtherServ = By.xpath("//div[contains(text(),'Add other services')]");
    private By repairsTitle = By.xpath("//div[normalize-space()='Repairs']");
    private By inspectionsTitle = By.xpath("//div[normalize-space()='Inspections']");
    private By othersTitle = By.xpath("//div[normalize-space()='Others']");


    @BeforeClass
    public void setup(){
        driver = getDriver();
        bookingServiceHomePage = new BookingServiceHomePage(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }

    @Test(priority = 1, description = "Verify system in case the user click on \"Vehicle\" section _018")
    public void BookingServiceHomeTest_TC001() throws Exception{
        bookingServiceHomePage.BookingService_TC001();
        Assert.assertEquals(bookingServiceHomePage.verifySelectStoreHeader(),"SELECT YOUR VEHICLE");
        Assert.assertTrue(bookingServiceHomePage.verifyStatusIDRego(),"ID Rego Not Avaibile");
        Assert.assertTrue(bookingServiceHomePage.verifyDisplayEnterRego(),"Enter Rego field Not Available");
        Assert.assertFalse(bookingServiceHomePage.verifyDisplayFindCarButton()," Find Car Button is Available");

    }

    @Test(priority = 2, description = "Verify that the user can search vehicle  _019",dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC002(String id_rego,String suburb) throws Exception{
        bookingServiceHomePage.BookingService_TC002(id_rego,suburb);
        Assert.assertEquals(bookingServiceHomePage.verifyVehicleName(),"TOYOTA LANDCRUISER 2003");
        Assert.assertTrue(bookingServiceHomePage.verifyStatusConfirmVehicleButton(),"Confirm Button Not Available");
        validateHelper.clickElement(vehicleConfirmBt);
        Assert.assertEquals(bookingServiceHomePage.verifySelectServiceHeader(),"SELECT YOUR SERVICES");
    }

    @Test(priority = 3, description = "Verify system in case the user searching with vehicle is invalid  _020")
    public void BookingServiceHomeTest_TC003() throws Exception{
        bookingServiceHomePage.BookingService_TC003("010101");
        Assert.assertEquals(bookingServiceHomePage.verifyVehicleNotMessage(),"Vehicle Not Found");
    }

    @Test(priority = 4, description = "Verify that the user can search vehicle  _019")
    public void BookingServiceHomeTest_TC004() throws Exception{
        bookingServiceHomePage.BookingService_TC004("576");
        Assert.assertEquals(bookingServiceHomePage.verifyIDNumbert(),"576");
    }

    @Test(priority = 5, description = "Verify system in case the user click on [Or find your car by make, model and year] link  _021")
    public void BookingServiceHomeTest_TC005() throws Exception{
        bookingServiceHomePage.BookingService_TC005();
        Assert.assertEquals(bookingServiceHomePage.verifyCarDetailHeader(),"PLEASE ENTER YOUR CAR DETAILS");
        Assert.assertTrue(bookingServiceHomePage.verifyDisplayRegisterNumber(),"Register Number field not avalible");
        Assert.assertTrue(bookingServiceHomePage.verifyStatusStateDrop(),"State Dropdown not avalible");
        Assert.assertTrue(bookingServiceHomePage.verifyStatusMakeDrop(),"Make Dropdown not avalible");
        Assert.assertTrue(bookingServiceHomePage.verifyStatusModelDrop(),"Model Dropdown not avalible");
        Assert.assertTrue(bookingServiceHomePage.verifyStatusVariantDrop(),"Variant Dropdown not avalible");
        Assert.assertTrue(bookingServiceHomePage.verifyStatusYearDrop(),"Year Dropdown not avalible");
    }

    @Test(priority = 6, description = "Verify that the user can search manual vehicle when enter car details  _022")
    public void BookingServiceHomeTest_TC006() throws Exception{
        bookingServiceHomePage.BookingService_TC006("123456");
    }

    @Test(priority = 7, description = "Verify system in case the user go to \"Select Your Sercices\" screen  _023",dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC007(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC007(id_rego,suburb);
        Assert.assertEquals(bookingServiceHomePage.verifySelectServiceHeader(),"SELECT YOUR SERVICES");
        Assert.assertEquals(bookingServiceHomePage.verifyServiceTitle(),"Service");
        Assert.assertEquals(bookingServiceHomePage.verifyRepairsTitle(),"Repairs");
        Assert.assertEquals(bookingServiceHomePage.verifyInspectionsTitle(),"Inspections");
        Assert.assertEquals(bookingServiceHomePage.verifyOthersTitle(),"Others");
    }

    @Test(priority = 8, description = "Verify system in case the user click on \"Back\" button  _024",dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC008(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC008(id_rego,suburb);
        Assert.assertEquals(bookingServiceHomePage.verifyConfirmVehicleHeader(),"CONFIRM YOUR VEHICLE");
    }

    @Test(priority = 9, description = "Verify that user can choose any a Service/ multiple Services  _025",dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC009(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC009(id_rego,suburb);
        Assert.assertEquals(bookingServiceHomePage.verifyChooseServiceTitle(),"Please choose your service options:");
        validateHelper.clickElement(addOtherServ);
        validateHelper.clickElement(repairsTitle);
        Assert.assertEquals(bookingServiceHomePage.verifyChooseRepairsTitle(),"Please choose your repairs options:");
        validateHelper.clickElement(addOtherServ);
        validateHelper.clickElement(inspectionsTitle);
        Assert.assertEquals(bookingServiceHomePage.verifyChooseInspecTitle(),"Please choose your inspections options:");
        validateHelper.clickElement(addOtherServ);
        validateHelper.clickElement(othersTitle);
        Assert.assertEquals(bookingServiceHomePage.verifyChooseOtherTitle(),"Please choose your others options:");
    }

    @Test(priority = 10, description = "Verify system in case the user choose service options  _026", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC010(String id_rego,String suburb) throws Exception{
        bookingServiceHomePage.BookingService_TC010(id_rego,suburb);
        Assert.assertTrue(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button not Available");
    }

    @Test(priority = 11, description = "Verify system in case the user choose Repairs options  _026", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC011(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC011(id_rego,suburb);
        Assert.assertTrue(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button not Available");
    }

    @Test(priority = 12, description = "Verify system in case the user choose Inspections options  _026", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC012(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC012(id_rego,suburb);
        Assert.assertTrue(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button not Available");
    }

    @Test(priority = 13, description = "Verify system in case the user choose Others options  _026", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC013(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC013(id_rego,suburb);
        Assert.assertTrue(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button not Available");
    }

    @Test(priority = 14, description = "Verify system in case the user uncheck service options  _027", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC014(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC014(id_rego,suburb);
        Assert.assertFalse(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button is Available");
    }

    @Test(priority = 15, description = "Verify system in case the user remove service options  _027", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC015(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC015(id_rego,suburb);
        Assert.assertFalse(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button is Available");
    }

    @Test(priority = 16, description = "Verify system in case the user uncheck repairs options  _027", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC016(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC016(id_rego,suburb);
        Assert.assertFalse(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button is Available");
    }

    @Test(priority = 17, description = "Verify system in case the user remove repairs options  _027", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC017(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC017(id_rego,suburb);
        Assert.assertFalse(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button is Available");
    }

    @Test(priority = 18, description = "Verify system in case the user uncheck Inpections options  _027", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC018(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC018(id_rego,suburb);
        Assert.assertFalse(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button is Available");
    }

    @Test(priority = 19, description = "Verify system in case the user remove Inpections options  _027", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC019(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC019(id_rego,suburb);
        Assert.assertFalse(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button is Available");
    }

    @Test(priority = 20, description = "Verify system in case the user uncheck Others options  _027", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC020(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC020(id_rego,suburb);
        Assert.assertFalse(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button is Available");
    }

    @Test(priority = 21, description = "Verify system in case the user remove Others options  _027", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC021(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC021(id_rego,suburb);
        Assert.assertFalse(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button is Available");
    }

    @Test(priority = 22, description = "Verify that system will show \"Select An Appointment\" after user choose service items  _028", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC022(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC022(id_rego,suburb);
        Assert.assertEquals(bookingServiceHomePage.verifySelectAnAppointmenHeader(),"SELECT AN APPOINTMENT");
        Assert.assertEquals(bookingServiceHomePage.verifySelectDateTitle(),"Select date");
        Assert.assertEquals(bookingServiceHomePage.verifySelectTimeTitle(),"Select time");
        Assert.assertEquals(bookingServiceHomePage.verifySelectDropOptionsTitle(),"Select drop off options");
        Assert.assertEquals(bookingServiceHomePage.verifyYourStoreTitle(),"Your selected Motorserve store");
        Assert.assertTrue(bookingServiceHomePage.verifyStatusChooseProceedButton(),"Choose Proceed Button not Available");
    }

    @Test(priority = 23, description = "Verify system in case the user click on \"Back\" button  _029", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC023(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC023(id_rego,suburb);
        Assert.assertEquals(bookingServiceHomePage.verifySelectServiceHeader(),"SELECT YOUR SERVICES");
        Assert.assertEquals(bookingServiceHomePage.verifyChooseServiceTitle(),"Please choose your service options:");
    }

    @Test(priority = 24, description = "Verify that the user can select date/Select time in case that day is avaible  _030", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC024(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC024(id_rego,suburb);
        Assert.assertEquals(bookingServiceHomePage.verifyContactDetailHeader(),"CONTACT DETAILS");
    }

    @Test(priority = 25, description = "Verify that the user can select date from canlenda Icon  _031", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC025(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC025(id_rego,suburb);
        Assert.assertEquals(bookingServiceHomePage.verifyContactDetailHeader(),"CONTACT DETAILS");
    }

    @Test(priority = 26, description = "Verify system in case the user select drop of options  _032", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC026(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC026(id_rego,suburb);
        Assert.assertTrue(bookingServiceHomePage.verifyKeyDropText().contains("After hours key drop off"));
    }

    @Test(priority = 27, description = "Verify that system will show \"Contact Details\" after user select an appointment  _033", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC027(String id_rego,String suburb) {
        bookingServiceHomePage.BookingService_TC027(id_rego,suburb);
        Assert.assertTrue(bookingServiceHomePage.verifyStatusFirstNameField());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusLastNameField());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusPhoneNumberField());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusEmailField());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusAddress1Field());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusAddress2Field());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusPostCodeField());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusMemberNoField());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusCompanyNameField());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusPromoCodeField());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusPromoCodeField());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusNoteField());
        Assert.assertFalse(bookingServiceHomePage.verifyStatusApplyButton());
        Assert.assertEquals(bookingServiceHomePage.verifyBookingSummaryHeader(),"Booking Summary");
        Assert.assertFalse(bookingServiceHomePage.verifyStatusConfirmButton());
        Assert.assertTrue(bookingServiceHomePage.verifyStatusBackButton());
    }

    @Test(priority = 28, description = "Verify validation message for case \"max length\" field  _035", dataProvider = "data_contact", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC028(String id_rego, String suburb, String firstname, String lastname, String phonenumber, String emailContact, String postCode) {
        bookingServiceHomePage.BookingService_TC028(id_rego,suburb,firstname,lastname,phonenumber,emailContact,postCode);
        Assert.assertEquals(bookingServiceHomePage.verifyMaxLenghtFirtNameField(),"Your First Name must not exceed 50 characters.");
        Assert.assertEquals(bookingServiceHomePage.verifyMaxLengthLastNameField(),"Your Last Name must not exceed 50 characters.");
        Assert.assertEquals(bookingServiceHomePage.verifyMaxLengthPhoneNumberField(),"The Phone Number must be maximum 20 numbers.");
        Assert.assertEquals(bookingServiceHomePage.verifyMaxLengthEmailField(),"Your Email must not exceed 50 characters.");
        Assert.assertEquals(bookingServiceHomePage.verifyMaxLengthPostCodeField(),"The postCode field must be 4 characters");
    }

    @Test(priority = 29, description = "Verify validation message in case remove text field  _035", dataProvider = "data_contact", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC029(String id_rego, String suburb, String firstname, String lastname, String phonenumber, String emailContact, String postCode) {
        bookingServiceHomePage.BookingService_TC029(id_rego,suburb,firstname,lastname,phonenumber,emailContact,postCode);
        Assert.assertEquals(bookingServiceHomePage.verifytFirtNameReq(),"The First Name field is required");
        Assert.assertEquals(bookingServiceHomePage.verifyLastNameReq(),"The Last Name field is required");
        Assert.assertEquals(bookingServiceHomePage.verifyPhoneNumberReq(),"The Phone Number field is required");
        Assert.assertEquals(bookingServiceHomePage.verifyEmailReq(),"The Email field is required");
        Assert.assertEquals(bookingServiceHomePage.verifyPostCodeReq(),"The Postcode field is required");
    }

    @Test(priority = 30, description = "Verify validation message in case enter invalid data  _035", dataProvider = "data_InvaContact", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC030(String id_rego, String suburb,String phonenumber, String emailContact, String postCode) {
        bookingServiceHomePage.BookingService_TC030(id_rego,suburb,phonenumber,emailContact,postCode);
        Assert.assertEquals(bookingServiceHomePage.verifyPhoneValidMess(),"Please add valid Phone Number.");
        Assert.assertEquals(bookingServiceHomePage.verifyEmailValidMess(),"The email field must be a valid email");
        Assert.assertEquals(bookingServiceHomePage.verifyPostCodeValidMess(),"No valid post code found.");
    }

    @Test(priority = 31, description = "Verify system in case enter email already exits  _036", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC031(String id_rego, String suburb) {
        bookingServiceHomePage.BookingService_TC031(id_rego,suburb,"nguyentrungdtu@gmail.com");
        Assert.assertEquals(bookingServiceHomePage.verifyEmailExistsMess(),"Email already exists. Please return to login page or use another email to continue with the booking.");
    }

    @Test(priority = 32, description = "Verify system in case the user enter valid \"Promo Code\"  _037", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC032(String id_rego, String suburb) {
        bookingServiceHomePage.BookingService_TC032(id_rego,suburb,"Testing");
        Assert.assertEquals(bookingServiceHomePage.verifyPromoCodeValidMessage(),"This Promo Code is successfully validated.");
    }

    @Test(priority = 33, description = "Verify system in case the user enter invalid \"Promo Code\"  _038", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC033(String id_rego, String suburb) {
        bookingServiceHomePage.BookingService_TC033(id_rego,suburb,"testing1");
        Assert.assertEquals(bookingServiceHomePage.verifyPromoCodeInvalidMessage(),"Sorry, this promo code is not valid.");
    }

    @Test(priority = 34, description = "Verify that the user can payment the after fill full contact details  _039", dataProvider = "data_ValidContact", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC034(String id_rego, String suburb, String firstname, String lastname, String phonenumber, String emailContact,
                                             String address1, String address2, String postCode, String mrma, String company, String promo, String note) {
        bookingServiceHomePage.BookingService_TC034(id_rego,suburb,firstname,lastname,phonenumber,emailContact,address1,address2,postCode,mrma,company,promo,note);
        Assert.assertTrue(bookingServiceHomePage.verifyStatusConfirmBt());
    }

    @Test(priority = 35, description = "Verify system in case the user click Privacy Link _040", dataProvider = "data_store", dataProviderClass = DataBookingService.class)
    public void BookingServiceHomeTest_TC035(String id_rego, String suburb) {
        bookingServiceHomePage.BookingService_TC035(id_rego,suburb);
        Assert.assertEquals(bookingServiceHomePage.verifyPrivacyHeader(),"MOTORSERVE PRIVACY POLICY");
    }

}
