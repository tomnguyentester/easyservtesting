package com.easyserv.pages.AdminPortalPages.UserAccess;

import com.easyserv.pages.AdminPortalPages.BookingManagement.DashBoardPageLink;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageLink {
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


    //Init initElements
    public LoginPageLink(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        PageFactory.initElements(this.driver,this);
    }

    public DashBoardPageLink loginlink(String email, String password, int idStore){
        setText(emailInput,email);
        setText(passwordInput, password);
        clickElement(loginButton);
        chooseStore(idStore);
        clickElement(nextbutton);
        //clearCookies();
        return new DashBoardPageLink(driver);
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
        String url = "https://osb-admin.siliconstack.com.au/login";
        return driver.getCurrentUrl().equals(url);
    }

    public boolean verifyHeaderLoginPage(){
        String pageText = headerPageText.getText();
        String expectedPageText = "Welcome back";
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

    public static void delay(int second){
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clearCookies(){
        driver.manage().deleteAllCookies();
    }
}
