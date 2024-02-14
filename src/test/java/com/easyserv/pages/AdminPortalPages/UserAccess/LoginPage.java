package com.easyserv.pages.AdminPortalPages.UserAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private By headerPageText = By.xpath("//h3[contains(text(),'Welcome back')]");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By loginButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextbutton = By.xpath("//span[contains(text(),'Next')]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLoginPageTitle(){
        String pageTitle = driver.getTitle();
        return pageTitle;
    }

    public String getCurrentURL(){
        String pageURL = driver.getCurrentUrl();
        return pageURL;
    }

    public boolean verifyCurrentURL(){
        String url = "https://osb-admin.siliconstack.com.au/login";
        return getCurrentURL().equals(url);
    }

    public boolean verifyHeaderLoginPage(){
        WebElement element = driver.findElement(headerPageText);
        String pageText = element.getText();
        String expectedPageText = "Welcome back";
        return pageText.contains(expectedPageText);
    }

    public void LoginEasy(String email,String password,int idStore){
        enterEmail(email);
        enterPassword(password);
        clickSignIn();
        chooseStore(idStore);
        clickNextButton();
        clearCookies();
        delay(2);
    }

    public void enterEmail(String email){
        WebElement emailTextbox = driver.findElement(emailInput);
        if (emailTextbox.isDisplayed()){
            emailTextbox.sendKeys(email);
        }
    }

    public void enterPassword(String password){
        WebElement passwordTextBox = driver.findElement(passwordInput);
        if (passwordTextBox.isDisplayed()){
            passwordTextBox.sendKeys(password);
        }
    }

    public void clickSignIn(){
        WebElement signin = driver.findElement(loginButton);
        if (signin.isDisplayed()){
            signin.click();
        }
    }

    public void chooseStore(int idStore){
        WebElement clickStore = driver.findElement(storeDropdown);
        if (clickStore.isEnabled()){
            clickStore.click();
            for (int i=0; i<idStore ; i++){
                driver.findElement(storeDropdown).sendKeys(Keys.DOWN);
            }
            driver.findElement(storeDropdown).sendKeys(Keys.ENTER);
        } else {
            System.out.println("Select Store is Disable");
        }
    }

    public void clickNextButton(){
        WebElement nextButton = driver.findElement(nextbutton);
        if (nextButton.isDisplayed()){
            nextButton.click();
        }
    }

    public void clearCookies(){
        driver.manage().deleteAllCookies();
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
}
