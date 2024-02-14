package com.easyserv.pages.BookingServicePage.CustomerAccess;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BookServiceHomePage {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By location = By.xpath("//div[@class='ant-space-item']//u[normalize-space()='No store currently selected'] ");
    private By phonenumber = By.xpath("//a[@class='css-gvh1rz']//span[contains(text(),'1300 791 094')]");
    private By enquiriIcon = By.xpath("//div[@class='ant-card-body']//span[@class='anticon']");
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
    //input[@placeholder='Enter Suburb or Postcode']
    private By enterSub = By.xpath("//input[@placeholder='Enter Suburb or Postcode']");
    private By uselocationBt = By.xpath("//span[normalize-space()='Use Current Location']");
    private By viewStoreBt = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-default button']");
    private By searchBt = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-input-search-button']");

    public BookServiceHomePage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void BookingServHome_TC001() {
        validateHelper.waitForPageLoaded();
        validateHelper.CheckSizeiFrame();
        validateHelper.SwitchToiFrame();
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

    public void BookingServHome_TC002() {
        validateHelper.SwitchToiFrame();
        validateHelper.HoverAction(driver,location);
        validateHelper.clickElement(location);
    }

    public boolean verifyStatusViewAllButton() {
        boolean viewbt = validateHelper.enableElement(viewStoreBt);
        System.out.println("Print Status View All Store Button : " +viewbt);
        return viewbt;
    }
    public boolean verifyStatusUseLocationButton() {
        boolean usebt = validateHelper.enableElement(uselocationBt);
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
