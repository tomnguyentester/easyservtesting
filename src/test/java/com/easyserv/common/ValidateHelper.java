package com.easyserv.common;

import com.aventstack.extentreports.Status;
import com.easyserv.extentreports.ExtentTestManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ValidateHelper {
    private WebDriver driver;
    private WebDriverWait wait;
    JavascriptExecutor js;

    //Create Constructor
    public ValidateHelper(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
    }

    public void setText(By element,String value){
        //Sendkeys value for element
        waitForPageLoaded();
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(value);
        ExtentTestManager.logMessage(Status.PASS,"Set text is : " +value+ " on element " + element);
    }

    public void clickElement(By element) {
        //Click to element
        waitForPageLoaded();
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
        ExtentTestManager.logMessage(Status.PASS,"Click on element : "+ element);
    }

    public void selectValueDropdown(By element) {
        //Click to element
        waitForPageLoaded();
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
        driver.findElement(element).sendKeys(Keys.ENTER);
    }

    public void clickDropdown(By element) {
        WebElement clickDrop = driver.findElement(element);
        if (clickDrop.isEnabled()){
            driver.findElement(element).click();
        } else {
            System.out.println("Dropdown not avaible");
        }
    }

    public void movetoElement(By element){
        waitForPageLoaded();
        //waiting element exiting
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        //Scroll to element
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(element));
        ExtentTestManager.logMessage(Status.PASS,"Move to element : "+ element);
    }

    public void pressTab(By element) {
        driver.findElement(element).sendKeys(Keys.TAB);
    }

    public void pressEnter(By element) {
        driver.findElement(element).sendKeys(Keys.ENTER);
        ExtentTestManager.logMessage(Status.PASS,"Press enter : "+ element);
    }

    public void clearText(By element){
        driver.findElement(element).sendKeys(Keys.CONTROL,"a"+Keys.DELETE);
        ExtentTestManager.logMessage(Status.PASS,"Clear text on element : "+ element);
        //driver.navigate().refresh();
    }

    public String checkText(By element) {
        //wait.until(ExpectedConditions.elementToBeClickable(element));
        String text = driver.findElement(element).getText();
        ExtentTestManager.logMessage(Status.PASS,"Checking value on element : "+ element);
        return text;
    }

    public void getText(By element){
        driver.findElement(element).getText();
    }

    public String getAttribute(By element){
        String value = driver.findElement(element).getAttribute("value");
        return value;
    }

    public String getPlaceholder(By element){
        String value = driver.findElement(element).getAttribute("placeholder");
        return value;
    }

    public boolean isDiplayedElement(By element){
        //wait.until(ExpectedConditions.elementToBeClickable(element));
        boolean ele_Display = driver.findElement(element).isDisplayed();
        ExtentTestManager.logMessage(Status.PASS,"Checking element is display : "+ element);
        return ele_Display;
    }

    public boolean enableElement(By element) {
        boolean ele_Enable = driver.findElement(element).isEnabled();
        ExtentTestManager.logMessage(Status.PASS,"Checking element is enable : "+ element);
        return ele_Enable;
    }

    public void isAlertPresent(){
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText()+ "Alert is Displayed");
        } catch (NoAlertPresentException exception){
            System.out.println("Alert is NOT Displayed");
        }
    }

    public void delay(int second){
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void refreshPage(){
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    public void chooseStore(By element, int idStore){
        for (int i=0;i<idStore; i++){
            WebElement ids = driver.findElement(element);
            ids.sendKeys(Keys.DOWN);
            WebElement store1 = driver.findElement(By.xpath("//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']"));
            WebElement store = driver.findElement(By.xpath("//input[@aria-activedescendant]"));
            System.out.println(store.getAttribute("aria-activedescendant") + "==>" + store1.getText());
        }
        driver.findElement(element).sendKeys(Keys.ENTER);
    }

    public void selectStatusfilter(By element, int idStatus){
        for (int i=1;i<idStatus; i++){
            WebElement ids = driver.findElement(element);
            ids.sendKeys(Keys.DOWN);
        }
        driver.findElement(element).sendKeys(Keys.ENTER);
    }

    public int totalBookingId(){
        waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath(".//tr[@class=\"ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer\"]"));
        return rows.size();
    }

    public int searchBookingId(int idBooking){
        waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = parentTable.findElements(By.xpath(".//tr[@class=\"ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer\"]"));
        //System.out.println(rows.size());
        for (int i = 2; i < rows.size()+2; i++) {
            WebElement rowElement = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[@class=\"ant-table-cell\"]/span"));
            String bookNo = rowElement.getText();
            if (Integer.parseInt(bookNo)== idBooking){
                System.out.println("Booking id exists:" + rowElement.getText());
                break;
            } else {
                System.out.println("Booking No.: " + rowElement.getText());
                //continue;
            }
        }
        return idBooking;
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

    public void CheckSizeiFrame(){
        int sizeIFrame = driver.findElements(By.tagName("iframe")).size();
        System.out.println(sizeIFrame);
    }

    public void SwitchToiFrame(){
        driver.switchTo().frame(0);
    }

    public void HoverAction(WebDriver driver,By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        WebElement ele = driver.findElement(element);
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }

    public void SwitchBrowser(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void BackBrowserTab(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

    public String checkingText(By element){
        String value = checkText(element);
        System.out.println("Printer text :" + value);
        return value;
    }


}
