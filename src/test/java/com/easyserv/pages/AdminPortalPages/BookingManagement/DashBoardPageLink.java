package com.easyserv.pages.AdminPortalPages.BookingManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashBoardPageLink {
    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy(xpath = "//h3[contains(text(),'Welcome back')]")
    private WebElement headerPageText;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//span[contains(text(),'Sign In')]")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@id='serviceCentre']")
    private WebElement storeDropdown;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    private WebElement nextbutton;

    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    private WebElement DashBoardHeader;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default ant-btn-lg ant-btn-icon-only']")
    private WebElement filterIcon;

    @FindBy(xpath = "//a[contains(text(),'Booking Management')]")
    private WebElement BookingManagement;


    //Init initElements
    public DashBoardPageLink(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        PageFactory.initElements(this.driver,this);
    }

    public void clickFilterIcon(){
        filterIcon.click();
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]")).click();
    }

    public BookingMangeLink clickBookingModule(){
        BookingManagement.click();

        return new BookingMangeLink(driver);
    }

    private void setText(WebElement element,String valueText){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(valueText);
    }

    private void clickElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public boolean verifyCurrentURL(){
        String url = "https://osb-admin.siliconstack.com.au/";
        return driver.getCurrentUrl().equals(url);
    }

    public boolean verifyHeaderDashBoard(){
        String pageText = DashBoardHeader.getText();
        String expectedPageText = "Dashboard";
        return pageText.contains(expectedPageText);
    }

    public void chooseStore(int idStore){
        WebElement clickStore = storeDropdown;
        if (clickStore.isEnabled()){
            clickStore.click();
            for (int i=0; i<idStore ; i++){
                storeDropdown.sendKeys(Keys.DOWN);
            }
            storeDropdown.sendKeys(Keys.ENTER);
        } else {
            System.out.println("Select Store is Disable");
        }
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }
}
