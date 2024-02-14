package com.easyserv.pages.BookingServicePage.CustomerNotAccess;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class BookingServiceHomePage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By vehicleTab = By.xpath("//div[contains(@class,'ant-steps-item-title')]");
    private By selectVehicleHeader = By.xpath("//span[contains(text(),'Select your vehicle')]");
    private By idRego = By.xpath("//div[@class='ant-select-selector']");
    private By enterRego = By.xpath("//input[@placeholder='Enter your rego']");
    private By findCarButton = By.xpath("//button[@type='button']");
    private By toyotaVehicle = By.xpath("//div[contains(text(),'TOYOTA LANDCRUISER 2003')]");
    private By vehicleConfirmBt = By.xpath("//span[contains(text(),'Confirm and Proceed')]");
    private By location = By.xpath("//div[@class='ant-space-item']//u[normalize-space()='No store currently selected'] ");
    private By enterSub = By.xpath("//input[@placeholder='Enter Suburb or Postcode']");
    private By searchBt = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-input-search-button']");
    private By setStoreButton = By.xpath("//div[@id='store-select-popup']//div[1]//div[1]//div[1]//div[2]//button[1]//span[1]");
    private By selectService = By.xpath("//span[contains(text(),'Select Your Services')]");
    private By vehicleNotfoundMess = By.xpath("//div[contains(text(),'Vehicle Not Found')]");
    private By ID_NT = By.xpath("//div[contains(@class,'ant-select-item-option-content')][normalize-space()='NT']");
    private By ID_NT_NUMBER = By.xpath("//div[@class='ant-col tag']");
    private By findModelLink = By.xpath("//u[contains(text(),'Or find your car by make, model and year')]");
    private By carDetailHeader = By.xpath("//span[contains(text(),'Please Enter Your Car Details')]");
    private By registerNumberField = By.xpath("//input[@id='basic_registrationNumber']");
    private By stateDropdown = By.xpath("//div[@class='ant-select-selector']//span[@title='NSW']");
    private By makeDropdown = By.xpath("//input[@id='basic_make']");
    private By modelDropdown = By.xpath("//input[@id='basic_model']");
    private By variantDropdown = By.xpath("//input[@id='basic_variant']");
    private By yearDropdown = By.xpath("//input[@id='basic_year']");
    private By serviceTitle = By.xpath("//div[normalize-space()='Service']");
    private By repairsTitle = By.xpath("//div[normalize-space()='Repairs']");
    private By inspectionsTitle = By.xpath("//div[normalize-space()='Inspections']");
    private By othersTitle = By.xpath("//div[normalize-space()='Others']");
    private By backButton = By.xpath("//span[contains(text(),'Back')]");
    private By confirmVehicle = By.xpath("//span[contains(text(),'Confirm your vehicle')]");
    private By addOtherServ = By.xpath("//div[contains(text(),'Add other services')]");
    private By chooseServiceTitle = By.xpath("//h3[contains(text(),'Please choose your service options:')]");
    private By chooseRepairTitle = By.xpath("//h3[contains(text(),'Please choose your repairs options:')]");
    private By chooseInspecTitle = By.xpath("//h3[contains(text(),'Please choose your inspections options:')]");
    private By chooseOtherTitle = By.xpath("//h3[contains(text(),'Please choose your others options:')]");
    private By serviceName = By.xpath("//span[normalize-space()='Logbook Service']");
    private By repairsName = By.xpath("//span[normalize-space()='Brakes']");
    private By inspecName = By.xpath("//span[normalize-space()='Vehicle Inspection']");
    private By otherName = By.xpath("//span[normalize-space()='Other (Please specify in Notes)']");
    private By chooseProceed = By.xpath("//button[@type='button']");
    private By removeServIcon = By.xpath("//span[@aria-label='minus-circle']//*[name()='svg']");
    private By selectAppTitle = By.xpath("//span[contains(text(),'Select An Appointment')]");
    private By selectDate = By.xpath("//span[contains(text(),'Select date')]");
    private By selectTime = By.xpath("//span[contains(text(),'Select time')]");
    private By selectDropOption = By.xpath("//span[contains(text(),'Select drop off options')]");
    private By yourStoreTitle = By.xpath("//span[contains(text(),'Your selected Motorserve store')]");
    private By dateApp = By.xpath("//span[normalize-space()='30']");
    private By timeApp = By.xpath("//span[normalize-space()='07:30']");
    private By afterKey = By.xpath("//span[normalize-space()='After hours key drop off']");
    private By proceedButton = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-primary proceed btn-branding']");
    private By contactDetailHeader = By.xpath("//span[contains(text(),'Contact details')]");
    private By pickerIcon = By.xpath("//div[@class='ant-picker-input']");
    private By pickerDay = By.xpath("//td[@title='2023-06-20']//div[@class='ant-picker-cell-inner'][normalize-space()='20']");
    private By AppInfor = By.xpath("//p[contains(@class,'item-summary__description')]");
    private By firstName = By.xpath("//input[@id='basic_firstName']");
    private By lastName = By.xpath("//input[@id='basic_lastName']");
    private By phoneNumber = By.xpath("//input[@id='basic_phoneNumber']");
    private By email = By.xpath("//input[@id='basic_email']");
    private By address_1 = By.xpath("//input[@id='basic_addressLine1']");
    private By address_2 = By.xpath("//input[@id='basic_addressLine2']");
    private By postcode = By.xpath("//div[@class='ant-form-item-control-input-content']//span//input[@type='text']");
    private By memberNo = By.xpath("//input[@id='basic_memberNo']");
    private By companyName = By.xpath("//input[@id='basic_companyName']");
    private By promoCode = By.xpath("//span[@id='basic_promotionCode']//input[@type='text']");
    private By notes = By.xpath("//textarea[@id='basic_note']");
    private By applyBt = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-default btn-apply']");
    private By bookingHeader = By.xpath("//p[contains(text(),'Booking Summary')]");
    private By confirmBt = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-ghost proceed']");
    private By firtNameVal = By.xpath("//div[contains(text(),'Your First Name must not exceed 50 characters.')]");
    private By lastNameVal = By.xpath("//div[contains(text(),'Your Last Name must not exceed 50 characters.')]");
    private By phoneVal = By.xpath("//div[contains(text(),'The Phone Number must be maximum 20 numbers.')]");
    private By emailVal = By.xpath("//div[contains(text(),'Your Email must not exceed 50 characters.')]");
    private By postCodeVal = By.xpath("//div[contains(text(),'The postCode field must be 4 characters')]");
    private By firtNameReq = By.xpath("//div[contains(text(),'The First Name field is required')]");
    private By lastNameReq = By.xpath("//div[contains(text(),'The Last Name field is required')]");
    private By phoneReq = By.xpath("//div[contains(text(),'The Phone Number field is required')]");
    private By emailReq = By.xpath("//div[contains(text(),'The Email field is required')]");
    private By postcodeReq = By.xpath("//div[contains(text(),'The Postcode field is required')]");
    private By phoneValidReq = By.xpath("//div[contains(text(),'Please add valid Phone Number.')]");
    private By emailValidReq = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By postCodeValidReq = By.xpath("//div[contains(text(),'No valid post code found.')]");
    private By emailExists = By.xpath("//div[contains(@class,'ant-form-item-explain-error')][normalize-space()='Email already exists. Please return to login page or use another email to continue with the booking.']");
    private By PromoCodeInvalid = By.xpath("//div[contains(text(),'Sorry, this promo code is not valid.')]");
    private By PromoCodeValid = By.xpath("//span[contains(text(),'This Promo Code is successfully validated.')]");
    private By Confirm_Bt = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-primary proceed']");
    private By privacyLink = By.xpath("//a[@class='ant-typography url-privacy']");
    private By privacyHeader = By.xpath("//h1[contains(text(),'Motorserve Privacy Policy')]");


    public BookingServiceHomePage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void BookingService_TC001() {
        validateHelper.movetoElement(vehicleTab);
    }

    public void BookingService_TC002(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
    }

    public void BookingService_TC003(String id_rego) {
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
    }

    public void BookingService_TC004(String id_rego) {
        validateHelper.movetoElement(vehicleTab);
        validateHelper.clickElement(idRego);
        validateHelper.clickElement(ID_NT);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
    }

    public void BookingService_TC005() {
        validateHelper.movetoElement(vehicleTab);
        validateHelper.clickElement(findModelLink);
    }

    public void BookingService_TC006(String regis) {
        validateHelper.clickElement(findModelLink);
        validateHelper.setText(registerNumberField, regis);
//        validateHelper.clickElement(stateDropdown);
//        validateHelper.clickElement(ID_NT);
//        validateHelper.movetoElement(makeDropdown);
//        validateHelper.selectValueDropdown(makeDropdown);
//        validateHelper.selectValueDropdown(modelDropdown);
//        validateHelper.selectValueDropdown(variantDropdown);
//        validateHelper.selectValueDropdown(yearDropdown);
    }

    public void BookingService_TC007(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
    }

    public void BookingService_TC008(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.clickElement(backButton);
    }

    public void BookingService_TC009(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
    }

    public void BookingService_TC010(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
    }

    public void BookingService_TC011(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(repairsTitle);
        validateHelper.clickElement(repairsTitle);
        validateHelper.movetoElement(chooseRepairTitle);
        validateHelper.clickElement(repairsName);
    }

    public void BookingService_TC012(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(inspectionsTitle);
        validateHelper.clickElement(inspectionsTitle);
        validateHelper.movetoElement(chooseInspecTitle);
        validateHelper.clickElement(inspecName);
    }

    public void BookingService_TC013(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(othersTitle);
        validateHelper.clickElement(othersTitle);
        validateHelper.movetoElement(chooseOtherTitle);
        validateHelper.clickElement(otherName);
    }

    public void BookingService_TC014(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        Assert.assertTrue(verifyStatusChooseProceedButton(), "Choose Proceed Button not avaible");
        validateHelper.clickElement(serviceName);
    }

    public void BookingService_TC015(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        Assert.assertTrue(verifyStatusChooseProceedButton(), "Choose Proceed Button not avaible");
        validateHelper.clickElement(removeServIcon);
    }

    public void BookingService_TC016(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(repairsTitle);
        validateHelper.clickElement(repairsTitle);
        validateHelper.movetoElement(chooseRepairTitle);
        validateHelper.clickElement(repairsName);
        Assert.assertTrue(verifyStatusChooseProceedButton(), "Choose Proceed Button not avaible");
        validateHelper.clickElement(repairsName);
    }

    public void BookingService_TC017(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(repairsTitle);
        validateHelper.clickElement(repairsTitle);
        validateHelper.movetoElement(chooseRepairTitle);
        validateHelper.clickElement(repairsName);
        Assert.assertTrue(verifyStatusChooseProceedButton(), "Choose Proceed Button not avaible");
        validateHelper.clickElement(removeServIcon);
    }

    public void BookingService_TC018(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(inspectionsTitle);
        validateHelper.clickElement(inspectionsTitle);
        validateHelper.movetoElement(chooseInspecTitle);
        validateHelper.clickElement(inspecName);
        Assert.assertTrue(verifyStatusChooseProceedButton(), "Choose Proceed Button not avaible");
        validateHelper.clickElement(inspecName);
    }

    public void BookingService_TC019(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(inspectionsTitle);
        validateHelper.clickElement(inspectionsTitle);
        validateHelper.movetoElement(chooseInspecTitle);
        validateHelper.clickElement(inspecName);
        Assert.assertTrue(verifyStatusChooseProceedButton(), "Choose Proceed Button not avaible");
        validateHelper.clickElement(removeServIcon);
    }

    public void BookingService_TC020(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(othersTitle);
        validateHelper.clickElement(othersTitle);
        validateHelper.movetoElement(chooseOtherTitle);
        validateHelper.clickElement(otherName);
        Assert.assertTrue(verifyStatusChooseProceedButton(), "Choose Proceed Button not avaible");
        validateHelper.clickElement(otherName);
    }

    public void BookingService_TC021(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(othersTitle);
        validateHelper.clickElement(othersTitle);
        validateHelper.movetoElement(chooseOtherTitle);
        validateHelper.clickElement(otherName);
        Assert.assertTrue(verifyStatusChooseProceedButton(), "Choose Proceed Button not avaible");
        validateHelper.clickElement(removeServIcon);
    }

    public void BookingService_TC022(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
    }

    public void BookingService_TC023(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(backButton);
        validateHelper.movetoElement(chooseServiceTitle);
    }

    public void BookingService_TC024(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
//        validateHelper.clickElement(dateApp);
//        validateHelper.waitForPageLoaded();
//        validateHelper.clickElement(timeApp);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
    }

    public void BookingService_TC025(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
    }

    public void BookingService_TC026(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
    }

    public void BookingService_TC027(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
        validateHelper.movetoElement(applyBt);
    }

    public void BookingService_TC028(String id_rego, String suburb, String firstname, String lastname, String phonenumber, String emailContact, String postCode) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
        validateHelper.movetoElement(contactDetailHeader);
        validateHelper.setText(firstName,firstname);
        validateHelper.setText(lastName,lastname);
        validateHelper.setText(phoneNumber,phonenumber);
        validateHelper.setText(email,emailContact);
        validateHelper.movetoElement(postcode);
        validateHelper.setText(postcode,postCode);
    }

    public void BookingService_TC029(String id_rego, String suburb, String firstname, String lastname, String phonenumber, String emailContact, String postCode) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
        validateHelper.movetoElement(contactDetailHeader);
        validateHelper.setText(firstName,firstname);
        validateHelper.clearText(firstName);
        validateHelper.setText(lastName,lastname);
        validateHelper.clearText(lastName);
        validateHelper.setText(phoneNumber,phonenumber);
        validateHelper.clearText(phoneNumber);
        validateHelper.setText(email,emailContact);
        validateHelper.clearText(email);
        validateHelper.movetoElement(postcode);
        validateHelper.setText(postcode,postCode);
        validateHelper.clearText(postcode);
    }

    public void BookingService_TC030(String id_rego, String suburb,String phonenumber, String emailContact, String postCode) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
        validateHelper.movetoElement(contactDetailHeader);
        validateHelper.setText(phoneNumber,phonenumber);
        validateHelper.setText(email,emailContact);
        validateHelper.movetoElement(postcode);
        validateHelper.setText(postcode,postCode);
    }

    public void BookingService_TC031(String id_rego, String suburb,String emailContact) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
        validateHelper.movetoElement(contactDetailHeader);
        validateHelper.setText(email,emailContact);
        validateHelper.delay(3);
    }

    public void BookingService_TC032(String id_rego, String suburb,String proCode) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
        validateHelper.movetoElement(promoCode);
        validateHelper.setText(promoCode,proCode);
        validateHelper.clickElement(applyBt);
        validateHelper.delay(2);
    }
    public void BookingService_TC033(String id_rego, String suburb,String proCode) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
        validateHelper.movetoElement(promoCode);
        validateHelper.setText(promoCode,proCode);
        validateHelper.clickElement(applyBt);
        validateHelper.delay(2);
    }

    public void BookingService_TC034(String id_rego, String suburb, String firstname, String lastname, String phonenumber, String emailContact,
                                     String address1, String address2, String postCode, String mrma, String company, String promo, String note) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
        validateHelper.movetoElement(contactDetailHeader);
        validateHelper.setText(firstName,firstname);
        validateHelper.setText(lastName,lastname);
        validateHelper.setText(phoneNumber,phonenumber);
        validateHelper.setText(email,emailContact);
        validateHelper.setText(address_1,address1);
        validateHelper.setText(address_2,address2);
        validateHelper.movetoElement(postcode);
        validateHelper.setText(postcode,postCode);
        validateHelper.setText(memberNo,mrma);
        validateHelper.setText(companyName,company);
        validateHelper.setText(promoCode,promo);
        validateHelper.clickElement(applyBt);
        validateHelper.delay(2);
        validateHelper.setText(notes,note);
    }

    public void BookingService_TC035(String id_rego, String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub, suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
        validateHelper.movetoElement(vehicleTab);
        validateHelper.setText(enterRego, id_rego);
        validateHelper.clickElement(findCarButton);
        validateHelper.clickElement(vehicleConfirmBt);
        validateHelper.movetoElement(serviceTitle);
        validateHelper.clickElement(serviceTitle);
        validateHelper.movetoElement(chooseServiceTitle);
        validateHelper.clickElement(serviceName);
        validateHelper.clickElement(chooseProceed);
        validateHelper.movetoElement(selectAppTitle);
        validateHelper.clickElement(pickerIcon);
        validateHelper.clickElement(pickerDay);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(timeApp);
        validateHelper.movetoElement(afterKey);
        validateHelper.clickElement(afterKey);
        validateHelper.clickElement(proceedButton);
        validateHelper.movetoElement(privacyLink);
        validateHelper.clickElement(privacyLink);
        validateHelper.delay(2);
        validateHelper.SwitchBrowser();
        validateHelper.movetoElement(privacyHeader);
    }

    public String verifyPrivacyHeader(){
        String priv = validateHelper.checkText(privacyHeader);
        System.out.println("Printer Privacy Header : " +priv);
        return priv;
    }

    public boolean verifyStatusConfirmBt() {
        boolean confBt = validateHelper.enableElement(Confirm_Bt);
        System.out.println("Printer Status Confirm Button :" + confBt);
        return confBt;
    }
    public String verifyPromoCodeValidMessage(){
        String proMess = validateHelper.checkText(PromoCodeValid);
        System.out.println("Printer Message PromoCode :" +proMess);
        return proMess;
    }
    public String verifyPromoCodeInvalidMessage(){
        String proMess = validateHelper.checkText(PromoCodeInvalid);
        System.out.println("Printer Message PromoCode :" +proMess);
        return proMess;
    }

    public String verifyEmailExistsMess(){
        String emailMess = validateHelper.checkText(emailExists);
        System.out.println("Printer Email Exists Message :" + emailMess);
        return emailMess;
    }
    public String verifyPhoneValidMess(){
        String phone = validateHelper.checkText(phoneValidReq);
        System.out.println("Printer required Message :" +phone);
        return phone;
    }

    public String verifyEmailValidMess(){
        String email = validateHelper.checkText(emailValidReq);
        System.out.println("Printer required Message :" +email);
        return email;
    }

    public String verifyPostCodeValidMess(){
        String postcode = validateHelper.checkText(postCodeValidReq);
        System.out.println("Printer required Message :" +postcode);
        return postcode;
    }

    public String verifytFirtNameReq(){
        String firtnameReq = validateHelper.checkText(firtNameReq);
        System.out.println("Printer FirtName Require Message : " +firtnameReq);
        return firtnameReq;
    }

    public String verifyLastNameReq(){
        String lastnameReq = validateHelper.checkText(lastNameReq);
        System.out.println("Printer LastName Require Message : " +lastnameReq);
        return lastnameReq;
    }

    public String verifyPhoneNumberReq(){
        String phone = validateHelper.checkText(phoneReq);
        System.out.println("Printer Phone Require Message : " +phone);
        return phone;
    }

    public String verifyEmailReq() {
        String email = validateHelper.checkText(emailReq);
        System.out.println("Printer Email Require Message : " + email);
        return email;
    }

    public String verifyPostCodeReq(){
        String postCode = validateHelper.checkText(postcodeReq);
        System.out.println("Printer PostCode Require Message : " + postCode);
        return postCode;
    }

    public String verifyMaxLengthPostCodeField(){
        String postReq = validateHelper.checkText(postCodeVal);
        System.out.println("Printer PostCode Require Message : " +postReq);
        return postReq;
    }

    public String verifyMaxLengthEmailField(){
        String emailReq = validateHelper.checkText(emailVal);
        System.out.println("Printer Email Require Message : " +emailReq);
        return emailReq;
    }

    public String verifyMaxLengthPhoneNumberField(){
        String phoneReq = validateHelper.checkText(phoneVal);
        System.out.println("Printer Phone Require Message : " +phoneReq);
        return phoneReq;
    }

    public String verifyMaxLengthLastNameField(){
        String lastnameReq = validateHelper.checkText(lastNameVal);
        System.out.println("Printer LastName Require Message : " +lastnameReq);
        return lastnameReq;
    }

    public String verifyMaxLenghtFirtNameField(){
        String firtnameReq = validateHelper.checkText(firtNameVal);
        System.out.println("Printer FirtName Require Message : " +firtnameReq);
        return firtnameReq;
    }
    public boolean verifyStatusBackButton() {
        boolean backBt = validateHelper.enableElement(backButton);
        System.out.println("Printer Status Back Button :" + backBt);
        return backBt;
    }

    public boolean verifyStatusConfirmButton() {
        boolean confBt = validateHelper.enableElement(confirmBt);
        System.out.println("Printer Status Confirm Button :" + confBt);
        return confBt;
    }

    public String verifyBookingSummaryHeader() {
        String bookSum = validateHelper.checkText(bookingHeader);
        System.out.println("Printer Booking Summary Header :" + bookSum);
        return bookSum;
    }

    public boolean verifyStatusApplyButton() {
        boolean apply_ = validateHelper.enableElement(applyBt);
        System.out.println("Printer Status Apply Button :" + apply_);
        return apply_;
    }

    public boolean verifyStatusFirstNameField() {
        boolean firstname = validateHelper.enableElement(firstName);
        System.out.println("Print Status FirstName field :" + firstname);
        return firstname;
    }

    public boolean verifyStatusLastNameField() {
        boolean lastname = validateHelper.enableElement(lastName);
        System.out.println("Print Status LastnName field :" + lastname);
        return lastname;
    }

    public boolean verifyStatusPhoneNumberField() {
        boolean phoneNum = validateHelper.enableElement(phoneNumber);
        System.out.println("Print Status Phone Number field :" + phoneNum);
        return phoneNum;
    }

    public boolean verifyStatusEmailField() {
        boolean email_ = validateHelper.enableElement(email);
        System.out.println("Print Status Email field :" + email_);
        return email_;
    }

    public boolean verifyStatusAddress1Field() {
        boolean add_1 = validateHelper.enableElement(address_1);
        System.out.println("Print Status Address1 field :" + add_1);
        return add_1;
    }

    public boolean verifyStatusAddress2Field() {
        boolean add_2 = validateHelper.enableElement(address_2);
        System.out.println("Print Status Address2 field :" + add_2);
        return add_2;
    }

    public boolean verifyStatusPostCodeField() {
        boolean postCode = validateHelper.enableElement(postcode);
        System.out.println("Print Status Post Code field :" + postCode);
        return postCode;
    }

    public boolean verifyStatusMemberNoField() {
        boolean memberNo_ = validateHelper.enableElement(memberNo);
        System.out.println("Print Status Member No field :" + memberNo_);
        return memberNo_;
    }

    public boolean verifyStatusCompanyNameField() {
        boolean company = validateHelper.enableElement(companyName);
        System.out.println("Print Status Company Name field :" + company);
        return company;
    }

    public boolean verifyStatusPromoCodeField() {
        boolean pro = validateHelper.enableElement(promoCode);
        System.out.println("Print Status Promo Code field :" + pro);
        return pro;
    }

    public boolean verifyStatusNoteField() {
        boolean note_ = validateHelper.enableElement(notes);
        System.out.println("Print Status Notes field :" + note_);
        return note_;
    }

    public String verifyKeyDropText() {
        String keyDrop = validateHelper.checkText(AppInfor);
        System.out.println("Printer App Infore :" + keyDrop);
        return keyDrop;
    }

    public String verifyContactDetailHeader() {
        String contactDetail = validateHelper.checkText(contactDetailHeader);
        System.out.println("Printer Contact Detail Header :" + contactDetail);
        return contactDetail;
    }

    public String verifySelectAnAppointmenHeader() {
        String selectApp = validateHelper.checkText(selectAppTitle);
        System.out.println("Print Select Appointment Header :" + selectApp);
        return selectApp;
    }

    public String verifySelectDateTitle() {
        String selectdate = validateHelper.checkText(selectDate);
        System.out.println("Print Select Date Title :" + selectdate);
        return selectdate;
    }

    public String verifySelectTimeTitle() {
        String selecttime = validateHelper.checkText(selectTime);
        System.out.println("Print Select Time Title :" + selecttime);
        return selecttime;
    }

    public String verifySelectDropOptionsTitle() {
        String selectOption = validateHelper.checkText(selectDropOption);
        System.out.println("Print Select Drop Option Title :" + selectOption);
        return selectOption;
    }

    public String verifyYourStoreTitle() {
        String yourStore = validateHelper.checkText(yourStoreTitle);
        System.out.println("Print Your Store Title :" + yourStore);
        return yourStore;
    }

    public Boolean verifyStatusChooseProceedButton() {
        boolean choosePro = validateHelper.enableElement(chooseProceed);
        System.out.println("Print Status Choose Proceed Button :" + choosePro);
        return choosePro;
    }

    public String verifyChooseOtherTitle() {
        String chooseOther = validateHelper.checkText(chooseOtherTitle);
        System.out.println("Printer Choose Other Title :" + chooseOther);
        return chooseOther;
    }

    public String verifyChooseInspecTitle() {
        String chooseInspec = validateHelper.checkText(chooseInspecTitle);
        System.out.println("Printer Choose Inspec Title :" + chooseInspec);
        return chooseInspec;
    }

    public String verifyChooseRepairsTitle() {
        String chooseRepair = validateHelper.checkText(chooseRepairTitle);
        System.out.println("Printer Choose Repair Title :" + chooseRepair);
        return chooseRepair;
    }

    public String verifyChooseServiceTitle() {
        String chooseServ = validateHelper.checkText(chooseServiceTitle);
        System.out.println("Printer Choose Service Title :" + chooseServ);
        return chooseServ;
    }

    public String verifyConfirmVehicleHeader() {
        String confVehicle = validateHelper.checkText(confirmVehicle);
        System.out.println("Printer Confirm Vehicle Header :" + confVehicle);
        return confVehicle;
    }

    public String verifyOthersTitle() {
        String other = validateHelper.checkText(othersTitle);
        System.out.println("Printer Others Title :" + other);
        return other;
    }

    public String verifyInspectionsTitle() {
        String inpec = validateHelper.checkText(inspectionsTitle);
        System.out.println("Printer Inpections Title :" + inpec);
        return inpec;
    }

    public String verifyRepairsTitle() {
        String repai = validateHelper.checkText(repairsTitle);
        System.out.println("Printer Repairs Title :" + repai);
        return repai;
    }

    public String verifyServiceTitle() {
        String serv = validateHelper.checkText(serviceTitle);
        System.out.println("Printer Service Title :" + serv);
        return serv;
    }

    public boolean verifyDisplayRegisterNumber() {
        boolean regis = validateHelper.isDiplayedElement(registerNumberField);
        System.out.println("Print status of Register Number Field :" + regis);
        return regis;
    }

    public boolean verifyStatusStateDrop() {
        boolean state = validateHelper.enableElement(stateDropdown);
        System.out.println("Printer Status State Dropdown : " + state);
        return state;
    }

    public boolean verifyStatusMakeDrop() {
        boolean make = validateHelper.enableElement(makeDropdown);
        System.out.println("Printer Status Make Dropdown : " + make);
        return make;
    }

    public boolean verifyStatusModelDrop() {
        boolean model = validateHelper.enableElement(modelDropdown);
        System.out.println("Printer Status Model Dropdown : " + model);
        return model;
    }

    public boolean verifyStatusVariantDrop() {
        boolean variant = validateHelper.enableElement(variantDropdown);
        System.out.println("Printer Status Variant Dropdown : " + variant);
        return variant;
    }

    public boolean verifyStatusYearDrop() {
        boolean year = validateHelper.enableElement(yearDropdown);
        System.out.println("Printer Status Year Dropdown : " + year);
        return year;
    }

    public String verifyCarDetailHeader() {
        String cardetail = validateHelper.checkText(carDetailHeader);
        System.out.println("Printer Car Detail Header " + cardetail);
        return cardetail;
    }

    public String verifyIDNumbert() {
        String id_num = validateHelper.checkText(ID_NT_NUMBER);
        System.out.println("Printer ID Number : " + id_num);
        return id_num;
    }

    public String verifyVehicleNotMessage() {
        String vehicleMess = validateHelper.checkText(vehicleNotfoundMess);
        System.out.println("Printer Not Vehicle Message : " + vehicleMess);
        return vehicleMess;
    }

    public String verifySelectServiceHeader() {
        String servHeader = validateHelper.checkText(selectService);
        System.out.println("Printer Service Header : " + servHeader);
        return servHeader;
    }

    public boolean verifyStatusConfirmVehicleButton() {
        boolean confBt = validateHelper.enableElement(vehicleConfirmBt);
        System.out.println("Printer Status Confirm Button : " + confBt);
        return confBt;
    }


    public String verifyVehicleName() {
        String vehicle = validateHelper.checkText(toyotaVehicle);
        System.out.println("Printer Toyota Vehicle Name :" + vehicle);
        return vehicle;
    }

    public boolean verifyDisplayFindCarButton() {
        boolean findCar = validateHelper.enableElement(findCarButton);
        System.out.println("Printer Status of Find Car Button :" + findCar);
        return findCar;
    }

    public boolean verifyDisplayEnterRego() {
        boolean enter_re = validateHelper.isDiplayedElement(enterRego);
        System.out.println("Print status of Enter Rego Field :" + enter_re);
        return enter_re;
    }

    public boolean verifyStatusIDRego() {
        boolean idrego = validateHelper.enableElement(idRego);
        System.out.println("Print status Id Rego :" + idrego);
        return idrego;
    }

    public String verifySelectStoreHeader() {
        String selectStore = validateHelper.checkText(selectVehicleHeader);
        System.out.println("Printer Select Store Header : " + selectStore);
        return selectStore;
    }

}
