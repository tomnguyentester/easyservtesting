package com.easyserv.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports getExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./ExtentReports/ExtentReport.html");
        reporter.config().setReportName("Report_Testing_Motoserv_Migration");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Framework Name", "Selenium Java Framework | Tom Nguyen");
        extentReports.setSystemInfo("Project","EasyServ");
        extentReports.setSystemInfo("Author", "Tom Nguyen");
        return extentReports;
    }

}
