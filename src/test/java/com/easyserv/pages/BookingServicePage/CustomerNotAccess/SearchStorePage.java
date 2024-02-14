package com.easyserv.pages.BookingServicePage.CustomerNotAccess;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchStorePage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By location = By.xpath("//div[@class='ant-space-item']//u[normalize-space()='No store currently selected'] ");
    private By phonenumber = By.xpath("//a[@class='css-gvh1rz']//span[contains(text(),'1300 791 094')]");
    private By enquiriIcon = By.xpath("//a[@class='ant-typography btn btn-primary']//div[@class='ant-card ant-card-bordered icon-button']");
    private By enquiriText = By.xpath("//div[contains(text(),'Enquiries')]");
    private By regoIcon = By.xpath("//*[name()='path' and contains(@d,'M12.0001 0')]");
    private By regoText = By.xpath("//div[contains(text(),'Rego')]");
    private By loginIcon = By.xpath("//*[name()='path' and contains(@d,'M20.1212 1')]");
    private By loginText = By.xpath("//div[contains(text(),'DataLogin')]");
    private By vehicleTab = By.xpath("//div[contains(text(),'01. Vehicle')]");
    private By servicesTab = By.xpath("//div[contains(text(),'02. Services')]");
    private By appointmentTab = By.xpath("//div[contains(text(),'03. Appointment')]");
    private By contactTab = By.xpath("//div[contains(text(),'04. Contact & Book')]");
    private By enterrogo = By.xpath("//input[@placeholder='Enter your rego']");

    private By enterSub = By.xpath("//input[@placeholder='Enter Suburb or Postcode']");
    private By uselocationBt = By.xpath("//span[normalize-space()='Use Current Location']");
    private By viewStoreBt = By.xpath("//span[normalize-space()='View all stores']");
    private By searchBt = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-input-search-button']");
    private By scrollDown = By.xpath("//div[@class='ant-row ant-row-space-between']");
    private By setStoreButton = By.xpath("//div[@id='store-select-popup']//div[1]//div[1]//div[1]//div[2]//button[1]//span[1]");
    private By storeName = By.xpath("//strong[normalize-space()='Artarmon']");


    public SearchStorePage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void SearchStore_TC001() {
        validateHelper.waitForPageLoaded();
        validateHelper.HoverAction(driver,enquiriIcon);
        validateHelper.HoverAction(driver,enquiriText);
        Assert.assertEquals(verifyEnquiriesNote(),"Enquiries");
        validateHelper.HoverAction(driver,regoIcon);
        validateHelper.HoverAction(driver,regoText);
        Assert.assertEquals(verifyRegoNote(),"Rego");
        validateHelper.HoverAction(driver,loginIcon);
        validateHelper.HoverAction(driver,loginText);
        Assert.assertEquals(verifyLoginNote(),"DataLogin");
        validateHelper.HoverAction(driver,location);
        Assert.assertEquals(verifyLocationPlaceholder(),"No store currently selected");
        validateHelper.HoverAction(driver,vehicleTab);
        Assert.assertEquals(verifyVehicleTab(),"01. Vehicle");
        validateHelper.HoverAction(driver,servicesTab);
        Assert.assertEquals(verifyServicesTab(),"02. Services");
        validateHelper.HoverAction(driver,appointmentTab);
        Assert.assertEquals(verifyAppointmentTab(),"03. Appointment");
        validateHelper.HoverAction(driver,contactTab);
        Assert.assertEquals(verifyContactTab(),"04. Contact & Book");
    }

    public void SearchStore_TC002() {
        validateHelper.clickElement(location);
    }

    public void SearchStore_TC003(String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub,suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.movetoElement(scrollDown);
        validateHelper.waitForPageLoaded();
    }

    public void SearchStore_TC004(String suburb) {
        validateHelper.clickElement(location);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.setText(enterSub,suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.movetoElement(scrollDown);
        validateHelper.waitForPageLoaded();
    }

    public void SearchStore_TC005(String suburb) {
        validateHelper.clickElement(location);
        validateHelper.clickElement(uselocationBt);
        validateHelper.setText(enterSub,suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.movetoElement(scrollDown);
        validateHelper.waitForPageLoaded();
    }

    public void SearchStore_TC006(String suburb) {
        validateHelper.clickElement(location);
        validateHelper.setText(enterSub,suburb);
        validateHelper.clickElement(searchBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(setStoreButton);
    }

    public String verifyStoreName(){
        String storename = validateHelper.checkText(storeName);
        System.out.println("Print Store Name :" +storename);
        return storename;
    }

    public void getListStore() {
        validateHelper.waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']//div[@class='ant-space-item']"));
        for (int i = 1; i < rows.size(); i++) {
            WebElement rowElement = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']//div[@class='ant-space-item'][" + i + "]//span"));
            System.out.println(rowElement.getText());
        }

    }

    public void verifySearchStore(String expected){
        validateHelper.waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']//div[@class='ant-space-item']"));
        for (int i = 1; i < rows.size(); i++) {
            WebElement rowElement = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']//div[@class='ant-space-item'][" + i + "]//span"));
            if (rowElement.getText().equals(expected)){
                Assert.assertTrue(rowElement.getText().equals(expected));
                System.out.println("Print Store Name : "+ rowElement.getText());
            } else {
                continue;
            }
        }
    }

    public boolean verifyStatusViewAllButton() {
        boolean viewbt = validateHelper.isDiplayedElement(viewStoreBt);
        System.out.println("Print Status View All Store Button : " +viewbt);
        return viewbt;
    }
    public boolean verifyStatusUseLocationButton() {
        boolean usebt = validateHelper.isDiplayedElement(uselocationBt);
        System.out.println("Print Status Use Location Button : " +usebt);
        return usebt;
    }
    public boolean verifySearchButton() {
        boolean serbt = validateHelper.enableElement(searchBt);
        System.out.println("Print Status Search Button : " + serbt);
        return serbt;
    }
    public boolean verifyStatusEnterSub() {
        boolean entsub = validateHelper.enableElement(enterSub);
        System.out.println("Print Enter Sub Placeholder Text : " + entsub);
        return entsub;
    }

    public String verifyEnterSubPlaceholder(){
        String sub = validateHelper.getPlaceholder(enterSub);
        System.out.println("Printer EnterSub Placeholder :" +sub);
        return sub;
    }

    public String verifyContactTab() {
        String cont = validateHelper.checkText(contactTab);
        System.out.println("Print Contact Tab : " + cont);
        return cont;
    }

    public String verifyAppointmentTab() {
        String app = validateHelper.checkText(appointmentTab);
        System.out.println("Print Appointment Tab : " + app);
        return app;
    }
    public String verifyServicesTab() {
        String serv = validateHelper.checkText(servicesTab);
        System.out.println("Print Service Tab : " + serv);
        return serv;
    }

    public String verifyVehicleTab() {
        String veh = validateHelper.checkText(vehicleTab);
        System.out.println("Print Vehicle Tab : " + veh);
        return veh;
    }

    public String verifyLocationPlaceholder() {
        String loca = validateHelper.checkText(location);
        System.out.println("Print Location Placeholder Text : " + loca);
        return loca;
    }

    public String verifyLoginNote() {
        String login = validateHelper.checkText(loginText);
        System.out.println("Print DataLogin Text : " + login);
        return login;
    }

    public String verifyEnquiriesNote() {
        String enquiri = validateHelper.checkText(enquiriText);
        System.out.println("Print Enquiri Text : " + enquiri);
        return enquiri;
    }

    public String verifyRegoNote() {
        String rego = validateHelper.checkText(regoText);
        System.out.println("Print Vehicle Text : " + rego);
        return rego;
    }


}
