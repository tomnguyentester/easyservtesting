package com.easyserv.listeners;
import com.easyserv.helpers.CaptureHelpers;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class TestListener implements ITestListener {

    @Override
    public void onFinish(ITestContext result) {

    }

    @Override
    public void onStart(ITestContext result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Case Failed: " + result.getName());
//        try {
//            CaptureHelpers.captureScreenshot(BaseSetup.getDriver(),result.getName());
//        } catch (Exception e) {
//            System.out.println("Exception while taking screenshot " + e.getMessage());
//        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //System.out.println("Test Case Skip: " + result.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //System.out.println("Test Case Pass: " + result.getName());

    }
}
