package com.easyserv.listeners;
import com.aventstack.extentreports.Status;
import com.easyserv.common.BaseSetup;
import com.easyserv.extentreports.ExtentTestManager;
import com.easyserv.utilities.Log;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.easyserv.extentreports.ExtentManager.getExtentReports;

public class ReportListener implements ITestListener {

    WebDriver driver;

    public String getTestName(ITestResult result) {
        return result.getTestName() != null ? result.getTestName()
                : result.getMethod().getConstructorOrMethod().getName();
    }

    public String getTestDescription(ITestResult result) {
        return result.getMethod().getDescription() != null ? result.getMethod().getDescription() : getTestName(result);
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        driver = BaseSetup.getDriver();
        Log.info("Start testing " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", driver);
        //Gọi hàm startRecord video trong CaptureHelpers class
        try {
            //CaptureHelpers.startRecord(iTestContext.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        Log.info("End testing " + iTestContext.getName());
        //Kết thúc và thực thi Extents Report
        getExtentReports().flush();
        //Gọi hàm stopRecord video trong CaptureHelpers class
        //CaptureHelpers.stopRecord();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Log.info(getTestName(iTestResult) + " test is starting...");
        ExtentTestManager.saveToReport(iTestResult.getName(), iTestResult.getTestName());
        ExtentTestManager.logMessage("Test Description : " + getTestDescription(iTestResult));
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Log.info(getTestName(iTestResult) + " test is passed.");
        ExtentTestManager.addScreenShot(Status.PASS,"Test Result: " + getTestName(iTestResult));
        //ExtentReports log operation for passed tests.
        //ExtentTestManager.logMessage(Status.PASS, getTestDescription(iTestResult));
        //ExtentTestManager.logMessage(Status.PASS, iTestResult.getThrowable().toString());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Log.error(getTestName(iTestResult) + " test is failed.");
        ExtentTestManager.addScreenShot(Status.FAIL,"Test Result: " + getTestName(iTestResult));
        ExtentTestManager.logMessage(Status.FAIL, iTestResult.getThrowable().toString());
        ExtentTestManager.logMessage(Status.FAIL, iTestResult.getName() + " is failed.");
        //ExtentTestManager.logMessage(Status.FAIL, getTestDescription(iTestResult));

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Log.warn(getTestName(iTestResult) + " test is skipped.");
        ExtentTestManager.logMessage(Status.SKIP, getTestName(iTestResult) + " test is skipped.");
        ExtentTestManager.logMessage(Status.WARNING, iTestResult.getThrowable().toString());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        Log.error("Test failed but it is in defined success ratio " + getTestName(iTestResult));
        ExtentTestManager.logMessage("Test failed but it is in defined success ratio " + getTestName(iTestResult));
    }
}
