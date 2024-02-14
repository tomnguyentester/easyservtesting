package com.easyserv.pages.AdminPortalPages.UserAccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageFactory {
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
    public LoginPageFactory(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        PageFactory.initElements(this.driver,this);
    }

    public void login(String email, String password){
        setText(emailInput,email);
        setText(passwordInput, password);
        clickElement(loginButton);
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
}
