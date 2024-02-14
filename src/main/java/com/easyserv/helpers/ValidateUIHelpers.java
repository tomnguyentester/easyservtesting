package com.easyserv.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ValidateUIHelpers {
    private WebDriver driver;
    private Actions actions;
    private WebDriverWait wait;
    private JavascriptExecutor js;
    private final int timeoutWait = 10;
    private final int timeoutWaitForPageLoaded = 20;

    private Select select;

    public ValidateUIHelpers(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutWait));
        js = (JavascriptExecutor) driver;
        actions = new Actions(driver);
    }

    public String getURlPage(){
        String getURL = driver.getCurrentUrl();
        System.out.println("The URL of current page is: "+getURL);
        return getURL;
    }

    public boolean verifyURLPage(String url){
        return getURlPage().equals(url);
    }


    public void setText(By element, String value){
        waitForPageLoaded();
        WebElement elementWaited = wait.until(ExpectedConditions.elementToBeClickable(element));
        elementWaited.click();
        elementWaited.clear();
        elementWaited.sendKeys(value);
    }

    public void clickElement(By element){
        waitForPageLoaded();
        WebElement elementWaited = wait.until(ExpectedConditions.elementToBeClickable(element));
        elementWaited.click();
    }

    public void clickElementWithJs(By element){
        waitForPageLoaded();
        //waiting element exiting
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        //Scroll to element
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(element));
        //click JS
        js.executeScript("arguments[0].click();",driver.findElement(element));
    }

    public void chooseStore(By element, int idStore, By storename){
        for (int i=0;i<idStore; i++){
            WebElement ids = driver.findElement(element);
            ids.sendKeys(Keys.DOWN);
            WebElement store1 = driver.findElement(By.xpath("//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']"));
            WebElement store = driver.findElement(By.xpath("//input[@aria-activedescendant]"));
            System.out.println(store.getAttribute("aria-activedescendant") + "==>" + store1.getText());
        }
        driver.findElement(element).sendKeys(Keys.ENTER);
        WebElement getTitle = driver.findElement(storename);
        String typeTitle = getTitle.getText();
        System.out.println(typeTitle);
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
                        .equals("complete");
            }
        };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
}
